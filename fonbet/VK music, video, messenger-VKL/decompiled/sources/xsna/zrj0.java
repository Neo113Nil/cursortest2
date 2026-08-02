package xsna;

import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import xsna.e8v0;

/* compiled from: Effects.kt */
/* loaded from: classes4.dex */
public final class zrj0 implements kgn {
    public final /* synthetic */ wh50 a;
    public final /* synthetic */ com.vk.newsfeed.impl.items.posting.item.modals.d b;

    public zrj0(wh50 wh50Var, com.vk.newsfeed.impl.items.posting.item.modals.d dVar) {
        this.a = wh50Var;
        this.b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kgn
    public final void dispose() {
        q7v0 q7v0Var;
        VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.a.getValue();
        if (vkOnboardingCampaign == null || (q7v0Var = (q7v0) this.b.g.getValue()) == null) {
            return;
        }
        q7v0Var.a(vkOnboardingCampaign, VkOnboardingType.Highlighter, e8v0.m.b);
    }
}
