package com.ybsdk.feature.push.impl.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.push.impl.domain.PushNotificationsSubscriptionTask", f = "PushNotificationsSubscriptionTask.kt", l = {40, 42}, m = "doWork")
/* loaded from: classes8.dex */
final class PushNotificationsSubscriptionTask$doWork$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushNotificationsSubscriptionTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsSubscriptionTask$doWork$1(PushNotificationsSubscriptionTask pushNotificationsSubscriptionTask, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pushNotificationsSubscriptionTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
