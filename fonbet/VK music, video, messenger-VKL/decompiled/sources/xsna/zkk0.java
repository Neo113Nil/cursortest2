package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: SplashUpscalerTaskLogic.kt */
/* loaded from: classes11.dex */
public final class zkk0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "SplashUpscaler";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (t5m.c() && gz80.a(31)) {
            this.b.registerActivityLifecycleCallbacks(new ykk0());
        }
        return s3q0.a;
    }
}
