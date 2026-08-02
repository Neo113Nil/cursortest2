package xsna;

/* compiled from: FaveEntries.kt */
/* loaded from: classes18.dex */
public final class qnq implements snq {
    public final String a;
    public final int b;
    public final boolean c;

    public qnq(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnq)) {
            return false;
        }
        qnq qnqVar = (qnq) obj;
        qnqVar.getClass();
        return epx.f(this.a, qnqVar.a) && this.b == qnqVar.b && this.c == qnqVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveEmpty(title=, description=");
        sb.append(this.a);
        sb.append(", paddingBottom=");
        sb.append(this.b);
        sb.append(", showClearBtn=");
        return n23.b(sb, this.c, ", showTopDivider=false)");
    }
}
