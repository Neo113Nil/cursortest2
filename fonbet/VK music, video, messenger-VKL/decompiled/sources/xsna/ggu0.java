package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.snackbar.HideReason;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.app.AppLifecycleEvent;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.ActionGamesNotificationsPopup;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vk.superapp.browser.internal.utils.FlashlightUtils;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.superapp.js.bridge.events.AddToFavorites$Response;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.aex0;
import xsna.ber0;
import xsna.de80;
import xsna.dw20;
import xsna.e3m;
import xsna.eeu0;
import xsna.utj;
import xsna.yfu0;
import xsna.zen0;
import xsna.zex0;

/* compiled from: VkBrowserView.kt */
/* loaded from: classes6.dex */
public final class ggu0 implements VkUiView.BannerAd, VkUiView.b, fzu0, yfu0.a {
    public BrowserPerfState B;
    public final r6y C;
    public List<WebApiApplication> O;
    public final Context b;
    public final xc80 c;
    public final mfu0 d;
    public final fvv0 e;
    public final kgu0 f;
    public final jgu0 g;
    public com.vk.superapp.browser.ui.a n;
    public utj o;
    public boolean p;
    public boolean q;
    public io.reactivex.rxjava3.disposables.c t;
    public io.reactivex.rxjava3.disposables.c u;
    public yuv0 v;
    public j43 w;
    public com.vk.superapp.browser.internal.ui.shortcats.a x;
    public boolean y;
    public boolean z;
    public final qit0 h = new qit0(1);
    public final bpn0 i = new bpn0(new ajd0(this, 24));
    public final bpn0 j = new bpn0(new vpn0(this, 14));
    public final bpn0 k = new bpn0(new g8n0(this, 15));
    public final bpn0 l = new bpn0(new y3l0(this, 23));
    public final bpn0 m = new bpn0(new c9m0(this, 16));
    public final io.reactivex.rxjava3.disposables.b r = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b s = new io.reactivex.rxjava3.disposables.b();
    public pa3 A = new pa3(false, false, false, false);
    public final bpn0 D = new bpn0(new hyd0(8));
    public final bpn0 E = new bpn0(new buc0(18));
    public final bpn0 F = new bpn0(new ta50(21));
    public final bpn0 G = new bpn0(new h8n0(this, 14));
    public final bpn0 H = new bpn0(new uyq0(this, 7));
    public final bpn0 I = new bpn0(new rqs0(this, 5));
    public final bpn0 J = new bpn0(new sgt0(this, 3));
    public final bpn0 K = new bpn0(new hri0(this, 18));
    public final bpn0 L = new bpn0(new mll0(this, 17));
    public final bpn0 M = new bpn0(new fem0(this, 10));
    public final bpn0 N = new bpn0(new wrl0(this, 21));
    public final bpn0 P = new bpn0(new d2c0(14));
    public final bpn0 Q = new bpn0(new rme0(this, 19));
    public final ehm0 R = new ehm0(this, 13);
    public final hgu0 S = new hgu0(this);

