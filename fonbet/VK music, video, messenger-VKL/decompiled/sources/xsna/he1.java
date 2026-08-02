package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes7.dex */
public final class he1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wow c;

    public /* synthetic */ he1(wow wowVar, int i) {
        this.b = i;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.get(((Number) obj).intValue());
                break;
            case 1:
                this.c.get(((Number) obj).intValue());
                break;
            default:
                this.c.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
