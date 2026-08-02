package xsna;

import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.ResponseErrorKt;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class mnp extends Lambda implements izs {
    public static final mnp j;
    public static final mnp k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new mnp(i, 0);
        k = new mnp(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnp(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        switch (this.i) {
            case 0:
                long j2 = ((q9x) obj).a;
                long j3 = 0;
                return new q9x((j3 & 4294967295L) | (j3 << 32));
            default:
                Object d = ((Result) obj).d();
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
                return new Result(failure);
        }
    }
}
