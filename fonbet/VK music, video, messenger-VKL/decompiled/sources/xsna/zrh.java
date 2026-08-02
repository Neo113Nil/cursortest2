package xsna;

import android.view.ViewGroup;
import com.vk.core.tool.view.onboarding.VkOnboardingBanner;
import com.vkontakte.android.R;
import xsna.g7v0;
import xsna.xrh;

/* compiled from: CommunityProfileOnboardingItem.kt */
/* loaded from: classes5.dex */
public final class zrh extends we6 {
    public final ash g;
    public final z3h h;
    public final a4h i;
    public final int j = -231;

    /* compiled from: CommunityProfileOnboardingItem.kt */
    public static final class a extends vif0<zrh> {
        public final VkOnboardingBanner n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup, xrh.b bVar) {
            super(r0);
            VkOnboardingBanner vkOnboardingBanner = new VkOnboardingBanner(viewGroup.getContext(), null, 6);
            vkOnboardingBanner.setClipToPadding(false);
            int i = 12;
            float f = 12;
            awt0.x(vkOnboardingBanner, iah0.a(f), iah0.a(f), iah0.a(f), 0, 8);
            VkOnboardingBanner vkOnboardingBanner2 = (VkOnboardingBanner) this.itemView;
            this.n = vkOnboardingBanner2;
            vkOnboardingBanner2.setGraffiti(g7v0.b.b);
            if (bVar instanceof xrh.b.a) {
                f4m.y(e3m.a(R.dimen.vk_ui_spacing_size2_xl, this.itemView.getContext()), vkOnboardingBanner2);
                i = 16;
            }
            vkOnboardingBanner2.setBannerBottomPaddingDp(i);
            vkOnboardingBanner2.setOnClick(new akh(this, 1));
            vkOnboardingBanner2.setOnButtonClick(new px0(this, 28));
            vkOnboardingBanner2.setOnDismiss(new mag(this, 6));
        }

        @Override // xsna.vif0
        public final void i6(zrh zrhVar) {
            ash ashVar = zrhVar.g;
            String c = ashVar.b.c();
            VkOnboardingBanner vkOnboardingBanner = this.n;
            vkOnboardingBanner.setTitle(c);
            vkOnboardingBanner.setButtonText(ashVar.b.b());
        }
    }

    public zrh(ash ashVar, z3h z3hVar, a4h a4hVar) {
        this.g = ashVar;
        this.h = z3hVar;
        this.i = a4hVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup, this.g.b);
    }

    @Override // xsna.we6
    public final int h() {
        return this.j;
    }
}
