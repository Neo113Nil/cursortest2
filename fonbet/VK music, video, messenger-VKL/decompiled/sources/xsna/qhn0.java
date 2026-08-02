package xsna;

/* compiled from: SuperappVendorConfig.kt */
/* loaded from: classes11.dex */
public final class qhn0 {
    public final bpn0 a;

    public qhn0(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhn0) && this.a.equals(((qhn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuperappVendorConfig(deviceIdProviders=" + this.a + ')';
    }
}
