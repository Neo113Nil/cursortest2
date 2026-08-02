package xsna;

/* compiled from: ItemsSizeInfo.kt */
/* loaded from: classes7.dex */
public final class awx {
    public final int a;
    public final int b;
    public final int c;

    public awx(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awx)) {
            return false;
        }
        awx awxVar = (awx) obj;
        return this.a == awxVar.a && this.b == awxVar.b && this.c == awxVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemsSizeInfo(itemWidth=");
        sb.append(this.a);
        sb.append(", spaceForScrollWidth=");
        sb.append(this.b);
        sb.append(", screenWidth=");
        return vu5.b(sb, this.c, ')');
    }
}
