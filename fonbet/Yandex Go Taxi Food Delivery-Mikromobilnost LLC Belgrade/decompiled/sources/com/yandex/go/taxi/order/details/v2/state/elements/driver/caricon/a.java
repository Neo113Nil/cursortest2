package com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon;

import com.yandex.go.taxi.order.models.api.response.driver.CarImageDto;
import defpackage.rol0;

/* loaded from: classes14.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public final rol0 a(CarImageDto carImageDto, RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType) {
        return new rol0(new RideCardDriverCarIconDataSource$collectCarIconState$1(this, carImageDto, rideCardDriverCarIconRepository$DriverCarType, null));
    }
}
