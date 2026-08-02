package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import java.util.Collections;

/* compiled from: AdOverlayBannerDelegate.kt */
/* loaded from: classes2.dex */
public final class tg0 extends p1u0<AboutVideoItem.q> {
    public final c4 a;
    public final egs0 b;

    /* compiled from: AdOverlayBannerDelegate.kt */
    public final class a extends qf6 {
        public final c4 l;
        public final ConstraintLayout m;
        public final VkText n;
        public final VkText o;
        public final VkText p;
        public final VkButton q;
        public final ConstraintLayout r;
        public final VkImage s;
        public final VkContentBadge t;
        public final VkContentBadge u;
        public final VkImageSimple v;
        public final Guideline w;
        public zu50 x;
        public final C3743a y;
        public AboutVideoItem.q z;

        /* compiled from: AdOverlayBannerDelegate.kt */
        /* renamed from: xsna.tg0$a$a, reason: collision with other inner class name */
        public final class C3743a implements lv50 {
            public final IconAdView b;
            public final MediaAdView c;

            public C3743a() {
                this.b = new IconAdView(a.this.itemView.getContext(), null);
                this.c = new MediaAdView(a.this.itemView.getContext());
            }

            @Override // xsna.lv50
            public final View c() {
                return a.this.p;
            }

            @Override // xsna.lv50
            public final ViewGroup d() {
                return a.this.m;
            }

            @Override // xsna.lv50
            public final View e() {
                return null;
            }

            @Override // xsna.lv50
            public final View f() {
                return a.this.v;
            }

            @Override // xsna.lv50
            public final View g() {
                return a.this.q;
            }

            @Override // xsna.lv50
            public final View getDescriptionView() {
                return a.this.o;
            }

            @Override // xsna.lv50
            public final IconAdView getIconView() {
                return this.b;
            }

            @Override // xsna.lv50
            public final View getTitleView() {
                return a.this.n;
            }

            @Override // xsna.lv50
            public final View h() {
                return this.b;
            }

            @Override // xsna.lv50
            public final View i() {
                return a.this.n;
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

        public a(ViewGroup viewGroup, c4 c4Var, egs0 egs0Var) {
            super(viewGroup, R.layout.ad_overlay_banner, egs0Var);
            this.l = c4Var;
            this.m = (ConstraintLayout) this.itemView.findViewById(R.id.root);
            this.n = (VkText) this.itemView.findViewById(R.id.title);
            this.o = (VkText) this.itemView.findViewById(R.id.subtitle);
            this.p = (VkText) this.itemView.findViewById(R.id.ad_label);
            this.q = (VkButton) this.itemView.findViewById(R.id.cta_button);
            this.r = (ConstraintLayout) this.itemView.findViewById(R.id.cta_and_label_container);
            VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.media_view);
            bwt0.d(vkImage, iah0.b(10.0f), (r4 & 2) != 0, (r4 & 4) != 0);
            this.s = vkImage;
            this.t = (VkContentBadge) this.itemView.findViewById(R.id.choices_button);
            this.u = (VkContentBadge) this.itemView.findViewById(R.id.close_button);
            this.v = (VkImageSimple) this.itemView.findViewById(R.id.disclaimer);
            this.w = (Guideline) this.itemView.findViewById(R.id.guideline_disclaimer);
            this.y = new C3743a();
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            AboutVideoItem.q qVar = (AboutVideoItem.q) hfzVar;
            if (qVar.equals(this.z)) {
                return;
            }
            this.z = qVar;
            Integer num = null;
            if (!(qVar instanceof AboutVideoItem.q.b)) {
                zu50 zu50Var = this.x;
                if (zu50Var != null) {
                    zu50Var.a();
                }
                this.z = null;
                bwt0.c0(0, this.itemView);
                return;
            }
            AboutVideoItem.q.b bVar = (AboutVideoItem.q.b) qVar;
            if (!bVar.f) {
                zu50 zu50Var2 = this.x;
                if (zu50Var2 != null) {
                    zu50Var2.a();
                }
                this.z = null;
                bwt0.c0(0, this.itemView);
                return;
            }
            zu50 zu50Var3 = bVar.c;
            this.x = zu50Var3;
            cw50 cw50Var = bVar.b;
            String str = cw50Var.g;
            VkText vkText = this.n;
            vkText.setText(str);
            this.o.setText(cw50Var.i);
            this.p.setText(j5g.g0(rl3.I(new String[]{cw50Var.o, cw50Var.l}), " ", null, null, 0, null, 62));
            kiw kiwVar = cw50Var.v;
            this.s.setImageBitmap(kiwVar != null ? kiwVar.a() : null);
            zu50Var3.r = 5;
            String str2 = cw50Var.h;
            VkButton vkButton = this.q;
            if (str2 != null) {
                vkButton.setText(str2);
                vkButton.setVisibility(0);
            } else {
                vkButton.setText("");
                vkButton.setVisibility(8);
            }
            l0n l0nVar = cw50Var.k;
            Integer valueOf = l0nVar != null ? Integer.valueOf(l0nVar.a) : null;
            float f = ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8) || ((valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 11))) ? 0.2f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Guideline guideline = this.w;
            ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
            ConstraintLayout.b bVar2 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar2 != null) {
                bVar2.c = 1.0f - f;
                guideline.setLayoutParams(bVar2);
            }
            if ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8)) {
                num = Integer.valueOf(R.drawable.vk_icon_illustration_disclaimer_medical_42h);
            } else if (valueOf != null && valueOf.intValue() == 11) {
                num = Integer.valueOf(R.drawable.vk_icon_illustration_disclaimer_credits_48h);
            } else if (valueOf != null && valueOf.intValue() == 9) {
                num = Integer.valueOf(R.drawable.vk_icon_illustration_disclaimer_bad_42h);
            }
            int i = num != null ? 0 : 8;
            VkImageSimple vkImageSimple = this.v;
            vkImageSimple.setVisibility(i);
            if (num != null) {
                vkImageSimple.setImageResource(num.intValue());
            }
            zu50Var3.h(this.y, Collections.singletonList(this.m));
            this.t.setOnClickListener(new rg0(bVar, 0));
            this.u.setOnClickListener(new sg0(this, 0));
            boolean z = num != null;
            vkText.setMaxLines(z ? 1 : 2);
            f4m.t(z ? iah0.a(8) : iah0.a(12), this.r);
            vkButton.setVisibility(z ? 8 : 0);
            qj80.a(vkText, new ug0(vkText, this, 0));
            bwt0.c0(-2, this.itemView);
            bVar.e.invoke();
        }

        @Override // xsna.vfz
        public final void a6() {
            zu50 zu50Var = this.x;
            if (zu50Var != null) {
                zu50Var.a();
            }
            this.z = null;
        }

        @Override // xsna.vfz
        public final void g6() {
            zu50 zu50Var = this.x;
            if (zu50Var != null) {
                zu50Var.a();
            }
            this.s.setImageDrawable(null);
            this.z = null;
        }
    }

    public tg0(c4 c4Var, egs0 egs0Var) {
        this.a = c4Var;
        this.b = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.q> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.q;
    }
}
