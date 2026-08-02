package com.yandex.go.platform.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "com.yandex.go.platform.utils.PermissionsHandler", f = "PermissionsHandler.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "requestPostNotificationsPermission")
/* loaded from: classes13.dex */
final class PermissionsHandler$requestPostNotificationsPermission$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsHandler$requestPostNotificationsPermission$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
