package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e910 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final vfi0 c;
    public final PartnerEntity d;

    public e910(Text.Constant constant, Text.Constant constant2, vfi0 vfi0Var, PartnerEntity partnerEntity) {
        this.a = constant;
        this.b = constant2;
        this.c = vfi0Var;
        this.d = partnerEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e910)) {
            return false;
        }
        e910 e910Var = (e910) obj;
        return this.a.equals(e910Var.a) && this.b.equals(e910Var.b) && this.c.equals(e910Var.c) && this.d.equals(e910Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = ly3.u("Me2MeDebitInfoEntity(title=", this.a, ", description=", this.b, ", receiverInfo=");
        u.append(this.c);
        u.append(", ybInfo=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
