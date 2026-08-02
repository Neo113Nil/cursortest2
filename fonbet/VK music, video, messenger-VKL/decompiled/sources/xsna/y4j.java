package xsna;

/* compiled from: ConscryptThreadDedupConfig.kt */
/* loaded from: classes11.dex */
public final class y4j {
    public static final a c = new a();
    public static final y4j d = new y4j(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: ConscryptThreadDedupConfig.kt */
    public static final class a {
    }

    public y4j() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4j)) {
            return false;
        }
        y4j y4jVar = (y4j) obj;
        return this.a == y4jVar.a && this.b == y4jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConscryptThreadDedupConfig(enabled=");
        sb.append(this.a);
        sb.append(", afterToggleSync=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public y4j(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
