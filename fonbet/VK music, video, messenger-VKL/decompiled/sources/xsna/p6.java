package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: AboutVideoDescriptionHelper.kt */
/* loaded from: classes2.dex */
public final class p6 extends ClickableSpan {
    public final /* synthetic */ q6 b;
    public final /* synthetic */ String c;

    public p6(q6 q6Var, String str) {
        this.b = q6Var;
        this.c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.a.invoke(Long.valueOf(TimeUnit.SECONDS.toMillis(q6.a(this.c))));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
