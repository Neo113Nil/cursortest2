package defpackage;

import com.yandex.go.perf.api.screen.SourceScreen;
import java.util.HashMap;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.perf.b;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.c;

/* loaded from: classes8.dex */
public final class dkv0 {
    public static final xy20 f = new xy20(j73.f0(new String[]{"ComposeSummary", "VerticalSummary", "WhoRideSelector"}));
    public final c a;
    public final zjv0 b;
    public final b c;
    public final com.yandex.go.navigation.screen.c d;
    public final w030 e;

    public dkv0(c cVar, zjv0 zjv0Var, b bVar, com.yandex.go.navigation.screen.c cVar2, w030 w030Var) {
        this.a = cVar;
        this.b = zjv0Var;
        this.c = bVar;
        this.d = cVar2;
        this.e = w030Var;
    }

    public final void a(rz4 rz4Var) {
        SourceScreen sourceScreen;
        if (rz4Var instanceof ekv0) {
            ekv0 ekv0Var = (ekv0) rz4Var;
            if (ekv0Var.d() != SourcePicker.B_FROM_HOME && ekv0Var.d() != SourcePicker.DESTINATION_FROM_ROUTE_SELECTOR) {
                return;
            }
        } else if (rz4Var instanceof hkv0) {
            if (((hkv0) rz4Var).d() != SourcePicker.B_FROM_HOME) {
                return;
            }
        } else if (!rz4Var.equals(fkv0.b) && !rz4Var.equals(gkv0.b) && !rz4Var.equals(ikv0.b) && !rz4Var.equals(jkv0.b)) {
            w511.b();
            return;
        }
        switch (ckv0.a[this.d.b().ordinal()]) {
            case 1:
                sourceScreen = SourceScreen.SUPERAPP_MAIN;
                break;
            case 2:
                sourceScreen = SourceScreen.MAIN;
                break;
            case 3:
                sourceScreen = SourceScreen.TAXI_MAIN;
                break;
            case 4:
                sourceScreen = SourceScreen.MULTIORDER;
                break;
            case 5:
                sourceScreen = SourceScreen.SELECT_DESTINATION_POINT;
                break;
            case 6:
                sourceScreen = SourceScreen.SUPERAPP_SUGGEST;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                sourceScreen = SourceScreen.UNKNOWN;
                break;
            default:
                w511.b();
                return;
        }
        cwa0 cwa0Var = new cwa0(PerformanceScreenName.Summary, sourceScreen.getAnalyticsName(), rz4Var, f, 24);
        c cVar = this.a;
        cVar.f(cwa0Var);
        yy20 yy20Var = cwa0Var.f;
        if (yy20Var instanceof xy20) {
            PerformanceScreenName performanceScreenName = cwa0Var.a;
            cVar.b(performanceScreenName);
            cVar.h.put(performanceScreenName, this.e.g(new bkv0(0, new ga1(10, yy20Var, cVar, cwa0Var))));
        }
        String c = this.c.c();
        String f2 = cwa0Var.c.f();
        xcv0 xcv0Var = this.b.a;
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("time_since_app_launch_sec", c);
        hashMap.put("intent_id", cwa0Var.d);
        xcv0Var.a.a("Performance.Summary.Enabled", hashMap, 1, x4e.q(hashMap, "intent_reason", f2, "source_screen", cwa0Var.b));
    }
}
