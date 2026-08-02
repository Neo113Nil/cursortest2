package defpackage;

import com.ybsdk.feature.dashboard.api.DashboardUserIdentificationStatusEntity;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pig {
    public final List a;
    public final DashboardUserIdentificationStatusEntity b;
    public final xj1 c;
    public final x5t d;

    public pig(List list, DashboardUserIdentificationStatusEntity dashboardUserIdentificationStatusEntity, xj1 xj1Var, x5t x5tVar) {
        this.a = list;
        this.b = dashboardUserIdentificationStatusEntity;
        this.c = xj1Var;
        this.d = x5tVar;
    }

    public static pig a(pig pigVar, x5t x5tVar) {
        return new pig(pigVar.a, pigVar.b, pigVar.c, x5tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pig)) {
            return false;
        }
        pig pigVar = (pig) obj;
        return jl40.l(this.a, pigVar.a) && this.b == pigVar.b && jl40.l(this.c, pigVar.c) && jl40.l(this.d, pigVar.d);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31;
        xj1 xj1Var = this.c;
        int hashCode2 = (hashCode + (xj1Var == null ? 0 : xj1Var.hashCode())) * 31;
        x5t x5tVar = this.d;
        return hashCode2 + (x5tVar != null ? x5tVar.hashCode() : 0);
    }

    public final String toString() {
        return "DashboardEntity(fullscreens=" + this.a + ", identificationStatus=" + this.b + ", agreementEntity=" + this.c + ", dashboardEntity=" + this.d + Extension.C_BRAKE;
    }
}
