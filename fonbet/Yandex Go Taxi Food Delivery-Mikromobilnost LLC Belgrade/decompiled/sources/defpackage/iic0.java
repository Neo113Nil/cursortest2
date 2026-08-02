package defpackage;

import com.adjust.sdk.Constants;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class iic0 {
    public static void a(MapBuilder mapBuilder, q0d0 q0d0Var) {
        mapBuilder.put("action", q0d0Var != null ? q0d0Var.a() : "no_action");
        if (q0d0Var instanceof p0d0) {
            mapBuilder.put("url", ((p0d0) q0d0Var).b());
            return;
        }
        if (q0d0Var instanceof m0d0) {
            mapBuilder.put(Constants.DEEPLINK, ((m0d0) q0d0Var).b());
            return;
        }
        if (q0d0Var instanceof o0d0) {
            mapBuilder.put("typed_screen", ((o0d0) q0d0Var).b());
            return;
        }
        if (q0d0Var instanceof l0d0) {
            l0d0 l0d0Var = (l0d0) q0d0Var;
            mapBuilder.put("spend_amount", l0d0Var.b());
            mapBuilder.put("turn", String.valueOf(l0d0Var.c()));
        } else {
            if ((q0d0Var instanceof n0d0) || q0d0Var == null) {
                return;
            }
            w511.b();
        }
    }

    public static void b(MapBuilder mapBuilder, u22 u22Var) {
        String str;
        boolean z = u22Var instanceof bo4;
        if (z) {
            str = "balance";
        } else if (u22Var instanceof ez6) {
            str = "button";
        } else if (u22Var instanceof d4v) {
            str = "icon";
        } else if (u22Var instanceof lkt0) {
            str = "spacer";
        } else if (u22Var instanceof ryw0) {
            str = "composite_switch";
        } else {
            if (!(u22Var instanceof ujy0)) {
                w511.b();
                return;
            }
            str = "text";
        }
        mapBuilder.put("content_type", str);
        if (z) {
            mapBuilder.put("balance", ((bo4) u22Var).a());
            return;
        }
        if (u22Var instanceof ujy0) {
            mapBuilder.put("text", ((ujy0) u22Var).a());
        } else {
            if ((u22Var instanceof ez6) || (u22Var instanceof d4v) || (u22Var instanceof lkt0) || (u22Var instanceof ryw0)) {
                return;
            }
            w511.b();
        }
    }
}
