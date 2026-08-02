package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.pin.repository.a0;
import com.yandex.go.pin.repository.o;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.superapp.impl.presenter_delegate.d;
import com.yandex.go.superapp.impl.presenter_delegate.e;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.multi.tracking.i;
import com.yandex.go.yb.domain.n;
import com.yandex.go.yb.domain.q;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.chat.domain.c;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.channel.a;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.yandex.messaging.isolated.b;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.delivery.pin.k;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.l;
import ru.yandex.taxi.masstransit.domain.h;
import ru.yandex.taxi.requirements.interactor.e0;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.data.u;

/* loaded from: classes5.dex */
public final class ii9 implements v7p {
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
    public final xvf0 p;
    public final xvf0 q;

    public /* synthetic */ ii9(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, int i) {
        this.a = i;
        this.q = v7pVar;
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
        this.p = xvf0Var15;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.n;
        xvf0 xvf0Var2 = this.l;
        xvf0 xvf0Var3 = this.j;
        xvf0 xvf0Var4 = this.e;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        xvf0 xvf0Var7 = this.q;
        xvf0 xvf0Var8 = this.p;
        xvf0 xvf0Var9 = this.o;
        xvf0 xvf0Var10 = this.m;
        xvf0 xvf0Var11 = this.k;
        xvf0 xvf0Var12 = this.i;
        xvf0 xvf0Var13 = this.h;
        xvf0 xvf0Var14 = this.g;
        xvf0 xvf0Var15 = this.f;
        xvf0 xvf0Var16 = this.d;
        switch (i) {
            case 0:
                return new a((Activity) xvf0Var6.get(), (ChatRequest) xvf0Var5.get(), (p4t) xvf0Var16.get(), (c) ((prq) xvf0Var7).get(), (x22) xvf0Var4.get(), (bo3) xvf0Var15.get(), (fcf) xvf0Var14.get(), i5m.a(xvf0Var13), i5m.a(xvf0Var12), i5m.a(xvf0Var3), i5m.a(xvf0Var11), (sfl0) xvf0Var2.get(), (ChatInputHeightState) xvf0Var10.get(), (k0b) xvf0Var.get(), (pu31) xvf0Var9.get(), (SelectedMessagesPanel) xvf0Var8.get());
            case 1:
                return new g2p((Lifecycle) xvf0Var6.get(), (ru.yandex.taxi.eatskit.c) xvf0Var5.get(), (y3p) xvf0Var16.get(), (com.yandex.go.superapp.impl.presenter_delegate.a) xvf0Var4.get(), (e1p) xvf0Var15.get(), (g1p) xvf0Var14.get(), (com.yandex.go.superapp.impl.presenter_delegate.c) xvf0Var13.get(), (d) xvf0Var12.get(), (e) xvf0Var3.get(), (yrv0) xvf0Var11.get(), (h1p) xvf0Var2.get(), (e2x0) ((tzf) xvf0Var).get(), (rvq0) xvf0Var10.get(), (com.yandex.go.external_service.deeplink.a) ((epf) xvf0Var9).get(), (a850) ((szf) xvf0Var8).get(), (bdn) ((jzf) xvf0Var7).get());
            case 2:
                return new com.yandex.messaging.isolated.c((Activity) xvf0Var6.get(), (m4b) ((ba9) xvf0Var).get(), (b) ((wrh) xvf0Var9).get(), (md6) ((lu9) xvf0Var8).get(), (jn3) xvf0Var5.get(), (xqi0) xvf0Var16.get(), (n4b) xvf0Var4.get(), (pu31) xvf0Var15.get(), (rz10) xvf0Var14.get(), (k1b) xvf0Var13.get(), (s4b) xvf0Var12.get(), (u4b) xvf0Var3.get(), (sfl0) xvf0Var11.get(), (lqo) xvf0Var2.get(), (njp) xvf0Var7, (ymp) xvf0Var10.get());
            case 3:
                return new com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.a((ah00) ((i9g) xvf0Var15).get(), (h080) ((t160) xvf0Var14).get(), (xm00) ((j9g) xvf0Var13).get(), (l390) xvf0Var6.get(), (tse) ((i9g) xvf0Var12).get(), (com.yandex.go.taxi.order.search.ui.search_views.d) xvf0Var5.get(), (hf2) ((i9g) xvf0Var3).get(), (et00) ((i9g) xvf0Var11).get(), (ndl0) ((z1n0) xvf0Var2).get(), (uz8) ((i9g) xvf0Var10).get(), (ed80) ((j9g) xvf0Var).get(), (y3u0) ((j9g) xvf0Var9).get(), (zuj0) ((j9g) xvf0Var8).get(), (smz) xvf0Var16.get(), (com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c) xvf0Var4.get(), (el00) ((i9g) xvf0Var7).get());
            case 4:
                return new a0((ru.yandex.taxi.main.map.e) ((e3u) xvf0Var7).get(), (AddressResolveRepository) xvf0Var6.get(), (o) xvf0Var5.get(), (f1c0) xvf0Var16.get(), (uze0) xvf0Var4.get(), (e800) xvf0Var15.get(), (wiq0) xvf0Var14.get(), (k) xvf0Var13.get(), (com.yandex.go.navigation.screen.c) xvf0Var12.get(), (vtb0) xvf0Var3.get(), (oyb0) xvf0Var11.get(), (rwt) xvf0Var2.get(), (nj6) xvf0Var10.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var.get(), (p2c0) xvf0Var9.get(), (r0c0) xvf0Var8.get());
            case 5:
                return new bl30((Context) xvf0Var6.get(), (Lifecycle) xvf0Var5.get(), (h410) xvf0Var16.get(), (ru.yandex.taxi.masstransit.geopayment.adapter.a) xvf0Var4.get(), (z26) xvf0Var15.get(), (j26) xvf0Var14.get(), (t16) xvf0Var13.get(), (ek30) xvf0Var12.get(), (p310) xvf0Var3.get(), (u310) xvf0Var11.get(), (u16) ((pg5) xvf0Var).get(), (sr4) ((pg5) xvf0Var9).get(), (pm5) ((pg5) xvf0Var8).get(), (d411) xvf0Var2.get(), (w030) xvf0Var10.get(), (com.yandex.go.network.connectivity.a) ((f3g) xvf0Var7).get());
            case 6:
                ru.yandex.taxi.masstransit.main.router.a aVar = (ru.yandex.taxi.masstransit.main.router.a) xvf0Var6.get();
                ru.yandex.taxi.masstransit.main.ui.header.a aVar2 = (ru.yandex.taxi.masstransit.main.ui.header.a) ((zo0) xvf0Var8).get();
                ah00 ah00Var = (ah00) ((f3g) xvf0Var7).get();
                po21 po21Var = (po21) xvf0Var5.get();
                a3v a3vVar = (a3v) xvf0Var16.get();
                zuj0 zuj0Var = (zuj0) xvf0Var4.get();
                atd0 atd0Var = (atd0) xvf0Var15.get();
                dz00 dz00Var = (dz00) xvf0Var14.get();
                tu30 tu30Var = (tu30) xvf0Var13.get();
                return new lo30(aVar, aVar2, ah00Var, po21Var, a3vVar, zuj0Var, atd0Var, dz00Var, tu30Var, (ru.yandex.taxi.masstransit.paymentcards.c) xvf0Var3.get(), (h) xvf0Var11.get(), (pwy0) xvf0Var2.get(), (ru.yandex.taxi.perf.screen.c) xvf0Var10.get(), (e311) xvf0Var.get(), (y210) xvf0Var9.get());
            case 7:
                return new com.yandex.go.navigator.alt_select.new_summary.a(this.b, this.c, (re50) xvf0Var16.get(), (lg50) xvf0Var4.get(), (oc50) xvf0Var15.get(), (yxf0) ((n7i0) xvf0Var8).get(), (zuj0) xvf0Var14.get(), (tt2) xvf0Var13.get(), (t) xvf0Var12.get(), (bzw) xvf0Var3.get(), (com.yandex.go.navigator.alt_select.a) xvf0Var11.get(), (liq0) xvf0Var2.get(), (com.yandex.go.navigator.domain.b) ((fwc) xvf0Var7).get(), (e621) xvf0Var10.get(), this.n, (fu00) xvf0Var9.get());
            case 8:
                return new yn80((Context) ((x4g) xvf0Var).get(), (qn80) xvf0Var6.get(), (wn80) xvf0Var5.get(), (eo80) ((n3w) xvf0Var9).a, (w030) ((x4g) xvf0Var8).get(), (mg80) xvf0Var16.get(), (wbc0) xvf0Var4.get(), (n3h) xvf0Var15.get(), (tse) xvf0Var14.get(), (PlacesNavigationMode) xvf0Var13.get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) xvf0Var12.get(), (g3h) xvf0Var3.get(), (cn80) xvf0Var11.get(), (go80) xvf0Var2.get(), (y4g) xvf0Var7, (yac0) xvf0Var10.get());
            case 9:
                return new ru.yandex.taxi.map.overlay.pickup.d((ah00) xvf0Var6.get(), (Context) xvf0Var5.get(), (tse) xvf0Var16.get(), (lqx) xvf0Var4.get(), (xm00) xvf0Var15.get(), (lp00) xvf0Var14.get(), (erx) xvf0Var13.get(), (hmb0) xvf0Var12.get(), (hbm) xvf0Var3.get(), (ru.yandex.taxi.map_common.map.utils.a) xvf0Var11.get(), (ouw) xvf0Var2.get(), (ru.yandex.taxi.map.overlay.pickup.intersections.b) xvf0Var10.get(), (ru.yandex.taxi.map_common.map.process.b) xvf0Var.get(), (mz70) xvf0Var7, (cqb0) xvf0Var9.get(), (o) xvf0Var8.get());
            case 10:
                return new ste0((ru.yandex.taxi.preorder.source.pickup.a) xvf0Var6.get(), (dqe0) ((w0g) xvf0Var2).get(), (ru.yandex.taxi.preorder.extraphone.e) xvf0Var5.get(), (com.yandex.go.taxi.auction.domain.a) xvf0Var16.get(), (wiq0) ((w0g) xvf0Var10).get(), (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var4.get(), (com.yandex.go.route.interactor.c) xvf0Var15.get(), (wb3) xvf0Var14.get(), (com.yandex.go.preorder.confirm.a) xvf0Var13.get(), (ru.yandex.taxi.orderforanother.repository.a) ((v0g) xvf0Var).get(), (l0j) xvf0Var12.get(), (rq80) xvf0Var3.get(), (djj0) xvf0Var11.get(), (q6c0) ((oe3) xvf0Var9).get(), (svw) ((y0g) xvf0Var8).get(), (mj21) ((y0g) xvf0Var7).get());
            case 11:
                return new ldj0((ck31) xvf0Var6.get(), (wiq0) xvf0Var5.get(), (t8i) xvf0Var16.get(), (wt90) xvf0Var4.get(), (czi0) xvf0Var15.get(), (x9j0) ((n7i0) xvf0Var9).get(), (ru.yandex.taxi.orderforanother.repository.a) xvf0Var14.get(), (d9w) xvf0Var13.get(), (ru.yandex.taxi.delivery.impl.paid_insurance.d) xvf0Var12.get(), (o3i) xvf0Var3.get(), (cjj0) xvf0Var11.get(), (hnj0) ((nt0) xvf0Var8).get(), (hqj0) xvf0Var2.get(), (tt2) xvf0Var10.get(), (b8r) xvf0Var.get(), (e0) ((sb1) xvf0Var7).get());
            case 12:
                return new ru.yandex.taxi.scooters.presentation.detailed_order.e((fva0) xvf0Var6.get(), (ysd0) xvf0Var5.get(), (ukn0) xvf0Var16.get(), this.e, (u) xvf0Var15.get(), (cyx) xvf0Var14.get(), (r7g) xvf0Var13.get(), (nyn0) xvf0Var12.get(), this.j, (b5o0) xvf0Var11.get(), this.l, (ru.yandex.taxi.scooters.data.k) xvf0Var10.get(), (g) xvf0Var.get(), (rx4) xvf0Var9, (qgn0) ((qzm0) xvf0Var8).get(), (ndl0) ((qzm0) xvf0Var7).get());
            case 13:
                return new v3s0(((w2g) xvf0Var6).b.b, (bk4) ((w2g) xvf0Var5).get(), ((w2g) xvf0Var16).b.G(), (yit0) ((x2g) xvf0Var4).get(), ((x2g) xvf0Var15).b.v0(), ((w2g) xvf0Var14).b.j1(), ((x2g) xvf0Var13).b.U(), ((w2g) xvf0Var12).b.j(), (hp0) ((w2g) xvf0Var3).get(), ((x2g) xvf0Var11).b.T(), ((x2g) xvf0Var2).b.h1(), (Context) ((x2g) xvf0Var10).get(), i5m.a((eqh) xvf0Var), ((w2g) xvf0Var9).b.p(), ((w2g) xvf0Var8).b.Q(), ((x2g) xvf0Var7).b.z0());
            case 14:
                return new ik0((Context) ((n3w) xvf0Var5).a, (qdc) ((gbg) xvf0Var16).get(), (l7x0) ((ibg) xvf0Var4).get(), (dci) ((gbg) xvf0Var15).get(), (qcp0) ((ibg) xvf0Var14).get(), (jwh) ((gbg) xvf0Var13).get(), (hwy0) ((ibg) xvf0Var12).get(), (com.yandex.delivery.utils.dialogmanager.impl.b) ((gbg) xvf0Var3).get(), (oa9) ((kj7) xvf0Var11).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a) ((oti) xvf0Var2).get(), (bi60) ((gbg) xvf0Var10).get(), (yuj0) ((gbg) xvf0Var).get(), (gzh) xvf0Var6.get(), (t0k0) ((gbg) xvf0Var9).get(), (st2) ((gbg) xvf0Var8).get(), (q8s) ((gbg) xvf0Var7).get());
            case 15:
                return new i((ru.yandex.taxi.multiorder.e) xvf0Var6.get(), (com.yandex.go.order.ui.order_list_modal_height.presentation.a) xvf0Var5.get(), (f0) xvf0Var16.get(), (jok0) xvf0Var4.get(), (mjg0) xvf0Var15.get(), (xu70) xvf0Var14.get(), (clk0) xvf0Var13.get(), (w0y0) ((rbx0) xvf0Var7).get(), (a850) xvf0Var12.get(), (tt2) xvf0Var3.get(), (zd80) xvf0Var11.get(), (v311) xvf0Var2.get(), (y3y0) xvf0Var10.get(), (com.yandex.go.taxi.order.perf.a) xvf0Var.get(), (yxx0) xvf0Var9.get(), (grq) xvf0Var8.get());
            case 16:
                return new l((String) xvf0Var6.get(), (x201) ((mzf) xvf0Var4).get(), (kcz0) ((flx0) xvf0Var15).get(), (j00) ((c1) xvf0Var14).get(), (st2) ((gbg) xvf0Var13).get(), (f) ((gbg) xvf0Var12).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var3).get(), (uy31) xvf0Var5.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.domain.b) xvf0Var16.get(), (c1x0) ((uzu0) xvf0Var11).get(), (ht10) ((ys10) xvf0Var2).get(), (md6) ((dx9) xvf0Var10).get(), (j) ((k4) xvf0Var).get(), (Context) ((n3w) xvf0Var9).a, (d301) ((mzf) xvf0Var8).get(), (wwf) ((f2b) xvf0Var7).get());
            case 17:
                return j73.f0(new b801[]{(ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.f) ((kc6) xvf0Var7).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button.b) xvf0Var6.get(), (yc1) xvf0Var5.get(), (v1f0) xvf0Var16.get(), (iyp0) xvf0Var4.get(), (jye) xvf0Var15.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.f) xvf0Var14.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.e) xvf0Var13.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.f) xvf0Var12.get(), (tgy) xvf0Var3.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.d) xvf0Var11.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.d) xvf0Var2.get(), (qt90) xvf0Var10.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll.c) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.d) xvf0Var9.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline.b) xvf0Var8.get()});
            default:
                return new com.yandex.go.yb.c((tse) xvf0Var6.get(), (com.yandex.go.yb.data.e) xvf0Var5.get(), (FragmentActivity) xvf0Var16.get(), (n) xvf0Var4.get(), (hr51) xvf0Var15.get(), i5m.a(xvf0Var14), (lv51) xvf0Var13.get(), (ls51) xvf0Var12.get(), (fw51) xvf0Var3.get(), (fva0) xvf0Var11.get(), (xg) xvf0Var2.get(), (tt2) xvf0Var10.get(), (com.yandex.go.yb.domain.a) xvf0Var.get(), (gv51) ((xcg) xvf0Var9).get(), (q) ((xcg) xvf0Var8).get(), (com.yandex.go.yb.domain.f0) ((jpn0) xvf0Var7).get());
        }
    }

    public /* synthetic */ ii9(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, int i) {
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
        this.p = xvf0Var15;
        this.q = xvf0Var16;
    }

    public ii9(xvf0 xvf0Var, mzf mzfVar, flx0 flx0Var, c1 c1Var, gbg gbgVar, gbg gbgVar2, mzf mzfVar2, xvf0 xvf0Var2, xvf0 xvf0Var3, uzu0 uzu0Var, ys10 ys10Var, dx9 dx9Var, k4 k4Var, n3w n3wVar, mzf mzfVar3, f2b f2bVar) {
        this.a = 16;
        this.b = xvf0Var;
        this.e = mzfVar;
        this.f = flx0Var;
        this.g = c1Var;
        this.h = gbgVar;
        this.i = gbgVar2;
        this.j = mzfVar2;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.k = uzu0Var;
        this.l = ys10Var;
        this.m = dx9Var;
        this.n = k4Var;
        this.o = n3wVar;
        this.p = mzfVar3;
        this.q = f2bVar;
    }

    public ii9(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, rqt rqtVar, xvf0 xvf0Var4, xvf0 xvf0Var5, ove oveVar, gga0 gga0Var, upj upjVar, xvf0 xvf0Var6, bvx bvxVar, bvx bvxVar2, xvf0 xvf0Var7, mz70 mz70Var, xvf0 xvf0Var8, gb0 gb0Var) {
        this.a = 9;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = rqtVar;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = oveVar;
        this.i = gga0Var;
        this.j = upjVar;
        this.k = xvf0Var6;
        this.l = bvxVar;
        this.m = bvxVar2;
        this.n = xvf0Var7;
        this.q = mz70Var;
        this.o = xvf0Var8;
        this.p = gb0Var;
    }

    public ii9(sb1 sb1Var, ge50 ge50Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n7i0 n7i0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, rs0 rs0Var, xvf0 xvf0Var8, fwc fwcVar, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11) {
        this.a = 7;
        this.b = sb1Var;
        this.c = ge50Var;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.p = n7i0Var;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
        this.k = rs0Var;
        this.l = xvf0Var8;
        this.q = fwcVar;
        this.m = xvf0Var9;
        this.n = xvf0Var10;
        this.o = xvf0Var11;
    }

    public ii9(n3w n3wVar, ba9 ba9Var, wrh wrhVar, lu9 lu9Var, xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar2, nb11 nb11Var, h420 h420Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, h420 h420Var2, njp njpVar, xvf0 xvf0Var7) {
        this.a = 2;
        this.b = n3wVar;
        this.n = ba9Var;
        this.o = wrhVar;
        this.p = lu9Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = n3wVar2;
        this.f = nb11Var;
        this.g = h420Var;
        this.h = xvf0Var3;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
        this.k = xvf0Var6;
        this.l = h420Var2;
        this.q = njpVar;
        this.m = xvf0Var7;
    }

    public ii9(n3w n3wVar, gbg gbgVar, ibg ibgVar, gbg gbgVar2, ibg ibgVar2, gbg gbgVar3, ibg ibgVar3, gbg gbgVar4, kj7 kj7Var, oti otiVar, gbg gbgVar5, gbg gbgVar6, xvf0 xvf0Var, gbg gbgVar7, gbg gbgVar8, gbg gbgVar9) {
        this.a = 14;
        this.c = n3wVar;
        this.d = gbgVar;
        this.e = ibgVar;
        this.f = gbgVar2;
        this.g = ibgVar2;
        this.h = gbgVar3;
        this.i = ibgVar3;
        this.j = gbgVar4;
        this.k = kj7Var;
        this.l = otiVar;
        this.m = gbgVar5;
        this.n = gbgVar6;
        this.b = xvf0Var;
        this.o = gbgVar7;
        this.p = gbgVar8;
        this.q = gbgVar9;
    }

    public ii9(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, n7i0 n7i0Var, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, nt0 nt0Var, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, sb1 sb1Var) {
        this.a = 11;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.o = n7i0Var;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.p = nt0Var;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.q = sb1Var;
    }

    public ii9(w0g w0gVar, w0g w0gVar2, u0g u0gVar, xvf0 xvf0Var, w0g w0gVar3, w0g w0gVar4, b1g b1gVar, p4 p4Var, v0g v0gVar, v0g v0gVar2, u0g u0gVar2, v0g v0gVar3, cta0 cta0Var, oe3 oe3Var, y0g y0gVar, y0g y0gVar2) {
        this.a = 10;
        this.b = w0gVar;
        this.l = w0gVar2;
        this.c = u0gVar;
        this.d = xvf0Var;
        this.m = w0gVar3;
        this.e = w0gVar4;
        this.f = b1gVar;
        this.g = p4Var;
        this.h = v0gVar;
        this.n = v0gVar2;
        this.i = u0gVar2;
        this.j = v0gVar3;
        this.k = cta0Var;
        this.o = oe3Var;
        this.p = y0gVar;
        this.q = y0gVar2;
    }

    public ii9(n3w n3wVar, zo0 zo0Var, f3g f3gVar, g3g g3gVar, b3g b3gVar, g3g g3gVar2, b3g b3gVar2, f3g f3gVar2, f3g f3gVar3, g3g g3gVar3, g3g g3gVar4, f3g f3gVar4, g3g g3gVar5, f3g f3gVar5, qcz0 qcz0Var, xvf0 xvf0Var) {
        this.a = 6;
        this.b = n3wVar;
        this.p = zo0Var;
        this.q = f3gVar;
        this.c = g3gVar;
        this.d = b3gVar;
        this.e = g3gVar2;
        this.f = b3gVar2;
        this.g = f3gVar2;
        this.h = f3gVar3;
        this.i = g3gVar3;
        this.j = g3gVar4;
        this.k = f3gVar4;
        this.l = g3gVar5;
        this.m = f3gVar5;
        this.n = qcz0Var;
        this.o = xvf0Var;
    }

    public ii9(n3w n3wVar, v8c0 v8c0Var, a4t a4tVar, prq prqVar, xvf0 xvf0Var, tl3 tl3Var, xvf0 xvf0Var2, ge50 ge50Var, ahu ahuVar, w7y0 w7y0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, mu7 mu7Var, nb11 nb11Var, jpn0 jpn0Var) {
        this.a = 0;
        this.b = n3wVar;
        this.c = v8c0Var;
        this.d = a4tVar;
        this.q = prqVar;
        this.e = xvf0Var;
        this.f = tl3Var;
        this.g = xvf0Var2;
        this.h = ge50Var;
        this.i = ahuVar;
        this.j = w7y0Var;
        this.k = xvf0Var3;
        this.l = xvf0Var4;
        this.m = xvf0Var5;
        this.n = mu7Var;
        this.o = nb11Var;
        this.p = jpn0Var;
    }

    public ii9(xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, szf szfVar, kk kkVar, tzf tzfVar, n3w n3wVar2, epf epfVar, szf szfVar2, jzf jzfVar) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = n3wVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.j = xvf0Var8;
        this.k = szfVar;
        this.l = kkVar;
        this.n = tzfVar;
        this.m = n3wVar2;
        this.o = epfVar;
        this.p = szfVar2;
        this.q = jzfVar;
    }

    public ii9(i9g i9gVar, t160 t160Var, j9g j9gVar, xvf0 xvf0Var, i9g i9gVar2, xvf0 xvf0Var2, i9g i9gVar3, i9g i9gVar4, z1n0 z1n0Var, i9g i9gVar5, j9g j9gVar2, j9g j9gVar3, j9g j9gVar4, xvf0 xvf0Var3, xvf0 xvf0Var4, i9g i9gVar6) {
        this.a = 3;
        this.f = i9gVar;
        this.g = t160Var;
        this.h = j9gVar;
        this.b = xvf0Var;
        this.i = i9gVar2;
        this.c = xvf0Var2;
        this.j = i9gVar3;
        this.k = i9gVar4;
        this.l = z1n0Var;
        this.m = i9gVar5;
        this.n = j9gVar2;
        this.o = j9gVar3;
        this.p = j9gVar4;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.q = i9gVar6;
    }

    public ii9(i020 i020Var, xvf0 xvf0Var, xvf0 xvf0Var2, xj xjVar, xvf0 xvf0Var3, f870 f870Var, xpj0 xpj0Var, rbx0 rbx0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, abx0 abx0Var, n2y0 n2y0Var, abx0 abx0Var2, xvf0 xvf0Var8) {
        this.a = 15;
        this.b = i020Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xjVar;
        this.f = xvf0Var3;
        this.g = f870Var;
        this.h = xpj0Var;
        this.q = rbx0Var;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
        this.k = xvf0Var6;
        this.l = xvf0Var7;
        this.m = abx0Var;
        this.n = n2y0Var;
        this.o = abx0Var2;
        this.p = xvf0Var8;
    }

    public ii9(x4g x4gVar, n3w n3wVar, n3w n3wVar2, n3w n3wVar3, x4g x4gVar2, xvf0 xvf0Var, xvf0 xvf0Var2, x4g x4gVar3, n3w n3wVar4, n3w n3wVar5, n3w n3wVar6, n3w n3wVar7, xvf0 xvf0Var3, xvf0 xvf0Var4, y4g y4gVar, n3w n3wVar8) {
        this.a = 8;
        this.n = x4gVar;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.o = n3wVar3;
        this.p = x4gVar2;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = x4gVar3;
        this.g = n3wVar4;
        this.h = n3wVar5;
        this.i = n3wVar6;
        this.j = n3wVar7;
        this.k = xvf0Var3;
        this.l = xvf0Var4;
        this.q = y4gVar;
        this.m = n3wVar8;
    }

    public ii9(b3g b3gVar, b3g b3gVar2, f3g f3gVar, pg5 pg5Var, c4 c4Var, c4 c4Var2, pg5 pg5Var2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, pg5 pg5Var3, pg5 pg5Var4, pg5 pg5Var5, y501 y501Var, f3g f3gVar2, f3g f3gVar3) {
        this.a = 5;
        this.b = b3gVar;
        this.c = b3gVar2;
        this.d = f3gVar;
        this.e = pg5Var;
        this.f = c4Var;
        this.g = c4Var2;
        this.h = pg5Var2;
        this.i = xvf0Var;
        this.j = xvf0Var2;
        this.k = xvf0Var3;
        this.n = pg5Var3;
        this.o = pg5Var4;
        this.p = pg5Var5;
        this.l = y501Var;
        this.m = f3gVar2;
        this.q = f3gVar3;
    }
}
