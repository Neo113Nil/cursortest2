package xsna;

/* compiled from: SearchAddressState.kt */
/* loaded from: classes18.dex */
public final class kt0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public kt0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt0)) {
            return false;
        }
        kt0 kt0Var = (kt0) obj;
        return epx.f(this.a, kt0Var.a) && epx.f(this.b, kt0Var.b) && epx.f(this.c, kt0Var.c) && this.d == kt0Var.d;
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressSuggestion(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", isFull=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
