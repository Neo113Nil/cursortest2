package xsna;

/* compiled from: DialogsFolderCounters.kt */
/* loaded from: classes2.dex */
public final class spm {
    public final int a;
    public final int b;
    public final int c;

    public spm(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static spm a(spm spmVar, int i, int i2, int i3) {
        int i4 = spmVar.a;
        if ((i3 & 2) != 0) {
            i = spmVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = spmVar.c;
        }
        spmVar.getClass();
        return new spm(i4, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spm)) {
            return false;
        }
        spm spmVar = (spm) obj;
        return this.a == spmVar.a && this.b == spmVar.b && this.c == spmVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFolderCounters(id=");
        sb.append(this.a);
        sb.append(", unreadUnmuted=");
        sb.append(this.b);
        sb.append(", unreadMuted=");
        return vu5.b(sb, this.c, ')');
    }
}
