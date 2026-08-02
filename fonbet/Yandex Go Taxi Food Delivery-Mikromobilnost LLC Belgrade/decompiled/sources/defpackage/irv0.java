package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import androidx.core.view.b;
import defpackage.irv0;
import defpackage.lrv0;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.surge.widget.a;
import ru.yandex.taxi.widget.BalanceWidget;

/* loaded from: classes6.dex */
public final class irv0 implements erv0 {
    public final lrv0 a;
    public final a b = new a(this);
    public String c = "";
    public String d = "";
    public String e = "";
    public no6 f;
    public final i3y g;
    public final BalanceWidget h;

    public irv0(lrv0 lrv0Var, fva0 fva0Var, ViewStub viewStub) {
        this.a = lrv0Var;
        final int i = 0;
        this.g = kotlin.a.a(new sls(this) { // from class: hrv0
            public final /* synthetic */ irv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                irv0 irv0Var = this.b;
                switch (i2) {
                    case 0:
                        return new j36(irv0Var.h);
                    default:
                        lrv0 lrv0Var2 = irv0Var.a;
                        g36 g36Var = ((j36) irv0Var.g.getValue()).b;
                        vpw0 vpw0Var = lrv0Var2.C;
                        i d = ((j) vpw0Var.a).d("Summary.SurgeWidget.Tapped");
                        drv0 drv0Var = vpw0Var.d;
                        if (drv0Var != null) {
                            d.b(drv0Var.b, "surge_level");
                            d.d("button_color", drv0Var.a);
                            d.e("icons_list", drv0Var.c);
                        }
                        d.m();
                        if (g36Var != null) {
                            lrv0Var2.D.a(Uri.parse(g36Var.f), DeeplinkSource.UNSPECIFIED);
                        } else {
                            hww0 hww0Var = lrv0Var2.y.c;
                            qme0 qme0Var = hww0Var.e;
                            kgx kgxVar = hww0.f[2];
                            Boolean bool = Boolean.TRUE;
                            qme0Var.setValue(hww0Var, kgxVar, bool);
                            r0 r0Var = hww0Var.a;
                            r0Var.getClass();
                            r0Var.m(null, bool);
                            ((pep0) lrv0Var2.A).f((m950) lrv0Var2.z.get(), "widget", hxx.a);
                        }
                        return zy11.a;
                }
            }
        });
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Creating;
        fva0.f(fva0Var, "Summary.SurgeWidget", performanceAnalytics$Type, 0L, 4);
        BalanceWidget balanceWidget = new BalanceWidget(viewStub.getContext(), null, 0, 6, null);
        balanceWidget.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.surge.widget.SummaryWidgetHolderImpl$createWidget$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                irv0 irv0Var = irv0.this;
                lrv0 lrv0Var2 = irv0Var.a;
                a aVar = irv0Var.b;
                lrv0Var2.Bg(aVar);
                tje.N(lrv0Var2.Jg(), null, null, new SummaryWidgetHolderPresenter$attachView$1(lrv0Var2, aVar, null), 3);
                tje.N(lrv0Var2.Jg(), null, null, new SummaryWidgetHolderPresenter$attachView$2(lrv0Var2, aVar, null), 3);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                irv0.this.a.Cg();
            }
        });
        balanceWidget.addOnLayoutChangeListener(new ons0(4, this));
        balanceWidget.setVisibility(8);
        c.w(viewStub, balanceWidget);
        xw31.E(balanceWidget, null, Integer.valueOf(tje.r(tsg0.summary_widget_top_with_plus_widget, balanceWidget.getContext())), null, null);
        b.p(balanceWidget, new ifq0(6, this));
        final int i2 = 1;
        c.z(new sls(this) { // from class: hrv0
            public final /* synthetic */ irv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                irv0 irv0Var = this.b;
                switch (i22) {
                    case 0:
                        return new j36(irv0Var.h);
                    default:
                        lrv0 lrv0Var2 = irv0Var.a;
                        g36 g36Var = ((j36) irv0Var.g.getValue()).b;
                        vpw0 vpw0Var = lrv0Var2.C;
                        i d = ((j) vpw0Var.a).d("Summary.SurgeWidget.Tapped");
                        drv0 drv0Var = vpw0Var.d;
                        if (drv0Var != null) {
                            d.b(drv0Var.b, "surge_level");
                            d.d("button_color", drv0Var.a);
                            d.e("icons_list", drv0Var.c);
                        }
                        d.m();
                        if (g36Var != null) {
                            lrv0Var2.D.a(Uri.parse(g36Var.f), DeeplinkSource.UNSPECIFIED);
                        } else {
                            hww0 hww0Var = lrv0Var2.y.c;
                            qme0 qme0Var = hww0Var.e;
                            kgx kgxVar = hww0.f[2];
                            Boolean bool = Boolean.TRUE;
                            qme0Var.setValue(hww0Var, kgxVar, bool);
                            r0 r0Var = hww0Var.a;
                            r0Var.getClass();
                            r0Var.m(null, bool);
                            ((pep0) lrv0Var2.A).f((m950) lrv0Var2.z.get(), "widget", hxx.a);
                        }
                        return zy11.a;
                }
            }
        }, balanceWidget);
        fva0.b(fva0Var, "Summary.SurgeWidget", performanceAnalytics$Type, null, 4);
        this.h = balanceWidget;
    }
}
