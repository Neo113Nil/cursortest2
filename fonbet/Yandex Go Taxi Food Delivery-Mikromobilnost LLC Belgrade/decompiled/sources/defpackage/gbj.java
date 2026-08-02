package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class gbj {
    public static final fbj Companion = new fbj();
    public final String a;

    public /* synthetic */ gbj(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ebj.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbj) && jl40.l(this.a, ((gbj) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("DeviceInfoResponse(appMetricaDeviceId=", this.a, Extension.C_BRAKE);
    }

    public gbj(String str) {
        this.a = str;
    }
}
