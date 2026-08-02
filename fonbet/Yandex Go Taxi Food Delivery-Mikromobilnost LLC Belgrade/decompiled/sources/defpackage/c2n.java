package defpackage;

/* loaded from: classes12.dex */
public final class c2n {
    public final String a;
    public final String b;
    public final boolean c;

    public c2n(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2n)) {
            return false;
        }
        c2n c2nVar = (c2n) obj;
        return jl40.l(this.a, c2nVar.a) && this.b.equals(c2nVar.b) && this.c == c2nVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }
}
