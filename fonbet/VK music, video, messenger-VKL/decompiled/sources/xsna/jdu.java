package xsna;

import java.text.BreakIterator;

/* compiled from: SegmentFinder.android.kt */
/* loaded from: classes11.dex */
public final class jdu extends czi {
    public final BreakIterator c;

    public jdu(CharSequence charSequence) {
        super(3);
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.c = characterInstance;
    }

    @Override // xsna.czi
    public final int m(int i) {
        return this.c.following(i);
    }

    @Override // xsna.czi
    public final int n(int i) {
        return this.c.preceding(i);
    }
}
