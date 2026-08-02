package xsna;

/* compiled from: SingleCloseImageProxy.java */
/* loaded from: classes11.dex */
public final class mtj0 extends l9s {
    public boolean d;

    @Override // xsna.l9s, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.d) {
            this.d = true;
            super.close();
        }
    }
}
