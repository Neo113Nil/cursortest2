package xsna;

/* compiled from: FlexLayoutConfig.kt */
/* loaded from: classes18.dex */
public final class cpr {
    public final boolean a;
    public final boolean b;

    public cpr() {
        this(true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpr)) {
            return false;
        }
        cpr cprVar = (cpr) obj;
        return this.a == cprVar.a && this.b == cprVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlexLayoutConfig(shouldShowMediaActionsUi=");
        sb.append(this.a);
        sb.append(", areAnimationsEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public cpr(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
