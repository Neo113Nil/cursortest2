package one.video.calls.sdk.rest.api.error;

import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ApiInvocationError.kt */
/* loaded from: classes8.dex */
public class ApiInvocationError extends ApiInvocationException {
    public static final /* synthetic */ int b = 0;

    public ApiInvocationError(int i, ApiInvocationException apiInvocationException) {
        super(i, apiInvocationException.getErrorMessage(), apiInvocationException.getErrorField(), apiInvocationException.getErrorData(), apiInvocationException.getErrorCustomKey(), apiInvocationException.getErrorCustomJson(), apiInvocationException.getErrorPage());
    }
}
