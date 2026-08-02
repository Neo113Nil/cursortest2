package xsna;

/* compiled from: Scopes.kt */
/* loaded from: classes11.dex */
public class z9h0<T> extends xd<T> implements awj {
    public final spj<T> e;

    public z9h0(spj spjVar, kotlin.coroutines.d dVar) {
        super(dVar, true, true);
        this.e = spjVar;
    }

    @Override // xsna.pyx
    public void C(Object obj) {
        upj.b(s7s0.d(obj), s7s0.c(this.e));
    }

    @Override // xsna.pyx
    public void G(Object obj) {
        this.e.resumeWith(s7s0.d(obj));
    }

    @Override // xsna.awj
    public final awj getCallerFrame() {
        spj<T> spjVar = this.e;
        if (spjVar instanceof awj) {
            return (awj) spjVar;
        }
        return null;
    }

    @Override // xsna.pyx
    public final boolean h0() {
        return true;
    }

    public void x0() {
    }
}
