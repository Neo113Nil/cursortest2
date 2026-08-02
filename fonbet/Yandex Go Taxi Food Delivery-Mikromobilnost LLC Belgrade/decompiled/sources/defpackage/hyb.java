package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorAnalytics$Button;

/* loaded from: classes6.dex */
public final class hyb implements t8l0 {
    public final b1 a;

    public hyb(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // defpackage.t8l0
    public final void a(wvb1 wvb1Var) {
        String str = wvb1Var.a ? "source" : "destination";
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("point_type", str);
        hashMap.put("device_timestamp", valueOf);
        b1Var.a.a("ClarifyPoints.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.t8l0
    public final void b(boolean z, RouteSelectorAnalytics$Button routeSelectorAnalytics$Button) {
        String str = z ? "source" : "destination";
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        String alias = routeSelectorAnalytics$Button.getAlias();
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("point_type", str);
        hashMap.put("device_timestamp", valueOf);
        if (alias != null) {
            hashMap.put("button_name", alias);
        }
        b1Var.a.a("ClarifyPoints.Tapped", hashMap, 1, new HashMap());
    }
}
