package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mqs {
    public final stz0 a;
    public final rr51 b;
    public final kao c;
    public final boolean d;

    public mqs(stz0 stz0Var, rr51 rr51Var, kao kaoVar, int i) {
        rr51Var = (i & 2) != 0 ? null : rr51Var;
        kaoVar = (i & 4) != 0 ? null : kaoVar;
        boolean z = (i & 8) == 0;
        this.a = stz0Var;
        this.b = rr51Var;
        this.c = kaoVar;
        this.d = z;
    }

    public final rr51 a() {
        return this.b;
    }

    public final kao b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final stz0 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqs)) {
            return false;
        }
        mqs mqsVar = (mqs) obj;
        return this.a.equals(mqsVar.a) && jl40.l(this.b, mqsVar.b) && jl40.l(this.c, mqsVar.c) && this.d == mqsVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rr51 rr51Var = this.b;
        int hashCode2 = (hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        kao kaoVar = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (kaoVar != null ? kaoVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FuturePaymentsViewState(toolbarViewState=" + this.a + ", dvikitViewData=" + this.b + ", errorViewState=" + this.c + ", shimmerVisible=" + this.d + Extension.C_BRAKE;
    }
}
