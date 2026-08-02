package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import com.google.common.collect.ImmutableMap;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.settings.internal.domain.card.a;
import com.ybsdk.feature.settings.internal.network.SettingsApi;
import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsFragment;
import com.ybsdk.feature.settings.internal.view.b;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes14.dex */
public final class m7q0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ m7q0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static m7q0 a(eqh eqhVar) {
        return new m7q0(eqhVar, 3);
    }

    public static m7q0 b(n3w n3wVar) {
        return new m7q0(n3wVar, 23);
    }

    public static m7q0 c(n3w n3wVar) {
        return new m7q0(n3wVar, 24);
    }

    public static m7q0 d(n3w n3wVar) {
        return new m7q0(n3wVar, 25);
    }

    public static m7q0 e(n3w n3wVar) {
        return new m7q0(n3wVar, 26);
    }

    public static wig f(tw51 tw51Var) {
        int i = 8;
        xvf0 b = i5m.b(new gaq0(new g7g(tw51Var, 28), i));
        o9g o9gVar = new o9g(tw51Var, 1);
        m7q0 m7q0Var = new m7q0(b, 19);
        o9g o9gVar2 = new o9g(tw51Var, 0);
        elo0 elo0Var = new elo0(o9gVar2, new g7g(tw51Var, 25), 20);
        o9g o9gVar3 = new o9g(tw51Var, i);
        g7g g7gVar = new g7g(tw51Var, 27);
        u6o0 u6o0Var = new u6o0((xvf0) o9gVar, (xvf0) m7q0Var, (xvf0) elo0Var, (xvf0) o9gVar3, (xvf0) g7gVar, (xvf0) new o9g(tw51Var, 3), 8);
        o9g o9gVar4 = new o9g(tw51Var, 2);
        int i2 = 11;
        cys0 cys0Var = new cys0((Object) o9gVar, (xvf0) o9gVar4, i2);
        g7g g7gVar2 = new g7g(tw51Var, 29);
        o9g o9gVar5 = new o9g(tw51Var, 7);
        o9g o9gVar6 = new o9g(tw51Var, 6);
        o9g o9gVar7 = new o9g(tw51Var, 5);
        gzn0 gzn0Var = new gzn0(o9gVar6, o9gVar, o9gVar4, 24);
        g7g g7gVar3 = new g7g(tw51Var, 26);
        lq40 lq40Var = new lq40(i2, g7gVar3);
        o9g o9gVar8 = new o9g(tw51Var, 4);
        gzn0 gzn0Var2 = new gzn0((xvf0) n3w.a(new ffr0(new ik0(u6o0Var, cys0Var, g7gVar2, o9gVar5, o9gVar6, o9gVar7, elo0Var, gzn0Var, lq40Var, o9gVar8, g7gVar3, o9gVar2, o9gVar3, ifr0.a, o9gVar, g7gVar))), (xvf0) o9gVar5, (xvf0) new zmm0(o9gVar8, g7gVar2, o9gVar2, o9gVar7, g7gVar3, 24), 27);
        a aVar = new a(new com.ybsdk.feature.settings.internal.data.a((SettingsApi) b.get()));
        h9g h9gVar = (h9g) tw51Var;
        y7r0 y7r0Var = new y7r0(h9gVar.E, (np41) h9gVar.M.get());
        tfl0 t = h9gVar.t();
        q5z.h(t);
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) h9gVar.v.q.get();
        q5z.h(appAnalyticsReporter);
        pgk0 pgk0Var = new pgk0(25, (com.ybsdk.feature.pin.internal.a) h9gVar.O.get());
        return new wig(aVar, new b(y7r0Var, t, appAnalyticsReporter, pgk0Var), new odr0(), ImmutableMap.g(SettingsFragment.class, gzn0Var2));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 2;
        int i3 = 3;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new l7q0((lqo) xvf0Var.get());
            case 1:
                return new hbq0((whu) xvf0Var.get());
            case 2:
                return new m93((Context) xvf0Var.get());
            case 3:
                return new co40((pho) xvf0Var.get());
            case 4:
                return new car(i2, (rwo) xvf0Var.get());
            case 5:
                return new ndl0(24, (b00) xvf0Var.get());
            case 6:
                return new hqy((z22) xvf0Var.get(), 1);
            case 7:
                return new pko((lg5) xvf0Var.get(), i2);
            case 8:
                return new q5p((lg5) xvf0Var.get(), i2);
            case 9:
                return new qgn0(14, (j011) xvf0Var.get());
            case 10:
                return new otq0((k0b) xvf0Var.get());
            case 11:
                stq0 stq0Var = new stq0();
                new Handler();
                return stq0Var;
            case 12:
                return new ttq0((w3c) xvf0Var.get());
            case 13:
                h9g h9gVar = (h9g) ((tw51) xvf0Var.get());
                ContextThemeWrapper contextThemeWrapper = h9gVar.v.a;
                AppAnalyticsReporter r = h9gVar.r();
                q5z.h(r);
                kuq0 kuq0Var = new kuq0((j3h) h9gVar.E.get());
                com.ybsdk.common.a e = h9gVar.e();
                q5z.h(e);
                return new juq0(contextThemeWrapper, r, kuq0Var, e);
            case 14:
                return new s0r0((yyq0) xvf0Var.get());
            case 15:
                return new pko((lg5) xvf0Var.get(), i3);
            case 16:
                return new q5p((lg5) xvf0Var.get(), i3);
            case 17:
                return new r6r0((i650) xvf0Var.get());
            case 18:
                return f((tw51) xvf0Var.get());
            case 19:
                return new com.ybsdk.feature.settings.internal.data.b((SettingsApi) xvf0Var.get());
            case 20:
                return new qgn0((rqo) xvf0Var.get());
            case 21:
                return new gzm0(i3, (Context) xvf0Var.get());
            case 22:
                return new vkr0((com.yandex.go.trusted_contacts.data.repositories.a) xvf0Var.get());
            case 23:
                ma1 adjustCredentials = ((TaxiApplication) xvf0Var.get()).adjustCredentials();
                q5z.i(adjustCredentials);
                return adjustCredentials;
            case 24:
                rs2 appCredentials = ((TaxiApplication) xvf0Var.get()).appCredentials();
                q5z.i(appCredentials);
                return appCredentials;
            case 25:
                lt2 createAppDelegateFactory = ((TaxiApplication) xvf0Var.get()).createAppDelegateFactory();
                q5z.i(createAppDelegateFactory);
                return createAppDelegateFactory;
            case 26:
                v0p externalProcessCredentials = ((TaxiApplication) xvf0Var.get()).externalProcessCredentials();
                q5z.i(externalProcessCredentials);
                return externalProcessCredentials;
            case 27:
                return new ru.yandex.taxi.widgets.domain.b((y451) xvf0Var.get());
            case 28:
                return new pgk0(29, (h2s0) xvf0Var.get());
            default:
                t9g t9gVar = (t9g) xvf0Var.get();
                v2g v2gVar = t9gVar.a;
                i130 G = v2gVar.G();
                x2s0 x2s0Var = t9gVar.b;
                p2s0 p2s0Var = t9gVar.c;
                o800 o800Var = v2gVar.a;
                return new r0s0(G, x2s0Var, p2s0Var, o800Var.J0(), t9gVar.n0, v2gVar.g0(), i5m.a(t9gVar.Q), t9gVar.w0, v2gVar.M0(), o800Var.Y0());
        }
    }

    public /* synthetic */ m7q0(Object obj, v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }
}
