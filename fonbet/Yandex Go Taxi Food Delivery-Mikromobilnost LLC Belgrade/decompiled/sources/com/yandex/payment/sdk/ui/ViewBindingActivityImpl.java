package com.yandex.payment.sdk.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.fragment.app.Fragment;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.payment.divkit.exitscreen.DKExitFragment;
import com.yandex.payment.divkit.license.DKLicenseFragment;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.model.data.WidthOnLargeScreen;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.exit.ExitFragment;
import com.yandex.payment.sdk.ui.payment.license.LicenseFragment;
import defpackage.apa1;
import defpackage.b931;
import defpackage.bo31;
import defpackage.bp31;
import defpackage.c950;
import defpackage.cp31;
import defpackage.dle;
import defpackage.dy40;
import defpackage.f950;
import defpackage.hvg0;
import defpackage.i3y;
import defpackage.iob1;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.jr31;
import defpackage.ke31;
import defpackage.km0;
import defpackage.kpg0;
import defpackage.n891;
import defpackage.ny61;
import defpackage.ong0;
import defpackage.pwf;
import defpackage.rw4;
import defpackage.s5r;
import defpackage.sls;
import defpackage.tc5;
import defpackage.tmo;
import defpackage.w511;
import defpackage.wwg;
import defpackage.wx11;
import defpackage.xc5;
import defpackage.xsf;
import defpackage.y7z0;
import defpackage.ywg0;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 Y*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0002Z[B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0004¢\u0006\u0004\b\n\u0010\u0007J)\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\b*\u00020\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u0007J\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\u0007J\u000f\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020\b*\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\b*\u00020'H\u0002¢\u0006\u0004\b*\u0010)J\u0013\u0010+\u001a\u00020\b*\u00020'H\u0002¢\u0006\u0004\b+\u0010)J\u0013\u0010,\u001a\u00020\b*\u00020'H\u0002¢\u0006\u0004\b,\u0010)J\u0013\u0010-\u001a\u00020\b*\u00020'H\u0002¢\u0006\u0004\b-\u0010)J\u0013\u0010.\u001a\u00020\b*\u00020'H\u0002¢\u0006\u0004\b.\u0010)J\u0013\u0010\u001b\u001a\u00020\b*\u00020'H\u0002¢\u0006\u0004\b\u001b\u0010)J\u0013\u0010/\u001a\u00020\b*\u00020'H\u0002¢\u0006\u0004\b/\u0010)J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00018\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\u001b\u0010J\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010FR\u001b\u0010M\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010FR#\u0010S\u001a\n O*\u0004\u0018\u00010N0N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010:R\u0014\u0010V\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010W¨\u0006\\"}, d2 = {"Lcom/yandex/payment/sdk/ui/ViewBindingActivityImpl;", "Ltc5;", "VM", "Lzo31;", "VB", "Lcom/yandex/payment/sdk/ui/BaseActivity;", "<init>", "()V", "Lzy11;", "setupSheet", "initBinding", "", "showBar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootLayout", "", "duration", "performSnackBarTransition", "(ZLandroidx/constraintlayout/widget/ConstraintLayout;J)V", "Landroid/widget/ImageView;", "", "res", "bindImage$paymentsdk_release", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "bindImage", "observeViewModel", "setupDebugView", "showSheet", "performSheetTransition", "(Z)V", "showExitScreen", "performExitTransition", "container", "setIdsForNamelessViews", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "setupExitLayout", "setupFullHeight", "getFullScreenWidth", "()I", "Landroidx/constraintlayout/widget/e;", "showBlurView", "(Landroidx/constraintlayout/widget/e;)V", "hideBlurView", "hideExitContainer", "showExitContainer", "showContent", "hideContent", "hideSheet", "Landroidx/fragment/app/Fragment;", "getExitFragment", "()Landroidx/fragment/app/Fragment;", "activityViewModel", "Ltc5;", "getActivityViewModel", "()Ltc5;", "currentBinding", "Lzo31;", "getCurrentBinding", "()Lzo31;", "setCurrentBinding", "(Lzo31;)V", "Landroidx/transition/Transition;", "blurTransition$delegate", "Li3y;", "getBlurTransition", "()Landroidx/transition/Transition;", "blurTransition", "Landroidx/transition/TransitionSet;", "fullScreenSheetTransition$delegate", "getFullScreenSheetTransition", "()Landroidx/transition/TransitionSet;", "fullScreenSheetTransition", "fullScreenExitTransition$delegate", "getFullScreenExitTransition", "fullScreenExitTransition", "defaultTransition$delegate", "getDefaultTransition", "defaultTransition", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "contentContainer$delegate", "getContentContainer", "()Landroid/widget/LinearLayout;", "contentContainer", "getBinding", "binding", "isPaymentContext", "()Z", "isWebViewEnabled", "Companion", "bp31", "r720", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ViewBindingActivityImpl<VM extends tc5, VB extends zo31> extends BaseActivity {
    public static final bp31 Companion = new bp31();
    private static final long SHEET_TRANSITION_DURATION = 500;
    private static final long TRANSITION_DURATION = 6000;
    private final VM activityViewModel;

    /* renamed from: blurTransition$delegate, reason: from kotlin metadata */
    private final i3y blurTransition;

    /* renamed from: contentContainer$delegate, reason: from kotlin metadata */
    private final i3y contentContainer;
    private VB currentBinding;

    /* renamed from: defaultTransition$delegate, reason: from kotlin metadata */
    private final i3y defaultTransition = kotlin.a.a(new b931(11));

    /* renamed from: fullScreenExitTransition$delegate, reason: from kotlin metadata */
    private final i3y fullScreenExitTransition;

    /* renamed from: fullScreenSheetTransition$delegate, reason: from kotlin metadata */
    private final i3y fullScreenSheetTransition;

    public ViewBindingActivityImpl() {
        final int i = 0;
        this.blurTransition = kotlin.a.a(new sls(this) { // from class: ap31
            public final /* synthetic */ ViewBindingActivityImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Fade blurTransition_delegate$lambda$0;
                TransitionSet fullScreenSheetTransition_delegate$lambda$0;
                TransitionSet fullScreenExitTransition_delegate$lambda$0;
                LinearLayout contentContainer_delegate$lambda$0;
                int i2 = i;
                ViewBindingActivityImpl viewBindingActivityImpl = this.b;
                switch (i2) {
                    case 0:
                        blurTransition_delegate$lambda$0 = ViewBindingActivityImpl.blurTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return blurTransition_delegate$lambda$0;
                    case 1:
                        fullScreenSheetTransition_delegate$lambda$0 = ViewBindingActivityImpl.fullScreenSheetTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return fullScreenSheetTransition_delegate$lambda$0;
                    case 2:
                        fullScreenExitTransition_delegate$lambda$0 = ViewBindingActivityImpl.fullScreenExitTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return fullScreenExitTransition_delegate$lambda$0;
                    default:
                        contentContainer_delegate$lambda$0 = ViewBindingActivityImpl.contentContainer_delegate$lambda$0(viewBindingActivityImpl);
                        return contentContainer_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        this.fullScreenSheetTransition = kotlin.a.a(new sls(this) { // from class: ap31
            public final /* synthetic */ ViewBindingActivityImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Fade blurTransition_delegate$lambda$0;
                TransitionSet fullScreenSheetTransition_delegate$lambda$0;
                TransitionSet fullScreenExitTransition_delegate$lambda$0;
                LinearLayout contentContainer_delegate$lambda$0;
                int i22 = i2;
                ViewBindingActivityImpl viewBindingActivityImpl = this.b;
                switch (i22) {
                    case 0:
                        blurTransition_delegate$lambda$0 = ViewBindingActivityImpl.blurTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return blurTransition_delegate$lambda$0;
                    case 1:
                        fullScreenSheetTransition_delegate$lambda$0 = ViewBindingActivityImpl.fullScreenSheetTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return fullScreenSheetTransition_delegate$lambda$0;
                    case 2:
                        fullScreenExitTransition_delegate$lambda$0 = ViewBindingActivityImpl.fullScreenExitTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return fullScreenExitTransition_delegate$lambda$0;
                    default:
                        contentContainer_delegate$lambda$0 = ViewBindingActivityImpl.contentContainer_delegate$lambda$0(viewBindingActivityImpl);
                        return contentContainer_delegate$lambda$0;
                }
            }
        });
        final int i3 = 2;
        this.fullScreenExitTransition = kotlin.a.a(new sls(this) { // from class: ap31
            public final /* synthetic */ ViewBindingActivityImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Fade blurTransition_delegate$lambda$0;
                TransitionSet fullScreenSheetTransition_delegate$lambda$0;
                TransitionSet fullScreenExitTransition_delegate$lambda$0;
                LinearLayout contentContainer_delegate$lambda$0;
                int i22 = i3;
                ViewBindingActivityImpl viewBindingActivityImpl = this.b;
                switch (i22) {
                    case 0:
                        blurTransition_delegate$lambda$0 = ViewBindingActivityImpl.blurTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return blurTransition_delegate$lambda$0;
                    case 1:
                        fullScreenSheetTransition_delegate$lambda$0 = ViewBindingActivityImpl.fullScreenSheetTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return fullScreenSheetTransition_delegate$lambda$0;
                    case 2:
                        fullScreenExitTransition_delegate$lambda$0 = ViewBindingActivityImpl.fullScreenExitTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return fullScreenExitTransition_delegate$lambda$0;
                    default:
                        contentContainer_delegate$lambda$0 = ViewBindingActivityImpl.contentContainer_delegate$lambda$0(viewBindingActivityImpl);
                        return contentContainer_delegate$lambda$0;
                }
            }
        });
        final int i4 = 3;
        this.contentContainer = kotlin.a.a(new sls(this) { // from class: ap31
            public final /* synthetic */ ViewBindingActivityImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Fade blurTransition_delegate$lambda$0;
                TransitionSet fullScreenSheetTransition_delegate$lambda$0;
                TransitionSet fullScreenExitTransition_delegate$lambda$0;
                LinearLayout contentContainer_delegate$lambda$0;
                int i22 = i4;
                ViewBindingActivityImpl viewBindingActivityImpl = this.b;
                switch (i22) {
                    case 0:
                        blurTransition_delegate$lambda$0 = ViewBindingActivityImpl.blurTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return blurTransition_delegate$lambda$0;
                    case 1:
                        fullScreenSheetTransition_delegate$lambda$0 = ViewBindingActivityImpl.fullScreenSheetTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return fullScreenSheetTransition_delegate$lambda$0;
                    case 2:
                        fullScreenExitTransition_delegate$lambda$0 = ViewBindingActivityImpl.fullScreenExitTransition_delegate$lambda$0(viewBindingActivityImpl);
                        return fullScreenExitTransition_delegate$lambda$0;
                    default:
                        contentContainer_delegate$lambda$0 = ViewBindingActivityImpl.contentContainer_delegate$lambda$0(viewBindingActivityImpl);
                        return contentContainer_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fade blurTransition_delegate$lambda$0(ViewBindingActivityImpl viewBindingActivityImpl) {
        Fade fade = new Fade();
        fade.c = 500L;
        View blurView = viewBindingActivityImpl.getBlurView();
        if (blurView != null) {
            fade.c(blurView.getId());
        }
        return fade;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout contentContainer_delegate$lambda$0(ViewBindingActivityImpl viewBindingActivityImpl) {
        return (LinearLayout) viewBindingActivityImpl.findViewById(viewBindingActivityImpl.getContentContainerId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransitionSet defaultTransition_delegate$lambda$0() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.Z(new Fade());
        transitionSet.Z(new ChangeBounds());
        return transitionSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransitionSet fullScreenExitTransition_delegate$lambda$0(ViewBindingActivityImpl viewBindingActivityImpl) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.Z(viewBindingActivityImpl.getBlurTransition());
        Slide slide = new Slide(0);
        slide.c = 500L;
        slide.d(viewBindingActivityImpl.findViewById(viewBindingActivityImpl.getExitContainerId()));
        transitionSet.Z(slide);
        return transitionSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransitionSet fullScreenSheetTransition_delegate$lambda$0(ViewBindingActivityImpl viewBindingActivityImpl) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.Z(viewBindingActivityImpl.getBlurTransition());
        Slide slide = new Slide(0);
        slide.c = 500L;
        FrameLayout sheetView = viewBindingActivityImpl.getSheetView();
        if (sheetView != null) {
            slide.c(sheetView.getId());
        }
        transitionSet.Z(slide);
        return transitionSet;
    }

    private final Transition getBlurTransition() {
        return (Transition) this.blurTransition.getValue();
    }

    private final LinearLayout getContentContainer() {
        return (LinearLayout) this.contentContainer.getValue();
    }

    private final TransitionSet getDefaultTransition() {
        return (TransitionSet) this.defaultTransition.getValue();
    }

    private final Fragment getExitFragment() {
        xsf xsfVar = new xsf();
        if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_EXIT_FLAG)) {
            xsfVar = null;
        }
        if (xsfVar != null) {
            boolean isPaymentContext = isPaymentContext();
            DKExitFragment.Companion.getClass();
            DKExitFragment dKExitFragment = new DKExitFragment();
            dKExitFragment.setArguments(wwg.g(new Pair("isPaymentContext", Boolean.valueOf(isPaymentContext))));
            return dKExitFragment;
        }
        tmo tmoVar = ExitFragment.Companion;
        boolean isPaymentContext2 = isPaymentContext();
        tmoVar.getClass();
        ExitFragment exitFragment = new ExitFragment();
        exitFragment.setArguments(wwg.g(new Pair("isPaymentContext", Boolean.valueOf(isPaymentContext2))));
        return exitFragment;
    }

    private final TransitionSet getFullScreenExitTransition() {
        return (TransitionSet) this.fullScreenExitTransition.getValue();
    }

    private final TransitionSet getFullScreenSheetTransition() {
        return (TransitionSet) this.fullScreenSheetTransition.getValue();
    }

    private final int getFullScreenWidth() {
        if (getResources().getDisplayMetrics().widthPixels >= getResources().getDimensionPixelSize(hvg0.paymentsdk_large_screen_width_threshold)) {
            WidthOnLargeScreen widthOnLargeScreen = ((pwf) getBaseComponent$paymentsdk_release()).a().getWidthOnLargeScreen();
            int i = widthOnLargeScreen == null ? -1 : cp31.a[widthOnLargeScreen.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    if (i == 2) {
                        return -1;
                    }
                    w511.b();
                    return 0;
                }
                rw4 rw4Var = BaseActivity.Companion;
                Resources resources = getResources();
                rw4Var.getClass();
                return resources.getDimensionPixelSize(hvg0.paymentsdk_large_screen_compact_width);
            }
        }
        return -1;
    }

    private final void hideBlurView(e eVar) {
        View blurView = getBlurView();
        if (blurView != null) {
            eVar.x(blurView.getId(), 8);
        }
    }

    private final void hideContent(e eVar) {
        eVar.x(getContentContainerId(), 8);
    }

    private final void hideExitContainer(e eVar) {
        eVar.x(getExitContainerId(), 8);
    }

    private final void hideSheet(e eVar) {
        FrameLayout sheetView = getSheetView();
        if (sheetView != null) {
            eVar.x(sheetView.getId(), 8);
        }
    }

    private final void observeViewModel() {
        dy40 dy40Var;
        VM activityViewModel = getActivityViewModel();
        if (activityViewModel == null || (dy40Var = ((xc5) activityViewModel).c) == null) {
            return;
        }
        dy40Var.f(this, new dle(6, new wx11(29, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeViewModel$lambda$0(ViewBindingActivityImpl viewBindingActivityImpl, f950 f950Var) {
        if (jl40.l(f950Var, c950.a)) {
            viewBindingActivityImpl.tryCloseActivity();
        } else if (jl40.l(f950Var, c950.b)) {
            viewBindingActivityImpl.performExitTransition(false);
        } else if (jl40.l(f950Var, c950.d)) {
            viewBindingActivityImpl.performExitTransition(true);
        } else if (jl40.l(f950Var, c950.c)) {
            viewBindingActivityImpl.performSheetTransition(false);
        } else {
            if (!jl40.l(f950Var, c950.e)) {
                w511.b();
                return null;
            }
            viewBindingActivityImpl.performSheetTransition(true);
        }
        return zy11.a;
    }

    private final void performExitTransition(boolean showExitScreen) {
        ConstraintLayout mainContainer = getMainContainer();
        FeatureFlag featureFlag = FeatureFlag.FULLSCREEN_FLAG;
        TransitionManager.a(apa1.e(featureFlag) ? getFullScreenExitTransition() : getDefaultTransition(), mainContainer);
        setIdsForNamelessViews(getMainContainer());
        e eVar = new e();
        eVar.g(getMainContainer());
        if (showExitScreen) {
            showExitContainer(eVar);
            hideSheet(eVar);
            if (apa1.e(featureFlag)) {
                showBlurView(eVar);
            } else {
                hideBlurView(eVar);
                hideContent(eVar);
            }
        } else {
            hideExitContainer(eVar);
            hideBlurView(eVar);
            if (!apa1.e(featureFlag)) {
                showContent(eVar);
            }
        }
        eVar.b(getMainContainer());
    }

    private final void performSheetTransition(boolean showSheet) {
        ConstraintLayout mainContainer = getMainContainer();
        FeatureFlag featureFlag = FeatureFlag.FULLSCREEN_FLAG;
        TransitionManager.a(apa1.e(featureFlag) ? getFullScreenSheetTransition() : getDefaultTransition(), mainContainer);
        e eVar = new e();
        eVar.g(getMainContainer());
        hideExitContainer(eVar);
        if (showSheet) {
            showSheet(eVar);
            if (apa1.e(featureFlag)) {
                showBlurView(eVar);
            } else {
                hideBlurView(eVar);
                hideContent(eVar);
            }
        } else {
            hideSheet(eVar);
            hideBlurView(eVar);
            if (!apa1.e(featureFlag)) {
                showContent(eVar);
            }
        }
        eVar.b(getMainContainer());
    }

    public static /* synthetic */ void performSnackBarTransition$default(ViewBindingActivityImpl viewBindingActivityImpl, boolean z, ConstraintLayout constraintLayout, long j, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: performSnackBarTransition");
            return;
        }
        if ((i & 4) != 0) {
            j = TRANSITION_DURATION;
        }
        viewBindingActivityImpl.performSnackBarTransition(z, constraintLayout, j);
    }

    private final void setIdsForNamelessViews(ConstraintLayout container) {
        s5r s5rVar = new s5r(kotlin.sequences.b.g(new jr31(container, 0), new ke31(15)));
        while (s5rVar.hasNext()) {
            ((View) s5rVar.next()).setId(View.generateViewId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setIdsForNamelessViews$lambda$0(View view) {
        return view.getId() == -1;
    }

    private final void setupDebugView() {
        if (!apa1.e(FeatureFlag.IS_STAFF)) {
            ConstraintLayout mainContainer = getMainContainer();
            mainContainer.setPadding(mainContainer.getPaddingLeft(), mainContainer.getPaddingTop(), mainContainer.getPaddingRight(), 0);
            TextView debugView = getDebugView();
            if (debugView != null) {
                debugView.setVisibility(8);
                return;
            }
            return;
        }
        TextView debugView2 = getDebugView();
        if (debugView2 != null) {
            debugView2.setVisibility(8);
            debugView2.setGravity(17);
            debugView2.setTextAlignment(4);
            Object obj = ((km0) ((pwf) getBaseComponent$paymentsdk_release()).d.get()).a().get("api_instance_id");
            if (obj == null) {
                obj = "";
            }
            String str = (String) obj;
            Object obj2 = ((km0) ((pwf) getBaseComponent$paymentsdk_release()).d.get()).a().get("uid");
            String str2 = (String) (obj2 != null ? obj2 : "");
            debugView2.setOnClickListener(new y7z0(15, debugView2, str));
            boolean d = iob1.d(getTheme(), ong0.paymentsdk_is_light_theme, true);
            debugView2.setTextColor(debugView2.getContext().getColor(d ? kpg0.paymentsdk_textSecondaryLight : kpg0.paymentsdk_white));
            debugView2.setBackgroundColor(debugView2.getContext().getColor(d ? kpg0.paymentsdk_white : kpg0.paymentsdk_onyx));
            debugView2.setText("[NDA] PaymentSDK 7.6.6 UID: " + str2 + "\n " + str);
            ConstraintLayout mainContainer2 = getMainContainer();
            mainContainer2.setPadding(mainContainer2.getPaddingLeft(), mainContainer2.getPaddingTop(), mainContainer2.getPaddingRight(), debugView2.getResources().getDimensionPixelSize(hvg0.paymentsdk_debug_view_height));
            debugView2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDebugView$lambda$0$2(TextView textView, String str, View view) {
        ((ClipboardManager) textView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
    }

    private final void setupExitLayout() {
        replaceFragment$paymentsdk_release(getExitFragment(), false, getExitContainerId());
    }

    private final void setupFullHeight() {
        getContentContainer().getLayoutParams().height = -1;
        getMainContainer().getLayoutParams().height = -1;
    }

    private final void showBlurView(e eVar) {
        View blurView = getBlurView();
        if (blurView != null) {
            eVar.x(blurView.getId(), 0);
        }
    }

    private final void showContent(e eVar) {
        eVar.x(getContentContainerId(), 0);
    }

    private final void showExitContainer(e eVar) {
        eVar.x(getExitContainerId(), 0);
    }

    private final void showSheet(e eVar) {
        FrameLayout sheetView = getSheetView();
        if (sheetView != null) {
            eVar.x(sheetView.getId(), 0);
        }
    }

    public final void bindImage$paymentsdk_release(ImageView imageView, Integer num) {
        imageView.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
    }

    public VM getActivityViewModel() {
        return this.activityViewModel;
    }

    public VB getBinding() {
        VB currentBinding = getCurrentBinding();
        if (currentBinding != null) {
            return currentBinding;
        }
        ny61.t("Binding is not initialized");
        return null;
    }

    public /* bridge */ View getBlurView() {
        return null;
    }

    public abstract int getContentContainerId();

    public VB getCurrentBinding() {
        return this.currentBinding;
    }

    public /* bridge */ TextView getDebugView() {
        return null;
    }

    public abstract int getExitContainerId();

    public abstract ConstraintLayout getMainContainer();

    public /* bridge */ FrameLayout getSheetView() {
        return null;
    }

    public /* bridge */ ImageView getSlideView() {
        return null;
    }

    public final void initBinding() {
        View blurView = getBlurView();
        if (blurView != null) {
            blurView.setOnClickListener(null);
        }
        setupExitLayout();
        if (apa1.e(FeatureFlag.FULLSCREEN_FLAG)) {
            setupFullHeight();
            ImageView slideView = getSlideView();
            if (slideView != null) {
                slideView.setVisibility(8);
            }
            getContentContainer().setBackgroundResource(ywg0.paymentsdk_bg_full);
        } else {
            ImageView slideView2 = getSlideView();
            if (slideView2 != null) {
                slideView2.setVisibility(0);
            }
            getContentContainer().setBackgroundResource(ywg0.paymentsdk_bg_panel);
        }
        setupDebugView();
        getMainContainer().getLayoutParams().width = getFullScreenWidth();
        observeViewModel();
    }

    public boolean isPaymentContext() {
        Intent intent = getIntent();
        return n891.o(intent != null ? Boolean.valueOf(intent.getBooleanExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, false)) : null);
    }

    public boolean isWebViewEnabled() {
        return getSupportFragmentManager().E(j9h0.challenge_fragment) != null;
    }

    public final void performSnackBarTransition(boolean showBar, ConstraintLayout rootLayout, long duration) {
        setIdsForNamelessViews(getMainContainer());
        e eVar = new e();
        eVar.g(rootLayout);
        if (showBar) {
            eVar.e(j9h0.snackBarLayout, 4);
            eVar.j(j9h0.snackBarLayout, 3, 0, 3, n891.k(16));
            rootLayout.postDelayed(new bo31(2, this, rootLayout), duration);
        } else {
            eVar.e(j9h0.snackBarLayout, 3);
            eVar.i(j9h0.snackBarLayout, 4, 0, 3);
        }
        eVar.b(rootLayout);
        TransitionManager.a(null, rootLayout);
    }

    public void setCurrentBinding(VB vb) {
        this.currentBinding = vb;
    }

    public final void setupSheet() {
        Fragment a;
        FrameLayout sheetView = getSheetView();
        if (sheetView != null) {
            int id = sheetView.getId();
            xsf xsfVar = new xsf();
            if (!apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) || !apa1.e(FeatureFlag.DIV_KIT_LICENSE_FLAG)) {
                xsfVar = null;
            }
            if (xsfVar != null) {
                DKLicenseFragment.Companion.getClass();
                a = new DKLicenseFragment();
            } else {
                LicenseFragment.Companion.getClass();
                a = com.yandex.payment.sdk.ui.payment.license.a.a();
            }
            replaceFragment$paymentsdk_release(a, false, id);
        }
    }
}
