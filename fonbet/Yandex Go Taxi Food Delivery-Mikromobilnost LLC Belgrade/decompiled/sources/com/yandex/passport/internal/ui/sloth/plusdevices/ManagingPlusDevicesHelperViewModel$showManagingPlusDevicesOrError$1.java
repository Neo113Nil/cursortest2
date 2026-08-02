package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperViewModel", f = "ManagingPlusDevicesHelperViewModel.kt", l = {HProv.PROV_GOST_2001_DH, HProv.ALG_SID_KECCAK_224, 91}, m = "showManagingPlusDevicesOrError")
/* loaded from: classes2.dex */
final class ManagingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return m.W(this.this$0, null, this);
    }
}
