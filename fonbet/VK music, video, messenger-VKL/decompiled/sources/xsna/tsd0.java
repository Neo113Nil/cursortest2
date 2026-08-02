package xsna;

import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ProductsManagementBannerState.kt */
/* loaded from: classes18.dex */
public final class tsd0 {
    public final String a;
    public final String b;
    public final String c;
    public final List<usd0> d;
    public final Map<ProductsManagementActionType, vsd0> e;
    public final usd0 f;
    public final boolean g;
    public final vsd0 h;

    public tsd0() {
        this(null, null, null, null, null, null, 255);
    }

    public static tsd0 a(tsd0 tsd0Var, boolean z, vsd0 vsd0Var, int i) {
        String str = tsd0Var.a;
        String str2 = tsd0Var.b;
        String str3 = tsd0Var.c;
        List<usd0> list = tsd0Var.d;
        Map<ProductsManagementActionType, vsd0> map = tsd0Var.e;
        usd0 usd0Var = tsd0Var.f;
        if ((i & 64) != 0) {
            z = tsd0Var.g;
        }
        boolean z2 = z;
        if ((i & 128) != 0) {
            vsd0Var = tsd0Var.h;
        }
        tsd0Var.getClass();
        return new tsd0(str, str2, str3, list, map, usd0Var, z2, vsd0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsd0)) {
            return false;
        }
        tsd0 tsd0Var = (tsd0) obj;
        return epx.f(this.a, tsd0Var.a) && epx.f(this.b, tsd0Var.b) && epx.f(this.c, tsd0Var.c) && epx.f(this.d, tsd0Var.d) && epx.f(this.e, tsd0Var.e) && epx.f(this.f, tsd0Var.f) && this.g == tsd0Var.g && epx.f(this.h, tsd0Var.h);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int a2 = v11.a(fw3.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        usd0 usd0Var = this.f;
        int b = qoy.b((a2 + (usd0Var == null ? 0 : usd0Var.hashCode())) * 31, 31, this.g);
        vsd0 vsd0Var = this.h;
        return b + (vsd0Var != null ? vsd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ProductsManagementBannerState(title=" + this.a + ", subtitle=" + this.b + ", iconUrl=" + this.c + ", actions=" + this.d + ", modals=" + this.e + ", closeButton=" + this.f + ", isLoading=" + this.g + ", confirmationModal=" + this.h + ')';
    }

    public tsd0(String str, String str2, String str3, List list, Map map, usd0 usd0Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? EmptyList.b : list, (i & 16) != 0 ? jgp.b : map, (i & 32) != 0 ? null : usd0Var, false, null);
    }

    public tsd0(String str, String str2, String str3, List<usd0> list, Map<ProductsManagementActionType, vsd0> map, usd0 usd0Var, boolean z, vsd0 vsd0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = map;
        this.f = usd0Var;
        this.g = z;
        this.h = vsd0Var;
    }
}
