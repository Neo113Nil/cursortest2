package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vk.ecomm.design.view.productattaches.large.SnippetLiveStatus;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipSnippetAttachesLargeViewHolder.kt */
/* loaded from: classes18.dex */
public final class pcd extends vfz<sbk0> {
    public final tb l;
    public final VkPicture m;
    public final VkImageSimple n;
    public final VkContentBadge o;
    public final VkText p;
    public final VkText q;
    public final VkButton r;
    public k20 s;
    public GradientDrawable t;

    /* compiled from: ClipSnippetAttachesLargeViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnippetLiveStatus.values().length];
            try {
                iArr[SnippetLiveStatus.LIVE_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnippetLiveStatus.LIVE_UPCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnippetLiveStatus.LIVE_FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pcd(com.vk.movika.sdk.base.observable.q qVar, tb tbVar, ViewGroup viewGroup) {
        super(R.layout.market_clip_attach_large, viewGroup);
        this.l = tbVar;
        this.m = (VkPicture) this.itemView.findViewById(R.id.iv_main_image);
        this.n = (VkImageSimple) this.itemView.findViewById(R.id.iv_moderation_icon);
        this.o = (VkContentBadge) this.itemView.findViewById(R.id.market_clip_attach_live_badge);
        VkText vkText = (VkText) this.itemView.findViewById(R.id.market_clip_attach_title);
        this.p = vkText;
        this.q = (VkText) this.itemView.findViewById(R.id.market_clip_attach_description);
        this.r = (VkButton) this.itemView.findViewById(R.id.market_clip_attach_button);
        this.itemView.setOnClickListener(new l37(1, this, qVar));
        vkText.setMaxLines(2);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(sbk0 sbk0Var) {
        VkButton vkButton;
        k20 k20Var = sbk0Var.c;
        this.s = k20Var;
        this.l.invoke(Integer.valueOf(getBindingAdapterPosition()));
        if (getBindingAdapterPosition() == 0) {
            f4m.s(iah0.a(k20Var.f), this.itemView);
        }
        View view = this.itemView;
        boolean z = k20Var.g;
        String str = k20Var.e;
        GradientDrawable gradientDrawable = this.t;
        if (gradientDrawable == null) {
            int f = z ? l8g.f(0.7f, e3m.f(R.attr.vk_ui_background_contrast_themed, view.getContext())) : e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, view.getContext());
            gradientDrawable = ful0.a(0);
            gradientDrawable.setCornerRadius(iah0.a(12));
            gradientDrawable.setColor(f);
            this.t = gradientDrawable;
        }
        view.setBackground(gradientDrawable);
        float f2 = 28;
        int a2 = iah0.a(f2);
        VkImageSimple vkImageSimple = this.n;
        f4m.C(a2, vkImageSimple);
        f4m.k(iah0.a(f2), vkImageSimple);
        if (k20Var.h) {
            vkImageSimple.setImageDrawable(krv0.f(R.drawable.vk_icon_play_28, R.attr.vk_ui_icon_contrast, this.itemView.getContext()));
            vkImageSimple.setVisibility(0);
        } else {
            f4m.j(vkImageSimple);
        }
        VkPicture vkPicture = this.m;
        vkPicture.setVisibility(0);
        iwt0.a(vkPicture, new hn0(4, k20Var, this));
        SnippetLiveStatus snippetLiveStatus = k20Var.i;
        int i = snippetLiveStatus == null ? -1 : a.$EnumSwitchMapping$0[snippetLiveStatus.ordinal()];
        VkContentBadge vkContentBadge = this.o;
        if (i != -1) {
            if (i == 1) {
                vkContentBadge.setText(R.string.snippet_live_badge_label);
                vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new b8g(e3m.f(R.attr.vk_ui_text_contrast, this.itemView.getContext())), new b8g(e3m.f(R.attr.vk_ui_accent_red, this.itemView.getContext())), null, 12));
                vkContentBadge.setVisibility(0);
            } else if (i == 2) {
                vkContentBadge.setText(R.string.snippet_live_badge_label);
                vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Overlay);
                vkContentBadge.setVisibility(0);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.p.setText(k20Var.b);
            f4m.j(this.q);
            vkButton = this.r;
            if (str != null || str.length() == 0) {
                f4m.C(iah0.a(250), this.itemView);
                f4m.j(vkButton);
            } else {
                f4m.C(iah0.a(286), this.itemView);
                vkButton.setVisibility(0);
                vkButton.setText(str);
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_play_20));
                return;
            }
        }
        f4m.j(vkContentBadge);
        this.p.setText(k20Var.b);
        f4m.j(this.q);
        vkButton = this.r;
        if (str != null) {
        }
        f4m.C(iah0.a(250), this.itemView);
        f4m.j(vkButton);
    }
}
