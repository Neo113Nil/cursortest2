package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class zft implements izs<Integer, Object> {
    public final /* synthetic */ md8 b;
    public final /* synthetic */ wow c;

    public zft(md8 md8Var, wow wowVar) {
        this.b = md8Var;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
