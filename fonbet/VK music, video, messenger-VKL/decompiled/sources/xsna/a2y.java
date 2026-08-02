package xsna;

import android.content.Context;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.superapp.api.dto.auth.AuthTarget;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.auth.js.bridge.api.events.AuthByExchangeToken$Error;
import com.vk.superapp.auth.js.bridge.api.events.AuthByExchangeToken$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.VkUiView;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.l2y;
import xsna.pgn0;

/* compiled from: JsAuthByExchangeDelegate.kt */
/* loaded from: classes6.dex */
public final class a2y {
    public final VkAuthCredentials a;
    public final com.vk.superapp.base.js.bridge.b b;
    public final l2y.a c;
    public final String d;
    public final h57 e;
    public final Context f;
    public final Object g;
    public final Object h;

    /* compiled from: JsAuthByExchangeDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<AuthResult, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(AuthResult authResult) {
            a2y.a((a2y) this.receiver, authResult);
            return s3q0.a;
        }
    }

    /* compiled from: JsAuthByExchangeDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<io.reactivex.rxjava3.core.q<AuthResult>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(io.reactivex.rxjava3.core.q<AuthResult> qVar) {
            ((a2y) this.receiver).d(qVar);
            return s3q0.a;
        }
    }

    /* compiled from: JsAuthByExchangeDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<AuthResult, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(AuthResult authResult) {
            a2y.a((a2y) this.receiver, authResult);
            return s3q0.a;
        }
    }

    /* compiled from: JsAuthByExchangeDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            a2y a2yVar = (a2y) this.receiver;
            a2yVar.getClass();
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            vdx0Var.C(null);
            com.vk.superapp.base.js.bridge.b.o(a2yVar.b, new JsMethod("VKWebAppAuthByExchangeToken"), new AuthByExchangeToken$Error(null, new AuthByExchangeToken$Error.Data(AuthByExchangeToken$Error.Data.Type.CLIENT_ERROR, null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), a2yVar.d, 1, null), null, 10, null), 1, null), null, null, 12);
            return s3q0.a;
        }
    }

    public a2y(Context context, VkAuthCredentials vkAuthCredentials, com.vk.superapp.base.js.bridge.b bVar, l2y.a aVar, String str, h57 h57Var) {
        this.a = vkAuthCredentials;
        this.b = bVar;
        this.c = aVar;
        this.d = str;
        this.e = h57Var;
        this.f = context.getApplicationContext();
        myh myhVar = new myh(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, myhVar);
        this.h = msy.a(lazyThreadSafetyMode, new flu(this, 8));
    }

    public static final void a(a2y a2yVar, AuthResult authResult) {
        a2yVar.getClass();
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        vdx0Var.C(null);
        com.vk.superapp.base.js.bridge.b.p(a2yVar.b, new JsMethod("VKWebAppAuthByExchangeToken"), new AuthByExchangeToken$Response(null, a2yVar.d, 1, null), null, null, false, null, 60);
        a2yVar.e.invoke(authResult);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkAuthMetaInfo b() {
        com.vk.auth.main.a aVar;
        VkAuthMetaInfo vkAuthMetaInfo;
        SignUpDataHolder signUpDataHolder;
        try {
            q55 q55Var = q55.a;
            aVar = q55.c();
        } catch (Throwable unused) {
            aVar = null;
        }
        if (aVar == null || (signUpDataHolder = aVar.a) == null || (vkAuthMetaInfo = signUpDataHolder.I) == null) {
            vkAuthMetaInfo = VkAuthMetaInfo.h;
        }
        return VkAuthMetaInfo.zb(vkAuthMetaInfo, null, AuthTarget.a(vkAuthMetaInfo.f, null, false, false, ((Boolean) this.g.getValue()).booleanValue(), 23), null, 47);
    }

    public final void c(Throwable th) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        vdx0Var.C(null);
        boolean d2 = fco0.d(th);
        com.vk.superapp.base.js.bridge.b bVar = this.b;
        if (!d2) {
            com.vk.superapp.base.js.bridge.b.o(bVar, new JsMethod("VKWebAppAuthByExchangeToken"), new AuthByExchangeToken$Error(null, new AuthByExchangeToken$Error.Data(AuthByExchangeToken$Error.Data.Type.API_ERROR, null, null, fco0.g(th), 6, null), 1, null), null, null, 12);
            return;
        }
        JsMethod jsMethod = new JsMethod("VKWebAppAuthByExchangeToken");
        AuthByExchangeToken$Error.Data.Type type = AuthByExchangeToken$Error.Data.Type.CLIENT_ERROR;
        String str = this.d;
        if (str == null) {
            str = "";
        }
        com.vk.superapp.base.js.bridge.b.o(bVar, jsMethod, new AuthByExchangeToken$Error(null, new AuthByExchangeToken$Error.Data(type, null, fco0.h(str, th), null, 10, null), 1, null), null, null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(io.reactivex.rxjava3.core.q<AuthResult> qVar) {
        VkUiView view;
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i = pgn0.a.a;
        int i2 = 3;
        amt amtVar = new amt(new cso(wdx0Var.c().a, 1), i2);
        qVar.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, amtVar, io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new z1y()).subscribe(new lav(new a(1, this, a2y.class, "onSuccess", "onSuccess(Lcom/vk/auth/api/models/AuthResult;)V", 0), i2), new pmu(new pwk(this, 24), i2));
        if (!((Boolean) this.g.getValue()).booleanValue() && !((Boolean) this.h.getValue()).booleanValue()) {
            bug0.c(subscribe);
            return;
        }
        xwv0 xwv0Var = (xwv0) this.c.invoke();
        Object B0 = (xwv0Var == null || (view = xwv0Var.getView()) == null) ? null : view.B0();
        f5z f5zVar = B0 instanceof f5z ? (f5z) B0 : null;
        if (f5zVar != null) {
            bpn0 bpn0Var = qro0.a;
            qro0.a(new fg1(14, subscribe, f5zVar));
        }
    }
}
