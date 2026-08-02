package defpackage;

import android.content.Context;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanState;
import com.yandex.go.chargers.qr.domain.a;
import com.yandex.go.chargers.qr.f;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.HapticController$Effect;

/* loaded from: classes12.dex */
public final class poa extends ad5 {
    public final qya A;
    public final v7j0 B;
    public final joa C;
    public final f D;
    public final a E;
    public final yfa F;
    public final zna G;
    public pzt0 H;
    public final Context x;
    public final y50 y;
    public final ney z;

    public poa(Context context, y50 y50Var, ney neyVar, qya qyaVar, v7j0 v7j0Var, joa joaVar, f fVar, a aVar, yfa yfaVar, zna znaVar) {
        super(moa.class);
        this.x = context;
        this.y = y50Var;
        this.z = neyVar;
        this.A = qyaVar;
        this.B = v7j0Var;
        this.C = joaVar;
        this.D = fVar;
        this.E = aVar;
        this.F = yfaVar;
        this.G = znaVar;
    }

    public static final void Kg(poa poaVar, tsa tsaVar, ChargersAnalytics$ChargersQrScanCloseReason chargersAnalytics$ChargersQrScanCloseReason) {
        qke.E(poaVar.x, HapticController$Effect.CLICK_HEAVY, false, 12);
        poaVar.G.d = chargersAnalytics$ChargersQrScanCloseReason;
        ((k1a) poaVar.F.a).r(new ps9(tsaVar, 7));
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        zna znaVar = this.G;
        ChargersAnalytics$ChargersQrScanCloseReason chargersAnalytics$ChargersQrScanCloseReason = znaVar.d;
        if (chargersAnalytics$ChargersQrScanCloseReason == null) {
            chargersAnalytics$ChargersQrScanCloseReason = ChargersAnalytics$ChargersQrScanCloseReason.Back;
        }
        em9 em9Var = znaVar.a;
        ChargersAnalytics$ChargersQrScanState chargersAnalytics$ChargersQrScanState = znaVar.c;
        HashMap w = b64.w(em9Var);
        if (chargersAnalytics$ChargersQrScanState != null) {
            w.put(ClidProvider.STATE, chargersAnalytics$ChargersQrScanState.getEventValue());
        }
        w.put("close_reason", chargersAnalytics$ChargersQrScanCloseReason.getEventValue());
        em9Var.a.a("Chargers.QrScan.Closed", w, 1, new HashMap());
        ((moa) Dg()).releaseCamera();
        super.Cg();
        this.z.d(this);
    }
}
