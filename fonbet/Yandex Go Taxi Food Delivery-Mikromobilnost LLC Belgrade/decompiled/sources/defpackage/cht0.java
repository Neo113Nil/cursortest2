package defpackage;

import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes13.dex */
public final class cht0 {
    public final vvx0 a;
    public final uq40 b;
    public final AddressResolveRepository c;
    public final net0 d;
    public final biv0 e;
    public final yit0 f;
    public final v g;
    public final jev0 h;
    public final ou7 i;
    public final kqv0 j;
    public final e k;
    public final uet0 l;

    public cht0(vvx0 vvx0Var, uq40 uq40Var, AddressResolveRepository addressResolveRepository, net0 net0Var, biv0 biv0Var, yit0 yit0Var, v vVar, jev0 jev0Var, ou7 ou7Var, kqv0 kqv0Var, e eVar, uet0 uet0Var) {
        this.a = vvx0Var;
        this.b = uq40Var;
        this.c = addressResolveRepository;
        this.d = net0Var;
        this.e = biv0Var;
        this.f = yit0Var;
        this.g = vVar;
        this.h = jev0Var;
        this.i = ou7Var;
        this.j = kqv0Var;
        this.k = eVar;
        this.l = uet0Var;
    }

    public final void a() {
        ou7 ou7Var = this.i;
        if (ou7Var.b() || !ou7Var.a()) {
            this.l.a();
            return;
        }
        jpv0 b = this.e.b();
        b.getClass();
        if (b instanceof hpv0) {
            return;
        }
        this.j.a();
        this.f.c(bov0.e);
        this.k.f();
    }
}
