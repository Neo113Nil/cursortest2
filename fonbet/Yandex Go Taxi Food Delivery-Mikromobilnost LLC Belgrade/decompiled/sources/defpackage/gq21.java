package defpackage;

import com.yandex.go.domain.entities.UserPhotoButtonAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gq21 {
    public final String a;
    public final String b;
    public final kdc c;
    public final kdc d;
    public final UserPhotoButtonAction e;

    public gq21(String str, String str2, kdc kdcVar, kdc kdcVar2, UserPhotoButtonAction userPhotoButtonAction) {
        this.a = str;
        this.b = str2;
        this.c = kdcVar;
        this.d = kdcVar2;
        this.e = userPhotoButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq21)) {
            return false;
        }
        gq21 gq21Var = (gq21) obj;
        return jl40.l(this.a, gq21Var.a) && jl40.l(this.b, gq21Var.b) && jl40.l(this.c, gq21Var.c) && jl40.l(this.d, gq21Var.d) && this.e == gq21Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + smw0.d(this.d, smw0.d(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("UserPhotoButton(text=", this.a, ", unavailableText=", this.b, ", color=");
        v.append(this.c);
        v.append(", textColor=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
