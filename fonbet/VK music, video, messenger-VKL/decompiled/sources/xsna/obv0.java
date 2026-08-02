package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.Pair;
import xsna.sr90;

/* compiled from: VkPayConfirmationFragment.kt */
/* loaded from: classes6.dex */
public final class obv0 extends s770 {
    public final /* synthetic */ nbv0 c;

    public obv0(nbv0 nbv0Var) {
        this.c = nbv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        String str;
        PayMethodData payMethodData = (PayMethodData) obj;
        sr90 a = sr90.a.a(payMethodData);
        boolean z = payMethodData instanceof AddCardMethod;
        nbv0 nbv0Var = this.c;
        if (!z) {
            ((ImageView) hkpVar.f(R.id.item_pay_method_logo)).setImageDrawable(vua0.m(nbv0Var.requireContext(), a));
            ((TextView) hkpVar.f(R.id.item_pay_method_title)).setText(xx1.o(nbv0Var.requireContext(), a, R.attr.vk_legacy_text_secondary));
            return;
        }
        ((ImageView) hkpVar.f(R.id.item_pay_method_logo)).setImageDrawable(vua0.m(nbv0Var.requireContext(), a));
        TextView textView = (TextView) hkpVar.f(R.id.item_pay_method_title);
        Context requireContext = nbv0Var.requireContext();
        Pair<Integer, String[]> c = a.c();
        if (a instanceof q470) {
            String string = requireContext.getString(c.i().intValue());
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(krv0.c(R.attr.vk_legacy_accent, requireContext), 0, string.length(), 33);
            str = spannableString;
        } else {
            int intValue = c.i().intValue();
            String[] j = c.j();
            str = requireContext.getString(intValue, Arrays.copyOf(j, j.length));
        }
        textView.setText(str);
        View f = hkpVar.f(R.id.item_pay_method_container);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f.getLayoutParams();
        marginLayoutParams.bottomMargin = iah0.a(16);
        f.setLayoutParams(marginLayoutParams);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.e(view.findViewById(R.id.item_pay_method_container), view.findViewById(R.id.item_pay_method_logo), view.findViewById(R.id.item_pay_method_title));
        return hkpVar;
    }
}
