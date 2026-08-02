package defpackage;

/* loaded from: classes2.dex */
public final class ode implements qde {
    public final String a;
    public final String b;

    public ode(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ode)) {
            return false;
        }
        ode odeVar = (ode) obj;
        return jl40.l(this.a, odeVar.a) && jl40.l(this.b, odeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, 10000L), 31, 10000L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(webPageUrl=");
        sb.append(this.a);
        sb.append(", startedTimeoutMillis=10000, loadedTimeoutMillis=10000, skipButtonText=");
        return b64.p(sb, this.b, ')');
    }
}
