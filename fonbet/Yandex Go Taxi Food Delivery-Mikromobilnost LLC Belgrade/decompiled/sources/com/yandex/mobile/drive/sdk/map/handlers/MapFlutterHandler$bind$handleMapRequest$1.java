package com.yandex.mobile.drive.sdk.map.handlers;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mobile.drive.sdk.map.handlers.MapFlutterHandler", f = "MapFlutterHandler.kt", l = {119, 175, 210, HProv.PP_AUTH_INFO}, m = "bind$handleMapRequest")
/* loaded from: classes15.dex */
final class MapFlutterHandler$bind$handleMapRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(null, null, this);
    }
}
