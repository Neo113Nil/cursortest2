package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class zpd implements izs<Integer, Object> {
    public final /* synthetic */ yh3 b;
    public final /* synthetic */ wow c;

    public zpd(yh3 yh3Var, wow wowVar) {
        this.b = yh3Var;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
