package com.yandex.go.preorder.suggested.menu.presenter;

import com.yandex.go.preorder.suggested.menu.experiment.g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/preorder/suggested/menu/experiment/SuggestMenuExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.preorder.suggested.menu.presenter.SuggestMenuPresenter$experiment$1", f = "SuggestMenuPresenter.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SuggestMenuPresenter$experiment$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestMenuPresenter$experiment$1(b bVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuggestMenuPresenter$experiment$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuggestMenuPresenter$experiment$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        g gVar = this.this$0.D;
        this.label = 1;
        Object b = gVar.a.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
