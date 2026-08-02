package xsna;

/* compiled from: ChatInfo.kt */
/* loaded from: classes2.dex */
public final class urb {
    public final ohm a;
    public final int b;
    public final String c;

    public urb(ohm ohmVar, int i, String str) {
        this.a = ohmVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urb)) {
            return false;
        }
        urb urbVar = (urb) obj;
        return epx.f(this.a, urbVar.a) && this.b == urbVar.b && epx.f(this.c, urbVar.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.b.hashCode() * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatInfo(list=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.c, ')');
    }
}
