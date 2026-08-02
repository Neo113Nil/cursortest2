package xsna;

import xsna.zno;

/* compiled from: measureTime.kt */
/* loaded from: classes8.dex */
public final class cwo0<T> {
    public final Boolean a;
    public final long b;

    public cwo0() {
        throw null;
    }

    public cwo0(long j, Boolean bool) {
        this.a = bool;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwo0)) {
            return false;
        }
        cwo0 cwo0Var = (cwo0) obj;
        return epx.f(this.a, cwo0Var.a) && zno.d(this.b, cwo0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = bool == null ? 0 : bool.hashCode();
        zno.a aVar = zno.c;
        return Long.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) zno.m(this.b)) + ')';
    }
}
