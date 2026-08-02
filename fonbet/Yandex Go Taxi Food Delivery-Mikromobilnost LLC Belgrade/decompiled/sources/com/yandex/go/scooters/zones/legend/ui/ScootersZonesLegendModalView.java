package com.yandex.go.scooters.zones.legend.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.abp0;
import defpackage.b0b;
import defpackage.ca1;
import defpackage.eap0;
import defpackage.fap0;
import defpackage.g0c;
import defpackage.gap0;
import defpackage.he7;
import defpackage.hwo0;
import defpackage.iap0;
import defpackage.ic0;
import defpackage.ko4;
import defpackage.lap0;
import defpackage.lj1;
import defpackage.lki;
import defpackage.mrg0;
import defpackage.pap0;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u8w;
import defpackage.uyj;
import defpackage.w9u;
import defpackage.xng0;
import defpackage.z2v0;
import defpackage.zxs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableProgramModalView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/scooters/zones/legend/ui/ScootersZonesLegendModalView;", "Lru/yandex/taxi/widget/SlideableProgramModalView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lpap0;", "scootersZonesInfoPresenter", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/widget/utils/e;Lpap0;)V", "Lzy11;", "setItemDecoration", "()V", "setBackground", "createContentRootView", "()Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpap0;", "Leap0;", "adapter", "Leap0;", "lap0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersZonesLegendModalView extends SlideableProgramModalView<RecyclerView> {
    private final eap0 adapter;
    private final pap0 scootersZonesInfoPresenter;

    public ScootersZonesLegendModalView(Context context, ru.yandex.taxi.widget.utils.e eVar, pap0 pap0Var) {
        super(context);
        this.scootersZonesInfoPresenter = pap0Var;
        ScootersZonesLegendModalView$adapter$1 scootersZonesLegendModalView$adapter$1 = new ScootersZonesLegendModalView$adapter$1(0, pap0Var, pap0.class, "doneClicked", "doneClicked()V", 0);
        lki lkiVar = new lki(9);
        int i = b0b.e0;
        g0c a = qoi0.a(gap0.class);
        w9u w9uVar = new w9u(3);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, w9uVar);
        int i2 = e.V;
        g0c a3 = qoi0.a(iap0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new z2v0(context, 9), emptyList, new he7(1, new ko4(eVar, 2)), null);
        int i3 = ca1.g0;
        g0c a4 = qoi0.a(fap0.class);
        this.adapter = new eap0(lkiVar, scc.g(zxsVar, zxsVar2, new zxs(a4.a(), 0, new lj1(context, 6), emptyList, new he7(1, new ic0(7, scootersZonesLegendModalView$adapter$1)), null)));
    }

    private final void setBackground() {
        getContentRootView().setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    private final void setItemDecoration() {
        getContentRootView().addItemDecoration(new abp0(tje.r(mrg0.go_design_s_space, getContext()), this.adapter.m(iap0.class)));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setBackground();
    }

    @Override // ru.yandex.taxi.widget.SlideableProgramModalView
    public RecyclerView createContentRootView() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setImportantForAccessibility(2);
        return recyclerView;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackground();
        getContentRootView().setAdapter(this.adapter);
        setItemDecoration();
        pap0 pap0Var = this.scootersZonesInfoPresenter;
        lap0 lap0Var = new lap0(this);
        pap0Var.Bg(lap0Var);
        hwo0 hwo0Var = pap0Var.y;
        tpr t = kotlinx.coroutines.flow.e.t(new d(new m0(((com.yandex.go.scooters.zones.legend.domain.c) hwo0Var.w).a(pap0Var.z), ((pwy0) hwo0Var.c).a(), new ScootersZonesLegendUiStateInteractor$uiStateFlow$1(3, null)), hwo0Var));
        ((tt2) hwo0Var.b).getClass();
        tje.N(pap0Var.Jg(), null, null, new ScootersZonesLegendPresenter$attachView$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(t, uyj.a), null, lap0Var, pap0Var), 3);
        u8w u8wVar = (u8w) pap0Var.x.b;
        u8wVar.getClass();
        u8wVar.a.a("ScootersZonesLegend.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersZonesInfoPresenter.Cg();
    }
}
