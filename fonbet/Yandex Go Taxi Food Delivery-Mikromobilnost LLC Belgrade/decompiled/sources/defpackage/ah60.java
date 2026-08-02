package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ah60 implements zwz0 {
    public final String a;

    public ah60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah60) && jl40.l(this.a, ((ah60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("NotificationCameraContent(distance=", this.a, Extension.C_BRAKE);
    }
}
