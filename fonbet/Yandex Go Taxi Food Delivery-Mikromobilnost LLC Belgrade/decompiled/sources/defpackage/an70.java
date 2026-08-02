package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class an70 implements fn70 {
    public final List a;
    public final zuc0 b;
    public final zm70 c;

    public an70(List list, zuc0 zuc0Var, zm70 zm70Var) {
        this.a = list;
        this.b = zuc0Var;
        this.c = zm70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an70)) {
            return false;
        }
        an70 an70Var = (an70) obj;
        return jl40.l(this.a, an70Var.a) && jl40.l(this.b, an70Var.b) && this.c.equals(an70Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zuc0 zuc0Var = this.b;
        return this.c.hashCode() + ((hashCode + (zuc0Var == null ? 0 : zuc0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "ObjectWithOutlinedPlateNumber(objectImage=" + this.a + ", plateNumber=" + this.b + ", placement=" + this.c + Extension.C_BRAKE;
    }
}
