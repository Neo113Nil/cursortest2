package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: ThermalStatusEventBuilder.kt */
/* loaded from: classes11.dex */
public final class eqo0 extends l5m {
    public final int h;
    public final boolean i;

    public eqo0(int i, boolean z) {
        super(null, null, 3);
        this.h = i;
        this.i = z;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.THERMAL_STATUS.h(), null, null, Integer.valueOf(this.h), null, Integer.valueOf(this.i ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
        return super.p();
    }
}
