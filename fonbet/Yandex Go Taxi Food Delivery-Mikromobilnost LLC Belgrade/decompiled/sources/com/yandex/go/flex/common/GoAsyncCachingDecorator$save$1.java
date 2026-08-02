package com.yandex.go.flex.common;

import defpackage.mvg;
import defpackage.n8j0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedInputStream;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.GoAsyncCachingDecorator$save$1", f = "GoAsyncCachingDecorator.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class GoAsyncCachingDecorator$save$1 extends SuspendLambda implements wls {
    final /* synthetic */ BufferedInputStream $bufferedRawResponse;
    final /* synthetic */ tls $cachedDecoder;
    final /* synthetic */ n8j0 $networkDataModel;
    final /* synthetic */ boolean $saveForNextUse;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoAsyncCachingDecorator$save$1(BufferedInputStream bufferedInputStream, a aVar, n8j0 n8j0Var, boolean z, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$bufferedRawResponse = bufferedInputStream;
        this.this$0 = aVar;
        this.$networkDataModel = n8j0Var;
        this.$saveForNextUse = z;
        this.$cachedDecoder = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoAsyncCachingDecorator$save$1(this.$bufferedRawResponse, this.this$0, this.$networkDataModel, this.$saveForNextUse, this.$cachedDecoder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GoAsyncCachingDecorator$save$1 goAsyncCachingDecorator$save$1 = (GoAsyncCachingDecorator$save$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        goAsyncCachingDecorator$save$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$bufferedRawResponse.reset();
        BufferedInputStream bufferedInputStream = this.$bufferedRawResponse;
        a aVar = this.this$0;
        try {
            aVar.a.save(this.$networkDataModel, this.$saveForNextUse, bufferedInputStream, this.$cachedDecoder);
            ooc.g(bufferedInputStream, null);
            return zy11.a;
        } finally {
        }
    }
}
