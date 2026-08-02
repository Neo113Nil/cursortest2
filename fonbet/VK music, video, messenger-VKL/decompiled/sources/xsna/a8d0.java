package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class a8d0 implements izs<Integer, Object> {
    public final /* synthetic */ z2 b;
    public final /* synthetic */ wow c;

    public a8d0(z2 z2Var, wow wowVar) {
        this.b = z2Var;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
