package xsna;

import android.text.SpannableStringBuilder;

/* compiled from: MentionsFormatter.kt */
/* loaded from: classes2.dex */
public final class s420 {
    public static final cvk a = new cvk();
    public static final pj90 b = new pj90();

    public static CharSequence a(CharSequence charSequence) {
        if (charSequence != null) {
            pj90 pj90Var = b;
            if (pj90Var.a(charSequence)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                pj90Var.b(spannableStringBuilder, a, true);
                return spannableStringBuilder;
            }
        }
        return charSequence == null ? "" : charSequence;
    }
}
