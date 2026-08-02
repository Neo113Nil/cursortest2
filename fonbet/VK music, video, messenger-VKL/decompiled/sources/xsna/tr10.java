package xsna;

import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: MediaLoadingInfoTaskLogic.kt */
/* loaded from: classes11.dex */
public final class tr10 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "MediaLoadingInfo";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        dk0 b;
        sr10 sr10Var = new sr10(new bpn0(new eu2(5, this)));
        dy2.a = sr10Var;
        if (com.vk.toggle.d.D() && (b = com.vk.toggle.d.X.b()) != null) {
            NetworkPerformanceMeasurer.a.getClass();
            NetworkPerformanceMeasurer.a(sr10Var);
            NetworkPerformanceMeasurer.p = new NetworkPerformanceMeasurer.b<>(b.a);
            NetworkPerformanceMeasurer.e = true;
        }
        return s3q0.a;
    }
}
