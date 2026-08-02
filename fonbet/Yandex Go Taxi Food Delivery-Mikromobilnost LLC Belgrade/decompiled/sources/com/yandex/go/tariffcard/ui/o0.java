package com.yandex.go.tariffcard.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.tariffcard.api.experiment.HeaderCollapseButtonType;
import com.yandex.go.tariffcard.ui.model.VisibilityChangeOrigin;
import com.yandex.go.tariffcard.ui.recyclerview.animationmanager.RecyclerViewItemAnimationManager;
import defpackage.a8p;
import defpackage.aox0;
import defpackage.box0;
import defpackage.gdx0;
import defpackage.gix0;
import defpackage.gvz0;
import defpackage.hc;
import defpackage.hdx0;
import defpackage.idx0;
import defpackage.iix0;
import defpackage.jdx0;
import defpackage.jl40;
import defpackage.kdx0;
import defpackage.kyh0;
import defpackage.ldx0;
import defpackage.lzu0;
import defpackage.m1a0;
import defpackage.nhx0;
import defpackage.qhx0;
import defpackage.qr31;
import defpackage.rhx0;
import defpackage.shx0;
import defpackage.thx0;
import defpackage.tj;
import defpackage.txc;
import defpackage.uix0;
import defpackage.w511;
import defpackage.w69;
import defpackage.z0a0;
import defpackage.znx0;
import defpackage.zpj0;
import java.util.List;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class o0 implements gix0 {
    public final /* synthetic */ TariffOptionsCardView a;

    public o0(TariffOptionsCardView tariffOptionsCardView) {
        this.a = tariffOptionsCardView;
    }

    @Override // defpackage.gix0
    public final void Mf() {
        qhx0 qhx0Var;
        rhx0 rhx0Var;
        iix0 iix0Var;
        iix0 iix0Var2;
        iix0 iix0Var3;
        aox0 aox0Var;
        thx0 thx0Var;
        gvz0 gvz0Var;
        ru.yandex.taxi.summary.requirements.list.recycler.i iVar;
        thx0 thx0Var2;
        TariffOptionsCardView tariffOptionsCardView = this.a;
        qhx0Var = tariffOptionsCardView.cardAdapter;
        rhx0Var = tariffOptionsCardView.cardAdapterFactory;
        iix0Var = tariffOptionsCardView.presenter;
        txc txcVar = new txc(7, iix0Var);
        iix0Var2 = tariffOptionsCardView.presenter;
        TariffOptionsCardView$MvpView$initAdapter$newAdapter$2 tariffOptionsCardView$MvpView$initAdapter$newAdapter$2 = new TariffOptionsCardView$MvpView$initAdapter$newAdapter$2(2, iix0Var2, iix0.class, "checkMultiTariffOption", "checkMultiTariffOption(Ljava/lang/String;Z)V", 0);
        iix0Var3 = tariffOptionsCardView.presenter;
        TariffOptionsCardView$MvpView$initAdapter$newAdapter$3 tariffOptionsCardView$MvpView$initAdapter$newAdapter$3 = new TariffOptionsCardView$MvpView$initAdapter$newAdapter$3(1, iix0Var3, iix0.class, "unsupportedRequirementClicked", "unsupportedRequirementClicked(Lcom/yandex/go/tariffcard/ui/UnsupportedRequirement$RequirementData;)V", 0);
        aox0Var = tariffOptionsCardView.tariffSelectorViewHolderDelegateFactory;
        thx0Var = tariffOptionsCardView.binding;
        FrameLayout frameLayout = thx0Var.b;
        gvz0Var = tariffOptionsCardView.tooltipPlacementRepository;
        znx0 a = ((box0) aox0Var).a(new qr31(frameLayout, gvz0Var));
        iVar = tariffOptionsCardView.requirementItemsExternalDelegate;
        qhx0 a2 = ((shx0) rhx0Var).a(tariffOptionsCardView$MvpView$initAdapter$newAdapter$2, tariffOptionsCardView$MvpView$initAdapter$newAdapter$3, a, iVar.b(), txcVar);
        a2.submitList(qhx0Var != null ? qhx0Var.x.f : null, null);
        thx0Var2 = tariffOptionsCardView.binding;
        thx0Var2.d.setAdapter(a2);
        tariffOptionsCardView.cardAdapter = a2;
    }

    @Override // defpackage.gix0
    public final void c9(uix0 uix0Var, uix0 uix0Var2) {
        thx0 thx0Var;
        thx0 thx0Var2;
        Drawable iconByType;
        zpj0 zpj0Var;
        RecyclerViewItemAnimationManager recyclerViewItemAnimationManager;
        nhx0 nhx0Var;
        nhx0 nhx0Var2;
        RecyclerViewItemAnimationManager recyclerViewItemAnimationManager2;
        thx0 thx0Var3;
        thx0 thx0Var4;
        z0a0 z0a0Var;
        thx0 thx0Var5;
        thx0 thx0Var6;
        thx0 thx0Var7;
        zpj0 zpj0Var2;
        thx0 thx0Var8;
        HeaderCollapseButtonType headerCollapseButtonType = uix0Var2.e;
        TariffOptionsCardView tariffOptionsCardView = this.a;
        boolean z = false;
        if (headerCollapseButtonType == null) {
            thx0Var8 = tariffOptionsCardView.binding;
            thx0Var8.h.setVisibility(8);
        } else {
            thx0Var = tariffOptionsCardView.binding;
            thx0Var.h.setVisibility(0);
            thx0Var2 = this.a.binding;
            FloatButtonIconComponent floatButtonIconComponent = thx0Var2.h;
            iconByType = this.a.iconByType(headerCollapseButtonType);
            floatButtonIconComponent.setIcon(iconByType);
        }
        TariffOptionsCardView tariffOptionsCardView2 = this.a;
        String str = uix0Var2.f;
        if (uix0Var == null || !jl40.l(uix0Var.f, str)) {
            zpj0Var = tariffOptionsCardView2.requirementsShowListener;
            zpj0Var.d = str;
            zpj0Var.b.a.a(str, -1, VisibilityChangeOrigin.SYSTEM);
            if (uix0Var2.i) {
                recyclerViewItemAnimationManager = tariffOptionsCardView2.animationManager;
                nhx0Var = tariffOptionsCardView2.tariffOptionsAnimationRepository;
                a8p a8pVar = nhx0Var.e;
                nhx0Var2 = tariffOptionsCardView2.tariffOptionsAnimationRepository;
                recyclerViewItemAnimationManager.f(a8pVar, nhx0Var2.a);
            }
        }
        TariffOptionsCardView tariffOptionsCardView3 = this.a;
        List list = uix0Var2.a;
        if (uix0Var == null || !jl40.l(uix0Var.a, list)) {
            recyclerViewItemAnimationManager2 = tariffOptionsCardView3.animationManager;
            tj tjVar = new tj(29, tariffOptionsCardView3, uix0Var2);
            int i = com.yandex.go.tariffcard.ui.recyclerview.animationmanager.b.a[recyclerViewItemAnimationManager2.f.ordinal()];
            if (i == 1) {
                recyclerViewItemAnimationManager2.d = list;
                recyclerViewItemAnimationManager2.e = tjVar;
            } else {
                if (i != 2 && i != 3 && i != 4 && i != 5) {
                    w511.b();
                    return;
                }
                tjVar.invoke(list);
            }
        }
        thx0Var3 = this.a.binding;
        thx0Var3.i.render(uix0Var2.b);
        thx0Var4 = this.a.binding;
        CompositePaymentIconsView compositePaymentIconsView = thx0Var4.j;
        m1a0 m1a0Var = uix0Var2.c;
        z0a0Var = this.a.paymentIconLoader;
        compositePaymentIconsView.update(m1a0Var, z0a0Var, true, kyh0.summary_order_button_payment_content_description);
        thx0Var5 = this.a.binding;
        thx0Var5.f.setVisibility(uix0Var2.d ? 0 : 8);
        thx0Var6 = this.a.binding;
        thx0Var6.g.setVisibility(uix0Var2.d ? 8 : 0);
        TariffOptionsCardView tariffOptionsCardView4 = this.a;
        ldx0 ldx0Var = uix0Var2.h;
        if (uix0Var == null || !jl40.l(uix0Var.h, ldx0Var)) {
            thx0Var7 = tariffOptionsCardView4.binding;
            thx0Var7.c.setState(ldx0Var);
            if (!jl40.l(ldx0Var, gdx0.a) && !(ldx0Var instanceof idx0)) {
                if (!jl40.l(ldx0Var, hdx0.a) && !(ldx0Var instanceof jdx0) && !(ldx0Var instanceof kdx0)) {
                    w511.b();
                    return;
                }
                z = true;
            }
            zpj0Var2 = tariffOptionsCardView4.requirementsShowListener;
            zpj0Var2.c = z;
            zpj0Var2.a(VisibilityChangeOrigin.SYSTEM);
        }
    }

    @Override // defpackage.gix0
    public final void ge(int i) {
        LinearLayoutManager linearLayoutManager;
        Context context;
        linearLayoutManager = this.a.linearLayoutManager;
        View c0 = linearLayoutManager.c0(0);
        if (c0 == null || (context = c0.getContext()) == null) {
            return;
        }
        w69 w69Var = new w69(context, 0);
        w69Var.a = i;
        linearLayoutManager.v(w69Var);
    }

    @Override // defpackage.gix0
    public final void s1(ThemeType themeType) {
        thx0 thx0Var;
        thx0 thx0Var2;
        thx0 thx0Var3;
        TariffOptionsCardView tariffOptionsCardView = this.a;
        if (themeType == null) {
            thx0Var3 = tariffOptionsCardView.binding;
            thx0Var3.k.setVisibility(8);
            return;
        }
        thx0Var = tariffOptionsCardView.binding;
        thx0Var.k.setVisibility(0);
        thx0Var2 = tariffOptionsCardView.binding;
        View view = thx0Var2.k;
        view.animate().alpha(0.5f).setDuration(100L).withEndAction(new hc(20, new lzu0(19, tariffOptionsCardView, themeType), view)).start();
    }
}
