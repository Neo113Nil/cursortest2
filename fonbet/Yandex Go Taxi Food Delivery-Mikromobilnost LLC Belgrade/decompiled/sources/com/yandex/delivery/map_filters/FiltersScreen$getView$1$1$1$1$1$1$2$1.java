package com.yandex.delivery.map_filters;

import defpackage.mrw;
import defpackage.q9i;
import defpackage.sls;
import defpackage.t9i;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.ndd_route_selector.view.filters.DeliveryFilterModalView;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class FiltersScreen$getView$1$1$1$1$1$1$2$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        t9i t9iVar;
        Object value;
        com.yandex.delivery.map_filters.ui.a aVar = (com.yandex.delivery.map_filters.ui.a) this.receiver;
        q9i q9iVar = aVar.b;
        List list = (List) ((mrw) aVar.c).b.getValue();
        DeliveryFilterModalView deliveryFilterModalView = q9iVar.a;
        t9iVar = deliveryFilterModalView.presenter;
        r0 r0Var = t9iVar.x.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, list));
        deliveryFilterModalView.onBackPressed();
        return zy11.a;
    }
}
