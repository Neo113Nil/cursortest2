package defpackage;

import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.api.model.SupportState;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardBottomSheetType;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.HeaderType;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class plg {
    public final ProductId a;
    public final String b;
    public final xlg c;
    public final u8j0 d;
    public final SupportState e;
    public final boolean f;
    public final DashboardBottomSheetType g;
    public final rbv h;
    public final HeaderType i;
    public final Set j;
    public final vhg k;

    public plg(ProductId productId, String str, xlg xlgVar, u8j0 u8j0Var, SupportState supportState, boolean z, DashboardBottomSheetType dashboardBottomSheetType, rbv rbvVar, HeaderType headerType, Set set, vhg vhgVar) {
        this.a = productId;
        this.b = str;
        this.c = xlgVar;
        this.d = u8j0Var;
        this.e = supportState;
        this.f = z;
        this.g = dashboardBottomSheetType;
        this.h = rbvVar;
        this.i = headerType;
        this.j = set;
        this.k = vhgVar;
    }

    public static plg a(plg plgVar, u8j0 u8j0Var, SupportState supportState, rbv rbvVar, vhg vhgVar, int i) {
        ProductId productId = plgVar.a;
        String str = plgVar.b;
        xlg xlgVar = plgVar.c;
        if ((i & 8) != 0) {
            u8j0Var = plgVar.d;
        }
        u8j0 u8j0Var2 = u8j0Var;
        if ((i & 16) != 0) {
            supportState = plgVar.e;
        }
        SupportState supportState2 = supportState;
        boolean z = plgVar.f;
        DashboardBottomSheetType dashboardBottomSheetType = (i & 64) != 0 ? plgVar.g : null;
        rbv rbvVar2 = (i & 128) != 0 ? plgVar.h : rbvVar;
        HeaderType headerType = plgVar.i;
        Set set = plgVar.j;
        vhg vhgVar2 = (i & 1024) != 0 ? plgVar.k : vhgVar;
        plgVar.getClass();
        return new plg(productId, str, xlgVar, u8j0Var2, supportState2, z, dashboardBottomSheetType, rbvVar2, headerType, set, vhgVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plg)) {
            return false;
        }
        plg plgVar = (plg) obj;
        return this.a == plgVar.a && jl40.l(this.b, plgVar.b) && this.c.equals(plgVar.c) && this.d.equals(plgVar.d) && this.e == plgVar.e && this.f == plgVar.f && this.g == plgVar.g && jl40.l(this.h, plgVar.h) && this.i == plgVar.i && jl40.l(this.j, plgVar.j) && jl40.l(this.k, plgVar.k);
    }

    public final int hashCode() {
        ProductId productId = this.a;
        int hashCode = (productId == null ? 0 : productId.hashCode()) * 31;
        String str = this.b;
        int e = unr0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f);
        DashboardBottomSheetType dashboardBottomSheetType = this.g;
        int hashCode2 = (e + (dashboardBottomSheetType == null ? 0 : dashboardBottomSheetType.hashCode())) * 31;
        rbv rbvVar = this.h;
        int e2 = g8e.e(this.j, (this.i.hashCode() + ((hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31, 31);
        vhg vhgVar = this.k;
        return e2 + (vhgVar != null ? vhgVar.hashCode() : 0);
    }

    public final String toString() {
        return "DashboardState(productId=" + this.a + ", productType=" + this.b + ", divKitSkeletonsConfig=" + this.c + ", dashboardEntityRequest=" + this.d + ", supportState=" + this.e + ", profileButtonEnabled=" + this.f + ", bottomSheetType=" + this.g + ", userAvatarUrl=" + this.h + ", headerType=" + this.i + ", readLayoutIds=" + this.j + ", dashboardCard=" + this.k + Extension.C_BRAKE;
    }
}
