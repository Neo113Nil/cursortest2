package xsna;

import android.webkit.JavascriptInterface;
import com.vk.core.apps.BuildInfo;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.subscriptions.js.bridge.api.events.CanShowAltPayMethod$Error;
import com.vk.superapp.subscriptions.js.bridge.api.events.CanShowAltPayMethod$Parameters;
import com.vk.superapp.subscriptions.js.bridge.api.events.CanShowAltPayMethod$Response;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.f6y;

/* compiled from: JsSubscriptionsDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class g6y implements f6y {
    public static final Set<Long> f = rl3.y0(new Long[]{6703670L, 6722068L, 51491207L, 51404928L});
    public final com.vk.superapp.base.js.bridge.b b;
    public final jq20 c;
    public xwv0 d;
    public final hpj e = zvj.a(whn0.a());

    /* compiled from: JsSubscriptionsDelegateImpl.kt */
    @b6l(c = "com.vk.superapp.subscriptions.js.bridge.impl.JsSubscriptionsDelegateImpl$VKWebAppCanShowAltPayMethodInternal$1", f = "JsSubscriptionsDelegateImpl.kt", l = {51}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ p2y<CanShowAltPayMethod$Parameters> $parametersResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p2y<CanShowAltPayMethod$Parameters> p2yVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$parametersResult = p2yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return g6y.this.new a(this.$parametersResult, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean bool;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    jq20 jq20Var = g6y.this.c;
                    this.label = 1;
                    obj = jq20Var.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                bool = (Boolean) obj;
            } catch (CancellationException unused) {
            } catch (Exception unused2) {
                g6y.c(g6y.this, this.$parametersResult.b());
            }
            if (bool == null) {
                g6y.c(g6y.this, this.$parametersResult.b());
                return s3q0.a;
            }
            com.vk.superapp.base.js.bridge.b.p(g6y.this.b, new JsMethod("VKWebAppCanShowAltPayMethod"), new CanShowAltPayMethod$Response(null, new CanShowAltPayMethod$Response.Data(bool.booleanValue(), this.$parametersResult.b()), this.$parametersResult.b(), 1, null), null, null, false, null, 60);
            return s3q0.a;
        }
    }

    public g6y(com.vk.superapp.base.js.bridge.b bVar, jq20 jq20Var, xwv0 xwv0Var) {
        this.b = bVar;
        this.c = jq20Var;
        this.d = xwv0Var;
    }

    public static final void c(g6y g6yVar, String str) {
        com.vk.superapp.base.js.bridge.b.o(g6yVar.b, new JsMethod("VKWebAppCanShowAltPayMethod"), new CanShowAltPayMethod$Error(null, new CanShowAltPayMethod$Error.Data(CanShowAltPayMethod$Error.Data.Type.CLIENT_ERROR, null, null, 6, null), 1, null), null, str, 4);
    }

    @Override // xsna.f6y, xsna.e6y
    @JavascriptInterface
    public void VKWebAppCanShowAltPayMethod(String str) {
        f6y.a.VKWebAppCanShowAltPayMethod(this, str);
    }

    @Override // xsna.e6y
    public final void l(p2y<CanShowAltPayMethod$Parameters> p2yVar) {
        JsMethod jsMethod = new JsMethod("VKWebAppCanShowAltPayMethod");
        String b = p2yVar.b();
        com.vk.superapp.base.js.bridge.b bVar = this.b;
        bVar.k(jsMethod, b);
        if (!BuildInfo.h()) {
            xwv0 xwv0Var = this.d;
            Long valueOf = xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (!f.contains(Long.valueOf(valueOf.longValue()))) {
                String b2 = p2yVar.b();
                com.vk.superapp.base.js.bridge.b.o(bVar, new JsMethod("VKWebAppCanShowAltPayMethod"), new CanShowAltPayMethod$Error(null, new CanShowAltPayMethod$Error.Data(CanShowAltPayMethod$Error.Data.Type.CLIENT_ERROR, b2, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b2, 1, null)), 1, null), null, null, 12);
                return;
            }
        }
        myc0.h(this.e, null, null, new a(p2yVar, null), 3);
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.d = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.d = null;
        iyx.d(this.e.b);
    }
}
