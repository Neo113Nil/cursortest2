package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.preorder.map.a;
import com.yandex.go.route.interactor.b;
import com.yandex.go.scooters.data.mapper.c;
import com.yandex.go.scooters.ignition.controlling.f;
import com.yandex.go.scooters.ignition.domain.k;
import com.yandex.go.scooters.ignition.domain.n;
import com.yandex.go.scooters.passes.domain.g;
import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.h0;
import com.yandex.go.taxi.order.provider.w;
import com.yandex.go.walking.navigation.impl.guidance.interactor.x;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.timeline.ChatItemHighlighter;
import com.yandex.messaging.internal.view.timeline.MissedHistoryAnimator;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.d;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.summary.requirements.list.interactors.o;
import ru.yandex.taxi.summary.requirements.list.interactors.u0;
import ru.yandex.taxi.summary.requirements.list.interactors.y;
import ru.yandex.taxi.surge.interactor.s;

/* loaded from: classes14.dex */
public final class h0l0 implements v7p {
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

    public h0l0(sag sagVar, jcg jcgVar, xvf0 xvf0Var, d441 d441Var, jcg jcgVar2, jcg jcgVar3, sag sagVar2, n3w n3wVar, xvf0 xvf0Var2, jcg jcgVar4) {
        this.a = 20;
        this.d = sagVar;
        this.e = jcgVar;
        this.b = xvf0Var;
        this.f = d441Var;
        this.g = jcgVar2;
        this.h = jcgVar3;
        this.i = sagVar2;
        this.j = n3wVar;
        this.c = xvf0Var2;
        this.k = jcgVar4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.j;
        xvf0 xvf0Var3 = this.i;
        xvf0 xvf0Var4 = this.h;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.e;
        xvf0 xvf0Var7 = this.d;
        xvf0 xvf0Var8 = this.c;
        xvf0 xvf0Var9 = this.k;
        xvf0 xvf0Var10 = this.b;
        switch (i) {
            case 0:
                return new a((a3v) xvf0Var10.get(), (ah00) xvf0Var8.get(), (d6l0) xvf0Var7.get(), (xfv0) xvf0Var6.get(), (j) xvf0Var5.get(), (r) xvf0Var.get(), (b) xvf0Var4.get(), (biv0) xvf0Var3.get(), (cvr) xvf0Var2.get(), (zqz0) ((ibz0) xvf0Var9).get());
            case 1:
                return new k1l0((Activity) xvf0Var10.get(), (yze0) xvf0Var8.get(), (y0l0) ((qcb) xvf0Var2).get(), (w) xvf0Var7.get(), (ci70) xvf0Var6.get(), (w030) xvf0Var5.get(), (gpx0) xvf0Var9, this.g, this.h, (opw) xvf0Var3.get());
            case 2:
                return new d((String) xvf0Var10.get(), (ugl0) ((gbg) xvf0Var7).get(), (qgl0) xvf0Var8.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.rover.a) ((gbg) xvf0Var6).get(), (hjh) ((gbg) xvf0Var5).get(), (st2) ((gbg) xvf0Var).get(), (e) ((mzf) xvf0Var4).get(), (j00) ((c1) xvf0Var3).get(), (p1b) ((dx9) xvf0Var2).get(), (kcz0) ((flx0) xvf0Var9).get());
            case 3:
                return new com.yandex.go.scooters.data.mapper.a((zuj0) xvf0Var10.get(), (pdc) xvf0Var8.get(), (xdf) xvf0Var7.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var6.get(), (com.yandex.go.scooters.data.mapper.d) xvf0Var5.get(), (q3p0) xvf0Var.get(), (c) xvf0Var4.get(), (cno0) xvf0Var3.get(), (com.yandex.go.scooters.data.mapper.e) ((pmn0) xvf0Var9).get(), (com.yandex.go.scooters.insurance.data.b) xvf0Var2.get());
            case 4:
                return new f((qxm0) xvf0Var10.get(), (qwo0) xvf0Var8.get(), (k) ((ur3) xvf0Var).get(), (brn0) xvf0Var7.get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var6.get(), (com.yandex.go.scooters.ignition.data.d) ((m7g) xvf0Var4).get(), (vqn0) ((m7g) xvf0Var3).get(), (n) ((jpn0) xvf0Var2).get(), (com.yandex.go.scooters.ignition.data.j) xvf0Var5.get(), (w040) ((jpn0) xvf0Var9).get());
            case 5:
                return new com.yandex.go.scooters.newbie.d((g2o0) ((z8n0) xvf0Var6).get(), (com.yandex.go.scooters.newbie.f) ((gzn0) xvf0Var5).get(), (Context) xvf0Var10.get(), (w030) xvf0Var8.get(), (tt2) ((e7g) xvf0Var).get(), (qwo0) xvf0Var7.get(), (com.yandex.go.scooters.domain.b) ((mam0) xvf0Var4).get(), (h) ((l7g) xvf0Var3).get(), (l7g) xvf0Var2, (u1o0) ((bwn0) xvf0Var9).get());
            case 6:
                return new com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.d((com.yandex.go.scooters.data.d) xvf0Var10.get(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (px4) xvf0Var9);
            case 7:
                return new com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.f((n6n0) xvf0Var10.get(), (y5p0) xvf0Var8.get(), (znn0) xvf0Var7.get(), (b3n0) xvf0Var6.get(), (z2o0) xvf0Var5.get(), (i) xvf0Var.get(), (com.yandex.go.scooters.offers.v2.components.bottom.data.a) ((bwn0) xvf0Var9).get(), (g) xvf0Var4.get(), (com.yandex.go.scooters.packages.upsale_on_book.data.a) xvf0Var3.get(), (j6p0) xvf0Var2.get());
            case 8:
                return new vup0((iup0) ((j9g) xvf0Var10).get(), (com.yandex.go.taxi.order.search.domain.entity.mapper.a) ((zmm0) xvf0Var8).get(), (no21) ((k9g) xvf0Var7).get(), (n20) ((i9g) xvf0Var6).get(), (com.yandex.go.taxi.order.change.source.pin.b) ((i9g) xvf0Var5).get(), (ft00) ((j9g) xvf0Var).get(), (pw70) ((j9g) xvf0Var4).get(), (o380) ((j9g) xvf0Var3).get(), (i380) ((l180) xvf0Var2).get(), (com.yandex.go.taxi.order.change.source.interactor.k) ((fy30) xvf0Var9).get());
            case 9:
                return new r0s0(((r9g) xvf0Var3).b.G(), (z700) xvf0Var10.get(), (i61) xvf0Var8.get(), (ljd) xvf0Var7.get(), this.e, (t4s0) xvf0Var5.get(), i5m.a(xvf0Var), (k4) xvf0Var2, (ru.yandex.taxi.perf.screen.c) xvf0Var4.get(), (y4k0) ((s9g) xvf0Var9).get());
            case 10:
                return new com.yandex.go.taxi.main.shortcuts.ui.modalview.d((l) xvf0Var10.get(), (pa00) xvf0Var8.get(), (i8y0) xvf0Var7.get(), (tt2) xvf0Var6.get(), (e8y0) xvf0Var5.get(), this.g, (c9y0) xvf0Var4.get(), (kgt0) xvf0Var3.get(), (oep0) xvf0Var2.get(), (x0s0) ((v8c0) xvf0Var9).get());
            case 11:
                ((exf) xvf0Var10).get();
                qcp0 qcp0Var = (qcp0) ((exf) xvf0Var8).get();
                hwy0 hwy0Var = (hwy0) ((exf) xvf0Var7).get();
                ((exf) xvf0Var6).get();
                ((exf) xvf0Var5).get();
                ((fxf) xvf0Var).get();
                return new fcj0(qcp0Var, hwy0Var, (ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c) ((eqh) xvf0Var3).get(), (ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c) ((eqh) xvf0Var2).get(), (y30) ((exf) xvf0Var9).get());
            case 12:
                return new h0((kdd0) ((vfg0) xvf0Var8).get(), (ru.yandex.taxi.summary.requirements.list.interactors.a) ((ht0) xvf0Var7).get(), (y) ((xv8) xvf0Var6).get(), (o) ((e3u) xvf0Var5).get(), (ru.yandex.taxi.summary.requirements.list.interactors.i) ((ncb) xvf0Var).get(), (u0) ((ubq0) xvf0Var4).get(), (joj0) ((hs30) xvf0Var3).get(), (npj0) ((cta0) xvf0Var2).get(), (com.yandex.go.summary.mapper.a) ((s3f0) xvf0Var9).get(), (viv0) xvf0Var10.get());
            case 13:
                return new dht0((tit0) xvf0Var10.get(), (rft0) xvf0Var8.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var7.get(), (yit0) xvf0Var6.get(), (r) xvf0Var5.get(), (AddressResolveRepository) xvf0Var.get(), (fy01) xvf0Var4.get(), (biv0) xvf0Var3.get(), (vvx0) xvf0Var2.get(), i5m.a((qcb) xvf0Var9));
            case 14:
                Activity activity = (Activity) xvf0Var10.get();
                kcu0 kcu0Var = (kcu0) xvf0Var8.get();
                p4t p4tVar = (p4t) xvf0Var7.get();
                dct dctVar = (dct) xvf0Var6.get();
                xav xavVar = (xav) xvf0Var5.get();
                cdu0 cdu0Var = (cdu0) ((z0s0) xvf0Var2).get();
                mae0 mae0Var = (mae0) ((tgb0) xvf0Var9).get();
                ChatRequest chatRequest = (ChatRequest) xvf0Var.get();
                com.yandex.messaging.input.g gVar = (com.yandex.messaging.input.g) xvf0Var4.get();
                x22 x22Var = (x22) xvf0Var3.get();
                m mVar = new m();
                mVar.a = activity;
                mVar.b = kcu0Var;
                mVar.c = p4tVar;
                mVar.d = dctVar;
                mVar.e = xavVar;
                mVar.f = cdu0Var;
                mVar.g = mae0Var;
                mVar.i = chatRequest;
                mVar.h = gVar;
                mVar.j = x22Var;
                return mVar;
            case 15:
                return new ygs((w030) xvf0Var10.get(), (hxv0) xvf0Var8.get(), (qxv0) ((n3w) xvf0Var2).a, (e7c0) xvf0Var7.get(), (z111) xvf0Var6.get(), (vw9) xvf0Var5.get(), (ein0) xvf0Var.get(), (sux0) xvf0Var4.get(), (kxv0) xvf0Var3.get(), (n3h) ((iag) xvf0Var9).get(), 1);
            case 16:
                return new gtw0((i130) xvf0Var10.get(), (fva0) xvf0Var8.get(), (ssw0) xvf0Var7.get(), (ysw0) xvf0Var6.get(), this.f, (rqw0) xvf0Var.get(), (s) xvf0Var4.get(), this.i, this.j, (k4a) xvf0Var9);
            case 17:
                return scc.g((a521) ((mg11) xvf0Var7).get(), (ilx0) ((y2s0) xvf0Var6).get(), (fj6) ((ze) xvf0Var5).get(), (h29) ((yc) xvf0Var).get(), (y990) ((hs30) xvf0Var4).get(), (x1f) ((peb) xvf0Var3).get(), (ru.yandex.taxi.preorder.summary.tariffpage.badge.j) ((mz70) xvf0Var2).get(), (ru.yandex.taxi.logistics.payment_method_selector.requirement.a) xvf0Var10.get(), (ogi) xvf0Var8.get(), (ru.yandex.taxi.preorder.summary.tariffpage.badge.i) ((pmn0) xvf0Var9).get());
            case 18:
                return new qaz0((Activity) xvf0Var10.get(), (w3c) xvf0Var8.get(), (mp11) xvf0Var7.get(), (z9z0) xvf0Var6.get(), (ChatItemHighlighter) xvf0Var5.get(), (MissedHistoryAnimator) xvf0Var.get(), (dbb) ((mu7) xvf0Var4).get(), (yi6) ((n2y0) xvf0Var3).get(), (h9z0) ((rct0) xvf0Var2).get(), (kb) ((n2y0) xvf0Var9).get());
            case 19:
                return new com.yandex.messaging.internal.view.chat.input.a((Activity) xvf0Var10.get(), (ChatRequest) xvf0Var8.get(), (com.yandex.messaging.internal.team.gaps.a) ((ze) xvf0Var).get(), (v8t) ((k0n) xvf0Var4).get(), (com.yandex.messaging.domain.statuses.e) ((zo0) xvf0Var9).get(), (com.yandex.messaging.domain.g) ((wvq) xvf0Var3).get(), i5m.a(xvf0Var6), (q0k) xvf0Var7.get(), (gj10) ((h0z) xvf0Var2).get(), (ChatInputHeightState) xvf0Var5.get());
            case 20:
                return new com.yandex.go.vault.router.d((Activity) ((sag) xvf0Var7).get(), (w030) ((jcg) xvf0Var6).get(), (com.yandex.go.vault.ui.a) xvf0Var10.get(), (vf41) ((d441) xvf0Var5).get(), (ru.yandex.taxi.am.token.a) ((jcg) xvf0Var).get(), (fn21) ((jcg) xvf0Var4).get(), (tt2) ((sag) xvf0Var3).get(), (v331) ((n3w) xvf0Var2).a, (z231) xvf0Var8.get(), (lg21) ((jcg) xvf0Var9).get());
            case 21:
                return new com.yandex.go.vault.flexsdk.descriptors.widget.view.b((Context) ((sag) xvf0Var6).get(), (wgr) xvf0Var10.get(), (pav) ((jcg) xvf0Var5).get(), (com.yandex.go.vault.data.e) ((sk21) xvf0Var).get(), (z231) xvf0Var8.get(), (tj60) ((jcg) xvf0Var4).get(), (ytz) ((jcg) xvf0Var3).get(), (i331) xvf0Var7.get(), (com.yandex.go.vault.data.b) ((eqh) xvf0Var2).get(), (wnt) ((jcg) xvf0Var9).get());
            case 22:
                return new com.yandex.go.taxi.summary.verticalsummary.interactor.g((vep0) ((jpn0) xvf0Var8).get(), (at20) ((uc50) xvf0Var7).get(), (v0s) ((nt0) xvf0Var6).get(), (w81) ((g6) xvf0Var5).get(), (gtz0) ((uzu0) xvf0Var).get(), (com.yandex.go.summary.interactor.common.action.a) ((qx4) xvf0Var4).get(), (mww0) ((miv0) xvf0Var3).get(), (kdd0) ((hs30) xvf0Var2).get(), (c0h) ((p6f) xvf0Var9).get(), (lh31) xvf0Var10.get());
            case 23:
                return new o021((Context) ((n3w) xvf0Var10).a, (qcp0) ((ibg) xvf0Var8).get(), (jwh) ((gbg) xvf0Var7).get(), (hwy0) ((ibg) xvf0Var6).get(), (l7x0) ((ibg) xvf0Var5).get(), (dci) ((gbg) xvf0Var).get(), (e) ((mzf) xvf0Var4).get(), (qdc) ((gbg) xvf0Var3).get(), (q8s) ((gbg) xvf0Var2).get(), (yuj0) ((gbg) xvf0Var9).get());
            case 24:
                return new x((vmn0) ((uw11) xvf0Var).get(), (a341) xvf0Var10.get(), (j241) xvf0Var8.get(), (ah00) ((pcg) xvf0Var4).get(), (com.yandex.go.walking.navigation.impl.guidance.interactor.k) xvf0Var7.get(), (a640) ((jv21) xvf0Var3).get(), (n241) ((ocg) xvf0Var2).get(), (q541) ((ocg) xvf0Var9).get(), (g241) xvf0Var6.get(), (a3l0) xvf0Var5.get());
            default:
                return new WebViewFragment((oq41) ((rbg) xvf0Var10).get(), (ls41) ((rbg) xvf0Var8).get(), (um41) ((rbg) xvf0Var7).get(), (iv41) ((n3w) xvf0Var6).a, (mv41) ((n3w) xvf0Var5).a, (pv41) ((rbg) xvf0Var).get(), (AppAnalyticsReporter) ((rbg) xvf0Var4).get(), (dj51) ((rbg) xvf0Var3).get(), (pu41) ((rbg) xvf0Var2).get(), (r450) ((n3w) xvf0Var9).a);
        }
    }

