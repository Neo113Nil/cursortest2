package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class cid implements izs<Integer, Object> {
    public final /* synthetic */ whd b;
    public final /* synthetic */ wow c;

    public cid(whd whdVar, wow wowVar) {
        this.b = whdVar;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
