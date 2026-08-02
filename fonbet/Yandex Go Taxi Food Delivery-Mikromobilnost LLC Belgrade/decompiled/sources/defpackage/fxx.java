package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class fxx implements gxx {
    public final owx a;

    public /* synthetic */ fxx(owx owxVar) {
        this.a = owxVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fxx) {
            return jl40.l(this.a, ((fxx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response(response=" + this.a + Extension.C_BRAKE;
    }
}
