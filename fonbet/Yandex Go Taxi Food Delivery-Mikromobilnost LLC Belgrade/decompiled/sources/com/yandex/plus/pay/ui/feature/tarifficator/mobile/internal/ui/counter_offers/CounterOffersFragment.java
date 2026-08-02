package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment;
import defpackage.aah0;
import defpackage.b64;
import defpackage.cs31;
import defpackage.d0f;
import defpackage.d2d0;
import defpackage.dye;
import defpackage.e0f;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.fs31;
import defpackage.gci0;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.jmh0;
import defpackage.k0f;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.l0f;
import defpackage.m0f;
import defpackage.mx60;
import defpackage.pub1;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.rze;
import defpackage.s23;
import defpackage.sls;
import defpackage.t23;
import defpackage.t6c;
import defpackage.ttz0;
import defpackage.uze;
import defpackage.v3a1;
import defpackage.vze;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wv5;
import defpackage.xu5;
import defpackage.y8f;
import defpackage.ywv;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/counter_offers/CounterOffersFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lm0f;", ClidProvider.STATE, "Luze;", "counterOffersViewController", "Lzy11;", "setScreenState", "(Lm0f;Luze;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lvze;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lvze;", "dependencies", "Lttz0;", "toolbarViewModel$delegate", "getToolbarViewModel", "()Lttz0;", "toolbarViewModel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/counter_offers/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/counter_offers/a;", "viewModel", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/counter_offers/CounterOffersContentView;", "counterOffersContentView$delegate", "Lxu5;", "getCounterOffersContentView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/counter_offers/CounterOffersContentView;", "counterOffersContentView", "Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView$delegate", "getProgressView", "()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CounterOffersFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("counterOffersContentView", 0, "getCounterOffersContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/counter_offers/CounterOffersContentView;", CounterOffersFragment.class), b64.x(qoi0.a, CounterOffersFragment.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0)};

    /* renamed from: counterOffersContentView$delegate, reason: from kotlin metadata */
    private final xu5 counterOffersContentView;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: toolbarViewModel$delegate, reason: from kotlin metadata */
    private final i3y toolbarViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$6] */
    public CounterOffersFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_counter_offers);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: c0f
            public final /* synthetic */ CounterOffersFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                vze dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                CounterOffersFragment counterOffersFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = CounterOffersFragment.dependencies_delegate$lambda$0(counterOffersFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = CounterOffersFragment.toolbarViewModel_delegate$lambda$1(counterOffersFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = CounterOffersFragment.viewModel_delegate$lambda$2(counterOffersFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: c0f
            public final /* synthetic */ CounterOffersFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                vze dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                CounterOffersFragment counterOffersFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = CounterOffersFragment.dependencies_delegate$lambda$0(counterOffersFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = CounterOffersFragment.toolbarViewModel_delegate$lambda$1(counterOffersFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = CounterOffersFragment.viewModel_delegate$lambda$2(counterOffersFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$1
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.toolbarViewModel = new es31(qoi0.a(ttz0.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar2 = this.$extrasProducer;
                if (slsVar2 != null && (y8fVar = (y8f) slsVar2.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                y8f defaultViewModelCreationExtras = q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? w8f.b : defaultViewModelCreationExtras;
            }
        });
        final int i3 = 2;
        sls slsVar2 = new sls(this) { // from class: c0f
            public final /* synthetic */ CounterOffersFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                vze dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                CounterOffersFragment counterOffersFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = CounterOffersFragment.dependencies_delegate$lambda$0(counterOffersFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = CounterOffersFragment.toolbarViewModel_delegate$lambda$1(counterOffersFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = CounterOffersFragment.viewModel_delegate$lambda$2(counterOffersFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r32 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$6
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r32.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar2, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$special$$inlined$viewModels$default$9
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar3 = this.$extrasProducer;
                if (slsVar3 != null && (y8fVar = (y8f) slsVar3.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                y8f defaultViewModelCreationExtras = q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? w8f.b : defaultViewModelCreationExtras;
            }
        });
        this.counterOffersContentView = new xu5(new d0f(this, i), new e0f(this, aah0.counter_offers_content_view, i));
        this.progressView = new xu5(new d0f(this, i2), new e0f(this, aah0.counter_offers_progress_view, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vze dependencies_delegate$lambda$0(CounterOffersFragment counterOffersFragment) {
        ArrayList b = ho91.b(counterOffersFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof vze) {
                return (vze) dependencies;
            }
        }
        qir.o(vze.class, b);
        return null;
    }

    private final CounterOffersContentView getCounterOffersContentView() {
        return (CounterOffersContentView) this.counterOffersContentView.a($$delegatedProperties[0]);
    }

    private final vze getDependencies() {
        return (vze) this.dependencies.getValue();
    }

    private final ProgressView getProgressView() {
        return (ProgressView) this.progressView.a($$delegatedProperties[1]);
    }

    private final ttz0 getToolbarViewModel() {
        return (ttz0) this.toolbarViewModel.getValue();
    }

    private final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(CounterOffersFragment counterOffersFragment, mx60 mx60Var) {
        counterOffersFragment.getViewModel().b.a();
        return zy11.a;
    }

    private static final zy11 onViewCreated$lambda$5$lambda$4(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(m0f state, uze counterOffersViewController) {
        if (state instanceof k0f) {
            getProgressView().setVisibility(0);
            counterOffersViewController.a.setVisibility(8);
            return;
        }
        if (!(state instanceof l0f)) {
            w511.b();
            return;
        }
        getProgressView().setVisibility(8);
        rze rzeVar = ((l0f) state).a;
        wv5 wv5Var = counterOffersViewController.c;
        wv5 wv5Var2 = counterOffersViewController.h;
        kgx[] kgxVarArr = uze.n;
        v3a1.c((TextView) wv5Var.a(kgxVarArr[1]), rzeVar.a);
        v3a1.c((TextView) counterOffersViewController.d.a(kgxVarArr[2]), rzeVar.b);
        counterOffersViewController.l.submitList(rzeVar.c);
        v3a1.c((TextView) counterOffersViewController.f.a(kgxVarArr[4]), rzeVar.d);
        v3a1.c((TextView) counterOffersViewController.g.a(kgxVarArr[5]), rzeVar.e);
        v3a1.c((TextView) wv5Var2.a(kgxVarArr[6]), rzeVar.f);
        ((TextView) wv5Var2.a(kgxVarArr[6])).setContentDescription(rzeVar.g);
        counterOffersViewController.a.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 toolbarViewModel_delegate$lambda$1(CounterOffersFragment counterOffersFragment) {
        return ((kmm0) counterOffersFragment.getDependencies()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(CounterOffersFragment counterOffersFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(a.class, new fs31(((kmm0) counterOffersFragment.getDependencies()).b, 10))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int i = 1;
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new dye(i, this));
        uze uzeVar = new uze(getCounterOffersContentView(), ((kmm0) getDependencies()).a.j, ((kmm0) getDependencies()).a.q, new CounterOffersFragment$onViewCreated$counterOffersViewController$1(0, getViewModel(), a.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0), new CounterOffersFragment$onViewCreated$counterOffersViewController$2(1, getViewModel(), a.class, "onOfferShow", "onOfferShow(I)V", 0), new CounterOffersFragment$onViewCreated$counterOffersViewController$3(1, getViewModel(), a.class, "onOfferClick", "onOfferClick(I)V", 0));
        t23 t23Var = new t23();
        t6c t6cVar = new t6c(i, uzeVar);
        t23.a aVar = new t23.a();
        onViewCreated$lambda$5$lambda$4(aVar);
        t23Var.a.put(t6cVar, aVar);
        t23Var.a(view);
        gci0 gci0Var = getToolbarViewModel().b;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        c.b(g.a(gci0Var, lifecycle, state), com.yandex.plus.home.common.utils.a.c(this), new CounterOffersFragment$onViewCreated$3(uzeVar, null));
        c.b(g.a(getViewModel().H, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new CounterOffersFragment$onViewCreated$4(this, uzeVar, null));
    }
}
