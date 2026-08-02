package defpackage;

import com.ybsdk.feature.nfc.api.models.NfcPaymentMethod;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ecf0 implements jcf0 {
    public final h7f0 a;
    public final List b;
    public final rr51 c;
    public final rr51 d;
    public final rb6 e;
    public final NfcPaymentMethod f;
    public final e960 g;
    public final boolean h;
    public final lj11 i;
    public final yon j;
    public final boolean k;
    public final boolean l;
    public final rbf0 m;
    public final rbf0 n;

    public ecf0(h7f0 h7f0Var, List list, rr51 rr51Var, rr51 rr51Var2, rb6 rb6Var, NfcPaymentMethod nfcPaymentMethod, e960 e960Var, boolean z, lj11 lj11Var, yon yonVar, boolean z2, boolean z3, rbf0 rbf0Var, rbf0 rbf0Var2) {
        this.a = h7f0Var;
        this.b = list;
        this.c = rr51Var;
        this.d = rr51Var2;
        this.e = rb6Var;
        this.f = nfcPaymentMethod;
        this.g = e960Var;
        this.h = z;
        this.i = lj11Var;
        this.j = yonVar;
        this.k = z2;
        this.l = z3;
        this.m = rbf0Var;
        this.n = rbf0Var2;
    }

    @Override // defpackage.jcf0
    public final rb6 a() {
        return this.e;
    }

    @Override // defpackage.jcf0
    public final rbf0 b() {
        return this.m;
    }

    @Override // defpackage.jcf0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.jcf0
    public final boolean d() {
        return this.k;
    }

    @Override // defpackage.jcf0
    public final kao e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecf0)) {
            return false;
        }
        ecf0 ecf0Var = (ecf0) obj;
        return this.a.equals(ecf0Var.a) && this.b.equals(ecf0Var.b) && jl40.l(this.c, ecf0Var.c) && jl40.l(this.d, ecf0Var.d) && this.e.equals(ecf0Var.e) && jl40.l(this.f, ecf0Var.f) && jl40.l(this.g, ecf0Var.g) && this.h == ecf0Var.h && jl40.l(this.i, ecf0Var.i) && jl40.l(this.j, ecf0Var.j) && this.k == ecf0Var.k && this.l == ecf0Var.l && jl40.l(this.m, ecf0Var.m) && jl40.l(this.n, ecf0Var.n);
    }

    @Override // defpackage.jcf0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.jcf0
    public final boolean g() {
        return this.l;
    }

    @Override // defpackage.jcf0
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        int c = unr0.c(this.a.a.hashCode() * 31, 31, this.b);
        rr51 rr51Var = this.c;
        int hashCode = (c + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        rr51 rr51Var2 = this.d;
        int b = ly3.b((hashCode + (rr51Var2 == null ? 0 : rr51Var2.hashCode())) * 31, 31, this.e.a);
        NfcPaymentMethod nfcPaymentMethod = this.f;
        int hashCode2 = (b + (nfcPaymentMethod == null ? 0 : nfcPaymentMethod.hashCode())) * 31;
        e960 e960Var = this.g;
        int e = unr0.e((hashCode2 + (e960Var == null ? 0 : e960Var.hashCode())) * 31, 31, this.h);
        lj11 lj11Var = this.i;
        int hashCode3 = (e + (lj11Var == null ? 0 : lj11Var.hashCode())) * 31;
        yon yonVar = this.j;
        int e2 = unr0.e(unr0.e((hashCode3 + (yonVar == null ? 0 : yonVar.hashCode())) * 31, 31, this.k), 31, this.l);
        rbf0 rbf0Var = this.m;
        int hashCode4 = (e2 + (rbf0Var == null ? 0 : rbf0Var.hashCode())) * 31;
        rbf0 rbf0Var2 = this.n;
        return hashCode4 + (rbf0Var2 != null ? rbf0Var2.hashCode() : 0);
    }

    public final rr51 i() {
        return this.c;
    }

    public final yon j() {
        return this.j;
    }

    public final rbf0 k() {
        return this.n;
    }

    public final List l() {
        return this.b;
    }

    public final h7f0 m() {
        return this.a;
    }

    public final rr51 n() {
        return this.d;
    }

    public final lj11 o() {
        return this.i;
    }

    public final boolean p() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(products=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", divUserInfoBlock=");
        sb.append(this.c);
        sb.append(", quickActionsHeaderDivData=");
        sb.append(this.d);
        sb.append(", bottomBarState=");
        sb.append(this.e);
        sb.append(", defaultNfcPaymentMethod=");
        sb.append(this.f);
        sb.append(", paymentSessionState=");
        sb.append(this.g);
        sb.append(", isPullRefreshIndicatorShowing=");
        sb.append(this.h);
        sb.append(", tsarButtonState=");
        sb.append(this.i);
        sb.append(", educationV2State=");
        sb.append(this.j);
        sb.append(", isProductsV4Enabled=");
        nnm.v(", isProductsV4HeaderEnabled=", ", headerGradientState=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", footerGradientState=");
        sb.append(this.n);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
