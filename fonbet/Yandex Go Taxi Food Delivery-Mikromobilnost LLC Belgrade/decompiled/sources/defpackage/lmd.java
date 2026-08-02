package defpackage;

/* loaded from: classes2.dex */
public final class lmd {
    public final String a;
    public final String b;
    public final xmd c;
    public final c4a0 d;

    public lmd(String str, String str2, xmd xmdVar, c4a0 c4a0Var) {
        this.a = str;
        this.b = str2;
        this.c = xmdVar;
        this.d = c4a0Var;
    }

    public final xmd a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmd)) {
            return false;
        }
        lmd lmdVar = (lmd) obj;
        return this.a.equals(lmdVar.a) && jl40.l(this.b, lmdVar.b) && jl40.l(this.c, lmdVar.c) && this.d.equals(lmdVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        xmd xmdVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (xmdVar != null ? xmdVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OnCardPaymentButton(__typename=" + this.a + ", bankName=" + this.b + ", widgetUrls=" + this.c + ", paymentMethod=" + this.d + ')';
    }
}
