package defpackage;

/* loaded from: classes2.dex */
public final class fxw {
    public final String a;
    public final yxw b;

    public fxw(String str, yxw yxwVar) {
        this.a = str;
        this.b = yxwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxw)) {
            return false;
        }
        fxw fxwVar = (fxw) obj;
        return this.a.equals(fxwVar.a) && this.b.equals(fxwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payment(__typename=" + this.a + ", invoicePayment=" + this.b + ')';
    }
}
