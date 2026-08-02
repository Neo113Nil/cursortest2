package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebRights;
import com.vk.superapp.bridges.dto.analytics.MiniAppPolicyScreenEventType;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipPlaylistVideosConfig;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipSelectVideoPlaylistsFragment;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a;
import java.util.List;
import xsna.l5v0;
import xsna.pxw0;
import xsna.zzw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dgu0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dgu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<WebRights> list;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ggu0 ggu0Var = (ggu0) obj2;
                WebApiApplication webApiApplication = (WebApiApplication) obj;
                int i2 = 0;
                if (ggu0Var.A.b) {
                    yau0 e = ggu0Var.s().e();
                    if (!webApiApplication.H || e == null) {
                        ggu0Var.w(false);
                    } else {
                        ggu0Var.s().i();
                        e.a.setVisibility(0);
                        tau0 d = e.b.d();
                        if (d != null) {
                            d.g("mini_app_vk_connect_launch_screen_enter", MiniAppPolicyScreenEventType.VK_CONNECT_EVENT);
                        }
                    }
                }
                if (ggu0Var.A.a) {
                    ggu0Var.m().g.e(webApiApplication.u);
                    ggu0Var.m().g.f(webApiApplication.R);
                    ggu0Var.m().g.b(webApiApplication.S);
                    ggu0Var.m().g.g(webApiApplication.s);
                    ggu0Var.t();
                    if (ggu0Var.z) {
                        ggu0Var.y();
                    }
                }
                pa3 pa3Var = ggu0Var.A;
                if (pa3Var.c) {
                    ggu0Var.A = pa3.a(pa3Var, false, false, 11);
                    if (!webApiApplication.t || webApiApplication.r) {
                        ggu0Var.w(false);
                    } else {
                        ddr0 l = ggu0Var.l();
                        String n = ggu0Var.n();
                        nrq0 nrq0Var = new nrq0(ggu0Var, 8);
                        fvv0 fvv0Var = l.b;
                        xc80 xc80Var = l.f;
                        if (fvv0Var.getAppId() == uhx.a().a) {
                            xc80Var.B(new IllegalStateException("Unknown appId. Failed to load install screen info."));
                        } else {
                            WebApiApplication v = fvv0Var.v();
                            if ((v != null ? v.c0 : null) == null || (list = v.d0) == null || list.isEmpty()) {
                                xgx0.a.getClass();
                                xgx0.f("load data and update app info");
                                vdx0 vdx0Var = e370.e;
                                if (vdx0Var == null) {
                                    vdx0Var = null;
                                }
                                l.d.b(vdx0Var.d().D(fvv0Var.getAppId(), n, fvv0Var.l(), v != null ? v.w : null, ddr0.g).subscribe(new zyu(new cdr0(i2, l, nrq0Var), 28), new o060(new m2l0(l, 13), 19)));
                            } else {
                                nrq0Var.invoke();
                                xc80Var.t(false);
                                xc80Var.w();
                                VkBridgeAnalytics E = l.b.E();
                                if (E != null) {
                                    E.j(VkBridgeAnalytics.InstallScreenEvent.OPEN);
                                }
                            }
                        }
                    }
                }
                ggu0Var.A = pa3.a(ggu0Var.A, false, false, 7);
                return s3q0.a;
            case 1:
                l5v0 l5v0Var = (l5v0) obj2;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof u480) {
                    return new l5v0.a.C3235a(((u480) sxpVar).c);
                }
                if (sxpVar instanceof r480) {
                    return new l5v0.a.b(((r480) sxpVar).c.e(Long.valueOf(l5v0Var.a)));
                }
                if (sxpVar instanceof ka80) {
                    return new l5v0.a.d(((ka80) sxpVar).c);
                }
                throw new IllegalArgumentException("event = " + sxpVar + " not supported");
            case 2:
                lcw0 lcw0Var = (lcw0) obj2;
                gvw0 invoke = lcw0Var.b.invoke();
                if (invoke != null && !invoke.e()) {
                    invoke.g(new pis0(lcw0Var.a.getParentFragmentManager(), 15), null);
                }
                return s3q0.a;
            case 3:
                ((oxw0) obj2).z.a(pxw0.k.a);
                return s3q0.a;
            case 4:
                tzw0 tzw0Var = (tzw0) obj2;
                zzw0.f fVar = tzw0Var.s;
                if (fVar != null) {
                    d810 d810Var = tzw0Var.l;
                    lvw0 lvw0Var = fVar.b;
                    VoipSelectVideoPlaylistsFragment voipSelectVideoPlaylistsFragment = (VoipSelectVideoPlaylistsFragment) d810Var.c;
                    int i3 = VoipSelectVideoPlaylistsFragment.S;
                    Context requireContext = voipSelectVideoPlaylistsFragment.requireContext();
                    Bundle arguments = voipSelectVideoPlaylistsFragment.getArguments();
                    new a.C2092a(requireContext, new VoipPlaylistVideosConfig(arguments != null ? (UserId) arguments.getParcelable(CommonConstant.RETKEY.USERID) : null, lvw0Var.a), lvw0Var.c).H0(voipSelectVideoPlaylistsFragment.getChildFragmentManager(), null);
                }
                return s3q0.a;
            default:
                return new t1x0((z4t0) obj2, new u1x0(((ViewGroup) obj).getContext()));
        }
    }
}
