package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;

/* compiled from: CommunityOnboardingBannerItem.kt */
/* loaded from: classes5.dex */
public final class pbh extends we6 {
    public final ozf g;
    public final v43 h;
    public final VkOnboardingStat$Delegate i;
    public final nbh j;
    public final int k = -245;

    /* compiled from: CommunityOnboardingBannerItem.kt */
    public static final class a extends vif0<pbh> {
        public final gzs<s3q0> n;
        public final gzs<s3q0> o;
        public final VkOnboardingStat$Delegate p;
        public final wh50<pbh> q;

        public a(ComposeView composeView, ozf ozfVar, v43 v43Var, VkOnboardingStat$Delegate vkOnboardingStat$Delegate) {
            super(composeView);
            this.n = ozfVar;
            this.o = v43Var;
            this.p = vkOnboardingStat$Delegate;
            this.q = androidx.compose.runtime.k.b(null);
            composeView.setContent(new jai(1651717310, new ht7(this, 2), true));
        }

        @Override // xsna.vif0
        public final void i6(pbh pbhVar) {
            ((zak0) this.q).setValue(pbhVar);
        }
    }

    public pbh(wbh wbhVar, ozf ozfVar, v43 v43Var, VkOnboardingStat$Delegate vkOnboardingStat$Delegate) {
        this.g = ozfVar;
        this.h = v43Var;
        this.i = vkOnboardingStat$Delegate;
        this.j = new nbh(wbhVar.b, wbhVar.c, wbhVar.d);
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setTag("community_onboarding_banner_block");
        return new a(composeView, this.g, this.h, this.i);
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }
}
