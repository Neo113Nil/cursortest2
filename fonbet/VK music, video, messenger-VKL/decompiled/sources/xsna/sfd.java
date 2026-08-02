package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ClipVkTicketAttachesLargeViewHolder.kt */
/* loaded from: classes18.dex */
public final class sfd extends vfz<trv0> {
    public final tb l;
    public final VkPicture m;
    public final VkText n;
    public final VkText o;
    public final VkButton p;
    public urv0 q;
    public GradientDrawable r;

    public sfd(com.vk.movika.sdk.base.observable.q qVar, tb tbVar, ViewGroup viewGroup) {
        super(R.layout.market_clip_attach_large, viewGroup);
        this.l = tbVar;
        this.m = (VkPicture) this.itemView.findViewById(R.id.iv_main_image);
        this.n = (VkText) this.itemView.findViewById(R.id.market_clip_attach_title);
        this.o = (VkText) this.itemView.findViewById(R.id.market_clip_attach_description);
        this.p = (VkButton) this.itemView.findViewById(R.id.market_clip_attach_button);
        f4m.C(iah0.a(250), this.itemView);
        this.itemView.setOnClickListener(new jkc(1, this, qVar));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(trv0 trv0Var) {
        urv0 urv0Var = trv0Var.c;
        this.q = urv0Var;
        this.l.invoke(Integer.valueOf(getBindingAdapterPosition()));
        if (getBindingAdapterPosition() == 0) {
            f4m.s(iah0.a(urv0Var.d), this.itemView);
        }
        View view = this.itemView;
        boolean z = urv0Var.e;
        GradientDrawable gradientDrawable = this.r;
        if (gradientDrawable == null) {
            int f = z ? l8g.f(0.7f, e3m.f(R.attr.vk_ui_background_contrast_themed, view.getContext())) : e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, view.getContext());
            gradientDrawable = ful0.a(0);
            gradientDrawable.setCornerRadius(iah0.a(12));
            gradientDrawable.setColor(f);
            this.r = gradientDrawable;
        }
        view.setBackground(gradientDrawable);
        VkPicture vkPicture = this.m;
        vkPicture.setVisibility(0);
        baf0 f2 = krv0.f(R.drawable.vk_icon_ticket_outline_28, R.attr.vk_ui_icon_tertiary, this.itemView.getContext());
        String str = urv0Var.c;
        if (str != null) {
            iwt0.a(vkPicture, new yw5(str, this, f2, 2));
        } else {
            vkPicture.setContent(new c.b(new eko(f2)));
        }
        this.n.setText(urv0Var.a);
        this.o.setText(urv0Var.b);
        this.p.setText(this.itemView.getContext().getString(R.string.product_clip_attach_vk_ticket_action));
    }
}
