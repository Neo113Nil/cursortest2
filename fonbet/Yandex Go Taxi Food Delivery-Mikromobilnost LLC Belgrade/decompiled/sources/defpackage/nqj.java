package defpackage;

import android.widget.FrameLayout;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsModalView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsToolbarEditModeViewState;
import java.util.List;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes13.dex */
public final class nqj implements pqj {
    public final /* synthetic */ DiscountsModalView a;

    public nqj(DiscountsModalView discountsModalView) {
        this.a = discountsModalView;
    }

    @Override // defpackage.pqj
    public final void id(bsj bsjVar) {
        frf0 binding;
        frf0 binding2;
        eqj eqjVar;
        frf0 binding3;
        frf0 binding4;
        String str;
        frf0 binding5;
        frf0 binding6;
        pav pavVar;
        frf0 binding7;
        srj srjVar = bsjVar.a;
        DiscountsModalView discountsModalView = this.a;
        binding = discountsModalView.getBinding();
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = binding.g;
        DiscountsToolbarEditModeViewState discountsToolbarEditModeViewState = srjVar.a;
        floatingTitleToolbarComponent.setToolbarItemTitle(discountsToolbarEditModeViewState == DiscountsToolbarEditModeViewState.ENABLED ? kyh0.common_done : kyh0.favorites_remove_address);
        binding2 = discountsModalView.getBinding();
        binding2.g.setToolbarItemVisibility(discountsToolbarEditModeViewState != DiscountsToolbarEditModeViewState.HIDDEN);
        lqj lqjVar = bsjVar.b;
        eqjVar = discountsModalView.adapter;
        List list = lqjVar.a;
        ml0 ml0Var = new ml0(eqjVar.c, list, 1);
        eqjVar.c = list;
        kp50.f(ml0Var, true).b(eqjVar);
        aqj aqjVar = bsjVar.c;
        binding3 = discountsModalView.getBinding();
        binding3.f.setVisibility(aqjVar != null ? 0 : 8);
        if (aqjVar != null) {
            String str2 = aqjVar.a;
            if (str2 != null) {
                pavVar = discountsModalView.imageLoader;
                binding7 = discountsModalView.getBinding();
                nac nacVar = (nac) pavVar.a(binding7.f);
                nacVar.e(f1h0.balloons);
                nacVar.c(str2);
            } else {
                binding6 = discountsModalView.getBinding();
                binding6.f.setImageResource(f1h0.balloons);
            }
        }
        bqj bqjVar = bsjVar.d;
        binding4 = discountsModalView.getBinding();
        binding4.c.setVisibility(bqjVar == null ? 8 : 0);
        if (bqjVar == null || (str = bqjVar.a) == null) {
            return;
        }
        binding5 = discountsModalView.getBinding();
        binding5.c.setText(str);
    }

    @Override // defpackage.pqj
    public final void sg(boolean z) {
        frf0 binding;
        frf0 binding2;
        DiscountsModalView discountsModalView = this.a;
        if (z) {
            yes0 yes0Var = SimpleSpinnerModalView.Companion;
            binding2 = discountsModalView.getBinding();
            FrameLayout frameLayout = binding2.b;
            yes0Var.getClass();
            yes0.c(frameLayout, false, false);
            return;
        }
        yes0 yes0Var2 = SimpleSpinnerModalView.Companion;
        binding = discountsModalView.getBinding();
        FrameLayout frameLayout2 = binding.b;
        yes0Var2.getClass();
        yes0.b(frameLayout2);
    }
}
