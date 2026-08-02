package com.yandex.go.scooters.live.notification;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateMapper", f = "ScootersLiveNotificationUiStateMapper.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "mapToVehicleInfo", v = 2)
/* loaded from: classes13.dex */
final class ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLiveNotificationUiStateMapper$mapToVehicleInfo$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(this.this$0, null, this);
    }
}
