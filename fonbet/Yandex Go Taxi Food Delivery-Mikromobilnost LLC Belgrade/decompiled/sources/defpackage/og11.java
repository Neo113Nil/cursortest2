package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.DeleteSettingsDto;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsDto;
import com.yandex.go.trusted_contacts.domain.entities.TrustedContactsMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class og11 {
    public final TrustedContactsMode a;
    public final int b;
    public final u7q0 c;
    public final u7q0 d;
    public final ShareSettingsDto e;
    public final DeleteSettingsDto f;
    public final gsh g;

    public og11(TrustedContactsMode trustedContactsMode, int i, u7q0 u7q0Var, u7q0 u7q0Var2, ShareSettingsDto shareSettingsDto, DeleteSettingsDto deleteSettingsDto, gsh gshVar) {
        this.a = trustedContactsMode;
        this.b = i;
        this.c = u7q0Var;
        this.d = u7q0Var2;
        this.e = shareSettingsDto;
        this.f = deleteSettingsDto;
        this.g = gshVar;
    }

    public static og11 a(og11 og11Var, TrustedContactsMode trustedContactsMode, u7q0 u7q0Var, u7q0 u7q0Var2, gsh gshVar, int i) {
        if ((i & 1) != 0) {
            trustedContactsMode = og11Var.a;
        }
        TrustedContactsMode trustedContactsMode2 = trustedContactsMode;
        int i2 = og11Var.b;
        if ((i & 4) != 0) {
            u7q0Var = og11Var.c;
        }
        u7q0 u7q0Var3 = u7q0Var;
        if ((i & 8) != 0) {
            u7q0Var2 = og11Var.d;
        }
        u7q0 u7q0Var4 = u7q0Var2;
        ShareSettingsDto shareSettingsDto = og11Var.e;
        DeleteSettingsDto deleteSettingsDto = og11Var.f;
        if ((i & 64) != 0) {
            gshVar = og11Var.g;
        }
        og11Var.getClass();
        return new og11(trustedContactsMode2, i2, u7q0Var3, u7q0Var4, shareSettingsDto, deleteSettingsDto, gshVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og11)) {
            return false;
        }
        og11 og11Var = (og11) obj;
        return this.a == og11Var.a && this.b == og11Var.b && jl40.l(this.c, og11Var.c) && jl40.l(this.d, og11Var.d) && jl40.l(this.e, og11Var.e) && jl40.l(this.f, og11Var.f) && jl40.l(this.g, og11Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31)) * 31;
        DeleteSettingsDto deleteSettingsDto = this.f;
        return this.g.hashCode() + ((hashCode + (deleteSettingsDto == null ? 0 : deleteSettingsDto.hashCode())) * 31);
    }

    public final String toString() {
        return "TrustedContactsData(mode=" + this.a + ", maxTrustedContacts=" + this.b + ", trustedContacts=" + this.c + ", trustingContacts=" + this.d + ", shareSettingsDto=" + this.e + ", deleteSettingsDto=" + this.f + ", deleteWarningState=" + this.g + Extension.C_BRAKE;
    }
}
