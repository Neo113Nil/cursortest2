package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;

/* loaded from: classes11.dex */
public abstract class nrn {
    public static int a(CharSequence charSequence, TextView textView, int i, int i2) {
        return b(charSequence, String.valueOf((char) 8230), textView.getPaint(), (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight(), textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), i, i2);
    }

    public static int b(CharSequence charSequence, String str, TextPaint textPaint, int i, float f, float f2, int i2, int i3) {
        if (i2 == 0) {
            return 0;
        }
        String valueOf = String.valueOf((char) 8230);
        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(f2, f).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth((i - i3) + (valueOf.equals(str) ? 0 : (int) (textPaint.measureText(valueOf) - textPaint.measureText(str)))).setMaxLines(i2).setIncludePad(true).build();
        if (build.getLineCount() < i2) {
            return charSequence.length();
        }
        int i4 = i2 - 1;
        int lineStart = build.getLineStart(i4);
        int ellipsisStart = build.getEllipsisStart(i4);
        return ellipsisStart == 0 ? charSequence.length() : lineStart + ellipsisStart;
    }
}
