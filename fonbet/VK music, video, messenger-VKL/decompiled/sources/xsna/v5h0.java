package xsna;

import android.content.SharedPreferences;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.core.performance.device.a;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.log.L;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: SchedulePerformanceScoreResolutionTaskLogic.kt */
/* loaded from: classes11.dex */
public final class v5h0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "SchedulePerformanceScoreResolution";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        b.d j;
        final com.vk.core.performance.device.a aVar = new com.vk.core.performance.device.a();
        o2l.a.getClass();
        final boolean b = o2l.b("__dbg_ignore_perf_score_session_timeout", false);
        CoreFeatures coreFeatures = CoreFeatures.PERF_REEVALUATE_PERIOD;
        coreFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        final Long l = null;
        if (bVar.a(coreFeatures) && (j = bVar.j(coreFeatures.getKey(), false)) != null) {
            l = j.c();
        }
        final c24 c24Var = new c24(13);
        asu0.a.getClass();
        asu0.m().c(new Runnable() { // from class: xsna.bw90
            @Override // java.lang.Runnable
            public final void run() {
                asu0.a.getClass();
                ExecutorService n = asu0.n();
                final com.vk.core.performance.device.a aVar2 = com.vk.core.performance.device.a.this;
                final c24 c24Var2 = c24Var;
                final Long l2 = l;
                final boolean z = b;
                n.execute(new Runnable() { // from class: xsna.cw90
                    @Override // java.lang.Runnable
                    public final void run() {
                        DevicePerformanceInfo a;
                        SharedPreferences sharedPreferences = hx90.a;
                        boolean exists = PrivateFiles.e(e8r.a, PrivateSubdir.PERFORMANCE, "device_performance_info", null, 28).exists();
                        final c24 c24Var3 = c24Var2;
                        if (exists) {
                            L.e("PerformanceClassResolver", "devicePerformanceInfo already exists");
                            DevicePerformanceInfo a2 = DevicePerformanceInfo.a.a();
                            if (a2 != null && (a = a.C0772a.a(com.vk.core.performance.device.a.f, c24Var3)) != null && !a2.equals(a)) {
                                a.a();
                            }
                        } else if (k6m.a()) {
                            com.vk.core.performance.device.a.a(c24Var3);
                            L.e("PerformanceClassResolver", "resolved devicePerformanceInfo for a known model");
                        }
                        SharedPreferences sharedPreferences2 = hx90.a;
                        if (!sharedPreferences2.getBoolean("scores_reported", false)) {
                            if (z) {
                                L.e("PerformanceClassResolver", "Ignoring session timeout due to debug");
                            } else if (System.currentTimeMillis() - sharedPreferences2.getLong("last_score_resolution_time", 0L) < com.vk.core.performance.device.a.g) {
                                L.e("PerformanceClassResolver", "Too early to repeat scoring process");
                                return;
                            }
                            asu0.a.getClass();
                            io.reactivex.rxjava3.core.w i = asu0.i();
                            final com.vk.core.performance.device.a aVar3 = com.vk.core.performance.device.a.this;
                            i.d(new Runnable() { // from class: xsna.dw90
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.vk.core.performance.device.a.this.b(c24Var3);
                                }
                            }, 10000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                        com.vk.core.performance.device.a.a(c24Var3);
                        L.e("PerformanceClassResolver", "Already reported scores, resolved devicePerformanceInfo");
                        Long l3 = l2;
                        if (l3 != null) {
                            if (System.currentTimeMillis() - sharedPreferences2.getLong("last_scores_report_time", 0L) > TimeUnit.DAYS.toMillis(l3.longValue())) {
                                L.e("PerformanceClassResolver", "Time to reevaluate scores, clearing score info");
                                String[] strArr = {"scores_reported", "scores_count", "last_scores_report_time", "last_score_resolution_time", "disk_score", "flop_score", "memory_new_score"};
                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                for (int i2 = 0; i2 < 7; i2++) {
                                    edit.remove(strArr[i2]);
                                }
                                edit.apply();
                            }
                        }
                    }
                });
            }
        });
        return s3q0.a;
    }
}
