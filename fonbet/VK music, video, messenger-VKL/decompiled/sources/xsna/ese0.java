package xsna;

import java.util.concurrent.ExecutorService;

/* compiled from: QueueSyncManagerParams.kt */
/* loaded from: classes.dex */
public final class ese0 {
    public final t03 a;
    public final j55 b;
    public final ExecutorService c;
    public final wuj d;
    public final gzs<dox> e;

    public ese0() {
        throw null;
    }

    public ese0(t03 t03Var, j55 j55Var, ExecutorService executorService) {
        this.a = t03Var;
        this.b = j55Var;
        this.c = executorService;
        this.d = wuj.a;
        this.e = dse0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ese0)) {
            return false;
        }
        ese0 ese0Var = (ese0) obj;
        return epx.f(this.a, ese0Var.a) && epx.f(this.b, ese0Var.b) && epx.f(this.c, ese0Var.c) && epx.f(this.d, ese0Var.d) && epx.f(this.e, ese0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueSyncManagerParams(userIdProvider=");
        sb.append(this.a);
        sb.append(", apiManagerProvider=");
        sb.append(this.b);
        sb.append(", executor=");
        sb.append(this.c);
        sb.append(", queueLogger=");
        sb.append(this.d);
        sb.append(", interruptionLoggerProvider=");
        return uf3.d(sb, this.e, ')');
    }
}
