package xsna;

/* compiled from: GoodDescriptionContent.kt */
/* loaded from: classes18.dex */
public final class n4u {
    public final CharSequence a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public n4u(CharSequence charSequence, CharSequence charSequence2, int i, int i2, String str, String str2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4u)) {
            return false;
        }
        n4u n4uVar = (n4u) obj;
        return epx.f(this.a, n4uVar.a) && epx.f(this.b, n4uVar.b) && this.c == n4uVar.c && this.d == n4uVar.d && epx.f(this.e, n4uVar.e) && epx.f(this.f, n4uVar.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int a = urd0.a(shy.a(this.d, shy.a(this.c, u11.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b), 31), 31), 31, this.e);
        String str = this.f;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodDescriptionModel(sku=");
        sb.append((Object) this.a);
        sb.append(", description=");
        sb.append((Object) this.b);
        sb.append(", date=");
        sb.append(this.c);
        sb.append(", viewCount=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", serviceDurationText=");
        return ho8.a(sb, this.f, ')');
    }
}
