package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.fintechsdk.performance.impl.internal.MemoryMonitorImpl;
import com.yandex.go.payments.domain.m0;
import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.scooters.passes.purchase.packages.g;
import com.yandex.go.scooters.passes.purchase.superpasses.h;
import com.yandex.go.scooters.payments.domain.a;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.x;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.telemost.ui.StartPersonalMeetingMenuDialog;
import com.ybsdk.api.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.network.Api;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.persuggest.source.m;
import ru.yandex.taxi.preorder.source.domain.o;
import ru.yandex.taxi.preorder.source.j;
import ru.yandex.taxi.scooters.data.mapper.d;
import ru.yandex.taxi.scooters.data.p;
import ru.yandex.taxi.scooters.domain.k;
import ru.yandex.taxi.scooters.domain.q;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class pmn0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ pmn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.e;
        switch (i) {
            case 0:
                return new d((pav) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (xdf) xvf0Var.get(), (c) xvf0Var5.get(), (cno0) xvf0Var4.get());
            case 1:
                return new k((Context) xvf0Var3.get(), (tse) xvf0Var2.get(), (tj60) xvf0Var.get(), (p) xvf0Var5.get(), (v0o0) xvf0Var4.get());
            case 2:
                return new ryn0((e) xvf0Var3.get(), this.c, (p) xvf0Var.get(), (mr40) xvf0Var5.get(), (kyn0) xvf0Var4.get());
            case 3:
                return new g((qxm0) xvf0Var3.get(), (po21) xvf0Var2.get(), (com.yandex.go.scooters.passes.domain.g) xvf0Var4.get(), (i) xvf0Var.get(), (a) xvf0Var5.get());
            case 4:
                return new com.yandex.go.scooters.passes.purchase.packages.i((Context) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (yp2) xvf0Var.get(), (c) xvf0Var5.get(), (bia0) xvf0Var4.get());
            case 5:
                return new com.yandex.go.scooters.passes.data.e((po21) xvf0Var3.get(), (ewn0) xvf0Var2.get(), (com.yandex.go.scooters.passes.data.jason.a) xvf0Var.get(), (tco0) xvf0Var5.get(), (vfo0) xvf0Var4.get());
            case 6:
                return new com.yandex.go.scooters.data.mapper.e((Context) xvf0Var3.get(), (pdc) xvf0Var2.get(), (xdf) xvf0Var.get(), (q) xvf0Var5.get(), (c) xvf0Var4.get());
            case 7:
                return new com.yandex.go.scooters.passes.purchase.superpasses.d((qxm0) xvf0Var3.get(), (po21) xvf0Var2.get(), (com.yandex.go.scooters.passes.domain.g) xvf0Var5.get(), (i) xvf0Var.get(), (a) xvf0Var4.get());
            case 8:
                return new h((Context) xvf0Var3.get(), (yp2) xvf0Var2.get(), (c) xvf0Var.get(), (bia0) xvf0Var5.get(), (rea0) xvf0Var4.get());
            case 9:
                return new b041((Activity) xvf0Var2.get(), (b) xvf0Var.get(), (AppAnalyticsReporter) xvf0Var5.get(), (c041) xvf0Var4.get());
            case 10:
                return new a3r0((Activity) xvf0Var3.get(), (noy0) xvf0Var2.get(), (x4k0) xvf0Var.get(), (dmt0) xvf0Var5.get(), (lqo) xvf0Var4.get());
            case 11:
                return new com.yandex.messaging.miniapps.js.listeners.d((ChatRequest) xvf0Var3.get(), (oh20) xvf0Var2.get(), (th20) xvf0Var.get(), (sh20) xvf0Var5.get(), (x22) xvf0Var4.get());
            case 12:
                return new o(this.b, (wiq0) xvf0Var2.get(), (ynm0) xvf0Var.get(), (git0) xvf0Var5.get(), (oep0) xvf0Var4.get());
            case 13:
                return new f((AppAnalyticsReporter) xvf0Var3.get(), (xls0) xvf0Var2.get(), (Api) xvf0Var.get(), (nbp0) xvf0Var5.get(), (b) xvf0Var4.get());
            case 14:
                return new ket0((zuj0) xvf0Var3.get(), (e400) xvf0Var2.get(), (fy01) xvf0Var.get(), (cc60) xvf0Var5.get(), (r521) xvf0Var4.get());
            case 15:
                return new j((tse) xvf0Var3.get(), (ru.yandex.taxi.utils.c) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get(), (jgt0) xvf0Var5.get(), (rqo) xvf0Var4.get());
            case 16:
                return new yit0((ou7) xvf0Var3.get(), (biv0) xvf0Var2.get(), (com.yandex.go.preorder.map.b) xvf0Var.get(), (hit0) xvf0Var5.get(), (rft0) xvf0Var4.get());
            case 17:
                return new cjt0((po21) xvf0Var3.get(), i5m.a(xvf0Var2), (ru.yandex.taxi.main.map.f) xvf0Var.get(), (axt) xvf0Var5.get(), (ru.yandex.taxi.main.map.c) xvf0Var4.get());
            case 18:
                return new eyt0((cl2) xvf0Var3.get(), (j4x) xvf0Var2.get(), (MemoryMonitorImpl) xvf0Var.get(), (yi10) xvf0Var5.get(), (v5f0) xvf0Var4.get());
            case 19:
                return new StartPersonalMeetingMenuDialog((Activity) xvf0Var3.get(), (ChatRequest) xvf0Var2.get(), (ibt) xvf0Var.get(), (w270) xvf0Var5.get(), (sfl0) xvf0Var4.get());
            case 20:
                return new bdu0((to3) xvf0Var3.get(), (pcu0) xvf0Var2.get(), (jdu0) xvf0Var.get(), (kcu0) xvf0Var5.get(), (at2) xvf0Var4.get());
            case 21:
                return new h4v0((oep0) xvf0Var3.get(), (wiq0) xvf0Var2.get(), this.d, (hnb0) xvf0Var5.get(), (w6r) xvf0Var4.get());
            case 22:
                return new ru.yandex.taxi.preorder.summary.tariffpage.badge.i((iv70) xvf0Var3.get(), (m0) xvf0Var2.get(), (dkx0) xvf0Var.get(), (d770) xvf0Var5.get(), (zuj0) xvf0Var4.get());
            case 23:
                return new x((e7c0) xvf0Var3.get(), (z111) xvf0Var2.get(), (vw9) xvf0Var.get(), (ein0) xvf0Var5.get(), (sux0) xvf0Var4.get());
            case 24:
                return new com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.d((m) xvf0Var3.get(), (ru.yandex.taxi.persuggest.source.h) xvf0Var2.get(), (vxv0) xvf0Var.get(), (rvv0) xvf0Var5.get(), (stv0) xvf0Var4.get());
            case 25:
                return new com.yandex.go.preorder.lifecycle.q((lgt0) xvf0Var3.get(), (hvd0) xvf0Var2.get(), (y9x0) xvf0Var.get(), (i130) xvf0Var5.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var4.get());
            case 26:
                return new com.yandex.messaging.internal.view.chat.input.textsuggest.d((ChatRequest) xvf0Var3.get(), (p4t) xvf0Var2.get(), (Lifecycle) xvf0Var.get(), (x22) xvf0Var5.get(), (qet) xvf0Var4.get());
            case 27:
                return new n8z0((w3c) xvf0Var2.get(), (x22) xvf0Var.get(), i5m.a(xvf0Var5), (String) xvf0Var4.get());
            case 28:
                return new fdz0((Activity) xvf0Var3.get(), (n720) xvf0Var2.get(), i5m.a(xvf0Var), (ChatRequest) xvf0Var5.get(), i5m.a(xvf0Var4));
            default:
                return new com.yandex.messaging.input.voice.reply.a((Activity) xvf0Var3.get(), (tyc0) xvf0Var2.get(), (kse) xvf0Var.get(), (com.yandex.messaging.input.voice.reply.b) xvf0Var5.get(), (s320) xvf0Var4.get());
        }
    }
}
