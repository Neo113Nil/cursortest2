package com.yandex.go.chargers.passes.payment_settings;

import defpackage.iha;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oha;
import defpackage.tse;
import defpackage.uha;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.payment_settings.ChargersPassesPaymentSettingsRouter$InnerNavigator$refresh$1", f = "ChargersPassesPaymentSettingsRouter.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesPaymentSettingsRouter$InnerNavigator$refresh$1 extends SuspendLambda implements wls {
    final /* synthetic */ iha $navigator;
    final /* synthetic */ String $passId;
    int label;
    final /* synthetic */ oha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesPaymentSettingsRouter$InnerNavigator$refresh$1(oha ohaVar, String str, iha ihaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ohaVar;
        this.$passId = str;
        this.$navigator = ihaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPassesPaymentSettingsRouter$InnerNavigator$refresh$1(this.this$0, this.$passId, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPassesPaymentSettingsRouter$InnerNavigator$refresh$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.L;
            String str = this.$passId;
            iha ihaVar = this.$navigator;
            this.label = 1;
            if (dVar.c(str, uha.a, ihaVar, this) == coroutineSingletons) {
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
