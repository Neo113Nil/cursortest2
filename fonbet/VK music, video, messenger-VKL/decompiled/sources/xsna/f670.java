package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.core.npo.OrganizationModalVariant;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f670 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f670(OrganizationModalVariant organizationModalVariant, gzs gzsVar, gzs gzsVar2, q630 q630Var, int i) {
        this.d = organizationModalVariant;
        this.c = gzsVar;
        this.e = gzsVar2;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                g670.a((OrganizationModalVariant) this.d, this.c, (gzs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                e7k0 e7k0Var = (e7k0) this.d;
                wl20 wl20Var = (wl20) this.e;
                g7k0 g7k0Var = (g7k0) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1196031620, intValue, -1, "com.vk.core.compose.component.snackbar.MilkshakeSnackbarContent.<anonymous> (VkSnackbarContent.kt:95)");
                    }
                    aVar.K(-1664844553);
                    uog0 uog0Var = w65.k().a;
                    q630.a aVar2 = q630.a.a;
                    q630 d = rte0.d(aVar2, uog0Var);
                    gzs gzsVar = this.c;
                    if (gzsVar != null) {
                        Object x = aVar.x();
                        if (x == a.C0011a.a) {
                            x = ir.h(aVar);
                        }
                        q630 g = d.g(ojc.b(aVar2, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), true, new plg0(0), gzsVar, 8));
                        if (g != null) {
                            d = g;
                        }
                    }
                    aVar.j();
                    float f = kqu0.v;
                    q630 D = s200.D(d, f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), dt1.a.l, aVar, 48);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c = qri.c(aVar, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D2, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    if (e7k0Var == null) {
                        aVar.K(727757992);
                    } else {
                        aVar.K(854760057);
                        e7k0Var.a(6, aVar);
                    }
                    aVar.j();
                    aVar.K(854761045);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    wl20Var.a(new xpy(1.0f, true), aVar, 0);
                    aVar.j();
                    if (g7k0Var == null) {
                        aVar.K(727852232);
                    } else {
                        aVar.K(854763097);
                        g7k0Var.a(6, aVar);
                    }
                    aVar.j();
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ f670(gzs gzsVar, e7k0 e7k0Var, wl20 wl20Var, g7k0 g7k0Var) {
        this.c = gzsVar;
        this.d = e7k0Var;
        this.e = wl20Var;
        this.f = g7k0Var;
    }
}
