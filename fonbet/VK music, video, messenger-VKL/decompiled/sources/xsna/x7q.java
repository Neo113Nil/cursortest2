package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import androidx.annotation.Nullable;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;

/* compiled from: ExpandTextSpan.java */
/* loaded from: classes7.dex */
public final class x7q extends qaz {
    public View.OnClickListener m;

    @Nullable
    public Typeface n;
    public boolean o;

    public x7q() {
        super("", 0);
        this.n = null;
        this.o = false;
    }

    @Override // xsna.qaz, xsna.rku0
    public final void f(Context context, @Nullable View view) {
        View.OnClickListener onClickListener = this.m;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    @Override // xsna.qjc
    public final void j() {
        this.n = null;
        this.o = true;
    }

    @Override // xsna.qjc, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Typeface typeface;
        super.updateDrawState(textPaint);
        if (this.o) {
            typeface = this.n;
        } else {
            if (this.n == null) {
                Context context = e43.a;
                Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
                TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                this.n = a;
            }
            typeface = this.n;
        }
        textPaint.setTypeface(typeface);
    }
}
