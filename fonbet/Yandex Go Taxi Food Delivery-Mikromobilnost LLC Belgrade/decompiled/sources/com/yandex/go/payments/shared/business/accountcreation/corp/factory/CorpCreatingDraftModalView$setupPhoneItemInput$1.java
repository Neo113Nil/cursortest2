package com.yandex.go.payments.shared.business.accountcreation.corp.factory;

import defpackage.hnr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wue;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemInputComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView$setupPhoneItemInput$1", f = "CorpCreatingDraftModalView.kt", l = {252}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class CorpCreatingDraftModalView$setupPhoneItemInput$1 extends SuspendLambda implements wls {
    final /* synthetic */ ListItemInputComponent $phoneItemInput;
    int label;
    final /* synthetic */ CorpCreatingDraftModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpCreatingDraftModalView$setupPhoneItemInput$1(ListItemInputComponent listItemInputComponent, CorpCreatingDraftModalView corpCreatingDraftModalView, Continuation continuation) {
        super(2, continuation);
        this.$phoneItemInput = listItemInputComponent;
        this.this$0 = corpCreatingDraftModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorpCreatingDraftModalView$setupPhoneItemInput$1(this.$phoneItemInput, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CorpCreatingDraftModalView$setupPhoneItemInput$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            hnr0 textFocusFlow = this.$phoneItemInput.textFocusFlow();
            wue wueVar = new wue(this.this$0, 3);
            this.label = 1;
            if (textFocusFlow.collect(wueVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}
