package xsna;

/* compiled from: ItemPosition.kt */
/* loaded from: classes17.dex */
public final class zux {
    public final int a;
    public final Object b;

    public zux(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zux)) {
            return false;
        }
        zux zuxVar = (zux) obj;
        return this.a == zuxVar.a && epx.f(this.b, zuxVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemPosition(index=");
        sb.append(this.a);
        sb.append(", key=");
        return k73.c(sb, this.b, ')');
    }
}
