package xsna;

/* compiled from: ScreenCastConfig.kt */
/* loaded from: classes.dex */
public final class sah0 {
    public final boolean a;
    public final boolean b;

    public sah0() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sah0)) {
            return false;
        }
        sah0 sah0Var = (sah0) obj;
        return this.a == sah0Var.a && this.b == sah0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenCastConfig(connectByCodeEnabled=");
        sb.append(this.a);
        sb.append(", connectFromListEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public sah0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
