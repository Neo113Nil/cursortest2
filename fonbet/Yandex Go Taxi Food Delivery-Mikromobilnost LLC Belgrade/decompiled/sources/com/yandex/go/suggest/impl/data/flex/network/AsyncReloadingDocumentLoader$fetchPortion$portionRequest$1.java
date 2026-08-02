package com.yandex.go.suggest.impl.data.flex.network;

import defpackage.kq90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q370;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wbe0;
import defpackage.wls;
import defpackage.zy11;
import flex.core.loader.network.e;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwzl;", "<anonymous>", "(Ltse;)Lwzl;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.network.AsyncReloadingDocumentLoader$fetchPortion$portionRequest$1", f = "AsyncReloadingDocumentLoader.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AsyncReloadingDocumentLoader$fetchPortion$portionRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ q370 $context;
    final /* synthetic */ wbe0 $params;
    final /* synthetic */ kq90 $patchParams;
    final /* synthetic */ u1m $query;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncReloadingDocumentLoader$fetchPortion$portionRequest$1(a aVar, u1m u1mVar, wbe0 wbe0Var, q370 q370Var, kq90 kq90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = u1mVar;
        this.$params = wbe0Var;
        this.$context = q370Var;
        this.$patchParams = kq90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncReloadingDocumentLoader$fetchPortion$portionRequest$1(this.this$0, this.$query, this.$params, this.$context, this.$patchParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncReloadingDocumentLoader$fetchPortion$portionRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        e eVar = this.this$0.b;
        u1m u1mVar = this.$query;
        wbe0 wbe0Var = this.$params;
        q370 q370Var = this.$context;
        kq90 kq90Var = this.$patchParams;
        this.label = 1;
        Object d = eVar.d(u1mVar, wbe0Var, q370Var, kq90Var, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
