package xsna;

/* compiled from: Service.kt */
@vby
/* loaded from: classes3.dex */
public final class yni0 {
    public final byte a;

    public static String a(byte b) {
        return uqi.a("Service(code=", b, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yni0) {
            return this.a == ((yni0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
