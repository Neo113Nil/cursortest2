package com.yandex.passport.data.network;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.data.network.RegisterPhonishRequest$RequestFactory", f = "RegisterPhonishRequest.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "createRequest")
/* loaded from: classes15.dex */
final class RegisterPhonishRequest$RequestFactory$createRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterPhonishRequest$RequestFactory$createRequest$1(cb cbVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
