package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cpf0 implements fpf0 {
    public final dpf0 a;
    public final String b;

    public cpf0(dpf0 dpf0Var, String str) {
        this.a = dpf0Var;
        this.b = str;
    }

    @Override // defpackage.fpf0
    public final dpf0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpf0)) {
            return false;
        }
        cpf0 cpf0Var = (cpf0) obj;
        return this.a.equals(cpf0Var.a) && jl40.l(this.b, cpf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeeplinkArrowButtonClicked(actionInfo=" + this.a + ", deeplink=" + this.b + Extension.C_BRAKE;
    }
}
