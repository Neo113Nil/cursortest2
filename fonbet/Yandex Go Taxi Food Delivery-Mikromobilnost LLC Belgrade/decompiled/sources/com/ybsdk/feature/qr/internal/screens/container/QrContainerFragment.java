package com.ybsdk.feature.qr.internal.screens.container;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.passes.widget.api.presentation.PassesWidgetView;
import com.ybsdk.widgets.common.segmented.SegmentedControlView;
import defpackage.d8u0;
import defpackage.dcs;
import defpackage.gm90;
import defpackage.gwg0;
import defpackage.hee;
import defpackage.jl40;
import defpackage.k650;
import defpackage.lfx;
import defpackage.m6g0;
import defpackage.n6g0;
import defpackage.n751;
import defpackage.ny61;
import defpackage.odf0;
import defpackage.p461;
import defpackage.p6g0;
import defpackage.q6g0;
import defpackage.q9q0;
import defpackage.rje;
import defpackage.s6g0;
import defpackage.t6g0;
import defpackage.tcc;
import defpackage.tdr;
import defpackage.x4c;
import defpackage.y1x0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u000269\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J+\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/ybsdk/feature/qr/internal/screens/container/QrContainerFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lp461;", "Lt6g0;", "Lcom/ybsdk/feature/qr/internal/screens/container/a;", "Ltdr;", "", "Lp6g0;", "viewModelFactory", "<init>", "(Lp6g0;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lzy11;", "setStatusBarColor", "(Landroidx/fragment/app/Fragment;)V", "setNavBarColor", "", "position", "tryToGetViewPagerFragmentAt", "(I)Landroidx/fragment/app/Fragment;", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lcom/ybsdk/feature/qr/internal/screens/container/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp461;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "viewState", "render", "(Lt6g0;)V", "onDestroyView", "()V", "isVisible", "changePagerControlsVisibility", "(Z)V", "", "screenKey", "focusScreen", "(Ljava/lang/String;)V", "Lp6g0;", "m6g0", "childLifecycleCallbacksHandler", "Lm6g0;", "n6g0", "viewPagerPageChangeCallback", "Ln6g0;", "Ls6g0;", "adapter", "Ls6g0;", "feature-qr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QrContainerFragment extends BaseDivContextMvvmFragment<p461, t6g0, a> implements tdr {
    private s6g0 adapter;
    private final m6g0 childLifecycleCallbacksHandler;
    private final p6g0 viewModelFactory;
    private final n6g0 viewPagerPageChangeCallback;

    public QrContainerFragment(p6g0 p6g0Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = p6g0Var;
        this.childLifecycleCallbacksHandler = new m6g0(this);
        this.viewPagerPageChangeCallback = new n6g0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$2$lambda$0(QrContainerFragment qrContainerFragment, int i) {
        ((a) qrContainerFragment.getViewModel()).c0(i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setNavBarColor(Fragment fragment) {
        setNavigationBarColorModel(fragment instanceof k650 ? ((k650) fragment).getNavigationBarColorModel() : new z1x0(y1x0.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setStatusBarColor(Fragment fragment) {
        setStatusBarColorModel(fragment instanceof d8u0 ? ((d8u0) fragment).getStatusBarColorModel() : new z1x0(y1x0.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fragment tryToGetViewPagerFragmentAt(int position) {
        Object obj;
        s6g0 s6g0Var = this.adapter;
        if (s6g0Var == null) {
            s6g0Var = null;
        }
        Fragment n = s6g0Var.n(position);
        if (n == null) {
            Iterator it = getChildFragmentManager().c.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Fragment) obj).getLifecycle().b() == Lifecycle.State.RESUMED) {
                    break;
                }
            }
            n = (Fragment) obj;
        }
        if (n == null) {
            x4c.g("Could not get ViewPager2 child fragment", null, Integer.valueOf(position), null, 10);
        }
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void changePagerControlsVisibility(boolean isVisible) {
        ((p461) getBinding()).e.setVisibility(isVisible ? 0 : 8);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((q6g0) this.viewModelFactory).a((QrContainerScreenParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void focusScreen(String screenKey) {
        s6g0 s6g0Var = this.adapter;
        if (s6g0Var == null) {
            s6g0Var = null;
        }
        Iterator it = s6g0Var.getCurrentList().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (jl40.l(((FragmentScreen) it.next()).getScreenKey(), screenKey)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            ((p461) getBinding()).f.setCurrentItem(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public p461 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        p461 o = p461.o(inflater, container);
        o.e.setOnItemSelectedListener(new odf0(4, this));
        s6g0 s6g0Var = new s6g0(getChildFragmentManager(), this);
        this.adapter = s6g0Var;
        ViewPager2 viewPager2 = o.f;
        viewPager2.setAdapter(s6g0Var);
        viewPager2.setUserInputEnabled(false);
        viewPager2.registerOnPageChangeCallback(this.viewPagerPageChangeCallback);
        ((RecyclerView) viewPager2.getChildAt(0)).setItemAnimator(null);
        PassesWidgetView passesWidgetView = o.b;
        passesWidgetView.setOnRetryClick(new QrContainerFragment$getViewBinding$1$2(getViewModel()));
        float f = gm90.a;
        gm90.a(o.c);
        passesWidgetView.setActionHandler(new QrContainerFragment$getViewBinding$1$4(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        int i = insets.a.h(2).d;
        int d = rje.d(gwg0.ybsdk_qr_container_tabview_bottom_margin, requireContext()) + i;
        SegmentedControlView segmentedControlView = ((p461) getBinding()).e;
        ViewGroup.LayoutParams layoutParams = segmentedControlView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, d);
        segmentedControlView.setLayoutParams(marginLayoutParams);
        ((p461) getBinding()).b.applyBottomInset(i);
        return insets;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, com.ybsdk.core.presentation.BindingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        getChildFragmentManager().d0(this.childLifecycleCallbacksHandler, true);
        return onCreateView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().r0(this.childLifecycleCallbacksHandler);
        ((p461) getBinding()).f.unregisterOnPageChangeCallback(this.viewPagerPageChangeCallback);
        ((p461) getBinding()).f.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(t6g0 viewState) {
        p461 p461Var = (p461) getBinding();
        s6g0 s6g0Var = this.adapter;
        if (s6g0Var == null) {
            s6g0Var = null;
        }
        List a = viewState.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((hee) it.next()).a());
        }
        s6g0Var.submitList(arrayList);
        SegmentedControlView segmentedControlView = p461Var.e;
        PassesWidgetView passesWidgetView = p461Var.b;
        List a2 = viewState.a();
        ArrayList arrayList2 = new ArrayList(tcc.n(a2, 10));
        Iterator it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((hee) it2.next()).b());
        }
        segmentedControlView.render(new q9q0(arrayList2));
        p461Var.f.setCurrentItem(viewState.c(), false);
        boolean z = viewState.b() != null;
        p461Var.c.setClipToOutline(z);
        p461Var.d.setVisibility(z ? 0 : 8);
        passesWidgetView.setVisibility(z ? 0 : 8);
        passesWidgetView.render(viewState.b());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
