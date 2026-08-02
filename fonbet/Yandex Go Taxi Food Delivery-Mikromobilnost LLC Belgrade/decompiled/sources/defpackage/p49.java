package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.home.plaque.feature.internal.presentation.d;
import com.yandex.plus.log.api.LogPriority;
import ru.yandex.taxi.cashback.view.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plus.sdk.micro_widget.websdk.DisabledThemeSwitchingFrameLayout;

/* loaded from: classes9.dex */
public final class p49 extends qgb1 {
    public final DisabledThemeSwitchingFrameLayout a;
    public zrd0 b;
    public final /* synthetic */ a c;

    public p49(a aVar) {
        this.c = aVar;
        DisabledThemeSwitchingFrameLayout disabledThemeSwitchingFrameLayout = new DisabledThemeSwitchingFrameLayout(aVar.a.getContext(), null, 0, 0, 14, null);
        this.a = disabledThemeSwitchingFrameLayout;
        disabledThemeSwitchingFrameLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int d = c.d(mrg0.go_design_m_space, aVar.a);
        int i = mrg0.go_design_m_space;
        View view = aVar.a;
        int d2 = c.d(i, view);
        int d3 = c.d(mrg0.go_design_s_space, view);
        int d4 = c.d(hsg0.plus_badge_bottom_margin, view);
        marginLayoutParams.setMarginStart(d);
        marginLayoutParams.topMargin = d2;
        marginLayoutParams.setMarginEnd(d3);
        marginLayoutParams.bottomMargin = d4;
        disabledThemeSwitchingFrameLayout.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.qgb1
    public final void c(ViewGroup viewGroup) {
        DisabledThemeSwitchingFrameLayout disabledThemeSwitchingFrameLayout = this.a;
        viewGroup.removeView(disabledThemeSwitchingFrameLayout);
        zrd0 zrd0Var = this.b;
        disabledThemeSwitchingFrameLayout.removeView(zrd0Var != null ? zrd0Var.n : null);
        zrd0 zrd0Var2 = this.b;
        if (zrd0Var2 != null) {
            bkc0 bkc0Var = (bkc0) zrd0Var2.m.a;
            bkc0Var.h.removeListener(bkc0Var.o);
            bkc0Var.i.removeListener(bkc0Var.p);
            d dVar = (d) bkc0Var.n.getValue();
            pgz pgzVar = dVar.h;
            LogPriority logPriority = LogPriority.INFO;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "PlaqueViewModel", "onCleared()");
            }
            bvf0.j(dVar.o, null);
        }
        this.b = null;
    }
}
