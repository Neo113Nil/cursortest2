package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class klk0 implements zjk0 {
    public final String a;
    public final String b;
    public final jlk0 c;
    public final css0 d;
    public final tss0 e;
    public final nqs0 f;
    public final boolean g;
    public final kdc h;
    public final akk0 i;

    public klk0(String str, String str2, jlk0 jlk0Var, css0 css0Var, tss0 tss0Var, nqs0 nqs0Var, boolean z, kdc kdcVar) {
        this.a = str;
        this.b = str2;
        this.c = jlk0Var;
        this.d = css0Var;
        this.e = tss0Var;
        this.f = nqs0Var;
        this.g = z;
        this.h = kdcVar;
        this.i = qpa1.e(str2, EmptyList.a, nqs0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klk0)) {
            return false;
        }
        klk0 klk0Var = (klk0) obj;
        return jl40.l(this.a, klk0Var.a) && jl40.l(this.b, klk0Var.b) && this.c.equals(klk0Var.c) && jl40.l(this.d, klk0Var.d) && jl40.l(this.e, klk0Var.e) && jl40.l(this.f, klk0Var.f) && this.g == klk0Var.g && jl40.l(this.h, klk0Var.h);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.i;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.h.hashCode() + unr0.e((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardPaymentItemUiState(id=", this.a, ", analyticsId=", this.b, ", leadDelegate=");
        v.append(this.c);
        v.append(", body=");
        v.append(this.d);
        v.append(", trail=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(", isLoading=");
        v.append(this.g);
        v.append(", backgroundColor=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
