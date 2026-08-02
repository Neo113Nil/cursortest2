package xsna;

import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.ResponseErrorKt;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* compiled from: VkpnsAuthApi.kt */
/* loaded from: classes5.dex */
public final class w3w0 extends Lambda implements izs<Result<? extends HttpResponse>, Result<? extends mfx>> {
    final /* synthetic */ x3w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3w0(x3w0 x3w0Var) {
        super(1);
        this.this$0 = x3w0Var;
    }

    @Override // xsna.izs
    public final Result<? extends mfx> invoke(Result<? extends HttpResponse> result) {
        Object failure;
        Object obj;
        HttpResponse httpResponse;
        Object d = result.d();
        x3w0 x3w0Var = this.this$0;
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
            x3w0Var.getClass();
            failure = new mfx(new JSONObject(body).getString("token"));
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
