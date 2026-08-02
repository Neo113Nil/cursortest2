package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.multi.shortcuts.f;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes8.dex */
public final class f680 implements h1s0 {
    public final f a;
    public final r55 b;

    public f680(f fVar, r55 r55Var) {
        this.a = fVar;
        this.b = r55Var;
    }

    @Override // defpackage.h1s0
    public final void a(pv0 pv0Var, Address address) {
        this.b.d(pv0Var, PointType.DESTINATION);
    }

    @Override // defpackage.h1s0
    public final void b(k9s0 k9s0Var) {
        this.a.b(k9s0.f, null, false);
    }

    @Override // defpackage.h1s0
    public final void c(Address address) {
        f fVar = this.a;
        fnx0 l = ((k) fVar.d).l();
        if (l != null) {
            fVar.h.a(new gnx0(new fnx0(l.c, l.d, SelectionOrigin.SHORTCUT), true));
        }
        ((a7t0) fVar.e).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
        fVar.d(address, fVar.k.d());
    }
}
