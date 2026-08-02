package com.yandex.go.chargers.passes.payment_settings;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.passes.payment_settings.ChargersPassesPaymentSettingsUiActionInteractor", f = "ChargersPassesPaymentSettingsUiActionInteractor.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_NO_HASH}, m = "enableAutoRenew", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
