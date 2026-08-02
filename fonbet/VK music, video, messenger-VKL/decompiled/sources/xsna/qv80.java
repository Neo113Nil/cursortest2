package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class qv80 implements izs<Integer, Object> {
    public final /* synthetic */ kl60 b;
    public final /* synthetic */ wow c;

    public qv80(kl60 kl60Var, wow wowVar) {
        this.b = kl60Var;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.b.get(num.intValue()));
    }
}
