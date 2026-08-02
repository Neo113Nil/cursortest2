package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.glide.b;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.ClosingOfferContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.aah0;
import defpackage.b64;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.fs31;
import defpackage.g7c;
import defpackage.gci0;
import defpackage.h7c;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.i6c;
import defpackage.i7c;
import defpackage.j7c;
import defpackage.jmh0;
import defpackage.k6c;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.l6c;
import defpackage.mx60;
import defpackage.n4u0;
import defpackage.pub1;
import defpackage.q7u;
import defpackage.qc20;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.s23;
import defpackage.sls;
import defpackage.t23;
import defpackage.t6c;
import defpackage.tpd0;
import defpackage.ttz0;
import defpackage.u6c;
import defpackage.v3a1;
import defpackage.v6c;
import defpackage.vqb;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/closing/ClosingOfferFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/View;", "view", "Lk6c;", "closingOfferViewController", "Lzy11;", "applyInsets", "(Landroid/view/View;Lk6c;)V", "Lj7c;", ClidProvider.STATE, "setScreenState", "(Lj7c;Lk6c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ll6c;", "dependencies$delegate", "Li3y;", "getDependencies", "()Ll6c;", "dependencies", "Lttz0;", "toolbarViewModel$delegate", "getToolbarViewModel", "()Lttz0;", "toolbarViewModel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/closing/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/closing/a;", "viewModel", "progressView$delegate", "Lxu5;", "getProgressView", "()Landroid/view/View;", "progressView", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/closing/content/ClosingOfferContentView;", "closingOfferView$delegate", "getClosingOfferView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/closing/content/ClosingOfferContentView;", "closingOfferView", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClosingOfferFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("progressView", 0, "getProgressView()Landroid/view/View;", ClosingOfferFragment.class), b64.x(qoi0.a, ClosingOfferFragment.class, "closingOfferView", "getClosingOfferView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/closing/content/ClosingOfferContentView;", 0)};

    /* renamed from: closingOfferView$delegate, reason: from kotlin metadata */
    private final xu5 closingOfferView;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: toolbarViewModel$delegate, reason: from kotlin metadata */
    private final i3y toolbarViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$6] */
    public ClosingOfferFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_closing_offer);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: s6c
            public final /* synthetic */ ClosingOfferFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                l6c dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                ClosingOfferFragment closingOfferFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = ClosingOfferFragment.dependencies_delegate$lambda$0(closingOfferFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ClosingOfferFragment.toolbarViewModel_delegate$lambda$1(closingOfferFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ClosingOfferFragment.viewModel_delegate$lambda$2(closingOfferFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: s6c
            public final /* synthetic */ ClosingOfferFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                l6c dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                ClosingOfferFragment closingOfferFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = ClosingOfferFragment.dependencies_delegate$lambda$0(closingOfferFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ClosingOfferFragment.toolbarViewModel_delegate$lambda$1(closingOfferFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ClosingOfferFragment.viewModel_delegate$lambda$2(closingOfferFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.toolbarViewModel = new es31(qoi0.a(ttz0.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$4
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
        sls slsVar2 = new sls(this) { // from class: s6c
            public final /* synthetic */ ClosingOfferFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                l6c dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                ClosingOfferFragment closingOfferFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = ClosingOfferFragment.dependencies_delegate$lambda$0(closingOfferFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ClosingOfferFragment.toolbarViewModel_delegate$lambda$1(closingOfferFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ClosingOfferFragment.viewModel_delegate$lambda$2(closingOfferFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r32 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$6
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r32.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar2, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$special$$inlined$viewModels$default$9
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
        this.progressView = new xu5(new u6c(this, i), new v6c(this, aah0.closing_progress_view, i));
        this.closingOfferView = new xu5(new u6c(this, i2), new v6c(this, aah0.closing_offer_view, i2));
    }

    private final void applyInsets(View view, k6c closingOfferViewController) {
        t23 t23Var = new t23();
        t6c t6cVar = new t6c(0, closingOfferViewController);
        t23.a aVar = new t23.a();
        applyInsets$lambda$5$lambda$4(aVar);
        t23Var.a.put(t6cVar, aVar);
        t23Var.a(view);
    }

    private static final zy11 applyInsets$lambda$5$lambda$4(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l6c dependencies_delegate$lambda$0(ClosingOfferFragment closingOfferFragment) {
        ArrayList b = ho91.b(closingOfferFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof l6c) {
                return (l6c) dependencies;
            }
        }
        qir.o(l6c.class, b);
        return null;
    }

    private final ClosingOfferContentView getClosingOfferView() {
        return (ClosingOfferContentView) this.closingOfferView.a($$delegatedProperties[1]);
    }

    private final l6c getDependencies() {
        return (l6c) this.dependencies.getValue();
    }

    private final View getProgressView() {
        return (View) this.progressView.a($$delegatedProperties[0]);
    }

    private final ttz0 getToolbarViewModel() {
        return (ttz0) this.toolbarViewModel.getValue();
    }

    private final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(ClosingOfferFragment closingOfferFragment, mx60 mx60Var) {
        a viewModel = closingOfferFragment.getViewModel();
        PlusPayClosingOffer plusPayClosingOffer = viewModel.A;
        if (plusPayClosingOffer != null) {
            ((g7c) viewModel.z).a(viewModel.x.a.a(), plusPayClosingOffer);
        }
        viewModel.b.a();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(j7c state, k6c closingOfferViewController) {
        if (state instanceof i7c) {
            getProgressView().setVisibility(0);
            ((b) closingOfferViewController.b).a(closingOfferViewController.a());
            closingOfferViewController.a.setVisibility(8);
            return;
        }
        if (!(state instanceof h7c)) {
            w511.b();
            return;
        }
        getProgressView().setVisibility(8);
        i6c i6cVar = ((h7c) state).a;
        PlusThemedImage plusThemedImage = i6cVar.a;
        b bVar = (b) closingOfferViewController.b;
        bVar.a(closingOfferViewController.a());
        bVar.b((String) (tpd0.a(closingOfferViewController.a().getContext(), (PlusTheme) ((n4u0) ((qc20) closingOfferViewController.c).a).getValue()) ? plusThemedImage.getDark() : plusThemedImage.getLight())).b(closingOfferViewController.a());
        wv5 wv5Var = closingOfferViewController.h;
        kgx[] kgxVarArr = k6c.s;
        ((TextView) wv5Var.a(kgxVarArr[4])).setText(i6cVar.b);
        v3a1.c((TextView) closingOfferViewController.i.a(kgxVarArr[5]), i6cVar.c);
        closingOfferViewController.n.submitList(i6cVar.d);
        ((Button) closingOfferViewController.j.a(kgxVarArr[7])).setText(i6cVar.e);
        ((Button) closingOfferViewController.k.a(kgxVarArr[8])).setText(i6cVar.f);
        v3a1.c((TextView) closingOfferViewController.l.a(kgxVarArr[9]), i6cVar.g);
        closingOfferViewController.a.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 toolbarViewModel_delegate$lambda$1(ClosingOfferFragment closingOfferFragment) {
        return ((kmm0) closingOfferFragment.getDependencies()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(ClosingOfferFragment closingOfferFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(a.class, new fs31(((kmm0) closingOfferFragment.getDependencies()).b, 7))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new vqb(7, this));
        k6c k6cVar = new k6c(getClosingOfferView(), ((kmm0) getDependencies()).a.j, ((kmm0) getDependencies()).a.q, new ClosingOfferFragment$onViewCreated$closingOfferViewController$1(0, getViewModel(), a.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0), new ClosingOfferFragment$onViewCreated$closingOfferViewController$2(0, getViewModel(), a.class, "onAcceptButtonClick", "onAcceptButtonClick()V", 0), new ClosingOfferFragment$onViewCreated$closingOfferViewController$3(0, getViewModel(), a.class, "onRejectButtonClick", "onRejectButtonClick()V", 0));
        applyInsets(view, k6cVar);
        gci0 gci0Var = getToolbarViewModel().b;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        c.b(g.a(gci0Var, lifecycle, state), com.yandex.plus.home.common.utils.a.c(this), new ClosingOfferFragment$onViewCreated$2(k6cVar, null));
        c.b(g.a(getViewModel().C, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new ClosingOfferFragment$onViewCreated$3(this, k6cVar, null));
    }
}
