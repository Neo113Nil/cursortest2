package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fl1 {
    public final String a;
    public final String b;
    public final String c;
    public final AgreementImageEntity d;

    public fl1(String str, String str2, String str3, AgreementImageEntity agreementImageEntity) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = agreementImageEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl1)) {
            return false;
        }
        fl1 fl1Var = (fl1) obj;
        return jl40.l(this.a, fl1Var.a) && jl40.l(this.b, fl1Var.b) && jl40.l(this.c, fl1Var.c) && jl40.l(this.d, fl1Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        AgreementImageEntity agreementImageEntity = this.d;
        return b + (agreementImageEntity == null ? 0 : agreementImageEntity.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("AgreementSheetItemEntity(agreementId=", this.a, ", title=", this.b, ", description=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
