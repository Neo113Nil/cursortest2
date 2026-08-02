package com.yandex.messaging.ui.timeline;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineFragment", f = "TimelineFragment.kt", l = {HProv.PP_RESERVED1}, m = "createBrick")
/* loaded from: classes15.dex */
public final class TimelineFragment$createBrick$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFragment$createBrick$1(TimelineFragment timelineFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = timelineFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createBrick(this);
    }
}
