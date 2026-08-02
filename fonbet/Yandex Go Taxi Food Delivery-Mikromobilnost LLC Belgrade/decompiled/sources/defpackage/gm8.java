package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gm8 implements km8 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final Text c;
    public final Text d;
    public final String e;

    public gm8(Text.Constant constant, Text.Constant constant2, Text text, Text text2, String str) {
        this.a = constant;
        this.b = constant2;
        this.c = text;
        this.d = text2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm8)) {
            return false;
        }
        gm8 gm8Var = (gm8) obj;
        return this.a.equals(gm8Var.a) && this.b.equals(gm8Var.b) && jl40.l(this.c, gm8Var.c) && jl40.l(this.d, gm8Var.d) && jl40.l(this.e, gm8Var.e);
    }

    @Override // defpackage.km8
    public final Text getMessage() {
        return this.b;
    }

    @Override // defpackage.km8
    public final Text getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int d = xvz.d(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.d;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = ly3.u("ReissueLoading(title=", this.a, ", message=", this.b, ", titleTimeout=");
        ly3.C(u, this.c, ", descriptionTimeout=", this.d, ", supportUrl=");
        return oyr.t(u, this.e, Extension.C_BRAKE);
    }
}
