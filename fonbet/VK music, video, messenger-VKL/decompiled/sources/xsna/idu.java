package xsna;

import android.text.TextPaint;

/* compiled from: SegmentFinder.android.kt */
/* loaded from: classes11.dex */
public final class idu extends czi {
    public final CharSequence c;
    public final TextPaint d;

    public idu(CharSequence charSequence, TextPaint textPaint) {
        super(3);
        this.c = charSequence;
        this.d = textPaint;
    }

    @Override // xsna.czi
    public final int m(int i) {
        int textRunCursor;
        CharSequence charSequence = this.c;
        textRunCursor = this.d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }

    @Override // xsna.czi
    public final int n(int i) {
        int textRunCursor;
        CharSequence charSequence = this.c;
        textRunCursor = this.d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }
}
