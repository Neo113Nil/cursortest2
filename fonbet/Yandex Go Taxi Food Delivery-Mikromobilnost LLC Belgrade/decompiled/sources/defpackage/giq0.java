package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class giq0 {
    public final FrequencyType a;
    public final w170 b;
    public final u170 c;
    public final ek11 d;

    public giq0(FrequencyType frequencyType, w170 w170Var, u170 u170Var, ek11 ek11Var) {
        this.a = frequencyType;
        this.b = w170Var;
        this.c = u170Var;
        this.d = ek11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giq0)) {
            return false;
        }
        giq0 giq0Var = (giq0) obj;
        return this.a == giq0Var.a && jl40.l(this.b, giq0Var.b) && jl40.l(this.c, giq0Var.c) && jl40.l(this.d, giq0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w170 w170Var = this.b;
        int hashCode2 = (hashCode + (w170Var == null ? 0 : w170Var.hashCode())) * 31;
        u170 u170Var = this.c;
        int hashCode3 = (hashCode2 + (u170Var == null ? 0 : u170Var.hashCode())) * 31;
        ek11 ek11Var = this.d;
        return hashCode3 + (ek11Var != null ? ek11Var.hashCode() : 0);
    }

    public final String toString() {
        return "SelectedRegularAutotopupOptionEntity(selected=" + this.a + ", oncePerWeek=" + this.b + ", oncePerMonth=" + this.c + ", twicePerMonth=" + this.d + Extension.C_BRAKE;
    }
}
