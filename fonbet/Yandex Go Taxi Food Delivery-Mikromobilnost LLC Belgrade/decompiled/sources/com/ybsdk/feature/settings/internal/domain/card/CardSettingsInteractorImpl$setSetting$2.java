package com.ybsdk.feature.settings.internal.domain.card;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Layp0;", "", "Lo8r0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.domain.card.CardSettingsInteractorImpl$setSetting$2", f = "CardSettingsInteractorImpl.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardSettingsInteractorImpl$setSetting$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ o8r0 $item;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSettingsInteractorImpl$setSetting$2(a aVar, boolean z, o8r0 o8r0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$isChecked = z;
        this.$item = o8r0Var;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardSettingsInteractorImpl$setSetting$2 cardSettingsInteractorImpl$setSetting$2 = new CardSettingsInteractorImpl$setSetting$2(this.this$0, this.$isChecked, this.$item, this.$verificationToken, continuation);
        cardSettingsInteractorImpl$setSetting$2.L$0 = obj;
        return cardSettingsInteractorImpl$setSetting$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardSettingsInteractorImpl$setSetting$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.settings.internal.data.a aVar = this.this$0.a;
            boolean z = this.$isChecked;
            o8r0 o8r0Var = this.$item;
            String str2 = this.$verificationToken;
            this.label = 1;
            a = aVar.a(z, o8r0Var, str, str2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
