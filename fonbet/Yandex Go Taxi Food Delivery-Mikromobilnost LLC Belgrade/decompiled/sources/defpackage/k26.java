package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class k26 {
    public final String a;
    public final boolean b;
    public final m26 c;
    public final l26 d;
    public final p26 e;
    public final u26 f;

    public k26() {
        this((63 & 1) != 0 ? null : "", false, (63 & 4) != 0 ? null : m26.c, (63 & 8) != 0 ? null : l26.c, (63 & 16) == 0 ? p26.c : null, u26.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k26)) {
            return false;
        }
        k26 k26Var = (k26) obj;
        return jl40.l(this.a, k26Var.a) && this.b == k26Var.b && jl40.l(this.c, k26Var.c) && jl40.l(this.d, k26Var.d) && jl40.l(this.e, k26Var.e) && jl40.l(this.f, k26Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int e = unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        m26 m26Var = this.c;
        int hashCode = (e + (m26Var == null ? 0 : m26Var.hashCode())) * 31;
        l26 l26Var = this.d;
        int hashCode2 = (hashCode + (l26Var == null ? 0 : l26Var.hashCode())) * 31;
        p26 p26Var = this.e;
        return this.f.hashCode() + ((hashCode2 + (p26Var != null ? p26Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("BlePaymentBleSection(title=", this.a, ", isTitleHidden=", ", bluetoothPermissionState=", this.b);
        l.append(this.c);
        l.append(", bluetoothDisabledState=");
        l.append(this.d);
        l.append(", locationPermissionState=");
        l.append(this.e);
        l.append(", bleScanSettings=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public k26(String str, boolean z, m26 m26Var, l26 l26Var, p26 p26Var, u26 u26Var) {
        this.a = str;
        this.b = z;
        this.c = m26Var;
        this.d = l26Var;
        this.e = p26Var;
        this.f = u26Var;
    }
}
