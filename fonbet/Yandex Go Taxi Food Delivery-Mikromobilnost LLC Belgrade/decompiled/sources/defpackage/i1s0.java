package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class i1s0 implements h1s0 {
    public final i61 a;
    public final yb00 b;

    public i1s0(i61 i61Var, yb00 yb00Var) {
        this.a = i61Var;
        this.b = yb00Var;
    }

    @Override // defpackage.h1s0
    public final void a(pv0 pv0Var, Address address) {
        this.a.la(PointType.DESTINATION, address, pv0Var, false);
    }

    @Override // defpackage.h1s0
    public final void b(k9s0 k9s0Var) {
        this.b.b(k9s0Var);
    }

    @Override // defpackage.h1s0
    public final void c(Address address) {
        this.b.a(SelectionOrigin.SHORTCUT, false, true);
    }
}
