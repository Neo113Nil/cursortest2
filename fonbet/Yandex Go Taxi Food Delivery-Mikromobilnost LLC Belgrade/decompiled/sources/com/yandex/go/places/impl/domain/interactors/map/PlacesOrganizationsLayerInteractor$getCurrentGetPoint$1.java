package com.yandex.go.places.impl.domain.interactors.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.domain.interactors.map.PlacesOrganizationsLayerInteractor", f = "PlacesOrganizationsLayerInteractor.kt", l = {45}, m = "getCurrentGetPoint", v = 2)
/* loaded from: classes13.dex */
final class PlacesOrganizationsLayerInteractor$getCurrentGetPoint$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesOrganizationsLayerInteractor$getCurrentGetPoint$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.a(this.this$0, this);
    }
}
