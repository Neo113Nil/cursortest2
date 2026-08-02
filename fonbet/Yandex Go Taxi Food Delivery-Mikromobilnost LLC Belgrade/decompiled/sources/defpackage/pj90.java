package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pj90 implements rj90 {
    public final List a;
    public final boolean b;
    public final ntz0 c;
    public final Text d;
    public final Text e;

    public pj90(List list, boolean z, ntz0 ntz0Var, Text.Resource resource, Text.Resource resource2) {
        this.a = list;
        this.b = z;
        this.c = ntz0Var;
        this.d = resource;
        this.e = resource2;
    }

    @Override // defpackage.rj90
    public final rtz0 a() {
        return this.c;
    }

    @Override // defpackage.rj90
    public final Text b() {
        return this.d;
    }

    @Override // defpackage.rj90
    public final Text c() {
        return this.e;
    }

    public final List d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj90)) {
            return false;
        }
        pj90 pj90Var = (pj90) obj;
        return this.a.equals(pj90Var.a) && this.b == pj90Var.b && this.c.equals(pj90Var.c) && jl40.l(this.d, pj90Var.d) && jl40.l(this.e, pj90Var.e);
    }

    public final int hashCode() {
        int d = vfc.d(this.c.a, unr0.e(this.a.hashCode() * 31, 31, this.b), 31);
        Text text = this.d;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.e;
        return hashCode + (text2 != null ? text2.hashCode() : 0);
    }

    @Override // defpackage.rj90
    public final boolean isBackButtonVisible() {
        return this.b;
    }

    public final String toString() {
        return "Loading(recyclerItems=" + this.a + ", isBackButtonVisible=" + this.b + ", toolbarRightPart=" + this.c + ", toolbarTitle=" + this.d + ", toolbarSubtitle=" + this.e + Extension.C_BRAKE;
    }
}
