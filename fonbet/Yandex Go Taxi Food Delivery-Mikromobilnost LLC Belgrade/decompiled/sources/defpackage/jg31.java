package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jg31 extends n351 {
    public final List c;
    public final zh4 d;
    public final float e;
    public final l690 f;
    public final l690 g;
    public final x2s h;
    public final String i;

    public jg31(List list, zh4 zh4Var, float f, l690 l690Var, l690 l690Var2, x2s x2sVar, String str) {
        super("vertical-stack", false, 14);
        this.c = list;
        this.d = zh4Var;
        this.e = f;
        this.f = l690Var;
        this.g = l690Var2;
        this.h = x2sVar;
        this.i = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg31)) {
            return false;
        }
        jg31 jg31Var = (jg31) obj;
        return jl40.l(this.c, jg31Var.c) && jl40.l(this.d, jg31Var.d) && y7m.b(this.e, jg31Var.e) && this.f.equals(jg31Var.f) && this.g.equals(jg31Var.g) && this.h.equals(jg31Var.h) && jl40.l(this.i, jg31Var.i);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        zh4 zh4Var = this.d;
        int a = tse0.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + g8e.c(this.e, (hashCode + (zh4Var == null ? 0 : zh4Var.hashCode())) * 31, 31)) * 31)) * 31, 31);
        String str = this.i;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String c = y7m.c(this.e);
        StringBuilder sb = new StringBuilder("VerticalStackModel(widgets=");
        sb.append(this.c);
        sb.append(", backgroundState=");
        sb.append(this.d);
        sb.append(", cornerRadius=");
        sb.append(c);
        sb.append(", paddings=");
        sb.append(this.f);
        sb.append(", contentPaddings=");
        sb.append(this.g);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.h);
        sb.append(", id=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
