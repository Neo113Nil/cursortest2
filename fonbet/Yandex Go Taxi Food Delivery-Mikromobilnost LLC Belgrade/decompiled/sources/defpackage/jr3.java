package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jr3 implements jxz0 {
    public final boolean a;
    public final Text.Constant b;
    public final Text c;
    public final Text d;
    public final rbv e;
    public final fu3 f;

    public jr3(boolean z, Text.Constant constant, Text.Constant constant2, Text.Constant constant3, rbv rbvVar, fu3 fu3Var) {
        this.a = z;
        this.b = constant;
        this.c = constant2;
        this.d = constant3;
        this.e = rbvVar;
        this.f = fu3Var;
    }

    public final fu3 a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr3)) {
            return false;
        }
        jr3 jr3Var = (jr3) obj;
        return this.a == jr3Var.a && this.b.equals(jr3Var.b) && jl40.l(this.c, jr3Var.c) && jl40.l(this.d, jr3Var.d) && jl40.l(this.e, jr3Var.e) && this.f.equals(jr3Var.f);
    }

    @Override // defpackage.jxz0
    public final Text g() {
        return this.d;
    }

    @Override // defpackage.jxz0
    public final Text getDescription() {
        return this.c;
    }

    @Override // defpackage.jxz0
    public final boolean getEnabled() {
        return this.a;
    }

    @Override // defpackage.jxz0
    public final Text getTitle() {
        return this.b;
    }

    @Override // defpackage.jxz0
    public final rbv h() {
        return this.e;
    }

    public final int hashCode() {
        int d = xvz.d(this.b, Boolean.hashCode(this.a) * 31, 31);
        Text text = this.c;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.d;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        rbv rbvVar = this.e;
        return this.f.hashCode() + ((hashCode2 + (rbvVar != null ? rbvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoFundDataViewState(enabled=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        ly3.C(sb, this.c, ", info=", this.d, ", titleEndBadgeImageModel=");
        sb.append(this.e);
        sb.append(", amount=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
