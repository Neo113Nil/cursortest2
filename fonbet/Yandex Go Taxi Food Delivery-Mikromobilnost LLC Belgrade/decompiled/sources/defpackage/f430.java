package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.zone.model.ZoneMode;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public final class f430 {
    public final Context a;
    public final tig0 b;

    public f430(Context context, tig0 tig0Var) {
        this.a = context;
        this.b = tig0Var;
    }

    public static Map a(cdc cdcVar, wp2 wp2Var, cdc cdcVar2, wp2 wp2Var2, j37 j37Var) {
        j37 j37Var2 = new j37(cdcVar, cdcVar2, wp2Var, wp2Var2);
        Pair pair = new Pair(ButtonType.DEFAULT, j37Var2);
        ButtonType buttonType = ButtonType.SURGE;
        if (j37Var == null) {
            j37Var = j37Var2;
        }
        return b.i(pair, new Pair(buttonType, j37Var), new Pair(ButtonType.PROMO, j37Var2));
    }

    public final Map b(String str, j37 j37Var) {
        tig0 tig0Var = this.b;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, ((nrt) ((exu0) tig0Var.b)).b(((pwy0) tig0Var.a).getThemeType(), str).b);
        return a(new cdc(qje.u(contextThemeWrapper.getTheme(), xng0.controlMain)), AppColor$Palette.Control, new cdc(qje.u(contextThemeWrapper.getTheme(), xng0.textOnControl)), AppColor$Palette.TextOnControl, j37Var);
    }

    public final e430 c(ZoneMode zoneMode) {
        Map b;
        ZoneMode.Companion.getClass();
        if (zoneMode == ZoneMode.d) {
            return e430.d;
        }
        String str = zoneMode.a;
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode == -842056224) {
            if (str.equals("ultima")) {
                b = b(str, null);
            }
            b = b.f();
        } else if (hashCode != 95852938) {
            if (hashCode == 1544803905 && str.equals("default")) {
                b = b(str, new j37(new gdc(dpg0.zone_mode_button_style_default_color), new gdc(mqg0.white), new up2(gq2.b), new up2(zp2.a)));
            }
            b = b.f();
        } else {
            if (str.equals(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                int i = xqg0.drive_accent_color;
                Context context = this.a;
                b = a(new cdc(context.getColor(i)), new up2(hq2.a()), new cdc(context.getColor(mqg0.component_white)), new up2(zp2.a), null);
            }
            b = b.f();
        }
        return new e430(new m37(b), str, str);
    }
}
