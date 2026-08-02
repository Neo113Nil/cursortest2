package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.IconPosition;

/* loaded from: classes5.dex */
public final class f7x0 {
    public final String a;
    public final String b;
    public final String c;
    public final sbv d;
    public final IconPosition e;
    public final ul4 f;
    public final r9x0 g;
    public final x2s h;
    public final yg i;

    public f7x0(String str, String str2, String str3, sbv sbvVar, IconPosition iconPosition, ul4 ul4Var, r9x0 r9x0Var, x2s x2sVar, yg ygVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sbvVar;
        this.e = iconPosition;
        this.f = ul4Var;
        this.g = r9x0Var;
        this.h = x2sVar;
        this.i = ygVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7x0)) {
            return false;
        }
        f7x0 f7x0Var = (f7x0) obj;
        return jl40.l(this.a, f7x0Var.a) && jl40.l(this.b, f7x0Var.b) && jl40.l(this.c, f7x0Var.c) && jl40.l(this.d, f7x0Var.d) && this.e == f7x0Var.e && jl40.l(this.f, f7x0Var.f) && jl40.l(this.g, f7x0Var.g) && this.h.equals(f7x0Var.h) && jl40.l(this.i, f7x0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        sbv sbvVar = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (sbvVar == null ? 0 : sbvVar.hashCode())) * 31)) * 31;
        ul4 ul4Var = this.f;
        int hashCode5 = (hashCode4 + (ul4Var == null ? 0 : ul4Var.hashCode())) * 31;
        r9x0 r9x0Var = this.g;
        int a = tse0.a(this.h, (hashCode5 + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31, 31);
        yg ygVar = this.i;
        return a + (ygVar != null ? ygVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TagModel(text=", this.a, ", backgroundColor=", this.b, ", textColor=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(", iconPosition=");
        v.append(this.e);
        v.append(", badge=");
        v.append(this.f);
        v.append(", action=");
        v.append(this.g);
        v.append(", analyticsData=");
        v.append(this.h);
        v.append(", accessibilityInfo=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
