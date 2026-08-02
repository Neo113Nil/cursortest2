package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: SplitRamUsageEventBuilder.kt */
/* loaded from: classes5.dex */
public final class rlk0 extends l5m {
    public final Integer h;
    public final Integer i;

    public rlk0(Integer num, Integer num2) {
        super(null, null, 3);
        this.h = num;
        this.i = num2;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.SPLIT_RAM_USAGE.h(), null, null, this.h, null, this.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
        return super.p();
    }
}
