package xsna;

/* compiled from: SublistItem.kt */
/* loaded from: classes18.dex */
public final class eum0 implements hfz {
    public final String b;
    public final String c;
    public final String d;

    public eum0(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eum0)) {
            return false;
        }
        eum0 eum0Var = (eum0) obj;
        return epx.f(this.b, eum0Var.b) && epx.f(this.c, eum0Var.c) && epx.f(this.d, eum0Var.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SublistItem(name=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", type=");
        return ho8.a(sb, this.d, ')');
    }
}
