package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.vk.core.view.links.LinkedTextView;
import com.vkontakte.android.R;

/* compiled from: CommunityShopConditionsItem.kt */
/* loaded from: classes5.dex */
public final class c2i extends we6 {
    public final d2i g;
    public final me10 h;
    public final int i = -87;

    /* compiled from: CommunityShopConditionsItem.kt */
    public static final class a extends vif0<c2i> {
        public final me10 n;
        public final LinkedTextView o;

        public a(ViewGroup viewGroup, me10 me10Var) {
            super(viewGroup, R.layout.community_shop_conditions_item, 0);
            this.n = me10Var;
            LinkedTextView linkedTextView = (LinkedTextView) this.itemView.findViewById(R.id.community_shop_condtitions_title);
            this.o = linkedTextView;
            baf0 b = dhr0.t.b(R.drawable.vk_icon_help_outline_20, R.attr.vk_ui_icon_secondary);
            linkedTextView.setCompoundDrawablePadding(iah0.a(12));
            linkedTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
        }

        @Override // xsna.vif0
        public final void i6(c2i c2iVar) {
            String string = this.itemView.getContext().getString(R.string.community_payment_delivery_return);
            LinkedTextView linkedTextView = this.o;
            linkedTextView.setText(string);
            linkedTextView.setTextColor(e3m.f(R.attr.vk_ui_text_accent, this.itemView.getContext()));
            jjc.g(this.itemView, new ab(7, this, c2iVar));
        }
    }

    public c2i(d2i d2iVar, me10 me10Var) {
        this.g = d2iVar;
        this.h = me10Var;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup, this.h);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
