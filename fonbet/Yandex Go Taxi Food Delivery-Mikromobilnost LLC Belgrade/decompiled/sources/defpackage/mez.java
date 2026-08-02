package defpackage;

/* loaded from: classes4.dex */
public final class mez extends elp0 {
    public final String a;
    public final String b;

    public mez(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mez)) {
            return false;
        }
        mez mezVar = (mez) obj;
        return jl40.l(this.a, mezVar.a) && jl40.l(this.b, mezVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Log ID of SCT, " + this.a + ", does not match this log's ID, " + this.b;
    }
}
