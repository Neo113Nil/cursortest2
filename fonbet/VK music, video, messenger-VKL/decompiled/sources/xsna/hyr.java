package xsna;

/* compiled from: FolderCreateLpEvent.kt */
/* loaded from: classes2.dex */
public final class hyr implements e900 {
    public final int a;
    public final String b;
    public final int c;

    public hyr(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyr)) {
            return false;
        }
        hyr hyrVar = (hyr) obj;
        return this.a == hyrVar.a && epx.f(this.b, hyrVar.b) && this.c == hyrVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderCreateLpEvent(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", flags=");
        return vu5.b(sb, this.c, ')');
    }
}
