package com.yandex.go.preorder.deeplinks.route;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.preorder.deeplinks.route.IntentDataInteractor", f = "IntentDataInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "createGeoPointForAddressOrNull", v = 2)
/* loaded from: classes13.dex */
final class IntentDataInteractor$createGeoPointForAddressOrNull$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentDataInteractor$createGeoPointForAddressOrNull$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, null, this);
    }
}
