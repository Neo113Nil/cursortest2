package xsna;

/* compiled from: PreloadAndPlayConfig.kt */
/* loaded from: classes2.dex */
public final class r0d0 {
    public final Integer a;
    public final boolean b;

    public r0d0() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0d0)) {
            return false;
        }
        r0d0 r0d0Var = (r0d0) obj;
        return epx.f(this.a, r0d0Var.a) && this.b == r0d0Var.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadAndPlayConfig(targetPosition=");
        sb.append(this.a);
        sb.append(", delayDisabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public /* synthetic */ r0d0(int i) {
        this((i & 2) == 0, null);
    }

    public r0d0(boolean z, Integer num) {
        this.a = num;
        this.b = z;
    }
}
