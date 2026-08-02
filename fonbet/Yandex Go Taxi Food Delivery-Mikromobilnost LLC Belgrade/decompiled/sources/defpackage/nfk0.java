package defpackage;

import java.util.ArrayList;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nfk0 implements zjk0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final akk0 e;

    public nfk0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfk0)) {
            return false;
        }
        nfk0 nfk0Var = (nfk0) obj;
        return jl40.l(this.a, nfk0Var.a) && jl40.l(this.b, nfk0Var.b) && this.c.equals(nfk0Var.c) && this.d.equals(nfk0Var.d);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ly3.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardCostBreakdownItemUiState(id=", this.a, ", analyticsId=", this.b, ", costBreakdownItems=");
        v.append(this.c);
        v.append(", extraMessage=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
