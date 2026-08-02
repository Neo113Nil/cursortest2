package com.yandex.go.taxi.order.details.v1.elements.route_point;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsStyleMapper", f = "DetailsCardRoutePointsStyleMapper.kt", l = {122, HProv.PP_SAME_MEDIA, HProv.PP_DELETE_SAVED_PASSWD}, m = "handleStaticPointsStyle", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardRoutePointsStyleMapper$handleStaticPointsStyle$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(null, null, this);
    }
}
