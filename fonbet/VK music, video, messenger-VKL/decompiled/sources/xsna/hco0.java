package xsna;

import android.view.textclassifier.TextClassification;

/* compiled from: PlatformSelectionBehaviors.android.kt */
/* loaded from: classes11.dex */
public final class hco0 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public hco0(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hco0)) {
            return false;
        }
        hco0 hco0Var = (hco0) obj;
        return epx.f(this.a, hco0Var.a) && qko0.b(this.b, hco0Var.b) && epx.f(this.c, hco0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = qko0.c;
        return this.c.hashCode() + bh10.a(hashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) qko0.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
