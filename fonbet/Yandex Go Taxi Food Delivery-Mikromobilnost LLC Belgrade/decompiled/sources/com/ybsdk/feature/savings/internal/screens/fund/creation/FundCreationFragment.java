package com.ybsdk.feature.savings.internal.screens.fund.creation;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import defpackage.ahq0;
import defpackage.bdp;
import defpackage.bns;
import defpackage.ce4;
import defpackage.cns;
import defpackage.dcs;
import defpackage.dns;
import defpackage.hua1;
import defpackage.jl40;
import defpackage.jns;
import defpackage.k561;
import defpackage.kns;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lns;
import defpackage.mns;
import defpackage.ons;
import defpackage.pns;
import defpackage.qas0;
import defpackage.qns;
import defpackage.s1r;
import defpackage.sls;
import defpackage.sns;
import defpackage.tls;
import defpackage.tns;
import defpackage.udm0;
import defpackage.uns;
import defpackage.w511;
import defpackage.wcm0;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yms;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001.\b\u0000\u0018\u0000 12\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00012B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0016J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/fund/creation/FundCreationFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lk561;", "Luns;", "Lcom/ybsdk/feature/savings/internal/screens/fund/creation/a;", "Lce4;", "Ljns;", "viewModelProvider", "Ludm0;", "twoFactorAuthScreenProvider", "<init>", "(Ljns;Ludm0;)V", "Lmns;", "sideEffect", "Lzy11;", "showSourceBottomSheet", "(Lmns;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "", "onBackPressed", "()Z", "createViewModel", "()Lcom/ybsdk/feature/savings/internal/screens/fund/creation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lk561;", "viewState", "render", "(Luns;)V", "onDestroyView", "Lqas0;", "consumeSideEffect", "(Lqas0;)V", "Ljns;", "Ludm0;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "dns", "selectPaymentMethodListener", "Ldns;", "Companion", "cns", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FundCreationFragment extends BaseDivContextMvvmFragment<k561, uns, a> implements ce4 {
    private static final cns Companion = new cns();

    @Deprecated
    public static final String TAG_BOTTOM_SHEET_SOURCE = "SOURCE_SELECTION_BOTTOM_SHEET";
    private BottomSheetDialogView bottomSheetDialogView;
    private final dns selectPaymentMethodListener;
    private final udm0 twoFactorAuthScreenProvider;
    private final jns viewModelProvider;

    public FundCreationFragment(jns jnsVar, udm0 udm0Var) {
        super(Boolean.TRUE, 48, null, null, a.class, 12, null);
        this.viewModelProvider = jnsVar;
        this.twoFactorAuthScreenProvider = udm0Var;
        this.selectPaymentMethodListener = new dns(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ a access$getViewModel(FundCreationFragment fundCreationFragment) {
        return (a) fundCreationFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$5$lambda$1(FundCreationFragment fundCreationFragment) {
        ((a) fundCreationFragment.getViewModel()).f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$5$lambda$2(FundCreationFragment fundCreationFragment) {
        ((a) fundCreationFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$5$lambda$3(FundCreationFragment fundCreationFragment, View view) {
        ((a) fundCreationFragment.getViewModel()).l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$5$lambda$4(FundCreationFragment fundCreationFragment, Editable editable) {
        ((a) fundCreationFragment.getViewModel()).d0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$0(FundCreationFragment fundCreationFragment, String str, Bundle bundle) {
        ((a) fundCreationFragment.getViewModel()).h0(((wcm0) fundCreationFragment.twoFactorAuthScreenProvider).a(bundle));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahq0 render$lambda$6(uns unsVar, ahq0 ahq0Var) {
        return ((pns) unsVar).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$7(uns unsVar, g gVar) {
        return ((pns) unsVar).c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [uc5] */
    private final void showSourceBottomSheet(mns sideEffect) {
        BottomSheetDialogView bottomSheetDialogView;
        lcb1.d(((k561) getBinding()).o());
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new e(null, null, new bdp(14, this, sideEffect), 3), new YbButtonView.a(sideEffect.a(), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        BottomSheetDialogView bottomSheetDialogView2 = this.bottomSheetDialogView;
        if (jl40.l(bottomSheetDialogView2 != null ? bottomSheetDialogView2.getTag() : null, "SOURCE_SELECTION_BOTTOM_SHEET") && (bottomSheetDialogView = this.bottomSheetDialogView) != null && bottomSheetDialogView.isShown()) {
            BottomSheetDialogView bottomSheetDialogView3 = this.bottomSheetDialogView;
            if (bottomSheetDialogView3 != null) {
                bottomSheetDialogView3.render(state);
                return;
            }
            return;
        }
        BottomSheetDialogView bottomSheetDialogView4 = this.bottomSheetDialogView;
        if (bottomSheetDialogView4 != null) {
            bottomSheetDialogView4.dismiss();
        }
        BottomSheetDialogView bottomSheetDialogView5 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView5.setTag("SOURCE_SELECTION_BOTTOM_SHEET");
        bottomSheetDialogView5.onDismiss(new FundCreationFragment$showSourceBottomSheet$1$1(getViewModel()));
        bottomSheetDialogView5.onPrimaryAction(new yms(this, 0));
        bottomSheetDialogView5.render(state);
        BottomSheetDialogView.show$default(bottomSheetDialogView5, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showSourceBottomSheet$lambda$11$lambda$10(FundCreationFragment fundCreationFragment, View view) {
        ((a) fundCreationFragment.getViewModel()).k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showSourceBottomSheet$lambda$9(FundCreationFragment fundCreationFragment, mns mnsVar) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(fundCreationFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(fundCreationFragment.selectPaymentMethodListener);
        selectPaymentMethodView.render(mnsVar.b());
        return selectPaymentMethodView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof mns) {
            showSourceBottomSheet((mns) sideEffect);
            return;
        }
        if (!(sideEffect instanceof kns)) {
            if (sideEffect instanceof lns) {
                ((k561) getBinding()).b.wiggle();
            }
        } else {
            BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.bottomSheetDialogView = null;
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((ons) this.viewModelProvider).a((FundCreationParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v3, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public k561 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        k561 p = k561.p(inflater, container);
        ErrorView errorView = p.e;
        final int i = 0;
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: zms
            public final /* synthetic */ FundCreationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$5$lambda$1;
                zy11 viewBinding$lambda$5$lambda$2;
                int i2 = i;
                FundCreationFragment fundCreationFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$5$lambda$1 = FundCreationFragment.getViewBinding$lambda$5$lambda$1(fundCreationFragment);
                        return viewBinding$lambda$5$lambda$1;
                    default:
                        viewBinding$lambda$5$lambda$2 = FundCreationFragment.getViewBinding$lambda$5$lambda$2(fundCreationFragment);
                        return viewBinding$lambda$5$lambda$2;
                }
            }
        });
        final int i2 = 1;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: zms
            public final /* synthetic */ FundCreationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$5$lambda$1;
                zy11 viewBinding$lambda$5$lambda$2;
                int i22 = i2;
                FundCreationFragment fundCreationFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$5$lambda$1 = FundCreationFragment.getViewBinding$lambda$5$lambda$1(fundCreationFragment);
                        return viewBinding$lambda$5$lambda$1;
                    default:
                        viewBinding$lambda$5$lambda$2 = FundCreationFragment.getViewBinding$lambda$5$lambda$2(fundCreationFragment);
                        return viewBinding$lambda$5$lambda$2;
                }
            }
        });
        FullscreenStatusView fullscreenStatusView = p.h;
        fullscreenStatusView.setPrimaryButtonAction(new FundCreationFragment$getViewBinding$1$3(getViewModel()));
        fullscreenStatusView.setCloseButtonAction(new FundCreationFragment$getViewBinding$1$4(getViewModel()));
        YbButtonViewGroup ybButtonViewGroup = p.c;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new FundCreationFragment$getViewBinding$1$5(getViewModel()));
        ybButtonViewGroup.setLinkClickListener(new FundCreationFragment$getViewBinding$1$6(getViewModel()));
        p.d.setActionHandler(new FundCreationFragment$getViewBinding$1$7(getViewModel()));
        p.g.setOnClickListener(new yms(this, i2));
        p.b.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new s1r(18, this)));
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).e0();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "FUND_OPEN_REQUEST_KEY", new bns(0, this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.bottomSheetDialogView = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((a) getViewModel()).i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(final uns viewState) {
        boolean z = viewState instanceof pns;
        char c = 1;
        final int i = 0;
        if (z) {
            pns pnsVar = (pns) viewState;
            YbDivView.setData$default(((k561) getBinding()).d, pnsVar.b(), null, null, false, 14, null);
            ((k561) getBinding()).g.render(new tls() { // from class: ans
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ahq0 render$lambda$6;
                    g render$lambda$7;
                    int i2 = i;
                    uns unsVar = viewState;
                    switch (i2) {
                        case 0:
                            render$lambda$6 = FundCreationFragment.render$lambda$6(unsVar, (ahq0) obj);
                            return render$lambda$6;
                        default:
                            render$lambda$7 = FundCreationFragment.render$lambda$7(unsVar, (g) obj);
                            return render$lambda$7;
                    }
                }
            });
            ((k561) getBinding()).c.render(pnsVar.a());
            xty0.d(((k561) getBinding()).j, pnsVar.f());
            xty0.d(((k561) getBinding()).i, pnsVar.e());
            LoadableInput loadableInput = ((k561) getBinding()).b;
            final char c2 = c == true ? 1 : 0;
            LoadableInput.render$default(loadableInput, false, new tls() { // from class: ans
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ahq0 render$lambda$6;
                    g render$lambda$7;
                    int i2 = c2;
                    uns unsVar = viewState;
                    switch (i2) {
                        case 0:
                            render$lambda$6 = FundCreationFragment.render$lambda$6(unsVar, (ahq0) obj);
                            return render$lambda$6;
                        default:
                            render$lambda$7 = FundCreationFragment.render$lambda$7(unsVar, (g) obj);
                            return render$lambda$7;
                    }
                }
            }, 1, null);
        } else if (viewState instanceof qns) {
            ((k561) getBinding()).h.render(((qns) viewState).a());
        } else if (viewState instanceof sns) {
            ((k561) getBinding()).e.render(((sns) viewState).a());
        } else {
            if (!(viewState instanceof tns)) {
                w511.b();
                return;
            }
            ((k561) getBinding()).h.render(((tns) viewState).a());
        }
        ((k561) getBinding()).e.setVisibility(viewState instanceof sns ? 0 : 8);
        boolean z2 = viewState instanceof tns;
        ((k561) getBinding()).h.setVisibility((z2 || (viewState instanceof qns)) ? 0 : 8);
        ((k561) getBinding()).f.setVisibility(z ? 0 : 8);
        setBackButtonVisible(((viewState instanceof qns) || z2) ? false : true);
        setBackButtonEnabled(getIsBackButtonVisible());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
