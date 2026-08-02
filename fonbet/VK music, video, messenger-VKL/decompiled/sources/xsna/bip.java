package xsna;

/* compiled from: NewsfeedSearchViewState.kt */
/* loaded from: classes4.dex */
public final class bip {
    public final boolean a;
    public final int b;
    public final CharSequence c;

    public bip(int i, CharSequence charSequence, boolean z) {
        this.a = z;
        this.b = i;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bip)) {
            return false;
        }
        bip bipVar = (bip) obj;
        return this.a == bipVar.a && this.b == bipVar.b && epx.f(this.c, bipVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyViewState(isVisible=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", text=");
        return thl0.a(sb, this.c, ')');
    }
}
