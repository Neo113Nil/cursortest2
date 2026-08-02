package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class auy0 implements nry0 {
    public final TextView a;

    public auy0(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.nry0
    public final boolean e(CharSequence charSequence) {
        TextView textView = this.a;
        int width = textView.getWidth();
        if (width == 0) {
            width = textView.getMeasuredWidth();
        }
        int paddingStart = (width - textView.getPaddingStart()) - textView.getPaddingEnd();
        return (paddingStart <= 0 ? 0 : new StaticLayout(charSequence, textView.getPaint(), paddingStart, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount()) <= textView.getMaxLines();
    }
}
