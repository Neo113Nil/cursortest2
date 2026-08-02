package xsna;

import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.type.StartCallType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.api.ExternApiException;
import xsna.zmw0;

/* compiled from: ConversationStartErrorHandler.kt */
/* loaded from: classes11.dex */
public final class esj {
    public final h49 a;

    /* compiled from: ConversationStartErrorHandler.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final Throwable a;
        public final dhw0 b;
        public final CallId c;
        public final StartCallType d;
        public final izs<mlp, s3q0> e;

        public a(Throwable th, dhw0 dhw0Var, CallId callId, StartCallType startCallType, com.vk.voip.d dVar) {
            this.a = th;
            this.b = dhw0Var;
            this.c = callId;
            this.d = startCallType;
            this.e = dVar;
        }

        public final CallId a() {
            return this.c;
        }

        public final dhw0 b() {
            return this.b;
        }

        public final izs<mlp, s3q0> c() {
            return this.e;
        }

        public final Throwable d() {
            return this.a;
        }

        public final StartCallType e() {
            return this.d;
        }
    }

    public esj(m mVar, h49 h49Var, yp6 yp6Var) {
        this.a = h49Var;
    }

    public final void a(a aVar) {
        cnw0 cnw0Var;
        int errorCode;
        String B;
        String message;
        L.e("ConversationStartErrorHandler", "start call error", aVar.d());
        boolean a2 = h03.a(aVar.d());
        h49 h49Var = this.a;
        if (a2) {
            Throwable d = aVar.d();
            cnw0 cnw0Var2 = OKVoipEngine.v;
            cnw0Var = cnw0Var2 != null ? cnw0Var2 : null;
            dhw0 b = aVar.b();
            String d2 = g620.d(d);
            CallId a3 = aVar.a();
            StartCallType e = aVar.e();
            izs<mlp, s3q0> c = aVar.c();
            if (c == null) {
                c = new gsj(h49Var);
            }
            cnw0Var.e(new zmw0.a(b, d, -13, d2, a3, e, null, c));
            return;
        }
        if (aVar.d() instanceof ExternApiException) {
            ExternApiException externApiException = (ExternApiException) aVar.d();
            cnw0 cnw0Var3 = OKVoipEngine.v;
            cnw0Var = cnw0Var3 != null ? cnw0Var3 : null;
            dhw0 b2 = aVar.b();
            int errorCode2 = externApiException.getErrorCode();
            String extendedError = externApiException.getExtendedError();
            if (extendedError == null) {
                extendedError = String.valueOf(externApiException.getErrorCode());
            }
            String b3 = go9.b("external:api:", extendedError);
            CallId a4 = aVar.a();
            StartCallType e2 = aVar.e();
            izs<mlp, s3q0> c2 = aVar.c();
            if (c2 == null) {
                c2 = new hsj(h49Var);
            }
            cnw0Var.e(new zmw0.a(b2, externApiException, errorCode2, b3, a4, e2, null, c2));
            return;
        }
        if (!(aVar.d() instanceof ApiInvocationException)) {
            cnw0 cnw0Var4 = OKVoipEngine.v;
            cnw0Var = cnw0Var4 != null ? cnw0Var4 : null;
            dhw0 b4 = aVar.b();
            Throwable d3 = aVar.d();
            String d4 = g620.d(aVar.d());
            CallId a5 = aVar.a();
            StartCallType e3 = aVar.e();
            izs<mlp, s3q0> c3 = aVar.c();
            if (c3 == null) {
                c3 = new isj(h49Var);
            }
            cnw0Var.e(new zmw0.a(b4, d3, -1, d4, a5, e3, null, c3));
            h49Var.b(aVar.b(), false, aVar.d());
            return;
        }
        ApiInvocationException apiInvocationException = (ApiInvocationException) aVar.d();
        String errorMessage = apiInvocationException.getErrorMessage();
        if (errorMessage == null || !drm0.D(errorMessage, "error.webrtc.auth.banned", false)) {
            String errorMessage2 = apiInvocationException.getErrorMessage();
            if (errorMessage2 == null || !drm0.D(errorMessage2, "check.flood", false)) {
                String errorMessage3 = apiInvocationException.getErrorMessage();
                if (errorMessage3 == null || !drm0.D(errorMessage3, "error.webrtc.participant.check.killed_call", false)) {
                    String errorMessage4 = apiInvocationException.getErrorMessage();
                    errorCode = (errorMessage4 == null || !drm0.D(errorMessage4, "error.participants.limit.exceeded", false)) ? apiInvocationException.getErrorCode() : -12;
                } else {
                    errorCode = -5;
                }
            } else {
                errorCode = 9;
            }
        } else {
            errorCode = -2;
        }
        int i = errorCode;
        if (apiInvocationException.getErrorCode() == 100 && (message = apiInvocationException.getMessage()) != null && drm0.D(message, "session_key", false)) {
            ConversationFactory conversationFactory = OKVoipEngine.x;
            if (conversationFactory == null) {
                conversationFactory = null;
            }
            if (conversationFactory != null) {
                conversationFactory.clearApiAuthSession();
            }
        }
        cnw0 cnw0Var5 = OKVoipEngine.v;
        cnw0Var = cnw0Var5 != null ? cnw0Var5 : null;
        dhw0 b5 = aVar.b();
        B = f870.B(rl3.I(new String[]{apiInvocationException.getMessage(), apiInvocationException.getErrorMessage()}), StringUtils.PROCESS_POSTFIX_DELIMITER, null);
        String str = "server:api:" + apiInvocationException.getErrorCode() + ':' + B;
        CallId a6 = aVar.a();
        StartCallType e4 = aVar.e();
        izs<mlp, s3q0> c4 = aVar.c();
        if (c4 == null) {
            c4 = new fsj(h49Var);
        }
        cnw0Var.e(new zmw0.a(b5, apiInvocationException, i, str, a6, e4, null, c4));
    }
}
