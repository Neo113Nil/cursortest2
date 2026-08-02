package defpackage;

/* loaded from: classes2.dex */
public final class imd {
    public final String a;
    public final i3k0 b;

    public imd(String str, i3k0 i3k0Var) {
        this.a = str;
        this.b = i3k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imd)) {
            return false;
        }
        imd imdVar = (imd) obj;
        return this.a.equals(imdVar.a) && this.b.equals(imdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LegalText(__typename=" + this.a + ", richText=" + this.b + ')';
    }
}
