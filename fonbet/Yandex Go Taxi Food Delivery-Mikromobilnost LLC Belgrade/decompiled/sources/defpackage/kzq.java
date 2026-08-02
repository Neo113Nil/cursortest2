package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.ExifInterface;
import android.net.Uri;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import kotlin.Result;
import kotlin.a;
import kotlin.text.Regex;

/* loaded from: classes15.dex */
public final class kzq {
    public final Context a;
    public final ras0 b;

    public kzq(Context context, ras0 ras0Var) {
        this.a = context;
        this.b = ras0Var;
    }

    public final izq a(Uri uri, boolean z, Set set) {
        boolean z2;
        Point point;
        int i;
        int i2;
        String str;
        Context context = this.a;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            z2 = openInputStream != null;
            if (openInputStream != null) {
                openInputStream.close();
            }
        } catch (FileNotFoundException | IOException | SecurityException unused) {
            z2 = false;
        }
        if (!z2) {
            throw new FileNotFoundException();
        }
        String c = rk91.c(context, uri);
        int i3 = 0;
        String str2 = c;
        while (set.contains(str2)) {
            int K = evu0.K(c, '.', 0, 6);
            if (K < 0) {
                str = qv10.h(i3, c, "_");
            } else {
                str = c.substring(0, K) + "_" + i3 + c.substring(K);
            }
            str2 = str;
            i3++;
        }
        long b = rk91.b(context, uri);
        String f = rk91.f(context, uri);
        jzq jzqVar = new jzq(str2, b, f);
        if (AttachInfo.isImage(f)) {
            try {
                point = d5b1.j(context, uri, d5b1.k(context, uri));
            } catch (IOException unused2) {
                point = new Point(0, 0);
            }
            int i4 = point.x;
            i = point.y;
            i2 = i4;
        } else {
            i2 = 0;
            i = 0;
        }
        return new izq(uri, jzqVar, new AttachInfo(uri, null, null, str2, b, f, i2, i, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hzq b(izq izqVar, long j) {
        wg10 wg10Var;
        Result.Failure failure;
        e9v a;
        int i;
        float f;
        Matrix matrix;
        Object obj;
        Bitmap bitmap;
        Object obj2;
        Bitmap bitmap2;
        wg10 wg10Var2;
        Uri uri = izqVar.a;
        jzq jzqVar = izqVar.b;
        AttachInfo attachInfo = izqVar.c;
        String str = jzqVar.a;
        long j2 = jzqVar.b;
        String str2 = jzqVar.c;
        wg10 wg10Var3 = null;
        if (str2 != null) {
            Regex regex = wg10.e;
            try {
                wg10Var2 = qje.o(str2);
            } catch (IllegalArgumentException unused) {
                wg10Var2 = null;
            }
            wg10Var = wg10Var2;
        } else {
            wg10Var = null;
        }
        hzq hzqVar = new hzq(new gzq(this.a, wg10Var, uri, j2, j), izqVar);
        if (attachInfo.isImage() && !attachInfo.isAnimated()) {
            int i2 = attachInfo.width;
            int i3 = attachInfo.height;
            ras0 ras0Var = this.b;
            ras0Var.getClass();
            if (Math.max(i2, i3) > 1280) {
                ContentResolver contentResolver = ras0Var.a;
                i3y a2 = a.a(new ppr0(7, ras0Var, uri));
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    InputStream openInputStream = contentResolver.openInputStream(uri);
                    failure = options;
                    if (openInputStream != null) {
                        try {
                            BitmapFactory.decodeStream(openInputStream, null, options);
                            openInputStream.close();
                            failure = options;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                }
                boolean z = failure instanceof Result.Failure;
                Object obj3 = failure;
                if (z) {
                    obj3 = null;
                }
                BitmapFactory.Options options2 = (BitmapFactory.Options) obj3;
                if (options2 == null) {
                    a = ras0.a(a2, "Failed decode image bounds");
                } else {
                    int i4 = options2.outWidth;
                    if (i4 <= 0 || (i = options2.outHeight) <= 0) {
                        a = ras0.a(a2, "Invalid image bounds");
                    } else {
                        float max = Math.max(i4 / 1280.0f, Math.max(i / 1280.0f, 1.0f));
                        options2.inJustDecodeBounds = false;
                        int i5 = (int) max;
                        options2.inSampleSize = i5;
                        if (i5 % 2 != 0) {
                            int i6 = 1;
                            while (true) {
                                int i7 = i6 * 2;
                                if (i7 >= options2.inSampleSize) {
                                    break;
                                }
                                i6 = i7;
                            }
                            options2.inSampleSize = i6;
                        }
                        if (options2.inSampleSize < 1) {
                            options2.inSampleSize = 1;
                        }
                        InputStream openInputStream2 = contentResolver.openInputStream(uri);
                        if (openInputStream2 != null) {
                            try {
                                ExifInterface exifInterface = new ExifInterface(openInputStream2);
                                Matrix matrix2 = new Matrix();
                                f = 1280.0f;
                                int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
                                float f2 = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0.0f : 270.0f : 90.0f : 180.0f;
                                if (f2 != 0.0f) {
                                    matrix2.postRotate(f2);
                                }
                                float f3 = max / options2.inSampleSize;
                                if (f3 > 1.0f) {
                                    float f4 = 1.0f / f3;
                                    matrix2.postScale(f4, f4);
                                }
                                openInputStream2.close();
                                matrix = matrix2;
                            } finally {
                            }
                        } else {
                            f = 1280.0f;
                            matrix = null;
                        }
                        if (matrix == null) {
                            a = ras0.a(a2, "Failed calculate image matrix");
                        } else {
                            InputStream openInputStream3 = contentResolver.openInputStream(uri);
                            try {
                                if (openInputStream3 != null) {
                                    try {
                                        obj = BitmapFactory.decodeStream(openInputStream3, null, options2);
                                    } finally {
                                        if (obj instanceof Result.Failure) {
                                        }
                                        bitmap = (Bitmap) obj;
                                        if (bitmap != null) {
                                        }
                                        openInputStream3.close();
                                    }
                                    if (obj instanceof Result.Failure) {
                                        obj = null;
                                    }
                                    bitmap = (Bitmap) obj;
                                    if (bitmap != null) {
                                        bitmap = null;
                                    } else {
                                        try {
                                            obj2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                        } catch (Throwable th2) {
                                        }
                                        if (obj2 instanceof Result.Failure) {
                                            obj2 = null;
                                        }
                                        Bitmap bitmap3 = (Bitmap) obj2;
                                        if (bitmap3 != null && bitmap3 != bitmap) {
                                            bitmap.recycle();
                                            bitmap = bitmap3;
                                        }
                                    }
                                    openInputStream3.close();
                                } else {
                                    bitmap = null;
                                }
                                if (bitmap == null) {
                                    a = ras0.a(a2, "Failed decode/transform bitmap");
                                } else {
                                    float max2 = Math.max(bitmap.getWidth() / f, bitmap.getHeight() / f);
                                    int width = (int) (bitmap.getWidth() / max2);
                                    int height = (int) (bitmap.getHeight() / max2);
                                    if (max2 > 1.0f) {
                                        if (width < 1) {
                                            width = 1;
                                        }
                                        if (height < 1) {
                                            height = 1;
                                        }
                                        bitmap2 = Bitmap.createScaledBitmap(bitmap, width, height, true);
                                    } else {
                                        bitmap2 = bitmap;
                                    }
                                    if (bitmap2 != bitmap) {
                                        bitmap.recycle();
                                    }
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byte[] byteArray = bitmap2.compress(Bitmap.CompressFormat.JPEG, y6i0.d(90, 0, 100), byteArrayOutputStream) ? byteArrayOutputStream.toByteArray() : null;
                                            byteArrayOutputStream.close();
                                            a = byteArray != null ? new e9v(byteArray, true) : ras0.a(a2, "Bitmap.compress() returned false");
                                        } finally {
                                        }
                                    } finally {
                                        if (!bitmap2.isRecycled()) {
                                            bitmap2.recycle();
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } finally {
                                }
                            }
                        }
                    }
                }
                boolean z2 = a.b;
                byte[] bArr = a.a;
                long length = bArr.length;
                String str3 = z2 ? "image/jpeg" : attachInfo.mimeType;
                if (str3 != null) {
                    Regex regex2 = wg10.e;
                    try {
                        wg10Var3 = qje.o(str3);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                if (z2) {
                    String e0 = evu0.e0('.', str, "");
                    if (!e0.equalsIgnoreCase("jpg") && !e0.equalsIgnoreCase("jpeg")) {
                        str = evu0.h0('.', str, str).concat(".jpg");
                    }
                } else {
                    str = attachInfo.fileName;
                }
                String str4 = str;
                return new hzq(new fzq(wg10Var3, bArr, j), new izq(izqVar.a, new jzq(str4, length, str3), new AttachInfo(attachInfo.uri, attachInfo.existingId, attachInfo.originalChatId, str4, length, str3, attachInfo.width, attachInfo.height, attachInfo.forceAsFile)));
            }
        }
        return hzqVar;
    }
}
