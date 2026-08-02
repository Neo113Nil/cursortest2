package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ImportActivitiesVkWorkoutUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.domain.usecases.ImportActivitiesVkWorkoutUseCase", f = "ImportActivitiesVkWorkoutUseCase.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, 83}, m = "execute")
/* loaded from: classes6.dex */
public final class wpw extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zpw this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpw(zpw zpwVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, 0L, null, null, this);
    }
}
