package ru.rustore.sdk.pushclient.l;

import android.net.Uri;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.ExtensionsKt;
import com.vk.push.core.network.utils.ResponseErrorKt;
import java.util.Arrays;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.b6l;
import xsna.izs;
import xsna.nbz0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.VkpnsTopicSourceApi$unsubscribeFromTopic$2", f = "VkpnsTopicSourceApi.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class r$d extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ nbz0 d;

    public static final class a extends Lambda implements izs<Result<? extends HttpResponse>, Result<? extends s3q0>> {
        public static final a i = new a();

        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final Result<? extends s3q0> invoke(Result<? extends HttpResponse> result) {
            Object failure;
            Object d = result.d();
            try {
                kotlin.a.a(d);
                HttpResponse httpResponse = (HttpResponse) d;
                if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                    ResponseError parseErrorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                    failure = new Result.Failure(new VkpnsRequestWithErrorBodyException(parseErrorResponse.toString(), parseErrorResponse.getCode()));
                } else if (httpResponse.isSuccessful()) {
                    httpResponse.getBody();
                    failure = s3q0.a;
                } else {
                    String message = httpResponse.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    failure = new Result.Failure(new VkpnsRequestException(message, httpResponse.getCode()));
                }
            } catch (Exception e) {
                failure = new Result.Failure(e);
            }
            return new Result<>(failure);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r$d(String str, String str2, nbz0 nbz0Var, spj<? super r$d> spjVar) {
        super(2, spjVar);
        this.b = str;
        this.c = str2;
        this.d = nbz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new r$d(this.b, this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((r$d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m108executeRequest0E7RQCE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            HttpRequest.Post post = new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), this.d.b).encodedPath(String.format("v1/topics/%s/unsubscribe", Arrays.copyOf(new Object[]{this.c}, 1))).build().toString(), new JSONObject().put("push_token", this.b).toString());
            HttpClient httpClient = this.d.a;
            a aVar = a.i;
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
