package xsna;

/* compiled from: FolderUpdateFlagsLpEvent.kt */
/* loaded from: classes2.dex */
public final class i0s implements e900 {
    public final int a;
    public final int b;

    public i0s(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0s)) {
            return false;
        }
        i0s i0sVar = (i0s) obj;
        return this.a == i0sVar.a && this.b == i0sVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderUpdateFlagsLpEvent(id=");
        sb.append(this.a);
        sb.append(", flags=");
        return vu5.b(sb, this.b, ')');
    }
}
