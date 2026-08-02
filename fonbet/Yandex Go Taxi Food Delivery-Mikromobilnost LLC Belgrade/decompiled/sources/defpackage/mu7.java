package defpackage;

import android.app.Activity;
import android.os.Looper;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.delayed.cancellable.a;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.domain.mapper.b;
import com.yandex.go.chargers.passes.data.k;
import com.yandex.go.chargers.passes.data.m0;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.g;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.view.timeline.ChatItemHighlighter;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class mu7 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public mu7(o59 o59Var, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 5;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public static mu7 a(o59 o59Var, n3w n3wVar, n3w n3wVar2) {
        return new mu7(o59Var, n3wVar, n3wVar2);
    }

    public static mu7 b(xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new mu7(xvf0Var, xvf0Var2, 6);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new md6(13, (fke) xvf0Var2.get(), (FlexAdapter) xvf0Var.get());
            case 1:
                return new a((rbs) xvf0Var2.get(), (ns31) xvf0Var.get());
            case 2:
                return new c06((o2y0) xvf0Var2.get(), (noe) xvf0Var.get());
            case 3:
                return new md6(20, (c) xvf0Var2.get(), (d49) xvf0Var.get());
            case 4:
                return new b49((wk21) xvf0Var2.get(), (drd) xvf0Var.get());
            case 5:
                kg51 kg51Var = (kg51) xvf0Var2.get();
                p59 p59Var = (p59) kg51Var.z.invoke((dnp0) xvf0Var.get());
                q5z.i(p59Var);
                return p59Var;
            case 6:
                return new com.yandex.go.chargers.discovery_flex.ui.action.a((tt2) xvf0Var2.get(), (a2a) xvf0Var.get());
            case 7:
                return new com.yandex.go.chargers.attention.presentation.a((pdc) xvf0Var2.get(), (e) xvf0Var.get());
            case 8:
                return new com.yandex.go.chargers.domain.mapper.a((ru.yandex.taxi.widget.c) xvf0Var.get(), (e) xvf0Var2.get());
            case 9:
                return new b((pdc) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 10:
                return new c06(i5m.a(xvf0Var2), (f) xvf0Var.get());
            case 11:
                return new com.yandex.go.chargers.subscription.domain.b((com.yandex.go.zone.interactors.b) xvf0Var2.get(), (po21) xvf0Var.get());
            case 12:
                return new com.yandex.go.chargers.partner_subscription.data.a(i5m.a(xvf0Var2), (f) xvf0Var.get());
            case 13:
                return new m0((k7x0) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 14:
                return new com.yandex.go.chargers.passes.payment_settings.e((ru.yandex.taxi.widget.c) xvf0Var2.get(), (k) xvf0Var.get());
            case 15:
                return new ena(i5m.a(xvf0Var2), (f) xvf0Var.get());
            case 16:
                return new zta((lta) xvf0Var2.get(), (ita) xvf0Var.get());
            case 17:
                return new com.yandex.go.chargers.surge.domain.a((pdc) xvf0Var2.get(), (e) xvf0Var.get());
            case 18:
                return new k0b((b00) xvf0Var2.get(), (ChatRequest) xvf0Var.get());
            case 19:
                return new i1b();
            case 20:
                return new p1b((y5b) xvf0Var2.get(), (adb) xvf0Var.get());
            case 21:
                return new v3b((to3) xvf0Var2.get(), (Looper) xvf0Var.get());
            case 22:
                return new ChatItemHighlighter((Activity) xvf0Var2.get(), (qbz0) xvf0Var.get());
            case 23:
                return new x4b((o1b0) xvf0Var2.get(), (g) xvf0Var.get());
            case 24:
                return new t5b((o1b0) xvf0Var2.get(), (u5b) xvf0Var.get());
            case 25:
                return new o9b((kse) xvf0Var.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get());
            case 26:
                return new dbb((com.yandex.messaging.analytics.b) xvf0Var2.get(), (ChatRequest) xvf0Var.get());
            case 27:
                return new com.yandex.messaging.internal.authorized.sync.a((to3) xvf0Var2.get(), (kse) xvf0Var.get());
            case 28:
                return new m501((kse) xvf0Var.get(), (j) xvf0Var2.get());
            default:
                return new com.yandex.go.taxi.order.search.overlay.companions.a((iup0) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }

    public /* synthetic */ mu7(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
