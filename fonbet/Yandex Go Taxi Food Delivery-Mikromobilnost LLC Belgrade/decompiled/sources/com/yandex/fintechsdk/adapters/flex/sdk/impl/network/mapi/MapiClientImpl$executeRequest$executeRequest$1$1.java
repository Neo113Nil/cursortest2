package com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi;

import core.network.mapi.client.a;
import defpackage.ku00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vu00;
import defpackage.wls;
import defpackage.xu00;
import defpackage.yu00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ltse;", "Lxu00;", "<anonymous>", "(Ltse;)Lxu00;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl$executeRequest$executeRequest$1$1", f = "MapiClientImpl.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MapiClientImpl$executeRequest$executeRequest$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ku00 $listener;
    final /* synthetic */ yu00 $parser;
    final /* synthetic */ vu00 $request;
    int label;
    final /* synthetic */ MapiClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapiClientImpl$executeRequest$executeRequest$1$1(MapiClientImpl mapiClientImpl, vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, Continuation<? super MapiClientImpl$executeRequest$executeRequest$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mapiClientImpl;
        this.$request = vu00Var;
        this.$parser = yu00Var;
        this.$listener = ku00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new MapiClientImpl$executeRequest$executeRequest$1$1(this.this$0, this.$request, this.$parser, this.$listener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super xu00> continuation) {
        return ((MapiClientImpl$executeRequest$executeRequest$1$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
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
        aVar = this.this$0.client;
        vu00 vu00Var = this.$request;
        yu00 yu00Var = this.$parser;
        ku00 ku00Var = this.$listener;
        this.label = 1;
        Object executeRequest = aVar.executeRequest(vu00Var, yu00Var, ku00Var, this);
        return executeRequest == coroutineSingletons ? coroutineSingletons : executeRequest;
    }
}
