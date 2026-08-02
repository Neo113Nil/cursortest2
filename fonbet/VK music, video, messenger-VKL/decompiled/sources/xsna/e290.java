package xsna;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;

/* compiled from: OverlayBannerFullscreenHolder.kt */
/* loaded from: classes7.dex */
public final class e290 {
    public static final float u = 20.0f / (((float) Math.sqrt(178.0f)) * 2.0f);
    public final ViewGroup a;
    public final boolean b;
    public final q6s0 c;
    public View d;
    public g290 e;
    public zu50 f;
    public smk0 g;
    public ObjectAnimator h;
    public VkCard i;
    public ConstraintLayout j;
    public VkImage k;
    public VkText l;
    public VkText m;
    public ConstraintLayout n;
    public VkButton o;
    public VkText p;
    public VkContentBadge q;
    public Guideline r;
    public VkImageSimple s;
    public VkContentBadge t;

    /* compiled from: OverlayBannerFullscreenHolder.kt */
    public final class a implements lv50 {
        public final IconAdView b;
        public final MediaAdView c;

        public a() {
            VkCard vkCard = e290.this.i;
            this.b = new IconAdView((vkCard == null ? null : vkCard).getContext(), null);
            VkCard vkCard2 = e290.this.i;
            this.c = new MediaAdView((vkCard2 != null ? vkCard2 : null).getContext());
        }

        @Override // xsna.lv50
        public final View c() {
            VkText vkText = e290.this.p;
            if (vkText == null) {
                return null;
            }
            return vkText;
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            VkCard vkCard = e290.this.i;
            if (vkCard == null) {
                return null;
            }
            return vkCard;
        }

        @Override // xsna.lv50
        public final View e() {
            return null;
        }

        @Override // xsna.lv50
        public final View f() {
            VkImageSimple vkImageSimple = e290.this.s;
            if (vkImageSimple == null) {
                return null;
            }
            return vkImageSimple;
        }

        @Override // xsna.lv50
        public final View g() {
            VkButton vkButton = e290.this.o;
            if (vkButton == null) {
                return null;
            }
            return vkButton;
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            VkText vkText = e290.this.m;
            if (vkText == null) {
                return null;
            }
            return vkText;
        }

        @Override // xsna.lv50
        public final IconAdView getIconView() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            VkText vkText = e290.this.l;
            if (vkText == null) {
                return null;
            }
            return vkText;
        }

        @Override // xsna.lv50
        public final View h() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View i() {
            VkText vkText = e290.this.l;
            if (vkText == null) {
                return null;
            }
            return vkText;
        }

        @Override // xsna.lv50
        public final s4e0 j0() {
            return null;
        }

        @Override // xsna.lv50
        public final MediaAdView o() {
            return this.c;
        }
    }

    public e290(FrameLayout frameLayout, boolean z, q6s0 q6s0Var) {
        this.a = frameLayout;
        this.b = z;
        this.c = q6s0Var;
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        smk0 smk0Var = this.g;
        if (smk0Var != null) {
            smk0Var.d();
        }
        View view = this.d;
        if (view != null) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        View view2 = this.d;
        if (view2 != null) {
            view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        View view3 = this.d;
        if (view3 != null) {
            view3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.a.removeView(this.d);
        this.d = null;
    }
}
