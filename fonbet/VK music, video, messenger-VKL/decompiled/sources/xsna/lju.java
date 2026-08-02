package xsna;

/* compiled from: GroupCellConfiguration.kt */
/* loaded from: classes16.dex */
public final class lju {
    public final String a;
    public final int b;
    public final boolean c;

    public lju(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lju)) {
            return false;
        }
        lju ljuVar = (lju) obj;
        return epx.f(this.a, ljuVar.a) && this.b == ljuVar.b && this.c == ljuVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(text=");
        sb.append(this.a);
        sb.append(", maxLines=");
        sb.append(this.b);
        sb.append(", withVkPay=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
