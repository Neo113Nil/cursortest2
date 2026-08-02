package xsna;

import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: TimelineUiMeasuringEventBuilder.kt */
/* loaded from: classes17.dex */
public final class dxo0 extends l5m {
    public final UiMeasuringScreen h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final Integer o;

    public dxo0(UiMeasuringScreen uiMeasuringScreen, String str, irk0 irk0Var, int i, int i2, int i3, int i4, int i5, Integer num) {
        super(irk0Var, null, 2);
        this.h = uiMeasuringScreen;
        this.i = str;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = num;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.SCREEN_TIMELINE.h(), null, this.h.h(), Integer.valueOf(this.j), this.i, Integer.valueOf(this.k), null, Integer.valueOf(this.l), null, Integer.valueOf(this.m), null, Integer.valueOf(this.n), null, this.o, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10942, 3, null);
        return super.p();
    }
}
