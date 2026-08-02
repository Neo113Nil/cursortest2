package com.ybsdk.feature.savings.internal.screens.close.deposit;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.dcs;
import defpackage.eaj0;
import defpackage.eja1;
import defpackage.f3m0;
import defpackage.h3m0;
import defpackage.i3m0;
import defpackage.ii30;
import defpackage.j3m0;
import defpackage.k3m0;
import defpackage.k751;
import defpackage.l3m0;
import defpackage.lfx;
import defpackage.m3m0;
import defpackage.n3m0;
import defpackage.n751;
import defpackage.ny61;
import defpackage.o3m0;
import defpackage.ohk0;
import defpackage.q3m0;
import defpackage.qas0;
import defpackage.r3m0;
import defpackage.s3m0;
import defpackage.sls;
import defpackage.t3m0;
import defpackage.tai0;
import defpackage.tdr;
import defpackage.tje;
import defpackage.u3m0;
import defpackage.w511;
import defpackage.w530;
import defpackage.w761;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yso;
import defpackage.z1x0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 S2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001TB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010$\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0014¢\u0006\u0004\b-\u0010.J!\u00103\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002052\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010:J!\u0010@\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u0003H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010IR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/close/deposit/SavingsAccountCloseDepositFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lw761;", "Lu3m0;", "Lq3m0;", "Ltdr;", "Lh3m0;", "factoryOfViewModel", "Lw530;", "moneyFormatter", "<init>", "(Lh3m0;Lw530;)V", "Ln3m0;", "params", "Lzy11;", "startScaryAnimation", "(Ln3m0;)V", "Ls3m0;", "block", "renderBlockScary", "(Ls3m0;)V", "renderBlockPossible", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "bottomSheetState", "showBottomSheet", "(Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;)V", "Landroid/widget/TextView;", "textView", "", "startValue", "endValue", "Lcom/ybsdk/core/utils/NumberFormatUtils$Currencies;", "currency", "", "balanceAnimationDurationMs", "balanceAnimationStepMs", "startDecreasingScaryAmountAnimation", "(Landroid/widget/TextView;FFLcom/ybsdk/core/utils/NumberFormatUtils$Currencies;JJ)V", "amount", "", "formatAmount", "(FLcom/ybsdk/core/utils/NumberFormatUtils$Currencies;)Ljava/lang/String;", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lq3m0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "onResume", "()V", "onDestroyView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw761;", "viewState", "render", "(Lu3m0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lh3m0;", "Lw530;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheet", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "notPlayedScaryAnimation", "Z", "Landroid/animation/ValueAnimator;", "scaryAnimation", "Landroid/animation/ValueAnimator;", "Companion", "f3m0", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsAccountCloseDepositFragment extends BaseMvvmFragment<w761, u3m0, q3m0> implements tdr {
    public static final f3m0 Companion = new f3m0();
    private static final long SCARY_ANIMATION_START_DELAY_MS = 500;
    private BottomSheetDialogView bottomSheet;
    private final h3m0 factoryOfViewModel;
    private final w530 moneyFormatter;
    private boolean notPlayedScaryAnimation;
    private ValueAnimator scaryAnimation;

    public SavingsAccountCloseDepositFragment(h3m0 h3m0Var, w530 w530Var) {
        super(null, null, null, null, q3m0.class, 15, null);
        this.factoryOfViewModel = h3m0Var;
        this.moneyFormatter = w530Var;
        this.notPlayedScaryAnimation = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatAmount(float amount, NumberFormatUtils$Currencies currency) {
        return w530.a(this.moneyFormatter, new BigDecimal(String.valueOf(amount)), currency.getIso(), false, null, false, 60);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$11$lambda$10(SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment) {
        savingsAccountCloseDepositFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$11$lambda$9(SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment) {
        savingsAccountCloseDepositFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderBlockPossible(s3m0 block) {
        xty0.d(((w761) getBinding()).f, block.c());
        xty0.d(((w761) getBinding()).c, block.a());
        xty0.d(((w761) getBinding()).e, block.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderBlockScary(s3m0 block) {
        xty0.d(((w761) getBinding()).j, block.c());
        xty0.d(((w761) getBinding()).g, block.a());
        xty0.d(((w761) getBinding()).i, block.b());
    }

    private final void showBottomSheet(BottomSheetDialogView.State bottomSheetState) {
        BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView.onPrimaryAction(new eaj0(4, this));
        bottomSheetDialogView.onSecondaryAction(new tai0(6, this, bottomSheetDialogView));
        bottomSheetDialogView.onDismiss(new ohk0(25, this));
        bottomSheetDialogView.render(bottomSheetState);
        BottomSheetDialogView.show$default(bottomSheetDialogView, requireActivity(), null, 2, null);
        this.bottomSheet = bottomSheetDialogView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheet$lambda$15$lambda$12(SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment, View view) {
        savingsAccountCloseDepositFragment.getViewModel().b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheet$lambda$15$lambda$13(SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        savingsAccountCloseDepositFragment.getViewModel().c0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showBottomSheet$lambda$15$lambda$14(SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment, boolean z) {
        savingsAccountCloseDepositFragment.bottomSheet = null;
        return zy11.a;
    }

    private final void startDecreasingScaryAmountAnimation(TextView textView, float startValue, float endValue, NumberFormatUtils$Currencies currency, long balanceAnimationDurationMs, long balanceAnimationStepMs) {
        int i = (int) (balanceAnimationDurationMs / balanceAnimationStepMs);
        tje.N(eja1.s(this), null, null, new SavingsAccountCloseDepositFragment$startDecreasingScaryAmountAnimation$1(i, startValue, (startValue - endValue) / i, this, currency, textView, balanceAnimationStepMs, endValue, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startScaryAnimation(n3m0 params) {
        int a;
        m3m0 d = params.d();
        if (d instanceof l3m0) {
            a = ((w761) getBinding()).h.getHeight() / 2;
        } else {
            if (!(d instanceof k3m0)) {
                w511.b();
                return;
            }
            a = ((k3m0) params.d()).a();
        }
        ValueAnimator valueAnimator = this.scaryAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(((w761) getBinding()).h.getHeight(), a);
        ofInt.setInterpolator(new PathInterpolator(0.65f, 0.0f, 0.46f, 1.0f));
        ofInt.setDuration(params.c());
        ofInt.addUpdateListener(new yso(26, this));
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment$startScaryAnimation$lambda$6$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SavingsAccountCloseDepositFragment.this.scaryAnimation = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofInt.start();
        this.scaryAnimation = ofInt;
        j3m0 b = params.b();
        if (b != null) {
            startDecreasingScaryAmountAnimation(((w761) getBinding()).g, b.e(), b.d(), b.c(), b.a(), b.b());
        } else {
            ((w761) getBinding()).g.setText(String.format(params.a(), Arrays.copyOf(new Object[]{requireContext()}, 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void startScaryAnimation$lambda$6$lambda$4(SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment, ValueAnimator valueAnimator) {
        View view = ((w761) savingsAccountCloseDepositFragment.getBinding()).h;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof i3m0) {
            showBottomSheet(((i3m0) sideEffect).a());
            return;
        }
        if (!(sideEffect instanceof o3m0)) {
            if (sideEffect instanceof n3m0) {
                startScaryAnimation((n3m0) sideEffect);
            }
        } else {
            BottomSheetDialogView bottomSheetDialogView = this.bottomSheet;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.render(((o3m0) sideEffect).a());
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public q3m0 getFactoryOfViewModel() {
        return ((r3m0) this.factoryOfViewModel).a((SavingsAccountCloseDepositParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public w761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        w761 p = w761.p(inflater, container);
        YbButtonViewGroup ybButtonViewGroup = p.b;
        final int i = 0;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new sls(this) { // from class: e3m0
            public final /* synthetic */ SavingsAccountCloseDepositFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$11$lambda$9;
                zy11 viewBinding$lambda$11$lambda$10;
                int i2 = i;
                SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$11$lambda$9 = SavingsAccountCloseDepositFragment.getViewBinding$lambda$11$lambda$9(savingsAccountCloseDepositFragment);
                        return viewBinding$lambda$11$lambda$9;
                    default:
                        viewBinding$lambda$11$lambda$10 = SavingsAccountCloseDepositFragment.getViewBinding$lambda$11$lambda$10(savingsAccountCloseDepositFragment);
                        return viewBinding$lambda$11$lambda$10;
                }
            }
        });
        final int i2 = 1;
        ybButtonViewGroup.setSecondaryButtonClickListener(new sls(this) { // from class: e3m0
            public final /* synthetic */ SavingsAccountCloseDepositFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$11$lambda$9;
                zy11 viewBinding$lambda$11$lambda$10;
                int i22 = i2;
                SavingsAccountCloseDepositFragment savingsAccountCloseDepositFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$11$lambda$9 = SavingsAccountCloseDepositFragment.getViewBinding$lambda$11$lambda$9(savingsAccountCloseDepositFragment);
                        return viewBinding$lambda$11$lambda$9;
                    default:
                        viewBinding$lambda$11$lambda$10 = SavingsAccountCloseDepositFragment.getViewBinding$lambda$11$lambda$10(savingsAccountCloseDepositFragment);
                        return viewBinding$lambda$11$lambda$10;
                }
            }
        });
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        k751 k751Var = insets.a;
        YbButtonViewGroup ybButtonViewGroup = ((w761) getBinding()).b;
        ViewGroup.LayoutParams layoutParams = ybButtonViewGroup.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, k751Var.h(2).d);
        ybButtonViewGroup.setLayoutParams(marginLayoutParams);
        AppCompatTextView appCompatTextView = ((w761) getBinding()).m;
        ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, k751Var.h(1).b, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        appCompatTextView.setLayoutParams(marginLayoutParams2);
        return insets;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        ValueAnimator valueAnimator = this.scaryAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.scaryAnimation = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.notPlayedScaryAnimation) {
            this.notPlayedScaryAnimation = false;
            ((w761) getBinding()).o().postDelayed(new ii30(22, this), 500L);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setStatusBarColorModel(new z1x0(new ColorModel.Raw(0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u3m0 viewState) {
        if (viewState instanceof t3m0) {
            t3m0 t3m0Var = (t3m0) viewState;
            xty0.d(((w761) getBinding()).m, t3m0Var.e());
            xty0.d(((w761) getBinding()).l, t3m0Var.d());
            ((w761) getBinding()).b.render(t3m0Var.a());
            renderBlockScary(t3m0Var.c());
            renderBlockPossible(t3m0Var.b());
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
