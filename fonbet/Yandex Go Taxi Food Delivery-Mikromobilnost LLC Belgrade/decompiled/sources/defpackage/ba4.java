package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.RegularAutotopupEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ba4 {
    public final String a;
    public final String b;
    public final String c;
    public final SaveAutoTopupRequest d;
    public final aa4 e;
    public final String f;
    public final RegularAutotopupEntity g;

    public ba4(String str, String str2, String str3, SaveAutoTopupRequest saveAutoTopupRequest, aa4 aa4Var, String str4, RegularAutotopupEntity regularAutotopupEntity) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = saveAutoTopupRequest;
        this.e = aa4Var;
        this.f = str4;
        this.g = regularAutotopupEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba4)) {
            return false;
        }
        ba4 ba4Var = (ba4) obj;
        return jl40.l(this.a, ba4Var.a) && jl40.l(this.b, ba4Var.b) && jl40.l(this.c, ba4Var.c) && jl40.l(this.d, ba4Var.d) && jl40.l(this.e, ba4Var.e) && jl40.l(this.f, ba4Var.f) && jl40.l(this.g, ba4Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        SaveAutoTopupRequest saveAutoTopupRequest = this.d;
        int hashCode2 = (b + (saveAutoTopupRequest == null ? 0 : saveAutoTopupRequest.hashCode())) * 31;
        aa4 aa4Var = this.e;
        int hashCode3 = (hashCode2 + (aa4Var == null ? 0 : aa4Var.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RegularAutotopupEntity regularAutotopupEntity = this.g;
        return hashCode4 + (regularAutotopupEntity != null ? regularAutotopupEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AutotopupResultPaymentData(agreementId=", this.a, ", source=", this.b, ", type=");
        v.append(this.c);
        v.append(", saveAutoTopupRequest=");
        v.append(this.d);
        v.append(", loadingData=");
        v.append(this.e);
        v.append(", failedPaymentId=");
        v.append(this.f);
        v.append(", regularAutotopupInfo=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
