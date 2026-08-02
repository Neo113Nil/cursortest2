package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class o73 {
    public final tk2 a;
    public final u2 b;
    public final ic0 c;
    public final yv d;
    public final lw e;

    public /* synthetic */ o73(tk2 tk2Var, u2 u2Var, ic0 ic0Var, yv yvVar) {
        this(tk2Var, u2Var, ic0Var, yvVar, new lw());
    }

    public final yv a() {
        return this.d;
    }

    public final lw b() {
        return this.e;
    }

    public final ic0 c() {
        return this.c;
    }

    public final tk2 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o73)) {
            return false;
        }
        o73 o73Var = (o73) obj;
        return epx.f(this.a, o73Var.a) && epx.f(this.b, o73Var.b) && epx.f(this.c, o73Var.c) && epx.f(this.d, o73Var.d) && epx.f(this.e, o73Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.a + ", adBlockDurationProvider=" + this.b + ", defaultContentDelayProvider=" + this.c + ", closableAdChecker=" + this.d + ", closeTimerProgressIncrementer=" + this.e + ")";
    }

    public o73(tk2 tk2Var, u2 u2Var, ic0 ic0Var, yv yvVar, lw lwVar) {
        this.a = tk2Var;
        this.b = u2Var;
        this.c = ic0Var;
        this.d = yvVar;
        this.e = lwVar;
    }
}
