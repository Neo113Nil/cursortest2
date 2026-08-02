package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.ui.p;
import com.vk.movika.sdk.base.ui.z;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Alert$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Alert$Response;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Parameters;
import com.vk.superapp.common.js.bridge.api.events.CustomMessage$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ForceHideHints$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ForceHideHints$Response;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.IsPasskeyAvailable$Error;
import com.vk.superapp.common.js.bridge.api.events.IsPasskeyAvailable$Parameters;
import com.vk.superapp.common.js.bridge.api.events.IsPasskeyAvailable$Response;
import com.vk.superapp.common.js.bridge.api.events.OpenApp$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenApp$Response;
import com.vk.superapp.common.js.bridge.api.events.OpenCodeReader$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenCodeReader$Response;
import com.vk.superapp.common.js.bridge.api.events.OpenReportForm$Parameters;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ScreenshotTaken$Response;
import com.vk.superapp.common.js.bridge.api.events.Scroll$Error;
import com.vk.superapp.common.js.bridge.api.events.Scroll$Parameters;
import com.vk.superapp.common.js.bridge.api.events.SetLocation$Error;
import com.vk.superapp.common.js.bridge.api.events.SetLocation$Parameters;
import com.vk.superapp.common.js.bridge.api.events.SetLocation$Response;
import com.vk.superapp.common.js.bridge.api.events.Share$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ShowSlidesSheet$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ShowSlidesSheet$Response;
import com.vk.superapp.common.js.bridge.api.events.StorageGetKeys$Parameters;
import com.vk.superapp.common.js.bridge.impl.data.ShareType;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a0a;
import xsna.arm0;
import xsna.b9y;
import xsna.bpn0;
import xsna.bzb0;
import xsna.c1y;
import xsna.c5g;
import xsna.d3y;
import xsna.drm0;
import xsna.e370;
import xsna.e3m;
import xsna.e43;
import xsna.e4y;
import xsna.e7h;
import xsna.epx;
import xsna.f540;
import xsna.ga;
import xsna.gzs;
import xsna.hor;
import xsna.i4y;
import xsna.ifx0;
import xsna.izs;
import xsna.j3;
import xsna.jb;
import xsna.kp5;
import xsna.l5g0;
import xsna.mp0;
import xsna.ol90;
import xsna.onk;
import xsna.p2y;
import xsna.p5y;
import xsna.pla;
import xsna.q7j0;
import xsna.qro0;
import xsna.r3y;
import xsna.s3q0;
import xsna.svp;
import xsna.u6;
import xsna.ura;
import xsna.vdx0;
import xsna.ww;
import xsna.x1n0;
import xsna.x9y;
import xsna.xgx0;
import xsna.xk;
import xsna.xwv0;
import xsna.z46;
import xsna.z6y;

