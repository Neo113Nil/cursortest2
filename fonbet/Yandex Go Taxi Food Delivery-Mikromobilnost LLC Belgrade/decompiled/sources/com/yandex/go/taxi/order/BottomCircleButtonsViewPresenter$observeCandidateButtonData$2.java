package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import defpackage.jl40;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class BottomCircleButtonsViewPresenter$observeCandidateButtonData$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DriverCandidate driverCandidate = (DriverCandidate) obj;
        DriverCandidate driverCandidate2 = (DriverCandidate) obj2;
        ((p) this.receiver).getClass();
        return Boolean.valueOf(driverCandidate == driverCandidate2 ? true : (driverCandidate == null || driverCandidate2 == null) ? false : jl40.l(driverCandidate.a, driverCandidate2.a));
    }
}
