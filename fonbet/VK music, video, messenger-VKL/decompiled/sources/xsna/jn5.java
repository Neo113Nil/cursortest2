package xsna;

import io.opentelemetry.api.logs.Severity;

/* compiled from: AutoValue_LoggerConfig.java */
/* loaded from: classes8.dex */
public final class jn5 extends u100 {
    public final boolean b;
    public final Severity c;

    public jn5(boolean z, Severity severity) {
        this.b = z;
        if (severity == null) {
            throw new NullPointerException("Null minimumSeverity");
        }
        this.c = severity;
    }

    @Override // xsna.u100
    public final Severity a() {
        return this.c;
    }

    @Override // xsna.u100
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.u100
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u100)) {
            return false;
        }
        u100 u100Var = (u100) obj;
        return this.b == u100Var.b() && this.c.equals(u100Var.a()) && !u100Var.c();
    }

    public final int hashCode() {
        return (((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "LoggerConfig{enabled=" + this.b + ", minimumSeverity=" + this.c + ", traceBased=false}";
    }
}
