package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.models.CopySource;

/* loaded from: classes14.dex */
public final class n9k0 implements p9k0 {
    public final q48 a;
    public final CopySource b;
    public final m9k0 c;

    public n9k0(q48 q48Var, CopySource copySource, m9k0 m9k0Var) {
        this.a = q48Var;
        this.b = copySource;
        this.c = m9k0Var;
    }

    public static n9k0 c(n9k0 n9k0Var, m9k0 m9k0Var) {
        q48 q48Var = n9k0Var.a;
        CopySource copySource = n9k0Var.b;
        n9k0Var.getClass();
        return new n9k0(q48Var, copySource, m9k0Var);
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "open_car_info_copy";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9k0)) {
            return false;
        }
        n9k0 n9k0Var = (n9k0) obj;
        return jl40.l(this.a, n9k0Var.a) && this.b == n9k0Var.b && jl40.l(this.c, n9k0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        m9k0 m9k0Var = this.c;
        return hashCode + (m9k0Var == null ? 0 : m9k0Var.hashCode());
    }

    public final String toString() {
        return "OpenCarInfoCopy(data=" + this.a + ", copySource=" + this.b + ", popupShowParams=" + this.c + Extension.C_BRAKE;
    }
}
