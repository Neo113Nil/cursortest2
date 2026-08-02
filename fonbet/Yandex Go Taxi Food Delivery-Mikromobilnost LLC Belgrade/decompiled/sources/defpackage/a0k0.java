package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.PointType;

/* loaded from: classes5.dex */
public final class a0k0 implements b0k0 {
    public final String a;
    public final PointType b;

    public a0k0(String str, PointType pointType) {
        this.a = str;
        this.b = pointType;
    }

    @Override // defpackage.b0k0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0k0)) {
            return false;
        }
        a0k0 a0k0Var = (a0k0) obj;
        return jl40.l(this.a, a0k0Var.a) && this.b == a0k0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClientStateAddressPosition(formStateKey=" + this.a + ", pointType=" + this.b + Extension.C_BRAKE;
    }
}
