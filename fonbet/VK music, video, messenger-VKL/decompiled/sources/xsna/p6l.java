package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class p6l implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wow c;

    public /* synthetic */ p6l(wow wowVar, int i) {
        this.b = i;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.get(((Number) obj).intValue());
                break;
            default:
                this.c.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
