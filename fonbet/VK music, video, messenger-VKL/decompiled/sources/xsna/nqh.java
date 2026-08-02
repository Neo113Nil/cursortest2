package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class nqh implements izs<Integer, Object> {
    public final /* synthetic */ wow b;

    public nqh(wow wowVar) {
        this.b = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        this.b.get(num.intValue());
        return null;
    }
}
