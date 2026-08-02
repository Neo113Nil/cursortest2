package xsna;

/* compiled from: SpecialEventIconConfig.kt */
/* loaded from: classes11.dex */
public final class gjk0 {
    public static final a c = new a();
    public static final gjk0 d = new gjk0(0);
    public final boolean a;
    public final String b;

    /* compiled from: SpecialEventIconConfig.kt */
    public static final class a {
    }

    public gjk0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjk0)) {
            return false;
        }
        gjk0 gjk0Var = (gjk0) obj;
        return this.a == gjk0Var.a && epx.f(this.b, gjk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialEventIconConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", eventName=");
        return ho8.a(sb, this.b, ')');
    }

    public gjk0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public /* synthetic */ gjk0(int i) {
        this(false, "");
    }
}
