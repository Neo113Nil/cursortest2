package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class ziw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ziw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((wow) this.c).get(((Number) obj).intValue());
                return null;
            default:
                ((Boolean) obj).getClass();
                ((o0e0) this.c).a.detach();
                return s3q0.a;
        }
    }
}
