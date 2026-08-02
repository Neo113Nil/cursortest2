package com.yandex.go.places.impl.ui.filters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListFiltersCardCloseReason;
import com.yandex.go.places.impl.ui.filters.recycler.OrganizationsFiltersAdapter$special$$inlined$itemType$1;
import defpackage.a6r;
import defpackage.b700;
import defpackage.cma1;
import defpackage.cq80;
import defpackage.g0c;
import defpackage.he7;
import defpackage.hsj;
import defpackage.i3y;
import defpackage.im80;
import defpackage.jio;
import defpackage.mm80;
import defpackage.mth;
import defpackage.nht;
import defpackage.nm80;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.qgr0;
import defpackage.qoi0;
import defpackage.rm80;
import defpackage.scc;
import defpackage.t240;
import defpackage.tje;
import defpackage.tt2;
import defpackage.um80;
import defpackage.uuh0;
import defpackage.w3q0;
import defpackage.x3q0;
import defpackage.z5r;
import defpackage.zxs;
import defpackage.zxs0;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/go/places/impl/ui/filters/OrganizationsFiltersModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lnm80;", "Landroid/content/Context;", "context", "Ltt2;", "appDispatchers", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lrm80;", "organizationsFiltersPresenter", "<init>", "(Landroid/content/Context;Ltt2;Lru/yandex/taxi/widget/utils/e;Lrm80;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnm80;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onTouchOutside", "onBackPressed", "onSlideOut", "Lrm80;", "Lim80;", "filtersAdapter$delegate", "Li3y;", "getFiltersAdapter", "()Lim80;", "filtersAdapter", "mm80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationsFiltersModalView extends SlideableBindingModalView<nm80> {
    public static final int $stable = 8;

    /* renamed from: filtersAdapter$delegate, reason: from kotlin metadata */
    private final i3y filtersAdapter;
    private final rm80 organizationsFiltersPresenter;

    public OrganizationsFiltersModalView(Context context, tt2 tt2Var, e eVar, rm80 rm80Var) {
        super(context);
        this.organizationsFiltersPresenter = rm80Var;
        this.filtersAdapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new b700(17, tt2Var, eVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final im80 filtersAdapter_delegate$lambda$0(tt2 tt2Var, e eVar, OrganizationsFiltersModalView organizationsFiltersModalView) {
        OrganizationsFiltersModalView$filtersAdapter$2$1 organizationsFiltersModalView$filtersAdapter$2$1 = new OrganizationsFiltersModalView$filtersAdapter$2$1(1, organizationsFiltersModalView.organizationsFiltersPresenter, rm80.class, "onFilterItemClicked", "onFilterItemClicked(Lcom/yandex/go/places/impl/ui/filters/ChipUiState;)V", 0);
        List list = com.yandex.go.places.impl.ui.filters.recycler.a.V;
        g0c a = qoi0.a(z5r.class);
        zxs zxsVar = new zxs(a.a(), 0, null, list, null, new t240(tt2Var, eVar, organizationsFiltersModalView$filtersAdapter$2$1, 20));
        int i = x3q0.S;
        g0c a2 = qoi0.a(a6r.class);
        w3q0 w3q0Var = w3q0.a;
        OrganizationsFiltersAdapter$special$$inlined$itemType$1 organizationsFiltersAdapter$special$$inlined$itemType$1 = OrganizationsFiltersAdapter$special$$inlined$itemType$1.b;
        return new im80(scc.g(zxsVar, new zxs(a2.a(), 0, w3q0Var, EmptyList.a, new he7(1, organizationsFiltersAdapter$special$$inlined$itemType$1), null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final im80 getFiltersAdapter() {
        return (im80) this.filtersAdapter.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public nm80 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.organizations_filters_modal_view, parent, false);
        int i = o6h0.button_container;
        BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i, inflate);
        if (bottomEdgeButtonLayout != null) {
            i = o6h0.filters_list;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = o6h0.first_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = o6h0.second_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent2 != null) {
                        return new nm80((GoConstraintLayout) inflate, bottomEdgeButtonLayout, recyclerView, buttonComponent, buttonComponent2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View O;
        super.onAttachedToWindow();
        rm80 rm80Var = this.organizationsFiltersPresenter;
        mm80 mm80Var = new mm80(this);
        rm80Var.Bg(mm80Var);
        jio jioVar = rm80Var.x;
        hsj hsjVar = jioVar.b;
        String i = jioVar.i();
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", i);
        hsjVar.a.a("Discovery.FiltersCard.Shown", hashMap, 2, new HashMap());
        mm80Var.render(nht.c(rm80Var.B));
        tje.N(rm80Var.Jg(), null, null, new OrganizationsFiltersPresenter$attachView$1(rm80Var, null), 3);
        um80 um80Var = rm80Var.z;
        tje.N(rm80Var.Jg(), null, null, new OrganizationsFiltersPresenter$attachView$$inlined$collectIn$1(new d(new b(kotlinx.coroutines.flow.e.B(new mth(um80Var.b.a, 6), new OrganizationsFiltersUiStateInteractor$special$$inlined$flatMapConcat$1(null, um80Var)))), null, mm80Var), 3);
        RecyclerView recyclerView = getBinding().c;
        recyclerView.setAdapter(getFiltersAdapter());
        int i2 = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setItemAnimator(null);
        BottomEdgeButtonLayout bottomEdgeButtonLayout = getBinding().b;
        RecyclerView recyclerView2 = getBinding().c;
        zxs0 zxs0Var = new zxs0();
        zxs0Var.a = bottomEdgeButtonLayout;
        View inflate = LayoutInflater.from(bottomEdgeButtonLayout.getContext()).inflate(uuh0.organizations_top_shadowed_container, (ViewGroup) null, false);
        int i3 = o6h0.content_layout;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i3, inflate);
        if (frameLayout == null || (O = cma1.O((i3 = o6h0.scroll_indicator_shadow), inflate)) == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            throw null;
        }
        zxs0Var.b = new cq80((ConstraintLayout) inflate, frameLayout, O, i2);
        cq80 cq80Var = (cq80) zxs0Var.b;
        new qgr0(recyclerView2, zxs0Var);
        ViewGroup viewGroup = (ViewGroup) bottomEdgeButtonLayout.getParent();
        ViewGroup.LayoutParams layoutParams = bottomEdgeButtonLayout.getLayoutParams();
        int indexOfChild = viewGroup.indexOfChild(bottomEdgeButtonLayout);
        viewGroup.removeView(bottomEdgeButtonLayout);
        cq80Var.c.addView(bottomEdgeButtonLayout);
        viewGroup.addView(cq80Var.b, indexOfChild, layoutParams);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.organizationsFiltersPresenter.Kg(DiscoveryAnalytics$OrganizationListFiltersCardCloseReason.BackPressed);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.organizationsFiltersPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.organizationsFiltersPresenter.Kg(DiscoveryAnalytics$OrganizationListFiltersCardCloseReason.SlidedOut);
        super.onSlideOut();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        this.organizationsFiltersPresenter.Kg(DiscoveryAnalytics$OrganizationListFiltersCardCloseReason.TouchOutside);
        super.onTouchOutside();
    }
}
