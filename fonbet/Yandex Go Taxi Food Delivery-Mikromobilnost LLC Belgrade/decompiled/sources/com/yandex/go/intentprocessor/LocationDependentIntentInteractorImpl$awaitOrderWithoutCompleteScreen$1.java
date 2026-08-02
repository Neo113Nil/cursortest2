package com.yandex.go.intentprocessor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.intentprocessor.LocationDependentIntentInteractorImpl", f = "LocationDependentIntentInteractorImpl.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "awaitOrderWithoutCompleteScreen", v = 2)
/* loaded from: classes12.dex */
final class LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
