package com.yandex.plus.core.network.okhttp.interceptor;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.core.network.okhttp.interceptor.CombinedOkHttpNetworkCallInterceptor", f = "OkHttpNetworkCallInterceptor.kt", l = {HProv.PROV_GOST_2001_DH, CalendarDayView.DISABLED_DAY_ALPHA}, m = "interceptCall")
/* loaded from: classes2.dex */
final class CombinedOkHttpNetworkCallInterceptor$interceptCall$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedOkHttpNetworkCallInterceptor$interceptCall$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
