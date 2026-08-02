package com.yandex.messaging.internal.authorized.chat.notifications.builder;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.internal.authorized.chat.notifications.builder.ThreadInPrivateChatNotificationAppearance", f = "ThreadInPrivateChatNotificationAppearance.kt", l = {82, HProv.ALG_SID_NO_HASH}, m = "resolveAppearanceData")
/* loaded from: classes15.dex */
final class ThreadInPrivateChatNotificationAppearance$resolveAppearanceData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadInPrivateChatNotificationAppearance$resolveAppearanceData$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
