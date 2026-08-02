package com.yandex.go.eboks.objects.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "T", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.eboks.objects.domain.EboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2", f = "EboksObjectsObjectsCollectionsInteractor.kt", l = {219}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2 eboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2 = new EboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2(this.$action, continuation);
        eboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2.Z$0 = ((Boolean) obj).booleanValue();
        return eboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((EboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!z) {
            return null;
        }
        tls tlsVar = this.$action;
        this.Z$0 = z;
        this.label = 1;
        Object invoke = tlsVar.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
