package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes16.dex */
public final class xd00 implements izs<Integer, Object> {
    public final /* synthetic */ tr0 b;
    public final /* synthetic */ wow c;

    public xd00(tr0 tr0Var, wow wowVar) {
        this.b = tr0Var;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.b.get(num.intValue()));
    }
}
