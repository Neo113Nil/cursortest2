package xsna;

/* compiled from: ReviewTextInputFieldModel.kt */
/* loaded from: classes18.dex */
public final class x9k {
    public final String a;
    public final int b;
    public final y9k c;

    public x9k(String str, int i, y9k y9kVar) {
        this.a = str;
        this.b = i;
        this.c = y9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9k)) {
            return false;
        }
        x9k x9kVar = (x9k) obj;
        return epx.f(this.a, x9kVar.a) && this.b == x9kVar.b && epx.f(this.c, x9kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CreateReviewInputFieldModel(text=" + this.a + ", maxLength=" + this.b + ", progressHint=" + this.c + ')';
    }
}
