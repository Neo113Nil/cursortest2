package com.yandex.go.flex.main_screen.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xxl;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.interactors.ShowUnavailableAddressScaffoldInteractor$showDocument$2", f = "ShowUnavailableAddressScaffoldInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ShowUnavailableAddressScaffoldInteractor$showDocument$2 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $document;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowUnavailableAddressScaffoldInteractor$showDocument$2(q qVar, ywl ywlVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$document = ywlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShowUnavailableAddressScaffoldInteractor$showDocument$2(this.this$0, this.$document, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ShowUnavailableAddressScaffoldInteractor$showDocument$2 showUnavailableAddressScaffoldInteractor$showDocument$2 = (ShowUnavailableAddressScaffoldInteractor$showDocument$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        showUnavailableAddressScaffoldInteractor$showDocument$2.invokeSuspend(zy11Var);
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
        flex.engine.a aVar = this.this$0.j;
        ywl ywlVar = this.$document;
        xxl xxlVar = flex.engine.a.s0;
        aVar.B(ywlVar, null);
        return zy11.a;
    }
}
