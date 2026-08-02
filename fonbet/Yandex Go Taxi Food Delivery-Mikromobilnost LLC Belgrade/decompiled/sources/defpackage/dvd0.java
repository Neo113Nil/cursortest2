package defpackage;

/* loaded from: classes5.dex */
public final class dvd0 extends evd0 {
    public final v4v a;

    public dvd0(v4v v4vVar) {
        this.a = v4vVar;
    }

    @Override // defpackage.evd0
    public final v4v a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvd0) && jl40.l(this.a, ((dvd0) obj).a);
    }

    public final int hashCode() {
        v4v v4vVar = this.a;
        return Boolean.hashCode(false) + ((v4vVar == null ? 0 : v4vVar.hashCode()) * 31);
    }

    public final String toString() {
        return "IdlePointState(iconModel=" + this.a + ", isPassed=false)";
    }
}
