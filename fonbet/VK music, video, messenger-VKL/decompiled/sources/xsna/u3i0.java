package xsna;

import xsna.sox;

/* compiled from: SeekPreviewLayoutState.kt */
/* loaded from: classes8.dex */
public final class u3i0 implements l2u0 {
    public static final u3i0 g = new u3i0(false, false, null, null, 0, 0);
    public final boolean a;
    public final boolean b;
    public final owo0 c;
    public final sox.a d;
    public final long e;
    public final long f;

    public u3i0(boolean z, boolean z2, owo0 owo0Var, sox.a aVar, long j, long j2) {
        this.a = z;
        this.b = z2;
        this.c = owo0Var;
        this.d = aVar;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3i0)) {
            return false;
        }
        u3i0 u3i0Var = (u3i0) obj;
        return this.a == u3i0Var.a && this.b == u3i0Var.b && epx.f(this.c, u3i0Var.c) && epx.f(this.d, u3i0Var.d) && this.e == u3i0Var.e && this.f == u3i0Var.f;
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        owo0 owo0Var = this.c;
        int hashCode = (b + (owo0Var == null ? 0 : owo0Var.hashCode())) * 31;
        sox.a aVar = this.d;
        return Long.hashCode(this.f) + bh10.a((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        StringBuilder c = gp.c("SeekPreviewLayoutState(isVisible=", ", isInAnimation=", ", timelineImages=", this.a, this.b);
        c.append(this.c);
        c.append(", interval=");
        c.append(this.d);
        c.append(", position=");
        c.append(this.e);
        return e630.c(c, ", duration=", this.f, ")");
    }
}
