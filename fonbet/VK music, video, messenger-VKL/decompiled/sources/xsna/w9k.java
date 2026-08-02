package xsna;

/* compiled from: CreateReviewHintModel.kt */
/* loaded from: classes18.dex */
public final class w9k {
    public final float a;
    public final int b;
    public final int c;
    public final String d;

    public w9k(float f, int i, int i2, String str) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9k)) {
            return false;
        }
        w9k w9kVar = (w9k) obj;
        return Float.compare(this.a, w9kVar.a) == 0 && this.b == w9kVar.b && this.c == w9kVar.c && epx.f(this.d, w9kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, shy.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateReviewHintModel(progress=");
        sb.append(this.a);
        sb.append(", minTextLength=");
        sb.append(this.b);
        sb.append(", maxTextLength=");
        sb.append(this.c);
        sb.append(", textHint=");
        return ho8.a(sb, this.d, ')');
    }
}
