package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public interface isd extends sy60 {
    void X0(boolean z, dw1 dw1Var);

    void h(PointType pointType, Address address, pv0 pv0Var);

    void o(String str);

    default void x0(pv0 pv0Var, PointType pointType) {
        h(pointType, pv0Var != null ? pv0Var.a : null, pv0Var);
    }
}
