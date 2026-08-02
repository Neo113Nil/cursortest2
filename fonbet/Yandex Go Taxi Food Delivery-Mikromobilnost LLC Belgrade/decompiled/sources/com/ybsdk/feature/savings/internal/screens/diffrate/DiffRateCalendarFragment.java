package com.ybsdk.feature.savings.internal.screens.diffrate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.amh;
import defpackage.b861;
import defpackage.bnp0;
import defpackage.buz0;
import defpackage.cij;
import defpackage.cmi;
import defpackage.cuz0;
import defpackage.fch0;
import defpackage.frb1;
import defpackage.gij;
import defpackage.hij;
import defpackage.j561;
import defpackage.l1i0;
import defpackage.lfx;
import defpackage.lij;
import defpackage.mij;
import defpackage.n751;
import defpackage.nij;
import defpackage.ny61;
import defpackage.oij;
import defpackage.pij;
import defpackage.qas0;
import defpackage.qij;
import defpackage.rij;
import defpackage.sls;
import defpackage.tbb;
import defpackage.tdr;
import defpackage.ung0;
import defpackage.w511;
import defpackage.xa8;
import defpackage.xx60;
import defpackage.y8f;
import defpackage.ya8;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/diffrate/DiffRateCalendarFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lb861;", "Lrij;", "Lcom/ybsdk/feature/savings/internal/screens/diffrate/a;", "Ltdr;", "Lxdr;", "Lmij;", "factoryOfViewModel", "<init>", "(Lmij;)V", "Lzy11;", "applySheetBodyHeight", "()V", "Landroid/view/View;", "", "needsVisibleHeight", "(Landroid/view/View;)Z", "", "visibleHeightWithMargins", "(Landroid/view/View;)I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/savings/internal/screens/diffrate/a;", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb861;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "viewState", "render", "(Lrij;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onDestroyView", "Lmij;", "Lj561;", "sheetBodyBinding", "Lj561;", "lastClickedAnchor", "Landroid/view/View;", "Lcuz0;", "tooltip", "Lcuz0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DiffRateCalendarFragment extends BaseMvvmFragment<b861, rij, a> implements tdr {
    private final mij factoryOfViewModel;
    private View lastClickedAnchor;
    private j561 sheetBodyBinding;
    private cuz0 tooltip;

    public DiffRateCalendarFragment(mij mijVar) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.factoryOfViewModel = mijVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void applySheetBodyHeight() {
        j561 j561Var = this.sheetBodyBinding;
        BottomSheetDialogView bottomSheetDialogView = ((b861) getBinding()).b;
        View findViewById = bottomSheetDialogView.findViewById(fch0.bottomSheetCommonTitle);
        View findViewById2 = bottomSheetDialogView.findViewById(fch0.bottomSheetButtonsGroup);
        if (j561Var == null || findViewById == null || findViewById2 == null) {
            return;
        }
        if (bottomSheetDialogView.getHeight() == 0 || needsVisibleHeight(findViewById) || needsVisibleHeight(findViewById2)) {
            bottomSheetDialogView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment$applySheetBodyHeight$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    DiffRateCalendarFragment.this.applySheetBodyHeight();
                }
            });
            return;
        }
        int height = ((bottomSheetDialogView.getHeight() - bottomSheetDialogView.getPaddingTop()) - visibleHeightWithMargins(findViewById)) - visibleHeightWithMargins(findViewById2);
        if (height <= 0) {
            return;
        }
        FrameLayout o = j561Var.o();
        ViewGroup.LayoutParams layoutParams = o.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = height;
            o.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$9$lambda$7(DiffRateCalendarFragment diffRateCalendarFragment, boolean z) {
        cuz0 cuz0Var = diffRateCalendarFragment.tooltip;
        if (cuz0Var != null) {
            cuz0Var.c();
        }
        diffRateCalendarFragment.getViewModel().b0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$9$lambda$8(DiffRateCalendarFragment diffRateCalendarFragment, View view) {
        diffRateCalendarFragment.getViewModel().b0();
    }

    private final boolean needsVisibleHeight(View view) {
        return view.getVisibility() == 0 && view.getHeight() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$2$lambda$0(DiffRateCalendarFragment diffRateCalendarFragment) {
        diffRateCalendarFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$2$lambda$1(DiffRateCalendarFragment diffRateCalendarFragment) {
        diffRateCalendarFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$6$lambda$3(DiffRateCalendarFragment diffRateCalendarFragment, String str) {
        diffRateCalendarFragment.getViewModel().e0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$6$lambda$4(DiffRateCalendarFragment diffRateCalendarFragment, int i) {
        cuz0 cuz0Var;
        if (i != 0 && (cuz0Var = diffRateCalendarFragment.tooltip) != null) {
            cuz0Var.c();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$6$lambda$5(DiffRateCalendarFragment diffRateCalendarFragment, long j, View view) {
        diffRateCalendarFragment.lastClickedAnchor = view;
        diffRateCalendarFragment.getViewModel().c0(j);
        return zy11.a;
    }

    private final int visibleHeightWithMargins(View view) {
        if (view.getVisibility() != 0) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return view.getHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (!(sideEffect instanceof lij)) {
            super.consumeSideEffect(sideEffect);
            return;
        }
        View view = this.lastClickedAnchor;
        if (view == null) {
            return;
        }
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.c();
        }
        buz0 d = frb1.d(requireContext());
        lij lijVar = (lij) sideEffect;
        d.o(lijVar.b());
        d.p(l1i0.Widget_YB_Text_Caption1_Regular_Inverted);
        d.l(lijVar.a());
        d.n(ung0.ybColor_textIcon_tertiaryInverted);
        d.k(Tooltip$PreferredPosition.TOP);
        d.f(true);
        cuz0 a = d.a();
        this.tooltip = a;
        a.f(view, 0L);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((nij) this.factoryOfViewModel).a();
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public b861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        b861 o = b861.o(inflater, container);
        BottomSheetDialogView bottomSheetDialogView = o.b;
        bottomSheetDialogView.onDismiss(new cij(this, 2));
        bottomSheetDialogView.onPrimaryAction(new cmi(3, this));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        BottomSheetDialogView bottomSheetDialogView = ((b861) getBinding()).b;
        ViewGroup.LayoutParams layoutParams = bottomSheetDialogView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, insets.a.h(2).d);
        bottomSheetDialogView.setLayoutParams(marginLayoutParams);
        ((b861) getBinding()).b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment$onApplyInsets$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                DiffRateCalendarFragment.this.applySheetBodyHeight();
            }
        });
        return insets;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, com.ybsdk.core.presentation.BindingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        j561 p = j561.p(inflater, container);
        ErrorView errorView = p.b;
        final int i = 0;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: dij
            public final /* synthetic */ DiffRateCalendarFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onCreateView$lambda$2$lambda$0;
                zy11 onCreateView$lambda$2$lambda$1;
                int i2 = i;
                DiffRateCalendarFragment diffRateCalendarFragment = this.b;
                switch (i2) {
                    case 0:
                        onCreateView$lambda$2$lambda$0 = DiffRateCalendarFragment.onCreateView$lambda$2$lambda$0(diffRateCalendarFragment);
                        return onCreateView$lambda$2$lambda$0;
                    default:
                        onCreateView$lambda$2$lambda$1 = DiffRateCalendarFragment.onCreateView$lambda$2$lambda$1(diffRateCalendarFragment);
                        return onCreateView$lambda$2$lambda$1;
                }
            }
        });
        final int i2 = 1;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: dij
            public final /* synthetic */ DiffRateCalendarFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onCreateView$lambda$2$lambda$0;
                zy11 onCreateView$lambda$2$lambda$1;
                int i22 = i2;
                DiffRateCalendarFragment diffRateCalendarFragment = this.b;
                switch (i22) {
                    case 0:
                        onCreateView$lambda$2$lambda$0 = DiffRateCalendarFragment.onCreateView$lambda$2$lambda$0(diffRateCalendarFragment);
                        return onCreateView$lambda$2$lambda$0;
                    default:
                        onCreateView$lambda$2$lambda$1 = DiffRateCalendarFragment.onCreateView$lambda$2$lambda$1(diffRateCalendarFragment);
                        return onCreateView$lambda$2$lambda$1;
                }
            }
        });
        this.sheetBodyBinding = p;
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [bnp0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.c();
        }
        this.tooltip = null;
        this.lastClickedAnchor = null;
        ?? r1 = this;
        while (true) {
            if (r1 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof bnp0)) {
                    activity = null;
                }
                r1 = (bnp0) activity;
                if (r1 == 0) {
                    r1 = 0;
                }
            } else if (r1 instanceof bnp0) {
                break;
            } else {
                r1 = r1.getParentFragment();
            }
        }
        bnp0 bnp0Var = (bnp0) r1;
        if (bnp0Var != null) {
            bnp0Var.setGripVisible(true);
        }
        setSdkBackground(xa8.a);
        this.sheetBodyBinding = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bnp0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ?? r2 = this;
        while (true) {
            if (r2 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof bnp0)) {
                    activity = null;
                }
                r2 = (bnp0) activity;
                if (r2 == 0) {
                    r2 = 0;
                }
            } else if (r2 instanceof bnp0) {
                break;
            } else {
                r2 = r2.getParentFragment();
            }
        }
        bnp0 bnp0Var = (bnp0) r2;
        int i = 0;
        if (bnp0Var != null) {
            bnp0Var.setGripVisible(false);
        }
        setSdkBackground(ya8.a);
        j561 j561Var = this.sheetBodyBinding;
        if (j561Var != null) {
            DiffRateCalendarView diffRateCalendarView = j561Var.e;
            diffRateCalendarView.setOnMinVisibleDateChanged(new cij(this, i));
            diffRateCalendarView.setOnRecyclerScrollStateChanged(new cij(this, 1));
            diffRateCalendarView.setDayClickListener(new tbb(28, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(rij viewState) {
        int i;
        j561 j561Var = this.sheetBodyBinding;
        if (j561Var == null) {
            return;
        }
        ErrorView errorView = j561Var.b;
        DiffRateCalendarView diffRateCalendarView = j561Var.e;
        boolean z = viewState instanceof qij;
        if (z) {
            diffRateCalendarView.render(new gij(((qij) viewState).b()), new DiffRateCalendarFragment$render$1(getViewModel()));
        } else if (viewState instanceof oij) {
            errorView.render(((oij) viewState).b());
        } else {
            if (!(viewState instanceof pij)) {
                w511.b();
                return;
            }
            DiffRateCalendarView.render$default(j561Var.d, hij.a, null, 2, null);
        }
        ShimmerFrameLayout shimmerFrameLayout = j561Var.c;
        boolean z2 = viewState instanceof pij;
        int i2 = 4;
        if (z2) {
            i = 0;
        } else if (viewState instanceof oij) {
            i = 4;
        } else {
            if (!z) {
                w511.b();
                return;
            }
            i = 8;
        }
        shimmerFrameLayout.setVisibility(i);
        if (z) {
            i2 = 0;
        } else if (!z2 && !(viewState instanceof oij)) {
            w511.b();
            return;
        }
        diffRateCalendarView.setVisibility(i2);
        errorView.setVisibility(viewState instanceof oij ? 0 : 8);
        ((b861) getBinding()).b.render(BottomSheetDialogView.State.a(viewState.a(), new e(null, null, new amh(21, j561Var), 3), null, 65502));
        applySheetBodyHeight();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
