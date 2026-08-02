package com.yandex.plus.home.feature.webviews.internal.home;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "it", "Lzy11;", "<anonymous>", "(Ltse;Z)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebPresenter$subscribeOnAccountChanges$1", f = "PlusHomeWebPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusHomeWebPresenter$subscribeOnAccountChanges$1 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeWebPresenter$subscribeOnAccountChanges$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        PlusHomeWebPresenter$subscribeOnAccountChanges$1 plusHomeWebPresenter$subscribeOnAccountChanges$1 = new PlusHomeWebPresenter$subscribeOnAccountChanges$1(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        plusHomeWebPresenter$subscribeOnAccountChanges$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.e k = this.this$0.k();
        d dVar = this.this$0;
        k.j(dVar.f.c, dVar.J);
        return zy11.a;
    }
}
