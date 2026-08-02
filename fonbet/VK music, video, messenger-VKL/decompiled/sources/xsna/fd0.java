package xsna;

import android.view.ViewGroup;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.view.onboarding.VkOnboardingBanner;
import xsna.g7v0;

/* compiled from: AdBloggerBannerInfoItem.kt */
/* loaded from: classes5.dex */
public final class fd0 extends we6 {
    public final ed0 g;
    public final u3h h;
    public final int i = -246;
    public int j = 6;

    public fd0(ed0 ed0Var, u3h u3hVar) {
        this.g = ed0Var;
        this.h = u3hVar;
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        VkOnboardingBanner vkOnboardingBanner = new VkOnboardingBanner(viewGroup.getContext(), null, 6);
        float f = 12;
        awt0.x(vkOnboardingBanner, iah0.a(f), iah0.a(f), iah0.a(f), 0, 8);
        vkOnboardingBanner.setGraffiti(g7v0.f.b);
        vkOnboardingBanner.setHighlighterMarkerType(VkOnboarding$HighlighterMarkerType.Type1);
        vkOnboardingBanner.setColor(VkOnboarding$TintColor.Lime);
        return new hd0(vkOnboardingBanner, this.h);
    }

    @Override // xsna.we6
    public final int b() {
        return this.j;
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }

    @Override // xsna.we6
    public final void i(int i) {
        this.j = i;
    }
}
