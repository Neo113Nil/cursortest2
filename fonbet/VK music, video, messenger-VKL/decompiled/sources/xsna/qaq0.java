package xsna;

/* compiled from: UploadDonutLevel.kt */
/* loaded from: classes16.dex */
public final class qaq0 {
    public final int a;
    public final String b;
    public final String c;

    public qaq0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaq0)) {
            return false;
        }
        qaq0 qaq0Var = (qaq0) obj;
        return this.a == qaq0Var.a && epx.f(this.b, qaq0Var.b) && epx.f(this.c, qaq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadDonutLevel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return ho8.a(sb, this.c, ')');
    }
}
