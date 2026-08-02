package defpackage;

/* loaded from: classes2.dex */
public final class jmd {
    public final String a;
    public final am0 b;

    public jmd(String str, am0 am0Var) {
        this.a = str;
        this.b = am0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmd)) {
            return false;
        }
        jmd jmdVar = (jmd) obj;
        return this.a.equals(jmdVar.a) && this.b.equals(jmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Offer(__typename=" + this.a + ", additionalOffer=" + this.b + ')';
    }
}
