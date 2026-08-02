package xsna;

import android.util.Base64;
import com.vk.push.common.Logger;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.rk70;
import xsna.uje0;
import xsna.vje0;

/* compiled from: NotifierResponseMessageListener.kt */
/* loaded from: classes5.dex */
public final class sk70 extends uhx0 {
    public final Logger b;
    public final s4w0 c;
    public final pwi d;
    public final hpj e;

    /* compiled from: NotifierResponseMessageListener.kt */
    @b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.NotifierResponseMessageListener$onMessage$1", f = "NotifierResponseMessageListener.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $text;
        int label;
        final /* synthetic */ sk70 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, sk70 sk70Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$text = str;
            this.this$0 = sk70Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$text, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            try {
                this.this$0.c.m(sk70.a(this.this$0, new JSONObject(this.$text)));
            } catch (IllegalStateException e) {
                this.this$0.b.error("Error occurred while parsing response", e);
            } catch (JSONException e2) {
                this.this$0.b.error("Error occurred while parsing response", e2);
            }
            return s3q0.a;
        }
    }

    public sk70(Logger logger, s4w0 s4w0Var, pwi pwiVar) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.b = logger;
        this.c = s4w0Var;
        this.d = pwiVar;
        this.e = zvj.a(wglVar);
    }

    public static final rk70 a(sk70 sk70Var, JSONObject jSONObject) {
        vje0 aVar;
        Logger logger = sk70Var.b;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("method");
        if (optString.length() > 0) {
            int parseInt = Integer.parseInt(optString);
            pwi pwiVar = sk70Var.d;
            Logger.DefaultImpls.debug$default(logger, lhg.a(parseInt, "Parse request response: "), null, 2, null);
            JSONObject optJSONObject = jSONObject.optJSONObject("result");
            Integer valueOf = optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("status")) : null;
            if (((String) ((ConcurrentHashMap) pwiVar.c).get(Integer.valueOf(parseInt))) == null) {
                if (valueOf == null || valueOf.intValue() != 200) {
                    throw new IllegalStateException(lhg.a(parseInt, "Unknown requestId: "));
                }
                return rk70.a.a;
            }
            ((ConcurrentHashMap) pwiVar.c).remove(Integer.valueOf(parseInt));
            if (valueOf != null && valueOf.intValue() == 200) {
                return new rk70.f();
            }
            Regex regex = r9y.a;
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            return new rk70.b(jSONObject2.optInt("code"), jSONObject2.optString("message"));
        }
        if (optString2.length() <= 0) {
            throw new IllegalStateException(("Unknown result " + jSONObject).toString());
        }
        Logger.DefaultImpls.debug$default(logger, "Parse method response: ".concat(optString2), null, 2, null);
        if (optString2.equals("shutdown")) {
            return rk70.e.a;
        }
        if (!optString2.equals("notice")) {
            throw new IllegalStateException(("Unknown " + optString2 + " was found").toString());
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("params").getJSONArray("events").getJSONObject(0);
        int i = jSONObject3.getInt("code");
        if (i != 1) {
            throw new IllegalStateException(tgw.b(i, "This code ", " is not subscribe event").toString());
        }
        JSONObject jSONObject4 = new JSONObject(new String(Base64.decode(jSONObject3.getString("data"), 0), StandardCharsets.UTF_8));
        int i2 = rje0.b;
        Regex regex2 = r9y.a;
        try {
            aVar = new vje0.b(jSONObject4.getString("token"), jSONObject4.getString("project_id"), false, Collections.singletonList(r9y.b(jSONObject4.getJSONObject("message"))));
        } catch (JSONException e) {
            String a2 = r9y.a(jSONObject4, "token");
            if (a2 == null) {
                a2 = "";
            }
            aVar = new vje0.a(a2, String.valueOf(e.getMessage()));
        }
        uje0 a3 = rje0.a(aVar, 0L);
        if (a3 instanceof uje0.b) {
            return new rk70.d((uje0.b) a3);
        }
        if (a3 instanceof uje0.a) {
            return new rk70.c((uje0.a) a3);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.uhx0
    public final void onMessage(phx0 phx0Var, String str) {
        myc0.h(this.e, null, null, new a(str, this, null), 3);
    }
}
