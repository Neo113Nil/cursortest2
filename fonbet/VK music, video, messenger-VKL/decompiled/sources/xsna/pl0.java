package xsna;

/* compiled from: AddImageTransformMetaDataProducer.java */
/* loaded from: classes12.dex */
public final class pl0 implements thd0<rip> {
    public final thd0<rip> a;

    /* compiled from: AddImageTransformMetaDataProducer.java */
    public static class a extends wtl<rip, rip> {
        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            rip ripVar = (rip) obj;
            l7j<O> l7jVar = this.b;
            if (ripVar == null) {
                l7jVar.b(i, null);
                return;
            }
            if (!rip.v(ripVar)) {
                ripVar.s();
            }
            l7jVar.b(i, ripVar);
        }
    }

    public pl0(thd0<rip> thd0Var) {
        this.a = thd0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        this.a.b(new a(l7jVar), uhd0Var);
    }
}
