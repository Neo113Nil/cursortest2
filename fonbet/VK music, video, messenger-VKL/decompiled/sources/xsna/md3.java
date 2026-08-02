package xsna;

import android.os.Bundle;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import xsna.rhp0;

/* compiled from: ApplyDevicePerformanceInfoToTrackerTaskLogic.kt */
/* loaded from: classes11.dex */
public final class md3 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "ApplyDevicePerformanceInfoToTracker";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Bundle bundle;
        DevicePerformanceInfo a = DevicePerformanceInfo.a.a();
        if (a != null) {
            Bundle bundle2 = rhp0.b;
            bundle = rhp0.a.a(cqm0.m(a.a.name()), cqm0.m(a.b.name()), cqm0.m(a.e.name()), cqm0.m(a.d.name()));
        } else {
            bundle = rhp0.c;
        }
        com.vk.metrics.eventtracking.b.a.f(bundle);
        return s3q0.a;
    }
}
