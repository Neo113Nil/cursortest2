package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cpk0 implements zjk0 {
    public final String a;
    public final String b;
    public final xss0 c;
    public final List d;
    public final akk0 e;

    public cpk0(String str, String str2, xss0 xss0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = xss0Var;
        this.d = list;
        this.e = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpk0)) {
            return false;
        }
        cpk0 cpk0Var = (cpk0) obj;
        return jl40.l(this.a, cpk0Var.a) && jl40.l(this.b, cpk0Var.b) && jl40.l(this.c, cpk0Var.c) && jl40.l(this.d, cpk0Var.d);
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
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        xss0 xss0Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (xss0Var != null ? xss0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardTipsSelectorItemUiState(id=", this.a, ", analyticsId=", this.b, ", preferredTipsSubscription=");
        v.append(this.c);
        v.append(", elements=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
