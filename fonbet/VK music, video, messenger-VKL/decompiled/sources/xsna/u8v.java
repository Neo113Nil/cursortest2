package xsna;

/* compiled from: ImItemsUtils.kt */
/* loaded from: classes2.dex */
public final class u8v {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public u8v(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8v)) {
            return false;
        }
        u8v u8vVar = (u8v) obj;
        return this.a == u8vVar.a && this.b == u8vVar.b && this.c == u8vVar.c && this.d == u8vVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryStructurePagingFlags(hasAfterCached=");
        sb.append(this.a);
        sb.append(", hasBeforeCached=");
        sb.append(this.b);
        sb.append(", hasAfterRemote=");
        sb.append(this.c);
        sb.append(", hasBeforeRemote=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
