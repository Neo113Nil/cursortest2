package com.yandex.go.address.address_map_picker.pin;

import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import defpackage.b1c0;
import defpackage.e0c0;
import defpackage.g92;
import defpackage.r0c0;
import defpackage.tpr;
import defpackage.vtb0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes12.dex */
public final class g extends b1c0 {
    public final r0c0 a;
    public final vtb0 b;
    public final SourceOnMapControl.a c;
    public final SourceOnMapControl.a d = new SourceOnMapControl.a(e0c0.a, null, null, false, false, null, null, 1790);
    public final SourceOnMapControl.a e;
    public final f f;

    public g(r0c0 r0c0Var, AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository, vtb0 vtb0Var) {
        this.a = r0c0Var;
        this.b = vtb0Var;
        this.c = new SourceOnMapControl.a(r0c0Var.h(), null, null, false, false, null, null, 1790);
        this.e = new SourceOnMapControl.a(r0c0Var.d(), null, null, false, false, null, null, 2046);
        this.f = new f(addressMapPickerAddressStateRepository.c);
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new d(tprVar);
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        SourceOnMapControl.a aVar = this.c;
        ru.yandex.taxi.f fVar = (ru.yandex.taxi.f) this.b;
        f fVar2 = this.f;
        return new m0(fVar2, fVar.a(fVar2, aVar), new AddressMapPickerPinV2DataRepository$stateFlow$1(this, null));
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        return new g92(2, this.a.i());
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return new g92(2, Boolean.TRUE);
    }
}
