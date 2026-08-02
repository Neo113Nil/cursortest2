package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vkontakte.android.R;

/* compiled from: ProductFilterPriceHolder.kt */
/* loaded from: classes18.dex */
public final class nod0 extends vfz<n6d0> {
    public final izs<vcr<?>, s3q0> l;
    public final VkFormField m;
    public final VkInputSelect n;
    public final VkFormField o;
    public final VkInputSelect p;

    public nod0(ViewGroup viewGroup, g22 g22Var) {
        super(bwt0.I(R.layout.product_filter_price, viewGroup, false));
        this.l = g22Var;
        this.m = (VkFormField) this.itemView.findViewById(R.id.price_from_layout);
        VkInputSelect vkInputSelect = (VkInputSelect) this.itemView.findViewById(R.id.price_from);
        vkInputSelect.setTag("filter_dialog_compose_price_view");
        vkInputSelect.setInputType(2);
        this.n = vkInputSelect;
        this.o = (VkFormField) this.itemView.findViewById(R.id.price_to_layout);
        VkInputSelect vkInputSelect2 = (VkInputSelect) this.itemView.findViewById(R.id.price_to);
        vkInputSelect2.setInputType(2);
        this.p = vkInputSelect2;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(n6d0 n6d0Var) {
        Integer num;
        Integer num2;
        final n6d0 n6d0Var2 = n6d0Var;
        String str = n6d0Var2.e;
        if (str == null) {
            str = "";
        }
        VkFormField vkFormField = this.m;
        vkFormField.setLabel(str);
        String str2 = n6d0Var2.g;
        vkFormField.setError(str2 != null ? str2 : "");
        String str3 = n6d0Var2.g;
        vkFormField.setError(!(str3 == null || str3.length() == 0));
        VkFormField vkFormField2 = this.o;
        vkFormField2.setLabel(" ");
        String str4 = n6d0Var2.g;
        vkFormField2.setError(!(str4 == null || str4.length() == 0));
        p6d0 p6d0Var = n6d0Var2.f;
        String str5 = null;
        String num3 = (p6d0Var == null || (num2 = p6d0Var.a) == null) ? null : Integer.valueOf(num2.intValue() / 100).toString();
        VkInputSelect vkInputSelect = this.n;
        vkInputSelect.setText(num3);
        vkInputSelect.setOnContentChangedListener(new qe20(vkInputSelect, n6d0Var2, this, 1));
        vkInputSelect.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.lod0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    n6d0Var2.g = null;
                    nod0 nod0Var = nod0.this;
                    nod0Var.m.setError(false);
                    nod0Var.o.setError(false);
                }
            }
        });
        p6d0 p6d0Var2 = n6d0Var2.f;
        if (p6d0Var2 != null && (num = p6d0Var2.b) != null) {
            str5 = Integer.valueOf(num.intValue() / 100).toString();
        }
        VkInputSelect vkInputSelect2 = this.p;
        vkInputSelect2.setText(str5);
        vkInputSelect2.setOnContentChangedListener(new dyc(vkInputSelect2, n6d0Var2, this, 4));
        vkInputSelect2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.mod0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    n6d0Var2.g = null;
                    nod0 nod0Var = nod0.this;
                    nod0Var.m.setError(false);
                    nod0Var.o.setError(false);
                }
            }
        });
    }
}
