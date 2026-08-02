package com.yandex.go.ai_widget.ui.component;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState", f = "AiWidgetEvaluationSwipeState.kt", l = {HProv.PP_AUTH_INFO, 223, 224, 226, 227, 232}, m = "performCommitSwipe", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationSwipeState$performCommitSwipe$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationSwipeState$performCommitSwipe$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, this);
    }
}
