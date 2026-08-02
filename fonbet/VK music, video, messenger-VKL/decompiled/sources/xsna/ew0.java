package xsna;

/* compiled from: AdsInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class ew0 implements dw0 {
    public ew0(imj0 imj0Var) {
    }

    @Override // xsna.dw0
    public final io.reactivex.rxjava3.core.a a(cw0 cw0Var) {
        String str = cw0Var.a;
        String str2 = cw0Var.b;
        Integer num = cw0Var.c;
        tfx tfxVar = new tfx("adsint.hideAd", new lq(1), new mq(1));
        tfx.o(tfxVar, "ad_data", str, 0, 0, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "object_type", str2, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "reason_id", num.intValue(), 0, 0, 12);
        }
        return rsg0.Z(yfb.x(tfxVar));
    }
}
