package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jnk0 implements zjk0 {
    public final String a;
    public final String b;
    public final ink0 c;
    public final ink0 d;
    public final nqs0 e;
    public final akk0 f;

    public jnk0(String str, String str2, ink0 ink0Var, ink0 ink0Var2, ibk0 ibk0Var) {
        this.a = str;
        this.b = str2;
        this.c = ink0Var;
        this.d = ink0Var2;
        this.e = ibk0Var;
        this.f = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnk0)) {
            return false;
        }
        jnk0 jnk0Var = (jnk0) obj;
        return jl40.l(this.a, jnk0Var.a) && jl40.l(this.b, jnk0Var.b) && jl40.l(this.c, jnk0Var.c) && jl40.l(this.d, jnk0Var.d) && jl40.l(this.e, jnk0Var.e);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.f;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ink0 ink0Var = this.c;
        int hashCode3 = (hashCode2 + (ink0Var == null ? 0 : ink0Var.hashCode())) * 31;
        ink0 ink0Var2 = this.d;
        return this.e.hashCode() + ((hashCode3 + (ink0Var2 != null ? ink0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardSliderItemUiState(id=", this.a, ", analyticsId=", this.b, ", idleState=");
        v.append(this.c);
        v.append(", progressState=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
