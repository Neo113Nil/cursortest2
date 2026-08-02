package defpackage;

import android.widget.TextView;

/* loaded from: classes.dex */
public final class mer {
    public final TextView a;
    public int b;
    public int c;
    public int d = -1;

    public mer(TextView textView) {
        this.a = textView;
        textView.setIncludeFontPadding(false);
    }

    public final void a(int i) {
        TextView textView = this.a;
        if (i == -1) {
            this.b = 0;
            this.c = 0;
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setFallbackLineSpacing(true);
            return;
        }
        int fontMetricsInt = i - textView.getPaint().getFontMetricsInt(null);
        if (fontMetricsInt < 0) {
            int i2 = fontMetricsInt / 2;
            this.b = i2;
            this.c = fontMetricsInt - i2;
        } else {
            int i3 = fontMetricsInt / 2;
            this.c = i3;
            this.b = fontMetricsInt - i3;
        }
        textView.setLineSpacing(i - textView.getPaint().getFontMetrics(null), 1.0f);
        textView.setFallbackLineSpacing(false);
    }
}
