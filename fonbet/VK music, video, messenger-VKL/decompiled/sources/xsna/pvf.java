package xsna;

/* compiled from: CloseableAnimatedImage.java */
/* loaded from: classes12.dex */
public final class pvf extends gb6 {
    public wk2 e;
    public final boolean f = true;

    public pvf(wk2 wk2Var, int i) {
        this.e = wk2Var;
    }

    @Override // xsna.gb6, xsna.svf
    public final boolean c4() {
        return this.f;
    }

    @Override // xsna.svf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                wk2 wk2Var = this.e;
                if (wk2Var == null) {
                    return;
                }
                this.e = null;
                synchronized (wk2Var) {
                    uvf.q(wk2Var.c);
                    wk2Var.c = null;
                    uvf.p(wk2Var.d);
                    wk2Var.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        ahq.l("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // xsna.svf, xsna.mjw
    public final synchronized int getHeight() {
        wk2 wk2Var;
        wk2Var = this.e;
        return wk2Var == null ? 0 : wk2Var.a.getHeight();
    }

    @Override // xsna.svf, xsna.mjw
    public final synchronized int getWidth() {
        wk2 wk2Var;
        wk2Var = this.e;
        return wk2Var == null ? 0 : wk2Var.a.getWidth();
    }

    @Override // xsna.svf
    public final synchronized boolean isClosed() {
        return this.e == null;
    }

    @Override // xsna.svf
    public final synchronized int u() {
        wk2 wk2Var;
        wk2Var = this.e;
        return wk2Var == null ? 0 : wk2Var.a.u();
    }

    public final synchronized pk2 x() {
        wk2 wk2Var;
        wk2Var = this.e;
        return wk2Var == null ? null : wk2Var.a;
    }

    public final synchronized wk2 y() {
        return this.e;
    }
}
