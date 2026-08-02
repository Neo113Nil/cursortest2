package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.jpl0;
import xsna.q630;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class a2x implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ xzs d;

    public /* synthetic */ a2x(int i, Object obj, xzs xzsVar) {
        this.b = i;
        this.c = obj;
        this.d = xzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ty6.b bVar;
        q630.a aVar;
        int i = this.b;
        xzs xzsVar = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                b2x b2xVar = (b2x) obj4;
                wh50 wh50Var = b2xVar.o;
                wh50 wh50Var2 = b2xVar.c;
                wzs wzsVar = (wzs) xzsVar;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar2.J(spg0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(302113338, intValue, -1, "com.vk.core.compose.component.input.InputImpl.Content.<anonymous>.<anonymous> (InputImpl.kt:102)");
                    }
                    r2x r2xVar = (r2x) ((zak0) b2xVar.n).getValue();
                    q630.a aVar3 = q630.a.a;
                    if (r2xVar == null) {
                        aVar2.K(-1992965895);
                    } else {
                        aVar2.K(-1726857208);
                        dt1.a.getClass();
                        r2xVar.a(s200.H(spg0Var.a(aVar3, dt1.a.l), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), aVar2, 0);
                    }
                    aVar2.j();
                    dt1.a.getClass();
                    ty6.b bVar2 = dt1.a.l;
                    q630 b = spg0Var.b(1.0f, spg0Var.a(aVar3, bVar2), true);
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    wzsVar.invoke(aVar2, 0);
                    String str = (String) ((zak0) b2xVar.e).getValue();
                    if (str == null) {
                        aVar2.K(526375466);
                        aVar2.j();
                        bVar = bVar2;
                        aVar = aVar3;
                    } else {
                        aVar2.K(526375467);
                        if (((tho0) ((zak0) wh50Var2).getValue()).a.c.length() == 0) {
                            aVar2.K(163827107);
                            bVar = bVar2;
                            aVar = aVar3;
                            yqv0.c(str, null, ((l5g) ((zak0) b2xVar.g).getValue()).a, null, null, 0, 0, null, 0, false, 0, 0, null, (frv0) ((zak0) b2xVar.h).getValue(), aVar2, 0, 0, 8186);
                            aVar2 = aVar2;
                        } else {
                            bVar = bVar2;
                            aVar = aVar3;
                            aVar2.K(158724848);
                        }
                        aVar2.j();
                        aVar2.j();
                    }
                    aVar2.G();
                    t2x t2xVar = (t2x) ((zak0) wh50Var).getValue();
                    if (t2xVar != null) {
                        ((zak0) t2xVar.a).setValue(Boolean.valueOf(b2xVar.b()));
                    }
                    t2x t2xVar2 = (t2x) ((zak0) wh50Var).getValue();
                    if (t2xVar2 == null) {
                        aVar2.K(-1992042281);
                    } else {
                        aVar2.K(-1726827414);
                        t2xVar2.a(s200.H(spg0Var.a(aVar, bVar), kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), aVar2, 0);
                    }
                    aVar2.j();
                    if (!((Boolean) ((zak0) b2xVar.p).getValue()).booleanValue() || ((tho0) ((zak0) wh50Var2).getValue()).a.c.length() <= 0) {
                        aVar2.K(-1997533496);
                    } else {
                        aVar2.K(-1991756336);
                        q630 H = s200.H(spg0Var.a(aVar, bVar), kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                        }
                        lg90 b2 = or.b(aVar2, 1833859693, R.drawable.vk_icon_cancel_24, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        s1v.k();
                        on20 on20Var = on20.a;
                        long i2 = sd9.i(aVar2);
                        String N = d370.N(R.string.vk_accessibility_clear_input, 0, aVar2);
                        boolean J = aVar2.J(b2xVar);
                        Object x = aVar2.x();
                        if (J || x == a.C0011a.a) {
                            x = new xsw(b2xVar, 1);
                            aVar2.R(x);
                        }
                        androidx.compose.runtime.a aVar5 = aVar2;
                        nzu0.c((gzs) x, b2, N, H, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, false, null, false, null, null, aVar5, 64, 2000);
                        aVar2 = aVar5;
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                jpl0 jpl0Var = (jpl0) obj4;
                izs izsVar = (izs) xzsVar;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(463156930, intValue2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontScreen.<anonymous>.<anonymous> (StorefrontScreen.kt:77)");
                    }
                    jpl0.a aVar7 = jpl0Var.c;
                    if (aVar7 instanceof jpl0.a.C3136a) {
                        aVar6.K(-1582785509);
                        fjl0.a(izsVar, aVar6, 0);
                        aVar6.j();
                    } else if (aVar7 instanceof jpl0.a.c) {
                        aVar6.K(-1582780683);
                        nml0.a(0, aVar6);
                        aVar6.j();
                    } else if (aVar7 instanceof jpl0.a.d) {
                        aVar6.K(-1821476068);
                        lll0.b(izsVar, (jpl0.a.d) aVar7, aVar6, 0);
                        aVar6.j();
                    } else {
                        if (!(aVar7 instanceof jpl0.a.b)) {
                            throw alb0.c(-1582787801, aVar6);
                        }
                        aVar6.K(-1582771668);
                        fll0.a((jpl0.a.b) aVar7, izsVar, aVar6, 0);
                        aVar6.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }
}
