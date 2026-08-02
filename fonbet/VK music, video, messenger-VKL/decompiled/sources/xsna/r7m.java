package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vkontakte.android.VKApplication;

/* compiled from: DiExperimentsPrepareTaskLogic.kt */
/* loaded from: classes11.dex */
public final class r7m extends ParallelTaskRunner.d {
    public final t7m c;
    public final String d;

    public r7m(VKApplication vKApplication) {
        super(vKApplication);
        this.c = new t7m(vKApplication);
        this.d = "DiExperimentsPrepare";
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return this.d;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.c.getClass();
        return s3q0.a;
    }
}
