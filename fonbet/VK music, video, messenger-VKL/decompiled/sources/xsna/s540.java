package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.q810;

/* compiled from: MultiPickerMarketActionItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class s540 extends vfz<v540> {
    public final izs<b910, s3q0> l;
    public final VkImage m;
    public final VkText n;
    public final VkText o;
    public final VkButton p;

    /* JADX WARN: Multi-variable type inference failed */
    public s540(ViewGroup viewGroup, izs<? super b910, s3q0> izsVar) {
        super(R.layout.products_multipicker_item_create_good, viewGroup);
        this.l = izsVar;
        this.m = (VkImage) this.itemView.findViewById(R.id.product_multipicker_placeholder_image);
        this.n = (VkText) this.itemView.findViewById(R.id.product_multipicker_placeholder_title);
        this.o = (VkText) this.itemView.findViewById(R.id.product_multipicker_placeholder_subtitle);
        this.p = (VkButton) this.itemView.findViewById(R.id.product_multipicker_placeholder_action);
    }

    @Override // xsna.vfz
    public final void W5(v540 v540Var) {
        int i;
        int i2;
        Integer num;
        v540 v540Var2 = v540Var;
        this.m.setImageResource(R.drawable.vk_icon_illustration_market_product_views_120h);
        q810 q810Var = v540Var2.b;
        boolean z = q810Var instanceof q810.c;
        if (z) {
            i = R.string.attach_multipicker_create_good_title;
        } else if (q810Var instanceof q810.a) {
            i = R.string.attach_multipicker_enable_market_title;
        } else {
            if (!(q810Var instanceof q810.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.attach_multipicker_market_disabled_title;
        }
        this.n.setText(this.itemView.getContext().getString(i));
        if (z) {
            i2 = R.string.attach_multipicker_create_good_subtitle;
        } else if (q810Var instanceof q810.a) {
            i2 = R.string.attach_multipicker_enable_market_subtitle;
        } else {
            if (!(q810Var instanceof q810.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.attach_multipicker_market_disabled_subtitle;
        }
        this.o.setText(this.itemView.getContext().getString(i2));
        if (z) {
            num = Integer.valueOf(R.string.attach_multipicker_create_good_action);
        } else if (q810Var instanceof q810.a) {
            num = Integer.valueOf(R.string.attach_multipicker_enable_market_action);
        } else {
            if (!(q810Var instanceof q810.b)) {
                throw new NoWhenBranchMatchedException();
            }
            num = null;
        }
        String string = num != null ? this.itemView.getContext().getString(num.intValue()) : null;
        VkButton vkButton = this.p;
        vkButton.setText(string);
        vkButton.setVisibility(string != null ? 0 : 8);
        vkButton.setOnClickListener(new eju(2, v540Var2, this));
    }
}
