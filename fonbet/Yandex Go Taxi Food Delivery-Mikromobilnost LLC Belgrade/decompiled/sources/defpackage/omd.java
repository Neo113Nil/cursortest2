package defpackage;

/* loaded from: classes2.dex */
public final class omd {
    public final String a;
    public final umd b;
    public final c4a0 c;

    public omd(String str, umd umdVar, c4a0 c4a0Var) {
        this.a = str;
        this.b = umdVar;
        this.c = c4a0Var;
    }

    public final umd a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omd)) {
            return false;
        }
        omd omdVar = (omd) obj;
        return this.a.equals(omdVar.a) && this.b.equals(omdVar.b) && this.c.equals(omdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OnNewYBPaymentButton(__typename=" + this.a + ", widgetOpenCardUrls=" + this.b + ", paymentMethod=" + this.c + ')';
    }
}
