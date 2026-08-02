package defpackage;

import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.address.map.AddressSelectorPinV1DataRepository$stateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class a71 extends y0c0 {
    public final AddressResolveRepository a;
    public final s6v b;
    public final g92 c;

    public a71(PointType pointType, r0c0 r0c0Var, AddressResolveRepository addressResolveRepository, s6v s6vVar) {
        this.a = addressResolveRepository;
        this.b = s6vVar;
        this.c = new g92(2, pointType.a() ? r0c0Var.g() : r0c0Var.a());
    }

    @Override // defpackage.y0c0
    public final tpr a() {
        return this.a.b;
    }

    @Override // defpackage.y0c0
    public final tpr b() {
        return this.b.a;
    }

    @Override // defpackage.y0c0
    public final tpr c() {
        return new g92(2, "");
    }

    @Override // defpackage.y0c0
    public final tpr d(tpr tprVar) {
        return e.X(tprVar, new AddressSelectorPinV1DataRepository$stateFlow$$inlined$flatMapLatest$1(null, this));
    }

    @Override // defpackage.y0c0
    public final tpr e() {
        return this.c;
    }

    @Override // defpackage.y0c0
    public final tpr f() {
        return new g92(2, Boolean.TRUE);
    }
}
