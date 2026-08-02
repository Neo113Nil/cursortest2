package com.yandex.go.zone.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.zone.repository.ZoneInfoAnalytics", f = "ZoneInfoAnalytics.kt", l = {60}, m = "eventsLoggerWrap", v = 2)
/* loaded from: classes8.dex */
final class ZoneInfoAnalytics$eventsLoggerWrap$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneInfoAnalytics$eventsLoggerWrap$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
