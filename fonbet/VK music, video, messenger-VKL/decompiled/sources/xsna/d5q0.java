package xsna;

/* compiled from: UnreadDialogsCountChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class d5q0 implements e900 {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public d5q0(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5q0)) {
            return false;
        }
        d5q0 d5q0Var = (d5q0) obj;
        return this.a == d5q0Var.a && this.b == d5q0Var.b && this.c == d5q0Var.c && this.d == d5q0Var.d && this.e == d5q0Var.e && this.f == d5q0Var.f && this.g == d5q0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + shy.a(this.f, shy.a(this.e, shy.a(this.d, qoy.b(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnreadDialogsCountChangeLpEvent(unreadCount=");
        sb.append(this.a);
        sb.append(", unreadUnmutedCount=");
        sb.append(this.b);
        sb.append(", showOnlyUnmuted=");
        sb.append(this.c);
        sb.append(", unreadBusinessNotifyCount=");
        sb.append(this.d);
        sb.append(", unreadArchiveCount=");
        sb.append(this.e);
        sb.append(", unreadUnmutedArchiveCount=");
        sb.append(this.f);
        sb.append(", archiveMentionsCount=");
        return vu5.b(sb, this.g, ')');
    }
}
