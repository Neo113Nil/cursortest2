package defpackage;

import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$SafetyCenterNavigationSource;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import java.util.HashMap;
import ru.yandex.taxi.am.k;

/* loaded from: classes13.dex */
public final class eul0 {
    public final o a;
    public final k b;
    public final sh41 c;
    public final ppl0 d;

    public eul0(o oVar, k kVar, sh41 sh41Var, ppl0 ppl0Var) {
        this.a = oVar;
        this.b = kVar;
        this.c = sh41Var;
        this.d = ppl0Var;
    }

    public static SafetyCenterAnalytics$SafetyCenterNavigationSource e(SafetyCenterParams$Source safetyCenterParams$Source) {
        int i = dul0.a[safetyCenterParams$Source.ordinal()];
        if (i == 1) {
            return SafetyCenterAnalytics$SafetyCenterNavigationSource.Menu;
        }
        if (i == 2) {
            return SafetyCenterAnalytics$SafetyCenterNavigationSource.RideCard;
        }
        if (i != 3 && i != 4) {
            w511.b();
            return null;
        }
        return SafetyCenterAnalytics$SafetyCenterNavigationSource.Deeplink;
    }

    public final void a(sul0 sul0Var) {
        SafetyCenterAnalytics$SafetyCenterNavigationSource e = e(sul0Var.d);
        boolean c = c();
        boolean z = sul0Var.b;
        String b = b();
        String d = d();
        String str = sul0Var.a;
        ppl0 ppl0Var = this.d;
        HashMap o = tse0.o(ppl0Var);
        o.put("source", e.getEventValue());
        o.put("has_account", Boolean.valueOf(c));
        o.put("is_checklist", Boolean.valueOf(z));
        if (b != null) {
            o.put("country", b);
        }
        if (d != null) {
            o.put("zone_name", d);
        }
        if (str != null) {
            o.put("source_order_id", str);
        }
        ppl0Var.a.a("SafetyCenter.WebErrorScreen.Shown", o, 1, new HashMap());
    }

    public final String b() {
        o oVar = this.a;
        Zone b = oVar.b();
        if (b == null) {
            b = oVar.g();
        }
        if (b != null) {
            return b.B;
        }
        return null;
    }

    public final boolean c() {
        return this.b.Lg() != 0;
    }

    public final String d() {
        o oVar = this.a;
        Zone b = oVar.b();
        if (b == null) {
            b = oVar.g();
        }
        if (b != null) {
            return b.a;
        }
        return null;
    }
}
