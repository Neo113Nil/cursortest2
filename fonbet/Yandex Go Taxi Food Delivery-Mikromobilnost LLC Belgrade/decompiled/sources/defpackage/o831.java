package defpackage;

/* loaded from: classes4.dex */
public final class o831 extends s831 {
    public final yez j;

    public o831(yez yezVar) {
        this.j = yezVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o831) && jl40.l(this.j, ((o831) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return "Failure: Unable to load log servers with " + this.j;
    }
}
