package xsna;

/* compiled from: SwallowResultProducer.java */
/* loaded from: classes12.dex */
public final class jln0<T> implements thd0<Void> {
    public final thd0<T> a;

    /* compiled from: SwallowResultProducer.java */
    public class a extends wtl<T, Void> {
        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            if (ac6.d(i)) {
                this.b.b(i, null);
            }
        }
    }

    public jln0(thd0<T> thd0Var) {
        this.a = thd0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<Void> l7jVar, uhd0 uhd0Var) {
        this.a.b(new a(l7jVar), uhd0Var);
    }
}
