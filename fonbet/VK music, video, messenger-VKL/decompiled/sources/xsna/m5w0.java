package xsna;

import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.ResponseErrorKt;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: VkpnsPusherMessagesApi.kt */
/* loaded from: classes5.dex */
public final class m5w0 extends Lambda implements izs<Result<? extends HttpResponse>, Result<? extends List<? extends vje0>>> {
    final /* synthetic */ n5w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5w0(n5w0 n5w0Var) {
        super(1);
        this.this$0 = n5w0Var;
    }

    @Override // xsna.izs
    public final Result<? extends List<? extends vje0>> invoke(Result<? extends HttpResponse> result) {
        Object failure;
        Object d = result.d();
        n5w0 n5w0Var = this.this$0;
        try {
            kotlin.a.a(d);
            HttpResponse httpResponse = (HttpResponse) d;
            if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                ResponseError parseErrorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                failure = new Result.Failure(new VkpnsRequestWithErrorBodyException(parseErrorResponse.toString(), parseErrorResponse.getCode()));
            } else if (httpResponse.isSuccessful()) {
                failure = n5w0.a(n5w0Var, httpResponse.getBody());
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
