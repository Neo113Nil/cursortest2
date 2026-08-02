package xsna;

import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: AudioEditingHintDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class xm4 extends yc6 {
    public static final float i = dn70.a() * 14.0f;
    public final TextPaint g;
    public StaticLayout h;

    public xm4(mwo0 mwo0Var) {
        super(mwo0Var);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(this.c.getColor(R.color.vk_white_alpha60));
        com.vk.typography.b.j(textPaint, this.c, FontFamily.REGULAR, Float.valueOf(13.0f), 8);
        textPaint.setLetterSpacing(0.02f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.g = textPaint;
    }

    @Override // xsna.yc6
    public final void b() {
        if (this.d.isEmpty()) {
            return;
        }
        d();
    }

    public final void d() {
        oy4 e = this.b.e();
        String str = e != null ? e.s : null;
        this.h = str != null ? StaticLayout.Builder.obtain(str, 0, str.length(), this.g, (int) this.d.width()).build() : null;
    }
}
