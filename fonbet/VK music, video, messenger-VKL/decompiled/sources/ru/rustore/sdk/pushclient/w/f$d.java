package ru.rustore.sdk.pushclient.w;

import android.net.Uri;
import com.vk.push.common.clientid.ClientId;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.ExtensionsKt;
import com.vk.push.core.network.utils.ResponseErrorKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.b6l;
import xsna.izs;
import xsna.kay0;
import xsna.pvy0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.push.VkpnsPusherApi$getNewPushToken$2", f = "VkpnsPusherApi.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class f$d extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends kay0>>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ClientId c;
    public final /* synthetic */ pvy0 d;

    public static final class a extends Lambda implements izs<Result<? extends HttpResponse>, Result<? extends kay0>> {
        public final /* synthetic */ pvy0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pvy0 pvy0Var) {
            super(1);
            this.a = pvy0Var;
        }

        @Override // xsna.izs
        public final Result<? extends kay0> invoke(Result<? extends HttpResponse> result) {
            Object failure;
            Object obj;
            HttpResponse httpResponse;
            Object d = result.d();
            pvy0 pvy0Var = this.a;
            try {
                kotlin.a.a(d);
                httpResponse = (HttpResponse) d;
            } catch (Exception e) {
                failure = new Result.Failure(e);
            }
            if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                ResponseError parseErrorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                obj = new Result.Failure(new VkpnsRequestWithErrorBodyException(parseErrorResponse.toString(), parseErrorResponse.getCode()));
            } else if (httpResponse.isSuccessful()) {
                String body = httpResponse.getBody();
                pvy0Var.getClass();
                failure = new kay0(new JSONObject(body).getString("token"));
                obj = failure;
            } else {
                String message = httpResponse.getMessage();
                if (message == null) {
                    message = "";
                }
                obj = new Result.Failure(new VkpnsRequestException(message, httpResponse.getCode()));
            }
            return new Result<>(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f$d(String str, ClientId clientId, pvy0 pvy0Var, spj<? super f$d> spjVar) {
        super(2, spjVar);
        this.b = str;
        this.c = clientId;
        this.d = pvy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f$d(this.b, this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends kay0>> spjVar) {
        return ((f$d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m108executeRequest0E7RQCE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            JSONObject put = new JSONObject().put(LoginApiConstants.RESULT_NAME_AUTH_TOKEN, this.b);
            ClientId clientId = this.c;
            JSONObject putOpt = put.putOpt("client_id", clientId != null ? clientId.getClientIdValue() : null);
            ClientId clientId2 = this.c;
            HttpRequest.Post post = new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), this.d.c).encodedPath("v1/projects/" + this.d.b + "/token:new").build().toString(), putOpt.putOpt("client_id_type", clientId2 != null ? clientId2.getClientIdType() : null).toString());
            pvy0 pvy0Var = this.d;
            HttpClient httpClient = pvy0Var.a;
            a aVar = new a(pvy0Var);
            this.a = 1;
            m108executeRequest0E7RQCE = httpClient.m108executeRequest0E7RQCE(post, aVar, this);
            if (m108executeRequest0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            m108executeRequest0E7RQCE = ((Result) obj).d();
        }
        return new Result(m108executeRequest0E7RQCE);
    }
}
