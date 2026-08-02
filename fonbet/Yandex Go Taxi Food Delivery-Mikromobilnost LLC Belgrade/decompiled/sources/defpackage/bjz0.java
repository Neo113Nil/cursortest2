package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class bjz0 implements nry0 {
    public final TextView a;

    public bjz0(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.nry0
    public final boolean e(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        TextView textView = this.a;
        int measuredWidth = (textView.getMeasuredWidth() - textView.getPaddingStart()) - textView.getPaddingEnd();
        return measuredWidth > 0 && new StaticLayout(charSequence, textView.getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= textView.getMaxLines();
    }
}
