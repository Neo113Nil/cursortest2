package xsna;

import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wwf;

/* compiled from: CommunityAddressesFragment.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class krg implements wwf.a, g0t {
    public final /* synthetic */ CommunityAddressesFragment b;

    public krg(CommunityAddressesFragment communityAddressesFragment) {
        this.b = communityAddressesFragment;
    }

    @Override // xsna.wwf.a
    public final boolean a(xwf xwfVar) {
        edr0 edr0Var;
        int i = CommunityAddressesFragment.E0;
        ArrayList arrayList = xwfVar.b;
        edr0 edr0Var2 = ((tqg) j5g.X(arrayList)).b;
        double d = edr0Var2.a;
        double d2 = edr0Var2.b;
        Iterator it = arrayList.iterator();
        double d3 = d2;
        double d4 = d3;
        boolean z = true;
        double d5 = d;
        while (it.hasNext()) {
            edr0 edr0Var3 = ((tqg) it.next()).b;
            double d6 = edr0Var3.a;
            if (d6 > d) {
                d = d6;
            }
            if (d6 < d5) {
                d5 = d6;
            }
            double d7 = d3;
            double d8 = edr0Var3.b;
            if (d8 > d4) {
                d4 = d8;
            }
            if (d8 < d7) {
                d7 = d8;
            }
            if (z && (d != d6 || d4 != d8)) {
                z = false;
            }
            d3 = d7;
        }
        double d9 = d3;
        CommunityAddressesFragment communityAddressesFragment = this.b;
        if (!z) {
            communityAddressesFragment.w0 = null;
            u9h0 u9h0Var = new u9h0(new edr0(d5, d9), new edr0(d, d4));
            ndr0 ndr0Var = communityAddressesFragment.r0;
            if (ndr0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            vj00 vj00Var = ofx.a;
            if (vj00Var == null) {
                vj00Var = null;
            }
            vj00Var.getClass();
            vj00 vj00Var2 = ofx.a;
            nt0.a(u9h0Var, ndr0Var, uar0.a, new org(4, vj00Var2 != null ? vj00Var2 : null, uj00.class, "createCameraPosition", "createCameraPosition(Lcom/vk/maps/common/model/VKLatLng;FFF)Lcom/vk/maps/common/interfaces/CameraPosition;", 0), null);
            return true;
        }
        xwf xwfVar2 = communityAddressesFragment.w0;
        if (xwfVar2 != null && (edr0Var = xwfVar2.a) != null && edr0Var.equals(xwfVar.a)) {
            communityAddressesFragment.oo();
            return true;
        }
        communityAddressesFragment.w0 = xwfVar;
        communityAddressesFragment.x0 = 0;
        tqg tqgVar = (tqg) j5g.X(arrayList);
        CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
        (gVar != null ? gVar : null).g(false, tqgVar.a);
        communityAddressesFragment.qo(tqgVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wwf.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, CommunityAddressesFragment.class, "onClusterClickListener", "onClusterClickListener(Lcom/vk/maps/common/interfaces/Cluster;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
