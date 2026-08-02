package defpackage;

/* loaded from: classes12.dex */
public final class fa31 {
    public final String a;
    public final String b;

    public fa31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa31)) {
            return false;
        }
        fa31 fa31Var = (fa31) obj;
        return jl40.l(this.a, fa31Var.a) && jl40.l(this.b, fa31Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return unr0.b((((str == null ? 0 : str.hashCode()) * 31) + 460047585) * 31, 31, this.b);
    }

    public final String toString() {
        return unr0.p("VersionInfoEntity(name=", this.a, ", date=28.07.2026, buildNumber=", this.b, ", testingInfo=null)");
    }
}
