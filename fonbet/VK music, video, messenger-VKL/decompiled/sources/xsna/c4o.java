package xsna;

/* compiled from: DonutUserStackSemanticsState.kt */
/* loaded from: classes17.dex */
public final class c4o {
    public final int a;
    public final boolean b;

    public c4o(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4o)) {
            return false;
        }
        c4o c4oVar = (c4o) obj;
        return this.a == c4oVar.a && this.b == c4oVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutUserSemanticsState(index=");
        sb.append(this.a);
        sb.append(", isDon=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
