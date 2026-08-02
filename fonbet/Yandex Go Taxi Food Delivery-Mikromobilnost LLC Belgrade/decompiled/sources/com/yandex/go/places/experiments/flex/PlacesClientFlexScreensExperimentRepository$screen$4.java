package com.yandex.go.places.experiments.flex;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.experiments.flex.PlacesClientFlexScreensExperimentRepository", f = "PlacesClientFlexScreensExperimentRepository.kt", l = {25}, m = MetaDataField.SCREEN_FIELD, v = 2)
/* loaded from: classes13.dex */
final class PlacesClientFlexScreensExperimentRepository$screen$4 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesClientFlexScreensExperimentRepository$screen$4(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
