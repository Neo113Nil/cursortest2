package defpackage;

import com.ybsdk.common.entities.UserIdentificationStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class kn21 {
    public final UserIdentificationStatusEntity a;
    public final String b;

    public kn21(UserIdentificationStatusEntity userIdentificationStatusEntity, String str) {
        this.a = userIdentificationStatusEntity;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn21)) {
            return false;
        }
        kn21 kn21Var = (kn21) obj;
        return this.a == kn21Var.a && jl40.l(this.b, kn21Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UserInfoEntity(identificationStatus=" + this.a + ", phoneNumber=" + this.b + Extension.C_BRAKE;
    }
}
