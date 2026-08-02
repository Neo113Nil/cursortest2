package defpackage;

/* loaded from: classes6.dex */
public final class b8e0 implements d8e0 {
    public final String a;
    public final tbv b;
    public final CharSequence c;
    public final CharSequence d;

    public b8e0(String str, tbv tbvVar, CharSequence charSequence, CharSequence charSequence2) {
        this.a = str;
        this.b = tbvVar;
        this.c = charSequence;
        this.d = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8e0)) {
            return false;
        }
        b8e0 b8e0Var = (b8e0) obj;
        return this.a.equals(b8e0Var.a) && jl40.l(this.b, b8e0Var.b) && jl40.l(this.c, b8e0Var.c) && jl40.l(this.d, b8e0Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + smw0.b(smw0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ProminentHeaderItem(id=" + this.a + ", imageModel=" + this.b + ", title=" + ((Object) this.c) + ", subtitle=" + ((Object) this.d) + ", hasDivider=false)";
    }
}
