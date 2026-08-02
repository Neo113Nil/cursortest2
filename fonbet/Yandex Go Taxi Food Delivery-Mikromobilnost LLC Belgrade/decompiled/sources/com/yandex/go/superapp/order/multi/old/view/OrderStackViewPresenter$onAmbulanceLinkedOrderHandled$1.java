package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderStackViewPresenter$onAmbulanceLinkedOrderHandled$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        f fVar = (f) this.receiver;
        fVar.M.a0(fVar);
        fVar.k0 = null;
        fVar.Og(DetailsOpenReason.LINKED_ORDER);
        return zy11.a;
    }
}
