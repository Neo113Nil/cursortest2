package ru.rustore.sdk.pushclient.messaging.service;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

@b6l(c = "ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService", f = "RuStoreMessagingService.kt", l = {149, 152}, m = "handleNewPushTokenEvent")
/* loaded from: classes9.dex */
public final class a extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RuStoreMessagingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RuStoreMessagingService ruStoreMessagingService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ruStoreMessagingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RuStoreMessagingService ruStoreMessagingService = this.this$0;
        int i = RuStoreMessagingService.k;
        return ruStoreMessagingService.b(null, this);
    }
}
