package defpackage;

import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;

/* loaded from: classes12.dex */
public final class dp9 implements ky9 {
    public final /* synthetic */ zsa a;
    public final /* synthetic */ String b;

    public dp9(zsa zsaVar, String str) {
        this.a = zsaVar;
        this.b = str;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.ky9
    public final void c() {
        zsa zsaVar = this.a;
        zsaVar.D((m950) ((yvf0) zsaVar.E).get(), new noa(ChargersQrOpenReason.RETURN_CHARGER), new cp9(zsaVar, this.b, 0));
    }

    @Override // defpackage.ky9
    public final void i() {
        this.a.r(new qu(9));
    }
}
