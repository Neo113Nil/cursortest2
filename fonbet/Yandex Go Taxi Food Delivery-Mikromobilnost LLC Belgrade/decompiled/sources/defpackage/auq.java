package defpackage;

/* loaded from: classes14.dex */
public final class auq {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public auq(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auq)) {
            return false;
        }
        auq auqVar = (auq) obj;
        return jl40.l(this.a, auqVar.a) && this.b.equals(auqVar.b) && jl40.l(this.c, auqVar.c) && this.d == auqVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
