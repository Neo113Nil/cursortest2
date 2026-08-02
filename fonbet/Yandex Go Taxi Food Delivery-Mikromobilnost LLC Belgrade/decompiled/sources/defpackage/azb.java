package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.clarifypoint.b;
import ru.yandex.taxi.persuggest.clarifypoints.a;

/* loaded from: classes6.dex */
public final class azb implements y880 {
    public final z880 a;
    public final b b;
    public final gqz0 c;
    public final ro0 d;

    public azb(z880 z880Var, b bVar, gqz0 gqz0Var, ro0 ro0Var) {
        this.a = z880Var;
        this.b = bVar;
        this.c = gqz0Var;
        this.d = ro0Var;
    }

    @Override // defpackage.y880
    public final void a(x880 x880Var) {
        if (this.d.a()) {
            x880Var.n();
            return;
        }
        boolean z = ((ppz0) this.c).a() instanceof wpz0;
        vbb vbbVar = new vbb(x880Var, this);
        b bVar = this.b;
        en11 en11Var = bVar.i;
        a aVar = bVar.f;
        yyb yybVar = (yyb) en11Var.b();
        pex0 m = ((k) bVar.c).m();
        if (m == null || !yybVar.b || ((vyb) aVar.d.getValue()).a.isEmpty() || !yybVar.c.contains(m.b)) {
            x880Var.n();
            return;
        }
        d0l0 c = bVar.d.c();
        Runnable d1Var = new d1(20, bVar, vbbVar, c);
        int i = kyh0.summary_confirm;
        Runnable runnable = d1Var;
        int i2 = i;
        for (gyb gybVar : ((vyb) aVar.d.getValue()).a) {
            int i3 = jyb.a[gybVar.a.ordinal()];
            if (i3 != 1) {
                if (i3 == 2 && c.b() != null && !z) {
                    Runnable nbbVar = new nbb(bVar, gybVar, i2, vbbVar, runnable);
                    i2 = kyh0.common_next;
                    runnable = nbbVar;
                }
            } else if (c.h() != null && !((com.yandex.go.clarify_address.before_order.a) bVar.h).b.c) {
                Runnable nbbVar2 = new nbb(bVar, gybVar, i2, vbbVar, runnable);
                i2 = kyh0.common_next;
                runnable = nbbVar2;
            }
        }
        runnable.run();
    }
}
