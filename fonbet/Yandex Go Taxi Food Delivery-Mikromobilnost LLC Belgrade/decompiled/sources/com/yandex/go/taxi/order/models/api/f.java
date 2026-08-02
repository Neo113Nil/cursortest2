package com.yandex.go.taxi.order.models.api;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.a3y0;
import defpackage.gyt0;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class f {
    public static TaxiOrder a(Preorder preorder, String str, DriveState driveState, long j, String str2) {
        if (str.length() == 0) {
            a3y0.d(TaxiOrder.m, "create", new IllegalArgumentException("orderId should not be empty"), null, 4);
        }
        TaxiOrder taxiOrder = new TaxiOrder(str, preorder.clone(), j, 4088);
        taxiOrder.T(driveState);
        synchronized (taxiOrder) {
            TaxiOrderOverrides taxiOrderOverrides = taxiOrder.h;
            taxiOrderOverrides.getClass();
            taxiOrder.h = TaxiOrderOverrides.a(taxiOrderOverrides, null, null, str2, 3);
        }
        synchronized (taxiOrder) {
            taxiOrder.l = taxiOrder.l.A((taxiOrder.I() || taxiOrder.G()) ? false : true);
        }
        taxiOrder.Y(new gyt0(28, taxiOrder, preorder));
        taxiOrder.Z(preorder.G);
        return taxiOrder;
    }

    public static /* synthetic */ TaxiOrder b(f fVar, Preorder preorder, String str, DriveState driveState, long j, int i) {
        if ((i & 2) != 0) {
            str = "preorder";
        }
        String str2 = str;
        if ((i & 4) != 0) {
            driveState = DriveState.PREORDER;
        }
        DriveState driveState2 = driveState;
        if ((i & 8) != 0) {
            j = System.currentTimeMillis();
        }
        fVar.getClass();
        return a(preorder, str2, driveState2, j, null);
    }

    public final KSerializer serializer() {
        return TaxiOrder$$serializer.INSTANCE;
    }
}
