package defpackage;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hv11 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final UltimaModeResponse d;

    public hv11(boolean z, boolean z2, String str, UltimaModeResponse ultimaModeResponse) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = ultimaModeResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv11)) {
            return false;
        }
        hv11 hv11Var = (hv11) obj;
        return this.a == hv11Var.a && this.b == hv11Var.b && jl40.l(this.c, hv11Var.c) && jl40.l(this.d, hv11Var.d);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("UltimaModeInfo(available=", ", manuallyDisabled=", ", state=", this.a, this.b);
        u.append(this.c);
        u.append(", ultimaMode=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
