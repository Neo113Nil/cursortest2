package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dm8 implements km8 {
    public final Text a;
    public final Text b;
    public final String c;

    public dm8(Text text, Text text2, String str) {
        this.a = text;
        this.b = text2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm8)) {
            return false;
        }
        dm8 dm8Var = (dm8) obj;
        return jl40.l(this.a, dm8Var.a) && jl40.l(this.b, dm8Var.b) && jl40.l(this.c, dm8Var.c);
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
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(n.p("Reissue2fa(title=", this.a, ", message=", this.b, ", operationId="), this.c, Extension.C_BRAKE);
    }
}
