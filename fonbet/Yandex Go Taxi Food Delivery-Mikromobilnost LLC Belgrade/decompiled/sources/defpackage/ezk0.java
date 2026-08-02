package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ezk0 {
    public final dzk0 a;
    public final Text b;
    public final tsz0 c;
    public final ztv d;
    public final uda0 e;
    public final String f;
    public final String g;
    public final bk11 h;
    public final g5a0 i;

    public ezk0(dzk0 dzk0Var, Text text, tsz0 tsz0Var, ztv ztvVar, uda0 uda0Var, String str, String str2, bk11 bk11Var, g5a0 g5a0Var) {
        this.a = dzk0Var;
        this.b = text;
        this.c = tsz0Var;
        this.d = ztvVar;
        this.e = uda0Var;
        this.f = str;
        this.g = str2;
        this.h = bk11Var;
        this.i = g5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezk0)) {
            return false;
        }
        ezk0 ezk0Var = (ezk0) obj;
        return jl40.l(this.a, ezk0Var.a) && jl40.l(this.b, ezk0Var.b) && this.c.equals(ezk0Var.c) && jl40.l(this.d, ezk0Var.d) && this.e.equals(ezk0Var.e) && jl40.l(this.f, ezk0Var.f) && jl40.l(this.g, ezk0Var.g) && this.h.equals(ezk0Var.h) && jl40.l(this.i, ezk0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        ztv ztvVar = this.d;
        int hashCode2 = (this.h.hashCode() + unr0.b(unr0.b((this.e.hashCode() + ((hashCode + (ztvVar == null ? 0 : ztvVar.hashCode())) * 31)) * 31, 31, this.f), 31, this.g)) * 31;
        g5a0 g5a0Var = this.i;
        return hashCode2 + (g5a0Var != null ? g5a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RoundingSettingsEntity(data=" + this.a + ", title=" + this.b + ", toolbar=" + this.c + ", infoButton=" + this.d + ", paymentMethods=" + this.e + ", saveButtonText=" + this.f + ", turnOffButtonText=" + this.g + ", turnOffNoticeInfo=" + this.h + ", currentPaymentMethod=" + this.i + Extension.C_BRAKE;
    }
}
