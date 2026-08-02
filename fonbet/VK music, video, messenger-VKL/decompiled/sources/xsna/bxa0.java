package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class bxa0 implements izs<Integer, Object> {
    public final /* synthetic */ tji b;
    public final /* synthetic */ wow c;

    public bxa0(tji tjiVar, wow wowVar) {
        this.b = tjiVar;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
