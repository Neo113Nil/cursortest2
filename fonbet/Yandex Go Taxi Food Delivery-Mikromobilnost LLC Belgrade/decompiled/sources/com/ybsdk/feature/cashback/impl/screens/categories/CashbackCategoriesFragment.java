package com.ybsdk.feature.cashback.impl.screens.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.snackbar.SnackbarView;
import defpackage.a10;
import defpackage.c9s0;
import defpackage.ci8;
import defpackage.cx7;
import defpackage.dcs;
import defpackage.hh8;
import defpackage.ju8;
import defpackage.l29;
import defpackage.l39;
import defpackage.lav0;
import defpackage.lb7;
import defpackage.lfx;
import defpackage.m061;
import defpackage.n29;
import defpackage.o29;
import defpackage.p29;
import defpackage.q29;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.r29;
import defpackage.s29;
import defpackage.w511;
import defpackage.wwg;
import defpackage.y5e;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010-\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lm061;", "Ls29;", "Lcom/ybsdk/feature/cashback/impl/screens/categories/a;", "Ln29;", "viewModelFactory", "<init>", "(Ln29;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "createViewModel", "()Lcom/ybsdk/feature/cashback/impl/screens/categories/a;", "viewState", "render", "(Ls29;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lm061;", "Ln29;", "", "Lcom/ybsdk/feature/cashback/impl/entities/CashbackSelectorCategoryEntity;", "listOfSelectedElements", "Ljava/util/List;", "Llav0;", "delegatorsHelper", "Llav0;", "Lqa3;", "Lgav0;", "kotlin.jvm.PlatformType", "adapter", "Lqa3;", "Ll39;", "decorator", "Ll39;", "Companion", "l29", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CashbackCategoriesFragment extends BaseMvvmFragment<m061, s29, a> {
    private static final l29 Companion = new l29();
    private static final long TOAST_DURATION_MS = 1500;
    private final qa3 adapter;
    private final l39 decorator;
    private final lav0 delegatorsHelper;
    private final List<CashbackSelectorCategoryEntity> listOfSelectedElements;
    private final n29 viewModelFactory;

    public CashbackCategoriesFragment(n29 n29Var) {
        super(Boolean.TRUE, null, null, null, a.class, 14, null);
        this.viewModelFactory = n29Var;
        ArrayList arrayList = new ArrayList();
        this.listOfSelectedElements = arrayList;
        lav0 lav0Var = new lav0(arrayList, new hh8(8, this), new cx7(23, this));
        this.delegatorsHelper = lav0Var;
        a10 a = lav0Var.a();
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        qa3 qa3Var = new qa3(new lb7(9, y5e.b, a), lav0Var.c(), lav0.b());
        this.adapter = qa3Var;
        this.decorator = new l39(qa3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 delegatorsHelper$lambda$0(CashbackCategoriesFragment cashbackCategoriesFragment, CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity, boolean z) {
        cashbackCategoriesFragment.getViewModel().e0(cashbackCategoriesFragment.listOfSelectedElements, cashbackSelectorCategoryEntity, z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean delegatorsHelper$lambda$1(CashbackCategoriesFragment cashbackCategoriesFragment, CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity) {
        return cashbackCategoriesFragment.getViewModel().c0(cashbackCategoriesFragment.listOfSelectedElements, cashbackSelectorCategoryEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(CashbackCategoriesFragment cashbackCategoriesFragment, View view) {
        cashbackCategoriesFragment.getParentFragmentManager().l0(wwg.g(new Pair(CashbackDashboardFragment.NEED_TO_RELOAD_KEY, Boolean.TRUE)), CashbackDashboardFragment.REQUEST_SELECTOR);
        cashbackCategoriesFragment.getViewModel().f0(cashbackCategoriesFragment.listOfSelectedElements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(CashbackCategoriesFragment cashbackCategoriesFragment) {
        cashbackCategoriesFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$5$lambda$4(s29 s29Var, YbButtonView.a aVar) {
        p29 p29Var = (p29) s29Var;
        return new YbButtonView.a(p29Var.a(), null, null, null, null, null, null, false, p29Var.c(), null, 3070);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof c9s0) {
            ((m061) getBinding()).g.dismissNow();
            SnackbarView.show$default(((m061) getBinding()).g, ((c9s0) sideEffect).a(), 1500L, null, 4, null);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((o29) this.viewModelFactory).a((CashbackCategoriesScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public m061 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        m061 o = m061.o(inflater, container);
        RecyclerView recyclerView = o.b;
        recyclerView.setAdapter(this.adapter);
        ((h) recyclerView.getItemAnimator()).g = false;
        recyclerView.addItemDecoration(this.decorator);
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((m061) getBinding()).f.setOnClickListener(new ci8(3, this));
        ((m061) getBinding()).c.setPrimaryButtonOnClickListener(new ju8(6, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(s29 viewState) {
        m061 m061Var = (m061) getBinding();
        boolean z = viewState instanceof r29;
        m061Var.e.setVisibility(z ? 0 : 8);
        if (z) {
            return;
        }
        if (viewState instanceof p29) {
            this.adapter.g(((p29) viewState).b());
            m061Var.f.render(new cx7(24, viewState));
        } else if (viewState instanceof q29) {
            m061Var.c.render(((q29) viewState).a());
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
