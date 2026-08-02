package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: ImRemoteConfigInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class nbw extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "ImRemoteConfig";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        mbw.a.getClass();
        mbw.c.d();
        if (o25.a().b()) {
            mbw.c().getAll();
        }
        o25.a().b0(new lbw());
        return s3q0.a;
    }
}
