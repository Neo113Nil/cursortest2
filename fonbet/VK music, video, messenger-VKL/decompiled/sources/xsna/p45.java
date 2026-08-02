package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import com.vk.metrics.performance.appstart.IdleStateHandler;
import com.vk.superapp.api.exceptions.AuthException;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p45 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p45(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return AuthResult.a((AuthResult) obj, null, ((AuthException.NeedCheckSilentTokenException) ((Throwable) this.c)).g().Ab(), null, null, 0L, null, null, 8388543);
            default:
                ParallelTaskRunner parallelTaskRunner = (ParallelTaskRunner) this.c;
                int i = ParallelTaskRunner.g.$EnumSwitchMapping$0[((IdleStateHandler.AppStartListener.StartType) obj).ordinal()];
                if (i == 1) {
                    File file = (File) parallelTaskRunner.e.invoke();
                    if (file != null) {
                        File file2 = new File(file, "used_toggles_dump.json");
                        asu0.a.getClass();
                        o1p0.a(file2, asu0.n());
                    }
                    parallelTaskRunner.g(parallelTaskRunner.i, RunStep.AfterColdStart, false, new dp(parallelTaskRunner, 2));
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
        }
    }
}
