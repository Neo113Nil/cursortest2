package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.features.CoreFeatures;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.dmx0;

/* compiled from: WhitelistTrackerStartTaskLogic.kt */
/* loaded from: classes11.dex */
public final class lmx0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "WhitelistTrackerStart";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        CoreFeatures coreFeatures = CoreFeatures.WHITELIST_TRACKER;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            AtomicBoolean atomicBoolean = dmx0.i;
            if (atomicBoolean.get()) {
                dmx0.g.add(new kmx0(this));
                if (atomicBoolean.get() && dmx0.h.compareAndSet(false, true)) {
                    dmx0.a aVar = dmx0.b;
                    if (aVar == null) {
                        aVar = null;
                    }
                    dmx0 dmx0Var = dmx0.a;
                    g840 a = aVar.a(new j37(dmx0Var, 11), new dlh(dmx0Var), new gmx0(dmx0Var));
                    dmx0.d = a;
                    dmx0Var.getClass();
                    ((php0) dmx0.c.getValue()).b(a, 0L);
                }
            }
        }
        return s3q0.a;
    }
}
