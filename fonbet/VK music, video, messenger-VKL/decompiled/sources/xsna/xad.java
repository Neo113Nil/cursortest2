package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.ecomm.design.view.tile.b;
import com.vkontakte.android.R;

/* compiled from: ClipProductAttachesLargeViewHolder.kt */
/* loaded from: classes18.dex */
public final class xad extends vfz<qid0> {
    public final tb l;
    public final defpackage.i m;
    public final VkPicture n;
    public final VkImageSimple o;
    public final VkText p;
    public final VkText q;
    public final VkText r;
    public final VkContentBadge s;
    public final VkButton t;
    public vnd0 u;
    public GradientDrawable v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xad(com.vk.movika.sdk.base.observable.q qVar, tb tbVar, defpackage.i iVar, ViewGroup viewGroup, ac acVar) {
        super(R.layout.market_clip_attach_large, viewGroup);
        viewGroup.getContext();
        this.l = tbVar;
        this.m = iVar;
        getContext();
        this.n = (VkPicture) this.itemView.findViewById(R.id.iv_main_image);
        this.o = (VkImageSimple) this.itemView.findViewById(R.id.iv_moderation_icon);
        this.p = (VkText) this.itemView.findViewById(R.id.market_clip_attach_title);
        this.q = (VkText) this.itemView.findViewById(R.id.market_clip_attach_description);
        this.r = (VkText) this.itemView.findViewById(R.id.market_clip_attach_rating);
        this.s = (VkContentBadge) this.itemView.findViewById(R.id.market_clip_attach_badge);
        this.t = (VkButton) this.itemView.findViewById(R.id.market_clip_attach_button);
        new bpn0(new f5(this, 19));
        this.itemView.setOnClickListener(new wad(0, this, qVar));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(qid0 qid0Var) {
        vnd0 vnd0Var = qid0Var.c;
        this.u = vnd0Var;
        this.l.invoke(Integer.valueOf(getBindingAdapterPosition()));
        if (getBindingAdapterPosition() == 0) {
            f4m.s(iah0.a(vnd0Var.j), this.itemView);
        }
        View view = this.itemView;
        boolean z = vnd0Var.h;
        ProductVideoAttach.StatusType statusType = vnd0Var.b;
        GradientDrawable gradientDrawable = this.v;
        if (gradientDrawable == null) {
            int f = z ? l8g.f(0.7f, e3m.f(R.attr.vk_ui_background_contrast_themed, view.getContext())) : e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, view.getContext());
            gradientDrawable = ful0.a(0);
            gradientDrawable.setCornerRadius(iah0.a(12));
            gradientDrawable.setColor(f);
            this.v = gradientDrawable;
        }
        view.setBackground(gradientDrawable);
        VkButton vkButton = this.t;
        if (vkButton != null) {
            vkButton.setText(vnd0Var.g ? this.itemView.getContext().getString(R.string.product_clip_attach_action_service) : this.itemView.getContext().getString(R.string.product_clip_attach_action));
        }
        ProductVideoAttach.StatusType statusType2 = ProductVideoAttach.StatusType.Adult;
        boolean z2 = statusType == statusType2;
        awt0.u(this.n, true);
        Context context = this.itemView.getContext();
        Image image = vnd0Var.c;
        b.a aVar = new b.a(context, this.n, this.o, image == null ? null : image, vnd0Var.f, Integer.valueOf(R.drawable.vk_icon_market_outline_28), false);
        if (z2) {
            com.vk.ecomm.design.view.tile.b.b(aVar);
        } else {
            com.vk.ecomm.design.view.tile.b.a(aVar);
        }
        this.p.setText(vnd0Var.d);
        this.q.setText(vnd0Var.f);
        ProductVideoAttach.a aVar2 = vnd0Var.e;
        VkContentBadge vkContentBadge = this.s;
        if (aVar2 != null) {
            vkContentBadge.setText(this.itemView.getContext().getString(R.string.ecomm_design_product_discount_temp, Integer.valueOf(Math.abs(aVar2.a))));
            vkContentBadge.setAppearance(new VkContentBadge.Appearance.a(new b8g(e3m.f(R.attr.vk_ui_text_primary_invariably, this.itemView.getContext())), new b8g(e3m.f(R.attr.vk_ui_background_contrast, this.itemView.getContext())), null, 12));
            vkContentBadge.setVisibility(0);
        } else {
            f4m.j(vkContentBadge);
        }
        String str = vnd0Var.i;
        VkText vkText = this.r;
        if (statusType == statusType2) {
            vkText.setVisibility(8);
            vkText.setText((CharSequence) null);
        } else {
            vkText.setVisibility((str == null || str.length() == 0) ? 8 : 0);
            vkText.setText(str);
        }
        Object obj = this.m.c;
    }
}
