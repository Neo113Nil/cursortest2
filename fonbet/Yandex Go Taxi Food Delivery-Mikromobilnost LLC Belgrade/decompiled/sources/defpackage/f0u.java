package defpackage;

import android.text.TextPaint;

/* loaded from: classes10.dex */
public final class f0u extends e0u {
    public final CharSequence a;
    public final TextPaint b;

    public f0u(CharSequence charSequence, TextPaint textPaint) {
        this.a = charSequence;
        this.b = textPaint;
    }

    @Override // defpackage.e0u
    public final int a(int i) {
        CharSequence charSequence = this.a;
        return this.b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.e0u
    public final int b(int i) {
        CharSequence charSequence = this.a;
        return this.b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
