package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import java.util.concurrent.ExecutorService;

/* compiled from: StudilkaRemoteConfigUpdateTaskLogic.kt */
/* loaded from: classes11.dex */
public final class wsm0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "StudilkaRemoteConfigUpdate";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        asu0.a.getClass();
        ExecutorService q = asu0.q();
        vx2.a.getClass();
        q.execute(new vsm0(vx2.b));
        return s3q0.a;
    }
}
