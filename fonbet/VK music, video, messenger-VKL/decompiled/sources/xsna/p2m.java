package xsna;

import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.m2m;

/* compiled from: DescriptionStateProducer.kt */
/* loaded from: classes17.dex */
public final class p2m {
    public final q2m a = new q2m();

    /* JADX WARN: Multi-variable type inference failed */
    public final m2m a(AppCompatTextView appCompatTextView, SpannableStringBuilder spannableStringBuilder) {
        CharSequence a;
        int measuredWidth = appCompatTextView.getMeasuredWidth();
        Integer valueOf = Integer.valueOf(measuredWidth);
        if (measuredWidth <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : iah0.f().widthPixels;
        int maxLines = appCompatTextView.getMaxLines();
        String str = "";
        CharSequence b = spannableStringBuilder.length() == 0 ? "" : mbp.b(appCompatTextView.getPaint(), intValue, maxLines, spannableStringBuilder);
        if (b != null) {
            return new m2m.b(b);
        }
        int length = spannableStringBuilder.length();
        q2m q2mVar = this.a;
        if (length == 0) {
            a = "";
        } else {
            lfo0 lfo0Var = new lfo0(appCompatTextView);
            lfo0Var.c = (SpannableStringBuilder) q2mVar.a.getValue();
            lfo0Var.b = spannableStringBuilder;
            a = lfo0Var.a(intValue, maxLines, true);
        }
        String str2 = str;
        if (spannableStringBuilder.length() != 0) {
            int measuredWidth2 = appCompatTextView.getMeasuredWidth();
            Integer valueOf2 = measuredWidth2 > 0 ? Integer.valueOf(measuredWidth2) : null;
            StaticLayout build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), appCompatTextView.getPaint(), valueOf2 != null ? valueOf2.intValue() : iah0.f().widthPixels).setLineSpacing(appCompatTextView.getLineSpacingExtra(), appCompatTextView.getLineSpacingMultiplier()).setIncludePad(appCompatTextView.getIncludeFontPadding()).build();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            String str3 = (String) q2mVar.b.getValue();
            if (build.getLineCount() >= 4) {
                spannableStringBuilder2.append((CharSequence) "\n").append(drm0.p0(str3));
                str2 = spannableStringBuilder2;
            } else {
                spannableStringBuilder2.append((CharSequence) str3);
                str2 = spannableStringBuilder2;
            }
        }
        return new m2m.a(a, str2);
    }
}
