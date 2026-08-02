package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fmk0 implements zjk0 {
    public final String a;
    public final String b;
    public final kpf0 c;
    public final akk0 d;

    public fmk0(String str, String str2, kpf0 kpf0Var) {
        this.a = str;
        this.b = str2;
        this.c = kpf0Var;
        this.d = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmk0)) {
            return false;
        }
        fmk0 fmk0Var = (fmk0) obj;
        return jl40.l(this.a, fmk0Var.a) && jl40.l(this.b, fmk0Var.b) && this.c.equals(fmk0Var.c);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.d;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PromoPlaqueItemWrapper(id=", this.a, ", analyticsId=", this.b, ", item=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
