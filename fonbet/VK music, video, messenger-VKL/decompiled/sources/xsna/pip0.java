package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.toggle.features.CoreFeatures;
import java.util.concurrent.ThreadFactory;
import xsna.mip0;

/* compiled from: TrafficMonitoringTask.kt */
/* loaded from: classes11.dex */
public final class pip0 extends ParallelTaskRunner.d {
    public static void c(AggregateEventBuilder aggregateEventBuilder, mip0.b bVar, boolean z) {
        aggregateEventBuilder.w(0, String.valueOf(bVar.b()));
        aggregateEventBuilder.w(1, String.valueOf(bVar.c()));
        aggregateEventBuilder.w(2, String.valueOf(bVar.a()));
        aggregateEventBuilder.v(0, z ? 1 : 0);
        aggregateEventBuilder.q();
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "TrafficMonitoring";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        ThreadFactory a;
        CoreFeatures coreFeatures = CoreFeatures.COMMON_TRAFFIC_MONITORING;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            oip0 oip0Var = new oip0();
            c63 c63Var = c63.a;
            c63.a(oip0Var);
            final SharedPreferences f = Preference.f("traffic_monitoring");
            a = asu0.a.a((r3 & 4) != 0 ? 5 : 10, "traffic-monitoring-thread", (r3 & 2) == 0);
            mip0.a.b(f, a, oip0Var);
            new rvv(400L).b(1000L, new Runnable() { // from class: xsna.nip0
                @Override // java.lang.Runnable
                public final void run() {
                    mip0.a.a(f, new twa(this));
                }
            });
        }
        return s3q0.a;
    }
}
