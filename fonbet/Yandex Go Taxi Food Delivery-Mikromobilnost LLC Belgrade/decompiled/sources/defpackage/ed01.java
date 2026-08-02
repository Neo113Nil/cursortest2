package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ed01 {
    public final boolean a;
    public final ad01 b;

    public ed01(boolean z, ad01 ad01Var) {
        this.a = z;
        this.b = ad01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed01)) {
            return false;
        }
        ed01 ed01Var = (ed01) obj;
        return this.a == ed01Var.a && this.b.equals(ed01Var.b);
    }

    public final int hashCode() {
        return 0 + unr0.e(Boolean.hashCode(this.a) * 28629151, 31, false);
    }

    public final String toString() {
        return "TrainTariffItemUiState(id=, selected=" + this.a + ", title=null, description=null, warning=null, price=null, isEnabled=false, action=" + this.b + Extension.C_BRAKE;
    }
}
