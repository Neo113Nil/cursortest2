package com.ybsdk.feature.card.internal.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.interactors.CardDetailsSettingsInteractor$provideVerificationToken$1$1", f = "CardDetailsSettingsInteractor.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsSettingsInteractor$provideVerificationToken$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ o8r0 $settingsItem;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsSettingsInteractor$provideVerificationToken$1$1(e eVar, o8r0 o8r0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$settingsItem = o8r0Var;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDetailsSettingsInteractor$provideVerificationToken$1$1(this.this$0, this.$settingsItem, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDetailsSettingsInteractor$provideVerificationToken$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            o8r0 o8r0Var = this.$settingsItem;
            String str = this.$verificationToken;
            this.label = 1;
            if (e.a(eVar, o8r0Var, str, this) == coroutineSingletons) {
                return coroutineSingletons;
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
