package com.yandex.go.chargers.passes.payment_settings;

import defpackage.agd;
import defpackage.jha;
import defpackage.mvg;
import defpackage.nha;
import defpackage.ny61;
import defpackage.oha;
import defpackage.tse;
import defpackage.vha;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.payment_settings.ChargersPassesPaymentSettingsRouter$content$1$1$1", f = "ChargersPassesPaymentSettingsRouter.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesPaymentSettingsRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ vha $action;
    final /* synthetic */ nha $navigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ oha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesPaymentSettingsRouter$content$1$1$1(oha ohaVar, yfd yfdVar, vha vhaVar, nha nhaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ohaVar;
        this.$this_buildContent = yfdVar;
        this.$action = vhaVar;
        this.$navigator = nhaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPassesPaymentSettingsRouter$content$1$1$1(this.this$0, this.$this_buildContent, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPassesPaymentSettingsRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.L;
            String str = ((jha) ((agd) this.$this_buildContent).a).a;
            vha vhaVar = this.$action;
            nha nhaVar = this.$navigator;
            this.label = 1;
            if (dVar.c(str, vhaVar, nhaVar, this) == coroutineSingletons) {
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
