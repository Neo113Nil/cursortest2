package xsna;

import android.app.Activity;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import xsna.gw90;

/* compiled from: ProductScoreInitTask.kt */
/* loaded from: classes11.dex */
public final class xrd0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "ProductScoreInitTask";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        zrd0.g = new urd0();
        ow90.i.add(new vrd0());
        gw90.a aVar = new gw90.a(0);
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b != null) {
            zrd0 zrd0Var = zrd0.a;
            zrd0.c(b, aVar);
        } else {
            c63.a(new wrd0(aVar));
        }
        return s3q0.a;
    }
}
