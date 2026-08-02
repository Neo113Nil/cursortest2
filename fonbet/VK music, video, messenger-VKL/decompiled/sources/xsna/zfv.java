package xsna;

/* compiled from: Host.kt */
/* loaded from: classes2.dex */
public final class zfv {
    public final String a;

    public zfv(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfv) && epx.f(this.a, ((zfv) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(443) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return zr.a("Host(host=", this.a, ", port=443)");
    }
}
