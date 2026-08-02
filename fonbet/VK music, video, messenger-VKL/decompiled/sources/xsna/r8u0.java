package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import xsna.gx8;

/* compiled from: VkAnimationLoaderContainer.kt */
/* loaded from: classes7.dex */
public final class r8u0 implements gx8.a {
    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.SYSTEM;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        bpn0 bpn0Var = c7r0.a;
        c7r0.a();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "VKAnimationLoader";
    }

    @Override // xsna.gx8.a
    public final long u() {
        return 0L;
    }
}
