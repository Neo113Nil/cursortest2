package com.yandex.go.chargers.discounts.data.mappers;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.discounts.data.mappers.ChargersDiscountsItemMapper", f = "ChargersDiscountsItemMapper.kt", l = {35, 36, 37, 44, 46, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56, 58, 69, 71, 74, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_KECCAK_256, HProv.PP_RESERVED1, 112, 113, 114, 119}, m = PolicyMappingsExtension.MAP, v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountsItemMapper$map$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
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
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountsItemMapper$map$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
