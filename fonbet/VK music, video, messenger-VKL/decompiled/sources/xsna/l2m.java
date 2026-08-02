package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.vkontakte.android.R;
import xsna.z420;

/* compiled from: DescriptionSpansHelperImpl.kt */
/* loaded from: classes17.dex */
public final class l2m implements i2m {
    public final pcg a;
    public final wpg b;
    public final com.vk.movika.sdk.base.observable.o c;

    public l2m(pcg pcgVar, wpg wpgVar, com.vk.movika.sdk.base.observable.o oVar) {
        this.a = pcgVar;
        this.b = wpgVar;
        this.c = oVar;
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, Context context, int i, int i2, int i3, int i4) {
        spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(i2, context)), i3, i4, 33);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i), i3, i4, 18);
    }

    @Override // xsna.i2m
    public final void a(Context context, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), szc.class)) {
            szc szcVar = (szc) obj;
            int spanStart = spannableStringBuilder.getSpanStart(szcVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(szcVar);
            c(spannableStringBuilder, context, R.style.VkUiTypography_Headline2, R.attr.vk_ui_text_primary_alpha, spanStart, spanEnd);
            k2m k2mVar = new k2m(this, szcVar.a);
            k2mVar.b = true;
            k2mVar.c(R.color.vk_black_alpha24);
            spannableStringBuilder.setSpan(k2mVar, spanStart, spanEnd, 17);
        }
        for (Object obj2 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z420.a.class)) {
            z420.a aVar = (z420.a) obj2;
            aVar.l = new k7f(this, 8);
            c(spannableStringBuilder, context, R.style.VkUiTypography_Headline2, R.attr.vk_ui_text_primary_alpha, spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar));
        }
        for (Object obj3 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), qaz.class)) {
            qaz qazVar = (qaz) obj3;
            qazVar.j = new yh1(this, 14);
            c(spannableStringBuilder, context, R.style.VkUiTypography_Headline2, R.attr.vk_ui_text_primary_alpha, spannableStringBuilder.getSpanStart(qazVar), spannableStringBuilder.getSpanEnd(qazVar));
        }
    }

    @Override // xsna.i2m
    public final void b(Context context, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, nh3 nh3Var) {
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        int H = (drm0.H(spannableStringBuilder) + 1) - charSequence.length();
        int H2 = drm0.H(spannableStringBuilder) + 1;
        c(spannableStringBuilder, context, R.style.VkUiTypography_SubheadMedium, R.attr.vk_ui_text_contrast, H, H2);
        if (nh3Var != null) {
            j2m j2mVar = new j2m(nh3Var);
            j2mVar.b = true;
            j2mVar.c(R.color.vk_black_alpha24);
            spannableStringBuilder.setSpan(j2mVar, H, H2, 17);
        }
    }
}
