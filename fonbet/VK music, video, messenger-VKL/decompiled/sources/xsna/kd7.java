package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: BitmapUtils.kt */
/* loaded from: classes17.dex */
public final class kd7 {
    public static final String a = "kd7";
    public static final Paint b = new Paint(2);

    public static final int a(int i, int i2, BitmapFactory.Options options) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int i6 = i3 / 2;
        int i7 = i4 / 2;
        while (i6 / i5 >= i2 && i7 / i5 >= i) {
            i5 *= 2;
        }
        return i5;
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2, boolean z, boolean z2) {
        Bitmap d;
        float f;
        if (bitmap == null || (d = d(i, i2)) == null) {
            return null;
        }
        Canvas canvas = new Canvas(d);
        Matrix matrix = new Matrix();
        float f2 = i;
        float width = f2 / bitmap.getWidth();
        float f3 = i2;
        float height = f3 / bitmap.getHeight();
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z2 ? height > width : height < width) {
            f = pm0.a(bitmap.getHeight(), width, f3, 0.5f);
        } else {
            f4 = pm0.a(bitmap.getWidth(), height, f2, 0.5f);
            f = 0.0f;
            width = height;
        }
        matrix.setScale(z ? -width : width, width);
        matrix.postTranslate((int) (f4 + 0.5f), (int) (f + 0.5f));
        canvas.drawBitmap(bitmap, matrix, b);
        return d;
    }

    public static final Bitmap c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int height2 = bitmap.getHeight();
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < height2; i2++) {
            int height3 = (bitmap.getHeight() - i2) - 1;
            int width2 = bitmap.getWidth();
            for (int i3 = 0; i3 < width2; i3++) {
                if (!z && bitmap.getPixel(i3, i2) != 0) {
                    i = i2;
                    z = true;
                }
                if (!z2 && bitmap.getPixel(i3, height3) != 0) {
                    z2 = true;
                    height = height3;
                }
            }
            if (z && z2) {
                break;
            }
        }
        int width3 = bitmap.getWidth();
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < width3; i5++) {
            int width4 = (bitmap.getWidth() - i5) - 1;
            for (int i6 = i; i6 < height; i6++) {
                if (!z3 && bitmap.getPixel(i5, i6) != 0) {
                    i4 = i5;
                    z3 = true;
                }
                if (!z4 && bitmap.getPixel(width4, i6) != 0) {
                    z4 = true;
                    width = width4;
                }
            }
            if (z3 && z4) {
                break;
            }
        }
        return Bitmap.createBitmap(bitmap, i4, i, width - i4, height - i);
    }

    public static final Bitmap d(int i, int i2) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (i * i2 != 0) {
            try {
                return Bitmap.createBitmap(i, i2, config);
            } catch (Throwable unused) {
                lht.a.a();
                try {
                    return Bitmap.createBitmap(i, i2, config);
                } catch (Throwable unused2) {
                    return null;
                }
            }
        }
        L.l("can't allocate bitmap, empty resolution=" + i + 'x' + i2);
        return null;
    }

    public static final Bitmap e(int i, int i2, Bitmap bitmap) {
        if (i * i2 != 0) {
            try {
                return Bitmap.createScaledBitmap(bitmap, i, i2, true);
            } catch (Throwable unused) {
                lht.a.a();
                try {
                    return Bitmap.createScaledBitmap(bitmap, i, i2, true);
                } catch (Throwable unused2) {
                    return null;
                }
            }
        }
        L.l("can't allocate bitmap, empty resolution=" + i + 'x' + i2);
        return null;
    }

    public static final Bitmap f(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static final Bitmap g(Context context, Bitmap bitmap) {
        int height;
        int width;
        if (bitmap == null) {
            return null;
        }
        int i = 0;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            int width2 = (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2);
            width = bitmap.getHeight();
            i = width2;
            height = 0;
        } else {
            height = (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2);
            width = bitmap.getWidth();
        }
        return h(context, Bitmap.createBitmap(bitmap, i, height, width, width), (width * 1.0f) / 2);
    }

    public static final Bitmap h(Context context, Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        mog0 mog0Var = new mog0(context.getResources(), bitmap);
        mog0Var.b(f);
        mog0Var.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        mog0Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static final Bitmap i(View view, Integer num) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (num != null) {
            canvas.drawColor(num.intValue());
        }
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.draw(canvas);
        return createBitmap;
    }

    public static final Bitmap k(Bitmap bitmap, int i, boolean z) {
        Bitmap bitmap2;
        String str = a;
        if (bitmap == null) {
            L.e(str, "Image cannot be rotated, because it's null");
            return null;
        }
        if (i == 0 && !z) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.preRotate(i);
        matrix.postScale(z ? -1.0f : 1.0f, 1.0f);
        try {
            bitmap2 = bitmap;
            try {
                return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            } catch (Throwable th) {
                th = th;
                L.j(th, str);
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap2 = bitmap;
        }
    }

    public static final boolean l(Bitmap bitmap, File file, int i) {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                boolean compress = bitmap.compress(compressFormat, i, fileOutputStream);
                fileOutputStream.close();
                return compress;
            } finally {
            }
        } catch (Exception e) {
            L.i(e);
            return false;
        }
    }

    public static final boolean m(Bitmap bitmap, File file) {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        return l(bitmap, file, 100);
    }
}
