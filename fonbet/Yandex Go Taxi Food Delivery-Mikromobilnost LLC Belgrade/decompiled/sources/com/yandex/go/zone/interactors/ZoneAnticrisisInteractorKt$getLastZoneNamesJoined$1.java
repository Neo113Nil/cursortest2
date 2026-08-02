package com.yandex.go.zone.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.zone.interactors.ZoneAnticrisisInteractorKt", f = "ZoneAnticrisisInteractor.kt", l = {18}, m = "getLastZoneNamesJoined", v = 2)
/* loaded from: classes8.dex */
final class ZoneAnticrisisInteractorKt$getLastZoneNamesJoined$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.a(null, null, this);
    }
}
