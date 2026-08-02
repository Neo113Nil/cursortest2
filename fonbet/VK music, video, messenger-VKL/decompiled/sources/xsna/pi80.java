package xsna;

import android.content.Context;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.log.L;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import java.util.Collections;
import xsna.rlv0;

/* compiled from: OneEventInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class pi80 extends ParallelTaskRunner.a {
    public zzp d;

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "OneEvent";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        b.d i = com.vk.toggle.b.A.i(CoreFeatures.ONE_EVENT_TEST);
        if (i == null || !p1p0.a(i)) {
            L.e("OneEvent", "Disabled");
        } else {
            oi80 q = com.vk.toggle.d.q();
            String str = q.a;
            if (drm0.N(str)) {
                L.e("OneEvent", "No url");
            } else {
                int i2 = q.b;
                Context applicationContext = this.b.getApplicationContext();
                zzp zzpVar = this.d;
                m66 m66Var = new m66(this, 7);
                asu0.a.getClass();
                xlv0 s = hr80.s(rlv0.a.a(applicationContext, str, zzpVar, m66Var, asu0.x(), Collections.singletonList(new ywj(i2))));
                s.b();
                ulv0.b(s);
            }
        }
        return s3q0.a;
    }
}
