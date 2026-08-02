package defpackage;

/* loaded from: classes2.dex */
public final class dfz {
    public final int a;
    public final int b;
    public final int c;

    public dfz(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfz)) {
            return false;
        }
        dfz dfzVar = (dfz) obj;
        return this.a == dfzVar.a && this.b == dfzVar.b && this.c == dfzVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogMatch(logIndex=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        return oyr.s(sb, this.c, ')');
    }
}
