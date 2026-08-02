package xsna;

/* compiled from: NegativeRepliesItem.kt */
/* loaded from: classes16.dex */
public final class q060 implements hfz {
    public final String b;
    public final String c;
    public final String d;

    public q060(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q060)) {
            return false;
        }
        q060 q060Var = (q060) obj;
        q060Var.getClass();
        return this.b.equals(q060Var.b) && this.c.equals(q060Var.c) && this.d.equals(q060Var.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NegativeRepliesItem(parentCommentId=null, title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", animation=");
        return ho8.a(sb, this.d, ')');
    }
}
