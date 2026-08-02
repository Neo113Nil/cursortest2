package xsna;

/* compiled from: FlipperConfig.kt */
/* loaded from: classes18.dex */
public final class xpr {
    public final boolean a;

    public xpr(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xpr) && this.a == ((xpr) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("FlipperConfig(isLayoutPluginEnabled="), this.a, ')');
    }
}
