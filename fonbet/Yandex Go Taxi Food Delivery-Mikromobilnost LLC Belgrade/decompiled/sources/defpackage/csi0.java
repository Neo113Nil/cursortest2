package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class csi0 {
    public final dsi0 a;
    public final RegularAutotopupStatusEntity b;
    public final fa4 c;
    public final esi0 d;
    public final giq0 e;
    public final LinkedHashMap f;

    public csi0(dsi0 dsi0Var, RegularAutotopupStatusEntity regularAutotopupStatusEntity, fa4 fa4Var, esi0 esi0Var, giq0 giq0Var, LinkedHashMap linkedHashMap) {
        this.a = dsi0Var;
        this.b = regularAutotopupStatusEntity;
        this.c = fa4Var;
        this.d = esi0Var;
        this.e = giq0Var;
        this.f = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csi0)) {
            return false;
        }
        csi0 csi0Var = (csi0) obj;
        return jl40.l(this.a, csi0Var.a) && this.b == csi0Var.b && jl40.l(this.c, csi0Var.c) && this.d.equals(csi0Var.d) && this.e.equals(csi0Var.e) && this.f.equals(csi0Var.f);
    }

    public final int hashCode() {
        dsi0 dsi0Var = this.a;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((dsi0Var == null ? 0 : dsi0Var.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RegularAutotopupDataEntity(error=" + this.a + ", status=" + this.b + ", summary=" + this.c + ", limitsData=" + this.d + ", selectedOption=" + this.e + ", availableOptions=" + this.f + Extension.C_BRAKE;
    }
}
