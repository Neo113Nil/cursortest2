package com.yandex.go.chargers.passes.payment_settings;

import com.yandex.go.chargers.passes.data.ChargersPassesPaymentSettingsResponseDto;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oka;
import defpackage.zha;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "", "isLoading", "Loka;", TarifficatorScenarioActivity.RESULT_KEY, "Lyha;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;ZLoka;)Lyha;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.payment_settings.ChargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1", f = "ChargersPassesPaymentSettingsUiStateInteractor.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1 extends SuspendLambda implements bms {
    final /* synthetic */ String $passId;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ zha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1(zha zhaVar, String str, Continuation continuation) {
        super(4, continuation);
        this.this$0 = zhaVar;
        this.$passId = str;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ChargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1 chargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1 = new ChargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1(this.this$0, this.$passId, (Continuation) obj4);
        chargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1.Z$0 = booleanValue;
        chargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1.L$0 = (oka) obj3;
        return chargersPassesPaymentSettingsUiStateInteractor$getUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        oka okaVar = (oka) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0.d;
        String str = this.$passId;
        ChargersPassesPaymentSettingsResponseDto chargersPassesPaymentSettingsResponseDto = okaVar.a;
        this.L$0 = null;
        this.Z$0 = z;
        this.label = 1;
        Object a = eVar.a(str, chargersPassesPaymentSettingsResponseDto, z, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
