package com.yandex.messaging.internal.view.chat.input.textsuggest;

import defpackage.mvg;
import defpackage.nty0;
import defpackage.ny61;
import defpackage.qty0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnty0;", "query", "Lzy11;", "<anonymous>", "(Lnty0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestBrick$onBrickAttach$1", f = "TextSuggestBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TextSuggestBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSuggestBrick$onBrickAttach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextSuggestBrick$onBrickAttach$1 textSuggestBrick$onBrickAttach$1 = new TextSuggestBrick$onBrickAttach$1(this.this$0, continuation);
        textSuggestBrick$onBrickAttach$1.L$0 = obj;
        return textSuggestBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TextSuggestBrick$onBrickAttach$1 textSuggestBrick$onBrickAttach$1 = (TextSuggestBrick$onBrickAttach$1) create((nty0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        textSuggestBrick$onBrickAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        qty0 qty0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        nty0 nty0Var = (nty0) this.L$0;
        d dVar = this.this$0.x;
        if (nty0Var != null) {
            dVar.getClass();
            qty0Var = new qty0(nty0Var);
        }
        dVar.g = qty0Var;
        return zy11.a;
    }
}
