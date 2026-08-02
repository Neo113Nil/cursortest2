package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p4i {
    public static final p4i b = new p4i(null);
    public final String a;

    public p4i(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4i) && jl40.l(this.a, ((p4i) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("DeliveryDashboardFlowPayload(inputPoint=", this.a, Extension.C_BRAKE);
    }
}
