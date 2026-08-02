package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.chargers.data.g;
import com.yandex.go.chargers.passes.data.r0;
import com.yandex.go.navigator.driving.c0;
import com.yandex.go.navigator.driving.f;
import com.yandex.go.navigator.map_interactions.parkings.c;
import com.yandex.go.navigator.map_interactions.parkings.h;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.navigator.utils.d;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ui.imageviewer.ImageViewerArgs$Sender;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.m;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot.b;
import ru.yandex.taxi.deeplinks.e;
import ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorModalView;
import ru.yandex.taxi.logistics.sdk.management.j;
import ru.yandex.taxi.sdc.router.a;

/* loaded from: classes5.dex */
public final class gc implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;

    public gc(n3w n3wVar, xvf0 xvf0Var, zbg zbgVar, n3w n3wVar2, ys10 ys10Var, xvf0 xvf0Var2, n3w n3wVar3, av4 av4Var, zbg zbgVar2) {
        this.a = 19;
        this.f = n3wVar;
        this.c = xvf0Var;
        this.d = zbgVar;
        this.b = n3wVar2;
        this.g = ys10Var;
        this.e = xvf0Var2;
        this.h = n3wVar3;
        this.i = av4Var;
        this.j = zbgVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new a((rqo) ((u0g) this.b).get(), (i130) this.c.get(), (ec) this.d.get(), (lc) ((n3w) this.f).a, (rco) this.e.get(), (ru.yandex.taxi.am.token.a) ((z0g) this.g).get(), (fn21) ((y0g) this.h).get(), (vf41) ((c1g) this.i).get(), (tse) ((y0g) this.j).get());
            case 1:
                return new bu0((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.a) ((yc) this.b).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.a) ((faj) this.c).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.a) ((a9i) this.d).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment.a) ((kze) this.e).get(), (b) ((kze) this.f).get(), (u0z) ((kze) this.g).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b) ((a9i) this.h).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.a) ((wvq) this.i).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.field_display.a) ((a9i) this.j).get());
            case 2:
                return new r61((dv8) this.c.get(), (f4l0) this.d.get(), (is0) ((js0) this.b).get(), (p6s) this.e.get(), (bt0) this.f.get(), (z5s) ((prq) this.g).get(), (boj0) ((ncb) this.h).get(), (ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a) ((zs0) this.i).get(), (m2v) ((js0) this.j).get());
            case 3:
                return new do3((nyv) ((v8c0) this.b).get(), (Activity) ((n3w) this.f).a, (pu31) ((nb11) this.g).get(), (com.yandex.messaging.activity.b) this.c.get(), (x22) this.d.get(), (am2) ((nf) this.h).get(), (rz10) this.e.get(), (Bundle) ((n3w) this.i).a, (Bundle) ((n3w) this.j).a);
            case 4:
                return new bu0((Context) this.c.get(), (tse) this.d.get(), (xm00) this.e.get(), (ah00) ((xvf0) this.b).get(), (x980) ((n3w) this.f).a, (ft00) ((zyf) this.g).get(), (t48) ((gw7) this.h).get(), (t58) ((ig7) this.i).get(), (ddf) ((zyf) this.j).get());
            case 5:
                return new h((tt2) this.c.get(), (d) ((bpf) this.b).get(), (j0g) ((fwc) this.f).get(), (e) this.d.get(), (com.yandex.go.navigator.search.a) this.e.get(), (m901) this.g.get(), (c) this.h.get(), (c0) this.i.get(), (q850) ((wz30) this.j).get());
            case 6:
                return new po9((tt2) ((lxf) this.b).get(), (k7x0) this.c.get(), (ru.yandex.taxi.widget.utils.e) this.d.get(), (pwy0) this.e.get(), (iwa) this.f.get(), (vn9) this.g.get(), (g) this.h.get(), (xx9) this.i.get(), (jma) this.j.get());
            case 7:
                return new com.yandex.go.chargers.passes.ui.d((tt2) ((lxf) this.b).get(), (pwy0) this.c.get(), (com.yandex.go.chargers.domain.a) this.d.get(), (r0) this.e.get(), (com.yandex.go.chargers.passes.ui.e) ((xea) this.f).get(), (rja) this.g.get(), (qka) this.h.get(), (com.yandex.go.chargers.payments.data.a) this.i.get(), (kka) this.j.get());
            case 8:
                return new com.yandex.messaging.internal.view.chat.b((ChatRequest) this.c.get(), (u4t) ((k0n) this.b).get(), (xav) this.d.get(), (Activity) this.e.get(), (x22) this.f.get(), (c220) this.g.get(), (e2k0) this.h.get(), (poy0) this.i.get(), (mdb) this.j.get());
            case 9:
                Context context = (Context) this.c.get();
                yj60 yj60Var = (yj60) this.d.get();
                i6b i6bVar = (i6b) this.e.get();
                h6b h6bVar = (h6b) ((xvf0) this.b).get();
                com.yandex.messaging.internal.authorized.chat.notifications.d dVar = (com.yandex.messaging.internal.authorized.chat.notifications.d) ((wvq) this.f).get();
                h3y a = i5m.a(this.g);
                z120 z120Var = (z120) this.h.get();
                return new g6b(context, yj60Var, i6bVar, h6bVar, dVar, a, z120Var, (nxv) this.j.get());
            case 10:
                return new hab((ly10) this.c.get(), (iif) this.d.get(), (iif) this.e.get(), (com.yandex.messaging.internal.view.timeline.suggest.a) ((xvf0) this.b).get(), i5m.a(this.f), (ChatRequest) this.g.get(), (izy0) this.h.get(), (key0) this.i.get(), (acb) ((g3b) this.j).get());
            case 11:
                return new gbi((vsi) this.c.get(), (kki) this.d.get(), (jji0) this.e.get(), (gwh) ((p6f) this.b).get(), (a22) ((p6f) this.f).get(), (u0i) this.g.get(), (a02) ((rwh) this.h).get(), (cpf) this.i.get(), (w810) ((mvy) this.j).get());
            case 12:
                ((exf) this.b).get();
                qcp0 qcp0Var = (qcp0) ((exf) this.c).get();
                ofg ofgVar = (ofg) ((exf) this.d).get();
                st2 st2Var = (st2) ((exf) this.e).get();
                com.yandex.delivery.utils.auth.impl.a aVar = (com.yandex.delivery.utils.auth.impl.a) ((exf) this.f).get();
                yuj0 yuj0Var = (yuj0) ((exf) this.g).get();
                y30 y30Var = (y30) ((exf) this.h).get();
                ((exf) this.i).get();
                ((gxf) this.j).get();
                return new v920(qcp0Var, ofgVar, st2Var, aVar, yuj0Var, y30Var);
            case 13:
                return new f((bkm) this.c.get(), (o) this.d.get(), (wb50) this.e.get(), (com.yandex.go.navigator.domain.e) ((xvf0) this.b).get(), (vxr) ((c0j) this.f).get(), (zuj0) this.g.get(), (nyw) this.h.get(), (xb50) ((e840) this.i).get(), (uyw) this.j.get());
            case 14:
                return new ru.yandex.taxi.due_selector.impl.domain.interactor.d((com.yandex.go.due.data.repository.a) ((izf) this.b).get(), (cjw0) ((gpx0) this.c).get(), (bwm) ((oti) this.d).get(), (ryh) ((izf) this.e).get(), (axm) ((izf) this.f).get(), (y1s) ((izf) this.g).get(), (fwm) ((gwm) this.h).get(), (seq0) ((izf) this.i).get(), (wiq0) ((izf) this.j).get());
            case 15:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data.c((f4l0) this.c.get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) this.b).get(), (l7x0) ((lzf) this.f).get(), (ru.yandex.taxi.logistics.sdk.delivery.edit.b) ((lzf) this.g).get(), (elb0) this.d.get(), (ru.yandex.taxi.logistics.sdk.photocomments.domain.a) this.e.get(), (smn) this.h.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) ((lzf) this.i).get(), (hwy0) ((lzf) this.j).get());
            case 16:
                pkr pkrVar = (pkr) this.b;
                Payer payer = (Payer) this.c.get();
                Merchant merchant = (Merchant) this.d.get();
                Context context2 = (Context) this.e.get();
                rwo rwoVar = (rwo) this.f.get();
                km0 km0Var = (km0) this.g.get();
                nf4 nf4Var = (nf4) this.h.get();
                pcy pcyVar = (pcy) this.i.get();
                izy izyVar = (izy) this.j.get();
                OkHttpClient.a aVar2 = new OkHttpClient.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aVar2.g(30L, timeUnit);
                aVar2.b(30L, timeUnit);
                aVar2.c.add(new mkr(nf4Var, merchant, km0Var, pkrVar, rwoVar, payer, context2, izyVar));
                if (pcyVar.a.getIsDebug()) {
                    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(r1);
                    httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.BODY;
                    aVar2.a(httpLoggingInterceptor);
                }
                return new OkHttpClient(aVar2);
            case 17:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.order.a((ru.yandex.taxi.logistics.sdk.management.f) this.c.get(), (j) this.d.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.repository.c) this.e.get(), (o5s) ((xvf0) this.b).get(), (ru.yandex.taxi.logistics.address.g) this.f.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.c) ((z9n) this.g).get(), (com.yandex.delivery.utils.dialogmanager.a) this.h.get(), (jwh) this.i.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.order.b) ((z9n) this.j).get());
            case 18:
                return new ru.yandex.taxi.order.d((tse) this.c.get(), (d1t) this.d.get(), (ru.yandex.taxi.utils.b) this.e.get(), (k0b0) ((xvf0) this.b).get(), (p2y0) this.f.get(), (po21) this.g.get(), (zuj0) this.h.get(), (h1s) this.i.get(), (hdu) ((rut) this.j).get());
            case 19:
                return new jhv((FragmentActivity) ((n3w) this.f).a, (ImageViewerInfo) this.c.get(), (xav) this.d.get(), (com.yandex.alicekit.core.permissions.b) ((n3w) this.b).a, (xs10) ((ys10) this.g).get(), (com.yandex.messaging.ui.imageviewer.a) this.e.get(), (Bundle) ((n3w) this.h).a, (bhv) ((av4) this.i).get(), (rz10) this.j.get());
            case 20:
                Activity activity = (Activity) ((n3w) this.f).a;
                chv chvVar = (chv) ((n3w) this.b).a;
                k020 k020Var = (k020) this.c.get();
                com.yandex.messaging.internal.authorized.j jVar = (com.yandex.messaging.internal.authorized.j) this.d.get();
                i9b i9bVar = (i9b) this.e.get();
                arg argVar = (arg) this.g.get();
                Bundle bundle = (Bundle) ((n3w) this.h).a;
                ks10 ks10Var = (ks10) this.i.get();
                rp21 rp21Var = (rp21) this.j.get();
                ArrayList arrayList = chvVar.c;
                ImageViewerInfo imageViewerInfo = chvVar.b;
                if (chvVar.a == null || arrayList == null || imageViewerInfo == null) {
                    if (imageViewerInfo != null) {
                        return new nhv(imageViewerInfo);
                    }
                    kbs.f(chvVar, "Invalid arguments passed to imageViewer ");
                    return null;
                }
                ImageViewerInfo imageViewerInfo2 = bundle != null ? (ImageViewerInfo) vng.u(bundle, ImageViewerInfo.class, "state_current_item") : null;
                ArrayList v = bundle != null ? vng.v(bundle, ImageViewerInfo.class, "state_current_gallery") : null;
                ImageViewerInfo imageViewerInfo3 = imageViewerInfo;
                String str = chvVar.a;
                if (imageViewerInfo2 != null) {
                    imageViewerInfo3 = imageViewerInfo2;
                }
                if (v == null) {
                    v = arrayList;
                }
                return new khv(activity, str, imageViewerInfo3, v, k020Var, jVar, i9bVar, argVar, chvVar.d, ks10Var, chvVar.e == ImageViewerArgs$Sender.MediaBrowser ? 1 : 0, rp21Var);
            case 21:
                return new buv((com.yandex.go.information.domain.h) ((prq) this.b).get(), (Context) ((q1g) this.c).get(), (w030) ((d2g) this.d).get(), (com.yandex.go.information.domain.c) ((e3u) this.e).get(), (v3u0) ((d2g) this.f).get(), (d2g) this.g, (eqh) this.h, (d2g) this.i, (y50) ((q1g) this.j).get());
            case 22:
                return new com.yandex.go.intercity.flex.dashboard.router.payment.method.intercity.a((f33) ((d2g) this.b).get(), (ffa0) ((d2g) this.c).get(), (com.yandex.go.payments.delayed.a) ((d2g) this.d).get(), (kpi0) ((f2g) this.e).get(), (wiq0) ((f2g) this.f).get(), (idw) ((rut) this.g).get(), (f2g) this.h, (vj4) ((d2g) this.i).get(), (f9y0) ((f2g) this.j).get());
            case 23:
                Context context3 = (Context) this.c.get();
                YBSdkVisualParams yBSdkVisualParams = (YBSdkVisualParams) this.d.get();
                com.ybsdk.common.repositiories.auth.f fVar = (com.ybsdk.common.repositiories.auth.f) this.e.get();
                ppp0 ppp0Var = (ppp0) ((xvf0) this.b).get();
                j3h j3hVar = (j3h) this.f.get();
                b3z b3zVar = (b3z) this.g.get();
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) this.h.get();
                com.ybsdk.screens.menu.domain.a aVar3 = (com.ybsdk.screens.menu.domain.a) ((mvy) this.i).get();
                return new com.ybsdk.screens.menu.presentation.b(context3, yBSdkVisualParams, fVar, ppp0Var, j3hVar, b3zVar, appAnalyticsReporter, aVar3);
            case 24:
                return new com.ybsdk.feature.merchant.offers.internal.screens.root.b((xl10) ((jl00) this.b).get(), (qp10) ((u2g) this.c).get(), (w4x0) ((j3g) this.d).get(), (com.ybsdk.feature.merchant.offers.internal.domain.interactor.a) ((ip10) this.e).get(), (j3h) ((u2g) this.f).get(), (zq10) ((j3g) this.g).get(), (sb6) ((qo10) this.h).get(), (com.ybsdk.feature.banners.impl.domain.interactors.a) ((jl00) this.i).get(), (c9v) ((qo10) this.j).get());
            case 25:
                return new fw10((naz0) this.c.get(), (sue0) ((jde0) this.b).get(), (k020) this.d.get(), (o1b0) this.e.get(), (n5t0) this.f.get(), (x0j0) this.g.get(), (w3c) this.h.get(), (x22) this.i.get(), (vw10) this.j.get());
            case 26:
                return new com.yandex.go.multimodal_route.order.a((tse) ((y0g) this.j).get(), (wiq0) ((w0g) this.b).get(), (oep0) ((a1g) this.c).get(), (lq40) this.d, (ru.yandex.taxi.widget.c) ((u0g) this.e).get(), (tt2) ((t0g) this.f).get(), (ru.yandex.taxi.preorder.tollroad.data.e) ((x0g) this.g).get(), (qbl0) ((w0g) this.h).get(), (xdf) ((t0g) this.i).get());
            case 27:
                return new NddRouteSelectorModalView((Context) ((l4g) this.b).get(), (a3v) ((n4g) this.d).get(), (yi50) this.c.get(), (uli) ((n4g) this.e).get(), (wif) this.f, (pav) ((n4g) this.g).get(), (k7x0) ((n4g) this.h).get(), (ai50) ((ys10) this.i).get(), (oep0) ((n4g) this.j).get());
            case 28:
                return new ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j((st2) this.c.get(), i5m.a((wvq) this.b), (o5s) this.d.get(), (p6s) this.e.get(), (ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c) this.f.get(), (x230) this.g.get(), (u1n) ((k0n) this.h).get(), (m) ((rct0) this.i).get(), (ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.b) ((js0) this.j).get());
            default:
                return new com.yandex.go.taxi.order.overlay.g((tt2) this.c.get(), (ah00) this.d.get(), (o2y0) this.e.get(), (ru.yandex.taxi.translations.interactor.a) ((xvf0) this.b).get(), (ixx0) this.f.get(), (ney) this.g.get(), (com.yandex.go.taxi.order.provider.a) this.h.get(), (gi70) this.i.get(), (com.yandex.go.taxi.order.search.overlay.companions.a) ((mu7) this.j).get());
        }
    }

    public /* synthetic */ gc(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.b = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
    }

    public /* synthetic */ gc(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.j = xvf0Var8;
    }

    public gc(v8c0 v8c0Var, n3w n3wVar, nb11 nb11Var, xvf0 xvf0Var, ecg ecgVar, nf nfVar, ecg ecgVar2, n3w n3wVar2, n3w n3wVar3) {
        this.a = 3;
        this.b = v8c0Var;
        this.f = n3wVar;
        this.g = nb11Var;
        this.c = xvf0Var;
        this.d = ecgVar;
        this.h = nfVar;
        this.e = ecgVar2;
        this.i = n3wVar2;
        this.j = n3wVar3;
    }

    public /* synthetic */ gc(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, v7p v7pVar, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = v7pVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.j = xvf0Var8;
    }

    public gc(xvf0 xvf0Var, xvf0 xvf0Var2, js0 js0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, prq prqVar, ncb ncbVar, zs0 zs0Var, js0 js0Var2) {
        this.a = 2;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = js0Var;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = prqVar;
        this.h = ncbVar;
        this.i = zs0Var;
        this.j = js0Var2;
    }

    public gc(h4g h4gVar, bpf bpfVar, fwc fwcVar, k4g k4gVar, l4g l4gVar, xvf0 xvf0Var, xvf0 xvf0Var2, fat0 fat0Var, wz30 wz30Var) {
        this.a = 5;
        this.c = h4gVar;
        this.b = bpfVar;
        this.f = fwcVar;
        this.d = k4gVar;
        this.e = l4gVar;
        this.g = xvf0Var;
        this.h = xvf0Var2;
        this.i = fat0Var;
        this.j = wz30Var;
    }

    public gc(l4g l4gVar, n4g n4gVar, xvf0 xvf0Var, n4g n4gVar2, wif wifVar, n4g n4gVar3, n4g n4gVar4, ys10 ys10Var, n4g n4gVar5) {
        this.a = 27;
        this.b = l4gVar;
        this.d = n4gVar;
        this.c = xvf0Var;
        this.e = n4gVar2;
        this.f = wifVar;
        this.g = n4gVar3;
        this.h = n4gVar4;
        this.i = ys10Var;
        this.j = n4gVar5;
    }

    public gc(xvf0 xvf0Var, mzf mzfVar, lzf lzfVar, lzf lzfVar2, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, lzf lzfVar3, lzf lzfVar4) {
        this.a = 15;
        this.c = xvf0Var;
        this.b = mzfVar;
        this.f = lzfVar;
        this.g = lzfVar2;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.h = xvf0Var4;
        this.i = lzfVar3;
        this.j = lzfVar4;
    }

    public gc(y0g y0gVar, w0g w0gVar, a1g a1gVar, lq40 lq40Var, u0g u0gVar, t0g t0gVar, x0g x0gVar, w0g w0gVar2, t0g t0gVar2) {
        this.a = 26;
        this.j = y0gVar;
        this.b = w0gVar;
        this.c = a1gVar;
        this.d = lq40Var;
        this.e = u0gVar;
        this.f = t0gVar;
        this.g = x0gVar;
        this.h = w0gVar2;
        this.i = t0gVar2;
    }

    public gc(n3w n3wVar, n3w n3wVar2, zbg zbgVar, bcg bcgVar, ywf ywfVar, xvf0 xvf0Var, n3w n3wVar3, zbg zbgVar2, acg acgVar) {
        this.a = 20;
        this.f = n3wVar;
        this.b = n3wVar2;
        this.c = zbgVar;
        this.d = bcgVar;
        this.e = ywfVar;
        this.g = xvf0Var;
        this.h = n3wVar3;
        this.i = zbgVar2;
        this.j = acgVar;
    }

    public gc(u0g u0gVar, v0g v0gVar, n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var, z0g z0gVar, y0g y0gVar, c1g c1gVar, y0g y0gVar2) {
        this.a = 0;
        this.b = u0gVar;
        this.c = v0gVar;
        this.d = n3wVar;
        this.f = n3wVar2;
        this.e = xvf0Var;
        this.g = z0gVar;
        this.h = y0gVar;
        this.i = c1gVar;
        this.j = y0gVar2;
    }
}
