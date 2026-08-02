package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;

/* compiled from: RxJavaDebugInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class iug0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "RxJavaDebugInitializer";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (BuildInfo.h()) {
            oug0 oug0Var = oug0.a;
            oug0Var.getClass();
            io.reactivex.rxjava3.plugins.a.a = new uk40(new wv2(oug0Var, 9), 13);
        }
        return s3q0.a;
    }
}
