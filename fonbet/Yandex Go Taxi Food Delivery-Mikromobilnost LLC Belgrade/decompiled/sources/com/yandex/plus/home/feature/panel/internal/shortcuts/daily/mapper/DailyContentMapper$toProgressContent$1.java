package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.DailyContentMapper", f = "DailyContentMapper.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "toProgressContent")
/* loaded from: classes2.dex */
final class DailyContentMapper$toProgressContent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyContentMapper$toProgressContent$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
