package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.TtsSpan;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: DonutChipSpanFactoryImpl.kt */
/* loaded from: classes18.dex */
public final class bzn implements zyn {
    @Override // xsna.zyn
    public final CharSequence a(azn aznVar, Context context, r580 r580Var) {
        DonutPriceTemplate donutPriceTemplate = aznVar.b;
        Context context2 = e43.a;
        Drawable drawable = null;
        if (context2 == null) {
            context2 = null;
        }
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_icon_donut_color_12, context2);
        if (a != null) {
            a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
            drawable = a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (drawable != null) {
            spannableStringBuilder.append((CharSequence) "\u200b");
            spannableStringBuilder.setSpan(new cqa(drawable), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ");
        }
        if (donutPriceTemplate != null) {
            y1o.a(spannableStringBuilder, donutPriceTemplate, context, new ypx());
        } else {
            spannableStringBuilder.append((CharSequence) aznVar.a);
        }
        spannableStringBuilder.setSpan(new TtsSpan.TextBuilder(aznVar.c).build(), 0, spannableStringBuilder.length(), 33);
        if (r580Var != null) {
            spannableStringBuilder.setSpan(new fb6(new k75(5, r580Var, aznVar)), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
