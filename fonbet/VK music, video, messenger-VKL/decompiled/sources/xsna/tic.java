package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.features.CoreFeatures;

/* compiled from: ClearZeroSharedPrefTask.kt */
/* loaded from: classes11.dex */
public final class tic extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "ClearZeroSharedPrefTask";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        CoreFeatures coreFeatures = CoreFeatures.ZERO_PREF_CLEANER;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            asu0.a.getClass();
            asu0.o().execute(new nu4(this, 3));
        }
        return s3q0.a;
    }
}
