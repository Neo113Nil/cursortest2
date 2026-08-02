package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.price.model.template.item.DonutPriceTemplateItem;
import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;

/* compiled from: DonutPriceTemplateExt.kt */
/* loaded from: classes18.dex */
public final class y1o {
    public static final void a(SpannableStringBuilder spannableStringBuilder, DonutPriceTemplate donutPriceTemplate, Context context, w1o w1oVar) {
        for (DonutPriceTemplateItem donutPriceTemplateItem : donutPriceTemplate.b) {
            if (donutPriceTemplateItem instanceof DonutPriceTemplateItem.PlainText) {
                spannableStringBuilder.append((CharSequence) ((DonutPriceTemplateItem.PlainText) donutPriceTemplateItem).b);
            } else if (donutPriceTemplateItem instanceof DonutPriceTemplateItem.StrikethroughText) {
                DonutPriceTemplateItem.StrikethroughText strikethroughText = (DonutPriceTemplateItem.StrikethroughText) donutPriceTemplateItem;
                DonutPriceTemplateItemStyle donutPriceTemplateItemStyle = strikethroughText.c;
                Integer num = null;
                if (donutPriceTemplateItemStyle != null && w1oVar != null) {
                    num = Integer.valueOf(w1oVar.a(context, donutPriceTemplateItemStyle));
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strikethroughText.b);
                spannableStringBuilder.setSpan(new StrikethroughSpan(), length, spannableStringBuilder.length(), 33);
                if (num != null) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), length, spannableStringBuilder.length(), 33);
                }
            }
        }
    }

    public static SpannableStringBuilder b(DonutPriceTemplate donutPriceTemplate, Context context) {
        kqj0 kqj0Var = new kqj0();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, donutPriceTemplate, context, kqj0Var);
        return spannableStringBuilder;
    }
}
