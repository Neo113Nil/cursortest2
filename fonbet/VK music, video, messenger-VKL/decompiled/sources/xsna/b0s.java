package xsna;

/* compiled from: FolderSublist.kt */
/* loaded from: classes2.dex */
public final class b0s {
    public final String a;
    public final String b;
    public final String c;
    public final cum0 d;

    public b0s(String str, String str2, String str3, cum0 cum0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cum0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0s)) {
            return false;
        }
        b0s b0sVar = (b0s) obj;
        return epx.f(this.a, b0sVar.a) && epx.f(this.b, b0sVar.b) && epx.f(this.c, b0sVar.c) && epx.f(this.d, b0sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "FolderSublist(type=" + this.a + ", name=" + this.b + ", description=" + this.c + ", filter=" + this.d + ')';
    }
}
