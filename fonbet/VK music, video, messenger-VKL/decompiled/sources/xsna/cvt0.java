package xsna;

/* compiled from: ViewEventConfig.kt */
/* loaded from: classes6.dex */
public final class cvt0 {
    public final boolean a;
    public boolean b;

    public cvt0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvt0)) {
            return false;
        }
        cvt0 cvt0Var = (cvt0) obj;
        return this.a == cvt0Var.a && this.b == cvt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewEventConfig(isAutoTrackEnabled=");
        sb.append(this.a);
        sb.append(", isPollInited=");
        return n23.b(sb, this.b, ", isCustomTrackingSheduled=false)");
    }

    public cvt0(int i) {
        this.a = true;
        this.b = false;
    }
}
