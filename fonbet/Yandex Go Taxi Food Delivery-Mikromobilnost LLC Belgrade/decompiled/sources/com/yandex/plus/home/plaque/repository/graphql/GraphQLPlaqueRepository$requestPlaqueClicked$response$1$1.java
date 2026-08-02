package com.yandex.plus.home.plaque.repository.graphql;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.c3j0;
import defpackage.eo2;
import defpackage.mvg;
import defpackage.n270;
import defpackage.ny61;
import defpackage.qo2;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lvo2;", "Lb3j0;", "<anonymous>", "(Ltse;)Lvo2;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.graphql.GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1", f = "GraphQLPlaqueRepository.kt", l = {SubsamplingScaleImageView.ORIENTATION_270}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ eo2 $benchmark;
    final /* synthetic */ c3j0 $mutation;
    final /* synthetic */ a $this_runSuspendCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1(eo2 eo2Var, a aVar, c3j0 c3j0Var, Continuation continuation) {
        super(2, continuation);
        this.$benchmark = eo2Var;
        this.$this_runSuspendCatching = aVar;
        this.$mutation = c3j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1(this.$benchmark, this.$this_runSuspendCatching, this.$mutation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        ((n270) this.$benchmark).c();
        qo2 qo2Var = this.$this_runSuspendCatching.a;
        c3j0 c3j0Var = this.$mutation;
        this.label = 1;
        Object a = com.yandex.plus.core.graphql.internal.a.a(qo2Var, c3j0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