/* compiled from: JsCommonDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class l0 extends z46 implements d3y {
    public xwv0 d;
    public final com.vk.superapp.base.js.bridge.b e;
    public final p5y f;
    public final z6y g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;

    /* compiled from: JsCommonDelegateImpl.kt */
    /* loaded from: classes8.dex */
    public static final class a implements SuperappUiRouterBridge.d {
        public final /* synthetic */ Alert$Parameters b;
        public final /* synthetic */ p2y<Alert$Parameters> c;

        public a(Alert$Parameters alert$Parameters, p2y<Alert$Parameters> p2yVar) {
            this.b = alert$Parameters;
            this.c = p2yVar;
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
        public final void a(VkAlertData.a aVar) {
            Object obj = aVar.b;
            if (obj instanceof b9y) {
                com.vk.superapp.base.js.bridge.b.p(l0.this.L0().a, new JsMethod("VKWebAppAlert"), new Alert$Response(null, (b9y) obj, this.b.e(), 1, null), null, null, false, null, 60);
            }
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
        public final void onDismiss() {
            l0.this.w0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), this.c.b(), 1, null));
        }
    }

    /* compiled from: JsCommonDelegateImpl.kt */
    /* loaded from: classes8.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                iArr[ShareType.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareType.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareType.SMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareType.INSTAGRAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public l0(xwv0 xwv0Var, com.vk.superapp.base.js.bridge.b bVar, jb jbVar, p5y p5yVar, z6y z6yVar) {
        super(xwv0Var, 4);
        this.d = xwv0Var;
        this.e = bVar;
        this.f = p5yVar;
        this.g = z6yVar;
        this.h = new bpn0(new e(this, 0));
        this.i = new bpn0(new f(this, 0));
        this.j = new bpn0(new g(this, 0));
        this.k = new bpn0(new h(this, 0));
        this.l = new bpn0(new i(this, 0));
        this.m = new bpn0(new j(this, 0));
        this.n = new bpn0(new k(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.b3y
    public final void C0(p2y<Scroll$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppScroll"), p2yVar.b());
        svp w0 = w0();
        Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), p2yVar.b(), 1, null);
        com.vk.superapp.base.js.bridge.b.o(w0.a, new JsMethod("VKWebAppScroll"), new Scroll$Error(null, new Scroll$Error.Data(Scroll$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    @Override // xsna.b3y
    public final void D(p2y<OpenApp$Parameters> p2yVar) {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        this.e.k(new JsMethod("VKWebAppOpenApp"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            w0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        OpenApp$Parameters a2 = p2yVar.a();
        StringBuilder sb = new StringBuilder(k0.a(a2.e(), MBridgeConstans.DYNAMIC_VIEW_WX_APP));
        Long g = a2.g();
        if (g != null) {
            sb.append("_-" + g.longValue());
        }
        String sb2 = sb.toString();
        String h = a2.h();
        Boolean f = a2.f();
        String str = "https://" + a0a.d + '/' + sb2 + '#' + h;
        vdx0 vdx0Var = e370.e;
        q X = (vdx0Var != null ? vdx0Var : null).d().X(str);
        m mVar = new m(0, this, f);
        int i = 0;
        c subscribe = X.subscribe(new n(mVar, i), new p(new o(i, this, a2), i));
        xwv0 xwv0Var = this.d;
        if (xwv0Var == null || (view = xwv0Var.getView()) == null || (D6 = view.D6()) == null) {
            return;
        }
        D6.b(subscribe);
    }

    @Override // xsna.d3y
    public final void D0(int i, String str) {
        String b2 = j0.b("VKWebAppOpenCodeReader", this.e);
        if (i != -1 || str == null) {
            w0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), b2, 1, null));
        } else if (drm0.N(str)) {
            w0().l(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b2, 1, null));
        } else {
            com.vk.superapp.base.js.bridge.b.p(L0().a, new JsMethod("VKWebAppOpenCodeReader"), new OpenCodeReader$Response(null, new OpenCodeReader$Response.Data(str, b2), b2, 1, null), null, null, false, null, 60);
        }
    }

    @Override // xsna.b3y
    public final void E(p2y<GyroscopeStop$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppGyroscopeStop"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        } else {
            String c = p2yVar.a().c();
            i4y i4yVar = (i4y) this.k.getValue();
            i4yVar.getClass();
            qro0.c(new com.vk.movika.sdk.base.logic.interactor.c(13, i4yVar, c));
        }
    }

    @Override // xsna.d3y
    public final void G() {
        w0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), j0.b("VKWebAppOpenApp", this.e), 1, null));
    }

    @Override // xsna.d3y
    public final void K() {
        com.vk.superapp.base.js.bridge.b.p(L0().a, new JsMethod("VKWebAppOpenApp"), new OpenApp$Response(null, new OpenApp$Response.Data.ResultValue(new OpenApp$Response.Result(true)), j0.b("VKWebAppOpenApp", this.e), 1, null), null, null, false, null, 60);
    }

    @Override // xsna.z46
    public final xwv0 L() {
        return this.d;
    }

    public final x1n0 L0() {
        return (x1n0) this.i.getValue();
    }

    @Override // xsna.b3y
    public final void M0(p2y<DeviceMotionStart$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppDeviceMotionStart"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        } else {
            DeviceMotionStart$Parameters a2 = p2yVar.a();
            e4y e4yVar = (e4y) this.l.getValue();
            e4yVar.getClass();
            qro0.c(new ww(12, a2, e4yVar));
        }
    }

    @Override // xsna.b3y
    public final void P0(p2y<AccelerometerStop$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppAccelerometerStop"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        } else {
            String c = p2yVar.a().c();
            c1y c1yVar = (c1y) this.j.getValue();
            c1yVar.getClass();
            qro0.c(new j3(14, c1yVar, c));
        }
    }

    @Override // xsna.b3y
    public final void R0(p2y<ForceHideHints$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppForceHideHints"), p2yVar.b());
        List<String> c = p2yVar.a().c();
        if (e370.w != null) {
            Iterator<T> it = c.iterator();
            while (it.hasNext()) {
                pla.e().b().b((String) it.next());
            }
        }
        com.vk.superapp.base.js.bridge.b.p(L0().a, new JsMethod("VKWebAppForceHideHints"), new ForceHideHints$Response(null, p2yVar.b(), 1, null), null, null, false, null, 60);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r8.isEmpty() != false) goto L26;
     */
    @Override // xsna.b3y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(p2y<GetUserInfo$Parameters> p2yVar) {
        ArrayList arrayList;
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        this.e.k(new JsMethod("VKWebAppGetUserInfo"), p2yVar.b());
        xwv0 xwv0Var = this.d;
        if (xwv0Var == null) {
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            w0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        xwv0Var.getAppId();
        GetUserInfo$Parameters a2 = p2yVar.a();
        try {
            Long e = a2.e();
            List singletonList = e != null ? Collections.singletonList(Long.valueOf(e.longValue())) : EmptyList.b;
            String f = a2.f();
            if (f != null) {
                List c0 = drm0.c0(f, new String[]{StringUtils.COMMA}, 0, 6);
                arrayList = new ArrayList();
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    Long n = arm0.n(drm0.p0((String) it.next()).toString());
                    if (n != null) {
                        arrayList.add(n);
                    }
                }
            }
            arrayList = null;
            if (arrayList != null) {
                singletonList = arrayList;
            }
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            c subscribe = vdx0Var.v().b(singletonList).subscribe(new i0(new h0(0, a2, this), 0), new d(new c(0, this, a2), 0));
            xwv0 xwv0Var2 = this.d;
            if (xwv0Var2 == null || (view = xwv0Var2.getView()) == null || (D6 = view.D6()) == null) {
                return;
            }
            D6.b(subscribe);
        } catch (Exception e2) {
            w0().h(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            xgx0.a.getClass();
            xgx0.d(e2);
        }
    }

    @Override // xsna.b3y
    public final void T(p2y<CustomMessage$Parameters> p2yVar) {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        this.e.k(new JsMethod("VKWebAppCustomMessage"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        CustomMessage$Parameters a2 = p2yVar.a();
        String c = a2.c();
        b9y d = a2.d();
        JSONObject jSONObject = d != null ? new JSONObject(d.toString()) : null;
        String e = a2.e();
        xwv0 xwv0Var = this.d;
        Boolean valueOf = xwv0Var != null ? Boolean.valueOf(xwv0Var.o()) : null;
        Boolean bool = Boolean.FALSE;
        if (epx.f(valueOf, bool)) {
            xwv0 xwv0Var2 = this.d;
            if (epx.f(xwv0Var2 != null ? Boolean.valueOf(xwv0Var2.W()) : null, bool)) {
                w0().e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), p2yVar.b(), 1, null));
                return;
            }
        }
        bpn0 bpn0Var = this.m;
        onk onkVar = (onk) bpn0Var.getValue();
        z6y z6yVar = onkVar.a;
        izs<JSONObject, x<JSONObject>> izsVar = r3y.b.get(c);
        x<JSONObject> invoke = izsVar != null ? izsVar.invoke(jSONObject) : null;
        if (invoke == null) {
            onk onkVar2 = (onk) bpn0Var.getValue();
            onkVar2.getClass();
            qro0.c(new ura(onkVar2, c, jSONObject, e));
            return;
        }
        c subscribe = invoke.subscribe(new mp0(new u6(14, onkVar, e), 15), new ga(new kp5(8, onkVar, e), 24));
        xwv0 xwv0Var3 = (xwv0) onkVar.b.invoke();
        if (xwv0Var3 == null || (view = xwv0Var3.getView()) == null || (D6 = view.D6()) == null) {
            return;
        }
        D6.b(subscribe);
    }

    @Override // xsna.b3y
    public final void V0(p2y<StorageGetKeys$Parameters> p2yVar) {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        this.e.k(new JsMethod("VKWebAppStorageGetKeys"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().q(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null) {
            long appId = xwv0Var.getAppId();
            StorageGetKeys$Parameters a2 = p2yVar.a();
            String b2 = p2yVar.b();
            try {
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                c subscribe = vdx0Var.s().c(a2.f(), a2.e(), appId).subscribe(new x(new v(0, this, b2), 0), new z(new y(0, this, b2), 0));
                xwv0 xwv0Var2 = this.d;
                if (xwv0Var2 == null || (view = xwv0Var2.getView()) == null || (D6 = view.D6()) == null) {
                    return;
                }
                D6.b(subscribe);
            } catch (JSONException unused) {
                w0().q(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b2, 1, null));
            }
        }
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAccelerometerChanged(String str) {
        d3y.a.VKWebAppAccelerometerChanged(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAccelerometerStart(String str) {
        d3y.a.VKWebAppAccelerometerStart(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAccelerometerStop(String str) {
        d3y.a.VKWebAppAccelerometerStop(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAddToHomeScreen(String str) {
        d3y.a.VKWebAppAddToHomeScreen(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAddToHomeScreenInfo(String str) {
        d3y.a.VKWebAppAddToHomeScreenInfo(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAlert(String str) {
        d3y.a.VKWebAppAlert(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppCheckAllowedScopes(String str) {
        d3y.a.VKWebAppCheckAllowedScopes(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppConversionHit(String str) {
        d3y.a.VKWebAppConversionHit(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppCopyText(String str) {
        d3y.a.VKWebAppCopyText(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppCreateHash(String str) {
        d3y.a.VKWebAppCreateHash(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppCustomMessage(String str) {
        d3y.a.VKWebAppCustomMessage(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDeviceMotionChanged(String str) {
        d3y.a.VKWebAppDeviceMotionChanged(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDeviceMotionStart(String str) {
        d3y.a.VKWebAppDeviceMotionStart(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDeviceMotionStop(String str) {
        d3y.a.VKWebAppDeviceMotionStop(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDisableSwipeBack(String str) {
        d3y.a.VKWebAppDisableSwipeBack(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDownloadFile(String str) {
        d3y.a.VKWebAppDownloadFile(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppEnableSwipeBack(String str) {
        d3y.a.VKWebAppEnableSwipeBack(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppFlashGetInfo(String str) {
        d3y.a.VKWebAppFlashGetInfo(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppFlashSetLevel(String str) {
        d3y.a.VKWebAppFlashSetLevel(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppForceHideHints(String str) {
        d3y.a.VKWebAppForceHideHints(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetCommunityToken(String str) {
        d3y.a.VKWebAppGetCommunityToken(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetEmail(String str) {
        d3y.a.VKWebAppGetEmail(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetPersonalCard(String str) {
        d3y.a.VKWebAppGetPersonalCard(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetPhoneNumber(String str) {
        d3y.a.VKWebAppGetPhoneNumber(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetPurchaseBundles(String str) {
        d3y.a.VKWebAppGetPurchaseBundles(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetUserInfo(String str) {
        d3y.a.VKWebAppGetUserInfo(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGyroscopeChanged(String str) {
        d3y.a.VKWebAppGyroscopeChanged(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGyroscopeStart(String str) {
        d3y.a.VKWebAppGyroscopeStart(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGyroscopeStop(String str) {
        d3y.a.VKWebAppGyroscopeStop(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppIsPasskeyAvailable(String str) {
        d3y.a.VKWebAppIsPasskeyAvailable(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppKeepScreenOn(String str) {
        d3y.a.VKWebAppKeepScreenOn(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppLoadAds(String str) {
        d3y.a.VKWebAppLoadAds(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenApp(String str) {
        d3y.a.VKWebAppOpenApp(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenCodeReader(String str) {
        d3y.a.VKWebAppOpenCodeReader(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenContacts(String str) {
        d3y.a.VKWebAppOpenContacts(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenDebugSettings(String str) {
        d3y.a.VKWebAppOpenDebugSettings(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenExternalLink(String str) {
        d3y.a.VKWebAppOpenExternalLink(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenPayForm(String str) {
        d3y.a.VKWebAppOpenPayForm(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenReportForm(String str) {
        d3y.a.VKWebAppOpenReportForm(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppRecommend(String str) {
        d3y.a.VKWebAppRecommend(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppRestoreInAppPurchases(String str) {
        d3y.a.VKWebAppRestoreInAppPurchases(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppRetargetingPixel(String str) {
        d3y.a.VKWebAppRetargetingPixel(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppScroll(String str) {
        d3y.a.VKWebAppScroll(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppSelectSbpBank(String str) {
        d3y.a.VKWebAppSelectSbpBank(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppSendPayload(String str) {
        d3y.a.VKWebAppSendPayload(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppSetLocation(String str) {
        d3y.a.VKWebAppSetLocation(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppSetPaymentToken(String str) {
        d3y.a.VKWebAppSetPaymentToken(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShare(String str) {
        d3y.a.VKWebAppShare(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowActionMenu(String str) {
        d3y.a.VKWebAppShowActionMenu(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowImages(String str) {
        d3y.a.VKWebAppShowImages(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowLeaderBoardBox(String str) {
        d3y.a.VKWebAppShowLeaderBoardBox(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowRequestBox(String str) {
        d3y.a.VKWebAppShowRequestBox(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowSlidesSheet(String str) {
        d3y.a.VKWebAppShowSlidesSheet(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppStorageGetKeys(String str) {
        d3y.a.VKWebAppStorageGetKeys(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppUsersSearch(String str) {
        d3y.a.VKWebAppUsersSearch(this, str);
    }

    public final void X0(ShowSlidesSheet$Response.Data.Action action, Integer num) {
        String b2 = j0.b("VKWebAppOpenApp", this.e);
        com.vk.superapp.base.js.bridge.b.p(L0().a, new JsMethod("VKWebAppShowSlidesSheet"), new ShowSlidesSheet$Response(null, new ShowSlidesSheet$Response.Data(true, action, num, b2), b2, 1, null), null, null, false, null, 60);
    }

    @Override // xsna.b3y
    public final void Y(p2y<RetargetingPixel$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppRetargetingPixel"), p2yVar.b());
        if (!(p2yVar.a instanceof p2y.a)) {
            qro0.c(new u(0, this, p2yVar.a()));
        } else {
            w0().n(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // xsna.b3y
    public final void a0(p2y<Alert$Parameters> p2yVar) {
        VkAlertData.a aVar;
        VkAlertData.a aVar2;
        VkAlertData.a aVar3;
        this.e.k(new JsMethod("VKWebAppAlert"), p2yVar.b());
        int i = 0;
        ?? r5 = 0;
        if (!m()) {
            w0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), p2yVar.b(), 1, null));
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            w0().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        Alert$Parameters a2 = p2yVar.a();
        a aVar4 = new a(a2, p2yVar);
        if (!epx.f(a2.f(), "alert")) {
            String g = a2.g();
            String str = g != null ? g : "";
            List<Alert$Parameters.Actions> c = a2.c();
            if (c != null) {
                List<Alert$Parameters.Actions> list = c;
                r5 = new ArrayList(c5g.u(list, 10));
                for (Alert$Parameters.Actions actions : list) {
                    String b2 = actions.b();
                    b9y a3 = actions.a();
                    if (a3 == null) {
                        a3 = new x9y();
                    }
                    r5.add(new VkAlertData.a(b2, a3));
                }
            }
            if (r5 == 0) {
                r5 = EmptyList.b;
            }
            qro0.c(new d0(this, new VkAlertData.c(str, r5), aVar4, 0));
            return;
        }
        List<Alert$Parameters.Actions> c2 = a2.c();
        if (c2 != null) {
            VkAlertData.a aVar5 = null;
            VkAlertData.a aVar6 = null;
            VkAlertData.a aVar7 = null;
            for (Object obj : c2) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                Alert$Parameters.Actions actions2 = (Alert$Parameters.Actions) obj;
                String b3 = actions2.b();
                b9y a4 = actions2.a();
                if (a4 == null) {
                    a4 = new x9y();
                }
                VkAlertData.a aVar8 = new VkAlertData.a(b3, a4);
                if (i == 0) {
                    aVar5 = aVar8;
                } else if (i == 1) {
                    aVar6 = aVar8;
                } else if (i == 2) {
                    aVar7 = aVar8;
                }
                i = i2;
            }
            aVar = aVar5;
            aVar2 = aVar6;
            aVar3 = aVar7;
        } else {
            aVar = null;
            aVar2 = null;
            aVar3 = null;
        }
        String g2 = a2.g();
        String str2 = g2 == null ? "" : g2;
        String d = a2.d();
        qro0.c(new c0(this, new VkAlertData.b(str2, d == null ? "" : d, VkAlertData.DialogType.NOWHERE, aVar, aVar2, aVar3), aVar4, 0));
    }

    @Override // xsna.b3y
    public final void d0(p2y<Share$Parameters> p2yVar) {
        ShareType shareType;
        JsMethod jsMethod = new JsMethod("VKWebAppShare");
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        if (bVar.j(jsMethod)) {
            return;
        }
        bVar.k(new JsMethod("VKWebAppShare"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            w0().o(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        Share$Parameters a2 = p2yVar.a();
        final String f = a2.f();
        ShareType.a aVar = ShareType.Companion;
        String h = a2.h();
        aVar.getClass();
        ShareType[] values = ShareType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                shareType = null;
                break;
            }
            shareType = values[i];
            if (epx.f(shareType.h(), h)) {
                break;
            } else {
                i++;
            }
        }
        if (shareType == null) {
            shareType = ShareType.VK;
        }
        final String d = a2.d();
        final String i2 = a2.i();
        String e = a2.e();
        if (e == null) {
            e = "";
        }
        String g = a2.g();
        String str = g != null ? g : "";
        Long j = a2.j();
        q7j0 q7j0Var = (j != null || str.length() > 0) ? new q7j0(j, str) : null;
        int i3 = b.$EnumSwitchMapping$0[shareType.ordinal()];
        if (i3 == 1) {
            qro0.c(new a0(this, e, q7j0Var, 0));
            return;
        }
        if (i3 == 2) {
            qro0.c(new w(this, f, str, 0));
            return;
        }
        if (i3 == 3) {
            qro0.c(new g0(this, f, str, 0));
            return;
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if ((i2 != null && i2.length() == 0) || (i2 != null && drm0.N(i2))) {
            w0().o(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, "invalid url", null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), f, 1, null));
        } else {
            final String str2 = str;
            qro0.c(new gzs() { // from class: q
                @Override // xsna.gzs
                public final Object invoke() {
                    VkUiView view;
                    Activity B0;
                    l0 l0Var = l0.this;
                    xwv0 xwv0Var = l0Var.d;
                    String str3 = f;
                    if (xwv0Var == null || (view = xwv0Var.getView()) == null || (B0 = view.B0()) == null) {
                        l0Var.w0().o(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), str3, 1, null));
                    } else {
                        ifx0 ifx0Var = e370.c;
                        ifx0 ifx0Var2 = ifx0Var != null ? ifx0Var : null;
                        b0 b0Var = new b0(0, l0Var, str3);
                        ifx0Var2.getClass();
                        String str4 = i2;
                        String str5 = str2;
                        if (str4 != null) {
                            Activity h2 = e3m.h(B0);
                            if (h2 != null) {
                                new bzb0(h2).j(new e7h(b0Var, B0, str4, str5, ifx0Var2));
                            }
                        } else {
                            String str6 = d;
                            if (str6 != null) {
                                Activity h3 = e3m.h(B0);
                                if (h3 != null) {
                                    new bzb0(h3).j(new hor(b0Var, B0, str6, str5, ifx0Var2));
                                }
                            } else if (str5.length() > 0) {
                                B0.startActivity(Intent.createChooser(ifx0.c(null, str5), B0.getString(R.string.vk_apps_share)));
                                b0Var.invoke(Boolean.TRUE);
                            } else {
                                b0Var.invoke(Boolean.FALSE);
                            }
                        }
                    }
                    return s3q0.a;
                }
            });
        }
    }

    @Override // xsna.b3y
    public final void f1(p2y<OpenCodeReader$Parameters> p2yVar) {
        VkUiView view;
        this.e.k(new JsMethod("VKWebAppOpenCodeReader"), p2yVar.b());
        PermissionHelper permissionHelper = PermissionHelper.a;
        xwv0 xwv0Var = this.d;
        Activity B0 = (xwv0Var == null || (view = xwv0Var.getView()) == null) ? null : view.B0();
        permissionHelper.getClass();
        int i = 0;
        permissionHelper.d(B0, PermissionHelper.l, R.string.vk_permissions_camera, R.string.vk_permissions_camera, new r(this, i), new s(i, this, p2yVar));
    }

    @Override // xsna.d3y
    public final void g0() {
        w0().k(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), j0.b("VKWebAppOpenApp", this.e), 1, null));
    }

    @Override // xsna.b3y
    public final void j0(p2y<GyroscopeStart$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppGyroscopeStart"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().i(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        } else {
            GyroscopeStart$Parameters a2 = p2yVar.a();
            i4y i4yVar = (i4y) this.k.getValue();
            i4yVar.getClass();
            qro0.c(new z(6, a2, i4yVar));
        }
    }

    @Override // xsna.b3y
    public final void k0(p2y<OpenReportForm$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppOpenReportForm"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().m(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
        OpenReportForm$Parameters a2 = p2yVar.a();
        String i = a2.i();
        Long j = a2.j();
        UserId userId = j != null ? new UserId(j.longValue()) : null;
        Long e = a2.e();
        UserId userId2 = e != null ? new UserId(e.longValue()) : null;
        String c = a2.c();
        Long d = a2.d();
        Long g = a2.g();
        l5g0 l5g0Var = new l5g0(i, userId, userId2, c, d, g != null ? new UserId(g.longValue()) : null, a2.f());
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        (superappUiRouterBridge != null ? superappUiRouterBridge : null).l0(l5g0Var, new l(this, p2yVar, a2, 0));
    }

    @Override // xsna.d3y
    public final void l1() {
        JsMethod jsMethod = new JsMethod("VKWebAppScreenshotTaken");
        x9y x9yVar = new x9y();
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        bVar.n(jsMethod, new ScreenshotTaken$Response(null, x9yVar, j0.b("VKWebAppScreenshotTaken", bVar), 1, null));
    }

    @Override // xsna.b3y
    public final void m0(p2y<ShowSlidesSheet$Parameters> p2yVar) {
        VkUiView view;
        this.e.k(new JsMethod("VKWebAppShowSlidesSheet"), p2yVar.b());
        xwv0 xwv0Var = this.d;
        if (xwv0Var != null && (view = xwv0Var.getView()) != null && view.bh()) {
            w0().p(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), p2yVar.b(), 1, null));
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            w0().p(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
            return;
        }
        List<ShowSlidesSheet$Parameters.Slides> c = p2yVar.a().c();
        ArrayList arrayList = new ArrayList(c5g.u(c, 10));
        for (ShowSlidesSheet$Parameters.Slides slides : c) {
            String c2 = slides.a().c();
            String a2 = slides.a().a();
            if (!URLUtil.isValidUrl(c2) && (a2 == null || drm0.N(a2))) {
                w0().p(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
                return;
            }
            String e = slides.e();
            String d = slides.d();
            String c3 = slides.c();
            String str = c3 == null ? "" : c3;
            String b2 = slides.b();
            arrayList.add(new OnboardingStep(e, d, str, slides.a().b().name(), b2 == null ? "" : b2, c2, a2));
        }
        if (arrayList.isEmpty() || arrayList.size() > 10) {
            w0().p(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        } else {
            qro0.c(new f0(0, this, new OnboardingModalArguments(arrayList)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.b3y
    public final void n(p2y<IsPasskeyAvailable$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppIsPasskeyAvailable"), p2yVar.b());
        if (m()) {
            boolean b2 = ol90.b();
            x1n0 L0 = L0();
            String b3 = p2yVar.b();
            com.vk.superapp.base.js.bridge.b.p(L0.a, new JsMethod("VKWebAppIsPasskeyAvailable"), new IsPasskeyAvailable$Response(null, new IsPasskeyAvailable$Response.Data(b2, b3), b3, 1, null), null, null, false, null, 60);
            return;
        }
        svp w0 = w0();
        Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), p2yVar.b(), 1, null);
        com.vk.superapp.base.js.bridge.b.o(w0.a, new JsMethod("VKWebAppIsPasskeyAvailable"), new IsPasskeyAvailable$Error(null, new IsPasskeyAvailable$Error.Data(IsPasskeyAvailable$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.b3y
    public final void p1(p2y<SetLocation$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppSetLocation"), p2yVar.b());
        if (this.d == null) {
            return;
        }
        int i = 1;
        if (!(p2yVar.a instanceof p2y.a)) {
            qro0.c(new t(this, p2yVar.a().c(), new SetLocation$Response(null, new SetLocation$Response.Data(true, p2yVar.b()), p2yVar.b(), 1, null), 0));
            return;
        }
        svp w0 = w0();
        Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null);
        com.vk.superapp.base.js.bridge.b.o(w0.a, new JsMethod("VKWebAppSetLocation"), new SetLocation$Error(null, new SetLocation$Error.Data(SetLocation$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), i, 0 == true ? 1 : 0), null, null, 12);
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.d = xwv0Var;
    }

    @Override // xsna.b3y
    public final void r0(p2y<DeviceMotionStop$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppDeviceMotionStop"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        } else {
            String c = p2yVar.a().c();
            e4y e4yVar = (e4y) this.l.getValue();
            e4yVar.getClass();
            qro0.c(new p(11, e4yVar, c));
        }
    }

    @Override // xsna.npf0
    public final void release() {
        this.d = null;
        c1y c1yVar = (c1y) this.j.getValue();
        c1yVar.getClass();
        int i = 25;
        qro0.c(new f540(c1yVar, i));
        i4y i4yVar = (i4y) this.k.getValue();
        i4yVar.getClass();
        qro0.c(new f540(i4yVar, i));
        e4y e4yVar = (e4y) this.l.getValue();
        e4yVar.getClass();
        qro0.c(new f540(e4yVar, i));
    }

    @Override // xsna.b3y
    public final void u0(p2y<AccelerometerStart$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppAccelerometerStart"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            w0().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        } else {
            AccelerometerStart$Parameters a2 = p2yVar.a();
            c1y c1yVar = (c1y) this.j.getValue();
            c1yVar.getClass();
            qro0.c(new xk(18, a2, c1yVar));
        }
    }

    @Override // xsna.b3y
    public final void v0(p2y<ConversionHit$Parameters> p2yVar) {
        this.e.k(new JsMethod("VKWebAppConversionHit"), p2yVar.b());
        if (!(p2yVar.a instanceof p2y.a)) {
            qro0.c(new e0(0, this, p2yVar.a()));
        } else {
            w0().d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null));
        }
    }

    public final svp w0() {
        return (svp) this.h.getValue();
    }
}
