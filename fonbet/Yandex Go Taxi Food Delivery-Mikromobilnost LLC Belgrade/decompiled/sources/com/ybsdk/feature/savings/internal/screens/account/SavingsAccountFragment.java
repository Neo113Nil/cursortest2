package com.ybsdk.feature.savings.internal.screens.account;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.animation.DefaultAnimatorListener;
import com.ybsdk.core.utils.ext.ViewState;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.savings.internal.data.b;
import com.ybsdk.feature.savings.internal.interactors.d;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;
import com.ybsdk.feature.savings.internal.views.SavingsAccountTickerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.g;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import defpackage.a6m0;
import defpackage.a8m0;
import defpackage.ajl0;
import defpackage.anp0;
import defpackage.b6m0;
import defpackage.b8m0;
import defpackage.c6m0;
import defpackage.c8m0;
import defpackage.ce4;
import defpackage.cjm0;
import defpackage.d8m0;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.e8m0;
import defpackage.hc5;
import defpackage.hur0;
import defpackage.hya1;
import defpackage.i1m0;
import defpackage.i3y;
import defpackage.i8m0;
import defpackage.iwg0;
import defpackage.j8m0;
import defpackage.jr31;
import defpackage.jw00;
import defpackage.k4m0;
import defpackage.k8m0;
import defpackage.kp50;
import defpackage.l5m0;
import defpackage.l8m0;
import defpackage.lfx;
import defpackage.lur0;
import defpackage.m8m0;
import defpackage.mdm0;
import defpackage.mya1;
import defpackage.n751;
import defpackage.n8m0;
import defpackage.ndm0;
import defpackage.ny61;
import defpackage.nya1;
import defpackage.o5m0;
import defpackage.p1b;
import defpackage.p7b1;
import defpackage.pz40;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.r7m0;
import defpackage.rje;
import defpackage.rr51;
import defpackage.rya1;
import defpackage.s5r;
import defpackage.tbh0;
import defpackage.tdr;
import defpackage.u761;
import defpackage.u7m0;
import defpackage.ung0;
import defpackage.uuz0;
import defpackage.v5m0;
import defpackage.vbb;
import defpackage.vfc0;
import defpackage.vxj0;
import defpackage.w511;
import defpackage.w5m0;
import defpackage.x7m0;
import defpackage.y5m0;
import defpackage.y7m0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z2m0;
import defpackage.z5m0;
import defpackage.z7m0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.BuildConfig;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0002VY\b\u0000\u0018\u0000 p2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001qB)\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010!J!\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00182\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u0010/J\u0017\u00106\u001a\u00020\u00112\u0006\u0010-\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00182\u0006\u0010-\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u00020\u0018H\u0002¢\u0006\u0004\b@\u0010\u001cJ\u0017\u0010B\u001a\u00020\u00182\u0006\u00101\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00182\u0006\u00101\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00182\u0006\u0010G\u001a\u00020\u0011H\u0002¢\u0006\u0004\bH\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010LR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010MR)\u0010U\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010O0O0N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR$\u0010n\u001a\u00020\u00112\u0006\u0010m\u001a\u00020\u00118\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bn\u0010f\"\u0004\bo\u0010I¨\u0006r"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/account/SavingsAccountFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lu761;", "Ln8m0;", "Lcom/ybsdk/feature/savings/internal/screens/account/a;", "Lce4;", "Ltdr;", "Lx7m0;", "factoryOfViewModel", "Lmdm0;", "savingsRemoteConfig", "Lanp0;", "sdkBottomSheetInsetsProvider", "Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "reporter", "<init>", "(Lx7m0;Lmdm0;Lanp0;Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;)V", "", "fitsSystemWindow", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "()V", "onResume", "onPause", "onDestroyView", "createViewModel", "()Lcom/ybsdk/feature/savings/internal/screens/account/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lu761;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "onBackPressed", "viewState", "render", "(Ln8m0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "changeShimmerVisibility", "Llur0;", "shouldRenderTheme", "(Llur0;)Z", "Lk8m0;", "renderContent", "(Lk8m0;)V", "Lj8m0;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "applyTheme", "(Lj8m0;)V", "fetchBackground", "adjustSwipeRefreshEnabledState", "Ld8m0;", "showThemeSelector", "(Ld8m0;)V", "Le8m0;", "showUnlock", "(Le8m0;)V", "touched", "onIncomeWidgetProgressTouch", "(Z)V", "Lx7m0;", "Lmdm0;", "Lanp0;", "Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "Lqa3;", "Lgc5;", "kotlin.jvm.PlatformType", "adapter$delegate", "Li3y;", "getAdapter", "()Lqa3;", "adapter", "c6m0", "motionTransitionListener", "Lc6m0;", "com/ybsdk/feature/savings/internal/screens/account/SavingsAccountFragment$animatorListener$1", "animatorListener", "Lcom/ybsdk/feature/savings/internal/screens/account/SavingsAccountFragment$animatorListener$1;", "", "motionLayoutLastStateId", CA20Status.STATUS_USER_I, "", "motionLayoutTransitionProgress", "Ljava/lang/Float;", "Landroid/os/Parcelable;", "widgetsState", "Landroid/os/Parcelable;", "themeSelectorShown", "Z", "Lz2m0;", "themeBackgroundFetcher", "Lz2m0;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "unlockBottomSheet", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "value", "incomeWidgetProgressTouched", "setIncomeWidgetProgressTouched", "Companion", "b6m0", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsAccountFragment extends BaseDivContextMvvmFragment<u761, n8m0, a> implements ce4, tdr {
    public static final b6m0 Companion = new b6m0();
    private static final int UNLOCK_IMAGE_TOP_PADDING_DP = 24;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final SavingsAccountFragment$animatorListener$1 animatorListener;
    private final x7m0 factoryOfViewModel;
    private boolean incomeWidgetProgressTouched;
    private int motionLayoutLastStateId;
    private Float motionLayoutTransitionProgress;
    private final c6m0 motionTransitionListener;
    private final AppAnalyticsReporter reporter;
    private final mdm0 savingsRemoteConfig;
    private final anp0 sdkBottomSheetInsetsProvider;
    private z2m0 themeBackgroundFetcher;
    private boolean themeSelectorShown;
    private BottomSheetDialogView unlockBottomSheet;
    private Parcelable widgetsState;

    /* JADX WARN: Type inference failed for: r8v4, types: [com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment$animatorListener$1] */
    public SavingsAccountFragment(x7m0 x7m0Var, mdm0 mdm0Var, anp0 anp0Var, AppAnalyticsReporter appAnalyticsReporter) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = x7m0Var;
        this.savingsRemoteConfig = mdm0Var;
        this.sdkBottomSheetInsetsProvider = anp0Var;
        this.reporter = appAnalyticsReporter;
        this.adapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new w5m0(this, 2));
        this.motionTransitionListener = new c6m0(this);
        this.animatorListener = new DefaultAnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment$animatorListener$1
            @Override // com.ybsdk.core.utils.animation.DefaultAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                r0 r0Var;
                Object value;
                SavingsAccountFragment.access$getBinding(SavingsAccountFragment.this).c.setAnimationEnabled(false);
                a access$getViewModel = SavingsAccountFragment.access$getViewModel(SavingsAccountFragment.this);
                d dVar = access$getViewModel.F;
                String agreementId = access$getViewModel.B.getAgreementId();
                b bVar = dVar.a;
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = bVar.b.a.a.edit();
                edit.putLong("savings_account_balance_animation_timestamp_".concat(agreementId), currentTimeMillis);
                edit.apply();
                pz40 Y = access$getViewModel.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, r7m0.a((r7m0) value, null, null, null, null, null, null, false, false, 447)));
            }
        };
        this.motionLayoutLastStateId = tbh0.start;
        this.themeBackgroundFetcher = new z2m0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ u761 access$getBinding(SavingsAccountFragment savingsAccountFragment) {
        return (u761) savingsAccountFragment.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ a access$getViewModel(SavingsAccountFragment savingsAccountFragment) {
        return (a) savingsAccountFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r10v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r10v4, types: [uc5] */
    /* JADX WARN: Type inference failed for: r11v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r11v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r12v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r13v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r3v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r4v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r4v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r5v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r5v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r5v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r6v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r7v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r7v4, types: [uc5] */
    /* JADX WARN: Type inference failed for: r8v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r8v3, types: [uc5] */
    /* JADX WARN: Type inference failed for: r8v5, types: [uc5] */
    /* JADX WARN: Type inference failed for: r9v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r9v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r9v4, types: [uc5] */
    /* JADX WARN: Type inference failed for: r9v5, types: [uc5] */
    /* JADX WARN: Type inference failed for: r9v6, types: [uc5] */
    public static final qa3 adapter_delegate$lambda$0(SavingsAccountFragment savingsAccountFragment) {
        return new qa3(hc5.a(), hya1.b(new SavingsAccountFragment$adapter$2$1(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$2(savingsAccountFragment.getViewModel())), k4m0.a(new SavingsAccountFragment$adapter$2$3(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$4(savingsAccountFragment.getViewModel())), rya1.c(new SavingsAccountFragment$adapter$2$5(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$8(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$6(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$9(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$7(savingsAccountFragment), new SavingsAccountFragment$adapter$2$10(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$11(savingsAccountFragment.getViewModel())), nya1.b(new SavingsAccountFragment$adapter$2$12(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$13(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$14(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$15(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$16(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$17(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$18(savingsAccountFragment.getViewModel())), o5m0.a(new SavingsAccountFragment$adapter$2$20(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$21(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$19(savingsAccountFragment.getViewModel())), mya1.a(new SavingsAccountFragment$adapter$2$22(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$23(savingsAccountFragment.getViewModel())), l5m0.a(new SavingsAccountFragment$adapter$2$25(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$26(savingsAccountFragment.getViewModel()), new SavingsAccountFragment$adapter$2$24(savingsAccountFragment.getViewModel())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void adjustSwipeRefreshEnabledState() {
        ((u761) getBinding()).p.setEnabled(!this.incomeWidgetProgressTouched && this.motionLayoutLastStateId == tbh0.start);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyTheme(j8m0 theme) {
        u761 u761Var = (u761) getBinding();
        fetchBackground(theme);
        u761Var.i.setTextColor(theme.f().get(requireContext()));
        SpoilerTextView spoilerTextView = u761Var.h;
        spoilerTextView.setTextColor(theme.e().get(requireContext()));
        spoilerTextView.getBackground().setTint(theme.d().get(requireContext()));
        u761Var.c.setTextColor(theme.c().get(requireContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeShimmerVisibility(n8m0 viewState) {
        if (((ndm0) this.savingsRemoteConfig).d()) {
            ((u761) getBinding()).k.p().render(viewState.a());
        } else {
            com.ybsdk.core.utils.ext.view.b.c(((u761) getBinding()).k.p(), viewState instanceof m8m0, 0L, 0, 0L, null, 30);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void consumeSideEffect$lambda$16(SavingsAccountFragment savingsAccountFragment) {
        ((u761) savingsAccountFragment.getBinding()).q.scrollToPosition(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchBackground(j8m0 theme) {
        this.themeBackgroundFetcher.a(theme.b(), theme.a().get(requireContext()), ((u761) getBinding()).b);
    }

    private final qa3 getAdapter() {
        return (qa3) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$10$lambda$3(SavingsAccountFragment savingsAccountFragment, View view) {
        ((a) savingsAccountFragment.getViewModel()).g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$10$lambda$4(SavingsAccountFragment savingsAccountFragment, View view) {
        ((a) savingsAccountFragment.getViewModel()).q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$10$lambda$5(SavingsAccountFragment savingsAccountFragment) {
        if (savingsAccountFragment.motionLayoutLastStateId == tbh0.start) {
            ((a) savingsAccountFragment.getViewModel()).k0();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$10$lambda$6(SavingsAccountFragment savingsAccountFragment) {
        if (savingsAccountFragment.motionLayoutLastStateId == tbh0.start) {
            ((a) savingsAccountFragment.getViewModel()).o0();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$10$lambda$7(SavingsAccountFragment savingsAccountFragment, View view) {
        ((a) savingsAccountFragment.getViewModel()).f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getViewBinding$lambda$10$lambda$9(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onApplyInsets$lambda$12(View view) {
        return view.getId() != tbh0.backgroundImage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onIncomeWidgetProgressTouch(boolean touched) {
        if (touched) {
            ((a) getViewModel()).h0();
        }
        setIncomeWidgetProgressTouched(touched);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderContent(k8m0 viewState) {
        u761 u761Var = (u761) getBinding();
        TextView textView = u761Var.m;
        YbDivView ybDivView = u761Var.f;
        SavingsAccountTickerView savingsAccountTickerView = u761Var.c;
        SpoilerTextView spoilerTextView = u761Var.h;
        TextView textView2 = u761Var.l;
        textView.setText(com.ybsdk.core.utils.text.d.a(requireContext(), viewState.k()));
        Text i = viewState.i();
        if (i != null) {
            textView2.setText(com.ybsdk.core.utils.text.d.a(requireContext(), i));
        }
        textView2.setVisibility(viewState.i() == null ? 4 : 0);
        rr51 e = viewState.e();
        if (e != null) {
            YbDivView.setData$default(ybDivView, e, null, null, false, 14, null);
        }
        int i2 = 8;
        ybDivView.setVisibility(viewState.e() != null ? 0 : 8);
        AppCompatTextView appCompatTextView = u761Var.i;
        Text g = viewState.g();
        appCompatTextView.setText(g != null ? com.ybsdk.core.utils.text.d.a(requireContext(), g) : null);
        spoilerTextView.setText(com.ybsdk.core.utils.text.d.a(requireContext(), viewState.f()));
        savingsAccountTickerView.setAnimationEnabled(viewState.d());
        savingsAccountTickerView.setText(com.ybsdk.core.utils.text.d.a(requireContext(), viewState.b()).toString());
        SpoilerTextView.updateSpoilerState$default(spoilerTextView, new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted), false, 2, null);
        u761Var.e.render(viewState.c());
        u761Var.j.enableTransition(tbh0.savingsAccountCollapseTransition, false);
        getAdapter().h(viewState.l(), new ajl0(i2, this, u761Var));
        u761Var.n.setSpoilerStateListener(new vxj0(24, u761Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderContent$lambda$22$lambda$20(final SavingsAccountFragment savingsAccountFragment, final u761 u761Var) {
        RecyclerView.e layoutManager;
        Parcelable parcelable = savingsAccountFragment.widgetsState;
        if (parcelable != null && (layoutManager = u761Var.q.getLayoutManager()) != null) {
            layoutManager.W0(parcelable);
        }
        savingsAccountFragment.widgetsState = null;
        if (savingsAccountFragment.motionLayoutLastStateId == tbh0.start) {
            u761Var.q.scrollToPosition(0);
        }
        RecyclerView recyclerView = u761Var.q;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment$renderContent$lambda$22$lambda$20$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    u761Var.j.enableTransition(tbh0.savingsAccountCollapseTransition, (SavingsAccountFragment.this.motionLayoutLastStateId == tbh0.start && com.ybsdk.core.utils.ext.view.b.f(u761Var.q)) ? false : true);
                }
            });
        } else {
            u761Var.j.enableTransition(tbh0.savingsAccountCollapseTransition, (savingsAccountFragment.motionLayoutLastStateId == tbh0.start && com.ybsdk.core.utils.ext.view.b.f(u761Var.q)) ? false : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderContent$lambda$22$lambda$21(u761 u761Var, SavingsAccountFragment savingsAccountFragment, boolean z) {
        u761Var.n.setContentDescription(z ? savingsAccountFragment.getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount) : ((u761) savingsAccountFragment.getBinding()).c.getText());
        return zy11.a;
    }

    private final void setIncomeWidgetProgressTouched(boolean z) {
        this.incomeWidgetProgressTouched = z;
        adjustSwipeRefreshEnabledState();
    }

    private final boolean shouldRenderTheme(lur0 viewState) {
        if (((ndm0) this.savingsRemoteConfig).d()) {
            return ((ndm0) this.savingsRemoteConfig).d() && (viewState instanceof hur0);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [uc5] */
    private final void showThemeSelector(d8m0 sideEffect) {
        int i = 0;
        ((u761) getBinding()).q.smoothScrollToPosition(0);
        ((u761) getBinding()).q.postOnAnimation(new v5m0(this, 1));
        this.themeSelectorShown = true;
        SavingsAccountThemeSelectorView savingsAccountThemeSelectorView = new SavingsAccountThemeSelectorView(requireContext(), null, 0, 6, null);
        savingsAccountThemeSelectorView.setOnThemeChangeAction(new SavingsAccountFragment$showThemeSelector$themeSelector$1$1(getViewModel()));
        savingsAccountThemeSelectorView.render(new u7m0(sideEffect.d(), sideEffect.b(), sideEffect.c(), ((r7m0) ((a) getViewModel()).X()).b()));
        Object[] objArr = 0 == true ? 1 : 0;
        YbButtonView.a aVar = new YbButtonView.a(sideEffect.a(), objArr, null, null, null, null, null, false, false, null, 4094);
        BottomSheetDialogView.State.Background background = BottomSheetDialogView.State.Background.TRANSPARENT;
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new e(null, null, new y5m0(savingsAccountThemeSelectorView, i), 3), aVar, null, background, new p1b(new vbb[]{new vbb(new ColorModel.Attr(ung0.ybColor_other_shadow), new ViewState[0])}), null, getStatusBarColorModel(), null, null, 126892);
        Object[] objArr2 = 0 == true ? 1 : 0;
        BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), objArr2, 0, 6, 0 == true ? 1 : 0);
        bottomSheetDialogView.onPrimaryAction(new z5m0(this, bottomSheetDialogView, i));
        bottomSheetDialogView.onDismiss(new a6m0(this, i));
        bottomSheetDialogView.render(state);
        BottomSheetDialogView.show$default(bottomSheetDialogView, requireActivity(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showThemeSelector$lambda$24(SavingsAccountFragment savingsAccountFragment) {
        ((u761) savingsAccountFragment.getBinding()).j.transitionToStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showThemeSelector$lambda$26(SavingsAccountThemeSelectorView savingsAccountThemeSelectorView) {
        return savingsAccountThemeSelectorView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showThemeSelector$lambda$29$lambda$27(SavingsAccountFragment savingsAccountFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((a) savingsAccountFragment.getViewModel()).n0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showThemeSelector$lambda$29$lambda$28(SavingsAccountFragment savingsAccountFragment, boolean z) {
        savingsAccountFragment.themeSelectorShown = false;
        ((a) savingsAccountFragment.getViewModel()).p0();
        return zy11.a;
    }

    private final void showUnlock(e8m0 sideEffect) {
        if (sideEffect.c() && this.unlockBottomSheet == null) {
            return;
        }
        this.reporter.f0.a.a("savings.account.unlock_money.open", null);
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(sideEffect.f(), sideEffect.e(), new g(sideEffect.d(), null, Integer.valueOf(kp50.r(24)), null, 26), null, null, null, 120), sideEffect.a(), sideEffect.b(), null, null, null, getStatusBarColorModel(), null, null, 126968);
        BottomSheetDialogView bottomSheetDialogView = this.unlockBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.render(state);
            return;
        }
        BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        int i = 1;
        bottomSheetDialogView2.onPrimaryAction(new z5m0(this, bottomSheetDialogView2, i));
        bottomSheetDialogView2.onSecondaryAction(new z5m0(this, bottomSheetDialogView2, 2));
        bottomSheetDialogView2.onDismiss(new a6m0(this, i));
        bottomSheetDialogView2.render(state);
        BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
        this.unlockBottomSheet = bottomSheetDialogView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showUnlock$lambda$34$lambda$30(SavingsAccountFragment savingsAccountFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((a) savingsAccountFragment.getViewModel()).r0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showUnlock$lambda$34$lambda$32(SavingsAccountFragment savingsAccountFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((a) savingsAccountFragment.getViewModel()).s0();
        bottomSheetDialogView.render(new i1m0(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetDialogView.State showUnlock$lambda$34$lambda$32$lambda$31(BottomSheetDialogView.State state) {
        YbButtonViewGroup.b bVar;
        YbButtonView.a d;
        YbButtonViewGroup.b b = state.b();
        if (b != null) {
            YbButtonViewGroup.b b2 = state.b();
            bVar = YbButtonViewGroup.b.a(b, null, (b2 == null || (d = b2.d()) == null) ? null : YbButtonView.a.a(d, null, null, false, true, BuildConfig.VERSION_CODE), 11);
        } else {
            bVar = null;
        }
        return BottomSheetDialogView.State.a(state, null, bVar, 65533);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showUnlock$lambda$34$lambda$33(SavingsAccountFragment savingsAccountFragment, boolean z) {
        savingsAccountFragment.unlockBottomSheet = null;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        int i = 0;
        if (sideEffect instanceof c8m0) {
            uuz0.a(((u761) getBinding()).h, com.ybsdk.core.utils.text.d.a(requireContext(), ((c8m0) sideEffect).a()).toString(), null, 0, 30);
            return;
        }
        if (sideEffect instanceof z7m0) {
            ((u761) getBinding()).p.setRefreshing(((z7m0) sideEffect).a());
            return;
        }
        if (sideEffect instanceof d8m0) {
            showThemeSelector((d8m0) sideEffect);
            return;
        }
        if (sideEffect instanceof e8m0) {
            showUnlock((e8m0) sideEffect);
            return;
        }
        if (sideEffect instanceof a8m0) {
            BottomSheetDialogView bottomSheetDialogView = this.unlockBottomSheet;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
                return;
            }
            return;
        }
        if (!(sideEffect instanceof b8m0)) {
            if (sideEffect instanceof y7m0) {
                ((u761) getBinding()).c.replayAnimation();
                return;
            } else {
                super.consumeSideEffect(sideEffect);
                return;
            }
        }
        this.widgetsState = null;
        this.motionLayoutLastStateId = tbh0.start;
        this.motionLayoutTransitionProgress = null;
        ((u761) getBinding()).j.setProgress(0.0f);
        ((u761) getBinding()).q.post(new v5m0(this, i));
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((i8m0) this.factoryOfViewModel).a((SavingsAccountScreenParams) dcs.a(this));
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
    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public u761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        u761 p = u761.p(inflater, container);
        final int i = 1;
        p.h.setOnClickListener(new View.OnClickListener(this) { // from class: x5m0
            public final /* synthetic */ SavingsAccountFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                SavingsAccountFragment savingsAccountFragment = this.b;
                switch (i2) {
                    case 0:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$7(savingsAccountFragment, view);
                        break;
                    case 1:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$3(savingsAccountFragment, view);
                        break;
                    default:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$4(savingsAccountFragment, view);
                        break;
                }
            }
        });
        ErrorView errorView = p.g;
        errorView.setPrimaryButtonOnClickListener(new SavingsAccountFragment$getViewBinding$1$2(getViewModel()));
        errorView.setSecondaryButtonClickListener(new SavingsAccountFragment$getViewBinding$1$3(getViewModel()));
        final int i2 = 2;
        p.o.setOnClickListener(new View.OnClickListener(this) { // from class: x5m0
            public final /* synthetic */ SavingsAccountFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                SavingsAccountFragment savingsAccountFragment = this.b;
                switch (i22) {
                    case 0:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$7(savingsAccountFragment, view);
                        break;
                    case 1:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$3(savingsAccountFragment, view);
                        break;
                    default:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$4(savingsAccountFragment, view);
                        break;
                }
            }
        });
        p.p.setOnRefreshListener(new vfc0(24, (a) getViewModel()));
        YbButtonViewGroup ybButtonViewGroup = p.e;
        final int i3 = 0;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new w5m0(this, i3));
        ybButtonViewGroup.setSecondaryButtonClickListener(new w5m0(this, i));
        SavingsAccountTickerView savingsAccountTickerView = p.c;
        savingsAccountTickerView.setOnClickListener(new View.OnClickListener(this) { // from class: x5m0
            public final /* synthetic */ SavingsAccountFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                SavingsAccountFragment savingsAccountFragment = this.b;
                switch (i22) {
                    case 0:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$7(savingsAccountFragment, view);
                        break;
                    case 1:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$3(savingsAccountFragment, view);
                        break;
                    default:
                        SavingsAccountFragment.getViewBinding$lambda$10$lambda$4(savingsAccountFragment, view);
                        break;
                }
            }
        });
        RecyclerView recyclerView = p.q;
        recyclerView.setAdapter(getAdapter());
        final Context requireContext = requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext) { // from class: com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment$getViewBinding$1$9
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
            public final boolean J() {
                boolean z;
                z = SavingsAccountFragment.this.incomeWidgetProgressTouched;
                return !z && super.J();
            }
        };
        linearLayoutManager.Q = false;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new jw00(rje.d(iwg0.ybsdk_savings_account_widget_margin_top, requireContext()), 0, 0, new i1m0(10), 6));
        savingsAccountTickerView.addAnimatorListener(this.animatorListener);
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        if (isNewInsetsHandlingEnabled()) {
            CustomSwipeRefreshLayout customSwipeRefreshLayout = ((u761) getBinding()).p;
            ViewGroup.LayoutParams layoutParams = customSwipeRefreshLayout.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, p7b1.f(insets).b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            customSwipeRefreshLayout.setLayoutParams(marginLayoutParams);
        } else {
            s5r s5rVar = new s5r(kotlin.sequences.b.g(new jr31(((u761) getBinding()).o(), 0), new i1m0(11)));
            while (s5rVar.hasNext()) {
                View view = (View) s5rVar.next();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, p7b1.f(insets).b, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                view.setLayoutParams(marginLayoutParams2);
            }
        }
        FrameLayout o = ((u761) getBinding()).o();
        ViewGroup.LayoutParams layoutParams3 = o.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, p7b1.f(insets).d);
        o.setLayoutParams(marginLayoutParams3);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).e0();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView.e layoutManager = ((u761) getBinding()).q.getLayoutManager();
        this.widgetsState = layoutManager != null ? layoutManager.X0() : null;
        this.motionLayoutTransitionProgress = Float.valueOf((float) Math.rint(((u761) getBinding()).j.getProgress()));
        ((u761) getBinding()).j.removeTransitionListener(this.motionTransitionListener);
        ((u761) getBinding()).c.removeAnimatorListener(this.animatorListener);
        this.unlockBottomSheet = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        ((a) getViewModel()).j0();
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((a) getViewModel()).l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((a) getViewModel()).m0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Float f = this.motionLayoutTransitionProgress;
        if (f != null) {
            ((u761) getBinding()).j.setProgress(f.floatValue());
        }
        this.motionLayoutTransitionProgress = null;
        ((u761) getBinding()).j.addTransitionListener(this.motionTransitionListener);
        adjustSwipeRefreshEnabledState();
        setStatusBarColorModel(new z1x0(new ColorModel.Raw(0)));
        if (isNewInsetsHandlingEnabled()) {
            return;
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = ((u761) getBinding()).p;
        ViewGroup.LayoutParams layoutParams = customSwipeRefreshLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = ((cjm0) this.sdkBottomSheetInsetsProvider).b();
        customSwipeRefreshLayout.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(n8m0 viewState) {
        int i;
        ErrorView errorView = ((u761) getBinding()).g;
        boolean z = viewState instanceof l8m0;
        l8m0 l8m0Var = z ? (l8m0) viewState : null;
        errorView.render(l8m0Var != null ? l8m0Var.b() : null);
        ((u761) getBinding()).g.setVisibility(z ? 0 : 8);
        changeShimmerVisibility(viewState);
        if (!z && !(viewState instanceof m8m0)) {
            if (!(viewState instanceof k8m0)) {
                w511.b();
                return;
            }
            k8m0 k8m0Var = (k8m0) viewState;
            if (k8m0Var.h()) {
                renderContent(k8m0Var);
            }
            if (shouldRenderTheme(viewState.a())) {
                applyTheme(k8m0Var.j());
            }
        }
        ((u761) getBinding()).g.setVisibility(z ? 0 : 8);
        boolean z2 = viewState instanceof k8m0;
        ((u761) getBinding()).d.setVisibility(z2 ? 0 : 8);
        YbButtonViewGroup ybButtonViewGroup = ((u761) getBinding()).e;
        if (z2) {
            k8m0 k8m0Var2 = z2 ? (k8m0) viewState : null;
            if ((k8m0Var2 != null ? k8m0Var2.c() : null) != null) {
                i = 0;
                ybButtonViewGroup.setVisibility(i);
                ((u761) getBinding()).q.setVisibility(!z2 ? 0 : 8);
                ((u761) getBinding()).h.setVisibility(z2 ? 0 : 8);
            }
        }
        i = 8;
        ybButtonViewGroup.setVisibility(i);
        ((u761) getBinding()).q.setVisibility(!z2 ? 0 : 8);
        ((u761) getBinding()).h.setVisibility(z2 ? 0 : 8);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
