package xsna;

import xsna.k9d0;

/* compiled from: WhiteboardActionsState.kt */
/* loaded from: classes7.dex */
public final class jlx0 {
    public final boolean a;
    public final k9d0.b b;
    public final k9d0.c c;
    public final k9d0.e d;
    public final k9d0.d e;
    public final k9d0.f f;

    public jlx0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlx0)) {
            return false;
        }
        jlx0 jlx0Var = (jlx0) obj;
        return this.a == jlx0Var.a && epx.f(this.b, jlx0Var.b) && epx.f(this.c, jlx0Var.c) && epx.f(this.d, jlx0Var.d) && epx.f(this.e, jlx0Var.e) && epx.f(this.f, jlx0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WhiteboardActionsState(isVisible=" + this.a + ", feedbackState=" + this.b + ", ownCameraState=" + this.c + ", ownMicState=" + this.d + ", ownHandState=" + this.e + ", speakerState=" + this.f + ')';
    }

    public jlx0(boolean z, k9d0.b bVar, k9d0.c cVar, k9d0.e eVar, k9d0.d dVar, k9d0.f fVar) {
        this.a = z;
        this.b = bVar;
        this.c = cVar;
        this.d = eVar;
        this.e = dVar;
        this.f = fVar;
    }

    public /* synthetic */ jlx0(int i) {
        this(true, new k9d0.b(0), new k9d0.c(false, false), new k9d0.e(false, false), new k9d0.d(false, false, false), new k9d0.f(false, false));
    }
}
