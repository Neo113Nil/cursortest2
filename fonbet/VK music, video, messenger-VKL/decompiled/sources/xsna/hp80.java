package xsna;

/* compiled from: OnlineFormatterConfiguration.kt */
/* loaded from: classes17.dex */
public final class hp80 {
    public static final hp80 c = new hp80(3);
    public final boolean a;
    public final boolean b;

    public hp80() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp80)) {
            return false;
        }
        hp80 hp80Var = (hp80) obj;
        return this.a == hp80Var.a && this.b == hp80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineFormatterConfiguration(withFullMonth=");
        sb.append(this.a);
        sb.append(", capitalizeFirstLetter=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public hp80(int i) {
        this.a = (i & 1) == 0;
        this.b = false;
    }
}
