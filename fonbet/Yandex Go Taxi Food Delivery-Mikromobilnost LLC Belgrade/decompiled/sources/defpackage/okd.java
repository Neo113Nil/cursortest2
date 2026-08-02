package defpackage;

/* loaded from: classes2.dex */
public final class okd {
    public final String a;
    public final tgx0 b;

    public okd(String str, tgx0 tgx0Var) {
        this.a = str;
        this.b = tgx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okd)) {
            return false;
        }
        okd okdVar = (okd) obj;
        return this.a.equals(okdVar.a) && this.b.equals(okdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffOffer(__typename=" + this.a + ", tariffOffer=" + this.b + ')';
    }
}
