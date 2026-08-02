package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class ih00 implements izs<Integer, Object> {
    public final /* synthetic */ wow b;

    public ih00(y8 y8Var, wow wowVar) {
        this.b = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return ((pg00) this.b.b.get(num.intValue())).getClass();
    }
}
