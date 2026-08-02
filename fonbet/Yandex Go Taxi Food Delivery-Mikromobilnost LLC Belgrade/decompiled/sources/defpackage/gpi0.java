package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gpi0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final ThemedImageUrlEntity c;
    public final PageImageHeaderEntity d;
    public final ActionButtonEntity e;
    public final String f;

    public gpi0(Text.Constant constant, Text.Constant constant2, ThemedImageUrlEntity themedImageUrlEntity, PageImageHeaderEntity pageImageHeaderEntity, ActionButtonEntity actionButtonEntity, String str) {
        this.a = constant;
        this.b = constant2;
        this.c = themedImageUrlEntity;
        this.d = pageImageHeaderEntity;
        this.e = actionButtonEntity;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpi0)) {
            return false;
        }
        gpi0 gpi0Var = (gpi0) obj;
        return this.a.equals(gpi0Var.a) && this.b.equals(gpi0Var.b) && this.c.equals(gpi0Var.c) && this.d.equals(gpi0Var.d) && this.e.equals(gpi0Var.e) && jl40.l(this.f, gpi0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + xvz.c(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder u = ly3.u("RefreshInfoEntity(title=", this.a, ", description=", this.b, ", image=");
        u.append(this.c);
        u.append(", header=");
        u.append(this.d);
        u.append(", button=");
        u.append(this.e);
        u.append(", paymentServiceId=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
