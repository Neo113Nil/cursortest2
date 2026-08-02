package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nj90 implements rj90 {
    public final boolean a;
    public final ntz0 b;
    public final Text c;
    public final Text d;
    public final kao e;

    public nj90(boolean z, ntz0 ntz0Var, Text.Resource resource, Text.Resource resource2, kao kaoVar) {
        this.a = z;
        this.b = ntz0Var;
        this.c = resource;
        this.d = resource2;
        this.e = kaoVar;
    }

    @Override // defpackage.rj90
    public final rtz0 a() {
        return this.b;
    }

    @Override // defpackage.rj90
    public final Text b() {
        return this.c;
    }

    @Override // defpackage.rj90
    public final Text c() {
        return this.d;
    }

    public final kao d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nj90) {
            nj90 nj90Var = (nj90) obj;
            return this.a == nj90Var.a && this.b.equals(nj90Var.b) && jl40.l(this.c, nj90Var.c) && jl40.l(this.d, nj90Var.d) && this.e == nj90Var.e;
        }
        return false;
    }

    public final int hashCode() {
        int d = vfc.d(this.b.a, Boolean.hashCode(this.a) * 31, 31);
        Text text = this.c;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.d;
        return this.e.hashCode() + ((hashCode + (text2 != null ? text2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.rj90
    public final boolean isBackButtonVisible() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(isBackButtonVisible=");
        sb.append(this.a);
        sb.append(", toolbarRightPart=");
        sb.append(this.b);
        sb.append(", toolbarTitle=");
        ly3.C(sb, this.c, ", toolbarSubtitle=", this.d, ", errorViewState=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
