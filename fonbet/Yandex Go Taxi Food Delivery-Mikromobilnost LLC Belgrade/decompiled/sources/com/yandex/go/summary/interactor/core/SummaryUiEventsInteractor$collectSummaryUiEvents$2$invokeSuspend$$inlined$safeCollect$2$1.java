package com.yandex.go.summary.interactor.core;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2", f = "SummaryUiEventsInteractor.kt", l = {HProv.PP_RESERVED1, 99, 108, HProv.PP_NK_SYNC, 119, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "emit", v = 2)
/* loaded from: classes14.dex */
public final class SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1(u uVar, Continuation continuation) {
        super(continuation);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
