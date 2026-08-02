package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutPendingData;
import com.vk.superapp.browser.ui.model.PersonalDiscountTransitionFrom;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.dw20;

/* compiled from: VkCallbackViewDelegate.kt */
/* loaded from: classes6.dex */
public final class ihu0 implements wc80 {
    public final ggu0 a;
    public final z380 b;
    public final mfu0 c;
    public final xc80 d;
    public final fvv0 e;
    public final dbj0 f;
    public final vpj0 g;
    public final tvs0 h;
    public boolean i;
    public final hhu0 j = new hhu0();
    public final bpn0 k = new bpn0(new y3l0(this, 24));

    /* compiled from: VkCallbackViewDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    public ihu0(ggu0 ggu0Var, z380 z380Var, mfu0 mfu0Var, xc80 xc80Var, fvv0 fvv0Var, dbj0 dbj0Var, vpj0 vpj0Var, tvs0 tvs0Var) {
        this.a = ggu0Var;
        this.b = z380Var;
        this.c = mfu0Var;
        this.d = xc80Var;
        this.e = fvv0Var;
        this.f = dbj0Var;
        this.g = vpj0Var;
        this.h = tvs0Var;
    }

    public final void A(boolean z) {
        long j = this.e.t().b;
        io.reactivex.rxjava3.disposables.b bVar = this.a.r;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        hg1.e(bVar, vdx0Var.d().H(j, z).subscribe(new h4f0(new meh(this, z, 2), 17), new dpo0(new b(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 7)));
    }

    @Override // xsna.wc80
    public final void a(long j) {
        VkUiView.a.a(this.a, j, false, null, null, false, 60);
    }

    @Override // xsna.wc80
    public final void b() {
        mfu0 mfu0Var = this.c;
        mfu0Var.getState().h(true);
        StringBuilder sb = new StringBuilder("\n        if (document.getElementById('eruda_id')) {\n            eruda.init({\n                defaults: {\n                    theme: '");
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        sb.append(dhr0.M() ? "Dark" : "Light");
        sb.append("'\n                }\n            });\n        }\n    ");
        mfu0Var.q(xqm0.g(sb.toString()));
    }

    @Override // xsna.wc80
    public final void c() {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.a0(((ggu0) this.h.c).b);
        ((xfu0) this.g.invoke()).dismiss();
    }

    @Override // xsna.wc80
    public final void d() {
        A(true);
    }

    @Override // xsna.wc80
    public final void e() {
        String str = this.e.t().b0;
        if (str != null) {
            rex0 rex0Var = e370.j;
            if (rex0Var == null) {
                rex0Var = null;
            }
            rex0Var.c(((ggu0) this.h.c).b, str);
        }
    }

    @Override // xsna.wc80
    public final void f(WebApiApplication webApiApplication) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge;
        Context context = ((ggu0) this.h.c).b;
        String str = webApiApplication.D;
        if (str == null) {
            str = "";
        }
        SuperappUiRouterBridge.b.b(superappUiRouterBridge2, context, webApiApplication, new nex0(str, "https://" + a0a.d + "/app" + webApiApplication.b), "mini_apps_action_menu", null, null, null, 112);
        ((xfu0) this.g.invoke()).dismiss();
    }

    @Override // xsna.wc80
    public final void g(BannerType bannerType) {
        VkBridgeAnalytics E = this.e.E();
        if (E != null) {
            E.l(VkBridgeAnalytics.PersonalDiscountEvent.OPEN_TAB_MENU_PURCHASE, bannerType);
        }
        PersonalDiscountTransitionFrom personalDiscountTransitionFrom = PersonalDiscountTransitionFrom.FROM_MENU;
        ggu0 ggu0Var = this.a;
        if (((Boolean) ggu0Var.D.getValue()).booleanValue()) {
            ggu0Var.p().b((PersonalDiscountDialogType) ggu0Var.E.getValue(), personalDiscountTransitionFrom);
        } else {
            ggu0Var.p().a(personalDiscountTransitionFrom);
        }
        ((xfu0) this.g.invoke()).dismiss();
    }

    @Override // xsna.wc80
    public final void h(String str) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.D((int) this.e.getAppId(), ((ggu0) this.h.c).b);
        ((xfu0) this.g.invoke()).dismiss();
    }

    @Override // xsna.wc80
    public final void i() {
        mfu0 mfu0Var = this.c;
        mfu0Var.getState().h(false);
        mfu0Var.q("if (document.getElementById('eruda_id')) {\n    eruda.destroy();\n}");
    }

    @Override // xsna.wc80
    public final void j() {
        ((ber0) this.a.I.getValue()).a();
    }

    @Override // xsna.wc80
    public final void k(String str) {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(((ggu0) this.h.c).b, Uri.parse(str));
    }

    @Override // xsna.wc80
    public final void l(String str) {
        this.a.h(str, true, null);
    }

    @Override // xsna.wc80
    public final void m() {
        fvv0 fvv0Var = this.e;
        Pair pair = fvv0Var.h() ? new Pair(Integer.valueOf(R.string.vk_apps_games_delete_game), Integer.valueOf(R.string.vk_apps_games_delete_game_question)) : new Pair(Integer.valueOf(R.string.vk_apps_app_uninstall), Integer.valueOf(R.string.vk_apps_app_removed));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        Context context = ((ggu0) this.h.c).b;
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.c(new VkAlertData.b(context.getString(intValue), context.getString(intValue2, fvv0Var.t().c), VkAlertData.DialogType.CONFIRMATION, new VkAlertData.a(context.getString(R.string.vk_apps_delete), Integer.valueOf(R.string.vk_apps_delete)), new VkAlertData.a(context.getString(R.string.cancel), null), 32), new a());
    }

    @Override // xsna.wc80
    public final void n() {
        this.a.Ii();
    }

    @Override // xsna.wc80
    public final void o() {
        View view = (View) this.f.invoke();
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.a(this.e.t(), view != null ? view.getWidth() : 0, view != null ? view.getHeight() : 0, new im80(13), new e1s0(this, 7), new pnr0(this, 6), ((ggu0) this.h.c).b);
    }

    @Override // xsna.wc80
    public final void p() {
        new dw20.b(((ggu0) this.h.c).b, null).M(R.drawable.vk_icon_thumbs_up_outline_56, Integer.valueOf(R.attr.vk_ui_text_accent)).v0(R.string.vk_apps_recommendation_confirm_dialog_title).r0(R.string.vk_apps_recommendation_confirm_dialog_subtitle).h0(R.string.vk_recommend, new srq0(this, 10)).T(R.string.vk_apps_cancel, new f7q0(7)).M0().I0(null);
    }

    @Override // xsna.wc80
    public final void q() {
        y(true);
    }

    @Override // xsna.wc80
    public final void r(String str) {
        Context context = ((ggu0) this.h.c).b;
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.j(context.getString(R.string.copy_toast_msg));
        ((xfu0) this.g.invoke()).hide();
    }

    @Override // xsna.wc80
    public final void s() {
        this.b.a(new h8n0(this, 15));
        this.d.m(true);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.j(((ggu0) this.h.c).b.getString(R.string.vk_apps_cache_has_been_cleared));
    }

    @Override // xsna.wc80
    public final void t() {
        fvv0 fvv0Var = this.e;
        if (!fvv0Var.S() || this.i || fvv0Var.f()) {
            return;
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.core.q<Boolean> k = vdx0Var.d().k(fvv0Var.getAppId());
        j990 j990Var = new j990(new b3m0(this, 19), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        z(k.E(j990Var, lVar, kVar, kVar).F(new f7r0(new gqq0(this, 7), 3)), true);
    }

    @Override // xsna.wc80
    public final void u() {
        ShortcutPendingData.ShortcutSource shortcutSource = ShortcutPendingData.ShortcutSource.ACTION_MENU;
        com.vk.superapp.browser.internal.ui.shortcats.a aVar = this.a.x;
        if (aVar != null) {
            aVar.a(shortcutSource);
        }
    }

    @Override // xsna.wc80
    public final void v() {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.A(this.e.getAppId());
        ((xfu0) this.g.invoke()).dismiss();
    }

    @Override // xsna.wc80
    public final void w() {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.Q(((ggu0) this.h.c).b);
        ((xfu0) this.g.invoke()).dismiss();
    }

    @Override // xsna.wc80
    public final void x() {
        A(false);
    }

    public final void y(boolean z) {
        fvv0 fvv0Var = this.e;
        if (fvv0Var.S() && !this.i && fvv0Var.f()) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            io.reactivex.rxjava3.core.q<Boolean> K = vdx0Var.d().K(fvv0Var.getAppId());
            tk40 tk40Var = new tk40(new ghu0(this, z), 25);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            z(K.E(tk40Var, lVar, kVar, kVar), z);
        }
    }

    public final void z(io.reactivex.rxjava3.internal.operators.observable.b0 b0Var, boolean z) {
        hg1.e(this.a.r, new io.reactivex.rxjava3.internal.operators.observable.c0(b0Var, new y730(new alj0(this, 28), 23), io.reactivex.rxjava3.internal.functions.a.c).G(new cm4(this, 8)).subscribe(new qgs0(new r6i0(this, 23), 3), new hrt0(new lom(this, z), 1)));
    }

    /* compiled from: VkCallbackViewDelegate.kt */
    public static final class a implements SuperappUiRouterBridge.d {
        public a() {
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
        public final void a(VkAlertData.a aVar) {
            io.reactivex.rxjava3.core.q<Boolean> x;
            if (epx.f(aVar.b, Integer.valueOf(R.string.vk_apps_delete))) {
                ihu0 ihu0Var = ihu0.this;
                fvv0 fvv0Var = ihu0Var.e;
                if (fvv0Var.h()) {
                    vdx0 vdx0Var = e370.e;
                    x = (vdx0Var != null ? vdx0Var : null).d().r(fvv0Var.getAppId());
                } else {
                    vdx0 vdx0Var2 = e370.e;
                    x = (vdx0Var2 != null ? vdx0Var2 : null).d().x(fvv0Var.getAppId());
                }
                hg1.e(ihu0Var.a.r, x.subscribe(new nan0(new fda0(ihu0Var, 22), 6), new epq0(new l5r0(7), 6)));
            }
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
        public final void onDismiss() {
        }
    }
}
