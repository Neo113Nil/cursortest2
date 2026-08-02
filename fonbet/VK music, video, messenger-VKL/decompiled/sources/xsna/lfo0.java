package xsna;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextViewEllipsizeEnd.kt */
/* loaded from: classes.dex */
public final class lfo0 {
    public final TextView a;
    public CharSequence b = "";
    public CharSequence c = "";
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;

    public lfo0(TextView textView) {
        this.a = textView;
    }

    public static /* synthetic */ CharSequence b(lfo0 lfo0Var, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = lfo0Var.a.getMaxLines();
        }
        return lfo0Var.a(i, i2, false);
    }

    public final CharSequence a(int i, int i2, boolean z) {
        Character B0;
        CharSequence b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        boolean z2 = true;
        if (z) {
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, this.c.length(), 18);
        }
        this.e = i;
        TextView textView = this.a;
        textView.setEllipsize(null);
        if (this.b.length() == 0) {
            return this.b;
        }
        if (this.f && (b = mbp.b(textView.getPaint(), i, i2, this.b, spannableStringBuilder)) != null) {
            return b;
        }
        int max = Math.max(0, (i - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight());
        float lineWidth = TextUtils.isEmpty(spannableStringBuilder) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textView.getPaint(), max, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false).getLineWidth(0);
        CharSequence charSequence = this.b;
        StaticLayout staticLayout = new StaticLayout(charSequence, 0, charSequence.length(), textView.getPaint(), max, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        int lineStart = staticLayout.getLineStart(Math.min(staticLayout.getLineCount(), i2) - 1);
        int i3 = lineStart;
        while (i3 >= 0 && i3 < this.b.length() && this.b.charAt(i3) != '\n') {
            i3++;
        }
        if (i2 >= staticLayout.getLineCount() && !this.d) {
            return this.b;
        }
        if (this.g) {
            return this.c;
        }
        CharSequence ellipsize = TextUtils.ellipsize(this.b.subSequence(lineStart, i3), textView.getPaint(), max - lineWidth, TextUtils.TruncateAt.END);
        if (ellipsize.length() >= this.b.length() - lineStart && !this.d && i2 >= staticLayout.getLineCount()) {
            z2 = false;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) this.b.toString(), 0, lineStart);
        if (!TextUtils.isEmpty(ellipsize)) {
            spannableStringBuilder2.append((CharSequence) ellipsize.toString());
        }
        if (this.h && z2 && ((B0 = erm0.B0(spannableStringBuilder2)) == null || B0.charValue() != 8230)) {
            spannableStringBuilder2.append((char) 8230);
        }
        mbp.a(spannableStringBuilder2, this.b);
        if (!TextUtils.isEmpty(this.c) && z2) {
            spannableStringBuilder2.append(this.c);
        }
        return spannableStringBuilder2;
    }
}
