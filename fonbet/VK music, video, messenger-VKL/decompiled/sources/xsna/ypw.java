package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ImportActivitiesVkWorkoutUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.domain.usecases.ImportActivitiesVkWorkoutUseCase", f = "ImportActivitiesVkWorkoutUseCase.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 109}, m = "uploadChunk")
/* loaded from: classes6.dex */
public final class ypw extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zpw this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypw(zpw zpwVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, 0L, null, null, this);
    }
}
