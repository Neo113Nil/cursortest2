package com.yandex.go.chargers.passes.payment_settings;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.zha;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.payment_settings.ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1", f = "ChargersPassesPaymentSettingsUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $passId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ zha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1(zha zhaVar, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = zhaVar;
        this.$passId$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1 chargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1 = new ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1(this.this$0, this.$passId$inlined, (Continuation) obj3);
        chargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        chargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return chargersPassesPaymentSettingsUiStateInteractor$settingsFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 rol0Var = new rol0(new ChargersPassesPaymentSettingsUiStateInteractor$settingsFlow$1$1(this.this$0, this.$passId$inlined, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(rol0Var, vprVar, this) == coroutineSingletons) {
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
