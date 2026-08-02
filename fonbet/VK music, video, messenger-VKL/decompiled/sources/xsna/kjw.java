package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.exceptions.FileFormatException;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* compiled from: ImageHelper.kt */
/* loaded from: classes17.dex */
public final class kjw {

    /* compiled from: ImageHelper.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Size(width=");
            sb.append(this.a);
            sb.append(", height=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public static void a(Context context, Uri uri, Uri uri2, List list) {
        AssetFileDescriptor d = d(context, uri, "r");
        try {
            d = d(context, uri2, "rw");
            try {
                p4q p4qVar = new p4q(d.getFileDescriptor());
                p4q p4qVar2 = new p4q(d.getFileDescriptor());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String c = p4qVar.c(str);
                    if (c != null) {
                        p4qVar2.E(str, c);
                    }
                }
                p4qVar2.A();
                s3q0 s3q0Var = s3q0.a;
                d.close();
                d.close();
            } finally {
            }
        } finally {
        }
    }

    public static Bitmap b(Context context, Uri uri) {
        AssetFileDescriptor d = d(context, uri, "r");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(d.getFileDescriptor(), null, options);
            if (decodeFileDescriptor == null) {
                decodeFileDescriptor = BitmapFactory.decodeFile(uri.getEncodedPath(), options);
            }
            d.close();
            return decodeFileDescriptor;
        } finally {
        }
    }

    public static Bitmap c(Context context, Uri uri, int i, int i2, boolean z) {
        a g = g(context, uri, false);
        int i3 = g.b;
        int i4 = g.a;
        if (i4 <= i && i3 <= i2) {
            return b(context, uri);
        }
        float f = i;
        float f2 = f / i4;
        float f3 = i2;
        float f4 = f3 / i3;
        float min = z ? Math.min(f2, f4) : Math.max(f2, f4);
        AssetFileDescriptor d = d(context, uri, "r");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = (int) (1 / min);
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(d.getFileDescriptor(), null, options);
            if (decodeFileDescriptor == null) {
                decodeFileDescriptor = BitmapFactory.decodeFile(uri.getEncodedPath(), options);
            }
            float width = f / decodeFileDescriptor.getWidth();
            float height = f3 / decodeFileDescriptor.getHeight();
            float min2 = z ? Math.min(width, height) : Math.max(width, height);
            if (min2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                d.close();
                return decodeFileDescriptor;
            }
            int max = Math.max(1, (int) (options.outWidth * min2));
            int max2 = Math.max(1, (int) (options.outHeight * min2));
            if (decodeFileDescriptor.getWidth() == max && decodeFileDescriptor.getHeight() == max2) {
                d.close();
                return decodeFileDescriptor;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFileDescriptor, max, max2, false);
            decodeFileDescriptor.recycle();
            d.close();
            return createScaledBitmap;
        } finally {
        }
    }

    public static AssetFileDescriptor d(Context context, Uri uri, String str) {
        AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, str);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(i6n0.a(uri, "Cannot open uri: "));
    }

    @SuppressLint({"Recycle"})
    public static int e(Context context, Uri uri) {
        Integer num;
        try {
            num = f(context, uri);
        } catch (Throwable unused) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static Integer f(Context context, Uri uri) {
        int i = 0;
        AssetFileDescriptor d = d(context, uri, "r");
        try {
            p4q p4qVar = new p4q(d.getFileDescriptor());
            if (p4qVar.e("Orientation") == null) {
                d.close();
                return 0;
            }
            int d2 = p4qVar.d(0, "Orientation");
            if (d2 != 1) {
                if (d2 == 3) {
                    i = 180;
                } else if (d2 == 6) {
                    i = 90;
                } else if (d2 == 8) {
                    i = Integer.valueOf(atv0.b);
                }
            }
            d.close();
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(d, th);
                throw th2;
            }
        }
    }

    public static a g(Context context, Uri uri, boolean z) {
        int e;
        AssetFileDescriptor d = d(context, uri, "r");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            if (BitmapFactory.decodeFileDescriptor(d.getFileDescriptor(), null, options) == null) {
                BitmapFactory.decodeFile(uri.getEncodedPath(), options);
            }
            if (options.outWidth < 0 || options.outHeight < 0) {
                throw new FileFormatException("Unable to decode image. Found size is " + options.outWidth + 'x' + options.outHeight);
            }
            if (z && ((e = e(context, uri)) == 90 || e == 270)) {
                a aVar = new a(options.outHeight, options.outWidth);
                d.close();
                return aVar;
            }
            a aVar2 = new a(options.outWidth, options.outHeight);
            d.close();
            return aVar2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(d, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (xsna.brm0.v(r5, "jpeg", true) == true) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(Context context, Uri uri) {
        String path;
        AssetFileDescriptor d = d(context, uri, "r");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z = true;
            options.inJustDecodeBounds = true;
            if (BitmapFactory.decodeFileDescriptor(d.getFileDescriptor(), null, options) == null) {
                BitmapFactory.decodeFile(uri.getEncodedPath(), options);
            }
            String str = options.outMimeType;
            if (str == null || !drm0.D(str, "jpeg", true)) {
                String str2 = options.outMimeType;
                if ((str2 == null || !drm0.D(str2, "jpg", true)) && ((path = uri.getPath()) == null || !brm0.v(path, "jpg", true))) {
                    String path2 = uri.getPath();
                    if (path2 != null) {
                    }
                    z = false;
                }
            }
            d.close();
            return z;
        } finally {
        }
    }
}
