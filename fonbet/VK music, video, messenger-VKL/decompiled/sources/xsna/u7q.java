package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: ExpandSpan.kt */
/* loaded from: classes17.dex */
public final class u7q extends CharacterStyle implements l2v0 {
    public wo1 b;
    public boolean c;
    public Integer d;
    public Typeface e;

    @Override // xsna.rku0
    public final boolean e() {
        return this.c;
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        wo1 wo1Var = this.b;
        if (wo1Var != null) {
            wo1Var.invoke();
        }
    }

    @Override // xsna.l2v0
    public final int getColor() {
        Integer num = this.d;
        return num != null ? num.intValue() : krv0.l(R.attr.vk_ui_text_link);
    }

    @Override // xsna.l2v0
    public final String i() {
        return null;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(getColor());
        Typeface typeface = this.e;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
    }
}
