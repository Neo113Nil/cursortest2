package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ld00 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ld00(int i, wh50 wh50Var) {
        this.c = i;
        this.d = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((wh50) this.d).setValue(Integer.valueOf(this.c));
                return s3q0.a;
            default:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) this.d;
                return new dq00(bVar, this.c, bVar.l.d(), bVar.h, bVar.z);
        }
    }

    public /* synthetic */ ld00(com.vk.clips.sdk.shared.item.market_ads.b bVar, int i) {
        this.d = bVar;
        this.c = i;
    }
}
