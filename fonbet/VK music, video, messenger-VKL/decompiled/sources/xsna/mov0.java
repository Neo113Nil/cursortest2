package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.app.AutoBuyStatus;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vk.superapp.api.dto.app.WebSubscriptionInfo;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.ui.sheet.VkOrderResultSheetDialog;
import com.vk.superapp.core.errors.VkAppsErrors;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.mov0;
import xsna.nak;

/* compiled from: VkSubscriptionViewDelegate.kt */
/* loaded from: classes6.dex */
public final class mov0 implements mxv0 {
    public final io.reactivex.rxjava3.disposables.b b;
    public final mfu0 c;
    public final xwv0 d;
    public final dck0 e;
    public final clt0 f;
    public final HashMap g = new HashMap();
    public int h = -1;
    public boolean i;
    public WebSubscriptionInfo j;
    public JsApiMethodType k;

    /* compiled from: VkSubscriptionViewDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<GameSubscription, io.reactivex.rxjava3.core.k<s3q0>> {
        @Override // xsna.izs
        public final io.reactivex.rxjava3.core.k<s3q0> invoke(GameSubscription gameSubscription) {
            mov0 mov0Var = (mov0) this.receiver;
            mov0Var.getClass();
            io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
            i0q0.f(new kfg(mov0Var, gameSubscription, N0, 7));
            return new io.reactivex.rxjava3.internal.operators.observable.e0(N0);
        }
    }

    /* compiled from: VkSubscriptionViewDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<nak, azm0> {
        public static final b b = new b(1, azm0.class, "<init>", "<init>(Lcom/vk/superapp/api/internal/requests/app/CreateSubscriptionResult;)V", 0);

        @Override // xsna.izs
        public final azm0 invoke(nak nakVar) {
            return new azm0(nakVar);
        }
    }

    /* compiled from: VkSubscriptionViewDelegate.kt */
    public static final /* synthetic */ class c extends PropertyReference1Impl {
        public static final c b = new c(boa0.class, "goodsOrderStatus", "getGoodsOrderStatus()Lcom/vk/api/generated/goodsOrders/dto/GoodsOrdersOrderItemDto;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((boa0) obj).a;
        }
    }

