package xsna;

/* compiled from: SearchFollowersIntegrationState.kt */
/* loaded from: classes5.dex */
public final class sth0 implements km50, xl50 {
    public final boolean b;
    public final boolean c;

    public sth0() {
        this(0);
    }

    public static sth0 a(sth0 sth0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = sth0Var.b;
        }
        if ((i & 2) != 0) {
            z2 = sth0Var.c;
        }
        sth0Var.getClass();
        sth0Var.getClass();
        return new sth0(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sth0)) {
            return false;
        }
        sth0 sth0Var = (sth0) obj;
        return this.b == sth0Var.b && this.c == sth0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFollowersIntegrationState(isAssumeFocused=");
        sb.append(this.b);
        sb.append(", isQueryBlank=");
        return n23.b(sb, this.c, ", isResumed=false)");
    }

    public /* synthetic */ sth0(int i) {
        this(false, true);
    }

    public sth0(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }
}
