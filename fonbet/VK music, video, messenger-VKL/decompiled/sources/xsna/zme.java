package xsna;

/* compiled from: ClipsNewsfeedBlockPagingSettings.kt */
/* loaded from: classes16.dex */
public final class zme {
    public static final zme c = new zme(3, 10);
    public final int a;
    public final int b;

    public zme(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zme)) {
            return false;
        }
        zme zmeVar = (zme) obj;
        return this.a == zmeVar.a && this.b == zmeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsNewsfeedBlockPagingSettings(initialPageSize=");
        sb.append(this.a);
        sb.append(", nextPageSize=");
        return vu5.b(sb, this.b, ')');
    }
}
