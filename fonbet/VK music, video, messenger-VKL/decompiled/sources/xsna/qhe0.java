package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.features.NotificationFeatures;
import com.vkontakte.android.VKApplication;
import java.io.File;

/* compiled from: PushExperimentsPrepareTaskLogic.kt */
/* loaded from: classes11.dex */
public final class qhe0 extends ParallelTaskRunner.d {
    public final bpn0 c;
    public final String d;

    public qhe0(VKApplication vKApplication) {
        super(vKApplication);
        this.c = new bpn0(new m15(vKApplication, 11));
        this.d = "PushExperimentsPrepare";
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return this.d;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        the0 the0Var = (the0) this.c.getValue();
        the0Var.getClass();
        the0.a(new rhe0(0, NotificationFeatures.NOTIFICATION_PUSH_RECEIVING_POST, NotificationFeatures.class, "hasFeatureEnabled", "hasFeatureEnabled()Z", 0), (File) the0Var.b.getValue());
        the0.a(new she0(0, NotificationFeatures.NOTIFICATION_PUSH_PIPELINE_ANALYTIC, NotificationFeatures.class, "hasFeatureEnabled", "hasFeatureEnabled()Z", 0), (File) the0Var.c.getValue());
        return s3q0.a;
    }
}
