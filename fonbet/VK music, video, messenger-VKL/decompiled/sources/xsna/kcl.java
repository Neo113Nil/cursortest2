package xsna;

import xsna.uvf;

/* compiled from: DefaultCloseableReference.java */
/* loaded from: classes12.dex */
public final class kcl<T> extends uvf<T> {
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.b) {
                    super.finalize();
                    return;
                }
                T a = this.c.a();
                ahq.l("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.c)), a == null ? null : a.getClass().getName());
                uvf.c cVar = this.d;
                if (cVar != null) {
                    cVar.b(this.c, this.e);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // xsna.uvf
    /* renamed from: m */
    public final uvf<T> clone() {
        sex0.f(s());
        return new kcl(this.c, this.d, this.e != null ? new Throwable() : null);
    }
}
