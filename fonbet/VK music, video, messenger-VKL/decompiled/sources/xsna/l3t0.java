package xsna;

import one.video.pip.actions.VideoPipActionType;

/* compiled from: VideoPipAction.kt */
/* loaded from: classes8.dex */
public final class l3t0 {
    public final VideoPipActionType a;
    public final int b;
    public final int c;
    public final boolean d;

    public l3t0(VideoPipActionType videoPipActionType, int i, int i2, boolean z) {
        this.a = videoPipActionType;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3t0)) {
            return false;
        }
        l3t0 l3t0Var = (l3t0) obj;
        return this.a == l3t0Var.a && this.b == l3t0Var.b && this.c == l3t0Var.c && this.d == l3t0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "VideoPipAction(type=" + this.a + ", icon=" + this.b + ", description=" + this.c + ", enabled=" + this.d + ")";
    }
}
