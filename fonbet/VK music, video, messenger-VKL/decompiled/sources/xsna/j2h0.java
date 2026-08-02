package xsna;

/* compiled from: Savers.kt */
/* loaded from: classes11.dex */
public final class j2h0 implements e2h0<Object, Object> {
    public final /* synthetic */ wzs<f2h0, Object, Object> b;
    public final /* synthetic */ izs<Object, Object> c;

    public j2h0(izs izsVar, wzs wzsVar) {
        this.b = wzsVar;
        this.c = izsVar;
    }

    @Override // xsna.e2h0
    public final Object i(f2h0 f2h0Var, Object obj) {
        return this.b.invoke(f2h0Var, obj);
    }

    @Override // xsna.e2h0
    public final Object k(Object obj) {
        return this.c.invoke(obj);
    }
}
