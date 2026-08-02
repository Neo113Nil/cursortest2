package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleOfferView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment;
import defpackage.a80;
import defpackage.aah0;
import defpackage.bue0;
import defpackage.cs31;
import defpackage.cue0;
import defpackage.d2d0;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.fs31;
import defpackage.gci0;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.hue0;
import defpackage.i3y;
import defpackage.iue0;
import defpackage.jmh0;
import defpackage.k7d0;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.mue0;
import defpackage.mx60;
import defpackage.nn50;
import defpackage.nue0;
import defpackage.oue0;
import defpackage.pub1;
import defpackage.pue0;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.s23;
import defpackage.sls;
import defpackage.t23;
import defpackage.t6c;
import defpackage.ttz0;
import defpackage.v3a1;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wv5;
import defpackage.xu5;
import defpackage.xzr;
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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/presale/PresaleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lpue0;", ClidProvider.STATE, "Lbue0;", "presaleContentViewController", "Lzy11;", "setScreenState", "(Lpue0;Lbue0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcue0;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lcue0;", "dependencies", "Lttz0;", "toolbarViewModel$delegate", "getToolbarViewModel", "()Lttz0;", "toolbarViewModel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/presale/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/presale/a;", "viewModel", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/presale/PresaleContentView;", "presaleContentView$delegate", "Lxu5;", "getPresaleContentView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/presale/PresaleContentView;", "presaleContentView", "Lbue0;", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresaleFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: presaleContentView$delegate, reason: from kotlin metadata */
    private final xu5 presaleContentView;
    private bue0 presaleContentViewController;

    /* renamed from: toolbarViewModel$delegate, reason: from kotlin metadata */
    private final i3y toolbarViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("presaleContentView", 0, "getPresaleContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/presale/PresaleContentView;", PresaleFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$6] */
    public PresaleFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_presale);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: gue0
            public final /* synthetic */ PresaleFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                cue0 dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                PresaleFragment presaleFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = PresaleFragment.dependencies_delegate$lambda$0(presaleFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = PresaleFragment.toolbarViewModel_delegate$lambda$1(presaleFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = PresaleFragment.viewModel_delegate$lambda$2(presaleFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: gue0
            public final /* synthetic */ PresaleFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                cue0 dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                PresaleFragment presaleFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = PresaleFragment.dependencies_delegate$lambda$0(presaleFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = PresaleFragment.toolbarViewModel_delegate$lambda$1(presaleFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = PresaleFragment.viewModel_delegate$lambda$2(presaleFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r1 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.toolbarViewModel = new es31(qoi0.a(ttz0.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$4
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
        sls slsVar2 = new sls(this) { // from class: gue0
            public final /* synthetic */ PresaleFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                cue0 dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                PresaleFragment presaleFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = PresaleFragment.dependencies_delegate$lambda$0(presaleFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = PresaleFragment.toolbarViewModel_delegate$lambda$1(presaleFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = PresaleFragment.viewModel_delegate$lambda$2(presaleFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r12 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$6
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r12.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar2, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment$special$$inlined$viewModels$default$9
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
        this.presaleContentView = new xu5(new a80(25, this), new xzr(this, aah0.presale_content_view, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cue0 dependencies_delegate$lambda$0(PresaleFragment presaleFragment) {
        ArrayList b = ho91.b(presaleFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof cue0) {
                return (cue0) dependencies;
            }
        }
        qir.o(cue0.class, b);
        return null;
    }

    private final cue0 getDependencies() {
        return (cue0) this.dependencies.getValue();
    }

    private final PresaleContentView getPresaleContentView() {
        return (PresaleContentView) this.presaleContentView.a($$delegatedProperties[0]);
    }

    private final ttz0 getToolbarViewModel() {
        return (ttz0) this.toolbarViewModel.getValue();
    }

    private final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(PresaleFragment presaleFragment, mx60 mx60Var) {
        a viewModel = presaleFragment.getViewModel();
        viewModel.Z();
        viewModel.X();
        return zy11.a;
    }

    private static final zy11 onViewCreated$lambda$5$lambda$4(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(pue0 state, bue0 presaleContentViewController) {
        if (state instanceof mue0) {
            presaleContentViewController.g();
            presaleContentViewController.b().setVisibility(0);
            presaleContentViewController.b().setAlpha(1.0f);
            presaleContentViewController.c().setVisibility(8);
            presaleContentViewController.e().setVisibility(8);
            presaleContentViewController.l.a.setVisibility(8);
            presaleContentViewController.a().setVisibility(8);
            presaleContentViewController.f().setVisibility(8);
            return;
        }
        if (state instanceof oue0) {
            CharSequence charSequence = ((oue0) state).a;
            presaleContentViewController.g();
            presaleContentViewController.b().setVisibility(0);
            presaleContentViewController.b().setAlpha(1.0f);
            presaleContentViewController.c().setVisibility(0);
            presaleContentViewController.c().setText(charSequence);
            presaleContentViewController.e().setVisibility(8);
            presaleContentViewController.l.a.setVisibility(8);
            presaleContentViewController.a().setVisibility(8);
            presaleContentViewController.f().setVisibility(0);
            return;
        }
        if (!(state instanceof nue0)) {
            w511.b();
            return;
        }
        nue0 nue0Var = (nue0) state;
        CharSequence charSequence2 = nue0Var.a;
        hue0 hue0Var = nue0Var.b;
        CharSequence charSequence3 = nue0Var.c;
        CharSequence charSequence4 = nue0Var.d;
        presaleContentViewController.g();
        presaleContentViewController.b().setVisibility(0);
        presaleContentViewController.b().setAlpha(0.5f);
        presaleContentViewController.c().setVisibility(0);
        presaleContentViewController.c().setText(charSequence2);
        presaleContentViewController.e().setVisibility(0);
        presaleContentViewController.e().setText(charSequence3);
        iue0 iue0Var = presaleContentViewController.l;
        PresaleOfferView presaleOfferView = iue0Var.a;
        wv5 wv5Var = iue0Var.c;
        presaleOfferView.setVisibility(0);
        kgx[] kgxVarArr = iue0.i;
        ((TextView) wv5Var.a(kgxVarArr[1])).setText(hue0Var.b);
        v3a1.c((TextView) iue0Var.d.a(kgxVarArr[2]), hue0Var.a);
        ((TextView) iue0Var.e.a(kgxVarArr[3])).setText(hue0Var.c);
        ((TextView) iue0Var.f.a(kgxVarArr[4])).setText(hue0Var.d);
        ((Button) iue0Var.g.a(kgxVarArr[5])).setText(hue0Var.e);
        v3a1.c((TextView) iue0Var.h.a(kgxVarArr[6]), hue0Var.f);
        ((TextView) wv5Var.a(kgxVarArr[1])).sendAccessibilityEvent(8);
        v3a1.c(presaleContentViewController.a(), charSequence4);
        presaleContentViewController.f().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 toolbarViewModel_delegate$lambda$1(PresaleFragment presaleFragment) {
        return ((kmm0) presaleFragment.getDependencies()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(PresaleFragment presaleFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(a.class, new fs31(((kmm0) presaleFragment.getDependencies()).b, 9))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        bue0 bue0Var = this.presaleContentViewController;
        if (bue0Var != null) {
            bue0Var.d().setOnScrollChangeListener((nn50) null);
            bue0Var.j = null;
        }
        this.presaleContentViewController = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new k7d0(23, this));
        bue0 bue0Var = new bue0(getPresaleContentView(), ((kmm0) getDependencies()).a.j, ((kmm0) getDependencies()).a.q, new PresaleFragment$onViewCreated$presaleContentViewController$1(0, getViewModel(), a.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0), new PresaleFragment$onViewCreated$presaleContentViewController$2(0, getViewModel(), a.class, "onSuggestedOfferButtonClick", "onSuggestedOfferButtonClick()V", 0), new PresaleFragment$onViewCreated$presaleContentViewController$3(0, getViewModel(), a.class, "onOriginalOfferButtonClick", "onOriginalOfferButtonClick()V", 0), new PresaleFragment$onViewCreated$presaleContentViewController$4(0, getViewModel(), a.class, "onLegalTextShown", "onLegalTextShown()V", 0));
        this.presaleContentViewController = bue0Var;
        t23 t23Var = new t23();
        t6c t6cVar = new t6c(3, bue0Var);
        t23.a aVar = new t23.a();
        onViewCreated$lambda$5$lambda$4(aVar);
        t23Var.a.put(t6cVar, aVar);
        t23Var.a(view);
        gci0 gci0Var = getToolbarViewModel().b;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        c.b(g.a(gci0Var, lifecycle, state), com.yandex.plus.home.common.utils.a.c(this), new PresaleFragment$onViewCreated$3(bue0Var, null));
        c.b(g.a(getViewModel().D, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new PresaleFragment$onViewCreated$4(this, bue0Var, null));
    }
}
