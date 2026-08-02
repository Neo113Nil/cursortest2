package xsna;

/* compiled from: MsgCounters.kt */
/* loaded from: classes2.dex */
public final class ai30 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public ai30() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai30)) {
            return false;
        }
        ai30 ai30Var = (ai30) obj;
        return this.a == ai30Var.a && this.b == ai30Var.b && this.c == ai30Var.c && this.d == ai30Var.d && this.e == ai30Var.e && this.f == ai30Var.f && this.g == ai30Var.g && this.h == ai30Var.h && this.i == ai30Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgCounters(msgUnread=");
        sb.append(this.a);
        sb.append(", msgUnreadUnmuted=");
        sb.append(this.b);
        sb.append(", msgRequests=");
        sb.append(this.c);
        sb.append(", businessNotifyTotal=");
        sb.append(this.d);
        sb.append(", businessNotifyUnread=");
        sb.append(this.e);
        sb.append(", archiveTotal=");
        sb.append(this.f);
        sb.append(", archiveUnread=");
        sb.append(this.g);
        sb.append(", archiveUnreadUnmuted=");
        sb.append(this.h);
        sb.append(", archiveMentions=");
        return vu5.b(sb, this.i, ')');
    }

    public ai30(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }
}
