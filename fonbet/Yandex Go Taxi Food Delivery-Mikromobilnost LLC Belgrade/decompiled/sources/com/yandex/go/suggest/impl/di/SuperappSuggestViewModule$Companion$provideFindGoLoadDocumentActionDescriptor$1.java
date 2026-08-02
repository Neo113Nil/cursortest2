package com.yandex.go.suggest.impl.di;

import com.yandex.go.suggest.impl.data.flex.document.d;
import defpackage.bwp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu1m;", "<anonymous>", "()Lu1m;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.di.SuperappSuggestViewModule$Companion$provideFindGoLoadDocumentActionDescriptor$1", f = "SuperappSuggestViewModule.kt", l = {315}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappSuggestViewModule$Companion$provideFindGoLoadDocumentActionDescriptor$1 extends SuspendLambda implements tls {
    final /* synthetic */ d $superappSuggestQueryInteractor;
    final /* synthetic */ com.yandex.go.suggest.impl.data.a $superappSuggestTextInputRepository;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestViewModule$Companion$provideFindGoLoadDocumentActionDescriptor$1(com.yandex.go.suggest.impl.data.a aVar, d dVar, Continuation continuation) {
        super(1, continuation);
        this.$superappSuggestTextInputRepository = aVar;
        this.$superappSuggestQueryInteractor = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperappSuggestViewModule$Companion$provideFindGoLoadDocumentActionDescriptor$1(this.$superappSuggestTextInputRepository, this.$superappSuggestQueryInteractor, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuperappSuggestViewModule$Companion$provideFindGoLoadDocumentActionDescriptor$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        bwp0 b = this.$superappSuggestTextInputRepository.b();
        d dVar = this.$superappSuggestQueryInteractor;
        this.L$0 = null;
        this.label = 1;
        Object a = dVar.a(b, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
