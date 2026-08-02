package com.yandex.go.address_confirmation;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.address_confirmation.SourceAddressConfirmationPinV2DataRepository", f = "SourceAddressConfirmationPinV2DataRepository.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "createLoadedState", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationPinV2DataRepository$createLoadedState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationPinV2DataRepository$createLoadedState$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.e(this.this$0, false, null, this);
    }
}
