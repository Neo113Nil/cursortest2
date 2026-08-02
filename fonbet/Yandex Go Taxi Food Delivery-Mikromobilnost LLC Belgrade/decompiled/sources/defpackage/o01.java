package defpackage;

import android.content.Context;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.address.address_map_picker.domain.c;
import com.yandex.go.address.address_map_picker.domain.e;
import com.yandex.go.address.address_map_picker.navigation.f;
import com.yandex.go.address.address_map_picker.pin.g;
import com.yandex.go.pin.repository.o;
import com.yandex.go.proxyprovision.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.analytics.CrashlyticsInteractor;
import ru.yandex.taxi.analytics.q;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.masstransit.address.interactor.i;
import ru.yandex.taxi.persuggest.api.a;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.vendor_api.push.b;

/* loaded from: classes.dex */
public final class o01 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;

    public /* synthetic */ o01(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.o = xvf0Var14;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.i;
        xvf0 xvf0Var2 = this.o;
        xvf0 xvf0Var3 = this.n;
        xvf0 xvf0Var4 = this.m;
        xvf0 xvf0Var5 = this.l;
        xvf0 xvf0Var6 = this.k;
        xvf0 xvf0Var7 = this.j;
        xvf0 xvf0Var8 = this.h;
        xvf0 xvf0Var9 = this.g;
        xvf0 xvf0Var10 = this.f;
        xvf0 xvf0Var11 = this.e;
        xvf0 xvf0Var12 = this.d;
        xvf0 xvf0Var13 = this.c;
        xvf0 xvf0Var14 = this.b;
        switch (i) {
            case 0:
                return new f((mf00) xvf0Var14.get(), (ah00) xvf0Var13.get(), (x11) xvf0Var12.get(), (g) xvf0Var11.get(), (c) xvf0Var10.get(), (p01) xvf0Var9.get(), (AddressMapPickerAddressStateRepository) xvf0Var8.get(), (g21) xvf0Var.get(), (com.yandex.go.address.address_map_picker.domain.f) xvf0Var7.get(), (e) xvf0Var6.get(), (l110) xvf0Var5.get(), (j11) xvf0Var4.get(), (ysd0) xvf0Var3.get(), (o31) xvf0Var2.get());
            case 1:
                return new ru.yandex.taxi.persuggest.source.c((a) xvf0Var14.get(), (sta0) xvf0Var13.get(), (v5v0) xvf0Var12.get(), (tt2) xvf0Var11.get(), (ru.yandex.taxi.persuggest.source.a) xvf0Var10.get(), (ms2) xvf0Var9.get(), (zet0) xvf0Var8.get(), (q9j0) xvf0Var.get(), (m6r) xvf0Var7.get(), (yiq0) xvf0Var6.get(), (w6r) xvf0Var5.get(), (k4v0) xvf0Var4.get(), (ru.yandex.taxi.perf.screen.c) xvf0Var3.get(), (ir3) xvf0Var2.get());
            case 2:
                return new q((Context) xvf0Var14.get(), (b) xvf0Var13.get(), i5m.a(xvf0Var12), i5m.a(xvf0Var11), (rs2) xvf0Var10.get(), (v0p) xvf0Var9.get(), i5m.a(xvf0Var8), (k) xvf0Var.get(), i5m.a(xvf0Var7), (com.yandex.go.proxyprovision.mob.e) xvf0Var6.get(), i5m.a(xvf0Var5), (gkd) xvf0Var4.get(), (CrashlyticsInteractor) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 3:
                return new ru.yandex.taxi.masstransit.router.b((tse) xvf0Var14.get(), (af30) xvf0Var13.get(), (yz4) xvf0Var12.get(), (ysd0) xvf0Var11.get(), (oep0) xvf0Var10.get(), i5m.a(xvf0Var9), (i6r) xvf0Var8.get(), this.i, (avv0) xvf0Var7.get(), (rp60) xvf0Var6.get(), (i) xvf0Var5.get(), (s440) xvf0Var4.get(), (ck31) xvf0Var3.get(), (nv20) xvf0Var2.get());
            case 4:
                return new tt((ah00) xvf0Var14.get(), (Context) xvf0Var13.get(), (tse) xvf0Var12.get(), (lqx) xvf0Var11.get(), (lp00) xvf0Var10.get(), (erx) xvf0Var9.get(), (hmb0) xvf0Var8.get(), (hbm) xvf0Var.get(), (ru.yandex.taxi.map_common.map.utils.a) xvf0Var7.get(), (ouw) xvf0Var6.get(), (ru.yandex.taxi.map.overlay.pickup.intersections.b) xvf0Var5.get(), (ru.yandex.taxi.map_common.map.process.b) xvf0Var4.get(), (bqb0) xvf0Var3.get(), (o) xvf0Var2.get());
            case 5:
                return new tt((Context) xvf0Var14.get(), (tan) xvf0Var13.get(), (yqg) xvf0Var12.get(), (jtq0) xvf0Var11.get(), (tt2) xvf0Var10.get(), (irs0) xvf0Var9.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var8.get(), (bk1) xvf0Var.get(), (pwy0) xvf0Var7.get(), (ru.yandex.taxi.widget.c) xvf0Var6.get(), (ars0) xvf0Var5.get(), (j101) xvf0Var4.get(), (com.yandex.go.agreement.trackable.repository.a) xvf0Var3.get(), (com.yandex.go.agreement.trackable.repository.b) xvf0Var2.get());
            case 6:
                s701 s701Var = (s701) xvf0Var14.get();
                ru.yandex.taxi.logistics.sdk.delivery.edit.b bVar = (ru.yandex.taxi.logistics.sdk.delivery.edit.b) xvf0Var13.get();
                st2 st2Var = (st2) xvf0Var12.get();
                t0k0 t0k0Var = (t0k0) xvf0Var11.get();
                AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = (AppVisibilitySubscriptionImpl) xvf0Var10.get();
                com.yandex.delivery.utils.push.impl.a aVar = (com.yandex.delivery.utils.push.impl.a) xvf0Var9.get();
                c801 c801Var = (c801) xvf0Var8.get();
                l7x0 l7x0Var = (l7x0) xvf0Var.get();
                ru.yandex.taxi.logistics.sdk.management.localstate.e eVar = (ru.yandex.taxi.logistics.sdk.management.localstate.e) xvf0Var7.get();
                aci aciVar = (aci) xvf0Var6.get();
                return new pzf(s701Var, bVar, st2Var, t0k0Var, appVisibilitySubscriptionImpl, aVar, c801Var, l7x0Var, eVar, aciVar, (ru.yandex.taxi.logistics.sdk.performer_position.impl.a) xvf0Var4.get(), (v6s) xvf0Var3.get(), (jwh) xvf0Var2.get());
            default:
                return new on21((ru.yandex.taxi.am.g) xvf0Var14.get(), (m) xvf0Var13.get(), (ru.yandex.taxi.launch.c) xvf0Var12.get(), (h) xvf0Var11.get(), (ru.yandex.taxi.profile.a) xvf0Var10.get(), (zuj0) xvf0Var9.get(), (q1s) xvf0Var8.get(), (xv11) xvf0Var.get(), (pwy0) xvf0Var7.get(), (ru.yandex.taxi.settings.email.a) xvf0Var6.get(), (ru.yandex.taxi.yaplus.b) xvf0Var5.get(), (cda0) xvf0Var4.get(), (wk21) xvf0Var3.get(), (tt2) xvf0Var2.get());
        }
    }
}
