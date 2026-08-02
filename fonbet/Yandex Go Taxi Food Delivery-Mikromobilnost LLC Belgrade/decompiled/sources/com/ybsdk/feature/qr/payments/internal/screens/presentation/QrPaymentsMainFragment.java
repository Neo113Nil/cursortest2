package com.ybsdk.feature.qr.payments.internal.screens.presentation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.transfer.utils.AmountResizeTextWatcher;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.qr.payments.api.QrPaymentsArguments;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$SecondFactorResult;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.ImageToolbarView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.OperationStatusView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.k;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.agc0;
import defpackage.anp0;
import defpackage.bal;
import defpackage.bmg0;
import defpackage.buz0;
import defpackage.c5z;
import defpackage.cjm0;
import defpackage.cuz0;
import defpackage.cwb0;
import defpackage.dcs;
import defpackage.e7n;
import defpackage.e8g0;
import defpackage.eal;
import defpackage.els0;
import defpackage.ex0;
import defpackage.frb1;
import defpackage.hc5;
import defpackage.hf8;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.js10;
import defpackage.k9g0;
import defpackage.kqe0;
import defpackage.l1i0;
import defpackage.l9g0;
import defpackage.lfx;
import defpackage.m9g0;
import defpackage.n751;
import defpackage.n9g0;
import defpackage.ny61;
import defpackage.o6;
import defpackage.o9g0;
import defpackage.odf0;
import defpackage.ola1;
import defpackage.pag0;
import defpackage.pbg0;
import defpackage.q9g0;
import defpackage.qag0;
import defpackage.qas0;
import defpackage.r9g0;
import defpackage.rje;
import defpackage.rr51;
import defpackage.s9g0;
import defpackage.sls;
import defpackage.sm91;
import defpackage.spl;
import defpackage.t461;
import defpackage.t9g0;
import defpackage.tdr;
import defpackage.tm60;
import defpackage.ty01;
import defpackage.u1w;
import defpackage.u8g0;
import defpackage.u9g0;
import defpackage.utb1;
import defpackage.v8g0;
import defpackage.v9g0;
import defpackage.vyf0;
import defpackage.w511;
import defpackage.w9g0;
import defpackage.wvz0;
import defpackage.x8g0;
import defpackage.xca1;
import defpackage.y1x0;
import defpackage.y8f;
import defpackage.y8g0;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z7g0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0082\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002\u0083\u0001B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\u001fH\u0016¢\u0006\u0004\b1\u0010/J\u0017\u00103\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001fH\u0002¢\u0006\u0004\b5\u0010/J\u0017\u00107\u001a\u00020\u001f2\u0006\u00102\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001fH\u0002¢\u0006\u0004\b9\u0010/J\u000f\u0010:\u001a\u00020\u001fH\u0002¢\u0006\u0004\b:\u0010/J\u0017\u0010<\u001a\u00020\u001f2\u0006\u00102\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u001f2\u0006\u00102\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u001f2\u0006\u00102\u001a\u00020>H\u0002¢\u0006\u0004\bA\u0010@J\u0017\u0010B\u001a\u00020\u001f2\u0006\u00102\u001a\u00020>H\u0002¢\u0006\u0004\bB\u0010@J\u0017\u0010E\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u0004\u0018\u00010\u001f2\u0006\u00102\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010L\u001a\u00020\u001f2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010P\u001a\u0004\u0018\u00010\u001f2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u0014H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u001f2\u0006\u00102\u001a\u00020;H\u0002¢\u0006\u0004\bU\u0010=J\u0017\u0010V\u001a\u00020\u001f2\u0006\u00102\u001a\u00020;H\u0002¢\u0006\u0004\bV\u0010=J\u0017\u0010W\u001a\u00020\u001f2\u0006\u00102\u001a\u00020GH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u001fH\u0002¢\u0006\u0004\bY\u0010/J\u0017\u0010Z\u001a\u00020\u001f2\u0006\u00102\u001a\u00020GH\u0002¢\u0006\u0004\bZ\u0010XJ\u0017\u0010[\u001a\u00020\u001f2\u0006\u00102\u001a\u00020GH\u0002¢\u0006\u0004\b[\u0010XJ\u0017\u0010\\\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\\\u00104J\u0017\u0010]\u001a\u00020\u001f2\u0006\u00102\u001a\u00020;H\u0002¢\u0006\u0004\b]\u0010=J\u001f\u0010_\u001a\u00020\u001f2\u0006\u00102\u001a\u00020G2\u0006\u0010^\u001a\u00020\u0014H\u0002¢\u0006\u0004\b_\u0010`J?\u0010e\u001a\u00020\u001f*\u00020&2\u0006\u0010a\u001a\u00020\u00142\u0010\b\u0002\u0010c\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010b2\u0010\b\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010bH\u0002¢\u0006\u0004\be\u0010fJ\u0013\u0010g\u001a\u00020\u001f*\u00020\u0002H\u0002¢\u0006\u0004\bg\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010iR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010jR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010kR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010lR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010mR!\u0010t\u001a\b\u0012\u0004\u0012\u00020o0n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010x\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/QrPaymentsMainFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lt461;", "Lw9g0;", "Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/b;", "Ltdr;", "Lk9g0;", "factory", "Lqag0;", "secondFactorScreenProvider", "Lz7g0;", "bottomSheetInteractor", "Lpbg0;", "visualParams", "Lanp0;", "sdkBottomSheetInsetsProvider", "<init>", "(Lk9g0;Lqag0;Lz7g0;Lpbg0;Lanp0;)V", "createViewModel", "()Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/b;", "", "fitsSystemWindow", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lt461;", "Lqas0;", "sideEffect", "Lzy11;", "consumeSideEffect", "(Lqas0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "onResume", "()V", "onStop", "onDestroyView", "viewState", "render", "(Lw9g0;)V", "wiggleAmount", "Lr9g0;", "renderErrorScreen", "(Lr9g0;)V", "hideAmountScreenContent", "hideResultScreenContent", "Lt9g0;", "renderAmountScreen", "(Lt9g0;)V", "Lu9g0;", "renderResultScreen", "(Lu9g0;)V", "renderWidgets", "renderInfo", "Ljs10;", ClidProvider.STATE, "renderMessages", "(Ljs10;)V", "Lv9g0;", "renderCommonScreenData", "(Lv9g0;)Lzy11;", "", "purpose", "renderPurpose", "(Ljava/lang/String;)V", "Ljava/math/BigDecimal;", "amount", "renderAmount", "(Ljava/math/BigDecimal;)Lzy11;", "isEnabled", "renderAmountInput", "(Z)V", "renderTooltip", "renderTooltipManually", "renderAmountWidgetWithAnimation", "(Lv9g0;)V", "renderStatusBar", "updateAmountWidgetContent", "blockCredlimInteractionIfNeed", "renderSkeletonWithAnimation", "renderAmountBlockWithAnimation", "animationEnabled", "renderButton", "(Lv9g0;Z)V", "isVisible", "Lkotlin/Function0;", "onAnimationStart", "onAnimationEnd", "changeVisibility", "(Landroid/view/View;ZLsls;Lsls;)V", "updateAmountBlockPosition", "(Lt461;)V", "Lk9g0;", "Lqag0;", "Lz7g0;", "Lpbg0;", "Lanp0;", "Le7n;", "Lgc5;", "widgetsAdapterDelegate$delegate", "Li3y;", "getWidgetsAdapterDelegate", "()Le7n;", "widgetsAdapterDelegate", "Lpag0;", "qrPaymentScrollAnimation", "Lpag0;", "previousViewState", "Lw9g0;", "Lcuz0;", "tooltip", "Lcuz0;", "Landroid/animation/Animator;", "skeletonFadeAnimator", "Landroid/animation/Animator;", "isPlansBottomSheetShown", "Z", "Companion", "y8g0", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QrPaymentsMainFragment extends BaseDivContextMvvmFragment<t461, w9g0, b> implements tdr {

    @Deprecated
    public static final float INVISIBLE_SCALE = 0.95f;

    @Deprecated
    public static final long SKELETONS_ANIMATION_DURATION_MS = 700;

    @Deprecated
    public static final long VISIBILITY_ANIMATION_DURATION_MS = 150;

    @Deprecated
    public static final float VISIBLE_SCALE = 1.0f;
    private final z7g0 bottomSheetInteractor;
    private final k9g0 factory;
    private boolean isPlansBottomSheetShown;
    private w9g0 previousViewState;
    private pag0 qrPaymentScrollAnimation;
    private final anp0 sdkBottomSheetInsetsProvider;
    private final qag0 secondFactorScreenProvider;
    private Animator skeletonFadeAnimator;
    private cuz0 tooltip;
    private final pbg0 visualParams;

    /* renamed from: widgetsAdapterDelegate$delegate, reason: from kotlin metadata */
    private final i3y widgetsAdapterDelegate;
    private static final y8g0 Companion = new y8g0();
    private static final c5z credlimBlockedInteractionsState = new c5z("widget_state", "final");

    public QrPaymentsMainFragment(k9g0 k9g0Var, qag0 qag0Var, z7g0 z7g0Var, pbg0 pbg0Var, anp0 anp0Var) {
        super(Boolean.FALSE, 3, null, null, b.class, 12, null);
        this.factory = k9g0Var;
        this.secondFactorScreenProvider = qag0Var;
        this.bottomSheetInteractor = z7g0Var;
        this.visualParams = pbg0Var;
        this.sdkBottomSheetInsetsProvider = anp0Var;
        this.widgetsAdapterDelegate = kotlin.a.b(LazyThreadSafetyMode.NONE, new u8g0(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void blockCredlimInteractionIfNeed(v9g0 viewState) {
        rr51 d;
        if (!(viewState instanceof u9g0) || (d = ((u9g0) viewState).d()) == null) {
            return;
        }
        YbDivView.setData$default(((t461) getBinding()).g, d, Collections.singletonList(credlimBlockedInteractionsState), null, true, 4, null);
    }

    private final void changeVisibility(View view, boolean z, sls slsVar, sls slsVar2) {
        com.ybsdk.core.utils.ext.view.b.d(z ? 1.0f : 0.95f, slsVar, slsVar2, view, z);
    }

    public static /* synthetic */ void changeVisibility$default(QrPaymentsMainFragment qrPaymentsMainFragment, View view, boolean z, sls slsVar, sls slsVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = null;
        }
        if ((i & 4) != 0) {
            slsVar2 = null;
        }
        qrPaymentsMainFragment.changeVisibility(view, z, slsVar, slsVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean getViewBinding$lambda$13$lambda$10(QrPaymentsMainFragment qrPaymentsMainFragment, Uri uri) {
        return ((b) qrPaymentsMainFragment.getViewModel()).g0(uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$13$lambda$5$lambda$3(QrPaymentsMainFragment qrPaymentsMainFragment, Editable editable) {
        ((b) qrPaymentsMainFragment.getViewModel()).b0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$13$lambda$5$lambda$4(QrPaymentsMainFragment qrPaymentsMainFragment, View view) {
        ((b) qrPaymentsMainFragment.getViewModel()).c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$13$lambda$7(QrPaymentsMainFragment qrPaymentsMainFragment, View view) {
        ((b) qrPaymentsMainFragment.getViewModel()).d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$13$lambda$8(QrPaymentsMainFragment qrPaymentsMainFragment, View view) {
        ((b) qrPaymentsMainFragment.getViewModel()).d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean getViewBinding$lambda$13$lambda$9(QrPaymentsMainFragment qrPaymentsMainFragment, Uri uri) {
        return ((b) qrPaymentsMainFragment.getViewModel()).g0(uri.toString());
    }

    private final e7n getWidgetsAdapterDelegate() {
        return (e7n) this.widgetsAdapterDelegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideAmountScreenContent() {
        t461 t461Var = (t461) getBinding();
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        this.tooltip = null;
        changeVisibility$default(this, t461Var.i, false, null, null, 6, null);
        changeVisibility$default(this, t461Var.f, false, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideResultScreenContent() {
        t461 t461Var = (t461) getBinding();
        t461Var.w.setVisibility(8);
        t461Var.v.setVisibility(8);
        t461Var.u.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$14(QrPaymentsMainFragment qrPaymentsMainFragment, String str, Bundle bundle) {
        QrPaymentsSecondFactorScreenProvider$SecondFactorResult a = ((e8g0) qrPaymentsMainFragment.secondFactorScreenProvider).a(bundle);
        if (a instanceof QrPaymentsSecondFactorScreenProvider$SecondFactorResult.VerificationToken) {
            ((b) qrPaymentsMainFragment.getViewModel()).k0(((QrPaymentsSecondFactorScreenProvider$SecondFactorResult.VerificationToken) a).getVerificationToken());
        } else {
            if (!jl40.l(a, QrPaymentsSecondFactorScreenProvider$SecondFactorResult.Cancel.INSTANCE) && a != null) {
                w511.b();
                return null;
            }
            qrPaymentsMainFragment.getParentFragmentManager().V();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$15(QrPaymentsMainFragment qrPaymentsMainFragment, String str, Bundle bundle) {
        QrPaymentsSecondFactorScreenProvider$SecondFactorResult a = ((e8g0) qrPaymentsMainFragment.secondFactorScreenProvider).a(bundle);
        if (a instanceof QrPaymentsSecondFactorScreenProvider$SecondFactorResult.VerificationToken) {
            ((b) qrPaymentsMainFragment.getViewModel()).h0(((QrPaymentsSecondFactorScreenProvider$SecondFactorResult.VerificationToken) a).getVerificationToken(), false);
        } else {
            if (!jl40.l(a, QrPaymentsSecondFactorScreenProvider$SecondFactorResult.Cancel.INSTANCE) && a != null) {
                w511.b();
                return null;
            }
            ((b) qrPaymentsMainFragment.getViewModel()).e0();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$17(QrPaymentsMainFragment qrPaymentsMainFragment) {
        qrPaymentsMainFragment.doOnViewIsNotDestroyed(new u8g0(qrPaymentsMainFragment, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$16(QrPaymentsMainFragment qrPaymentsMainFragment) {
        qrPaymentsMainFragment.updateAmountBlockPosition((t461) qrPaymentsMainFragment.getBinding());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$20(QrPaymentsMainFragment qrPaymentsMainFragment) {
        w9g0 w9g0Var = qrPaymentsMainFragment.previousViewState;
        t9g0 t9g0Var = w9g0Var instanceof t9g0 ? (t9g0) w9g0Var : null;
        if (t9g0Var != null) {
            qrPaymentsMainFragment.isPlansBottomSheetShown = false;
            qrPaymentsMainFragment.safePost(new agc0(15, qrPaymentsMainFragment, t9g0Var));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$20$lambda$19$lambda$18(QrPaymentsMainFragment qrPaymentsMainFragment, t9g0 t9g0Var) {
        qrPaymentsMainFragment.renderTooltipManually(t9g0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$21(QrPaymentsMainFragment qrPaymentsMainFragment) {
        qrPaymentsMainFragment.isPlansBottomSheetShown = true;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderAmount(BigDecimal amount) {
        MoneyInputEditView moneyInputEditView = ((t461) getBinding()).c;
        Locale locale = tm60.a;
        if (jl40.l(amount, tm60.g(String.valueOf(moneyInputEditView.getText())))) {
            amount = null;
        }
        if (amount == null) {
            return null;
        }
        moneyInputEditView.setText(tm60.i(tm60.b(amount)));
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAmountBlockWithAnimation(t9g0 viewState) {
        AmountScreenStatus g = viewState.g();
        AmountScreenStatus amountScreenStatus = AmountScreenStatus.EDIT_AMOUNT;
        int i = 0;
        boolean z = g == amountScreenStatus;
        boolean z2 = (z || viewState.f() == null) ? false : true;
        w9g0 w9g0Var = this.previousViewState;
        t9g0 t9g0Var = w9g0Var instanceof t9g0 ? (t9g0) w9g0Var : null;
        if (t9g0Var != null) {
            if ((t9g0Var.g() == amountScreenStatus) == z) {
                renderButton(viewState, false);
                rr51 f = viewState.f();
                if (!z2 || f == null) {
                    return;
                }
                YbDivView ybDivView = ((t461) getBinding()).f;
                List e = viewState.e();
                List list = EmptyList.a;
                if (e == null) {
                    e = list;
                }
                List list2 = e;
                List i2 = viewState.i();
                if (i2 != null) {
                    list = i2;
                }
                YbDivView.setData$default(ybDivView, f, kotlin.collections.a.m0(list, list2), null, false, 12, null);
                return;
            }
        }
        renderButton(viewState, true);
        if (z) {
            changeVisibility$default(this, ((t461) getBinding()).f, false, null, new u8g0(this, i), 2, null);
        } else {
            changeVisibility$default(this, ((t461) getBinding()).i, false, null, new ex0(z2, viewState, this, 16), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderAmountBlockWithAnimation$lambda$53(QrPaymentsMainFragment qrPaymentsMainFragment) {
        changeVisibility$default(qrPaymentsMainFragment, ((t461) qrPaymentsMainFragment.getBinding()).i, true, null, null, 6, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderAmountBlockWithAnimation$lambda$55(boolean z, t9g0 t9g0Var, QrPaymentsMainFragment qrPaymentsMainFragment) {
        if (z) {
            rr51 f = t9g0Var.f();
            if (f != null) {
                YbDivView ybDivView = ((t461) qrPaymentsMainFragment.getBinding()).f;
                List e = t9g0Var.e();
                List list = EmptyList.a;
                if (e == null) {
                    e = list;
                }
                List list2 = e;
                List i = t9g0Var.i();
                if (i != null) {
                    list = i;
                }
                YbDivView.setData$default(ybDivView, f, kotlin.collections.a.m0(list, list2), null, false, 12, null);
            }
            changeVisibility$default(qrPaymentsMainFragment, ((t461) qrPaymentsMainFragment.getBinding()).f, true, null, null, 6, null);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAmountInput(boolean isEnabled) {
        MoneyInputEditView moneyInputEditView = ((t461) getBinding()).c;
        moneyInputEditView.setFocusable(isEnabled);
        moneyInputEditView.setFocusableInTouchMode(isEnabled);
        moneyInputEditView.setCursorVisible(isEnabled);
        if (isEnabled) {
            moneyInputEditView.requestFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAmountScreen(t9g0 viewState) {
        t461 t461Var = (t461) getBinding();
        renderAmountInput(viewState.g() == AmountScreenStatus.EDIT_AMOUNT);
        renderAmountBlockWithAnimation(viewState);
        t461Var.m.setText(viewState.b());
        t461Var.k.setText(viewState.j());
        renderTooltip(viewState);
        t461Var.o.setVisibility(viewState.h() ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAmountWidgetWithAnimation(v9g0 viewState) {
        if (viewState instanceof u9g0) {
            blockCredlimInteractionIfNeed(viewState);
            u9g0 u9g0Var = (u9g0) viewState;
            if (u9g0Var.e() == null && u9g0Var.f() == null) {
                return;
            }
            changeVisibility$default(this, ((t461) getBinding()).g, false, null, null, 6, null);
            return;
        }
        if (viewState instanceof t9g0) {
            t9g0 t9g0Var = (t9g0) viewState;
            if (t9g0Var.k() == ProductType.CREDIT_LIMIT && t9g0Var.l() != null) {
                updateAmountWidgetContent(viewState);
                return;
            }
            if (t9g0Var.d() != null) {
                updateAmountWidgetContent(viewState);
            }
            changeVisibility$default(this, ((t461) getBinding()).g, t9g0Var.d() != null, null, null, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderButton(v9g0 viewState, boolean animationEnabled) {
        w9g0 w9g0Var = this.previousViewState;
        v9g0 v9g0Var = w9g0Var instanceof v9g0 ? (v9g0) w9g0Var : null;
        YbButtonView.a a = v9g0Var != null ? v9g0Var.a() : null;
        YbButtonView.a a2 = viewState.a();
        if (v9g0Var == null || !jl40.l(a, a2)) {
            if (!animationEnabled || v9g0Var == null) {
                ((t461) getBinding()).d.setVisibility(a2 != null ? 0 : 8);
                if (a2 != null) {
                    ((t461) getBinding()).d.render(a2);
                    return;
                }
                return;
            }
            if (a != null) {
                changeVisibility$default(this, ((t461) getBinding()).d, false, null, new agc0(14, a2, this), 2, null);
            } else if (a2 != null) {
                ((t461) getBinding()).d.render(a2);
                changeVisibility$default(this, ((t461) getBinding()).d, true, null, null, 6, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderButton$lambda$59(YbButtonView.a aVar, QrPaymentsMainFragment qrPaymentsMainFragment) {
        if (aVar != null) {
            ((t461) qrPaymentsMainFragment.getBinding()).d.render(aVar);
            changeVisibility$default(qrPaymentsMainFragment, ((t461) qrPaymentsMainFragment.getBinding()).d, true, null, null, 6, null);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderCommonScreenData(v9g0 viewState) {
        t461 t461Var = (t461) getBinding();
        OperationStatusView operationStatusView = t461Var.j;
        ShimmerFrameLayout shimmerFrameLayout = t461Var.t;
        if (operationStatusView.getHasImage()) {
            shimmerFrameLayout.setVisibility(8);
            shimmerFrameLayout.stopShimmer();
        }
        t461Var.j.render(viewState.getIcon(), new odf0(6, t461Var));
        t461Var.e.setText(viewState.getCurrency());
        t461Var.p.render(viewState.c());
        renderPurpose(viewState.b());
        renderAmountWidgetWithAnimation(viewState);
        return renderAmount(viewState.getAmount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderCommonScreenData$lambda$38$lambda$37(t461 t461Var, Drawable drawable) {
        if (drawable != null) {
            t461Var.r.render(drawable);
        }
        com.ybsdk.core.utils.ext.view.b.c(t461Var.t, false, 700L, 0, 0L, new vyf0(2, t461Var), 12);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderCommonScreenData$lambda$38$lambda$37$lambda$36(t461 t461Var) {
        t461Var.t.stopShimmer();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderErrorScreen(r9g0 viewState) {
        t461 t461Var = (t461) getBinding();
        t461Var.p.render(viewState.c());
        k f = viewState.f();
        if (f != null) {
            t461Var.l.render(f);
        }
        t461Var.h.render(viewState.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderInfo(u9g0 viewState) {
        t461 t461Var = (t461) getBinding();
        TextView textView = t461Var.v;
        TextView textView2 = t461Var.u;
        textView.setVisibility(viewState.f() != null ? 0 : 8);
        t461Var.v.setText(viewState.f());
        textView2.setVisibility(viewState.e() != null ? 0 : 8);
        textView2.setText(viewState.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderMessages(js10 state) {
        t461 t461Var = (t461) getBinding();
        if (state.a().isEmpty()) {
            return;
        }
        t461Var.k.render(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderPurpose(String purpose) {
        t461 t461Var = (t461) getBinding();
        t461Var.m.setText(purpose);
        t461Var.m.setVisibility(purpose != null ? 4 : 0);
    }

    private final void renderResultScreen(u9g0 viewState) {
        renderButton(viewState, true);
        renderWidgets(viewState);
        renderMessages(viewState.g());
        renderInfo(viewState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderSkeletonWithAnimation(w9g0 viewState) {
        Animator animator;
        t461 t461Var = (t461) getBinding();
        if (viewState instanceof s9g0) {
            ((DivSkeletonsView) t461Var.n.b).render(new eal(els0.b, false, bal.a, 2));
            return;
        }
        Animator animator2 = this.skeletonFadeAnimator;
        if ((animator2 == null || !animator2.isStarted()) && (animator = this.skeletonFadeAnimator) != null) {
            animator.start();
        }
    }

    private final void renderStatusBar() {
        setStatusBarColorModel(new z1x0(y1x0.c()));
    }

    private final void renderTooltip(t9g0 viewState) {
        cuz0 cuz0Var;
        w9g0 w9g0Var = this.previousViewState;
        t9g0 t9g0Var = w9g0Var instanceof t9g0 ? (t9g0) w9g0Var : null;
        wvz0 m = t9g0Var != null ? t9g0Var.m() : null;
        Text c = m != null ? m.c() : null;
        wvz0 m2 = viewState.m();
        if (!jl40.l(c, m2 != null ? m2.c() : null) || (cuz0Var = this.tooltip) == null) {
            renderTooltipManually(viewState);
        } else {
            cuz0Var.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderTooltipManually(t9g0 viewState) {
        zy11 zy11Var;
        t461 t461Var = (t461) getBinding();
        wvz0 m = viewState.m();
        if (m != null) {
            Text c = m.c();
            cuz0 cuz0Var = this.tooltip;
            if (cuz0Var != null) {
                cuz0Var.d();
            }
            buz0 d = frb1.d(requireContext());
            d.m(l1i0.Widget_YB_Text_Caption1_Regular_Inverted);
            d.l(c);
            d.i(viewState.m().b());
            d.h(viewState.m().a());
            d.e();
            d.f(false);
            d.k(Tooltip$PreferredPosition.TOP);
            d.b(new u8g0(this, 5));
            cuz0 a = d.a();
            this.tooltip = a;
            a.f(t461Var.q, 0L);
            cuz0 cuz0Var2 = this.tooltip;
            if (cuz0Var2 != null) {
                cuz0Var2.a();
                zy11Var = zy11.a;
            } else {
                zy11Var = null;
            }
            if (zy11Var != null) {
                return;
            }
        }
        cuz0 cuz0Var3 = this.tooltip;
        if (cuz0Var3 != null) {
            cuz0Var3.c();
        }
        this.tooltip = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderTooltipManually$lambda$47$lambda$45$lambda$44(QrPaymentsMainFragment qrPaymentsMainFragment) {
        ((b) qrPaymentsMainFragment.getViewModel()).i0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderWidgets(u9g0 viewState) {
        t461 t461Var = (t461) getBinding();
        getWidgetsAdapterDelegate().g(viewState.h());
        if (viewState.h().isEmpty()) {
            t461Var.w.setVisibility(8);
        } else {
            changeVisibility$default(this, t461Var.w, true, null, null, 6, null);
        }
    }

    private final void updateAmountBlockPosition(t461 t461Var) {
        ViewGroup.LayoutParams layoutParams = t461Var.j.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) > 0) {
            return;
        }
        RectF a = ty01.a(t461Var.p);
        RectF a2 = ty01.a(t461Var.f);
        RectF a3 = ty01.a(t461Var.c);
        float height = (a3.height() / 2.0f) + a3.top;
        float f = (a2.top - a.bottom) / 2.0f;
        if (height >= f) {
            return;
        }
        int i = (int) (f - height);
        OperationStatusView operationStatusView = t461Var.j;
        ViewGroup.LayoutParams layoutParams2 = operationStatusView.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, i, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        operationStatusView.setLayoutParams(marginLayoutParams2);
        FrameLayout frameLayout = (FrameLayout) t461Var.n.d;
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, i, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
        frameLayout.setLayoutParams(marginLayoutParams3);
    }

    private final void updateAmountWidgetContent(v9g0 viewState) {
        rr51 d = viewState.d();
        if (d != null) {
            safePost(new kqe0(4, viewState, this, d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 updateAmountWidgetContent$lambda$49$lambda$48(v9g0 v9g0Var, QrPaymentsMainFragment qrPaymentsMainFragment, rr51 rr51Var) {
        t9g0 t9g0Var = v9g0Var instanceof t9g0 ? (t9g0) v9g0Var : null;
        List l = t9g0Var != null ? t9g0Var.l() : null;
        List list = EmptyList.a;
        if (l == null) {
            l = list;
        }
        List list2 = l;
        List i = t9g0Var != null ? t9g0Var.i() : null;
        if (i != null) {
            list = i;
        }
        ((t461) qrPaymentsMainFragment.getBinding()).g.setData(rr51Var, kotlin.collections.a.m0(list, list2), t9g0Var != null ? t9g0Var.n() : null, true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e7n widgetsAdapterDelegate_delegate$lambda$2(QrPaymentsMainFragment qrPaymentsMainFragment) {
        return new e7n(hc5.a(), ola1.c(new x8g0(qrPaymentsMainFragment, 0)), xca1.d(new v8g0(qrPaymentsMainFragment, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean widgetsAdapterDelegate_delegate$lambda$2$lambda$0(QrPaymentsMainFragment qrPaymentsMainFragment, Uri uri, spl splVar) {
        return ((b) qrPaymentsMainFragment.getViewModel()).g0(uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 widgetsAdapterDelegate_delegate$lambda$2$lambda$1(QrPaymentsMainFragment qrPaymentsMainFragment, boolean z) {
        ((b) qrPaymentsMainFragment.getViewModel()).h0(null, z);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void wiggleAmount() {
        t461 t461Var = (t461) getBinding();
        sm91.h(bmg0.ybsdk_animation_wiggle, t461Var.c);
        sm91.h(bmg0.ybsdk_animation_wiggle, t461Var.e);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        o9g0 o9g0Var = sideEffect instanceof o9g0 ? (o9g0) sideEffect : null;
        if (o9g0Var == null) {
            return;
        }
        if (o9g0Var instanceof m9g0) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((m9g0) o9g0Var).a(), null, 12);
            return;
        }
        if (o9g0Var.equals(n9g0.a)) {
            wiggleAmount();
        } else if (o9g0Var instanceof l9g0) {
            rje.i(requireContext(), ((l9g0) o9g0Var).a());
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((q9g0) this.factory).a((QrPaymentsArguments) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r3v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public t461 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        final t461 p = t461.p(inflater, container);
        MoneyInputEditView moneyInputEditView = p.c;
        final int i = 0;
        moneyInputEditView.addTextChangedListener(new ThousandSeparatorTextWatcher(new v8g0(this, i)));
        moneyInputEditView.addTextChangedListener(new AmountResizeTextWatcher(requireContext(), moneyInputEditView, p.e, p.o()));
        moneyInputEditView.setOnClickListener(new View.OnClickListener(this) { // from class: w8g0
            public final /* synthetic */ QrPaymentsMainFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                QrPaymentsMainFragment qrPaymentsMainFragment = this.b;
                switch (i2) {
                    case 0:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$5$lambda$4(qrPaymentsMainFragment, view);
                        break;
                    case 1:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$7(qrPaymentsMainFragment, view);
                        break;
                    default:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$8(qrPaymentsMainFragment, view);
                        break;
                }
            }
        });
        ErrorView errorView = p.h;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new QrPaymentsMainFragment$getViewBinding$1$2$1(getViewModel()));
        final int i2 = 1;
        p.l.setPrimaryActionClickListener(new View.OnClickListener(this) { // from class: w8g0
            public final /* synthetic */ QrPaymentsMainFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                QrPaymentsMainFragment qrPaymentsMainFragment = this.b;
                switch (i22) {
                    case 0:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$5$lambda$4(qrPaymentsMainFragment, view);
                        break;
                    case 1:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$7(qrPaymentsMainFragment, view);
                        break;
                    default:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$8(qrPaymentsMainFragment, view);
                        break;
                }
            }
        });
        ImageToolbarView imageToolbarView = p.p;
        imageToolbarView.setOnCloseButtonClickListener(new QrPaymentsMainFragment$getViewBinding$1$4(getViewModel()));
        utb1.d(p.i, moneyInputEditView);
        final int i3 = 2;
        p.d.setOnClickListener(new View.OnClickListener(this) { // from class: w8g0
            public final /* synthetic */ QrPaymentsMainFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                QrPaymentsMainFragment qrPaymentsMainFragment = this.b;
                switch (i22) {
                    case 0:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$5$lambda$4(qrPaymentsMainFragment, view);
                        break;
                    case 1:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$7(qrPaymentsMainFragment, view);
                        break;
                    default:
                        QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$8(qrPaymentsMainFragment, view);
                        break;
                }
            }
        });
        p.w.setAdapter(getWidgetsAdapterDelegate());
        p.f.setActionHandler(new v8g0(this, i2));
        p.g.setActionHandler(new v8g0(this, i3));
        this.qrPaymentScrollAnimation = new pag0(p.b, imageToolbarView, moneyInputEditView, p.s);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p.n.s(), (Property<ShimmerFrameLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(700L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment$getViewBinding$lambda$13$lambda$12$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ((ShimmerFrameLayout) t461.this.n.c).stopShimmer();
                ((ShimmerFrameLayout) t461.this.n.c).setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.skeletonFadeAnimator = ofFloat;
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        u1w h = insets.a.h(519);
        int i = h.b;
        int i2 = h.d;
        ImageToolbarView imageToolbarView = ((t461) getBinding()).p;
        ViewGroup.LayoutParams layoutParams = imageToolbarView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        imageToolbarView.setLayoutParams(marginLayoutParams);
        ShimmerFrameLayout s = ((t461) getBinding()).n.s();
        s.setPadding(s.getPaddingLeft(), i, s.getPaddingRight(), s.getPaddingBottom());
        ConstraintLayout o = ((t461) getBinding()).o();
        o.setPadding(o.getPaddingLeft(), o.getPaddingTop(), o.getPaddingRight(), i2);
        ErrorView errorView = ((t461) getBinding()).h;
        errorView.setPadding(errorView.getPaddingLeft(), errorView.getPaddingTop(), errorView.getPaddingRight(), i2);
        return insets;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, QrPaymentsSecondFactorScreenProvider$Request.PAYMENT.getKey(), new x8g0(this, 1));
        hua1.g(this, QrPaymentsSecondFactorScreenProvider$Request.SUBSCRIPTION.getKey(), new x8g0(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((b) getViewModel()).f0();
        this.previousViewState = null;
        this.tooltip = null;
        this.qrPaymentScrollAnimation = null;
        this.skeletonFadeAnimator = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        w9g0 w9g0Var = this.previousViewState;
        t9g0 t9g0Var = w9g0Var instanceof t9g0 ? (t9g0) w9g0Var : null;
        if (t9g0Var == null || this.isPlansBottomSheetShown) {
            return;
        }
        renderTooltip(t9g0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        this.tooltip = null;
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((b) getViewModel()).j0();
        ((t461) getBinding()).w.setNestedScrollingEnabled(false);
        ((t461) getBinding()).w.setItemAnimator(null);
        com.ybsdk.core.utils.ext.view.b.p(view, new o6(11, this));
        ((hf8) this.bottomSheetInteractor).c(getViewLifecycleOwner().getLifecycle(), new u8g0(this, 3));
        ((hf8) this.bottomSheetInteractor).d(getViewLifecycleOwner().getLifecycle(), new u8g0(this, 4));
        if (getIsNewInsetsHandlingEnabled() || !((cwb0) this.visualParams).a()) {
            return;
        }
        ImageToolbarView imageToolbarView = ((t461) getBinding()).p;
        ViewGroup.LayoutParams layoutParams = imageToolbarView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, ((cjm0) this.sdkBottomSheetInsetsProvider).b(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        imageToolbarView.setLayoutParams(marginLayoutParams);
        ShimmerFrameLayout s = ((t461) getBinding()).n.s();
        s.setPadding(s.getPaddingLeft(), ((cjm0) this.sdkBottomSheetInsetsProvider).b(), s.getPaddingRight(), s.getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(w9g0 viewState) {
        t461 t461Var = (t461) getBinding();
        t461Var.h.render(null);
        boolean z = viewState instanceof r9g0;
        t461Var.l.setVisibility((!z || ((r9g0) viewState).f() == null) ? 8 : 0);
        renderSkeletonWithAnimation(viewState);
        if (z) {
            renderErrorScreen((r9g0) viewState);
        } else if (viewState instanceof s9g0) {
            t461Var.p.render(((s9g0) viewState).c());
        } else if (viewState instanceof t9g0) {
            hideResultScreenContent();
            renderCommonScreenData((v9g0) viewState);
            renderAmountScreen((t9g0) viewState);
        } else {
            if (!(viewState instanceof u9g0)) {
                w511.b();
                return;
            }
            pag0 pag0Var = this.qrPaymentScrollAnimation;
            if (pag0Var != null) {
                pag0Var.b();
            }
            renderAmountInput(false);
            hideAmountScreenContent();
            renderCommonScreenData((v9g0) viewState);
            renderResultScreen((u9g0) viewState);
        }
        renderStatusBar();
        this.previousViewState = viewState;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
