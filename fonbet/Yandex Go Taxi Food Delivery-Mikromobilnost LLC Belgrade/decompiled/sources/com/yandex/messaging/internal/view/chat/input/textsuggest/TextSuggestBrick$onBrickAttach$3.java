package com.yandex.messaging.internal.view.chat.input.textsuggest;

import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ai91;
import defpackage.ity0;
import defpackage.jty0;
import defpackage.kty0;
import defpackage.lz;
import defpackage.mty0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oty0;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljty0;", "suggest", "Lzy11;", "<anonymous>", "(Ljty0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestBrick$onBrickAttach$3", f = "TextSuggestBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TextSuggestBrick$onBrickAttach$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSuggestBrick$onBrickAttach$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextSuggestBrick$onBrickAttach$3 textSuggestBrick$onBrickAttach$3 = new TextSuggestBrick$onBrickAttach$3(this.this$0, continuation);
        textSuggestBrick$onBrickAttach$3.L$0 = obj;
        return textSuggestBrick$onBrickAttach$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TextSuggestBrick$onBrickAttach$3 textSuggestBrick$onBrickAttach$3 = (TextSuggestBrick$onBrickAttach$3) create((jty0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        textSuggestBrick$onBrickAttach$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        mty0 mty0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jty0 jty0Var = (jty0) this.L$0;
        if (jty0Var != null) {
            ArrayList<ity0> arrayList = jty0Var.a;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (ity0 ity0Var : arrayList) {
                arrayList2.add(new oty0(ity0Var.a, ity0Var.b));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                mty0Var = new mty0(arrayList2);
            }
        }
        if (mty0Var == null || !(!mty0Var.a.isEmpty())) {
            this.this$0.r();
        } else {
            a aVar = this.this$0;
            kty0 kty0Var = aVar.c;
            kty0Var.w = mty0Var;
            kty0Var.notifyDataSetChanged();
            if (!aVar.q().isShown()) {
                ai91.f(aVar.q(), false);
            }
            RecyclerView recyclerView = aVar.B;
            OneShotPreDrawListener.add(recyclerView, new lz(27, recyclerView, aVar, mty0Var));
        }
        return zy11.a;
    }
}
