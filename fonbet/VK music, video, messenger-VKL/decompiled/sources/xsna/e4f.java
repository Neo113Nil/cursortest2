package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class e4f implements izs<Integer, Object> {
    public final /* synthetic */ rc9 b;
    public final /* synthetic */ wow c;

    public e4f(rc9 rc9Var, wow wowVar) {
        this.b = rc9Var;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
