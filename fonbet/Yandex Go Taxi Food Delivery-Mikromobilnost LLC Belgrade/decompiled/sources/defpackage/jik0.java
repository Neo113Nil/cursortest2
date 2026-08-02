package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jik0 implements zjk0 {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final String b;
    public final String c;
    public final ogk0 d;
    public final hgk0 e;
    public final ibk0 f;
    public final akk0 g;

    static {
        hgk0 hgk0Var = hgk0.c;
        ogk0 ogk0Var = ogk0.b;
    }

    public jik0(String str, String str2, String str3, ogk0 ogk0Var, hgk0 hgk0Var, ibk0 ibk0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ogk0Var;
        this.e = hgk0Var;
        this.f = ibk0Var;
        this.g = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jik0)) {
            return false;
        }
        jik0 jik0Var = (jik0) obj;
        return jl40.l(this.a, jik0Var.a) && jl40.l(this.b, jik0Var.b) && jl40.l(this.c, jik0Var.c) && jl40.l(this.d, jik0Var.d) && jl40.l(this.e, jik0Var.e) && jl40.l(this.f, jik0Var.f);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.g;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.a.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardDriverSimpleItemUiState(id=", this.a, ", analyticsId=", this.b, ", contentDescription=");
        v.append(this.c);
        v.append(", carIconState=");
        v.append(this.d);
        v.append(", avatarState=");
        v.append(this.e);
        v.append(", driverClickAction=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
