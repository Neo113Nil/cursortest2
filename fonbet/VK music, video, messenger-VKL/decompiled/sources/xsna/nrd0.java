package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.ecomm.market.good.GoodFragment;
import com.vkontakte.android.R;

/* compiled from: ProductPropertyVariantsHolder.kt */
/* loaded from: classes18.dex */
public final class nrd0 extends vif0<ird0> {
    public final GoodFragment n;
    public final VkFormField o;
    public final VkInputSelect p;
    public dw20 q;

    public nrd0(ViewGroup viewGroup, GoodFragment goodFragment) {
        super(viewGroup, R.layout.product_property_variants, 0);
        this.n = goodFragment;
        this.o = (VkFormField) this.itemView.findViewById(R.id.variants_form_fields);
        this.p = (VkInputSelect) this.itemView.findViewById(R.id.variants_input_select);
    }

    @Override // xsna.vif0
    public final void i6(ird0 ird0Var) {
        ird0 ird0Var2 = ird0Var;
        this.o.setLabel(ird0Var2.a);
        String str = ird0Var2.d.c;
        VkInputSelect vkInputSelect = this.p;
        vkInputSelect.setText(str);
        vkInputSelect.setOnClickListener(new k1f(2, this, ird0Var2));
    }
}
