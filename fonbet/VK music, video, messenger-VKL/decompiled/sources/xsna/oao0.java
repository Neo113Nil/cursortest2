package xsna;

import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* compiled from: TermsTextController.kt */
/* loaded from: classes15.dex */
public final class oao0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final izs<String, s3q0> d;
    public TextView e;

    /* compiled from: TermsTextController.kt */
    public static final class a extends kdp0 {
        public final boolean f;
        public final int g;
        public yq1 h;

        public a(boolean z, int i, int i2, yq1 yq1Var) {
            super(i, i, i2);
            this.f = z;
            this.g = i;
            this.h = yq1Var;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            yq1 yq1Var;
            if (jjc.d().a() || (yq1Var = this.h) == null) {
                return;
            }
            yq1Var.invoke();
        }

        @Override // xsna.kdp0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(this.f);
            int i = this.g;
            if (i != 0) {
                textPaint.setColor(i);
            }
        }
    }

    public oao0(int i, int i2, izs izsVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = izsVar;
    }

    public static void c(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (Object obj : spannable.getSpans(0, spannable.length(), a.class)) {
                a aVar = (a) obj;
                aVar.h = null;
                spannable.removeSpan(aVar);
            }
        }
    }

    public final void a(TextView textView) {
        textView.setMovementMethod(new bbz());
        textView.setLinksClickable(true);
        this.e = textView;
    }

    public final void b() {
        TextView textView = this.e;
        c(textView != null ? textView.getText() : null);
        this.e = null;
    }

    public final void d(String str) {
        SpannableString spannableString = new SpannableString(Html.fromHtml(str));
        TextView textView = this.e;
        if (textView != null) {
            c(textView.getText());
            for (Object obj : spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                URLSpan uRLSpan = (URLSpan) obj;
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new a(this.a, this.b, this.c, new yq1(20, uRLSpan, this)), spanStart, spanEnd, 0);
            }
            textView.setText(spannableString);
        }
    }
}
