package defpackage;

import com.ybsdk.feature.autotopup.api.data.AutoTopupUserStatus;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n04 {
    public final String a;
    public final String b;
    public final usz0 c;
    public final rr51 d;
    public final b24 e;
    public final nr3 f;
    public final h5a0 g;
    public final iaa0 h;
    public final mmo i;
    public final AutoTopupUserStatus j;
    public final List k;
    public final zw3 l;

    public n04(String str, String str2, usz0 usz0Var, rr51 rr51Var, b24 b24Var, nr3 nr3Var, h5a0 h5a0Var, iaa0 iaa0Var, mmo mmoVar, AutoTopupUserStatus autoTopupUserStatus, List list, zw3 zw3Var) {
        this.a = str;
        this.b = str2;
        this.c = usz0Var;
        this.d = rr51Var;
        this.e = b24Var;
        this.f = nr3Var;
        this.g = h5a0Var;
        this.h = iaa0Var;
        this.i = mmoVar;
        this.j = autoTopupUserStatus;
        this.k = list;
        this.l = zw3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n04)) {
            return false;
        }
        n04 n04Var = (n04) obj;
        return jl40.l(this.a, n04Var.a) && jl40.l(this.b, n04Var.b) && jl40.l(this.c, n04Var.c) && jl40.l(this.d, n04Var.d) && this.e.equals(n04Var.e) && this.f.equals(n04Var.f) && jl40.l(this.g, n04Var.g) && this.h.equals(n04Var.h) && this.i.equals(n04Var.i) && this.j == n04Var.j && this.k.equals(n04Var.k) && jl40.l(this.l, n04Var.l);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        usz0 usz0Var = this.c;
        int hashCode3 = (hashCode2 + (usz0Var == null ? 0 : usz0Var.hashCode())) * 31;
        rr51 rr51Var = this.d;
        int hashCode4 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31)) * 31)) * 31;
        h5a0 h5a0Var = this.g;
        int hashCode5 = (this.i.hashCode() + ((this.h.hashCode() + ((hashCode4 + (h5a0Var == null ? 0 : h5a0Var.hashCode())) * 31)) * 31)) * 31;
        AutoTopupUserStatus autoTopupUserStatus = this.j;
        int c = unr0.c((hashCode5 + (autoTopupUserStatus == null ? 0 : autoTopupUserStatus.hashCode())) * 31, 31, this.k);
        zw3 zw3Var = this.l;
        return c + (zw3Var != null ? zw3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AutoTopupSetupV2Entity(autoTopupId=", this.a, ", agreementId=", this.b, ", toolbarEntity=");
        v.append(this.c);
        v.append(", contentMainBlockDiv=");
        v.append(this.d);
        v.append(", autoTopupEntity=");
        v.append(this.e);
        v.append(", autoFundEntity=");
        v.append(this.f);
        v.append(", selectedPaymentMethod=");
        v.append(this.g);
        v.append(", paymentMethods=");
        v.append(this.h);
        v.append(", exitBottomSheet=");
        v.append(this.i);
        v.append(", userStatus=");
        v.append(this.j);
        v.append(", fullScreens=");
        v.append(this.k);
        v.append(", prefill=");
        v.append(this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
