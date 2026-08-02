package com.ybsdk.di.modules.features.push;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.di.modules.features.push.PushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1", f = "PushNotificationsFeatureModule.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "getSubscribeInfo")
/* loaded from: classes3.dex */
final class PushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsFeatureModule$Companion$providePushSubscribeProvider$1$getSubscribeInfo$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
