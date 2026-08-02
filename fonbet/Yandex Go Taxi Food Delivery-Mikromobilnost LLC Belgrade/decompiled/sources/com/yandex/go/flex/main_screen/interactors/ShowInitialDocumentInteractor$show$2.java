package com.yandex.go.flex.main_screen.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.interactors.ShowInitialDocumentInteractor$show$2", f = "ShowInitialDocumentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ShowInitialDocumentInteractor$show$2 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $document;
    final /* synthetic */ u1m $query;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowInitialDocumentInteractor$show$2(p pVar, ywl ywlVar, u1m u1mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$document = ywlVar;
        this.$query = u1mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShowInitialDocumentInteractor$show$2(this.this$0, this.$document, this.$query, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ShowInitialDocumentInteractor$show$2 showInitialDocumentInteractor$show$2 = (ShowInitialDocumentInteractor$show$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        showInitialDocumentInteractor$show$2.invokeSuspend(zy11Var);
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
        this.this$0.f.C(new xzl(this.$document, this.$query, q5z.d, 16));
        return zy11.a;
    }
}
