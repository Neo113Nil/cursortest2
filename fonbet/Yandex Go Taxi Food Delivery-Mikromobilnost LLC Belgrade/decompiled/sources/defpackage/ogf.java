package defpackage;

/* loaded from: classes2.dex */
public final class ogf {
    public final dfz a;
    public final dfz b;

    public ogf(dfz dfzVar, dfz dfzVar2) {
        this.a = dfzVar;
        this.b = dfzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogf)) {
            return false;
        }
        ogf ogfVar = (ogf) obj;
        return jl40.l(this.a, ogfVar.a) && jl40.l(this.b, ogfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentMatchState(previousMatch=" + this.a + ", currentMatch=" + this.b + ')';
    }
}
