package androidx.emoji2.text;

import android.text.Spannable;
import android.text.SpannableString;
import defpackage.atn;
import defpackage.jp11;
import defpackage.jun;

/* loaded from: classes10.dex */
public final class a implements jun {
    public UnprecomputeTextOnModificationSpannable a;
    public final atn b;

    public a(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, atn atnVar) {
        this.a = unprecomputeTextOnModificationSpannable;
        this.b = atnVar;
    }

    @Override // defpackage.jun
    public final boolean c(CharSequence charSequence, int i, int i2, jp11 jp11Var) {
        if ((jp11Var.c & 4) > 0) {
            return true;
        }
        if (this.a == null) {
            this.a = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        this.b.getClass();
        this.a.setSpan(new TypefaceEmojiSpan(jp11Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.jun
    public final Object getResult() {
        return this.a;
    }
}
