package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;

/* compiled from: ThreadsSubstitutionTaskLogic.kt */
/* loaded from: classes11.dex */
public final class uro0 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "substitution-threads-install";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke() {
        boolean z;
        String g0;
        l0n0.f = new bbq();
        CoreFeatures coreFeatures = CoreFeatures.SUBSTITUTE_THREADS;
        coreFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (!bVar.a(coreFeatures)) {
            CoreFeatures coreFeatures2 = CoreFeatures.SUBSTITUTE_POOLS;
            coreFeatures2.getClass();
            if (!bVar.a(coreFeatures2)) {
                z = false;
                b.d j = bVar.j(coreFeatures.getKey(), false);
                String obj = j == null ? j.c.toString() : null;
                b.d i = bVar.i(CoreFeatures.SUBSTITUTE_POOLS);
                g0 = j5g.g0(rl3.I(new String[]{obj, i != null ? i.c.toString() : null}), StringUtils.COMMA, null, null, 0, null, 62);
                File file = new File(i5s.a(new StringBuilder(), this.b.getApplicationInfo().dataDir, "/threads_substitution"));
                if (z || g0 == null) {
                    g0 = "";
                }
                nbr.w(file, g0, emb.b);
                return s3q0.a;
            }
        }
        z = true;
        b.d j2 = bVar.j(coreFeatures.getKey(), false);
        if (j2 == null) {
        }
        b.d i2 = bVar.i(CoreFeatures.SUBSTITUTE_POOLS);
        g0 = j5g.g0(rl3.I(new String[]{obj, i2 != null ? i2.c.toString() : null}), StringUtils.COMMA, null, null, 0, null, 62);
        File file2 = new File(i5s.a(new StringBuilder(), this.b.getApplicationInfo().dataDir, "/threads_substitution"));
        if (z) {
        }
        g0 = "";
        nbr.w(file2, g0, emb.b);
        return s3q0.a;
    }
}
