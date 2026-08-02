package defpackage;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.shortcuts.impl.repository.j;
import com.yandex.go.superapp.order.multi.old.router.a;
import com.yandex.go.taxi.order.details.v2.navigation.d;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.superapp.orders.ui.b;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class ky70 implements gy70 {
    public final Lifecycle a;
    public final pav b;
    public final k48 c;
    public final tse d;
    public final k7x0 e;
    public final ney f;
    public final c g;
    public final j h;
    public final com.yandex.go.navigation.screen.c i;
    public final gpf0 j;
    public final iqz k;
    public final a l;
    public final cim m;
    public final v301 n;
    public final ru.yandex.taxi.apprate.common.domain.a o;
    public final yvf0 p;
    public final yvf0 q;
    public final rct0 r;
    public final f0 s;
    public final h3y t;
    public final d u;

    public ky70(Lifecycle lifecycle, pav pavVar, k48 k48Var, tse tseVar, k7x0 k7x0Var, ney neyVar, c cVar, j jVar, com.yandex.go.navigation.screen.c cVar2, gpf0 gpf0Var, iqz iqzVar, a aVar, cim cimVar, v301 v301Var, ru.yandex.taxi.apprate.common.domain.a aVar2, yvf0 yvf0Var, yvf0 yvf0Var2, rct0 rct0Var, f0 f0Var, h3y h3yVar, d dVar) {
        this.a = lifecycle;
        this.b = pavVar;
        this.c = k48Var;
        this.d = tseVar;
        this.e = k7x0Var;
        this.f = neyVar;
        this.g = cVar;
        this.h = jVar;
        this.i = cVar2;
        this.j = gpf0Var;
        this.k = iqzVar;
        this.l = aVar;
        this.m = cimVar;
        this.n = v301Var;
        this.o = aVar2;
        this.p = yvf0Var;
        this.q = yvf0Var2;
        this.r = rct0Var;
        this.s = f0Var;
        this.t = h3yVar;
        this.u = dVar;
    }

    @Override // defpackage.gy70
    public final List a(String str, m601 m601Var, w301 w301Var) {
        v301 v301Var = this.n;
        v301Var.getClass();
        zxs zxsVar = new zxs(qoi0.a(x301.class), esh0.order_card_item_common, EmptyList.a, new rmy0(18, w301Var, v301Var));
        int i = bek0.U;
        zxs zxsVar2 = new zxs(ur00.class, new jdk0(5), new odf0(29, this.u));
        int i2 = b.p1;
        final hy70 hy70Var = new hy70(this, m601Var, str);
        final iy70 iy70Var = new iy70(this, m601Var, str);
        final jy70 jy70Var = new jy70(this, m601Var, str);
        final jy70 jy70Var2 = new jy70(this, m601Var, str);
        final jy70 jy70Var3 = new jy70(this, m601Var, str);
        final qa0 qa0Var = new qa0(14, this.l);
        final f2z f2zVar = (f2z) this.p.get();
        s5o s5oVar = new s5o(null);
        int i3 = zkh0.order_list_item_taxi;
        List singletonList = Collections.singletonList(s5oVar);
        final tse tseVar = this.d;
        final pav pavVar = this.b;
        final ru.yandex.taxi.apprate.common.domain.a aVar = this.o;
        final yvf0 yvf0Var = this.q;
        final k48 k48Var = this.c;
        final c cVar = this.g;
        final k7x0 k7x0Var = this.e;
        final cim cimVar = this.m;
        final rct0 rct0Var = this.r;
        final j jVar = this.h;
        final iqz iqzVar = this.k;
        final f0 f0Var = this.s;
        final Lifecycle lifecycle = this.a;
        final ney neyVar = this.f;
        final gpf0 gpf0Var = this.j;
        final com.yandex.go.navigation.screen.c cVar2 = this.i;
        final h3y h3yVar = this.t;
        return scc.g(zxsVar, zxsVar2, new zxs(tr00.class, i3, singletonList, new tls() { // from class: s7y0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return new b((View) obj, tse.this, pavVar, hy70Var, iy70Var, jy70Var, jy70Var3, jy70Var2, aVar, (htc) yvf0Var.get(), k48Var, cVar, k7x0Var, cimVar, rct0Var, jVar, iqzVar, f0Var, lifecycle, neyVar, gpf0Var, cVar2, qa0Var, h3yVar, f2zVar);
            }
        }));
    }
}
