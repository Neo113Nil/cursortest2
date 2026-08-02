package com.yandex.messaging.internal.view.chat.input.textsuggest;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.mvg;
import defpackage.nty0;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnty0;", "query", "", BackendConfig.Restrictions.ENABLED, "<anonymous>", "(Lnty0;Z)Lnty0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestInput$queryFlow$1", f = "TextSuggestInput.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TextSuggestInput$queryFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        TextSuggestInput$queryFlow$1 textSuggestInput$queryFlow$1 = new TextSuggestInput$queryFlow$1(3, (Continuation) obj3);
        textSuggestInput$queryFlow$1.L$0 = (nty0) obj;
        textSuggestInput$queryFlow$1.Z$0 = booleanValue;
        return textSuggestInput$queryFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        nty0 nty0Var = (nty0) this.L$0;
        boolean z = this.Z$0;
        if (nty0Var == null || !z) {
            return null;
        }
        return nty0Var;
    }
}
