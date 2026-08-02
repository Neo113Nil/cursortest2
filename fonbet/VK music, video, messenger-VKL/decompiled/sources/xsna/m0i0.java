package xsna;

import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.UUID;

/* compiled from: SearchW3UiMeasuringEventBuilder.kt */
/* loaded from: classes17.dex */
public final class m0i0 extends l5m {
    public final UUID h;
    public final UiMeasuringScreen i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;

    public m0i0(int i, int i2, int i3, int i4, UiMeasuringScreen uiMeasuringScreen, String str, UUID uuid, irk0 irk0Var) {
        super(irk0Var, null, 2);
        this.h = uuid;
        this.i = uiMeasuringScreen;
        this.j = str;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = i4;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.UI_RESPONSIVENESS.h();
        String h2 = this.i.h();
        String uuid = this.h.toString();
        this.g = new SchemeStat$TypeDevNullItem(h, null, h2, Integer.valueOf(this.k), this.j, null, uuid, Integer.valueOf(this.l), null, null, null, Integer.valueOf(this.m), null, Integer.valueOf(this.n), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10462, 3, null);
        return super.p();
    }
}
