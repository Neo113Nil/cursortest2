package xsna;

import com.vk.ecomm.storefront.impl.community.presentation.model.LoadingState;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class apl0 implements lm50 {
    public final pju b;
    public final igr c;
    public final hr1 d;
    public final z7p0 e;
    public final t8u f;
    public final uvw g;
    public final List<w4p0> h;
    public final w4p0 i;
    public final String j;
    public final wll0 k;
    public final LoadingState l;
    public final tsd0 m;
    public final a7k0 n;

    public apl0() {
        this(null, null, null, null, null, null, null, null, null, null, null, 16383);
    }

    public static apl0 a(apl0 apl0Var, pju pjuVar, z7p0 z7p0Var, t8u t8uVar, List list, w4p0 w4p0Var, wll0 wll0Var, LoadingState loadingState, tsd0 tsd0Var, a7k0 a7k0Var, int i) {
        pju pjuVar2 = (i & 1) != 0 ? apl0Var.b : pjuVar;
        igr igrVar = apl0Var.c;
        hr1 hr1Var = apl0Var.d;
        z7p0 z7p0Var2 = (i & 8) != 0 ? apl0Var.e : z7p0Var;
        t8u t8uVar2 = (i & 16) != 0 ? apl0Var.f : t8uVar;
        uvw uvwVar = apl0Var.g;
        List list2 = (i & 64) != 0 ? apl0Var.h : list;
        w4p0 w4p0Var2 = (i & 128) != 0 ? apl0Var.i : w4p0Var;
        String str = apl0Var.j;
        apl0Var.getClass();
        wll0 wll0Var2 = (i & 1024) != 0 ? apl0Var.k : wll0Var;
        LoadingState loadingState2 = (i & 2048) != 0 ? apl0Var.l : loadingState;
        tsd0 tsd0Var2 = (i & 4096) != 0 ? apl0Var.m : tsd0Var;
        a7k0 a7k0Var2 = (i & 8192) != 0 ? apl0Var.n : a7k0Var;
        apl0Var.getClass();
        return new apl0(pjuVar2, igrVar, hr1Var, z7p0Var2, t8uVar2, uvwVar, list2, w4p0Var2, str, wll0Var2, loadingState2, tsd0Var2, a7k0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apl0)) {
            return false;
        }
        apl0 apl0Var = (apl0) obj;
        return epx.f(this.b, apl0Var.b) && epx.f(this.c, apl0Var.c) && epx.f(this.d, apl0Var.d) && epx.f(this.e, apl0Var.e) && epx.f(this.f, apl0Var.f) && epx.f(this.g, apl0Var.g) && epx.f(this.h, apl0Var.h) && epx.f(this.i, apl0Var.i) && epx.f(this.j, apl0Var.j) && epx.f(this.k, apl0Var.k) && this.l == apl0Var.l && epx.f(this.m, apl0Var.m) && epx.f(this.n, apl0Var.n);
    }

    public final int hashCode() {
        pju pjuVar = this.b;
        int hashCode = (pjuVar == null ? 0 : pjuVar.hashCode()) * 31;
        igr igrVar = this.c;
        int hashCode2 = (hashCode + (igrVar == null ? 0 : igrVar.hashCode())) * 31;
        hr1 hr1Var = this.d;
        int hashCode3 = (hashCode2 + (hr1Var == null ? 0 : hr1Var.hashCode())) * 31;
        z7p0 z7p0Var = this.e;
        int hashCode4 = (hashCode3 + (z7p0Var == null ? 0 : z7p0Var.hashCode())) * 31;
        t8u t8uVar = this.f;
        int hashCode5 = (hashCode4 + (t8uVar == null ? 0 : t8uVar.hashCode())) * 31;
        uvw uvwVar = this.g;
        int a = fw3.a((hashCode5 + (uvwVar == null ? 0 : uvwVar.hashCode())) * 31, 31, this.h);
        w4p0 w4p0Var = this.i;
        int hashCode6 = (a + (w4p0Var == null ? 0 : w4p0Var.hashCode())) * 31;
        String str = this.j;
        int b = qoy.b((hashCode6 + (str == null ? 0 : str.hashCode())) * 31, 31, false);
        wll0 wll0Var = this.k;
        int hashCode7 = (b + (wll0Var == null ? 0 : wll0Var.hashCode())) * 31;
        LoadingState loadingState = this.l;
        int hashCode8 = (hashCode7 + (loadingState == null ? 0 : loadingState.hashCode())) * 31;
        tsd0 tsd0Var = this.m;
        int hashCode9 = (hashCode8 + (tsd0Var == null ? 0 : tsd0Var.hashCode())) * 31;
        a7k0 a7k0Var = this.n;
        return hashCode9 + (a7k0Var != null ? a7k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StorefrontState(groupData=" + this.b + ", filtersStateData=" + this.c + ", albumsStateData=" + this.d + ", topBarState=" + this.e + ", goodsState=" + this.f + ", infoBlockState=" + this.g + ", scheduledTooltips=" + this.h + ", currentTooltip=" + this.i + ", editUrl=" + this.j + ", supportAddNewItem=false, error=" + this.k + ", loadingState=" + this.l + ", productsManagementBanner=" + this.m + ", snackBarState=" + this.n + ')';
    }

    public apl0(pju pjuVar, igr igrVar, hr1 hr1Var, z7p0 z7p0Var, t8u t8uVar, uvw uvwVar, List list, w4p0 w4p0Var, String str, wll0 wll0Var, LoadingState loadingState, tsd0 tsd0Var, a7k0 a7k0Var) {
        this.b = pjuVar;
        this.c = igrVar;
        this.d = hr1Var;
        this.e = z7p0Var;
        this.f = t8uVar;
        this.g = uvwVar;
        this.h = list;
        this.i = w4p0Var;
        this.j = str;
        this.k = wll0Var;
        this.l = loadingState;
        this.m = tsd0Var;
        this.n = a7k0Var;
    }

    public apl0(pju pjuVar, igr igrVar, hr1 hr1Var, z7p0 z7p0Var, t8u t8uVar, uvw uvwVar, ArrayList arrayList, w4p0 w4p0Var, String str, LoadingState loadingState, tsd0 tsd0Var, int i) {
        this((i & 1) != 0 ? null : pjuVar, (i & 2) != 0 ? null : igrVar, (i & 4) != 0 ? null : hr1Var, (i & 8) != 0 ? null : z7p0Var, (i & 16) != 0 ? null : t8uVar, (i & 32) != 0 ? null : uvwVar, (i & 64) != 0 ? EmptyList.b : arrayList, (i & 128) != 0 ? null : w4p0Var, (i & 256) != 0 ? null : str, null, (i & 2048) != 0 ? LoadingState.None : loadingState, (i & 4096) != 0 ? null : tsd0Var, null);
    }
}
