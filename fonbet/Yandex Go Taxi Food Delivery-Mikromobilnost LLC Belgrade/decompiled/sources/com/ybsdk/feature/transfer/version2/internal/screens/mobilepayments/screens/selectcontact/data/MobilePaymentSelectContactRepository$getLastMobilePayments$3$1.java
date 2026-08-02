package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.GetLastMobilePaymentsResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments.MobilePaymentDto;
import defpackage.ssx;
import defpackage.tcc;
import defpackage.tsx;
import defpackage.wls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class MobilePaymentSelectContactRepository$getLastMobilePayments$3$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((a) this.receiver).getClass();
        List<MobilePaymentDto> items = ((GetLastMobilePaymentsResponse) obj).getItems();
        ArrayList arrayList = new ArrayList(tcc.n(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new ssx(((MobilePaymentDto) it.next()).getPhone()));
        }
        return new tsx(arrayList);
    }
}
