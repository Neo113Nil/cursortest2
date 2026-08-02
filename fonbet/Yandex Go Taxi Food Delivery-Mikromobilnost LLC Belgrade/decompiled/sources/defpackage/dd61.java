package defpackage;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;

/* loaded from: classes13.dex */
public final class dd61 {
    public final pv0 a;
    public final Zone b;

    public dd61(pv0 pv0Var, Zone zone) {
        this.a = pv0Var;
        this.b = zone;
    }

    public final ZoneAddress a() {
        return new ZoneAddress(this.a.a, this.b);
    }

    public final pv0 b() {
        return this.a;
    }
}
