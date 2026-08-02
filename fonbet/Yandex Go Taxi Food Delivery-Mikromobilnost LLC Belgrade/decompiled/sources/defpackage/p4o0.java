package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;

/* loaded from: classes13.dex */
public final class p4o0 {
    public final dyx a;

    public p4o0(dyx dyxVar) {
        this.a = dyxVar;
    }

    public static o4o0 a(p4o0 p4o0Var, ScootersOffersPresentationState$LaunchContext scootersOffersPresentationState$LaunchContext, b8p0 b8p0Var, String str, wlo0 wlo0Var, int i) {
        pxm0 pxm0Var;
        if ((i & 16) != 0) {
            wlo0Var = null;
        }
        dyx dyxVar = p4o0Var.a;
        Mode mode = dyxVar.a().b.a;
        Screen screen = dyxVar.a().a;
        if (str == null) {
            str = "";
        }
        int i2 = czx.b[screen.ordinal()];
        if (i2 == 1) {
            pxm0Var = new pxm0("main", str);
        } else if (i2 == 2) {
            pxm0Var = new pxm0("multiorder", str);
        } else if (i2 != 3) {
            pxm0Var = new pxm0("unsupported", "unsupported");
        } else {
            int i3 = czx.a[mode.ordinal()];
            pxm0Var = i3 != 1 ? i3 != 2 ? new pxm0("unsupported", "unsupported") : new pxm0("city_mode", str) : new pxm0("scooters_discovery", str);
        }
        pxm0 pxm0Var2 = pxm0Var;
        if (b8p0Var instanceof z7p0) {
            z7p0 z7p0Var = (z7p0) b8p0Var;
            return new l4o0(z7p0Var.a, scootersOffersPresentationState$LaunchContext, pxm0Var2, wlo0Var != null ? wlo0Var.getNumber() : null, z7p0Var.c, z7p0Var.d, z7p0Var.b);
        }
        if (b8p0Var instanceof a8p0) {
            a8p0 a8p0Var = (a8p0) b8p0Var;
            return new m4o0(a8p0Var.a, scootersOffersPresentationState$LaunchContext, pxm0Var2, a8p0Var.b);
        }
        if (b8p0Var instanceof y7p0) {
            y7p0 y7p0Var = (y7p0) b8p0Var;
            return new k4o0(y7p0Var.a, scootersOffersPresentationState$LaunchContext, pxm0Var2, y7p0Var.b);
        }
        w511.b();
        return null;
    }
}
