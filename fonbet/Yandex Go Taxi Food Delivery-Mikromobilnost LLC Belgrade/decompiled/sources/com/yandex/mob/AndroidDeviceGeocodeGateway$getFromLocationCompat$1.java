package com.yandex.mob;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.AndroidDeviceGeocodeGateway", f = "AndroidDeviceGeocodeGateway.kt", l = {60}, m = "getFromLocationCompat")
/* loaded from: classes15.dex */
final class AndroidDeviceGeocodeGateway$getFromLocationCompat$1 extends ContinuationImpl {
    double D$0;
    double D$1;
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDeviceGeocodeGateway$getFromLocationCompat$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, 0.0d, 0.0d, 0, this);
    }
}
