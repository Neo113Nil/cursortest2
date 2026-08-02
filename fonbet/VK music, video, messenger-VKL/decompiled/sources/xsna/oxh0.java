package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes16.dex */
public final class oxh0 implements izs<Integer, Object> {
    public final /* synthetic */ wow b;

    public oxh0(wow wowVar) {
        this.b = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        this.b.get(num.intValue());
        return null;
    }
}
