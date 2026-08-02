package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.splash.AfterSplashType;
import com.yandex.go.splash.BaseSplashView;
import com.yandex.go.splash.SplashComponent;
import com.yandex.go.splash.domain.b;
import com.yandex.go.splash.domain.c;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;
import ru.yandex.taxi.zalogin.d;

/* loaded from: classes8.dex */
public final class nrt0 implements a2f0 {
    public final hrt0 a;
    public final b b;
    public final c c;
    public final rrt0 d;
    public final prt0 e;
    public final ftc f;
    public final FragmentActivity g;
    public final c2x0 h;
    public final MainUiAvailabilityMonitor i;
    public final d j;
    public final h3y k;

    public nrt0(hrt0 hrt0Var, b bVar, c cVar, rrt0 rrt0Var, prt0 prt0Var, ftc ftcVar, FragmentActivity fragmentActivity, c2x0 c2x0Var, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, d dVar, h3y h3yVar) {
        this.a = hrt0Var;
        this.b = bVar;
        this.c = cVar;
        this.d = rrt0Var;
        this.e = prt0Var;
        this.f = ftcVar;
        this.g = fragmentActivity;
        this.h = c2x0Var;
        this.i = mainUiAvailabilityMonitor;
        this.j = dVar;
        this.k = h3yVar;
    }

    @Override // defpackage.a2f0
    public final void c() {
        SplashComponent splashComponent;
        hrt0 hrt0Var = this.a;
        Activity activity = hrt0Var.a;
        if (hrt0Var.b()) {
            hrt0Var.c.Kg();
        } else {
            BaseSplashView b = hrt0Var.d.b(activity);
            hqt0 hqt0Var = hrt0Var.b;
            jqt0 jqt0Var = hrt0Var.c;
            t9w t9wVar = hqt0Var.a;
            SplashComponent splashComponent2 = new SplashComponent((Context) t9wVar.a.get(), b, jqt0Var, (juz) t9wVar.b.get(), t9wVar.c, (n250) t9wVar.d.a);
            ru.yandex.taxi.design.utils.c.w(activity.findViewById(v7h0.splash_view_stub), splashComponent2);
            hrt0Var.f = splashComponent2;
        }
        final int i = 0;
        sls slsVar = new sls(this) { // from class: mrt0
            public final /* synthetic */ nrt0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                nrt0 nrt0Var = this.b;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(!nrt0Var.a.a());
                    default:
                        nrt0Var.g.getWindow().setNavigationBarContrastEnforced(true);
                        c2x0 c2x0Var = nrt0Var.h;
                        c2x0Var.getClass();
                        d2x0 d2x0Var = (d2x0) c2x0Var;
                        d2x0Var.d();
                        d2x0Var.c();
                        d dVar = nrt0Var.j;
                        dVar.p = true;
                        if (dVar.c()) {
                            dVar.f();
                        }
                        r0 r0Var = nrt0Var.i.c;
                        Boolean bool = Boolean.TRUE;
                        r0Var.getClass();
                        r0Var.m(null, bool);
                        ((com.yandex.go.lifecycle.processor.d) nrt0Var.k.get()).c();
                        return zy11.a;
                }
            }
        };
        prt0 prt0Var = this.e;
        prt0Var.e = slsVar;
        final int i2 = 1;
        prt0Var.d = new sls(this) { // from class: mrt0
            public final /* synthetic */ nrt0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                nrt0 nrt0Var = this.b;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(!nrt0Var.a.a());
                    default:
                        nrt0Var.g.getWindow().setNavigationBarContrastEnforced(true);
                        c2x0 c2x0Var = nrt0Var.h;
                        c2x0Var.getClass();
                        d2x0 d2x0Var = (d2x0) c2x0Var;
                        d2x0Var.d();
                        d2x0Var.c();
                        d dVar = nrt0Var.j;
                        dVar.p = true;
                        if (dVar.c()) {
                            dVar.f();
                        }
                        r0 r0Var = nrt0Var.i.c;
                        Boolean bool = Boolean.TRUE;
                        r0Var.getClass();
                        r0Var.m(null, bool);
                        ((com.yandex.go.lifecycle.processor.d) nrt0Var.k.get()).c();
                        return zy11.a;
                }
            }
        };
        oqt0 oqt0Var = prt0Var.a;
        yo40 yo40Var = prt0Var.b.b;
        if (yo40Var != null) {
            h270 h270Var = new h270();
            if (oqt0Var.a() == AfterSplashType.NONE) {
                ((krt0) yo40Var.a).b(new e89(11, prt0Var, h270Var));
            }
        }
        ymp0 ymp0Var = new ymp0(6, prt0Var);
        if (!hrt0Var.b() && (splashComponent = hrt0Var.f) != null) {
            splashComponent.setOnDetachListener(new bsq0(2, hrt0Var, ymp0Var));
        }
        this.b.a(this.f);
        if (this.d.b != null) {
            this.c.a();
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SplashScreenControllerImpl";
    }
}
