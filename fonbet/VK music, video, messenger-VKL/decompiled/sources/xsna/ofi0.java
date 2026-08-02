package xsna;

/* compiled from: OrderListItem.kt */
/* loaded from: classes18.dex */
public final class ofi0 extends jv80 {
    public final y8l b;
    public final String c;
    public final Object d;

    public ofi0(y8l y8lVar, String str, Object obj) {
        super(str);
        this.b = y8lVar;
        this.c = str;
        this.d = obj;
    }

    @Override // xsna.jv80
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofi0)) {
            return false;
        }
        ofi0 ofi0Var = (ofi0) obj;
        return epx.f(this.b, ofi0Var.b) && epx.f(this.c, ofi0Var.c) && epx.f(this.d, ofi0Var.d);
    }

    public final int hashCode() {
        return qow.a(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "SellerCommentItem(decorationType=" + this.b + ", key=" + this.c + ", text=" + ((Object) qow.b(this.d)) + ')';
    }
}
