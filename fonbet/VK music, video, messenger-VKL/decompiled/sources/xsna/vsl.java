package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: DelayedJobsInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class vsl extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "initDelayedJobs";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        uh uhVar = uh.b;
        xsl xslVar = new xsl(this.b);
        synchronized (uhVar) {
            uh.c = xslVar;
        }
        return s3q0.a;
    }
}
