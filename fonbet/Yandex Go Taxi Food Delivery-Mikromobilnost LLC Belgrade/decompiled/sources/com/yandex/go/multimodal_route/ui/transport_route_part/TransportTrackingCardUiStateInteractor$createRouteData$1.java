package com.yandex.go.multimodal_route.ui.transport_route_part;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportTrackingCardUiStateInteractor", f = "TransportTrackingCardUiStateInteractor.kt", l = {HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_SECURITY_LEVEL, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "createRouteData", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardUiStateInteractor$createRouteData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiStateInteractor$createRouteData$1(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return s.a(this.this$0, null, null, null, null, this);
    }
}
