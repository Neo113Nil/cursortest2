package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.features.CoreFeatures;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.dmx0;

/* compiled from: WhitelistTrackerInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class imx0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "WhitelistTrackerInit";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        CoreFeatures coreFeatures = CoreFeatures.WHITELIST_TRACKER;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            hmx0 b = com.vk.toggle.d.s0.b();
            if (b == null) {
                hmx0.i.getClass();
                b = hmx0.j;
            }
            List<String> list = b.b;
            long j = b.d;
            long j2 = b.e;
            long j3 = b.c;
            int i = b.f;
            int size = list.size();
            if (i > size) {
                i = size;
            }
            if (i < 1) {
                i = 1;
            }
            jmx0 jmx0Var = new jmx0(list, j, j2, j3, i, b.g, b.h);
            dzc0 dzc0Var = new dzc0(Preference.f("whitelist_tracker"), jmx0Var.a());
            dmx0.a.getClass();
            AtomicBoolean atomicBoolean = dmx0.i;
            if (!atomicBoolean.get()) {
                dmx0.b = new dmx0.a(dzc0Var, new llc(jmx0Var.c(), jmx0Var.b()), jmx0Var);
                dmx0.e.a = (int) jmx0Var.d();
                AtomicBoolean atomicBoolean2 = dmx0.h;
                if (atomicBoolean2.get() && atomicBoolean.get() && atomicBoolean2.compareAndSet(true, false)) {
                    g840 g840Var = dmx0.d;
                    if (g840Var != null) {
                        g840Var.a();
                    }
                    dmx0.d = null;
                    ((php0) dmx0.c.getValue()).d();
                }
                atomicBoolean.set(true);
            }
        }
        return s3q0.a;
    }
}
