package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class awo {
    public final od5 a;
    public final od5 b;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public awo(od5 od5Var, od5 od5Var2) {
        this.a = od5Var;
        this.b = od5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awo)) {
            return false;
        }
        awo awoVar = (awo) obj;
        return jl40.l(this.a, awoVar.a) && jl40.l(this.b, awoVar.b);
    }

    public final int hashCode() {
        od5 od5Var = this.a;
        int hashCode = (od5Var == null ? 0 : od5Var.hashCode()) * 31;
        od5 od5Var2 = this.b;
        return hashCode + (od5Var2 != null ? od5Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ConfirmationWindowActionModel(mainScreen=" + this.a + ", alertPopup=" + this.b + Extension.C_BRAKE;
    }
}
