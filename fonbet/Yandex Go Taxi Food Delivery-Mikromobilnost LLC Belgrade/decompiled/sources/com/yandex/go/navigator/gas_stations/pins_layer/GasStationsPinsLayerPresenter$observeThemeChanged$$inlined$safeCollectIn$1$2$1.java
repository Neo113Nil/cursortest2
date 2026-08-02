package com.yandex.go.navigator.gas_stations.pins_layer;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.pins_layer.GasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2", f = "GasStationsPinsLayerPresenter.kt", l = {99, 109, HProv.PP_PASSWD_TERM}, m = "emit", v = 2)
/* loaded from: classes12.dex */
public final class GasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1(e eVar, Continuation continuation) {
        super(continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
