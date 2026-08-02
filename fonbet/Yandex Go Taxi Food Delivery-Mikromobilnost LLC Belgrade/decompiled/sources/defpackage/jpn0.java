package defpackage;

import android.app.Activity;
import android.content.Context;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.go.scooters.ignition.domain.n;
import com.yandex.go.scooters.offer_on_camera.b;
import com.yandex.go.scooters.offer_on_camera.domain.a;
import com.yandex.go.tariffcard.interactor.x;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.main.h;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.go.yb.domain.f0;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.data.cache.StoredDataEntry;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;
import ru.yandex.taxi.net.tracker.f;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.requirements.interactor.e0;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.sdc.router.e;
import ru.yandex.taxi.summary.requirements.list.interactors.o;
import ru.yandex.taxi.summary.requirements.list.interactors.u0;
import ru.yandex.taxi.summary.requirements.list.interactors.y;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class jpn0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;

    public jpn0(w0g w0gVar, xvf0 xvf0Var, w0g w0gVar2, z0g z0gVar, z0g z0gVar2, xvf0 xvf0Var2, xvf0 xvf0Var3, q02 q02Var) {
        this.a = 15;
        this.b = w0gVar;
        this.c = xvf0Var;
        this.h = w0gVar2;
        this.d = z0gVar;
        this.e = z0gVar2;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.i = q02Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Object failure;
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        xvf0 xvf0Var5 = this.i;
        xvf0 xvf0Var6 = this.h;
        xvf0 xvf0Var7 = this.g;
        xvf0 xvf0Var8 = this.f;
        switch (i) {
            case 0:
                return new w040((Context) xvf0Var4.get(), (pav) xvf0Var3.get(), (tse) xvf0Var2.get(), (k7x0) xvf0Var.get(), (pwy0) xvf0Var8.get(), (c) xvf0Var7.get(), (tj60) ((k7g) xvf0Var5).get(), (brn0) xvf0Var6.get());
            case 1:
                return new n((y50) xvf0Var4.get(), (k0b0) ((l7g) xvf0Var).get(), (g) ((e7g) xvf0Var8).get(), (c1n0) ((yxm0) xvf0Var7).get(), (qwo0) xvf0Var3.get(), (v7j0) ((l7g) xvf0Var6).get(), (ru.yandex.taxi.systemrequeirements.location.n) ((k7g) xvf0Var5).get(), (m2o0) xvf0Var2.get());
            case 2:
                return new b(this.b, this.c, (MapNotificationsMuteRepository) xvf0Var2.get(), (a) ((adn0) xvf0Var5).get(), this.e, (xpo0) xvf0Var8.get(), (q) xvf0Var7.get(), (i7n0) xvf0Var6.get());
            case 3:
                return new vep0((com.yandex.go.analytics.b) xvf0Var4.get(), (c1x0) ((uzu0) xvf0Var7).get(), (qh31) xvf0Var3.get(), (ghd) ((peb) xvf0Var6).get(), (pev0) xvf0Var2.get(), (hi31) xvf0Var.get(), (lh31) xvf0Var8.get(), (uio0) ((mg11) xvf0Var5).get());
            case 4:
                return new w040((wiq0) xvf0Var4.get(), (ftx) xvf0Var3.get(), (dqe0) xvf0Var2.get(), (ru.yandex.taxi.sdc.route.repository.a) xvf0Var.get(), (bmp0) ((wun0) xvf0Var5).get(), (mhf) xvf0Var8.get(), (e) xvf0Var7.get(), (com.yandex.go.route.interactor.c) xvf0Var6.get());
            case 5:
                Moshi moshi = (Moshi) xvf0Var4.get();
                nbp0 nbp0Var = (nbp0) xvf0Var3.get();
                Context context = (Context) xvf0Var2.get();
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) xvf0Var.get();
                dpp0 dpp0Var = (dpp0) xvf0Var8.get();
                com.ybsdk.rconfig.b bVar = (com.ybsdk.rconfig.b) xvf0Var7.get();
                Set set = (Set) ((y2r0) xvf0Var5).get();
                awa0 awa0Var = (awa0) xvf0Var6.get();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    linkedHashMap.putAll(((zvj0) it.next()).provide());
                }
                if8 if8Var = new if8(bVar);
                uvj0 uvj0Var = new uvj0();
                m mVar = new m();
                mVar.a = moshi;
                mVar.b = linkedHashMap;
                mVar.c = uvj0Var;
                mVar.d = awa0Var;
                File file = new File(context.getCacheDir(), "common_data");
                mVar.e = file;
                File file2 = new File(context.getCacheDir(), "common_data_meta_info");
                mVar.f = file2;
                File file3 = new File(context.getCacheDir(), "responses");
                mVar.g = file3;
                File file4 = new File(context.getCacheDir(), "responses_meta_info");
                mVar.h = file4;
                mVar.i = Types.newParameterizedType(Map.class, String.class, StoredDataEntry.class);
                mVar.j = kotlin.a.a(new c1o(23, mVar));
                try {
                    file.createNewFile();
                    file2.createNewFile();
                    file3.mkdir();
                    file4.mkdir();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    x4c.g("Failed to init file response cache storage", a, null, Collections.singletonList(lrp0.z), 4);
                }
                return new com.ybsdk.core.common.data.cache.b(nbp0Var, if8Var, linkedHashMap, appAnalyticsReporter, dpp0Var, new vr(context, (char) 0), mVar);
            case 6:
                return new iyp0((g701) ((hbg) xvf0Var).b.b, (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var8).get(), (ru.yandex.taxi.logistics.sdk.delivery.edit.b) ((gbg) xvf0Var7).get(), (ov7) xvf0Var4.get(), (p1b) ((dx9) xvf0Var6).get(), (uy31) xvf0Var3.get(), (i) xvf0Var2.get(), (v6s) ((gbg) xvf0Var5).get());
            case 7:
                return new SelectedMessagesPanel((Activity) xvf0Var4.get(), (g0) xvf0Var3.get(), (uv10) xvf0Var2.get(), (xs10) xvf0Var.get(), (nrh) ((eqh) xvf0Var6).get(), (ofq0) ((oto0) xvf0Var5).get(), (su10) xvf0Var8.get(), (mdb) xvf0Var7.get());
            case 8:
                return new bvq0((Context) ((q1g) xvf0Var4).get(), (w030) ((d2g) xvf0Var3).get(), (pgk0) ((gaq0) xvf0Var2).get(), (com.yandex.go.information.domain.c) ((e3u) xvf0Var).get(), (d2g) xvf0Var8, (eqh) xvf0Var7, (d2g) xvf0Var6, (y50) ((q1g) xvf0Var5).get());
            case 9:
                return new ShortcutsMainScreen((Context) ((x2g) xvf0Var3).get(), (h) ((zs0) xvf0Var2).get(), ((w2g) xvf0Var).b.G(), i5m.a((m7q0) xvf0Var8), ((w2g) xvf0Var7).b.E0(), i5m.a(xvf0Var4), (w6r) ((w2g) xvf0Var6).get(), ((w2g) xvf0Var5).b.Y0());
            case 10:
                return new x7t0((kdd0) ((vfg0) xvf0Var4).get(), (ru.yandex.taxi.summary.requirements.list.interactors.a) ((ht0) xvf0Var3).get(), (y) ((xv8) xvf0Var2).get(), (ru.yandex.taxi.summary.requirements.list.interactors.i) ((ncb) xvf0Var).get(), (u0) ((ubq0) xvf0Var8).get(), (joj0) ((hs30) xvf0Var7).get(), (npj0) ((cta0) xvf0Var6).get(), (o) ((e3u) xvf0Var5).get());
            case 11:
                return new cft0((d6l0) xvf0Var4.get(), (uq40) xvf0Var3.get(), (mqz0) xvf0Var2.get(), (evr) xvf0Var.get(), (r) xvf0Var8.get(), (ru.yandex.taxi.preorder.source.data.c) xvf0Var7.get(), (zit0) xvf0Var6.get(), (tt) ((o4f) xvf0Var5).get());
            case 12:
                com.yandex.go.taxi.order.net.tracker.e eVar = (com.yandex.go.taxi.order.net.tracker.e) xvf0Var4.get();
                jtq0 jtq0Var = (jtq0) xvf0Var3.get();
                tt2 tt2Var = (tt2) ((f4g) xvf0Var5).get();
                return new f(eVar, jtq0Var, this.d, (oel0) xvf0Var.get(), i5m.a(xvf0Var7), i5m.a(xvf0Var8), tt2Var, (com.yandex.go.taxi.order.net.xiva.n) xvf0Var6.get());
            case 13:
                return new com.ybsdk.utils.b((Activity) xvf0Var4.get(), (Context) xvf0Var3.get(), (tfl0) xvf0Var.get(), (uvt0) xvf0Var8.get(), (bwt0) ((eu0) xvf0Var5).get(), (mu31) xvf0Var7.get(), (com.ybsdk.persistence.b) xvf0Var6.get(), (com.ybsdk.rconfig.b) xvf0Var2.get());
            case 14:
                return new ru.yandex.taxi.surge.mapper.a((Context) ((nag) xvf0Var2).get(), (ru.yandex.taxi.widget.utils.e) xvf0Var4.get(), (pdc) ((nag) xvf0Var).get(), (ru.yandex.taxi.design.utils.b) ((kpp0) xvf0Var8).get(), (qbl0) ((rag) xvf0Var7).get(), (v3j) ((rag) xvf0Var6).get(), (xdf) ((nag) xvf0Var5).get(), (quw0) xvf0Var3.get());
            case 15:
                return new x((zuj0) xvf0Var4.get(), (SummaryStateTracker) xvf0Var3.get(), (wiq0) ((w0g) xvf0Var6).get(), (ypj0) xvf0Var2.get(), (wpj0) xvf0Var.get(), (ytx) xvf0Var8.get(), (y7r) xvf0Var7.get(), (com.yandex.go.tariffcard.experiment.n) ((q02) xvf0Var5).get());
            case 16:
                Activity activity = (Activity) xvf0Var4.get();
                odz0 odz0Var = (odz0) xvf0Var3.get();
                h3y a2 = i5m.a(xvf0Var2);
                j0x j0xVar = (j0x) xvf0Var.get();
                e2k0 e2k0Var = (e2k0) xvf0Var8.get();
                com.yandex.messaging.ui.timeline.b bVar2 = (com.yandex.messaging.ui.timeline.b) xvf0Var7.get();
                i1b i1bVar = (i1b) ((mu7) xvf0Var5).get();
                return new hcz0(activity, odz0Var, a2, j0xVar, e2k0Var, bVar2, i1bVar);
            case 17:
                return new uqz0((kcz0) ((flx0) xvf0Var3).get(), (s6k0) ((jpj0) xvf0Var2).get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) ((x0g) xvf0Var).get(), (yit0) ((b1g) xvf0Var8).get(), (ppz0) ((u6o0) xvf0Var7).get(), (opz0) xvf0Var4.get(), (biv0) ((b1g) xvf0Var6).get(), (moz0) ((w7y0) xvf0Var5).get());
            case 18:
                return new ru.yandex.taxi.orderbutton.toll_roads.interactors.b((tt2) xvf0Var4.get(), (wiq0) ((w0g) xvf0Var8).get(), (ru.yandex.taxi.preorder.tollroad.data.e) xvf0Var3.get(), (opz0) xvf0Var2.get(), (ow11) xvf0Var.get(), (tnm0) ((vfg0) xvf0Var7).get(), (ipj0) ((jpj0) xvf0Var6).get(), (fjx0) ((y2s0) xvf0Var5).get());
            case 19:
                return new ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e((f801) xvf0Var4.get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.f) xvf0Var3.get(), (jwh) xvf0Var2.get(), (vri) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.delivery.edit.b) ((jbg) xvf0Var8).get(), (ru.yandex.taxi.logistics.sdk.management.localstate.e) ((jbg) xvf0Var7).get(), (st2) ((jbg) xvf0Var6).get(), (v6s) ((jbg) xvf0Var5).get());
            case 20:
                return new com.yandex.go.trusted_contacts.data.repositories.a((on2) ((tbg) xvf0Var).get(), (yg11) xvf0Var4.get(), (ish) xvf0Var3.get(), (i47) ((m430) xvf0Var8).get(), (xrh) xvf0Var2.get(), (a22) ((m430) xvf0Var7).get(), (cjw0) ((mg11) xvf0Var6).get(), (tt2) ((tbg) xvf0Var5).get());
            case 21:
                return new x421((e0) xvf0Var4.get(), (tt2) xvf0Var3.get(), (wiq0) ((w0g) xvf0Var6).get(), (hqj0) xvf0Var2.get(), (cjj0) xvf0Var.get(), (dqe0) ((w0g) xvf0Var5).get(), (bqj0) xvf0Var8.get(), (vfx0) xvf0Var7.get());
            case 22:
                return new com.ybsdk.screens.upgrade.presentation.main.a((com.ybsdk.screens.upgrade.domain.interactors.c) xvf0Var4.get(), (np41) xvf0Var3.get(), (des0) xvf0Var2.get(), (lb21) ((mg11) xvf0Var5).get(), (com.ybsdk.rconfig.b) xvf0Var.get(), (AppAnalyticsReporter) xvf0Var8.get(), (j3h) xvf0Var7.get(), (tfl0) xvf0Var6.get());
            case 23:
                return new com.yandex.go.data.repositories.h((on2) xvf0Var4.get(), (com.yandex.go.repositories.e) xvf0Var3.get(), (com.yandex.go.data.mappers.a) xvf0Var2.get(), (tt2) xvf0Var.get(), (rq21) xvf0Var8.get(), (sq21) xvf0Var7.get(), ((Boolean) ((n3w) xvf0Var6).a).booleanValue(), (icg) xvf0Var5);
            case 24:
                return new com.yandex.go.taxi.summary.router.b((djt0) xvf0Var4.get(), (crv0) xvf0Var3.get(), (eh2) xvf0Var2.get(), (qx60) xvf0Var.get(), (biv0) ((b1g) xvf0Var7).get(), (mov0) xvf0Var8.get(), (h0l0) xvf0Var6, (ru.yandex.taxi.deeplinks.b) ((g0g) xvf0Var5).get());
            case 25:
                return new WhereYouAreModalView((Activity) ((c1g) xvf0Var3).get(), (yy41) ((e641) xvf0Var2).get(), (a3v) ((c1g) xvf0Var).get(), (dz41) ((ucg) xvf0Var8).get(), (hz41) xvf0Var4.get(), (kr0) ((c1g) xvf0Var7).get(), (cz41) ((f241) xvf0Var6).get(), (mzb) ((c1g) xvf0Var5).get());
            default:
                return new f0((com.yandex.go.yb.data.e) xvf0Var4.get(), (tse) xvf0Var3.get(), (ru.yandex.taxi.am.g) ((pcg) xvf0Var8).get(), (tt2) xvf0Var2.get(), (cda0) xvf0Var.get(), (qyz) ((pcg) xvf0Var7).get(), (qy51) ((xcg) xvf0Var6).get(), (py51) ((yn51) xvf0Var5).get());
        }
    }

    public /* synthetic */ jpn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.i = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = v7pVar2;
    }

    public /* synthetic */ jpn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.i = xvf0Var7;
        this.h = xvf0Var8;
    }

    public /* synthetic */ jpn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
    }

    public jpn0(s0g s0gVar, uzu0 uzu0Var, xvf0 xvf0Var, peb pebVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, mg11 mg11Var) {
        this.a = 3;
        this.b = s0gVar;
        this.g = uzu0Var;
        this.c = xvf0Var;
        this.h = pebVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.i = mg11Var;
    }

    public /* synthetic */ jpn0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.d = v7pVar;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.b = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
    }

    public jpn0(nag nagVar, xvf0 xvf0Var, nag nagVar2, kpp0 kpp0Var, rag ragVar, rag ragVar2, nag nagVar3, xvf0 xvf0Var2) {
        this.a = 14;
        this.d = nagVar;
        this.b = xvf0Var;
        this.e = nagVar2;
        this.f = kpp0Var;
        this.g = ragVar;
        this.h = ragVar2;
        this.i = nagVar3;
        this.c = xvf0Var2;
    }

    public jpn0(xvf0 xvf0Var, xvf0 xvf0Var2, pcg pcgVar, xvf0 xvf0Var3, xvf0 xvf0Var4, pcg pcgVar2, xcg xcgVar, yn51 yn51Var) {
        this.a = 26;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = pcgVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = pcgVar2;
        this.h = xcgVar;
        this.i = yn51Var;
    }

    public jpn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, wun0 wun0Var, xvf0 xvf0Var5, xvf0 xvf0Var6, qxu0 qxu0Var) {
        this.a = 4;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.i = wun0Var;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = qxu0Var;
    }

    public jpn0(t0g t0gVar, w0g w0gVar, x0g x0gVar, xvf0 xvf0Var, rct0 rct0Var, vfg0 vfg0Var, jpj0 jpj0Var, y2s0 y2s0Var) {
        this.a = 18;
        this.b = t0gVar;
        this.f = w0gVar;
        this.c = x0gVar;
        this.d = xvf0Var;
        this.e = rct0Var;
        this.g = vfg0Var;
        this.h = jpj0Var;
        this.i = y2s0Var;
    }

    public jpn0(a1g a1gVar, xvf0 xvf0Var, t0g t0gVar, z0g z0gVar, b1g b1gVar, l9t0 l9t0Var, h0l0 h0l0Var, g0g g0gVar) {
        this.a = 24;
        this.b = a1gVar;
        this.c = xvf0Var;
        this.d = t0gVar;
        this.e = z0gVar;
        this.g = b1gVar;
        this.f = l9t0Var;
        this.h = h0l0Var;
        this.i = g0gVar;
    }

    public jpn0(c1g c1gVar, e641 e641Var, c1g c1gVar2, ucg ucgVar, xvf0 xvf0Var, c1g c1gVar3, f241 f241Var, c1g c1gVar4) {
        this.a = 25;
        this.c = c1gVar;
        this.d = e641Var;
        this.e = c1gVar2;
        this.f = ucgVar;
        this.b = xvf0Var;
        this.g = c1gVar3;
        this.h = f241Var;
        this.i = c1gVar4;
    }

    public jpn0(hbg hbgVar, mzf mzfVar, gbg gbgVar, xvf0 xvf0Var, dx9 dx9Var, xvf0 xvf0Var2, xvf0 xvf0Var3, gbg gbgVar2) {
        this.a = 6;
        this.e = hbgVar;
        this.f = mzfVar;
        this.g = gbgVar;
        this.b = xvf0Var;
        this.h = dx9Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.i = gbgVar2;
    }

    public jpn0(tbg tbgVar, xvf0 xvf0Var, xvf0 xvf0Var2, m430 m430Var, xvf0 xvf0Var3, m430 m430Var2, mg11 mg11Var, tbg tbgVar2) {
        this.a = 20;
        this.e = tbgVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = m430Var;
        this.d = xvf0Var3;
        this.g = m430Var2;
        this.h = mg11Var;
        this.i = tbgVar2;
    }

    public jpn0(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, ys10 ys10Var, eqh eqhVar, oto0 oto0Var, br10 br10Var, xvf0 xvf0Var3) {
        this.a = 7;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = ys10Var;
        this.h = eqhVar;
        this.i = oto0Var;
        this.f = br10Var;
        this.g = xvf0Var3;
    }

    public jpn0(sb1 sb1Var, t0g t0gVar, w0g w0gVar, a1g a1gVar, z0g z0gVar, w0g w0gVar2, jpf0 jpf0Var, xvf0 xvf0Var) {
        this.a = 21;
        this.b = sb1Var;
        this.c = t0gVar;
        this.h = w0gVar;
        this.d = a1gVar;
        this.e = z0gVar;
        this.i = w0gVar2;
        this.f = jpf0Var;
        this.g = xvf0Var;
    }

    public jpn0(e7g e7gVar, l7g l7gVar, e7g e7gVar2, yxm0 yxm0Var, xvf0 xvf0Var, l7g l7gVar2, k7g k7gVar, m7g m7gVar) {
        this.a = 1;
        this.b = e7gVar;
        this.e = l7gVar;
        this.f = e7gVar2;
        this.g = yxm0Var;
        this.c = xvf0Var;
        this.h = l7gVar2;
        this.i = k7gVar;
        this.d = m7gVar;
    }

    public jpn0(n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var, eqh eqhVar, xvf0 xvf0Var2, eu0 eu0Var, n3w n3wVar3, xvf0 xvf0Var3) {
        this.a = 13;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = xvf0Var;
        this.e = eqhVar;
        this.f = xvf0Var2;
        this.i = eu0Var;
        this.g = n3wVar3;
        this.h = xvf0Var3;
    }

    public jpn0(xvf0 xvf0Var, dag dagVar, f4g f4gVar, dag dagVar2, dag dagVar3, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 12;
        this.b = xvf0Var;
        this.c = dagVar;
        this.i = f4gVar;
        this.d = dagVar2;
        this.e = dagVar3;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.h = xvf0Var4;
    }
}
