package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.l;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class em01 {
    public final gu01 a;
    public final rbv b;
    public final qc70 c;
    public final String d;
    public final String e;
    public final YbButtonView.a f;
    public final String g;

    public em01(gu01 gu01Var, rbv rbvVar, l lVar, String str, String str2, YbButtonView.a aVar, String str3) {
        this.a = gu01Var;
        this.b = rbvVar;
        this.c = lVar;
        this.d = str;
        this.e = str2;
        this.f = aVar;
        this.g = str3;
    }

    public final YbButtonView.a a() {
        return this.f;
    }

    public final String b() {
        return this.e;
    }

    public final rbv c() {
        return this.b;
    }

    public final String d() {
        return this.g;
    }

    public final qc70 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em01)) {
            return false;
        }
        em01 em01Var = (em01) obj;
        return this.a.equals(em01Var.a) && this.b.equals(em01Var.b) && jl40.l(this.c, em01Var.c) && jl40.l(this.d, em01Var.d) && jl40.l(this.e, em01Var.e) && this.f.equals(em01Var.f) && jl40.l(this.g, em01Var.g);
    }

    public final String f() {
        return this.d;
    }

    public final gu01 g() {
        return this.a;
    }

    public final int hashCode() {
        int c = ly3.c(this.b, this.a.hashCode() * 31, 31);
        qc70 qc70Var = this.c;
        int e = unr0.e((this.f.hashCode() + unr0.b(unr0.b((c + (qc70Var == null ? 0 : qc70Var.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31, false);
        String str = this.g;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferMe2MeConfirmPullSuccessViewState(toolbar=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", progressBar=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", confirmButton=");
        sb.append(this.f);
        sb.append(", isButtonProgressVisible=false, legalState=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
