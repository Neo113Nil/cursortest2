package xsna;

/* compiled from: MessagesListModel.kt */
/* loaded from: classes16.dex */
public final class xf20 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xf20() {
        this(r0, r0, r0, 15);
        int i = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf20)) {
            return false;
        }
        xf20 xf20Var = (xf20) obj;
        return this.a == xf20Var.a && this.b == xf20Var.b && this.c == xf20Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qoy.b(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesListModel(readTillInMsgCnvId=");
        sb.append(this.a);
        sb.append(", countUnread=");
        sb.append(this.b);
        sb.append(", markedAsUnread=false, lastMessageCnvId=");
        return vu5.b(sb, this.c, ')');
    }

    public xf20(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i2 > 0;
    }

    public /* synthetic */ xf20(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3);
    }
}
