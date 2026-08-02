package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.navigator.driving.experiment.d;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.superapp.api.loading_tracker.ServiceLoadingEvent;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.translator.b;
import com.yandex.messaging.internal.translator.k;
import com.yandex.messaging.ui.folders.e;
import com.yandex.messaging.ui.folders.f;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.c;
import ru.yandex.taxi.preorder.repositories.g;
import ru.yandex.taxi.summary.requirements.list.interactors.i;
import ru.yandex.taxi.superapp.j;

/* loaded from: classes5.dex */
public final class ncb implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public ncb(n3w n3wVar, ybg ybgVar, acg acgVar, k0n k0nVar, zbg zbgVar, n3w n3wVar2) {
        this.a = 9;
        this.f = n3wVar;
        this.b = ybgVar;
        this.c = acgVar;
        this.g = k0nVar;
        this.d = zbgVar;
        this.e = n3wVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.g;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new b((ChatRequest) xvf0Var6.get(), (x22) xvf0Var5.get(), (mdb) xvf0Var4.get(), (Lifecycle) xvf0Var.get(), (gzw) ((ret) xvf0Var2).get(), (k) xvf0Var3.get());
            case 1:
                return new v920((Context) xvf0Var6.get(), (k7x0) xvf0Var5.get(), (pav) xvf0Var4.get(), (rfb) ((peb) xvf0Var2).get(), this.e, (oep0) xvf0Var3.get());
            case 2:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.b((a) ((eqh) xvf0Var5).get(), (q8s) ((p1g) xvf0Var4).get(), (p6s) ((p1g) xvf0Var).get(), (l7x0) ((gxf) xvf0Var3).get(), (qdc) ((p1g) xvf0Var2).get(), (m6s) xvf0Var6.get());
            case 3:
                return new c((u3s) ((n3w) xvf0Var6).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.b) ((ncb) xvf0Var5).get(), (hwy0) ((gxf) xvf0Var4).get(), (z4s) ((p1g) xvf0Var).get(), (p6s) ((p1g) xvf0Var3).get(), (sae) ((srb) xvf0Var2).get());
            case 4:
                return new v920((Context) ((n3w) xvf0Var6).a, (qcp0) ((ibg) xvf0Var5).get(), (hwy0) ((ibg) xvf0Var4).get(), (l7x0) ((ibg) xvf0Var).get(), (dci) ((gbg) xvf0Var3).get(), (q8s) ((gbg) xvf0Var2).get());
            case 5:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.contact.a((q8s) ((p1g) xvf0Var6).get(), (a) ((eqh) xvf0Var5).get(), (up21) ((gxf) xvf0Var4).get(), (vbb) ((dx9) xvf0Var).get(), (z5s) ((prq) xvf0Var3).get(), (yuj0) ((gxf) xvf0Var2).get());
            case 6:
                return new boj0((f4l0) xvf0Var6.get(), (is0) ((js0) xvf0Var3).get(), (zqb0) xvf0Var5.get(), (xe00) xvf0Var4.get(), (z5s) ((prq) xvf0Var2).get(), (bbe) xvf0Var.get(), 12);
            case 7:
                return new v920((g191) ((c1) xvf0Var4).get(), (yfa) ((peb) xvf0Var).get(), (oh4) ((qh4) xvf0Var3).get(), (flg) xvf0Var6.get(), (lhg) ((p6f) xvf0Var2).get(), (yuj0) xvf0Var5.get());
            case 8:
                return new i((roj0) xvf0Var6.get(), (vfx0) xvf0Var5.get(), (amc) xvf0Var4.get(), (g) xvf0Var.get(), (ga0) ((zni0) xvf0Var2).get(), (tt2) xvf0Var3.get());
            case 9:
                return new e((u4f) ((n3w) xvf0Var3).a, (k5f) xvf0Var6.get(), (d721) xvf0Var5.get(), (f) ((k0n) xvf0Var2).get(), (n7t) xvf0Var4.get(), (kt11) xvf0Var.get());
            case 10:
                psp0 psp0Var = (psp0) ((ayf) xvf0Var6).get();
                ((kk) xvf0Var5).get();
                return new xmg(psp0Var, (dlg) ((ayf) xvf0Var4).get(), (ha60) ((ayf) xvf0Var).get(), (Context) ((oxf) xvf0Var3).get(), (yig) ((oxf) xvf0Var2).get());
            case 11:
                return new vu8((Context) xvf0Var6.get(), (w030) xvf0Var5.get(), (sk7) ((zfa) xvf0Var).get(), (gvd) ((peb) xvf0Var3).get(), (sue0) ((zni0) xvf0Var2).get(), (pav) xvf0Var4.get(), 1);
            case 12:
                return new dvh((d800) ((dyf) xvf0Var6).get(), (wwf) ((wif) xvf0Var5).get(), (zgf) ((gmh) xvf0Var4).get(), (vp21) ((dyf) xvf0Var).get(), (dqe0) ((dyf) xvf0Var3).get(), (gsi) ((dyf) xvf0Var2).get());
            case 13:
                return new fvh((bvh) ((n3w) xvf0Var6).a, (zgf) ((gmh) xvf0Var5).get(), (nu0) ((dyf) xvf0Var4).get(), (qnh) ((kk) xvf0Var).get(), (wwf) ((wif) xvf0Var3).get(), (dvh) ((ncb) xvf0Var2).get());
            case 14:
                return new s8i((r8i) ((n3w) xvf0Var6).a, (m8i) ((fwc) xvf0Var5).get(), (zch) ((rwh) xvf0Var4).get(), (y8i) ((n3w) xvf0Var).a, (j0g) ((wif) xvf0Var3).get(), (vmn0) ((u6o0) xvf0Var2).get());
            case 15:
                return new ggi((wiq0) ((w0g) xvf0Var3).get(), (gsi) xvf0Var6.get(), (ozt0) xvf0Var5.get(), (d770) xvf0Var4.get(), (zch) ((gmh) xvf0Var2).get(), (oep0) xvf0Var.get(), 0);
            case 16:
                return new ru.yandex.taxi.logistics.photocomment.a((elb0) ((gyf) xvf0Var4).get(), (abe) ((vqa0) xvf0Var).get(), (tt2) xvf0Var6.get(), (gdi) ((rwh) xvf0Var3).get(), (hit) ((fyf) xvf0Var2).get(), (com.yandex.delivery.libs.imageupload.impl.domain.b) xvf0Var5.get());
            case 17:
                return new com.yandex.go.delivery.rental_duration_selector.e((kmi) ((n3w) xvf0Var6).a, (bzi0) ((n4g0) xvf0Var5).get(), (n3h) ((oyf) xvf0Var4).get(), (gmi) ((wif) xvf0Var).get(), (wiq0) ((oyf) xvf0Var3).get(), (uze0) ((oyf) xvf0Var2).get());
            case 18:
                return new ru.yandex.taxi.logistics.delivery_form.repository.a((ck31) xvf0Var6.get(), (wiq0) xvf0Var5.get(), (ghx0) xvf0Var4.get(), (tt2) xvf0Var.get(), (gwh) ((rbx0) xvf0Var2).get(), (w1i) xvf0Var3.get());
            case 19:
                return new vu8((Activity) xvf0Var6.get(), (wiq0) xvf0Var5.get(), (ynj0) xvf0Var4.get(), (g580) ((n3w) xvf0Var).a, (w3i) ((wj0) xvf0Var3).get(), (yzh) ((gmh) xvf0Var2).get(), 2);
            case 20:
                return new wti((ut90) xvf0Var6.get(), (k7x0) xvf0Var5.get(), (wt90) xvf0Var4.get(), (iii) xvf0Var.get(), (gde) ((miv0) xvf0Var2).get(), (oep0) xvf0Var3.get());
            case 21:
                return new boj0((Context) xvf0Var6.get(), (zuj0) xvf0Var5.get(), (s0c0) xvf0Var4.get(), (ru.yandex.taxi.design.utils.a) xvf0Var.get(), (sgu0) xvf0Var3.get(), (bzi) ((rwh) xvf0Var2).get(), 16);
            case 22:
                return new d0j((wiq0) ((w0g) xvf0Var6).get(), (a40) ((gmh) xvf0Var5).get(), (set0) ((a1g) xvf0Var4).get(), (yj70) ((f380) xvf0Var).get(), (b0j) ((c0j) xvf0Var3).get(), (gsi) ((s0g) xvf0Var2).get());
            case 23:
                return new zjm((com.yandex.go.navigator.gas_stations.experiment.c) xvf0Var6.get(), (ipv) xvf0Var5.get(), (com.yandex.go.navigator.share.experiment.c) xvf0Var4.get(), (d) xvf0Var.get(), (re50) xvf0Var3.get(), (com.yandex.go.navigator.driving.analytics.a) ((vfg0) xvf0Var2).get());
            case 24:
                return new ru.yandex.taxi.due_selector.impl.domain.interactor.a((uvm) xvf0Var6.get(), (tt2) ((izf) xvf0Var5).get(), (bwm) ((oti) xvf0Var4).get(), (ru.yandex.taxi.due_selector.impl.domain.interactor.price.e) ((bpf) xvf0Var).get(), (ru.yandex.taxi.due_selector.impl.domain.interactor.price.f) ((pgi) xvf0Var3).get(), (rvm) ((gmh) xvf0Var2).get());
            case 25:
                return new v920((wiq0) ((fzf) xvf0Var6).get(), (ynm0) ((fzf) xvf0Var5).get(), (y1s) ((fzf) xvf0Var4).get(), (axm) ((fzf) xvf0Var).get(), (d6i) ((jde0) xvf0Var3).get(), (zuj0) ((fzf) xvf0Var2).get());
            case 26:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.editable_route_widget.b((u3s) ((n3w) xvf0Var6).a, (p6s) ((p1g) xvf0Var5).get(), (hwy0) ((gxf) xvf0Var4).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.editable_route_widget.a) ((oti) xvf0Var).get(), (z4s) ((p1g) xvf0Var3).get(), (sae) ((srb) xvf0Var2).get());
            case 27:
                return new k5o((m5o) xvf0Var6.get(), (by10) ((br10) xvf0Var3).get(), (az10) ((q720) xvf0Var2).get(), (x22) xvf0Var5.get(), (ph9) xvf0Var4.get(), (Moshi) xvf0Var.get());
            case 28:
                z4m0 z4m0Var = (z4m0) ((tzf) xvf0Var2).get();
                tse tseVar = (tse) xvf0Var6.get();
                h1p h1pVar = (h1p) xvf0Var5.get();
                s2p s2pVar = (s2p) xvf0Var4.get();
                s2p s2pVar2 = (s2p) xvf0Var.get();
                s2p s2pVar3 = (s2p) xvf0Var3.get();
                return new j(tseVar, h1pVar, (hgn) z4m0Var.b, (yrv0) z4m0Var.c, (bj20) z4m0Var.z, (ru.yandex.taxi.superapp.payment.a) z4m0Var.w, (h) z4m0Var.x, (jc00) z4m0Var.y, (y5w0) z4m0Var.A, s2pVar, s2pVar2, s2pVar3);
            default:
                x6w0 x6w0Var = (x6w0) xvf0Var6.get();
                com.yandex.go.superapp.web.view.a aVar = (com.yandex.go.superapp.web.view.a) xvf0Var5.get();
                x1p x1pVar = (x1p) xvf0Var4.get();
                s7w0 s7w0Var = (s7w0) xvf0Var.get();
                rvq0 rvq0Var = (rvq0) xvf0Var3.get();
                kpe0 kpe0Var = (kpe0) ((szf) xvf0Var2).get();
                rvq0Var.a(ServiceLoadingEvent.WEBVIEW_CREATE_START);
                q7w0 q7w0Var = (q7w0) kpe0Var.a.remove(x6w0Var.a);
                if (q7w0Var != null) {
                    q7w0Var.prepareForReuse(s7w0Var);
                } else {
                    q7w0Var = null;
                }
                if (q7w0Var == null) {
                    q7w0Var = com.yandex.go.superapp.web.view.a.a(aVar, x6w0Var.C, null, null, s7w0Var, 6);
                }
                x1pVar.a(new o1p(q7w0Var, x1pVar));
                rvq0Var.a(ServiceLoadingEvent.WEBVIEW_CREATE_FINISH);
                return q7w0Var;
        }
    }

    public /* synthetic */ ncb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public ncb(c1 c1Var, peb pebVar, qh4 qh4Var, xvf0 xvf0Var, p6f p6fVar, xvf0 xvf0Var2) {
        this.a = 7;
        this.d = c1Var;
        this.e = pebVar;
        this.f = qh4Var;
        this.b = xvf0Var;
        this.g = p6fVar;
        this.c = xvf0Var2;
    }

    public /* synthetic */ ncb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar;
        this.f = xvf0Var5;
    }

    public ncb(xvf0 xvf0Var, br10 br10Var, q720 q720Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 27;
        this.b = xvf0Var;
        this.f = br10Var;
        this.g = q720Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public ncb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, peb pebVar, vrt0 vrt0Var, eqh eqhVar) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = pebVar;
        this.e = vrt0Var;
        this.f = eqhVar;
    }

    public ncb(xvf0 xvf0Var, js0 js0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, prq prqVar, xvf0 xvf0Var4) {
        this.a = 6;
        this.b = xvf0Var;
        this.f = js0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = prqVar;
        this.e = xvf0Var4;
    }

    public ncb(w0g w0gVar, r2i r2iVar, xvf0 xvf0Var, v0g v0gVar, gmh gmhVar, a1g a1gVar) {
        this.a = 15;
        this.f = w0gVar;
        this.b = r2iVar;
        this.c = xvf0Var;
        this.d = v0gVar;
        this.g = gmhVar;
        this.e = a1gVar;
    }

    public ncb(eqh eqhVar, p1g p1gVar, p1g p1gVar2, gxf gxfVar, p1g p1gVar3, xvf0 xvf0Var) {
        this.a = 2;
        this.c = eqhVar;
        this.d = p1gVar;
        this.e = p1gVar2;
        this.f = gxfVar;
        this.g = p1gVar3;
        this.b = xvf0Var;
    }

    public ncb(gyf gyfVar, vqa0 vqa0Var, fyf fyfVar, rwh rwhVar, fyf fyfVar2, xvf0 xvf0Var) {
        this.a = 16;
        this.d = gyfVar;
        this.e = vqa0Var;
        this.b = fyfVar;
        this.f = rwhVar;
        this.g = fyfVar2;
        this.c = xvf0Var;
    }

    public ncb(tzf tzfVar, xvf0 xvf0Var, kk kkVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 28;
        this.g = tzfVar;
        this.b = xvf0Var;
        this.c = kkVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }

    public ncb(xvf0 xvf0Var, eqh eqhVar, zfa zfaVar, peb pebVar, zni0 zni0Var, xvf0 xvf0Var2) {
        this.a = 11;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.e = zfaVar;
        this.f = pebVar;
        this.g = zni0Var;
        this.d = xvf0Var2;
    }
}
