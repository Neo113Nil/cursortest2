package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nzl0 {
    public final String a;
    public final String b;
    public final String c;
    public final h5a0 d;
    public final AutoTopupType e;
    public final AutoTopupSwitchStatus f;
    public final mzl0 g;

    public nzl0(String str, String str2, String str3, h5a0 h5a0Var, AutoTopupType autoTopupType, AutoTopupSwitchStatus autoTopupSwitchStatus, mzl0 mzl0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = h5a0Var;
        this.e = autoTopupType;
        this.f = autoTopupSwitchStatus;
        this.g = mzl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzl0)) {
            return false;
        }
        nzl0 nzl0Var = (nzl0) obj;
        return jl40.l(this.a, nzl0Var.a) && jl40.l(this.b, nzl0Var.b) && jl40.l(this.c, nzl0Var.c) && jl40.l(this.d, nzl0Var.d) && this.e == nzl0Var.e && this.f == nzl0Var.f && jl40.l(this.g, nzl0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31;
        mzl0 mzl0Var = this.g;
        return hashCode + (mzl0Var == null ? 0 : mzl0Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("SaveAutoTopupInfo(agreementId=", this.a, ", amount=", this.b, ", threshold=");
        v.append(this.c);
        v.append(", paymentMethod=");
        v.append(this.d);
        v.append(", autoTopupType=");
        v.append(this.e);
        v.append(", autoTopupStatus=");
        v.append(this.f);
        v.append(", autoFundInfo=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
