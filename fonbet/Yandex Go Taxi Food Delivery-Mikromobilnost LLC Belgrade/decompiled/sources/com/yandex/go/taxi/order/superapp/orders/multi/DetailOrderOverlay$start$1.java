package com.yandex.go.taxi.order.superapp.orders.multi;

import defpackage.an91;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.object.DriveState;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class DetailOrderOverlay$start$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DriveState driveState = (DriveState) obj;
        DriveState driveState2 = (DriveState) obj2;
        ((c) this.receiver).getClass();
        return Boolean.valueOf((an91.i(driveState) && an91.i(driveState2)) || driveState == driveState2);
    }
}
