package xsna;

import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.UUID;

/* compiled from: SearchTimelineUiMeasuringEventBuilder.kt */
/* loaded from: classes17.dex */
public final class kzh0 extends l5m {
    public final UUID h;
    public final UiMeasuringScreen i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final Integer p;

    public kzh0(int i, int i2, int i3, int i4, int i5, UiMeasuringScreen uiMeasuringScreen, Integer num, String str, UUID uuid, irk0 irk0Var) {
        super(irk0Var, null, 2);
        this.h = uuid;
        this.i = uiMeasuringScreen;
        this.j = str;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = num;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.SCREEN_TIMELINE.h();
        String h2 = this.i.h();
        String uuid = this.h.toString();
        this.g = new SchemeStat$TypeDevNullItem(h, null, h2, Integer.valueOf(this.k), this.j, Integer.valueOf(this.l), uuid, Integer.valueOf(this.m), null, Integer.valueOf(this.n), null, Integer.valueOf(this.o), null, this.p, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -11006, 3, null);
        return super.p();
    }
}
