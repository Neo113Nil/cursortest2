package com.yandex.go.explorer.impl.geofencing;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.explorer.impl.geofencing.ExplorerGeofenceReceiver", f = "ExplorerGeofenceReceiver.kt", l = {74, HProv.ALG_SID_SHA3_384}, m = "resolveLocation", v = 2)
/* loaded from: classes12.dex */
public final class ExplorerGeofenceReceiver$resolveLocation$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExplorerGeofenceReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerGeofenceReceiver$resolveLocation$1(ExplorerGeofenceReceiver explorerGeofenceReceiver, Continuation continuation) {
        super(continuation);
        this.this$0 = explorerGeofenceReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object resolveLocation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        resolveLocation = this.this$0.resolveLocation(null, null, 0, 0, this);
        return resolveLocation;
    }
}
