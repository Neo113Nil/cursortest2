package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class iyu {
    public final List a;
    public final kz6 b;

    public iyu(List list, kz6 kz6Var) {
        this.a = list;
        this.b = kz6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyu)) {
            return false;
        }
        iyu iyuVar = (iyu) obj;
        return jl40.l(this.a, iyuVar.a) && jl40.l(this.b, iyuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kz6 kz6Var = this.b;
        return hashCode + (kz6Var == null ? 0 : kz6Var.hashCode());
    }

    public final String toString() {
        return "HubFooterV2UiState(onboarding=null, filters=" + this.a + ", buttonContainer=" + this.b + Extension.C_BRAKE;
    }
}
