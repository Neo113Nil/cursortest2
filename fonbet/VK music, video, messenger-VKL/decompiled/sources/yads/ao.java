package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public abstract class ao {
    public final e13 a;

    public ao(e13 e13Var) {
        this.a = e13Var;
    }

    public final e13 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ao) && epx.f(((ao) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