    public /* synthetic */ h0l0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, int i) {
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
    }

    public h0l0(l7g l7gVar, e7g e7gVar, j7g j7gVar, k7g k7gVar, m580 m580Var, xvf0 xvf0Var, z8n0 z8n0Var, lwl0 lwl0Var, pmn0 pmn0Var, z8n0 z8n0Var2) {
        this.a = 3;
        this.b = l7gVar;
        this.c = e7gVar;
        this.d = j7gVar;
        this.e = k7gVar;
        this.f = m580Var;
        this.g = xvf0Var;
        this.h = z8n0Var;
        this.i = lwl0Var;
        this.k = pmn0Var;
        this.j = z8n0Var2;
    }

    public h0l0(xvf0 xvf0Var, gbg gbgVar, xvf0 xvf0Var2, gbg gbgVar2, gbg gbgVar3, gbg gbgVar4, mzf mzfVar, c1 c1Var, dx9 dx9Var, flx0 flx0Var) {
        this.a = 2;
        this.b = xvf0Var;
        this.d = gbgVar;
        this.c = xvf0Var2;
        this.e = gbgVar2;
        this.f = gbgVar3;
        this.g = gbgVar4;
        this.h = mzfVar;
        this.i = c1Var;
        this.j = dx9Var;
        this.k = flx0Var;
    }

    public /* synthetic */ h0l0(v7p v7pVar, v7p v7pVar2, v7p v7pVar3, v7p v7pVar4, v7p v7pVar5, v7p v7pVar6, v7p v7pVar7, v7p v7pVar8, v7p v7pVar9, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = v7pVar;
        this.d = v7pVar2;
        this.e = v7pVar3;
        this.f = v7pVar4;
        this.g = v7pVar5;
        this.h = v7pVar6;
        this.i = v7pVar7;
        this.j = v7pVar8;
        this.k = v7pVar9;
        this.b = xvf0Var;
    }

    public h0l0(sag sagVar, xvf0 xvf0Var, jcg jcgVar, sk21 sk21Var, xvf0 xvf0Var2, jcg jcgVar2, jcg jcgVar3, xvf0 xvf0Var3, eqh eqhVar, jcg jcgVar4) {
        this.a = 21;
        this.e = sagVar;
        this.b = xvf0Var;
        this.f = jcgVar;
        this.g = sk21Var;
        this.c = xvf0Var2;
        this.h = jcgVar2;
        this.i = jcgVar3;
        this.d = xvf0Var3;
        this.j = eqhVar;
        this.k = jcgVar4;
    }

    public h0l0(n3w n3wVar, xvf0 xvf0Var, qcb qcbVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, gpx0 gpx0Var, i020 i020Var, eqh eqhVar, xvf0 xvf0Var5) {
        this.a = 1;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.j = qcbVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.k = gpx0Var;
        this.g = i020Var;
        this.h = eqhVar;
        this.i = xvf0Var5;
    }

    public h0l0(n3w n3wVar, xvf0 xvf0Var, a4t a4tVar, f9t f9tVar, xvf0 xvf0Var2, z0s0 z0s0Var, tgb0 tgb0Var, v8c0 v8c0Var, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 14;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = a4tVar;
        this.e = f9tVar;
        this.f = xvf0Var2;
        this.j = z0s0Var;
        this.k = tgb0Var;
        this.g = v8c0Var;
        this.h = xvf0Var3;
        this.i = xvf0Var4;
    }

    public h0l0(uw11 uw11Var, ocg ocgVar, ocg ocgVar2, pcg pcgVar, xvf0 xvf0Var, jv21 jv21Var, ocg ocgVar3, ocg ocgVar4, xvf0 xvf0Var2, pcg pcgVar2) {
        this.a = 24;
        this.g = uw11Var;
        this.b = ocgVar;
        this.c = ocgVar2;
        this.h = pcgVar;
        this.d = xvf0Var;
        this.i = jv21Var;
        this.j = ocgVar3;
        this.k = ocgVar4;
        this.e = xvf0Var2;
        this.f = pcgVar2;
    }

    public h0l0(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, wun0 wun0Var, bwn0 bwn0Var, mbo0 mbo0Var, xvf0 xvf0Var5, ivo0 ivo0Var) {
        this.a = 7;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = wun0Var;
        this.k = bwn0Var;
        this.h = mbo0Var;
        this.i = xvf0Var5;
        this.j = ivo0Var;
    }

    public h0l0(xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, iag iagVar) {
        this.a = 15;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.j = n3wVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.k = iagVar;
    }

    public h0l0(ggl0 ggl0Var, xvf0 xvf0Var, ur3 ur3Var, yxm0 yxm0Var, l7g l7gVar, m7g m7gVar, m7g m7gVar2, jpn0 jpn0Var, m7g m7gVar3, jpn0 jpn0Var2) {
        this.a = 4;
        this.b = ggl0Var;
        this.c = xvf0Var;
        this.g = ur3Var;
        this.d = yxm0Var;
        this.e = l7gVar;
        this.h = m7gVar;
        this.i = m7gVar2;
        this.j = jpn0Var;
        this.f = m7gVar3;
        this.k = jpn0Var2;
    }

    public h0l0(z8n0 z8n0Var, gzn0 gzn0Var, j7g j7gVar, k7g k7gVar, e7g e7gVar, xvf0 xvf0Var, mam0 mam0Var, l7g l7gVar, l7g l7gVar2, bwn0 bwn0Var) {
        this.a = 5;
        this.e = z8n0Var;
        this.f = gzn0Var;
        this.b = j7gVar;
        this.c = k7gVar;
        this.g = e7gVar;
        this.d = xvf0Var;
        this.h = mam0Var;
        this.i = l7gVar;
        this.j = l7gVar2;
        this.k = bwn0Var;
    }

    public h0l0(r9g r9gVar, n3w n3wVar, n3w n3wVar2, x2g x2gVar, xv8 xv8Var, s9g s9gVar, r9g r9gVar2, k4 k4Var, s9g s9gVar2, s9g s9gVar3) {
        this.a = 9;
        this.i = r9gVar;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = x2gVar;
        this.e = xv8Var;
        this.f = s9gVar;
        this.g = r9gVar2;
        this.j = k4Var;
        this.h = s9gVar2;
        this.k = s9gVar3;
    }

    public h0l0(mg11 mg11Var, y2s0 y2s0Var, ze zeVar, yc ycVar, hs30 hs30Var, peb pebVar, mz70 mz70Var, pmn0 pmn0Var, e840 e840Var, pgi pgiVar) {
        this.a = 17;
        this.d = mg11Var;
        this.e = y2s0Var;
        this.f = zeVar;
        this.g = ycVar;
        this.h = hs30Var;
        this.i = pebVar;
        this.j = mz70Var;
        this.k = pmn0Var;
        this.b = e840Var;
        this.c = pgiVar;
    }

    public h0l0(pcz0 pcz0Var, n3w n3wVar, v8c0 v8c0Var, ze zeVar, k0n k0nVar, wvq wvqVar, xvf0 xvf0Var, h0z h0zVar, zo0 zo0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 19;
        this.b = n3wVar;
        this.c = v8c0Var;
        this.g = zeVar;
        this.h = k0nVar;
        this.i = wvqVar;
        this.d = xvf0Var;
        this.j = h0zVar;
        this.k = zo0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
    }
}
