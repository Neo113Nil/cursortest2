package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c;
import ru.yandex.taxi.tooltips.CashbackTariffTooltipPopup;
import ru.yandex.taxi.widget.AnyTouchCatcherFrameLayout;
import ru.yandex.taxi.widget.TooltipView;

/* loaded from: classes6.dex */
public final class msx0 implements a {
    public final /* synthetic */ c a;

    public msx0(c cVar) {
        this.a = cVar;
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a
    public final void a1(ux31 ux31Var) {
        CashbackTariffTooltipPopup cashbackTariffTooltipPopup = this.a.l;
        if (cashbackTariffTooltipPopup != null) {
            cashbackTariffTooltipPopup.invalidateVisibleState(ux31Var);
        }
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a
    public final void jf(int i, String str) {
        View cashbackTooltipAnchorViewByPosition;
        c cVar = this.a;
        if (cVar.o || !cVar.d) {
            return;
        }
        int i2 = lsx0.a[cVar.q.ordinal()];
        if (i2 == 1) {
            cashbackTooltipAnchorViewByPosition = cVar.f().getCashbackTooltipAnchorViewByPosition(i);
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            cashbackTooltipAnchorViewByPosition = cVar.c().getCashbackTooltipAnchorViewByPosition(i);
        }
        if (cashbackTooltipAnchorViewByPosition == null) {
            return;
        }
        jpe jpeVar = cVar.b;
        AnyTouchCatcherFrameLayout anyTouchCatcherFrameLayout = cVar.c;
        jpeVar.getClass();
        CashbackTariffTooltipPopup cashbackTariffTooltipPopup = new CashbackTariffTooltipPopup((TooltipView) LayoutInflater.from(anyTouchCatcherFrameLayout.getContext()).inflate(wrh0.tariff_ribbon_cashback_tooltip, (ViewGroup) anyTouchCatcherFrameLayout, false), (hrx0) jpeVar.c.get(), str);
        cashbackTariffTooltipPopup.setVerticalOffset(tje.u(-4, ((avj0) jpeVar.b).a));
        cashbackTariffTooltipPopup.setAnchorView(cashbackTooltipAnchorViewByPosition);
        cashbackTariffTooltipPopup.attach();
        cVar.l = cashbackTariffTooltipPopup;
        cashbackTariffTooltipPopup.showTooltip(i);
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a
    public final void z7() {
        CashbackTariffTooltipPopup cashbackTariffTooltipPopup = this.a.l;
        if (cashbackTariffTooltipPopup != null) {
            cashbackTariffTooltipPopup.detach();
        }
    }
}
