package xsna;

import android.graphics.Bitmap;
import com.facebook.animated.gif.GifImage;
import com.facebook.animated.webp.WebPImage;
import com.facebook.common.memory.PooledByteBuffer;
import java.util.ArrayList;

/* compiled from: AnimatedImageFactoryImpl.java */
/* loaded from: classes12.dex */
public final class uk2 {
    public static final sk2 d;
    public static final sk2 e;
    public final rj01 a;
    public final hta0 b;
    public final boolean c;

    static {
        sk2 sk2Var;
        sk2 sk2Var2 = null;
        try {
            sk2Var = (sk2) GifImage.class.newInstance();
        } catch (Throwable unused) {
            sk2Var = null;
        }
        d = sk2Var;
        try {
            sk2Var2 = (sk2) WebPImage.class.newInstance();
        } catch (Throwable unused2) {
        }
        e = sk2Var2;
    }

    public uk2(rj01 rj01Var, hta0 hta0Var, boolean z) {
        this.a = rj01Var;
        this.b = hta0Var;
        this.c = z;
    }

    public final gb6 a(rip ripVar, liw liwVar, Bitmap.Config config) {
        sk2 sk2Var = d;
        if (sk2Var == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        uvf o = uvf.o(ripVar.b);
        o.getClass();
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) o.r();
            gb6 c = c(ripVar.k, liwVar, pooledByteBuffer.D() != null ? sk2Var.a(pooledByteBuffer.D(), liwVar) : sk2Var.b(pooledByteBuffer.getNativePtr(), pooledByteBuffer.size(), liwVar), config);
            o.close();
            return c;
        } catch (Throwable th) {
            o.close();
            throw th;
        }
    }

    public final gb6 b(rip ripVar, liw liwVar, Bitmap.Config config) {
        sk2 sk2Var = e;
        if (sk2Var == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        uvf o = uvf.o(ripVar.b);
        o.getClass();
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) o.r();
            gb6 c = c(ripVar.k, liwVar, pooledByteBuffer.D() != null ? sk2Var.a(pooledByteBuffer.D(), liwVar) : sk2Var.b(pooledByteBuffer.getNativePtr(), pooledByteBuffer.size(), liwVar), config);
            o.close();
            return c;
        } catch (Throwable th) {
            o.close();
            throw th;
        }
    }

    public final gb6 c(String str, liw liwVar, pk2 pk2Var, Bitmap.Config config) {
        liwVar.getClass();
        if (liwVar.a) {
            uvf<Bitmap> c = this.b.c(pk2Var.getWidth(), pk2Var.getHeight(), config);
            c.r().eraseColor(0);
            c.r().setHasAlpha(true);
            new qk2(this.a.e(new wk2(pk2Var), null), this.c, new tk2()).d(0, c.r());
            return xvf.B2(c, gpw.d, 0, 0);
        }
        xk2 xk2Var = new xk2(pk2Var);
        xk2Var.b = null;
        xk2Var.c = null;
        xk2Var.d = str;
        try {
            wk2 wk2Var = new wk2(xk2Var);
            uvf.q((uvf) xk2Var.b);
            xk2Var.b = null;
            uvf.p((ArrayList) xk2Var.c);
            xk2Var.c = null;
            return new pvf(wk2Var, 0);
        } catch (Throwable th) {
            uvf.q((uvf) xk2Var.b);
            xk2Var.b = null;
            uvf.p((ArrayList) xk2Var.c);
            xk2Var.c = null;
            throw th;
        }
    }
}
