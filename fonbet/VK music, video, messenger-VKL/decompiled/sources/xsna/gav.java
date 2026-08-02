package xsna;

/* loaded from: classes8.dex */
public final class gav {
    public final String a;

    public gav(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gav) && epx.f(this.a, ((gav) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr.a("HoldModeToggleError(description=", this.a, ")");
    }
}
