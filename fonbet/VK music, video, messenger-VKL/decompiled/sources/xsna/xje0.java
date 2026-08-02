package xsna;

/* compiled from: PushMessageDao.kt */
/* loaded from: classes5.dex */
public final class xje0 {
    public final int a;
    public final String b;
    public final String c;

    public xje0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xje0)) {
            return false;
        }
        xje0 xje0Var = (xje0) obj;
        return this.a == xje0Var.a && epx.f(this.b, xje0Var.b) && epx.f(this.c, xje0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessagesCount(count=");
        sb.append(this.a);
        sb.append(", packageName=");
        sb.append(this.b);
        sb.append(", pushToken=");
        return ho8.a(sb, this.c, ')');
    }
}
