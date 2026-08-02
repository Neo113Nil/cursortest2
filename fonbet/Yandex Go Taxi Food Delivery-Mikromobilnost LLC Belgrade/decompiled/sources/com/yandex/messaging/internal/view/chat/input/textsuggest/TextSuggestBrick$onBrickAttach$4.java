package com.yandex.messaging.internal.view.chat.input.textsuggest;

import defpackage.hi91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "inputHeight", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestBrick$onBrickAttach$4", f = "TextSuggestBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TextSuggestBrick$onBrickAttach$4 extends SuspendLambda implements wls {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSuggestBrick$onBrickAttach$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextSuggestBrick$onBrickAttach$4 textSuggestBrick$onBrickAttach$4 = new TextSuggestBrick$onBrickAttach$4(this.this$0, continuation);
        textSuggestBrick$onBrickAttach$4.I$0 = ((Number) obj).intValue();
        return textSuggestBrick$onBrickAttach$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TextSuggestBrick$onBrickAttach$4 textSuggestBrick$onBrickAttach$4 = (TextSuggestBrick$onBrickAttach$4) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        textSuggestBrick$onBrickAttach$4.invokeSuspend(zy11Var);
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
        hi91.h(this.I$0, this.this$0.q());
        return zy11.a;
    }
}
