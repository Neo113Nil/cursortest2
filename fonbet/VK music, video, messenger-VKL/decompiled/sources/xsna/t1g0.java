package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.EditText;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.Pair;
import xsna.nbv0;

/* compiled from: ReplenishCardSelectorViewHolder.kt */
/* loaded from: classes6.dex */
public final class t1g0 extends vfz<s1g0> {
    public final VkTextFieldView l;

    public t1g0(ViewGroup viewGroup, nbv0.a aVar) {
        super(R.layout.vk_pay_checkout_replenish_card_selector_item, viewGroup);
        this.l = (VkTextFieldView) this.itemView.findViewById(R.id.vkpay_method_card_replenish_select_card);
        this.itemView.setOnClickListener(new pc3(aVar, 8));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(s1g0 s1g0Var) {
        CharSequence charSequence;
        sr90<? extends PayMethodData> sr90Var = s1g0Var.b;
        if (sr90Var.b instanceof AddCardMethod) {
            Context context = this.itemView.getContext();
            Pair<Integer, String[]> c = sr90Var.c();
            if (sr90Var instanceof q470) {
                String string = context.getString(c.i().intValue());
                SpannableString spannableString = new SpannableString(string);
                TypedValue typedValue = krv0.a;
                spannableString.setSpan(krv0.c(R.attr.vk_legacy_accent, context), 0, string.length(), 33);
                charSequence = spannableString;
            } else {
                int intValue = c.i().intValue();
                String[] j = c.j();
                charSequence = context.getString(intValue, Arrays.copyOf(j, j.length));
            }
        } else {
            charSequence = xx1.o(this.itemView.getContext(), sr90Var, R.attr.vk_legacy_text_secondary);
        }
        Drawable m = vua0.m(this.itemView.getContext(), sr90Var);
        int i = VkTextFieldView.i;
        VkTextFieldView vkTextFieldView = this.l;
        EditText editText = vkTextFieldView.c;
        m.mutate();
        editText.setPadding(VkTextFieldView.j, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        vkTextFieldView.d.setImageDrawable(m);
        vkTextFieldView.setValue(charSequence);
    }
}