    /* compiled from: VkBrowserView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlashlightUtils.EnableFlashlightResult.values().length];
            try {
                iArr[FlashlightUtils.EnableFlashlightResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlashlightUtils.EnableFlashlightResult.NO_PERMISSIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ggu0(Context context, agu0 agu0Var, mfu0 mfu0Var, wwv0 wwv0Var, kgu0 kgu0Var, jgu0 jgu0Var) {
        this.b = context;
        this.c = agu0Var;
        this.d = mfu0Var;
        this.e = wwv0Var;
        this.f = kgu0Var;
        this.g = jgu0Var;
        this.C = mfu0Var.getState().g().a;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Af() {
        com.vk.superapp.browser.internal.ui.shortcats.a aVar = this.x;
        if (aVar != null) {
            qro0.c(new zy(aVar, 0));
        }
    }

    public final void B() {
        pa3 pa3Var = this.A;
        if (pa3Var.d) {
            return;
        }
        this.A = pa3.a(pa3Var, false, true, 7);
        C(new dgu0(this, 0), new mlf0(this, 23));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final Activity B0() {
        return gnj.b(this.b);
    }

    public final void C(izs izsVar, mlf0 mlf0Var) {
        fvv0 fvv0Var = this.e;
        if (fvv0Var.getAppId() == uhx.a().a) {
            if (mlf0Var != null) {
                mlf0Var.invoke();
                return;
            }
            return;
        }
        xgx0.a.getClass();
        xgx0.f("load data and update app info");
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        zen0 d = vdx0Var.d();
        long appId = fvv0Var.getAppId();
        String n = n();
        String l = fvv0Var.l();
        WebApiApplication v = fvv0Var.v();
        this.r.b(zen0.a.b(d, appId, n, null, l, v != null ? v.w : null, 4).subscribe(new kjs(new o0p0(2, this, izsVar), 29), new zk30(new fuc0(mlf0Var, 26), 23)));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void C4(PersonalDiscountDialogType personalDiscountDialogType) {
        p().b(personalDiscountDialogType, null);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void D1(tb0 tb0Var) {
        ComponentCallbacks2 b = gnj.b(this.b);
        aeg0 aeg0Var = b instanceof aeg0 ? (aeg0) b : b instanceof VkBrowserActivity ? ((VkBrowserActivity) b).k : null;
        if (aeg0Var != null) {
            aeg0Var.Li(tb0Var);
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final io.reactivex.rxjava3.disposables.b D6() {
        return this.r;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Ei() {
        ber0 ber0Var = (ber0) this.I.getValue();
        if (((ggu0) ber0Var.d.c).b instanceof FragmentActivity) {
            io.reactivex.rxjava3.disposables.b bVar = ber0Var.b.r;
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            int i = 26;
            hg1.e(bVar, vdx0Var.m().c(ber0Var.a.getAppId()).subscribe(new t520(new bjm0(ber0Var, 4), 27), new p350(new j5b0(ber0Var, i), i)));
        }
    }

    @Override // xsna.mxv0
    public final void Ek(long j, vu80 vu80Var) {
        q().Ek(j, vu80Var);
    }

    @Override // xsna.fzu0
    public final void G9(WebApiApplication webApiApplication) {
        ubr0 k = k();
        k.getClass();
        qro0.c(new u5v0(1, k, webApiApplication));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean Hb(zhx0 zhx0Var) {
        return false;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Hc(String str) {
        this.d.getState().l(str);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Ii() {
        ber0 ber0Var = (ber0) this.I.getValue();
        io.reactivex.rxjava3.disposables.b bVar = ber0Var.b.r;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        hg1.e(bVar, vdx0Var.m().b(ber0Var.a.getAppId()).subscribe(new r7a0(new n3b0(ber0Var, 20), 19), new d750(new aer0(ber0Var, 0), 26)));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void J3(Intent intent, int... iArr) {
        Context context = this.b;
        Intent createChooser = Intent.createChooser(intent, context.getString(R.string.vk_apps_share));
        for (int i : iArr) {
            createChooser.addFlags(i);
        }
        context.startActivity(createChooser);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Jb(String str) {
        dvv0 a2;
        ovv0 J = p().a.J();
        if (J == null || (a2 = J.a(VkUiCommand.LEAVE_GROUP)) == null) {
            return;
        }
        a2.a(str);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final void K2() {
        j().K2();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final boolean Oe() {
        return j().Oe();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Og(String str) {
        dvv0 a2;
        ovv0 J = p().a.J();
        if (J == null || (a2 = J.a(VkUiCommand.COMMUNITY_WIDGET_PREVIEW_BOX)) == null) {
            return;
        }
        a2.a(str);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final void Q4(View view, VkUiView.BannerAd.UiData uiData, wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        j().Q4(view, uiData, wzsVar);
    }

    @Override // xsna.fzu0
    public final void Q6(WebApiApplication webApiApplication, String str) {
        k().getClass();
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.W(webApiApplication, str);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Qb() {
        C(new hfm0(this, 20), null);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Qm() {
        io.reactivex.rxjava3.core.w wVar = FlashlightUtils.a;
        io.reactivex.rxjava3.internal.operators.single.f0 q = new io.reactivex.rxjava3.internal.operators.single.v(new vbj(1)).q(FlashlightUtils.a);
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        this.r.b(q.m(io.reactivex.rxjava3.android.schedulers.a.a(myLooper)).o(Boolean.FALSE).subscribe(new rt10(new kyq0(this, 9), 24)));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean R7(boolean z) {
        return false;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final String T0() {
        return null;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void U3(ArrayList arrayList, WebIdentityCardData webIdentityCardData, WebApiApplication webApiApplication) {
        this.c.o(new WebIdentityContext(arrayList, webIdentityCardData, webApiApplication, 111, null, 16, null));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Va(OnboardingModalArguments onboardingModalArguments, defpackage.n0 n0Var) {
        new de80.a(onboardingModalArguments, this.b, n0Var).I0(null);
    }

    @Override // xsna.mxv0
    public final void Vf(WebApiApplication webApiApplication, vu80 vu80Var) {
        q().Vf(webApiApplication, vu80Var);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void W7(boolean z, boolean z2) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.n(z);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Wl() {
        kfr0 p = p();
        new dw20.b(((ggu0) p.f.c).b, null).M(R.drawable.vk_icon_thumbs_up_outline_56, Integer.valueOf(R.attr.vk_ui_text_accent)).v0(R.string.vk_apps_recommendation_dialog_title).r0(R.string.vk_apps_recommendation_dialog_subtitle).h0(R.string.vk_recommend, new u110(p, 25)).T(R.string.vk_apps_cancel, new b290(p, 28)).X(new afl0(p, 9)).M0().I0(null);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView.BannerAd
    public final boolean Y6(VkUiView.BannerAd.UiData.BannerAlign bannerAlign) {
        return j().Y6(bannerAlign);
    }

    @Override // xsna.fzu0
    public final void Z8(WebApiApplication webApiApplication, int i, int i2) {
        ubr0 k = k();
        ggu0 ggu0Var = k.b;
        io.reactivex.rxjava3.disposables.b bVar = ggu0Var.r;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        hg1.e(bVar, bug0.d(vdx0Var.d().f(i2, i, webApiApplication.b), gnj.b(ggu0Var.b), null, 6).subscribe(new k5j0(new qbr0(k, webApiApplication, i), 13), new d750(new hb40(k, 29), 25)));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean Ze(String str, boolean z) {
        return false;
    }

    @Override // xsna.yfu0.a
    public final void a() {
        if (x(new ghn0(this, 18))) {
            return;
        }
        g();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void ac() {
        this.d.n(JsApiMethodType.SHOW_IN_APP_REVIEW_DIALOG, new JSONObject().put("result", true));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void am(List<String> list) {
        z(list);
    }

    @Override // xsna.yfu0.a
    public final void b() {
        z(null);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean bh() {
        Integer o;
        WebApiApplication v = this.e.v();
        Integer valueOf = v != null ? Integer.valueOf(v.v) : null;
        return (valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 0 && (o = o()) != null && o.intValue() == 2);
    }

    public final void c(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        fvv0 fvv0Var = this.e;
        if (fvv0Var.o() && fvv0Var.g()) {
            gfx0 gfx0Var = e370.b;
            String str5 = null;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.getClass();
            boolean M = dhr0.M();
            Uri parse = Uri.parse(str);
            Uri.Builder buildUpon = parse.buildUpon();
            try {
                str3 = parse.getQueryParameter("lang");
            } catch (Exception unused) {
                str3 = null;
            }
            if (str3 == null) {
                buildUpon.appendQueryParameter("lang", ply.a());
            }
            try {
                str4 = parse.getQueryParameter("scheme");
            } catch (Exception unused2) {
                str4 = null;
            }
            if (str4 == null) {
                buildUpon.appendQueryParameter("scheme", !M ? "bright_light" : "space_gray");
            }
            try {
                str5 = parse.getQueryParameter("appearance");
            } catch (Exception unused3) {
            }
            if (str5 == null) {
                buildUpon.appendQueryParameter("appearance", !M ? "light" : "dark");
            }
            str2 = buildUpon.toString();
        } else {
            str2 = str;
        }
        BrowserPerfState browserPerfState = this.B;
        if (browserPerfState != null) {
            browserPerfState.h = str;
        }
        if (browserPerfState != null) {
            browserPerfState.i = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
        }
        Map<String, String> j = fvv0Var.j();
        if (j == null) {
            j = jgp.b;
        }
        this.d.v(str2, j, z);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean cl(boolean z) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (xsna.l8g.e(r5) < 0.75f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (xsna.l8g.e(r8) < 0.75f) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i) {
        ColorStateList color;
        boolean z = false;
        Context context = this.b;
        boolean z2 = true;
        if (i == 0) {
            Drawable e = e3m.e(android.R.attr.windowBackground, context);
            Integer valueOf = e instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) e).getColor()) : (!(e instanceof GradientDrawable) || (color = ((GradientDrawable) e).getColor()) == null) ? null : Integer.valueOf(color.getDefaultColor());
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                if (intValue == 0) {
                    gfx0 gfx0Var = e370.b;
                    (gfx0Var != null ? gfx0Var : null).getClass();
                    z = dhr0.M();
                }
                z2 = z;
            }
        } else {
            if (i == 0) {
                gfx0 gfx0Var2 = e370.b;
                (gfx0Var2 != null ? gfx0Var2 : null).getClass();
                z = dhr0.M();
            }
            z2 = z;
        }
        upn0 upn0Var = new upn0(z2, Integer.valueOf(i), Integer.valueOf(e3m.f(R.attr.vk_ui_background_content, context)));
        tpn0 G = this.e.G();
        if (G != null) {
            G.a(upn0Var);
        }
    }

    public final void e() {
        mfu0 mfu0Var = this.d;
        upn0 r = mfu0Var.getState().r();
        Boolean j = mfu0Var.getState().j();
        fvv0 fvv0Var = this.e;
        if (j != null) {
            boolean booleanValue = j.booleanValue();
            tpn0 G = fvv0Var.G();
            if (G != null) {
                G.b(booleanValue);
            }
        }
        boolean z = false;
        if (fvv0Var.v() == null || m().c().c() == VkBrowserMenuFactory.Style.NONE) {
            if (r == null) {
                d(0);
                return;
            }
            tpn0 G2 = fvv0Var.G();
            if (G2 != null) {
                G2.a(r);
                return;
            }
            return;
        }
        tdr0 m = m();
        fvv0 fvv0Var2 = m.b;
        if (m.i != null) {
            Context context = m.c().a;
            e3m.a aVar = e3m.a;
            int color = context.getColor(R.color.vk_black);
            Integer valueOf = Integer.valueOf(color);
            if (color == 0) {
                gfx0 gfx0Var = e370.b;
                if (gfx0Var == null) {
                    gfx0Var = null;
                }
                gfx0Var.getClass();
                z = dhr0.M();
            } else if (l8g.e(color) < 0.75f) {
                z = true;
            }
            upn0 upn0Var = new upn0(z, valueOf, Integer.valueOf(e3m.f(R.attr.vk_ui_background_content, ((ggu0) m.f.c).b)));
            tpn0 G3 = fvv0Var2.G();
            if (G3 != null) {
                G3.a(upn0Var);
            }
            fvv0Var2.B(true);
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void e3(tb0 tb0Var) {
        ComponentCallbacks2 b = gnj.b(this.b);
        aeg0 aeg0Var = b instanceof aeg0 ? (aeg0) b : b instanceof VkBrowserActivity ? ((VkBrowserActivity) b).k : null;
        if (aeg0Var != null) {
            aeg0Var.yk(tb0Var);
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void e8(boolean z, cvs cvsVar) {
        i(z, true, new tsk0(this, 29), cvsVar);
    }

    public final void f() {
        mfu0 mfu0Var = this.d;
        upn0 r = mfu0Var.getState().r();
        tpn0 G = this.e.G();
        if (G != null) {
            upn0 upn0Var = G.e;
            if (upn0Var != null || r == null) {
                if (upn0Var != null) {
                    G.a(upn0Var);
                }
            } else {
                Boolean j = mfu0Var.getState().j();
                if (j != null) {
                    G.b(j.booleanValue());
                }
                G.a(r);
            }
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void f7(long j, long j2, String str) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        vdx0Var.getClass();
        long a2 = qni0.a() / 1000;
        vdx0 vdx0Var2 = e370.e;
        this.r.b((vdx0Var2 != null ? vdx0Var2 : null).j().c(j, j2, a2, str).subscribe(new u0o0(new z4t0(this, 4), 9), new nzs0(new b8j0(this, 20), 2)));
    }

    public final void g() {
        com.vk.superapp.browser.internal.ui.shortcats.a aVar = this.x;
        if (aVar != null) {
            j8n0 j8n0Var = new j8n0(this, 22);
            AddActionSuggestion addActionSuggestion = aVar.f;
            if (addActionSuggestion == null || (addActionSuggestion.d == AddActionSuggestion.Action.ADD_TO_MAIN_SCREEN && !aVar.c())) {
                j8n0Var.invoke();
                return;
            }
            long a2 = aVar.e.a();
            if (!addActionSuggestion.b || addActionSuggestion.c > a2) {
                j8n0Var.invoke();
            } else {
                aVar.g(AppLifecycleEvent.ON_CLOSE, j8n0Var);
            }
        }
    }

    @Override // xsna.fzu0
    public final void g8(UserId userId, String str) {
        ubr0 k = k();
        io.reactivex.rxjava3.disposables.b bVar = k.b.r;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        hg1.e(bVar, bug0.d(vdx0Var.d().P(k.a.getAppId(), userId), ((ggu0) k.g.c).b, null, 6).subscribe(new d120(new f55(k, userId, str, 8), 25), new ksb0(new b8e0(k, 18), 11)));
    }

    public final void h(String str, boolean z, q7j0 q7j0Var) {
        fvv0 fvv0Var = this.e;
        WebApiApplication v = fvv0Var.v();
        String str2 = fvv0Var.h() ? "html_game_from_share" : "html_service_from_share";
        bpn0 bpn0Var = this.m;
        if (v == null) {
            ((mbj0) bpn0Var.getValue()).e = z;
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            (superappUiRouterBridge != null ? superappUiRouterBridge : null).U(str);
            return;
        }
        mbj0 mbj0Var = (mbj0) bpn0Var.getValue();
        mbj0Var.e = z;
        mbj0Var.c = true;
        zex0 zex0Var = e370.q;
        if (zex0Var != null) {
            nhj nhjVar = mbj0Var.f;
            frl0 frl0Var = new frl0(nhjVar, 1);
            zex0.a aVar = zex0.a.STORY;
            zex0Var.b(aVar).put(nhjVar, frl0Var);
            zex0Var.a(aVar).b(113, frl0Var);
        }
        zex0 zex0Var2 = e370.q;
        if (zex0Var2 != null) {
            final tvq tvqVar = mbj0Var.g;
            bd70<?> bd70Var = new bd70() { // from class: xsna.yex0
                @Override // xsna.bd70
                public final void x0(int i, int i2, Object obj) {
                    u0q u0qVar = (u0q) obj;
                    if (u0qVar == null) {
                        return;
                    }
                    tvq.this.invoke(Integer.valueOf(i), Integer.valueOf(i2), new t0q(u0qVar.a, u0qVar.b));
                }
            };
            zex0.a aVar2 = zex0.a.NEWS_FEED;
            zex0Var2.b(aVar2).put(tvqVar, bd70Var);
            zex0Var2.a(aVar2).b(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, bd70Var);
        }
        mbj0Var.d = ysg0.b.a.b0(ern0.class).subscribe(new d120(new wug0(mbj0Var, 3), 14));
        SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
        (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).g(v, str, q7j0Var, str2);
    }

    public final void i(boolean z, boolean z2, tsk0 tsk0Var, cvs cvsVar) {
        io.reactivex.rxjava3.internal.operators.single.r rVar;
        Activity b = gnj.b(this.b);
        if (b == null) {
            return;
        }
        int i = 22;
        boolean z3 = true;
        char c = 1;
        if (z) {
            io.reactivex.rxjava3.core.w wVar = FlashlightUtils.a;
            rVar = new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.b(new nu0(b, 21)).q(io.reactivex.rxjava3.android.schedulers.a.b()), new c8(new xnr(z3, 0), 14));
        } else {
            io.reactivex.rxjava3.core.w wVar2 = FlashlightUtils.a;
            rVar = new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new vbj(c == true ? 1 : 0)).q(FlashlightUtils.a), new b8(new wnr(b, z2), i));
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        this.r.b(rVar.m(io.reactivex.rxjava3.android.schedulers.a.a(myLooper)).h(new aas0(new rzl0(cvsVar, i), 3)).subscribe(new pw40(new pm90(12, tsk0Var, cvsVar), 19)));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void i4(String str, String str2, String str3) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.Y(str, str2, str3);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final boolean i6() {
        return m().c().d();
    }

    @Override // xsna.mxv0
    public final void i7(WebApiApplication webApiApplication, vu80 vu80Var) {
        q().i7(webApiApplication, vu80Var);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void ic() {
        kfr0 p = p();
        p.getClass();
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        p.b.r.b(vdx0Var.d().N((int) p.a.getAppId()).subscribe(new wvq0(new u2k0(p, 15), 3), new eiy(new hsc0(p, 24), 26)));
    }

    public final v6r0 j() {
        return (v6r0) this.M.getValue();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final VkUiView.BannerAd j0() {
        return (VkUiView.BannerAd) this.i.getValue();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void jk() {
        a();
    }

    public final ubr0 k() {
        return (ubr0) this.J.getValue();
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final izs<lvv0, s3q0> ke() {
        return this.h;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void kk(String str, q7j0 q7j0Var) {
        h(str, false, q7j0Var);
    }

    public final ddr0 l() {
        return (ddr0) this.N.getValue();
    }

    @Override // xsna.mxv0
    public final void l9(WebApiApplication webApiApplication, int i) {
        q().l9(webApiApplication, i);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void lj(final boolean z) {
        final ber0 ber0Var = (ber0) this.I.getValue();
        ggu0 ggu0Var = ber0Var.b;
        ggu0Var.m().g.g(true);
        utj.a aVar = new utj.a(((ggu0) ber0Var.d.c).b);
        int i = ber0.e;
        aVar.k = new Size(i, i);
        aVar.g(R.drawable.vk_icon_check_outline_circle_fill_black_40);
        aVar.j(z ? R.string.vk_apps_games_notifications_popup_text : R.string.vk_apps_service_notifications_popup_text);
        aVar.d(R.string.vk_apps_games_notifications_settings, new izs() { // from class: xsna.ydr0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                utj utjVar = (utj) obj;
                udx0 udx0Var = e370.i;
                if (udx0Var == null) {
                    udx0Var = null;
                }
                ber0 ber0Var2 = ber0Var;
                udx0Var.d(z, ber0Var2.a.getAppId(), ActionGamesNotificationsPopup.SETTINGS_OPENED);
                ber0Var2.b.z(null);
                utjVar.b();
                return s3q0.a;
            }
        });
        aVar.q = ber0.f;
        aVar.u = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
        aVar.m = 0.25f;
        int a2 = iah0.a(8);
        aVar.b = a2;
        aVar.c = a2;
        utj a3 = aVar.a();
        a3.o = new fnf(z, ber0Var, 2);
        a3.p = new izs() { // from class: xsna.zdr0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ber0 ber0Var2 = ber0.this;
                ber0Var2.b.o = null;
                int i2 = ber0.a.$EnumSwitchMapping$0[((HideReason) obj).ordinal()];
                ActionGamesNotificationsPopup actionGamesNotificationsPopup = i2 != 1 ? i2 != 2 ? null : ActionGamesNotificationsPopup.CLOSED_BY_SWIPE : ActionGamesNotificationsPopup.CLOSED_BY_TIMEOUT;
                if (actionGamesNotificationsPopup != null) {
                    udx0 udx0Var = e370.i;
                    (udx0Var != null ? udx0Var : null).d(z, ber0Var2.a.getAppId(), actionGamesNotificationsPopup);
                }
                return s3q0.a;
            }
        };
        a3.f(gnj.b(ggu0Var.b).getWindow());
        ggu0Var.o = a3;
    }

    public final tdr0 m() {
        return (tdr0) this.K.getValue();
    }

    public final String n() {
        String r;
        BrowserPerfState browserPerfState = this.B;
        if (browserPerfState == null || (r = browserPerfState.h) == null) {
            r = r();
        }
        return Uri.parse(r).getQueryParameter("vk_ref");
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void n9() {
        String string;
        String string2;
        kfr0 p = p();
        mfu0 mfu0Var = p.c;
        fvv0 fvv0Var = p.a;
        if (fvv0Var.f()) {
            mfu0Var.s(EventNames.AddToFavorites, new AddToFavorites$Response(null, new AddToFavorites$Response.Data(true, null, 2, null), 1, null));
            return;
        }
        if (mfu0Var.o()) {
            mfu0Var.z(new wlb0());
            return;
        }
        Context context = ((ggu0) p.f.c).b;
        if (fvv0Var.h()) {
            string = context.getString(R.string.vk_apps_game_add_to_menu_title, fvv0Var.t().c);
            string2 = context.getString(R.string.vk_apps_game_add_to_menu_subtitle);
        } else {
            string = context.getString(R.string.vk_apps_add_vkapp_to_favorite);
            string2 = context.getString(R.string.vk_apps_add_vkapp_to_favorite_suggestion);
        }
        aex0.a aVar = new aex0.a();
        aVar.a = "VkBrowserView.addToFavorites";
        aVar.b = Integer.valueOf(R.drawable.vk_icon_users_outline_56);
        aVar.e = string;
        aVar.f = string2;
        aVar.b(context.getString(R.string.vk_apps_add), new ffr0(p));
        aVar.h = new aex0.e(context.getString(R.string.vk_apps_cancel_request), new gfr0(p));
        aVar.j = new hfr0(p);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        (superappUiRouterBridge != null ? superappUiRouterBridge : null).e0(aVar.a());
    }

    @Override // xsna.mxv0
    public final void nn(WebApiApplication webApiApplication, int i, boolean z) {
        q().nn(webApiApplication, i, z);
    }

    public final Integer o() {
        Configuration configuration;
        Resources resources = this.b.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return null;
        }
        return Integer.valueOf(configuration.orientation);
    }

    @Override // xsna.fzu0
    public final void o9(UserId userId, String str, String str2) {
        ubr0 k = k();
        io.reactivex.rxjava3.disposables.b bVar = k.b.r;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        ufn0 v = vdx0Var.v();
        k.a.getAppId();
        hg1.e(bVar, bug0.d(v.c(Collections.singletonList(userId)), ((ggu0) k.g.c).b, null, 6).subscribe(new whm0(new sy4(k, str, str2), 6), new be50(new mga0(k, 26), 20)));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void oc(String str) {
        kfr0 p = p();
        ggu0 ggu0Var = p.b;
        Context context = ((ggu0) p.f.c).b;
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        String e = wdx0Var.e();
        if (e == null) {
            e = "";
        }
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(context);
        int i = utj.s;
        int i2 = utj.s;
        int i3 = utj.t;
        int i4 = utj.u;
        int i5 = utj.v;
        FloatingViewGesturesHelper.SwipeDirection swipeDirection = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        float f = utj.x;
        klw klwVar = new klw(create, e);
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_gift_circle_fill_yellow_20, context);
        z8l0 z8l0Var = new z8l0(p, 9);
        String string = context.getString(R.string.vk_apps_personal_discount_notification_popup_action);
        Integer valueOf = Integer.valueOf(e3m.f(R.attr.vk_ui_text_accent_themed, context));
        long j = ber0.f;
        FloatingViewGesturesHelper.SwipeDirection swipeDirection2 = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
        int a3 = iah0.a(8);
        utj utjVar = new utj(context, new utj.k(str, string, false), new utj.i(false, true, true), new utj.f(a3, a3, i3, i3, i4, i5), new utj.j(null, null), new utj.h(null, valueOf), new utj.e(z8l0Var, new g8n0(p, 6), null), new utj.b(null, null, null), new utj.c(klwVar, a2), new utj.d(swipeDirection2, 3, j, 0.25f, new utj.g(), null, false, f));
        utjVar.p = null;
        utjVar.o = new f84(24);
        utjVar.p = new efr0(p, 0);
        utjVar.f(gnj.b(ggu0Var.b).getWindow());
        ggu0Var.o = utjVar;
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void oh(WebGroupShortInfo webGroupShortInfo, w7y w7yVar) {
        kfr0 p = p();
        p.getClass();
        WebGroup webGroup = webGroupShortInfo.b;
        Context context = ((ggu0) p.f.c).b;
        aex0.a aVar = new aex0.a();
        WebImageSize e = webGroupShortInfo.i.e(200);
        String str = e != null ? e.b : null;
        Boolean bool = Boolean.TRUE;
        aVar.c = str;
        aVar.d = bool;
        aVar.a = String.valueOf(webGroup.b);
        aVar.e = context.getString(R.string.vk_apps_get_group_info_title, webGroup.c);
        aVar.f = context.getString(R.string.vk_apps_get_group_info_subtitle);
        aVar.b(context.getString(R.string.vk_apps_access_allow), new lfr0(w7yVar));
        aVar.h = new aex0.e(context.getString(R.string.vk_apps_access_disallow), new mfr0(w7yVar));
        aVar.j = new nfr0(w7yVar);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        (superappUiRouterBridge != null ? superappUiRouterBridge : null).e0(aVar.a());
    }

    public final kfr0 p() {
        return (kfr0) this.L.getValue();
    }

    public final mxv0 q() {
        return (mxv0) this.G.getValue();
    }

    public final String r() {
        fvv0 fvv0Var = this.e;
        String c = fvv0Var.c();
        if (c != null) {
            return c;
        }
        WebApiApplication v = fvv0Var.v();
        if (v != null) {
            return v.D;
        }
        return null;
    }

    public final qxv0 s() {
        return (qxv0) this.H.getValue();
    }

    public final void t() {
        if (!u()) {
            this.d.q("if (document.getElementById('eruda_id')) {\n    eruda.destroy();\n}");
            return;
        }
        boolean f = this.d.getState().f();
        mfu0 mfu0Var = this.d;
        StringBuilder sb = new StringBuilder("\n        if (!document.getElementById('eruda_id')) {\n            var script = document.createElement('script');\n            script.src = 'https://");
        sb.append(a0a.d);
        sb.append("/js/api/eruda.js';\n            script.type = 'text/javascript';\n            script.id = 'eruda_id';\n            script.defer = true;\n            script.onload = function() {\n                if (");
        sb.append(f);
        sb.append(") {\n                    eruda.init({\n                        defaults: {\n                            theme: '");
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        sb.append(dhr0.M() ? "Dark" : "Light");
        sb.append("'\n                        }\n                    });\n                }\n            };\n            document.getElementsByTagName('body')[0].appendChild(script);\n        }\n    ");
        mfu0Var.q(xqm0.g(sb.toString()));
    }

    public final boolean u() {
        WebApiApplication v = this.e.v();
        if (v != null && v.T == null) {
            if (!v.Q) {
                if (e370.s != null) {
                    o2l.a.getClass();
                    if (o2l.b("__dbg_log_eruda_mini_app", false)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean v() {
        return ((Boolean) this.P.getValue()).booleanValue();
    }

    public final void w(boolean z) {
        String g;
        fvv0 fvv0Var = this.e;
        fvv0Var.N();
        String r = r();
        if (r != null && r.length() != 0) {
            c(r, z);
            return;
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        zen0 d = vdx0Var.d();
        long appId = fvv0Var.getAppId();
        g = dd80.g(fvv0Var.getAppId(), null, r, null, "", null);
        hg1.h(d.d(appId, UserId.d, g, null, null).U(new wga0(new jyq0(6), 8)).F(new t6m0(new sxl0(this, 13), 7)), new v6k(this, z, 3));
    }

    public final boolean x(gzs<s3q0> gzsVar) {
        boolean z;
        boolean z2;
        String str;
        WebAdConfig webAdConfig;
        boolean z3;
        FragmentManager supportFragmentManager;
        Fragment H;
        boolean v = v();
        fvv0 fvv0Var = this.e;
        if ((v && fvv0Var.h() && l().a()) || !fvv0Var.h()) {
            return false;
        }
        WebApiApplication v2 = fvv0Var.v();
        if (v2 == null || (webAdConfig = v2.V) == null || !webAdConfig.g) {
            z = true;
            if (!((Boolean) this.Q.getValue()).booleanValue()) {
                final ubr0 k = k();
                final d5 d5Var = new d5(25, this, gzsVar);
                final l6n0 l6n0Var = new l6n0(this, 21);
                Context context = ((ggu0) k.g.c).b;
                eeu0.a aVar = new eeu0.a(context);
                aVar.setTitle(context.getString(R.string.vk_apps_games_alert_title));
                String string = context.getString(R.string.vk_apps_games_alert_message);
                AlertController.b bVar = aVar.a;
                bVar.f = string;
                aVar.h = new DialogInterface.OnShowListener() { // from class: xsna.rbr0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        VkBridgeAnalytics E = ubr0.this.a.E();
                        if (E != null) {
                            E.m(VkBridgeAnalytics.ExitGameAlertEvent.SHOW_ALERT, (Integer) l6n0Var.invoke());
                        }
                    }
                };
                aVar.f(context.getString(R.string.vk_apps_games_alert_stay_in_game), new jvt(1, k, l6n0Var));
                aVar.j(context.getString(R.string.vk_apps_games_alert_confirm_exit), new DialogInterface.OnClickListener() { // from class: xsna.sbr0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        VkBridgeAnalytics E = ubr0.this.a.E();
                        if (E != null) {
                            E.m(VkBridgeAnalytics.ExitGameAlertEvent.EXIT_FROM_GAME, (Integer) l6n0Var.invoke());
                        }
                        d5Var.invoke();
                    }
                });
                bVar.n = new DialogInterface.OnCancelListener() { // from class: xsna.tbr0
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        VkBridgeAnalytics E = ubr0.this.a.E();
                        if (E != null) {
                            E.m(VkBridgeAnalytics.ExitGameAlertEvent.STAY_IN_GAME, (Integer) l6n0Var.invoke());
                        }
                    }
                };
                aVar.m();
                return true;
            }
            ubr0 k2 = k();
            ni0 ni0Var = new ni0(29, this, gzsVar);
            rrn0 rrn0Var = new rrn0(this, 27);
            List<WebApiApplication> list = this.O;
            fvv0 fvv0Var2 = k2.a;
            Context context2 = ((ggu0) k2.g.c).b;
            while (true) {
                z2 = context2 instanceof FragmentActivity;
                if (z2 || !(context2 instanceof ContextWrapper)) {
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            FragmentActivity fragmentActivity = (FragmentActivity) (z2 ? (Activity) context2 : null);
            if (fragmentActivity != null) {
                FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
                Fragment H2 = supportFragmentManager2.H("NewFullScreenGamesConfirmExitDialog");
                if (H2 != null) {
                    str = !H2.isVisible() ? "NewFullScreenGamesConfirmExitDialog" : "NewFullScreenGamesConfirmExitDialog";
                    return true;
                }
                long appId = fvv0Var2.getAppId();
                Bundle bundle = new Bundle();
                bundle.putLong("APP_ID_KEY", appId);
                WebApiApplication v3 = fvv0Var2.v();
                bundle.putParcelable("WEB_AD_CONFIG_KEY", v3 != null ? v3.V : null);
                WebApiApplication v4 = fvv0Var2.v();
                Integer valueOf = v4 != null ? Integer.valueOf(v4.v) : null;
                if (valueOf != null) {
                    bundle.putInt("APP_ORIENTATION_KEY", valueOf.intValue());
                }
                bundle.putParcelableArrayList("RECOMMENDED_GAMES_KEY", list != null ? p4g.q(list) : null);
                bundle.putInt("DIALOG_TYPE_KEY", 2);
                m760 m760Var = new m760();
                m760Var.setArguments(bundle);
                supportFragmentManager2.l0("GAMES_CONFIRM_EXIT_DIALOG_KEY", fragmentActivity, new qj7(k2, supportFragmentManager2, rrn0Var, ni0Var));
                if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                    k2.i++;
                    m760Var.Td(supportFragmentManager2, str);
                    return true;
                }
                return true;
            }
        } else {
            ubr0 k3 = k();
            fgu0 fgu0Var = new fgu0(0, this, gzsVar);
            iml0 iml0Var = new iml0(this, 25);
            fvv0 fvv0Var3 = k3.a;
            Context context3 = ((ggu0) k3.g.c).b;
            while (true) {
                z3 = context3 instanceof FragmentActivity;
                if (z3 || !(context3 instanceof ContextWrapper)) {
                    break;
                }
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
            FragmentActivity fragmentActivity2 = (FragmentActivity) (z3 ? (Activity) context3 : null);
            if (fragmentActivity2 == null || ((H = (supportFragmentManager = fragmentActivity2.getSupportFragmentManager()).H("FullScreenGamesConfirmExitDialog")) != null && H.isVisible())) {
                return true;
            }
            long appId2 = fvv0Var3.getAppId();
            z = true;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("APP_ID_KEY", appId2);
            WebApiApplication v5 = fvv0Var3.v();
            bundle2.putParcelable("WEB_AD_CONFIG_KEY", v5 != null ? v5.V : null);
            WebApiApplication v6 = fvv0Var3.v();
            Integer valueOf2 = v6 != null ? Integer.valueOf(v6.v) : null;
            if (valueOf2 != null) {
                bundle2.putInt("APP_ORIENTATION_KEY", valueOf2.intValue());
            }
            bundle2.putParcelableArrayList("RECOMMENDED_GAMES_KEY", null);
            bundle2.putInt("DIALOG_TYPE_KEY", 3);
            vvs vvsVar = new vvs();
            vvsVar.setArguments(bundle2);
            supportFragmentManager.l0("GAMES_CONFIRM_EXIT_DIALOG_KEY", fragmentActivity2, new aw8(k3, supportFragmentManager, iml0Var, fgu0Var));
            if (!fragmentActivity2.isFinishing() && !fragmentActivity2.isDestroyed()) {
                k3.i++;
                vvsVar.Td(supportFragmentManager, "FullScreenGamesConfirmExitDialog");
                return true;
            }
        }
        return z;
    }

    @Override // xsna.mxv0
    public final void xk(WebApiApplication webApiApplication, String str, boolean z) {
        q().xk(webApiApplication, str, z);
    }

    public final void y() {
        ViewGroup d;
        View findViewById;
        if (!u() || !this.p || this.e.i() || (d = s().d()) == null || (findViewById = d.findViewById(R.id.show_console)) == null) {
            return;
        }
        findViewById.setVisibility(0);
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void y4(List<String> list, Long l, WebApiApplication webApiApplication, l1w0 l1w0Var) {
        gah0 gah0Var = (gah0) this.l.getValue();
        if (l == null) {
            if (gah0Var.b == null) {
                gah0Var.b = new fah0(gah0Var.a, webApiApplication, new lzq0(webApiApplication.c));
            }
            fah0 fah0Var = gah0Var.b;
            if (fah0Var != null) {
                gah0Var.a(fah0Var, list, l1w0Var);
                return;
            }
            return;
        }
        gah0Var.getClass();
        long longValue = l.longValue();
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        vdx0Var.j().f(longValue).subscribe(new vk40(new lxo(gah0Var, webApiApplication, list, l1w0Var, 2), 16), new qg60(new xka0(l1w0Var, 7), 14));
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void yc(long j, boolean z, gzs gzsVar, izs izsVar, boolean z2) {
        kfr0 p = p();
        hii0 hii0Var = new hii0(j, z, gzsVar, izsVar, z2);
        p.getClass();
        io.reactivex.rxjava3.disposables.b bVar = p.b.r;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        hg1.e(bVar, vdx0Var.d().M(j, z).subscribe(new k2y(new dim0(p, z, hii0Var), 22), new qw40(new ndg0(7, hii0Var, p), 25)));
    }

    public final void z(List<String> list) {
        utj utjVar = this.o;
        if (utjVar != null) {
            utjVar.b();
        }
        this.o = null;
        tdr0 m = m();
        m.g.c(list);
        xfu0 xfu0Var = m.g;
        Context context = ((ggu0) m.f.c).b;
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        tgn0Var.c(gfx0Var != null ? gfx0Var : null);
        xfu0Var.a(context);
    }

    @Override // xsna.mxv0
    public final void z7(long j, vu80 vu80Var) {
        q().z7(j, vu80Var);
    }

    @Override // xsna.mxv0
    public final void P3() {
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void Rl() {
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void h2() {
    }

    @Override // xsna.mxv0
    public final void Ti(Bundle bundle) {
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiView
    public final void pl(Integer num) {
    }

    @Override // xsna.mxv0
    public final void te(Bundle bundle) {
    }
}
