package xsna;

import android.app.Application;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import kotlin.collections.EmptyList;

/* compiled from: VKIDAppStartBeforeTaskLogic.kt */
/* loaded from: classes11.dex */
public final class ybr0 extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "VKIDAppStartBefore";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        r55 r55Var = r55.a;
        c2r0 j = r55.j();
        k2q d = r55.d();
        bpn0 bpn0Var = new bpn0(new yg9(this, 9));
        Application application = this.b;
        ver0.a(((yui) j).c(application, false).q(asu0.a.c()).o(EmptyList.b).l(new jzc0(new izc0(new zbr0(application, j, d, bpn0Var), 2), 1)).subscribe());
        return s3q0.a;
    }
}
