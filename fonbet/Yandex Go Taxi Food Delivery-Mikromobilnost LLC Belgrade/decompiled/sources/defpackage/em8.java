package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class em8 implements km8 {
    public final Text a;
    public final Text b;
    public final String c;
    public final Throwable d;

    public em8(Text text, Text text2, String str, Throwable th) {
        this.a = text;
        this.b = text2;
        this.c = str;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em8)) {
            return false;
        }
        em8 em8Var = (em8) obj;
        return jl40.l(this.a, em8Var.a) && jl40.l(this.b, em8Var.b) && jl40.l(this.c, em8Var.c) && jl40.l(this.d, em8Var.d);
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
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.d;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = n.p("ReissueFailed(title=", this.a, ", message=", this.b, ", supportUrl=");
        p.append(this.c);
        p.append(", error=");
        p.append(this.d);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
