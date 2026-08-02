package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aa01 {
    public final ky a;
    public final String b;
    public final Object c;

    public aa01(ky kyVar, String str, Object obj) {
        this.a = kyVar;
        this.b = str;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa01)) {
            return false;
        }
        aa01 aa01Var = (aa01) obj;
        return this.a.equals(aa01Var.a) && jl40.l(this.b, aa01Var.b) && jl40.l(this.c, aa01Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.c;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailButtonState(action=");
        sb.append(this.a);
        sb.append(", metricaLabel=");
        sb.append(this.b);
        sb.append(", meta=");
        return x4e.h(sb, this.c, Extension.C_BRAKE);
    }
}
