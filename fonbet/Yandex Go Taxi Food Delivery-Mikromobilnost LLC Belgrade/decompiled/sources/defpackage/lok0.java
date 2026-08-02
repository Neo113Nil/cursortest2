package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.preorder.lifecycle.m;
import com.yandex.go.route.interactor.b;
import com.yandex.go.shortcuts.impl.interactors.n;
import com.yandex.go.taxi.order.details.v2.state.elements.timeline.options.a;
import com.yandex.go.timer.k;
import com.yandex.messaging.input.f;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import ru.yandex.taxi.experiments.superapp.i;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.preorder.summary.solid.interactors.p0;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.domain.e;
import ru.yandex.taxi.scooters.domain.l;
import ru.yandex.taxi.scooters.domain.p;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class lok0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public /* synthetic */ lok0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.h;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.c;
        xvf0 xvf0Var7 = this.b;
        switch (i) {
            case 0:
                return new a((c) xvf0Var7.get(), (xdf) xvf0Var6.get(), (k7x0) xvf0Var5.get(), (k) xvf0Var.get(), (crg) xvf0Var4.get(), (mok0) xvf0Var3.get(), (o2y0) xvf0Var2.get());
            case 1:
                return new l((tse) xvf0Var7.get(), (nyn0) xvf0Var6.get(), (pqm0) xvf0Var5.get(), this.e, (g) xvf0Var4.get(), (v5o0) xvf0Var3.get(), (kyn0) xvf0Var2.get());
            case 2:
                return new ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.g((qwo0) xvf0Var7.get(), (p) xvf0Var6.get(), (u) xvf0Var5.get(), (h) xvf0Var.get(), (e) xvf0Var4.get(), (p8p0) xvf0Var3.get(), (d) xvf0Var2.get());
            case 3:
                return new f((SharedPreferences) xvf0Var7.get(), (vse) xvf0Var6.get(), (com.yandex.messaging.internal.view.input.c) xvf0Var5.get(), (Mesix) xvf0Var.get(), (Activity) xvf0Var4.get(), i5m.a(xvf0Var3), (wy31) xvf0Var2.get());
            case 4:
                return new i((com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var7.get(), (com.yandex.go.navigation.screen.c) xvf0Var6.get(), (ru.yandex.taxi.experiments.superapp.a) xvf0Var5.get(), (abf0) xvf0Var.get(), (n) xvf0Var4.get(), (sm40) xvf0Var3.get(), (t9f0) xvf0Var2.get());
            case 5:
                return new m((ah00) xvf0Var7.get(), (tt2) xvf0Var6.get(), (qy41) xvf0Var5.get(), (s8z) xvf0Var.get(), (b) xvf0Var4.get(), (ru.yandex.taxi.preorder.source.domain.a) xvf0Var3.get(), (ru.yandex.taxi.search.suggest.i) xvf0Var2.get());
            case 6:
                return new kjt0((ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var7.get(), (com.yandex.go.route.interactor.c) xvf0Var6.get(), (tit0) xvf0Var5.get(), (ru.yandex.taxi.e) xvf0Var.get(), (r) xvf0Var4.get(), (s) xvf0Var3.get(), (xvw) xvf0Var2.get());
            case 7:
                return new m6w0((dr00) xvf0Var7.get(), (ry70) xvf0Var6.get(), (l1t) xvf0Var5.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var.get(), (n6w0) xvf0Var4.get(), (y980) xvf0Var3.get(), (com.yandex.go.taxi.order.view.l) xvf0Var2.get());
            case 8:
                return new com.yandex.go.taxi.order.tariff_upgrade.domain.l((pav) xvf0Var7.get(), (com.yandex.go.zone.interactors.b) xvf0Var6.get(), (ru.yandex.taxi.yaplus.b) xvf0Var5.get(), (tt2) xvf0Var.get(), (k7x0) xvf0Var4.get(), (jgv) xvf0Var3.get(), (npx0) xvf0Var2.get());
            case 9:
                return new p0((wiq0) xvf0Var7.get(), (arv0) xvf0Var6.get(), (c4r0) xvf0Var5.get(), (b8r) xvf0Var.get(), (c8r) xvf0Var4.get(), (ck31) xvf0Var3.get(), (tt2) xvf0Var2.get());
            default:
                return new com.yandex.go.taxi.summary.mobilityhub.mapper.d((Context) xvf0Var7.get(), (pdc) xvf0Var6.get(), (k7x0) xvf0Var5.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var.get(), (xdf) xvf0Var4.get(), (c) xvf0Var3.get(), (zuj0) xvf0Var2.get());
        }
    }
}
