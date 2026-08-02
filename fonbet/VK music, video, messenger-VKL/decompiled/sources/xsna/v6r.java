package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FetchVkWorkoutWidgetSyncConfigUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.domain.usecases.FetchVkWorkoutWidgetSyncConfigUseCase", f = "FetchVkWorkoutWidgetSyncConfigUseCase.kt", l = {13, 17}, m = "execute")
/* loaded from: classes6.dex */
public final class v6r extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w6r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6r(w6r w6rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = w6rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
