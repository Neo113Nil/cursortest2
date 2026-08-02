package xsna;

/* compiled from: CloseableProducerToDataSourceAdapter.java */
/* loaded from: classes12.dex */
public final class tvf<T> extends gh<uvf<T>> {
    public static tvf m(thd0 thd0Var, ozi0 ozi0Var, clx clxVar) {
        if (lhs.d()) {
            lhs.a("CloseableProducerToDataSourceAdapter#create");
        }
        tvf tvfVar = new tvf(thd0Var, ozi0Var, clxVar);
        if (lhs.d()) {
            lhs.b();
        }
        return tvfVar;
    }

    @Override // xsna.ae
    public final void e(Object obj) {
        uvf.q((uvf) obj);
    }

    @Override // xsna.ae, xsna.zuk
    public final Object getResult() {
        return uvf.o((uvf) super.getResult());
    }

    @Override // xsna.gh
    public final void l(Object obj, int i, uhd0 uhd0Var) {
        super.l(uvf.o((uvf) obj), i, uhd0Var);
    }
}
