package defpackage;

import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;

/* loaded from: classes13.dex */
public final class ffx0 implements gfx0 {
    public final Zone a;
    public final ZoneTariffInfo b;

    public ffx0(Zone zone, ZoneTariffInfo zoneTariffInfo) {
        this.a = zone;
        this.b = zoneTariffInfo;
    }

    @Override // defpackage.gfx0
    public final Zone getZone() {
        return this.a;
    }
}
