package com.yandex.messaging.internal.view.chat.input.textsuggest;

import defpackage.mvg;
import defpackage.nty0;
import defpackage.ny61;
import defpackage.upq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnty0;", "query", "Lzy11;", "<anonymous>", "(Lnty0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestViewController$enableTextSuggestInChat$1", f = "TextSuggestViewController.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TextSuggestViewController$enableTextSuggestInChat$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSuggestViewController$enableTextSuggestInChat$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextSuggestViewController$enableTextSuggestInChat$1 textSuggestViewController$enableTextSuggestInChat$1 = new TextSuggestViewController$enableTextSuggestInChat$1(this.this$0, continuation);
        textSuggestViewController$enableTextSuggestInChat$1.L$0 = obj;
        return textSuggestViewController$enableTextSuggestInChat$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextSuggestViewController$enableTextSuggestInChat$1) create((nty0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nty0 nty0Var = (nty0) this.L$0;
            if (nty0Var != null) {
                c cVar = this.this$0;
                String a = cVar.g.a();
                String str = cVar.h.q;
                com.yandex.messaging.internal.textsuggest.d dVar = cVar.c;
                upq0 upq0Var = new upq0(nty0Var.a, nty0Var.b, a, str);
                this.label = 1;
                if (dVar.a(upq0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
