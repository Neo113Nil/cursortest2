package defpackage;

import android.app.Activity;
import com.yandex.go.information.domain.c;
import com.yandex.go.lootbox.impl.data.api.LootBoxApi;
import com.yandex.go.navigator.driving.r;
import com.yandex.go.tariffcard.interactor.a;
import com.yandex.go.taxi.order.provider.l;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;
import com.yandex.messaging.ui.settings.inviteLinkInfo.b;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import java.util.Set;
import ru.yandex.taxi.main.map.e;
import ru.yandex.taxi.main.map.i;
import ru.yandex.taxi.summary.requirements.list.interactors.o;
import ru.yandex.taxi.utils.d;

/* loaded from: classes12.dex */
public final class e3u implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ e3u(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        switch (i) {
            case 0:
                return new a((kdd0) ((vfg0) xvf0Var).get(), (oxu0) xvf0Var3.get(), (zkz0) xvf0Var2.get());
            case 1:
                return new r1s(7, (oh4) ((qh4) xvf0Var).get(), (xk4) ((yk4) xvf0Var3).get(), (v920) ((ncb) xvf0Var2).get());
            case 2:
                return new bfu((zeu) xvf0Var3.get(), (c370) xvf0Var2.get(), (fn6) ((qcb) xvf0Var).get());
            case 3:
                return new m6v((krs) ((njp) xvf0Var).get(), (bg1) ((q720) xvf0Var3).get(), (mf1) ((q720) xvf0Var2).get());
            case 4:
                return new com.yandex.go.navigator.incidents.report.a((apv) ((f9t) xvf0Var).get(), (r) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 5:
                return new c((k3c) ((qzb) xvf0Var).get(), (com.yandex.go.about.domain.c) ((x4) xvf0Var3).get(), (i4u) ((h1t) xvf0Var2).get());
            case 6:
                return new vt6(1, (d9w) ((y0g) xvf0Var).get(), (wiq0) ((w0g) xvf0Var3).get(), (y0g) xvf0Var2);
            case 7:
                return new ldw((Set) xvf0Var3.get(), (Set) ((y2r0) xvf0Var).get(), (kwl) ((d2g) xvf0Var2).get());
            case 8:
                return new o((d9w) ((y0g) xvf0Var).get(), (wiq0) ((w0g) xvf0Var2).get(), (vfx0) xvf0Var3.get());
            case 9:
                return new b((v) xvf0Var3.get(), (f3c) xvf0Var2.get(), (reu) ((k1w) xvf0Var).get());
            case 10:
                wcp0 wcp0Var = (wcp0) xvf0Var3.get();
                ((u1g) xvf0Var).get();
                return new gnx(wcp0Var, ((br00) xvf0Var2).a);
            case 11:
                return new KycPhotoFragment((opx) ((u1g) xvf0Var).get(), (yox) ((n3w) xvf0Var3).a, (npx) ((u1g) xvf0Var2).get());
            case 12:
                return new com.ybsdk.feature.kyc.internal.data.a((KycApi) xvf0Var3.get(), (com.ybsdk.utils.poller.b) ((u1g) xvf0Var).get(), (AppAnalyticsReporter) ((u1g) xvf0Var2).get());
            case 13:
                return new wjm((j4y0) ((flx0) xvf0Var).get(), (d6i) ((mvy) xvf0Var2).get(), (zuj0) xvf0Var3.get());
            case 14:
                return new wvy((u8w) ((mvy) xvf0Var).get(), (wjm) ((e3u) xvf0Var3).get(), (d6i) ((mvy) xvf0Var2).get());
            case 15:
                return new com.yandex.go.permission.location_with_agreement.analytics.a((lx4) ((r2g) xvf0Var).get(), (pj) ((h1t) xvf0Var3).get(), (dho) ((kgn) xvf0Var2).get());
            case 16:
                ((j9g) xvf0Var).get();
                hnz hnzVar = (hnz) xvf0Var3.get();
                ((j9g) xvf0Var2).get();
                smz smzVar = new smz();
                hnzVar.a();
                return smzVar;
            case 17:
                return new com.yandex.go.lootbox.impl.data.repository.activation.a((LootBoxApi) xvf0Var3.get(), (upz) xvf0Var2.get(), (com.yandex.go.lootbox.impl.data.mapper.content.a) ((x0z) xvf0Var).get());
            case 18:
                return new com.yandex.go.lootbox.impl.data.repository.animation.a((LootBoxApi) ((aos) xvf0Var).get(), (epz) ((h1t) xvf0Var3).get(), (bpz) ((h1t) xvf0Var2).get());
            case 19:
                return new com.yandex.go.lootbox.impl.data.mapper.promo.a((d) ((y1u) xvf0Var).get(), (ru.yandex.taxi.widget.c) ((s2g) xvf0Var3).get(), (pdc) ((s2g) xvf0Var2).get());
            case 20:
                return new com.yandex.messaging.ui.settings.folder.mainFolderSettings.a((t8t) ((wrh) xvf0Var).get(), (j721) xvf0Var3.get(), (t7t) ((wrh) xvf0Var2).get());
            case 21:
                return new e((i) ((hs30) xvf0Var).get(), (ru.yandex.taxi.e) xvf0Var3.get(), (ru.yandex.taxi.address.clarification.impl.repo.a) xvf0Var2.get());
            case 22:
                return new e100(3, (String) xvf0Var3.get(), (gzh) xvf0Var2.get(), (c9v) ((rut) xvf0Var).get());
            case 23:
                return new com.yandex.go.summary.interactor.mapcontent.state.a((vev0) xvf0Var3.get(), (aa1) xvf0Var2.get(), (hhs0) ((y2s0) xvf0Var).get());
            case 24:
                return new kl00((rqo) xvf0Var3.get(), (o2y0) xvf0Var2.get(), (reu) ((jl00) xvf0Var).get());
            case 25:
                return new l((ru.yandex.taxi.order.d) ((u4g) xvf0Var).get(), (o380) ((u4g) xvf0Var3).get(), (a080) ((zi60) xvf0Var2).get());
            case 26:
                return new com.ybsdk.feature.merchant.offers.internal.screens.testSearch.a((j3h) ((u2g) xvf0Var).get(), (com.ybsdk.feature.merchant.offers.internal.domain.interactor.a) ((ip10) xvf0Var2).get(), (rq10) xvf0Var3.get());
            case 27:
                return new MessageMenuDialog((Activity) xvf0Var3.get(), (com.yandex.messaging.internal.view.messagemenu.a) ((o08) xvf0Var).get(), (com.yandex.messaging.ui.reactions.a) ((cta0) xvf0Var2).get());
            case 28:
                return new dx10((com.yandex.messaging.internal.urlpreview.a) xvf0Var3.get(), (fn6) ((qcb) xvf0Var).get(), (sh21) xvf0Var2.get());
            default:
                return new uh20((lh20) xvf0Var3.get(), (wh20) xvf0Var2.get(), (vh20) ((q720) xvf0Var).get());
        }
    }

    public /* synthetic */ e3u(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ e3u(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ e3u(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
    }
}
