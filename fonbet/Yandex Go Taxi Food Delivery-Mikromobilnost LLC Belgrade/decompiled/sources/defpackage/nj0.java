package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes8.dex */
public final class nj0 extends vi0 {
    public final SharedAccountType a;
    public final tmr0 b;

    public nj0(SharedAccountType sharedAccountType, tmr0 tmr0Var) {
        this.a = sharedAccountType;
        this.b = tmr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nj0 nj0Var = (nj0) obj;
        tmr0 tmr0Var = nj0Var.b;
        if (this.a != nj0Var.a) {
            return false;
        }
        tmr0 tmr0Var2 = this.b;
        return jl40.l(tmr0Var2.d, tmr0Var.d) && jl40.l(tmr0Var2.b, tmr0Var.b) && tmr0Var2.h == tmr0Var.h && jl40.l(tmr0Var2.i, tmr0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tmr0 tmr0Var = this.b;
        return tmr0Var.i.hashCode() + unr0.e(unr0.b(unr0.b(hashCode, 31, tmr0Var.d), 31, tmr0Var.b), 31, tmr0Var.h);
    }

    public final String toString() {
        return "AddSharedPayment(disabled=null, type=" + this.a + ", accountTypeDescription=" + this.b + Extension.C_BRAKE;
    }
}
