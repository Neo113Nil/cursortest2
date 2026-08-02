package defpackage;

import com.ybsdk.common.repositiories.agreements.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.CardFeatureModule;
import com.ybsdk.di.modules.features.b;
import com.ybsdk.di.modules.features.c;

/* loaded from: classes3.dex */
public final class owf implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ owf(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 11;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 1:
                y1r0 w = ((h9g) tw51Var).w();
                q5z.h(w);
                return w;
            case 2:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((h9g) tw51Var).v.q.get();
                q5z.h(appAnalyticsReporter);
                return appAnalyticsReporter;
            case 3:
                ua8 ua8Var = (ua8) ((h9g) tw51Var).G0.get();
                q5z.h(ua8Var);
                return ua8Var;
            case 4:
                h9g h9gVar = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule = h9gVar.h;
                return new b((a) h9gVar.v.H.get());
            case 5:
                return new ov3(((h9g) tw51Var).v.a());
            case 6:
                h9g h9gVar2 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule2 = h9gVar2.h;
                return new m501(i2);
            case 7:
                h9g h9gVar3 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule3 = h9gVar3.h;
                return new hf8((bhk) h9gVar3.u0.get());
            case 8:
                h9g h9gVar4 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule4 = h9gVar4.h;
                return new c(h9gVar4.E, (np41) h9gVar4.M.get(), (com.ybsdk.rconfig.b) h9gVar4.v.A.get());
            case 9:
                return new if8((com.ybsdk.rconfig.b) ((h9g) tw51Var).v.A.get());
            case 10:
                h9g h9gVar5 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule5 = h9gVar5.h;
                return new jf8(h9gVar5.E, (np41) h9gVar5.M.get());
            case 11:
                lf8 lf8Var = (lf8) ((h9g) tw51Var).H0.get();
                q5z.h(lf8Var);
                return lf8Var;
            case 12:
                h9g h9gVar6 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule6 = h9gVar6.h;
                return new mf8((com.ybsdk.screens.registration.a) h9gVar6.R.get());
            case 13:
                h9g h9gVar7 = (h9g) tw51Var;
                h9gVar7.getClass();
                return (com.ybsdk.feature.settings.internal.domain.card.a) m7q0.f(h9gVar7).c;
            case 14:
                h9g h9gVar8 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule7 = h9gVar8.h;
                return new sr4(26, (j3h) h9gVar8.E.get());
            case 15:
                return ((h9g) tw51Var).v.a;
            case 16:
                return ((h9g) tw51Var).v.b();
            case 17:
                h9g h9gVar9 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule8 = h9gVar9.h;
                return new ff8((qa60) h9gVar9.c0.get());
            case 18:
                h9g h9gVar10 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule9 = h9gVar10.h;
                return new vm7((qa60) h9gVar10.c0.get(), i2);
            case 19:
                h9g h9gVar11 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule10 = h9gVar11.h;
                return new vm7((qa60) h9gVar11.c0.get(), 12);
            case 20:
                return ((h9g) tw51Var).o();
            case 21:
                h9g h9gVar12 = (h9g) tw51Var;
                CardFeatureModule cardFeatureModule11 = h9gVar12.h;
                x8g x8gVar = h9gVar12.v;
                return new e90(8, x8gVar.s, x8gVar.Y0);
            case 22:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 23:
                h9g h9gVar13 = (h9g) tw51Var;
                h9gVar13.getClass();
                return (com.ybsdk.feature.settings.internal.view.b) m7q0.f(h9gVar13).d;
            case 24:
                return ((h9g) tw51Var).x();
            case 25:
                return ((h9g) tw51Var).v.b();
            case 26:
                AppAnalyticsReporter r2 = ((h9g) tw51Var).r();
                q5z.h(r2);
                return r2;
            case 27:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 28:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            default:
                return new g5((j3h) ((h9g) tw51Var).E.get());
        }
    }
}
