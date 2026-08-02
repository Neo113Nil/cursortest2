package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class eel0 {
    public static final List a;
    public static final k5l0 b;
    public static final j5l0 c;

    static {
        List g = scc.g(new o68(84.0f, 116.0f, 160.0f), new o68(1100.0f, 260.0f, 165.0f));
        List singletonList = Collections.singletonList(new o68(880.0f, 165.0f, 253.0f));
        List singletonList2 = Collections.singletonList(new o68(380.0f, 335.0f, 70.0f));
        List g2 = scc.g(new o68(200.0f, 100.0f, 70.0f), new o68(430.0f, 320.0f, 70.0f), new o68(160.0f, 330.0f, 160.0f), new o68(1010.0f, 105.0f, 240.0f), new o68(750.0f, 335.0f, -30.0f), new o68(1040.0f, 305.0f, -60.0f));
        k5l0 k5l0Var = new k5l0(d1h0.ic_route_first, d1h0.ic_route_first_active, g);
        k5l0 k5l0Var2 = new k5l0(d1h0.ic_route_second, d1h0.ic_route_second_active, singletonList);
        int i = d1h0.ic_route_third_active;
        a = scc.g(k5l0Var, k5l0Var2, new k5l0(i, i, singletonList2));
        int i2 = d1h0.bg_map_empty;
        b = new k5l0(i2, i2, g2);
        int i3 = d1h0.bg_map_empty_dark;
        c = new j5l0(i3, i3, g2);
    }
}
