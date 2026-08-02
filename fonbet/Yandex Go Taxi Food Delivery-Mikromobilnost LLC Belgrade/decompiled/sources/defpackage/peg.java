package defpackage;

/* loaded from: classes2.dex */
public final class peg {
    public final meg a;

    public peg(meg megVar) {
        this.a = megVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof peg) && jl40.l(this.a, ((peg) obj).a);
    }

    public final int hashCode() {
        meg megVar = this.a;
        if (megVar == null) {
            return 0;
        }
        return megVar.hashCode();
    }

    public final String toString() {
        return "OnAction(backgroundColors=" + this.a + ')';
    }
}
