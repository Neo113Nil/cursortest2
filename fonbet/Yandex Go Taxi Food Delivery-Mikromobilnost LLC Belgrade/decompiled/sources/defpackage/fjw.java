package defpackage;

/* loaded from: classes14.dex */
public final class fjw extends hjw {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public fjw(String str, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjw)) {
            return false;
        }
        fjw fjwVar = (fjw) obj;
        return jl40.l(this.a, fjwVar.a) && this.b == fjwVar.b && this.c == fjwVar.c && this.d == fjwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
