package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.a;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class bp0 {
    public final lx4 a;
    public String b;
    public String c = "";

    public bp0(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public final void a(String str, boolean z, xp0 xp0Var, String str2, String str3) {
        String str4 = this.b;
        if (str4 == null || str4.length() == 0) {
            xby.l(jst.e, a.X(scc.g("RESTRICTED_AREA_POPUP_ERROR_TOKEN:ANALYTICS_ERROR", "ANALYTICS_ERROR", "selectedId isNullOrEmpty"), ":", null, null, null, 62), null, new IllegalArgumentException(str), "selectedId isNullOrEmpty", 2);
        }
        i d = ((j) this.a).d(str);
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("source", xp0Var.a);
        linkedHashMap.put("zone_id", str2);
        if (z) {
            d.d("selected_id", this.b);
        }
        if (str3 != null) {
            d.d("choice_id", str3);
        }
        d.m();
    }

    public final void b(xp0 xp0Var, String str) {
        a("RestrictedAreaPopup.Closed", false, xp0Var, str, null);
    }

    public final void c(String str, xp0 xp0Var, String str2, String str3) {
        if (jl40.l(this.b, str)) {
            return;
        }
        this.b = str;
        a("RestrictedAreaPopup.DidTapItem", true, xp0Var, str2, str3);
    }
}
