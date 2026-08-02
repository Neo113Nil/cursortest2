package xsna;

/* compiled from: SublistStorageModel.kt */
/* loaded from: classes2.dex */
public final class gum0 {
    public final String a;
    public final String b;
    public final String c;
    public final fum0 d;

    public gum0(String str, String str2, String str3, fum0 fum0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = fum0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gum0)) {
            return false;
        }
        gum0 gum0Var = (gum0) obj;
        return epx.f(this.a, gum0Var.a) && epx.f(this.b, gum0Var.b) && epx.f(this.c, gum0Var.c) && epx.f(this.d, gum0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SublistStorageModel(type=" + this.a + ", name=" + this.b + ", description=" + this.c + ", filter=" + this.d + ')';
    }
}
