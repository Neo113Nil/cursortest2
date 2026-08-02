package defpackage;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.masstransit.sdk.ble.api.qrscan.analytics.QrScanButtonAction;
import com.yandex.go.zone.model.Zone;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class eeg0 implements deg0 {
    public final d411 a;
    public final aye0 b;

    public eeg0(d411 d411Var, aye0 aye0Var) {
        this.a = d411Var;
        this.b = aye0Var;
    }

    @Override // defpackage.deg0
    public final void a(boolean z) {
        d411 d411Var = this.a;
        d411Var.getClass();
        d411Var.a.a("TransportPayment.QrOptions.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.deg0
    public final void b(QrScanButtonAction qrScanButtonAction) {
    }

    @Override // defpackage.deg0
    public final void c() {
        Zone zone;
        ZoneAddress n = ((wu30) this.b.b).n();
        String str = (n == null || (zone = n.b) == null) ? null : zone.a;
        if (str == null) {
            str = "";
        }
        d411 d411Var = this.a;
        d411Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("zone_name", str);
        d411Var.a.a("TransportPayment.InvalidQr.Shown", hashMap, 2, new HashMap());
    }
}
