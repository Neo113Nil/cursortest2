package defpackage;

import com.yandex.go.masstransit.sdk.ble.api.qrscan.config.QrScannerConfig$QrTarget;
import java.util.Collections;
import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.e;

/* loaded from: classes12.dex */
public final class dfg0 implements bfg0 {
    public final e a;
    public final afg0 b = new afg0(Collections.singletonList("masstransit-checkout"), QrScannerConfig$QrTarget.TRANSPORT_PAYMENT);

    public dfg0(e eVar) {
        this.a = eVar;
    }
}
