package com.yandex.go.places.map.data.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesBaseMapObjectsRepository", f = "PlacesBaseMapObjectsRepository.kt", l = {227, HProv.PP_AUTH_INFO}, m = "clearSelectedMapObject", v = 2)
/* loaded from: classes13.dex */
final class PlacesBaseMapObjectsRepository$clearSelectedMapObject$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesBaseMapObjectsRepository$clearSelectedMapObject$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.a(this.this$0, null, this);
    }
}
