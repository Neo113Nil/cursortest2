package xsna;

import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: AudienceResearchTask.kt */
/* loaded from: classes11.dex */
public final class ta4 extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "AudienceResearchTask";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        ((AudienceResearchComponent) c().a(fpf0.a(AudienceResearchComponent.class))).b().e();
        return s3q0.a;
    }
}
