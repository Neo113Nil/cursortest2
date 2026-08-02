package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkOrderDescription;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OrderInfoViewHolder.kt */
/* loaded from: classes6.dex */
public final class xu80 extends vfz<wu80> {
    public final TextView l;
    public final TextView m;

    public xu80(ViewGroup viewGroup) {
        super(R.layout.vk_pay_checkout_order_info_holder, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.pay_method_confirmation_form_description);
        this.m = (TextView) this.itemView.findViewById(R.id.pay_method_confirmation_form_amount_to_pay);
    }

    @Override // xsna.vfz
    public final void W5(wu80 wu80Var) {
        wu80 wu80Var2 = wu80Var;
        VkOrderDescription vkOrderDescription = wu80Var2.b;
        boolean z = vkOrderDescription instanceof VkOrderDescription.Description;
        TextView textView = this.l;
        if (z) {
            VkOrderDescription.Description description = (VkOrderDescription.Description) vkOrderDescription;
            Context context = this.itemView.getContext();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(description.b);
            TypedValue typedValue = krv0.a;
            spannableString.setSpan(krv0.c(R.attr.vk_legacy_text_primary, context), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            String str = description.c;
            if (str != null) {
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(krv0.c(R.attr.vk_legacy_text_secondary, context), 0, spannableString2.length(), 33);
                spannableString2.setSpan(new AbsoluteSizeSpan(13, true), 0, spannableString2.length(), 33);
                spannableStringBuilder.append('\n').append((CharSequence) spannableString2);
            }
            textView.setText(spannableStringBuilder);
        } else {
            if (!epx.f(vkOrderDescription, VkOrderDescription.NoDescription.b)) {
                throw new NoWhenBranchMatchedException();
            }
            at.d(this.itemView, R.string.vk_pay_checkout_method_confirmation_payment_amount, textView);
        }
        VkTransactionInfo vkTransactionInfo = wu80Var2.c;
        int i = vkTransactionInfo.b;
        this.m.setText(sua.i(i, ',') + (char) 8201 + vkTransactionInfo.d.h());
    }
}
