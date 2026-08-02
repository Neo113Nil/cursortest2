package com.yandex.go.places.impl.navigation.common.navigator.internal;

import defpackage.a5g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sn80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La5g;", "it", "Lsn80;", "<anonymous>", "(La5g;)Lsn80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.navigator.internal.PlacesInternalNavigatorImpl$openOrganizationsListV2$2", f = "PlacesInternalNavigatorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesInternalNavigatorImpl$openOrganizationsListV2$2 extends SuspendLambda implements wls {
    final /* synthetic */ sn80 $payload;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesInternalNavigatorImpl$openOrganizationsListV2$2(sn80 sn80Var, Continuation continuation) {
        super(2, continuation);
        this.$payload = sn80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesInternalNavigatorImpl$openOrganizationsListV2$2(this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesInternalNavigatorImpl$openOrganizationsListV2$2) create((a5g) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.$payload;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
