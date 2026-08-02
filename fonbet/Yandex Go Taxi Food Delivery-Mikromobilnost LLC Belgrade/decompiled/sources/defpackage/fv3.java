package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fv3 implements jxz0 {
    public final boolean a;
    public final Text.Constant b;
    public final Text c;
    public final rbv d;
    public final fu3 e;
    public final fu3 f;

    public fv3(boolean z, Text.Constant constant, Text.Constant constant2, rbv rbvVar, fu3 fu3Var, fu3 fu3Var2) {
        this.a = z;
        this.b = constant;
        this.c = constant2;
        this.d = rbvVar;
        this.e = fu3Var;
        this.f = fu3Var2;
    }

    public final fu3 a() {
        return this.e;
    }

    public final fu3 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv3)) {
            return false;
        }
        fv3 fv3Var = (fv3) obj;
        return this.a == fv3Var.a && this.b.equals(fv3Var.b) && jl40.l(this.c, fv3Var.c) && jl40.l(this.d, fv3Var.d) && this.e.equals(fv3Var.e) && this.f.equals(fv3Var.f);
    }

    @Override // defpackage.jxz0
    public final Text g() {
        return null;
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
        return this.d;
    }

    public final int hashCode() {
        int d = xvz.d(this.b, Boolean.hashCode(this.a) * 31, 31);
        Text text = this.c;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 961;
        rbv rbvVar = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (rbvVar != null ? rbvVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoTopupDataViewState(enabled=" + this.a + ", title=" + this.b + ", description=" + this.c + ", info=null, titleEndBadgeImageModel=" + this.d + ", amount=" + this.e + ", threshold=" + this.f + Extension.C_BRAKE;
    }
}
