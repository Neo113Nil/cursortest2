package xsna;

/* compiled from: AdPlaybackParams.kt */
/* loaded from: classes3.dex */
public final class wg0 {
    public final int a;
    public final boolean b;
    public final g8x c;

    public wg0() {
        this(0);
    }

    public static wg0 a(wg0 wg0Var, int i, boolean z, g8x g8xVar, int i2) {
        if ((i2 & 1) != 0) {
            i = wg0Var.a;
        }
        if ((i2 & 2) != 0) {
            z = wg0Var.b;
        }
        if ((i2 & 4) != 0) {
            g8xVar = wg0Var.c;
        }
        wg0Var.getClass();
        return new wg0(i, z, g8xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        return this.a == wg0Var.a && this.b == wg0Var.b && epx.f(this.c, wg0Var.c);
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        g8x g8xVar = this.c;
        return b + (g8xVar == null ? 0 : g8xVar.hashCode());
    }

    public final String toString() {
        return xqm0.g("<" + wg0.class.getSimpleName() + "> \n            actionTrigger: " + this.a + ",\n            playWhenReady: " + this.b + "\n        ");
    }

    public /* synthetic */ wg0(int i) {
        this(6, true, null);
    }

    public wg0(int i, boolean z, g8x g8xVar) {
        this.a = i;
        this.b = z;
        this.c = g8xVar;
    }
}
