package xsna;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class qc10 implements izs<Integer, Object> {
    public final /* synthetic */ wow b;

    public qc10(wow wowVar) {
        this.b = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        this.b.get(num.intValue());
        return null;
    }
}
