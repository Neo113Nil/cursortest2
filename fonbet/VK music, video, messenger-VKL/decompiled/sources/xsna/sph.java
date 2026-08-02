package xsna;

import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import xsna.e8v0;
import xsna.xrh;

/* compiled from: CommunityProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class sph implements o3h {
    public final xrh a;
    public final /* synthetic */ xrh b;
    public final /* synthetic */ mph c;

    public sph(xrh xrhVar, mph mphVar) {
        this.b = xrhVar;
        this.c = mphVar;
        this.a = xrhVar;
    }

    @Override // xsna.o3h
    public final xrh a() {
        return this.a;
    }

    @Override // xsna.o3h
    public final void v() {
        this.c.l.invoke(new CommunityProfileAction.e.g.b(null));
    }

    @Override // xsna.o3h
    public final void w(e8v0.g gVar) {
        this.c.l.invoke(new CommunityProfileAction.e.g.a(gVar));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o3h
    public final VkOnboardingStat$Delegate x() {
        xrh xrhVar = this.b;
        if (!(xrhVar instanceof xrh.c.a)) {
            return null;
        }
        VkOnboardingComponent vkOnboardingComponent = (VkOnboardingComponent) this.c.b.p0.getValue();
        VkOnboardingStat$Type vkOnboardingStat$Type = VkOnboardingStat$Type.Banner;
        String str = ((xrh.c.a) xrhVar).b.b;
        VkOnboardingComponent.Companion companion = VkOnboardingComponent.Companion;
        return vkOnboardingComponent.ac(vkOnboardingStat$Type, str);
    }
}
