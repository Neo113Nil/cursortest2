package xsna;

/* compiled from: VkExecutorsConfig.kt */
/* loaded from: classes.dex */
public final class bsu0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public bsu0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsu0)) {
            return false;
        }
        bsu0 bsu0Var = (bsu0) obj;
        return this.a == bsu0Var.a && this.b == bsu0Var.b && this.c == bsu0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkExecutorsConfig(isExperimentalImPoolEnabled=");
        sb.append(this.a);
        sb.append(", isExperimentalImagePoolEnabled=");
        sb.append(this.b);
        sb.append(", isExperimentalThreadPoolEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
