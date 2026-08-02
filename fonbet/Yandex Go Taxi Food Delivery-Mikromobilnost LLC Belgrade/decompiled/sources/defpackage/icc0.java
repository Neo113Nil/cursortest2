package defpackage;

import android.content.Context;
import com.yandex.go.flex.main_screen.data.widgets.plaque.b;
import com.yandex.go.payments.data.p;
import com.yandex.go.places.experiments.map.pin_war_v2.n;
import com.yandex.go.places.experiments.map.pin_war_v2.o;
import com.yandex.go.places.searchbar.impl.domain.a;
import com.yandex.go.places.searchbar.impl.experiments.c;
import com.yandex.messaging.profile.e;
import com.ybsdk.feature.qr.api.data.QrApi;
import java.io.File;
import ru.yandex.taxi.layers.presentation.i;
import ru.yandex.taxi.layers.source.l;
import ru.yandex.taxi.layers.source.m;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes8.dex */
public final class icc0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ icc0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.c;
        switch (i) {
            case 0:
                return new hcc0((oep0) xvf0Var.get(), (ea0) xvf0Var2);
            case 1:
                return new o((rqo) xvf0Var.get(), (n) ((g970) xvf0Var2).get());
            case 2:
                return new a((c) ((i0b0) xvf0Var2).get(), (w66) xvf0Var.get());
            case 3:
                return new rfc0((rsn0) xvf0Var2, (oep0) xvf0Var.get());
            case 4:
                return new ogc0((oep0) xvf0Var.get(), (rk21) xvf0Var2);
            case 5:
                return new b((ip11) ((a3g) xvf0Var).get(), (m9a0) xvf0Var2);
            case 6:
                return new euc0((buc0) xvf0Var.get(), (icc0) xvf0Var2);
            case 7:
                return new i1d0((xh) xvf0Var2, (fx60) xvf0Var.get());
            case 8:
                return new z2e0((tt2) ((m2g) xvf0Var).get(), (ysd0) ((n3w) xvf0Var2).a);
            case 9:
                return new m((l) ((zp60) xvf0Var2).get(), (zyx) xvf0Var.get());
            case 10:
                return new i((ah00) ((m2g) xvf0Var).get(), (k5e0) ((xyd0) xvf0Var2).get());
            case 11:
                return new ru.yandex.taxi.layers.source.o((ru.yandex.taxi.layers.source.n) ((zp60) xvf0Var2).get(), (zyx) xvf0Var.get());
            case 12:
                return new dae0((yo40) ((n4g0) xvf0Var2).get(), (xzq0) xvf0Var.get());
            case 13:
                return new epe0((o61) ((tl3) xvf0Var).get(), (dho) ((kgn) xvf0Var2).get());
            case 14:
                return new com.yandex.go.splash.preload.c((Context) xvf0Var.get(), (com.yandex.go.splash.preload.a) ((dld0) xvf0Var2).get());
            case 15:
                return new kjz(26, (g) xvf0Var.get(), (p) ((swo0) xvf0Var2).get());
            case 16:
                return new q9f0((lx4) xvf0Var.get(), (cug) ((edf0) xvf0Var2).get());
            case 17:
                Context context = (Context) ((i5g) xvf0Var2).get();
                oy2 oy2Var = (oy2) xvf0Var.get();
                File file = new File(context.getCacheDir(), "superprofile");
                new jq90();
                kotlinx.serialization.modules.a aVar = new kotlinx.serialization.modules.a();
                s8o.Q(aVar);
                return new flex.network.cache.a(oy2Var, file, file, tje.a(sbx.d, new weu(20, aVar.a())));
            case 18:
                return new com.yandex.messaging.profile.g((e) xvf0Var.get(), (am2) ((nf) xvf0Var2).get());
            case 19:
                return new com.yandex.go.profile.domain.divkit.a((tse) ((u5g) xvf0Var).get(), i5m.a((y2r0) xvf0Var2));
            case 20:
                return new kof0((nfh) ((edf0) xvf0Var2).get(), (dyx) xvf0Var.get());
            case 21:
                return new zpf0((dei0) xvf0Var.get(), (gei0) ((n4g0) xvf0Var2).get());
            case 22:
                return new d2g0(i5m.a((i5g) xvf0Var), i5m.a((i5g) xvf0Var2));
            case 23:
                return new j2g0((a1g0) ((eqf0) xvf0Var2).get(), (xk60) xvf0Var.get());
            case 24:
                return new ru.yandex.taxi.settings.domain.c((ru.yandex.taxi.settings.domain.e) ((c8w) xvf0Var2).get(), (tt2) xvf0Var.get());
            case 25:
                return new ajg0((tse) xvf0Var.get(), (pwy0) ((d6g) xvf0Var2).get());
            case 26:
                return new qni0((zf) ((c660) xvf0Var).get(), (t61) ((c660) xvf0Var2).get());
            case 27:
                return new noi0((zf) ((ziv) xvf0Var).get(), (t61) ((zzg) xvf0Var2).get());
            case 28:
                return new yxf0((ucj0) xvf0Var.get(), (lcj0) ((n4g0) xvf0Var2).get());
            default:
                return new com.ybsdk.feature.qr.internal.domain.a(new com.ybsdk.feature.qr.internal.data.a((QrApi) ((p350) xvf0Var2).get(), (a3h) xvf0Var.get()));
        }
    }

    public /* synthetic */ icc0(xvf0 xvf0Var, xvf0 xvf0Var2, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }
}
