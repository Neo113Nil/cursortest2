package defpackage;

import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.domain.entities.UpgradeFormEntity$SecondDocumentType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ja21 {
    public static final ja21 i = new ja21("", "", "", "", "", "", "", UpgradeFormEntity$SecondDocumentType.SNILS_OR_INN);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final UpgradeFormEntity$SecondDocumentType h;

    public ja21(String str, String str2, String str3, String str4, String str5, String str6, String str7, UpgradeFormEntity$SecondDocumentType upgradeFormEntity$SecondDocumentType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = upgradeFormEntity$SecondDocumentType;
    }

    public static ja21 a(ja21 ja21Var, String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        if ((i2 & 1) != 0) {
            str = ja21Var.a;
        }
        String str7 = str;
        if ((i2 & 2) != 0) {
            str2 = ja21Var.b;
        }
        String str8 = str2;
        if ((i2 & 4) != 0) {
            str3 = ja21Var.c;
        }
        String str9 = str3;
        if ((i2 & 8) != 0) {
            str4 = ja21Var.d;
        }
        String str10 = str4;
        if ((i2 & 16) != 0) {
            str5 = ja21Var.e;
        }
        String str11 = str5;
        String str12 = (i2 & 32) != 0 ? ja21Var.f : str6;
        String str13 = ja21Var.g;
        UpgradeFormEntity$SecondDocumentType upgradeFormEntity$SecondDocumentType = ja21Var.h;
        ja21Var.getClass();
        return new ja21(str7, str8, str9, str10, str11, str12, str13, upgradeFormEntity$SecondDocumentType);
    }

    public final String b(SimpleIdFormFieldEntity simpleIdFormFieldEntity) {
        switch (ia21.a[simpleIdFormFieldEntity.ordinal()]) {
            case 1:
                return this.a;
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.e;
            case 5:
                return this.d;
            case 6:
                return this.f;
            default:
                w511.b();
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja21)) {
            return false;
        }
        ja21 ja21Var = (ja21) obj;
        return this.a.equals(ja21Var.a) && this.b.equals(ja21Var.b) && this.c.equals(ja21Var.c) && this.d.equals(ja21Var.d) && this.e.equals(ja21Var.e) && this.f.equals(ja21Var.f) && this.g.equals(ja21Var.g) && this.h == ja21Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("UpgradeFormEntity(firstName=", this.a, ", lastName=", this.b, ", middleName=");
        g8e.D(v, this.c, ", passportNumber=", this.d, ", birthday=");
        g8e.D(v, this.e, ", innOrSnils=", this.f, ", applicationId=");
        v.append(this.g);
        v.append(", secondDocument=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
