package defpackage;

/* loaded from: classes10.dex */
public final class emp implements fmp {
    public final String a;
    public final b3u b;

    public emp(String str, b3u b3uVar) {
        this.a = str;
        this.b = b3uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emp)) {
            return false;
        }
        emp empVar = (emp) obj;
        return this.a.equals(empVar.a) && jl40.l(this.b, empVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.a + ", featureRequiring=" + this.b + ')';
    }
}
