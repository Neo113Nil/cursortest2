package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gl1 {
    public final String a;
    public final String b;
    public final String c;
    public final AgreementImageEntity d;
    public final String e;
    public final String f;
    public final String g;
    public final ThemedImageUrlEntity h;
    public final UnconditionalLimitWidgetEntity i;

    public gl1(String str, String str2, String str3, AgreementImageEntity agreementImageEntity, String str4, String str5, String str6, ThemedImageUrlEntity themedImageUrlEntity, UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = agreementImageEntity;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = themedImageUrlEntity;
        this.i = unconditionalLimitWidgetEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl1)) {
            return false;
        }
        gl1 gl1Var = (gl1) obj;
        return jl40.l(this.a, gl1Var.a) && jl40.l(this.b, gl1Var.b) && jl40.l(this.c, gl1Var.c) && jl40.l(this.d, gl1Var.d) && jl40.l(this.e, gl1Var.e) && jl40.l(this.f, gl1Var.f) && jl40.l(this.g, gl1Var.g) && this.h.equals(gl1Var.h) && jl40.l(this.i, gl1Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        AgreementImageEntity agreementImageEntity = this.d;
        int hashCode = (b + (agreementImageEntity == null ? 0 : agreementImageEntity.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int c = xvz.c(this.h, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = this.i;
        return c + (unconditionalLimitWidgetEntity != null ? unconditionalLimitWidgetEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AgreementWithWidgetEntity(agreementId=", this.a, ", title=", this.b, ", description=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(", tooltip=");
        g8e.D(v, this.e, ", tooltipAction=", this.f, ", tooltipActionText=");
        v.append(this.g);
        v.append(", tooltipActionImage=");
        v.append(this.h);
        v.append(", widget=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
