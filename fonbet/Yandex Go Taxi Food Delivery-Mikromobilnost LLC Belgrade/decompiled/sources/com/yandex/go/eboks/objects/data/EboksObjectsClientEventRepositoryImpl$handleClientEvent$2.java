package com.yandex.go.eboks.objects.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.eboks.objects.data.EboksObjectsClientEventRepositoryImpl$handleClientEvent$2", f = "EboksObjectsClientEventRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsClientEventRepositoryImpl$handleClientEvent$2 extends SuspendLambda implements wls {
    /* synthetic */ int I$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EboksObjectsClientEventRepositoryImpl$handleClientEvent$2 eboksObjectsClientEventRepositoryImpl$handleClientEvent$2 = new EboksObjectsClientEventRepositoryImpl$handleClientEvent$2(2, continuation);
        eboksObjectsClientEventRepositoryImpl$handleClientEvent$2.I$0 = ((Number) obj).intValue();
        return eboksObjectsClientEventRepositoryImpl$handleClientEvent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsClientEventRepositoryImpl$handleClientEvent$2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(i > 0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
