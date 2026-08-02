package defpackage;

import android.widget.ImageView;
import com.yandex.go.overdraft.data.model.s0;
import com.yandex.go.overdraft.ui.DebtsModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes13.dex */
public final class oug implements utg {
    public final /* synthetic */ DebtsModalView a;

    public oug(DebtsModalView debtsModalView) {
        this.a = debtsModalView;
    }

    public final void I(ListItemComponent listItemComponent, wqk0 wqk0Var) {
        if (wqk0Var == null) {
            listItemComponent.setVisibility(8);
            return;
        }
        listItemComponent.setVisibility(0);
        listItemComponent.setTitle(wqk0Var.a);
        listItemComponent.setSubtitle(wqk0Var.b);
        listItemComponent.setTrailCompanionText(wqk0Var.c);
        listItemComponent.setEnabled(!(wqk0Var.d instanceof s0));
        if (!listItemComponent.isEnabled()) {
            listItemComponent.setTrailMode(0);
        } else {
            listItemComponent.setTrailMode(2);
            listItemComponent.setDebounceClickListener(new j9f(27, this.a, wqk0Var));
        }
    }

    @Override // defpackage.utg
    public final void Ib(ttg ttgVar) {
        pug binding;
        pug binding2;
        pug binding3;
        pug binding4;
        pug binding5;
        pug binding6;
        z0a0 z0a0Var;
        pug binding7;
        pug binding8;
        pug binding9;
        pug binding10;
        pug binding11;
        DebtsModalView debtsModalView = this.a;
        binding = debtsModalView.getBinding();
        if (binding.c.getVisibility() == 0) {
            binding10 = debtsModalView.getBinding();
            binding10.c.setVisibility(8);
            binding11 = debtsModalView.getBinding();
            binding11.b.setVisibility(0);
        }
        binding2 = debtsModalView.getBinding();
        binding2.e.setTitle(ttgVar.a);
        binding3 = debtsModalView.getBinding();
        binding3.d.setText(ttgVar.b);
        binding4 = debtsModalView.getBinding();
        I(binding4.i, ttgVar.c);
        binding5 = debtsModalView.getBinding();
        I(binding5.k, ttgVar.d);
        binding6 = debtsModalView.getBinding();
        ListItemComponent listItemComponent = binding6.f;
        stg stgVar = ttgVar.e;
        if (stgVar == null) {
            listItemComponent.setVisibility(8);
        } else {
            listItemComponent.setVisibility(0);
            listItemComponent.setTitle(stgVar.b);
            listItemComponent.setSubtitle(stgVar.c);
            listItemComponent.setTrailCompanionMode(1);
            ImageView trailCompanionImageView = listItemComponent.getTrailCompanionImageView();
            if (trailCompanionImageView != null) {
                z0a0Var = debtsModalView.paymentIconLoader;
                ((g1a0) z0a0Var).b(trailCompanionImageView, stgVar.d);
            }
            listItemComponent.setTrailMode(2);
            listItemComponent.setEnabled(stgVar.e);
            if (listItemComponent.isEnabled()) {
                listItemComponent.setDebounceClickListener(new j9f(29, debtsModalView, stgVar));
            }
        }
        binding7 = debtsModalView.getBinding();
        ListItemSwitchComponent listItemSwitchComponent = binding7.g;
        aid0 aid0Var = ttgVar.f;
        if (aid0Var == null) {
            listItemSwitchComponent.setVisibility(8);
        } else {
            listItemSwitchComponent.setTitle(aid0Var.a);
            listItemSwitchComponent.setSubtitle(aid0Var.b);
            listItemSwitchComponent.setCheckedWithAnimation(aid0Var.c);
        }
        binding8 = debtsModalView.getBinding();
        h(binding8.h, ttgVar.g);
        binding9 = debtsModalView.getBinding();
        h(binding9.j, ttgVar.h);
    }

    public final void h(ButtonComponent buttonComponent, mt mtVar) {
        if (mtVar == null) {
            buttonComponent.setVisibility(8);
            return;
        }
        buttonComponent.setVisibility(0);
        kdc kdcVar = mtVar.b;
        if (kdcVar != null) {
            buttonComponent.setButtonBackground(kdcVar);
        }
        kdc kdcVar2 = mtVar.c;
        if (kdcVar2 != null) {
            buttonComponent.setButtonTitleColor(kdcVar2);
        }
        buttonComponent.setText(mtVar.a);
        buttonComponent.setDebounceClickListener(new j9f(28, this.a, mtVar));
    }
}
