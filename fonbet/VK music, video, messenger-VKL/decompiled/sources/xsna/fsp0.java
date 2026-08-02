package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.features.VkcFeatures;

/* compiled from: TrustedHashRefreshTaskLogic.kt */
/* loaded from: classes11.dex */
public final class fsp0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "TrustedHashRefresh";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        VkcFeatures vkcFeatures = VkcFeatures.REFRESH_TRUSTED_HASHES;
        vkcFeatures.getClass();
        if (com.vk.toggle.b.A.a(vkcFeatures)) {
            gsp0 gsp0Var = new gsp0(this.b);
            gsp0Var.c();
            asu0.a.getClass();
            asu0.n().execute(new jgl0(gsp0Var, 1));
        }
        return s3q0.a;
    }
}
