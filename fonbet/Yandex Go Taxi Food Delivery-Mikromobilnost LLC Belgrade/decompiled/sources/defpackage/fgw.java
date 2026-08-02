package defpackage;

import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Clarification;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Coordinates;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.c;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.d;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.e;

/* loaded from: classes8.dex */
public final class fgw {
    public static pnw a(e eVar) {
        if (eVar instanceof AddressDto$Coordinates) {
            AddressDto$Coordinates addressDto$Coordinates = (AddressDto$Coordinates) eVar;
            return new nnw(((Number) addressDto$Coordinates.getA().get(0)).doubleValue(), ((Number) addressDto$Coordinates.getA().get(1)).doubleValue());
        }
        if (eVar instanceof AddressDto$Clarification) {
            return new onw(((AddressDto$Clarification) eVar).getA());
        }
        if (!(eVar instanceof c) && !jl40.l(eVar, d.INSTANCE)) {
            w511.b();
        }
        return null;
    }
}
