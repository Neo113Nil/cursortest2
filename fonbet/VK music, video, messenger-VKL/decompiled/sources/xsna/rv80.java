package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class rv80 implements izs<Integer, Object> {
    public final /* synthetic */ sux b;
    public final /* synthetic */ wow c;

    public rv80(sux suxVar, wow wowVar) {
        this.b = suxVar;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        this.b.invoke(this.c.b.get(num.intValue()));
        return null;
    }
}
