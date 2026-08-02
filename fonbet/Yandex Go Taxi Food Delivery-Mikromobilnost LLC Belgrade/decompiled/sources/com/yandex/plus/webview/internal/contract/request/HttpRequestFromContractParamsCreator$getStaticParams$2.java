package com.yandex.plus.webview.internal.contract.request;

import defpackage.in41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Lin41;", "it", "", "", "<anonymous>", "(Ltse;Lin41;)Ljava/util/Set;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.webview.internal.contract.request.HttpRequestFromContractParamsCreator$getStaticParams$2", f = "HttpRequestFromContractParamsCreator.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HttpRequestFromContractParamsCreator$getStaticParams$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HttpRequestFromContractParamsCreator$getStaticParams$2 httpRequestFromContractParamsCreator$getStaticParams$2 = new HttpRequestFromContractParamsCreator$getStaticParams$2(3, (Continuation) obj3);
        httpRequestFromContractParamsCreator$getStaticParams$2.L$0 = (in41) obj2;
        return httpRequestFromContractParamsCreator$getStaticParams$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in41 in41Var = (in41) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.L$0 = null;
        this.label = 1;
        in41Var.getClass();
        EmptySet emptySet = EmptySet.a;
        return emptySet == coroutineSingletons ? coroutineSingletons : emptySet;
    }
}
