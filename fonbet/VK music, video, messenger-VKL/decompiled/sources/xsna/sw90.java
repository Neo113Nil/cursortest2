package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.max;

/* compiled from: PerformanceReporterStartMetrics.kt */
/* loaded from: classes.dex */
public final class sw90 implements max {
    public static final sw90 a = new sw90();
    public static final ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();
    public static final wto0 c = new wto0(0);
    public static volatile boolean d = true;
    public static volatile boolean e = true;

    /* compiled from: PerformanceReporterStartMetrics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final vto0 a;
        public final boolean b;

        public a(vto0 vto0Var, boolean z) {
            this.a = vto0Var;
            this.b = z;
        }

        public final vto0 a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    /* compiled from: PerformanceReporterStartMetrics.kt */
    public static final class b implements m1q0 {
        @Override // xsna.m1q0
        public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen2.a;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD;
            if (mobileOfficialAppsCoreNavStat$EventScreen == mobileOfficialAppsCoreNavStat$EventScreen2) {
                return;
            }
            sw90 sw90Var = sw90.a;
            sw90.e = uiTrackingScreen.a == mobileOfficialAppsCoreNavStat$EventScreen2;
        }
    }

    public static max.a b(a aVar) {
        vto0 a2;
        boolean b2 = aVar.b();
        wto0 wto0Var = c;
        if (b2) {
            a2 = wto0Var.a;
        } else {
            if (b2) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = aVar.a();
        }
        return new max.a(a2, aVar.b(), wto0Var);
    }

    @Override // xsna.max
    public final max.a a(String str, vto0 vto0Var) {
        a aVar;
        ConcurrentHashMap<String, a> concurrentHashMap = b;
        a aVar2 = concurrentHashMap.get(str);
        if (aVar2 != null) {
            return b(aVar2);
        }
        if (e && vto0Var != null && (aVar = concurrentHashMap.get("launcher")) != null) {
            sw90 sw90Var = a;
            vto0 a2 = aVar.a();
            sw90Var.getClass();
            Long d2 = vto0Var.d(a2);
            if (d2 == null || d2.longValue() > 3000000) {
                aVar = null;
            }
            if (aVar != null) {
                return b(aVar);
            }
        }
        return null;
    }
}
