package xsna;

import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import org.chromium.net.NetError;

/* compiled from: W3UiMeasuringEventBuilder.kt */
/* loaded from: classes17.dex */
public final class x7x0 extends l5m {
    public final UiMeasuringScreen h;
    public final int i;
    public final int j;

    public x7x0(UiMeasuringScreen uiMeasuringScreen, irk0 irk0Var, int i, int i2) {
        super(irk0Var, null, 2);
        this.h = uiMeasuringScreen;
        this.i = i;
        this.j = i2;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.UI_RESPONSIVENESS.h(), null, this.h.h(), Integer.valueOf(this.i), null, null, null, Integer.valueOf(this.j), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_MSG_TOO_BIG, 3, null);
        return super.p();
    }
}
