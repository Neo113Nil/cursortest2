package com.yandex.go.tariffcard.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardHeaderPriceFactory", f = "TariffOptionsCardHeaderPriceFactory.kt", l = {HProv.PP_EXPORT_CSP}, m = "getPriceWithDescription", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardHeaderPriceFactory$getPriceWithDescription$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, null, false, false, null, null, this);
    }
}
