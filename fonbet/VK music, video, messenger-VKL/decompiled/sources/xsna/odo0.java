package xsna;

/* compiled from: ReviewBodyData.kt */
/* loaded from: classes18.dex */
public final class odo0 {
    public final CharSequence a;
    public final us2 b;
    public final boolean c;

    public odo0(CharSequence charSequence, us2 us2Var, boolean z) {
        this.a = charSequence;
        this.b = us2Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odo0)) {
            return false;
        }
        odo0 odo0Var = (odo0) obj;
        return epx.f(this.a, odo0Var.a) && epx.f(this.b, odo0Var.b) && this.c == odo0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextData(text=");
        sb.append((Object) this.a);
        sb.append(", content=");
        sb.append((Object) this.b);
        sb.append(", isExpanded=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public odo0(CharSequence charSequence, us2 us2Var, boolean z, int i) {
        this(charSequence, (i & 2) != 0 ? new us2("") : us2Var, (i & 4) != 0 ? false : z);
    }
}
