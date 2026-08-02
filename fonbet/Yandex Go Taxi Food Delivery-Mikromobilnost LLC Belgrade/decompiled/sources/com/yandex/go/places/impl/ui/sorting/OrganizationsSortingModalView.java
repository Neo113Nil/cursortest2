package com.yandex.go.places.impl.ui.sorting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListSortsCardClickType;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListSortsCardCloseReason;
import com.yandex.go.places.impl.domain.interactors.organizations.f;
import com.yandex.go.places.impl.domain.interactors.organizations.g;
import defpackage.ak80;
import defpackage.cma1;
import defpackage.da0;
import defpackage.g0c;
import defpackage.he7;
import defpackage.hsj;
import defpackage.i3y;
import defpackage.jio;
import defpackage.lz70;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.op70;
import defpackage.qk80;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.rp80;
import defpackage.sp80;
import defpackage.tje;
import defpackage.tp80;
import defpackage.tse0;
import defpackage.ub60;
import defpackage.up80;
import defpackage.ur70;
import defpackage.uuh0;
import defpackage.yp80;
import defpackage.yx20;
import defpackage.zxs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/yandex/go/places/impl/ui/sorting/OrganizationsSortingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lup80;", "Landroid/content/Context;", "context", "Lyp80;", "presenter", "<init>", "(Landroid/content/Context;Lyp80;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lup80;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onTouchOutside", "onSlideOut", "Landroid/content/Context;", "getContext$annotations", "Lyp80;", "getPresenter", "()Lyp80;", "Lsp80;", "organizationsSortingListAdapter$delegate", "Li3y;", "getOrganizationsSortingListAdapter", "()Lsp80;", "organizationsSortingListAdapter", "tp80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationsSortingModalView extends SlideableBindingModalView<up80> {
    public static final int $stable = 8;
    private final Context context;

    /* renamed from: organizationsSortingListAdapter$delegate, reason: from kotlin metadata */
    private final i3y organizationsSortingListAdapter;
    private final yp80 presenter;

    public OrganizationsSortingModalView(Context context, yp80 yp80Var) {
        super(context);
        this.context = context;
        this.presenter = yp80Var;
        this.organizationsSortingListAdapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new ak80(5, this));
    }

    public static final /* synthetic */ up80 access$getBinding(OrganizationsSortingModalView organizationsSortingModalView) {
        return organizationsSortingModalView.getBinding();
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sp80 getOrganizationsSortingListAdapter() {
        return (sp80) this.organizationsSortingListAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(OrganizationsSortingModalView organizationsSortingModalView) {
        yp80 yp80Var = organizationsSortingModalView.presenter;
        DiscoveryAnalytics$OrganizationListSortsCardCloseReason discoveryAnalytics$OrganizationListSortsCardCloseReason = DiscoveryAnalytics$OrganizationListSortsCardCloseReason.BackPressed;
        ((da0) yp80Var.A.a).r(new qu(9));
        yp80Var.x.h(discoveryAnalytics$OrganizationListSortsCardCloseReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sp80 organizationsSortingListAdapter_delegate$lambda$0(OrganizationsSortingModalView organizationsSortingModalView) {
        lz70 lz70Var = new lz70(6, organizationsSortingModalView);
        List list = com.yandex.go.places.impl.ui.sorting.recycler.viewholders.a.T;
        g0c a = qoi0.a(rp80.class);
        ur70 ur70Var = new ur70(22);
        ub60 ub60Var = new ub60(28, lz70Var);
        return new sp80(Collections.singletonList(new zxs(a.a(), 0, ur70Var, com.yandex.go.places.impl.ui.sorting.recycler.viewholders.a.T, new he7(1, ub60Var), null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void organizationsSortingListAdapter_delegate$lambda$0$0(OrganizationsSortingModalView organizationsSortingModalView, String str) {
        yp80 yp80Var = organizationsSortingModalView.presenter;
        jio jioVar = yp80Var.x;
        DiscoveryAnalytics$OrganizationListSortsCardClickType discoveryAnalytics$OrganizationListSortsCardClickType = DiscoveryAnalytics$OrganizationListSortsCardClickType.SortItem;
        hsj hsjVar = jioVar.b;
        String i = jioVar.i();
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", discoveryAnalytics$OrganizationListSortsCardClickType.getEventValue());
        if (str != null) {
            hashMap.put("sort_option_id", str);
        }
        hsjVar.a.a("Discovery.SortsCard.Tapped", hashMap, 2, tse0.r("source", hashMap, i));
        yp80Var.y.a(str);
        ((da0) yp80Var.A.a).r(new ur70(23));
        jioVar.h(DiscoveryAnalytics$OrganizationListSortsCardCloseReason.SelectSortItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public up80 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.organizations_sorting_modal_view, parent, false);
        int i = o6h0.header;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = o6h0.sorting_items;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                return new up80((GoLinearLayout) inflate, robotoTextView, recyclerView);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final yp80 getPresenter() {
        return this.presenter;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView recyclerView = getBinding().c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.addItemDecoration(new qk80(recyclerView.getContext()));
        recyclerView.setAdapter(getOrganizationsSortingListAdapter());
        setOnBackPressedListener(new op70(12, this));
        yp80 yp80Var = this.presenter;
        tp80 tp80Var = new tp80(this);
        yp80Var.Bg(tp80Var);
        jio jioVar = yp80Var.x;
        hsj hsjVar = jioVar.b;
        String i = jioVar.i();
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", i);
        hsjVar.a.a("Discovery.SortsCard.Shown", hashMap, 2, new HashMap());
        yx20 yx20Var = yp80Var.z;
        CharSequence charSequence = (CharSequence) yx20Var.b.a;
        ArrayList Kg = yp80.Kg(yx20Var);
        if (charSequence != null) {
            access$getBinding(this).b.setVisibility(0);
            access$getBinding(this).b.setText(charSequence);
        } else {
            access$getBinding(this).b.setVisibility(8);
        }
        getOrganizationsSortingListAdapter().submitList(Kg, null);
        g gVar = yp80Var.y;
        tje.N(yp80Var.Jg(), null, null, new OrganizationsSortingPresenter$attachView$$inlined$safeCollectIn$1(new d(new b(new mth(new f(new com.yandex.go.places.impl.domain.interactors.organizations.d(gVar.c), yx20Var.a), 6)), yp80Var), null, tp80Var), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        getBinding().c.setAdapter(null);
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        yp80 yp80Var = this.presenter;
        DiscoveryAnalytics$OrganizationListSortsCardCloseReason discoveryAnalytics$OrganizationListSortsCardCloseReason = DiscoveryAnalytics$OrganizationListSortsCardCloseReason.SlidedOut;
        ((da0) yp80Var.A.a).r(new qu(9));
        yp80Var.x.h(discoveryAnalytics$OrganizationListSortsCardCloseReason);
        super.onSlideOut();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        yp80 yp80Var = this.presenter;
        DiscoveryAnalytics$OrganizationListSortsCardCloseReason discoveryAnalytics$OrganizationListSortsCardCloseReason = DiscoveryAnalytics$OrganizationListSortsCardCloseReason.TouchOutside;
        ((da0) yp80Var.A.a).r(new qu(9));
        yp80Var.x.h(discoveryAnalytics$OrganizationListSortsCardCloseReason);
        super.onTouchOutside();
    }
}
