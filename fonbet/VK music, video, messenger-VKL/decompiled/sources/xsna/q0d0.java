package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: PreloadAccountTaskLogic.kt */
/* loaded from: classes11.dex */
public final class q0d0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "PreloadAccount";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        q6r0.g();
        asu0.a.getClass();
        asu0.n().execute(new dte0(1));
        return s3q0.a;
    }
}
