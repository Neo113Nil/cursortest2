package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class zv80 implements izs<Integer, Object> {
    public final /* synthetic */ nq2 b;
    public final /* synthetic */ wow c;

    public zv80(nq2 nq2Var, wow wowVar) {
        this.b = nq2Var;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
