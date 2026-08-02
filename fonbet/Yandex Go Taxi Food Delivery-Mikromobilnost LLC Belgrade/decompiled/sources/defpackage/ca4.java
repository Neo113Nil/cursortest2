package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupRetryPaymentEntity$StatusDataEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ca4 {
    public final Text a;
    public final Text b;
    public final ThemedImageUrlEntity c;
    public final AutotopupRetryPaymentEntity$StatusDataEntity$Status d;
    public final ActionButtonEntity e;

    public ca4(Text text, Text text2, ThemedImageUrlEntity themedImageUrlEntity, AutotopupRetryPaymentEntity$StatusDataEntity$Status autotopupRetryPaymentEntity$StatusDataEntity$Status, ActionButtonEntity actionButtonEntity) {
        this.a = text;
        this.b = text2;
        this.c = themedImageUrlEntity;
        this.d = autotopupRetryPaymentEntity$StatusDataEntity$Status;
        this.e = actionButtonEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca4)) {
            return false;
        }
        ca4 ca4Var = (ca4) obj;
        return jl40.l(this.a, ca4Var.a) && jl40.l(this.b, ca4Var.b) && this.c.equals(ca4Var.c) && this.d == ca4Var.d && this.e.equals(ca4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + xvz.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("StatusDataEntity(title=", this.a, ", description=", this.b, ", logo=");
        p.append(this.c);
        p.append(", status=");
        p.append(this.d);
        p.append(", primaryButton=");
        p.append(this.e);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
