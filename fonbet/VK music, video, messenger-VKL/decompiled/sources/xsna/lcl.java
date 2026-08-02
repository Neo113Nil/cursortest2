package xsna;

import android.graphics.Bitmap;

/* compiled from: DefaultCloseableStaticBitmap.java */
/* loaded from: classes12.dex */
public final class lcl extends gb6 implements xvf {
    public static final /* synthetic */ int j = 0;
    public uvf e;
    public volatile Bitmap f;
    public final cpe0 g;
    public final int h;
    public final int i;

    public lcl(Bitmap bitmap, zag0 zag0Var, cpe0 cpe0Var) {
        bitmap.getClass();
        this.f = bitmap;
        Bitmap bitmap2 = this.f;
        zag0Var.getClass();
        this.e = uvf.x(bitmap2, zag0Var, uvf.g);
        this.g = cpe0Var;
        this.h = 0;
        this.i = 0;
    }

    @Override // xsna.xvf
    public final synchronized uvf R() {
        return uvf.o(this.e);
    }

    @Override // xsna.gb6, xsna.svf
    public final cpe0 R3() {
        return this.g;
    }

    @Override // xsna.qvf
    public final Bitmap W3() {
        return this.f;
    }

    @Override // xsna.svf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uvf uvfVar;
        synchronized (this) {
            uvfVar = this.e;
            this.e = null;
            this.f = null;
        }
        if (uvfVar != null) {
            uvfVar.close();
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        ahq.l("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", lcl.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // xsna.svf, xsna.mjw
    public final int getHeight() {
        int i;
        if (this.h % 180 != 0 || (i = this.i) == 5 || i == 7) {
            Bitmap bitmap = this.f;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.f;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // xsna.xvf
    public final int getRotationAngle() {
        return this.h;
    }

    @Override // xsna.svf, xsna.mjw
    public final int getWidth() {
        int i;
        if (this.h % 180 != 0 || (i = this.i) == 5 || i == 7) {
            Bitmap bitmap = this.f;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.f;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // xsna.svf
    public final synchronized boolean isClosed() {
        return this.e == null;
    }

    @Override // xsna.svf
    public final int u() {
        return id7.d(this.f);
    }

    @Override // xsna.xvf
    public final int w0() {
        return this.i;
    }

    public lcl(uvf uvfVar, cpe0 cpe0Var, int i, int i2) {
        uvf n = uvfVar.n();
        n.getClass();
        this.e = n;
        this.f = (Bitmap) n.r();
        this.g = cpe0Var;
        this.h = i;
        this.i = i2;
    }
}