    /* compiled from: VkSubscriptionViewDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<fhx0, coa0> {
        public static final d b = new d(1, coa0.class, "<init>", "<init>(Lcom/vk/superapp/api/dto/app/WebOrderInfo;)V", 0);

        @Override // xsna.izs
        public final coa0 invoke(fhx0 fhx0Var) {
            return new coa0(fhx0Var);
        }
    }

    /* compiled from: VkSubscriptionViewDelegate.kt */
    public static final /* synthetic */ class e extends PropertyReference1Impl {
        public static final e b = new e(coa0.class, "webOrderInfo", "getWebOrderInfo()Lcom/vk/superapp/api/dto/app/WebOrderInfo;", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
        public final Object get(Object obj) {
            return ((coa0) obj).a;
        }
    }

    /* compiled from: VkSubscriptionViewDelegate.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<nak, azm0> {
        public static final f b = new f(1, azm0.class, "<init>", "<init>(Lcom/vk/superapp/api/internal/requests/app/CreateSubscriptionResult;)V", 0);

        @Override // xsna.izs
        public final azm0 invoke(nak nakVar) {
            return new azm0(nakVar);
        }
    }

    public mov0(io.reactivex.rxjava3.disposables.b bVar, mfu0 mfu0Var, xwv0 xwv0Var, dck0 dck0Var, clt0 clt0Var) {
        this.b = bVar;
        this.c = mfu0Var;
        this.d = xwv0Var;
        this.e = dck0Var;
        this.f = clt0Var;
    }

    @Override // xsna.mxv0
    public final void Ek(long j, vu80 vu80Var) {
        hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.single.v(new xnv0()).q(io.reactivex.rxjava3.android.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new q440(new ynv0(this, j, vu80Var), 28)));
    }

    @Override // xsna.mxv0
    public final void P3() {
        final int i = this.h;
        if (i < 0) {
            return;
        }
        this.h = -1;
        this.g.put(Integer.valueOf(i), Boolean.FALSE);
        hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.unv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                bqu0 x = superappUiRouterBridge.x(true);
                x.a(new uva(mov0.this, i, 3));
                return x;
            }
        }).q(io.reactivex.rxjava3.android.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new o060(new knt(this, i, 2), 23)));
    }

    @Override // xsna.mxv0
    public final void Ti(Bundle bundle) {
        if (this.i) {
            WebSubscriptionInfo webSubscriptionInfo = this.j;
            if (webSubscriptionInfo != null) {
                bundle.putParcelable("show_subscription_dialog", webSubscriptionInfo);
            }
            JsApiMethodType jsApiMethodType = this.k;
            if (jsApiMethodType != null) {
                bundle.putSerializable("show_subscription_method_type", jsApiMethodType);
            }
        }
    }

    @Override // xsna.mxv0
    public final void Vf(WebApiApplication webApiApplication, vu80 vu80Var) {
        hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.single.v(new xrs(1)).q(io.reactivex.rxjava3.android.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new dh40(new lf3(this, webApiApplication, vu80Var, 7), 25)));
    }

    public final void a(AutoBuyStatus autoBuyStatus, long j, fhx0 fhx0Var, String str, boolean z) {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        bqu0 x = superappUiRouterBridge.x(false);
        vdx0 vdx0Var = e370.e;
        zen0 d2 = (vdx0Var != null ? vdx0Var : null).d();
        int i = fhx0Var.a;
        String str2 = fhx0Var.k;
        if (str2 == null) {
            str2 = "";
        }
        io.reactivex.rxjava3.core.q<ConfirmResult> o = d2.o(j, i, str2, autoBuyStatus, str);
        j5v0 j5v0Var = new j5v0(new ixu0(x, 1), 1);
        o.getClass();
        hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.observable.c0(o, j5v0Var, io.reactivex.rxjava3.internal.functions.a.c).subscribe(new qg60(new vnv0(this, fhx0Var, j, x, z), 22), new le50(new rzl0(this, 26), 28)));
        x.dismiss();
    }

    public final io.reactivex.rxjava3.core.q<uxm0> b(JsApiMethodType jsApiMethodType, WebApiApplication webApiApplication, WebSubscriptionInfo webSubscriptionInfo, boolean z) {
        boolean z2;
        FragmentManager supportFragmentManager;
        if (z) {
            vdx0 vdx0Var = e370.e;
            zen0 d2 = (vdx0Var != null ? vdx0Var : null).d();
            long j = webApiApplication.b;
            int i = webSubscriptionInfo.b;
            String str = webSubscriptionInfo.l;
            return d2.a(i, str == null ? "" : str, webApiApplication.w, j);
        }
        this.i = false;
        this.j = null;
        io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
        Object obj = ((ggu0) this.f.c).b;
        while (true) {
            z2 = obj instanceof FragmentActivity;
            if (z2 || !(obj instanceof ContextWrapper)) {
                break;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z2 ? (Activity) obj : null);
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            rns0 rns0Var = new rns0(N0, 8);
            ew3 ew3Var = new ew3(27, this, N0);
            p210 p210Var = new p210(this, webSubscriptionInfo, jsApiMethodType, 4);
            ffv0 ffv0Var = new ffv0();
            ffv0Var.f1 = webApiApplication;
            ffv0Var.g1 = webSubscriptionInfo;
            ffv0Var.m1 = rns0Var;
            ffv0Var.n1 = ew3Var;
            ffv0Var.o1 = p210Var;
            ffv0Var.Td(supportFragmentManager, "");
        }
        io.reactivex.rxjava3.internal.operators.maybe.u uVar = new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.observable.e0(N0), new qw80(new z4t0(webSubscriptionInfo, 5), 17));
        int i2 = 22;
        return new io.reactivex.rxjava3.internal.operators.mixed.f(uVar, new gs00(new b8j0(webApiApplication, i2), i2));
    }

    public final void c(WebApiApplication webApiApplication, pw80 pw80Var, boolean z) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        io.reactivex.rxjava3.internal.operators.maybe.u uVar = new io.reactivex.rxjava3.internal.operators.maybe.u(zq70.D(pw80Var, 200L).k(io.reactivex.rxjava3.android.schedulers.a.b()), new hna0(kov0.b, 1));
        z2v0 z2v0Var = new z2v0(new dvh0(8, ref$ObjectRef, this), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        d(JsApiMethodType.SHOW_SUBSCRIPTION_BOX, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.mixed.f(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.k(new io.reactivex.rxjava3.internal.operators.maybe.b0(uVar, lVar, z2v0Var, lVar, kVar, kVar), new qca0(new eni0(16), 16)), new a.i(nak.a.class)), new yzt(new dov0(this, webApiApplication, z), 23)), new j3z(new xvl0(ref$ObjectRef, 19), 26), kVar), webApiApplication, new ghn0(ref$ObjectRef, 20));
    }

    public final void d(JsApiMethodType jsApiMethodType, io.reactivex.rxjava3.core.q<uxm0> qVar, WebApiApplication webApiApplication, gzs<s3q0> gzsVar) {
        int i = 4;
        hg1.e(this.b, qVar.subscribe(new hrt0(new u2y(this, jsApiMethodType, webApiApplication, i), i), new d8u0(new ogd(this, jsApiMethodType, gzsVar, 11), 3)));
    }

    public final void e(Throwable th) {
        if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 17) {
            g(VkAppsErrors.Client.USER_DENIED);
            return;
        }
        this.c.j(JsApiMethodType.SHOW_ORDER_BOX, VkAppsErrors.b(th));
        WebApiApplication v = this.d.v();
        new VkOrderResultSheetDialog(((ggu0) this.f.c).b).a(v != null ? v.e() : false, VkOrderResultSheetDialog.Mode.NEGATIVE, null);
    }

    public final void f(VkAppsErrors.Client client) {
        this.c.m(JsApiMethodType.SHOW_GOODS_ORDER_BOX, client, null, null);
    }

    public final void g(VkAppsErrors.Client client) {
        this.c.m(JsApiMethodType.SHOW_ORDER_BOX, client, null, null);
    }

    public final void h(VkAppsErrors.Client client) {
        this.c.m(JsApiMethodType.SHOW_SUBSCRIPTION_BOX, client, null, null);
    }

    public final void i(bqu0 bqu0Var, int i) {
        hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.maybe.u(zq70.D(new rw80(new rjb(i, 2)), 200L), new uf20(c.b, 23)).subscribe(new v5u0(new wnv0(this, bqu0Var, i), 3), new wx00(new hto0(7, bqu0Var, this), 29)));
    }

    @Override // xsna.mxv0
    public final void i7(WebApiApplication webApiApplication, vu80 vu80Var) {
        z7(webApiApplication.b, vu80Var);
    }

    public final void j(long j, String str) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        hg1.e(this.b, bug0.e(vdx0Var.i().c(j, str), ((ggu0) this.f.c).b, null, 6).subscribe(new jw80(new fom(this, j, 1), 25), new f0o0(new jan0(this, 12), 6)));
    }

    public final void k(bqu0 bqu0Var, final long j, final String str, final vu80 vu80Var) {
        hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.maybe.u(zq70.D(new pw80(new izs() { // from class: xsna.eov0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                return vdx0Var.d().z(j, vu80Var.b, num, str).U(new i6a(mov0.d.b, 3));
            }
        }), 200L), new dqf(e.b, 2)).subscribe(new wau0(new jt8(bqu0Var, this, vu80Var, 2), 3), new vom0(new f1p0(4, bqu0Var, this), 7)));
    }

    @Override // xsna.mxv0
    public final void l9(WebApiApplication webApiApplication, int i) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.core.q n = vdx0Var.d().n(i, webApiApplication.b);
        cfz cfzVar = new cfz(new a(1, this, mov0.class, "showConfirmCancelDialog", "showConfirmCancelDialog(Lcom/vk/superapp/api/dto/app/GameSubscription;)Lio/reactivex/rxjava3/core/Maybe;", 0), 22);
        n.getClass();
        hg1.e(this.b, new io.reactivex.rxjava3.internal.operators.observable.m0(n, cfzVar).L(new d810(new v24(webApiApplication, i, 2), 15), false).subscribe(new eeh0(new vx40(this, i), 17), new whm0(new n9m0(this, 22), 11)));
    }

    @Override // xsna.mxv0
    public final void nn(WebApiApplication webApiApplication, int i, boolean z) {
        c(webApiApplication, new pw80(new um(webApiApplication, i, 2)), z);
    }

    @Override // xsna.mxv0
    public final void te(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        WebSubscriptionInfo webSubscriptionInfo = (WebSubscriptionInfo) bundle.getParcelable("show_subscription_dialog");
        Serializable serializable = bundle.getSerializable("show_subscription_method_type");
        if (webSubscriptionInfo == null || !(serializable instanceof JsApiMethodType)) {
            return;
        }
        WebApiApplication t = this.d.t();
        JsApiMethodType jsApiMethodType = (JsApiMethodType) serializable;
        d(jsApiMethodType, b(jsApiMethodType, t, webSubscriptionInfo, false), t, new qdh0(8));
    }

    @Override // xsna.mxv0
    public final void xk(WebApiApplication webApiApplication, String str, boolean z) {
        c(webApiApplication, new pw80(new dnh0(16, webApiApplication, str)), z);
    }

    @Override // xsna.mxv0
    public final void z7(long j, vu80 vu80Var) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        hg1.e(this.b, bug0.e(vdx0Var.i().b(j, vu80Var.b), ((ggu0) this.f.c).b, null, 6).subscribe(new aov0(new znv0(this, j, vu80Var), 0), new i3q0(new rtg0(this, 24), 5)));
    }
}
