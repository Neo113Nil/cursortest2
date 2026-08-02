package xsna;

/* compiled from: VkMixState.kt */
/* loaded from: classes16.dex */
public final class w4v0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public w4v0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4v0)) {
            return false;
        }
        w4v0 w4v0Var = (w4v0) obj;
        return this.a == w4v0Var.a && this.b == w4v0Var.b && this.c == w4v0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMixState(bottomPosition=");
        sb.append(this.a);
        sb.append(", isBackgroundHidden=");
        sb.append(this.b);
        sb.append(", isSingleCompactMix=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
