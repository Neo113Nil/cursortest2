package com.yandex.go.places.map.data.mappers;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.map.data.mappers.MapObjectItemMapper", f = "MapObjectItemMapper.kt", l = {114, HProv.PP_SECURITY_LEVEL, 130, HProv.PP_CONTAINER_EXTENSION, 143}, m = "mapOrganizationPreviewPin", v = 2)
/* loaded from: classes13.dex */
final class MapObjectItemMapper$mapOrganizationPreviewPin$1 extends ContinuationImpl {
    double D$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectItemMapper$mapOrganizationPreviewPin$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, null, null, null, this);
    }
}
