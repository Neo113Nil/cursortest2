package defpackage;

import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;
import kotlin.collections.a;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;

/* loaded from: classes12.dex */
public final class bsa implements sy60 {
    public final /* synthetic */ csa a;
    public final /* synthetic */ hr9 b;

    public bsa(csa csaVar, hr9 hr9Var) {
        this.a = csaVar;
        this.b = hr9Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        csa csaVar = this.a;
        ((b) csaVar.L.get()).c.g(zy11.a);
        csaVar.r(new qu(9));
    }

    public final void n1(ChargersQrOpenReason chargersQrOpenReason, String str) {
        ChargersQrOpenReason chargersQrOpenReason2 = ChargersQrOpenReason.RETURN_CHARGER;
        hr9 hr9Var = this.b;
        csa csaVar = this.a;
        if (chargersQrOpenReason != chargersQrOpenReason2) {
            csaVar.D((m950) csaVar.D.get(), new noa(chargersQrOpenReason), new cp9(csaVar, hr9Var, 3));
            return;
        }
        if (str == null && (str = hr9Var.b) == null) {
            taa taaVar = (taa) a.R(csaVar.K.b());
            str = taaVar != null ? taaVar.a() : null;
            if (str == null) {
                return;
            }
        }
        csaVar.D((m950) csaVar.D.get(), new noa(chargersQrOpenReason2), new asa(csaVar, hr9Var, str));
    }
}
