package com.yandex.plus.home.feature.webviews.internal.stories.list;

import defpackage.eg41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vk41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.stories.list.WebStoriesContainerPresenter$subscribeForNavigationEvents$1", f = "WebStoriesContainerPresenter.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebStoriesContainerPresenter$subscribeForNavigationEvents$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $flow;
    int label;
    final /* synthetic */ vk41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebStoriesContainerPresenter$subscribeForNavigationEvents$1(tpr tprVar, vk41 vk41Var, Continuation continuation) {
        super(2, continuation);
        this.$flow = tprVar;
        this.this$0 = vk41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebStoriesContainerPresenter$subscribeForNavigationEvents$1(this.$flow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebStoriesContainerPresenter$subscribeForNavigationEvents$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$flow;
            if (tprVar != null) {
                eg41 eg41Var = new eg41(1, this.this$0);
                this.label = 1;
                if (tprVar.collect(eg41Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
