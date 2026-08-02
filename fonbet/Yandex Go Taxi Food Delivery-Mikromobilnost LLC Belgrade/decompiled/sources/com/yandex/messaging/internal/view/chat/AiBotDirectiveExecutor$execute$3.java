package com.yandex.messaging.internal.view.chat;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.internal.view.chat.AiBotDirectiveExecutor", f = "AiBotDirectiveExecutor.kt", l = {HProv.ALG_SID_GR3410_12_256, HProv.PROV_GOST_2001_DH, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_224}, m = "execute")
/* loaded from: classes15.dex */
final class AiBotDirectiveExecutor$execute$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotDirectiveExecutor$execute$3(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, null, null, null, this);
    }
}
