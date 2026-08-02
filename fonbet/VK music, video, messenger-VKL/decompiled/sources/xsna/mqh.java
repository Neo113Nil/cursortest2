package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class mqh implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;

    public mqh(String str) {
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((j9z) ((wow) this.c).b.get(((Number) obj).intValue())).a;
            default:
                qgi0.h((tgi0) obj, (String) this.c);
                return s3q0.a;
        }
    }

    public mqh(zj zjVar, wow wowVar) {
        this.c = wowVar;
    }
}
