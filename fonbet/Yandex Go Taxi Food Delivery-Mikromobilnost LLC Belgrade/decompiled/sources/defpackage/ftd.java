package defpackage;

/* loaded from: classes2.dex */
public final class ftd {
    public final String a;
    public final wju0 b;

    public ftd(String str, wju0 wju0Var) {
        this.a = str;
        this.b = wju0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftd)) {
            return false;
        }
        ftd ftdVar = (ftd) obj;
        return this.a.equals(ftdVar.a) && this.b.equals(ftdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StorePurchaseInfo(__typename=" + this.a + ", storePurchaseInfo=" + this.b + ')';
    }
}
