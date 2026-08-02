package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* compiled from: TextViewExt.kt */
/* loaded from: classes18.dex */
public final class jno0 {
    public static void a(TextView textView, int i, int i2) {
        String string = textView.getContext().getString(i);
        Drawable drawable = textView.getContext().getDrawable(i2);
        drawable.setColorFilter(new PorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        dqa dqaVar = new dqa(drawable);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(dqaVar, 0, 1, 33);
        textView.setText(spannableStringBuilder);
    }

    public static final boolean b(TextView textView) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        for (int lineCount = layout.getLineCount() - 1; -1 < lineCount; lineCount--) {
            if (layout.getEllipsisCount(lineCount) > 0) {
                return true;
            }
        }
        return false;
    }

    public static final void c(TextView textView, int i) {
        dhr0.a.m0(textView, i);
    }
}
