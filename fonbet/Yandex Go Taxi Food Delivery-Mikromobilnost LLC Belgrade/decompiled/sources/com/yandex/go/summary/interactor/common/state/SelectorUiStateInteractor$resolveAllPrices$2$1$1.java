package com.yandex.go.summary.interactor.common.state;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob5;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "Lob5;", "", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$resolveAllPrices$2$1$1", f = "SelectorUiStateInteractor.kt", l = {377}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$resolveAllPrices$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $formattedText;
    final /* synthetic */ ob5 $key;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$resolveAllPrices$2$1$1(ob5 ob5Var, c cVar, FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.$key = ob5Var;
        this.this$0 = cVar;
        this.$formattedText = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectorUiStateInteractor$resolveAllPrices$2$1$1(this.$key, this.this$0, this.$formattedText, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorUiStateInteractor$resolveAllPrices$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ob5 ob5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ob5 ob5Var2 = this.$key;
            c cVar = this.this$0;
            FormattedText formattedText = this.$formattedText;
            this.L$0 = ob5Var2;
            this.label = 1;
            Object l = cVar.l(formattedText, this);
            if (l == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = l;
            ob5Var = ob5Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ob5Var = (ob5) this.L$0;
            kotlin.b.b(obj);
        }
        return new Pair(ob5Var, obj);
    }
}
