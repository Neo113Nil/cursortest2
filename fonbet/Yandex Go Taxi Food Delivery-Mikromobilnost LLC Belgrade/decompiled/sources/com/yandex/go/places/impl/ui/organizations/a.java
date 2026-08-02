package com.yandex.go.places.impl.ui.organizations;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.base.ui.base_old.map.MapControlButtonsContainerView;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.dna;
import defpackage.e3h0;
import defpackage.fm80;
import defpackage.hm80;
import defpackage.jl40;
import defpackage.jp80;
import defpackage.k7v;
import defpackage.kp80;
import defpackage.ky6;
import defpackage.lo80;
import defpackage.lp80;
import defpackage.mcb1;
import defpackage.mp80;
import defpackage.nac;
import defpackage.pav;
import defpackage.px6;
import defpackage.qo80;
import defpackage.sd30;
import defpackage.vng;
import defpackage.w511;
import defpackage.zm80;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class a implements qo80 {
    public final /* synthetic */ OrganizationsModalView a;

    public a(OrganizationsModalView organizationsModalView) {
        this.a = organizationsModalView;
    }

    @Override // defpackage.qo80
    public final void a6(CharSequence charSequence) {
        OrganizationsModalView.access$getBinding(this.a).h.setTitle(charSequence);
    }

    @Override // defpackage.xg00
    public final void b(float f, boolean z) {
        MapControlButtonsContainerView rightSideButtonsContainer;
        rightSideButtonsContainer = this.a.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateCompassButton(z, f);
    }

    @Override // defpackage.xg00
    public final void c(boolean z) {
        MapControlButtonsContainerView rightSideButtonsContainer;
        rightSideButtonsContainer = this.a.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateLocationFocusingButton(z);
    }

    @Override // defpackage.qo80
    public final void l(Drawable drawable) {
        cvw.c0(OrganizationsModalView.access$getBinding(this.a).g, drawable);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        hm80 chipsAdapter;
        pav pavVar;
        List searchHeaderCardSpacerWithChips;
        hm80 chipsAdapter2;
        zm80 adapter;
        mp80 mp80Var = (mp80) obj;
        boolean z = mp80Var instanceof jp80;
        int i = 8;
        OrganizationsModalView organizationsModalView = this.a;
        if (z) {
            lo80 access$getBinding = OrganizationsModalView.access$getBinding(organizationsModalView);
            px6 px6Var = access$getBinding.d;
            GoConstraintLayout goConstraintLayout = access$getBinding.a;
            cma1.M(px6Var.b);
            cma1.M((GoLinearLayout) access$getBinding.c.d);
            cma1.J(access$getBinding.j);
            cma1.J(access$getBinding.l);
            if (organizationsModalView.getIsMapEnabled()) {
                cma1.J(access$getBinding.i);
            }
            goConstraintLayout.setContentDescription(access$getBinding.h.title().getText());
            goConstraintLayout.setImportantForAccessibility(0);
            jp80 jp80Var = (jp80) mp80Var;
            List list = jp80Var.b;
            if (list.isEmpty()) {
                OrganizationsModalView.access$getBinding(organizationsModalView).f.setBackground(vng.t(e3h0.search_input_view_round_bg_main_32, organizationsModalView.getContext()));
                OrganizationsModalView.access$getBinding(organizationsModalView).e.setVisibility(8);
                searchHeaderCardSpacerWithChips = organizationsModalView.getSearchHeaderCardSpacer();
            } else {
                OrganizationsModalView.access$getBinding(organizationsModalView).f.setBackground(vng.t(e3h0.search_input_view_round_top_bg_main_32, organizationsModalView.getContext()));
                OrganizationsModalView.access$getBinding(organizationsModalView).e.setVisibility(0);
                searchHeaderCardSpacerWithChips = organizationsModalView.getSearchHeaderCardSpacerWithChips();
            }
            chipsAdapter2 = organizationsModalView.getChipsAdapter();
            chipsAdapter2.submitList(list, null);
            adapter = organizationsModalView.getAdapter();
            adapter.submitList(kotlin.collections.a.m0(jp80Var.a, searchHeaderCardSpacerWithChips), null);
            OrganizationsModalView.access$getBinding(organizationsModalView).k.setShimmering(jp80Var.c);
            if (jp80Var.d) {
                organizationsModalView.onUpButtonClicked();
                return;
            }
            return;
        }
        if (jl40.l(mp80Var, lp80.a)) {
            lo80 access$getBinding2 = OrganizationsModalView.access$getBinding(organizationsModalView);
            cma1.J(access$getBinding2.d.b);
            cma1.M(access$getBinding2.j);
            cma1.M((GoLinearLayout) access$getBinding2.c.d);
            cma1.M(access$getBinding2.i);
            cma1.M(access$getBinding2.l);
            GoConstraintLayout goConstraintLayout2 = access$getBinding2.a;
            ru.yandex.taxi.design.utils.c.z(new OrganizationsModalView$InnerMvpView$hideContentAndShowError$1$1(0, organizationsModalView.getPresenter(), d.class, "onReloadScreenButtonClicked", "onReloadScreenButtonClicked()V", 0), goConstraintLayout2);
            goConstraintLayout2.setContentDescription(null);
            goConstraintLayout2.setImportantForAccessibility(0);
            OrganizationsModalView.access$getBinding(organizationsModalView).k.setShimmering(false);
            return;
        }
        if (!(mp80Var instanceof kp80)) {
            w511.b();
            return;
        }
        chipsAdapter = organizationsModalView.getChipsAdapter();
        kp80 kp80Var = (kp80) mp80Var;
        chipsAdapter.submitList(kp80Var.b, null);
        dna dnaVar = OrganizationsModalView.access$getBinding(organizationsModalView).c;
        ButtonComponent buttonComponent = (ButtonComponent) dnaVar.c;
        GoImageView goImageView = (GoImageView) dnaVar.b;
        fm80 fm80Var = kp80Var.a;
        k7v k7vVar = fm80Var.d;
        String str = k7vVar != null ? k7vVar.a : null;
        if (str != null) {
            goImageView.setVisibility(0);
            pavVar = organizationsModalView.imageLoader;
            ((nac) pavVar.a(goImageView)).c(str);
        } else {
            goImageView.setVisibility(8);
        }
        RobotoTextView robotoTextView = (RobotoTextView) dnaVar.f;
        RobotoTextView robotoTextView2 = (RobotoTextView) dnaVar.e;
        CharSequence charSequence = fm80Var.b;
        ky6 ky6Var = fm80Var.a;
        robotoTextView.setText(charSequence);
        CharSequence charSequence2 = fm80Var.c;
        if (charSequence2 != null && charSequence2.length() != 0) {
            i = 0;
        }
        robotoTextView2.setVisibility(i);
        robotoTextView2.setText(charSequence2);
        buttonComponent.setButtonBackground(ky6Var.c);
        buttonComponent.setText(mcb1.b(buttonComponent, ky6Var.a, ky6Var.b, 0, 12));
        buttonComponent.setDebounceClickListener(new sd30(21, organizationsModalView, kp80Var));
        lo80 access$getBinding3 = OrganizationsModalView.access$getBinding(organizationsModalView);
        cma1.J((GoLinearLayout) access$getBinding3.c.d);
        cma1.M(access$getBinding3.j);
        cma1.M(access$getBinding3.d.b);
        cma1.M(access$getBinding3.i);
        GoConstraintLayout goConstraintLayout3 = access$getBinding3.a;
        goConstraintLayout3.setContentDescription(null);
        goConstraintLayout3.setImportantForAccessibility(2);
        OrganizationsModalView.access$getBinding(organizationsModalView).k.setShimmering(false);
    }
}
