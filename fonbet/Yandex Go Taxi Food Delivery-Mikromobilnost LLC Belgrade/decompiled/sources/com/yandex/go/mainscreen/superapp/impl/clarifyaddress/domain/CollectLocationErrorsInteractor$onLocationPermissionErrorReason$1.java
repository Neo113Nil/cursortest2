package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.CollectLocationErrorsInteractor", f = "CollectLocationErrorsInteractor.kt", l = {47}, m = "onLocationPermissionErrorReason", v = 2)
/* loaded from: classes12.dex */
final class CollectLocationErrorsInteractor$onLocationPermissionErrorReason$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectLocationErrorsInteractor$onLocationPermissionErrorReason$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
