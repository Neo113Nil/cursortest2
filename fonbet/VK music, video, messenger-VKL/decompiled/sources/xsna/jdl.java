package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import xsna.n7l;

/* compiled from: DefaultDecoder.java */
/* loaded from: classes.dex */
public abstract class jdl implements ita0 {
    public static final byte[] d = {-1, -39};
    public final sc7 a;
    public final PreverificationHelper b = new PreverificationHelper();
    public final svb0<ByteBuffer> c;

    public jdl(sc7 sc7Var, svb0<ByteBuffer> svb0Var, jw5 jw5Var) {
        this.a = sc7Var;
        if (sc7Var instanceof mno) {
            jw5Var.getClass();
        }
        this.c = svb0Var;
    }

    public static BitmapFactory.Options c(rip ripVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = ripVar.q();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z = config == Bitmap.Config.HARDWARE;
        if (!z) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        BitmapFactory.decodeStream(ripVar.p(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        if (z) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    public final kcl a(InputStream inputStream, BitmapFactory.Options options, ColorSpace colorSpace) {
        Bitmap bitmap;
        int i = options.outWidth;
        int i2 = options.outHeight;
        sc7 sc7Var = this.a;
        PreverificationHelper preverificationHelper = this.b;
        if (preverificationHelper == null || !preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig)) {
            bitmap = sc7Var.get(b(i, i2, options));
            if (bitmap == null) {
                throw new NullPointerException("BitmapPool.get returned null");
            }
        } else {
            options.inMutable = false;
            bitmap = null;
        }
        options.inBitmap = bitmap;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        svb0<ByteBuffer> svb0Var = this.c;
        ByteBuffer c = svb0Var.c();
        if (c == null) {
            n7l.a aVar = n7l.a;
            c = ByteBuffer.allocate(16384);
        }
        try {
            try {
                options.inTempStorage = c.array();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                svb0Var.a(c);
                if (bitmap == null || bitmap == decodeStream) {
                    return uvf.w(decodeStream, sc7Var);
                }
                sc7Var.a(bitmap);
                if (decodeStream != null) {
                    decodeStream.recycle();
                }
                throw new IllegalStateException();
            } catch (IllegalArgumentException e) {
                if (bitmap != null) {
                    sc7Var.a(bitmap);
                }
                try {
                    inputStream.reset();
                    Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (decodeStream2 == null) {
                        throw e;
                    }
                    kcl w = uvf.w(decodeStream2, wwf0.s());
                    svb0Var.a(c);
                    return w;
                } catch (IOException unused) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (bitmap != null) {
                    sc7Var.a(bitmap);
                }
                throw e2;
            }
        } catch (Throwable th) {
            svb0Var.a(c);
            throw th;
        }
    }

    public abstract int b(int i, int i2, BitmapFactory.Options options);

    @Override // xsna.ita0
    public final uvf<Bitmap> decodeFromEncodedImageWithColorSpace(rip ripVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options c = c(ripVar, config);
        boolean z = c.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream p = ripVar.p();
            p.getClass();
            return a(p, c, null);
        } catch (RuntimeException e) {
            if (z) {
                return decodeFromEncodedImageWithColorSpace(ripVar, Bitmap.Config.ARGB_8888, null, null);
            }
            throw e;
        }
    }

    @Override // xsna.ita0
    public final uvf<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(rip ripVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean t = ripVar.t(i);
        BitmapFactory.Options c = c(ripVar, config);
        InputStream p = ripVar.p();
        p.getClass();
        if (ripVar.r() > i) {
            p = new p7z(p, i);
        }
        InputStream s2o0Var = !t ? new s2o0(p, d) : p;
        boolean z = c.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                kcl a = a(s2o0Var, c, colorSpace);
                try {
                    s2o0Var.close();
                    return a;
                } catch (IOException e) {
                    e.printStackTrace();
                    return a;
                }
            } catch (RuntimeException e2) {
                if (!z) {
                    throw e2;
                }
                uvf<Bitmap> decodeJPEGFromEncodedImageWithColorSpace = decodeJPEGFromEncodedImageWithColorSpace(ripVar, Bitmap.Config.ARGB_8888, null, i, colorSpace);
                try {
                    s2o0Var.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return decodeJPEGFromEncodedImageWithColorSpace;
            }
        } finally {
        }
    }
}
