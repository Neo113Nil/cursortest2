package com.yandex.dsl.views;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.dsl.views.TextViewKt$onTextChange$1$onTextChanged$1", f = "textView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class TextViewKt$onTextChange$1$onTextChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ CharSequence $s;
    final /* synthetic */ tls $textListener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewKt$onTextChange$1$onTextChanged$1(tls tlsVar, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.$textListener = tlsVar;
        this.$s = charSequence;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextViewKt$onTextChange$1$onTextChanged$1(this.$textListener, this.$s, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TextViewKt$onTextChange$1$onTextChanged$1 textViewKt$onTextChange$1$onTextChanged$1 = (TextViewKt$onTextChange$1$onTextChanged$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        textViewKt$onTextChange$1$onTextChanged$1.invokeSuspend(zy11Var);
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
        this.$textListener.invoke(this.$s);
        return zy11.a;
    }
}
