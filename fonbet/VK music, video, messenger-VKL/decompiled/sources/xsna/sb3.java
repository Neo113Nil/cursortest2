package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import com.vk.toggle.anonymous.SakFeatures;
import xsna.gx8;

/* compiled from: AppUtils.kt */
/* loaded from: classes11.dex */
public final class sb3 implements gx8.a {
    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.SYSTEM;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        SakFeatures.b.getClass();
        if (!p1p0.a(SakFeatures.c.i(SakFeatures.Type.FEATURE_CORE_STAT_FLUSH_ON_CLEAR))) {
            qsk0.a.b();
            return;
        }
        fsk0 fsk0Var = qsk0.a;
        fsk0Var.getClass();
        fsk0Var.e(new jx40(fsk0Var));
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "VKNavigationStatCache";
    }

    @Override // xsna.gx8.a
    public final long u() {
        return 0L;
    }
}
