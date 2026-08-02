package defpackage;

import ru.yandex.taxi.fragment.preorder.e;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes5.dex */
public final class ey0 implements up50 {
    public final kx0 a;
    public final xx0 b;
    public final e c;
    public final dy0 d;
    public boolean e;

    public ey0(kx0 kx0Var, xx0 xx0Var, e eVar, dy0 dy0Var) {
        this.a = kx0Var;
        this.b = xx0Var;
        this.c = eVar;
        this.d = dy0Var;
    }

    @Override // defpackage.up50
    public final void a() {
        c();
    }

    @Override // defpackage.up50
    public final void b() {
        c();
    }

    public final void c() {
        if (this.e && ((Boolean) this.a.invoke()).booleanValue() && !gtq0.u(this.b.k)) {
            this.e = false;
            this.c.b(((gh00) this.d.a).e.b(), "auto", null, PositionInitAction.MAP);
        }
    }
}
