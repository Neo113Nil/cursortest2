package xsna;

import com.vk.core.preference.Preference;
import com.vk.metrics.performance.animation.motionlayout.MotionLayoutScreenType;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.stat.AppStartReporter;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import java.util.concurrent.locks.ReentrantLock;
import xsna.dx90;
import xsna.ky6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e93 implements izs {
    public final /* synthetic */ SchemeStat$TypeAppStarts.StartType b;
    public final /* synthetic */ AppStartReporter.StartMethod c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ e93(SchemeStat$TypeAppStarts.StartType startType, AppStartReporter.StartMethod startMethod, boolean z) {
        this.b = startType;
        this.c = startMethod;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = AppStartReporter.a;
        dx90 dx90Var = ow90.e;
        dx90Var.t = this.b;
        dx90Var.w();
        AppStartReporter.StartMethod startMethod = this.c;
        SchemeStat$TypeAppStarts.StartMethod i = startMethod.i();
        String h = startMethod.h();
        dx90Var.u = i;
        dx90Var.v = h;
        dx90Var.w();
        if (this.d) {
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putBoolean("__app_start_clean_boot__", true);
            aVar.apply();
        } else {
            ky6.a aVar2 = (ky6.a) Preference.j().edit();
            aVar2.putBoolean("__app_start_clean_boot__", true);
            aVar2.apply();
            for (ScrollScreenType scrollScreenType : ScrollScreenType.h()) {
                int i2 = dx90.W;
                Preference.C("performance", dx90.b.h(scrollScreenType, false));
                Preference.C("performance", dx90.b.h(scrollScreenType, true));
                Preference.C("performance", dx90.b.e(scrollScreenType, false));
                Preference.C("performance", dx90.b.e(scrollScreenType, true));
                Preference.C("performance", dx90.b.g(scrollScreenType, false));
                Preference.C("performance", dx90.b.g(scrollScreenType, true));
                Preference.C("performance", dx90.b.f(scrollScreenType, false));
                Preference.C("performance", dx90.b.f(scrollScreenType, true));
                Preference.C("performance", dx90.b.d(scrollScreenType));
                Preference.C("performance", dx90.b.c(scrollScreenType));
            }
            for (MotionLayoutScreenType motionLayoutScreenType : MotionLayoutScreenType.h()) {
                Preference.C("performance", motionLayoutScreenType.l());
                Preference.C("performance", motionLayoutScreenType.i());
                Preference.C("performance", motionLayoutScreenType.k());
                Preference.C("performance", motionLayoutScreenType.j());
            }
            dx90 dx90Var2 = ow90.e;
            ReentrantLock reentrantLock = dx90Var2.N;
            reentrantLock.lock();
            try {
                if (!dx90Var2.M) {
                    Preference.C("performance", "__app_performance_net_usage_start__");
                    Preference.C("performance", "__app_performance_net_usage__");
                    Preference.C("performance", "__app_performance_net_background_traffic__");
                    Preference.C("performance", "__app_performance_net_errors_count__");
                    Preference.C("performance", "__app_performance_net_4xx_errors_count__");
                    Preference.C("performance", "__app_performance_net_load_api_count__");
                    dx90Var2.t();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return s3q0.a;
    }
}
