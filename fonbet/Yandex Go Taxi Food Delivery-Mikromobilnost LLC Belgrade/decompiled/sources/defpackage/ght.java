package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public final class ght {
    public final fht a;
    public final CharSequence b;
    public final fht c;
    public final fht d;
    public final fht e;
    public final float f;

    public ght(fht fhtVar, SpannableStringBuilder spannableStringBuilder, fht fhtVar2, fht fhtVar3, fht fhtVar4, float f) {
        this.a = fhtVar;
        this.b = spannableStringBuilder;
        this.c = fhtVar2;
        this.d = fhtVar3;
        this.e = fhtVar4;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ght)) {
            return false;
        }
        ght ghtVar = (ght) obj;
        return this.a.equals(ghtVar.a) && jl40.l(this.b, ghtVar.b) && this.c.equals(ghtVar.c) && this.d.equals(ghtVar.d) && this.e.equals(ghtVar.e) && Float.compare(this.f, ghtVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftProgressContent(backgroundColor=");
        sb.append(this.a);
        sb.append(", scoreText=");
        sb.append((Object) this.b);
        sb.append(", scoreFilledTextColor=");
        sb.append(this.c);
        sb.append(", scoreUnfilledTextColor=");
        sb.append(this.d);
        sb.append(", progressColor=");
        sb.append(this.e);
        sb.append(", progressPercent=");
        return n.n(sb, this.f, ')');
    }
}
