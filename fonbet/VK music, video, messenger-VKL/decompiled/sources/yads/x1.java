package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class x1 {
    public final v9 a;
    public final d4 b;
    public final z9 c;
    public final ov2 d;
    public final x12 e;
    public final int f;
    public final qf0 g;

    public x1(v9 v9Var, d4 d4Var, z9 z9Var, ov2 ov2Var, x12 x12Var, int i, qf0 qf0Var) {
        this.a = v9Var;
        this.b = d4Var;
        this.c = z9Var;
        this.d = ov2Var;
        this.e = x12Var;
        this.f = i;
        this.g = qf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return epx.f(this.a, x1Var.a) && epx.f(this.b, x1Var.b) && epx.f(this.c, x1Var.c) && epx.f(this.d, x1Var.d) && epx.f(this.e, x1Var.e) && this.f == x1Var.f && epx.f(this.g, x1Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        x12 x12Var = this.e;
        int a = re3.a(this.f, (hashCode + (x12Var == null ? 0 : x12Var.hashCode())) * 31, 31);
        qf0 qf0Var = this.g;
        return a + (qf0Var != null ? qf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdActivityData(adResponse=" + this.a + ", adConfiguration=" + this.b + ", adResultReceiver=" + this.c + ", sdkEnvironmentModule=" + this.d + ", nativeAd=" + this.e + ", requestedOrientation=" + this.f + ", delegatedActivityLaunchInfo=" + this.g + ")";
    }

    public /* synthetic */ x1(v9 v9Var, d4 d4Var, z9 z9Var, ov2 ov2Var, x12 x12Var, int i, qf0 qf0Var, int i2) {
        this(v9Var, d4Var, z9Var, ov2Var, (i2 & 16) != 0 ? null : x12Var, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : qf0Var);
    }
}
