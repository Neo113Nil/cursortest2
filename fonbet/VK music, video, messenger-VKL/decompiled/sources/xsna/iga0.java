package xsna;

/* compiled from: PhotosRootState.kt */
/* loaded from: classes4.dex */
public final class iga0 implements km50 {
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public iga0(boolean z, int i, boolean z2, boolean z3) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static iga0 a(iga0 iga0Var, int i, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            i = iga0Var.b;
        }
        if ((i2 & 2) != 0) {
            z = iga0Var.c;
        }
        if ((i2 & 4) != 0) {
            z2 = iga0Var.d;
        }
        if ((i2 & 8) != 0) {
            z3 = iga0Var.e;
        }
        iga0Var.getClass();
        return new iga0(z, i, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iga0)) {
            return false;
        }
        iga0 iga0Var = (iga0) obj;
        return this.b == iga0Var.b && this.c == iga0Var.c && this.d == iga0Var.d && this.e == iga0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosRootState(selectedTab=");
        sb.append(this.b);
        sb.append(", enableSwitchTabBySwipe=");
        sb.append(this.c);
        sb.append(", showOnboarding=");
        sb.append(this.d);
        sb.append(", retryOnboarding=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
