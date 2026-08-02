package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.toggle.features.SaFeatures;

/* compiled from: AppsHelper.kt */
/* loaded from: classes7.dex */
public final class hf3 {
    public static final io.reactivex.rxjava3.internal.operators.single.r a(np20 np20Var) {
        iq20 iq20Var = np20Var.d;
        String str = iq20Var.b;
        if (str == null) {
            str = "menu";
            iq20Var.b = "menu";
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.j(df3.a(np20Var, np20Var.e.g, str)), new bl(new tm0(np20Var, 6), 2));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 b(op20 op20Var) {
        String str;
        io.reactivex.rxjava3.core.q T;
        io.reactivex.rxjava3.core.q p1Var;
        long j;
        ApiApplication apiApplication = op20Var.a;
        String str2 = apiApplication.G;
        mq20 mq20Var = op20Var.c;
        String str3 = mq20Var.a;
        iq20 iq20Var = op20Var.d;
        UiTracker uiTracker = UiTracker.a;
        String d = UiTracker.d();
        String str4 = iq20Var.b;
        if (str4 == null) {
            iq20Var.b = d;
            str = d;
        } else {
            str = str4;
        }
        if (str3 != null && str3.length() != 0) {
            T = io.reactivex.rxjava3.core.q.T(str3);
        } else if ((!"mini_app".equals(apiApplication.C) && !apiApplication.zb().booleanValue()) || str2 == null || str2.length() == 0) {
            BrowserPerfState browserPerfState = iq20Var.d;
            if (browserPerfState == null) {
                browserPerfState = new BrowserPerfState();
                iq20Var.d = browserPerfState;
            }
            browserPerfState.f = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
            int i = 2;
            if (com.vk.toggle.b.A.a(SaFeatures.SA_APPS_REQUESTS_ALIASES)) {
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                zen0 d2 = vdx0Var.d();
                long j2 = apiApplication.b.b;
                String str5 = mq20Var.e;
                if (str5 == null) {
                    String str6 = apiApplication.G;
                    String str7 = apiApplication.H;
                    j = j2;
                    str5 = dd80.g(j, iq20Var.e, str6, str, str7 != null ? drm0.j0(str7, "#", "") : null, iq20Var.f);
                } else {
                    j = j2;
                }
                p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(hg1.m(d2.d(j, UserId.d, str5, str, iq20Var.a), op20Var.b, 300L, true, 52).U(new kq(new yy(i), 4)), new mq(new oc0(2), 3));
            } else {
                UserId userId = apiApplication.b;
                String str8 = apiApplication.H;
                String j0 = str8 != null ? drm0.j0(str8, "#", "") : null;
                String str9 = apiApplication.G;
                String str10 = iq20Var.a;
                Integer num = iq20Var.e;
                String str11 = iq20Var.f;
                String str12 = mq20Var.e;
                UserId userId2 = UserId.d;
                ip4 ip4Var = new ip4("apps.getEmbeddedUrl", 1);
                ip4Var.F(userId, "app_id");
                if (userId2.b != 0) {
                    ip4Var.F(userId2, "owner_id");
                }
                ip4Var.K("ref", str);
                String g = dd80.g(userId.b, num, str9, str, j0, str11);
                if (str12 == null) {
                    str12 = g;
                }
                ip4Var.K("url", str12);
                if (str10 != null) {
                    ip4Var.K("track_code", str10);
                }
                p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(hg1.m(rsg0.y0(ip4Var, null, null, 3), op20Var.b, 300L, true, 52).U(new vp(new jt(3), 1)), new wp(new oc0(2), 1));
            }
            T = p1Var;
        } else {
            T = io.reactivex.rxjava3.core.q.T(str2);
        }
        return T.a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public static final io.reactivex.rxjava3.disposables.c c(op20 op20Var) {
        ApiApplication apiApplication = op20Var.a;
        if ("game".equals(apiApplication.C) || "standalone".equals(apiApplication.C)) {
            return io.reactivex.rxjava3.core.a.l(new ef3(0, apiApplication, op20Var)).q(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe();
        }
        String str = apiApplication.H;
        String j0 = str != null ? drm0.j0(str, "#", "") : null;
        long j = apiApplication.b.b;
        iq20 iq20Var = op20Var.d;
        op20Var.c.e = dd80.g(j, iq20Var.e, null, iq20Var.b, j0, iq20Var.f);
        return b(op20Var).subscribe(new wf1(new o43(1, op20Var, apiApplication), 2), new ff3(new qt(4), 0));
    }

    public static final void d(np20 np20Var) {
        int i = np20Var.a;
        String str = np20Var.e.g;
        iq20 iq20Var = np20Var.d;
        String str2 = iq20Var.c;
        BrowserPerfState browserPerfState = iq20Var.d;
        if (browserPerfState == null) {
            browserPerfState = new BrowserPerfState();
            iq20Var.d = browserPerfState;
        }
        iq20 iq20Var2 = np20Var.d;
        String str3 = iq20Var2.b;
        if (str3 == null) {
            str3 = "menu";
            iq20Var2.b = "menu";
        }
        InternalMiniApps.Companion.getClass();
        if (i != ((int) InternalMiniApps.VK_PAY_OLD.h().a)) {
            browserPerfState.e = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
            itg0.i(4, df3.a(np20Var, str, str3), null, new sa(np20Var, 3), new x50(1));
            return;
        }
        maz e = xwk.d().e();
        Context context = np20Var.b;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(a0a.d);
        sb.append("/app");
        sb.append(i);
        sb.append('#');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        maz.c(e, context, sb.toString(), new LaunchContext(false, false, false, null, null, null, null, null, null, str2, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108351), null, null, 24);
    }

    public static final void e(Activity activity, op20 op20Var, gzs<s3q0> gzsVar) {
        mq20 mq20Var = op20Var.c;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity != null) {
            WebApiApplication c = chx0.c(op20Var.a);
            String str = mq20Var.a;
            iq20 iq20Var = op20Var.d;
            String str2 = iq20Var.b;
            if (str2 == null) {
                str2 = "menu";
                iq20Var.b = "menu";
            }
            String str3 = mq20Var.g;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = mq20Var.d;
            Bundle bundle = new Bundle();
            bundle.putParcelable("args_app", c);
            bundle.putString("args_view_url", str);
            bundle.putString("args_ref", str2);
            bundle.putString("args_link_params", str3);
            bundle.putString("args_source_url", str4);
            gf3 gf3Var = new gf3(gzsVar, 0);
            evv0 evv0Var = new evv0();
            evv0Var.setArguments(bundle);
            evv0Var.y = gf3Var;
            evv0Var.Td(fragmentActivity.getSupportFragmentManager(), evv0Var.getTag());
        }
    }

    public static final void f(Context context, String str) {
        d(new np20((int) InternalMiniApps.VK_PAY.h().a, context, null, new iq20(null, "bot_keyboard", null, null, null, null, null, null, 253), new aq20(null, null, null, null, null, null, str, false, null, false, 3967), 4));
    }
}
