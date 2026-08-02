package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nek0 implements zjk0 {
    public final String a;
    public final String b;
    public final xss0 c;
    public final ock0 d;
    public final akk0 e;

    public nek0(String str, String str2, xss0 xss0Var, ock0 ock0Var) {
        this.a = str;
        this.b = str2;
        this.c = xss0Var;
        this.d = ock0Var;
        this.e = qpa1.c(xss0Var, str2, EmptyList.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nek0)) {
            return false;
        }
        nek0 nek0Var = (nek0) obj;
        return jl40.l(this.a, nek0Var.a) && jl40.l(this.b, nek0Var.b) && this.c.equals(nek0Var.c) && jl40.l(this.d, nek0Var.d);
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
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardCompanionBufferSearchItemUiState(id=", this.a, ", analyticsId=", this.b, ", headerItemState=");
        v.append(this.c);
        v.append(", animationItemUiState=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
