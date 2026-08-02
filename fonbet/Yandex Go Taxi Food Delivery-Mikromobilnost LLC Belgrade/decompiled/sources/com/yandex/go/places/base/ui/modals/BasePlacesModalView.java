package com.yandex.go.places.base.ui.modals;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bz20;
import defpackage.c230;
import defpackage.c2x0;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.d2x0;
import defpackage.e230;
import defpackage.ez20;
import defpackage.f02;
import defpackage.f75;
import defpackage.fz20;
import defpackage.h75;
import defpackage.i3y;
import defpackage.lab1;
import defpackage.mqg0;
import defpackage.p7c0;
import defpackage.qje;
import defpackage.ry20;
import defpackage.sls;
import defpackage.sy20;
import defpackage.t1w;
import defpackage.tje;
import defpackage.w511;
import defpackage.wac0;
import defpackage.x55;
import defpackage.xd7;
import defpackage.xng0;
import defpackage.xr00;
import defpackage.xtg0;
import defpackage.xw31;
import defpackage.zo31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0014¢\u0006\u0004\b$\u0010\u001bJ\u000f\u0010%\u001a\u00020\u0016H\u0014¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u0014H\u0014¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\u0014H\u0014¢\u0006\u0004\b'\u0010#J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0016H\u0014¢\u0006\u0004\b,\u0010\u001eJ\u000f\u0010-\u001a\u00020\u0016H\u0014¢\u0006\u0004\b-\u0010\u001eJ\u0017\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u000202H\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0016H\u0014¢\u0006\u0004\b6\u0010\u001eJ\u0017\u00108\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0014H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0019H\u0014¢\u0006\u0004\b:\u0010\u001bJ\u000f\u0010;\u001a\u00020\u0016H\u0004¢\u0006\u0004\b;\u0010\u001eJ\u001d\u0010>\u001a\u00020\u00162\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110<H\u0014¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0014H\u0014¢\u0006\u0004\b@\u0010\u0018J\u001f\u0010D\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00112\u0006\u0010C\u001a\u00020BH\u0014¢\u0006\u0004\bD\u0010EJ\u001d\u0010G\u001a\u00020\u00162\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00110<H\u0014¢\u0006\u0004\bG\u0010?J\u000f\u0010H\u001a\u00020\u0016H\u0002¢\u0006\u0004\bH\u0010\u001eJ\u0013\u0010J\u001a\u00020\u0016*\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ!\u0010L\u001a\u00020\u0016*\u00020I2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110<H\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020\u00162\b\b\u0002\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\bN\u0010\u0018J\u0017\u0010O\u001a\u00020\u00162\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\u001e\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010R\u001a\u0004\bS\u0010TR*\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010U8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001b\u0010_\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010#R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010]\u001a\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010h\u001a\u0004\u0018\u00010g8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001d\u0010o\u001a\u0004\u0018\u00010I8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bl\u0010]\u001a\u0004\bm\u0010nR\u001b\u0010q\u001a\u00020\u00198DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bp\u0010]\u001a\u0004\bq\u0010\u001bR\u001d\u0010v\u001a\u0004\u0018\u00010r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bs\u0010]\u001a\u0004\bt\u0010uR\u001d\u0010{\u001a\u0004\u0018\u00010w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010]\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b|\u0010#R\u0014\u0010\u007f\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b~\u0010#R\u0016\u0010\u0081\u0001\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010#R\u0016\u0010\u0083\u0001\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010#¨\u0006\u0084\u0001"}, d2 = {"Lcom/yandex/go/places/base/ui/modals/BasePlacesModalView;", "Lzo31;", "T", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Landroid/content/Context;", "context", "Lfz20;", "modalMode", "Lc2x0;", "systemBarsCoordinator", "Lh75;", "presenter", "<init>", "(Landroid/content/Context;Lfz20;Lc2x0;Lh75;)V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "", "newState", "Lzy11;", "onBottomSheetStateChanged", "(I)V", "", "canHandleScreenTracking", "()Z", "canDragToExpandFromAnchored", "onSlideOut", "()V", "Le230;", "insetsType", "()Le230;", "getTopPadding", "()I", "isApplyShadow", "updateCurrentBackground", "getMaxAnchoredHeight", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onAppearAnimationComplete", ClidProvider.STATE, "getBottomSheetBackgroundColor", "(I)I", "shouldShowExpandedTopScrim", "refreshExpandedTopScrim", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "onInitialBehaviorStateSet", "bottomSheet", "", "slideOffset", "onBottomSheetSlide", "(Landroid/view/View;F)V", "behavior", "configureBottomSheetBehavior", "setBottomSheetInitialColor", "Lez20;", "setSlideableMode", "(Lez20;)V", "setInitialSlideableBehaviorState", "(Lez20;Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "updateExpandedTopScrimForState", "updateExpandedTopScrimForSlide", "(F)V", "Lc2x0;", "Lh75;", "getPresenter", "()Lh75;", "Lkotlin/Function0;", "oneShotAppearAnimationCompleteListener", "Lsls;", "getOneShotAppearAnimationCompleteListener", "()Lsls;", "setOneShotAppearAnimationCompleteListener", "(Lsls;)V", "transparentColor$delegate", "Li3y;", "getTransparentColor", "transparentColor", "Lp7c0;", "expandedTopScrimController$delegate", "getExpandedTopScrimController", "()Lp7c0;", "expandedTopScrimController", "hasTopCorners", "Z", "Lwac0;", "currentScreenMapConfig", "Lwac0;", "getCurrentScreenMapConfig", "()Lwac0;", "slideableMode$delegate", "getSlideableMode", "()Lez20;", "slideableMode", "isSlideable$delegate", "isSlideable", "Lxr00;", "mapSettings$delegate", "getMapSettings$base", "()Lxr00;", "mapSettings", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState;", "initialRevealingState$delegate", "getInitialRevealingState", "()Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState;", "initialRevealingState", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "getExpandedTopScrimCornerRadius", "expandedTopScrimCornerRadius", "getExpandedTopScrimColor", "expandedTopScrimColor", "getExpandedBottomSheetColor", "expandedBottomSheetColor", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BasePlacesModalView<T extends zo31> extends SlideableBindingModalView<T> {
    private final wac0 currentScreenMapConfig;

    /* renamed from: expandedTopScrimController$delegate, reason: from kotlin metadata */
    private final i3y expandedTopScrimController;
    private final boolean hasTopCorners;

    /* renamed from: initialRevealingState$delegate, reason: from kotlin metadata */
    private final i3y initialRevealingState;

    /* renamed from: isSlideable$delegate, reason: from kotlin metadata */
    private final i3y isSlideable;

    /* renamed from: mapSettings$delegate, reason: from kotlin metadata */
    private final i3y mapSettings;
    private sls oneShotAppearAnimationCompleteListener;
    private final h75 presenter;

    /* renamed from: slideableMode$delegate, reason: from kotlin metadata */
    private final i3y slideableMode;
    private final c2x0 systemBarsCoordinator;

    /* renamed from: transparentColor$delegate, reason: from kotlin metadata */
    private final i3y transparentColor;

    public BasePlacesModalView(Context context, fz20 fz20Var, c2x0 c2x0Var, h75 h75Var) {
        super(context, true);
        SlideableModalView.CardMode cardMode;
        this.systemBarsCoordinator = c2x0Var;
        this.presenter = h75Var;
        f75 f75Var = new f75(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.transparentColor = a.b(lazyThreadSafetyMode, f75Var);
        this.expandedTopScrimController = a.b(lazyThreadSafetyMode, new f75(this, 1));
        boolean z = fz20Var instanceof bz20;
        bz20 bz20Var = z ? (bz20) fz20Var : null;
        this.hasTopCorners = bz20Var != null && bz20Var.a;
        this.slideableMode = a.b(lazyThreadSafetyMode, new f02(28, fz20Var));
        this.isSlideable = a.b(lazyThreadSafetyMode, new f75(this, 2));
        this.mapSettings = a.b(lazyThreadSafetyMode, new f75(this, 3));
        this.initialRevealingState = a.b(lazyThreadSafetyMode, new f75(this, 4));
        manualInit();
        if (fz20Var instanceof ez20) {
            cardMode = SlideableModalView.CardMode.SLIDEABLE_CARD;
        } else {
            if (!z) {
                w511.b();
                throw null;
            }
            cardMode = SlideableModalView.CardMode.FULLSCREEN;
        }
        setCardMode(cardMode);
        getExpandedTopScrimController().b();
        getExpandedTopScrimController().a();
        updateExpandedTopScrimForState$default(this, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p7c0 expandedTopScrimController_delegate$lambda$0(BasePlacesModalView basePlacesModalView) {
        return new p7c0(basePlacesModalView, new f75(basePlacesModalView, 5), new f75(basePlacesModalView, 6));
    }

    private final p7c0 getExpandedTopScrimController() {
        return (p7c0) this.expandedTopScrimController.getValue();
    }

    private final PlacesMapConfig$RevealingState getInitialRevealingState() {
        return (PlacesMapConfig$RevealingState) this.initialRevealingState.getValue();
    }

    private final int getTransparentColor() {
        return ((Number) this.transparentColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlacesMapConfig$RevealingState initialRevealingState_delegate$lambda$0(BasePlacesModalView basePlacesModalView) {
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState;
        ez20 slideableMode = basePlacesModalView.getSlideableMode();
        if (slideableMode != null && (placesMapConfig$RevealingState = slideableMode.d) != null) {
            return placesMapConfig$RevealingState;
        }
        wac0 currentScreenMapConfig = basePlacesModalView.getCurrentScreenMapConfig();
        if (currentScreenMapConfig != null) {
            return currentScreenMapConfig.g;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSlideable_delegate$lambda$0(BasePlacesModalView basePlacesModalView) {
        return basePlacesModalView.getSlideableMode() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xr00 mapSettings_delegate$lambda$0(BasePlacesModalView basePlacesModalView) {
        ez20 slideableMode = basePlacesModalView.getSlideableMode();
        if (slideableMode != null) {
            return slideableMode.f;
        }
        return null;
    }

    private final void setBottomSheetInitialColor() {
        updateExpandedTopScrimForState$default(this, 0, 1, null);
        if (isSlideable()) {
            getBottomSheet().setBackgroundColor(getBottomSheetBackgroundColor(getBottomSheetBehavior().E));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [uy20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [uy20] */
    private final void setInitialSlideableBehaviorState(ez20 ez20Var, AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior) {
        Float f;
        Float f2;
        setBehaviorAnchorHeight(Integer.valueOf(ez20Var.a()));
        wac0 currentScreenMapConfig = getCurrentScreenMapConfig();
        xd7 xd7Var = ez20Var.g;
        if (!xd7Var.a) {
            ry20 ry20Var = (currentScreenMapConfig == null || (f2 = currentScreenMapConfig.d) == null) ? null : new ry20(f2.floatValue());
            ?? r0 = ez20Var.a;
            if (r0 != 0) {
                ry20Var = r0;
            }
            xd7Var.b = ry20Var != null ? Integer.valueOf(ry20Var.a()) : null;
            xd7Var.a = true;
        }
        Integer num = (Integer) xd7Var.b;
        wac0 currentScreenMapConfig2 = getCurrentScreenMapConfig();
        xd7 xd7Var2 = ez20Var.h;
        if (!xd7Var2.a) {
            sy20 sy20Var = (currentScreenMapConfig2 == null || (f = currentScreenMapConfig2.f) == null) ? null : new sy20(f.floatValue());
            ?? r1 = ez20Var.c;
            if (r1 != 0) {
                sy20Var = r1;
            }
            xd7Var2.b = sy20Var != null ? Integer.valueOf(sy20Var.a()) : null;
            xd7Var2.a = true;
        }
        anchorBottomSheetBehavior.O(lab1.f(num, (Integer) xd7Var2.b, ez20Var.a(), ez20Var.d));
        onInitialBehaviorStateSet(anchorBottomSheetBehavior.E);
        updateExpandedTopScrimForState(anchorBottomSheetBehavior.E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [uy20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [uy20] */
    private final void setSlideableMode(ez20 ez20Var) {
        Float f;
        Float f2;
        if (ez20Var.d == PlacesMapConfig$RevealingState.EXPANDED) {
            setArrowState(ArrowsView.State.GONE);
        } else {
            setArrowState(ArrowsView.State.PLAIN);
        }
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        wac0 currentScreenMapConfig = getCurrentScreenMapConfig();
        xd7 xd7Var = ez20Var.g;
        int i = 1;
        if (!xd7Var.a) {
            ry20 ry20Var = (currentScreenMapConfig == null || (f2 = currentScreenMapConfig.d) == null) ? null : new ry20(f2.floatValue());
            ?? r1 = ez20Var.a;
            if (r1 != 0) {
                ry20Var = r1;
            }
            xd7Var.b = ry20Var != null ? Integer.valueOf(ry20Var.a()) : null;
            xd7Var.a = true;
        }
        Integer num = (Integer) xd7Var.b;
        wac0 currentScreenMapConfig2 = getCurrentScreenMapConfig();
        xd7 xd7Var2 = ez20Var.h;
        if (!xd7Var2.a) {
            sy20 sy20Var = (currentScreenMapConfig2 == null || (f = currentScreenMapConfig2.f) == null) ? null : new sy20(f.floatValue());
            ?? r2 = ez20Var.c;
            if (r2 != 0) {
                sy20Var = r2;
            }
            xd7Var2.b = sy20Var != null ? Integer.valueOf(sy20Var.a()) : null;
            xd7Var2.a = true;
        }
        lab1.i(bottomSheetBehavior, num, (Integer) xd7Var2.b, ez20Var.a(), ez20Var.e);
        bottomSheetBehavior.J(true);
        bottomSheetBehavior.L(getCardContainer());
        configureBottomSheetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.N = new x55(this, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ez20 slideableMode_delegate$lambda$0(fz20 fz20Var) {
        if (fz20Var instanceof ez20) {
            return (ez20) fz20Var;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int transparentColor_delegate$lambda$0(BasePlacesModalView basePlacesModalView) {
        return c.a(mqg0.transparent, basePlacesModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateExpandedTopScrimForSlide(float slideOffset) {
        if (!getShouldShowExpandedTopScrim()) {
            getExpandedTopScrimController().e(0.0f);
        } else {
            getExpandedTopScrimController().e(convertToOffsetFromAnchored(slideOffset));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateExpandedTopScrimForState(int state) {
        if (getShouldShowExpandedTopScrim()) {
            getExpandedTopScrimController().f(state);
        } else {
            getExpandedTopScrimController().e(0.0f);
        }
    }

    public static void updateExpandedTopScrimForState$default(BasePlacesModalView basePlacesModalView, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: updateExpandedTopScrimForState");
            return;
        }
        if ((i2 & 1) != 0) {
            i = basePlacesModalView.getBottomSheetBehavior().E;
        }
        basePlacesModalView.updateExpandedTopScrimForState(i);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getExpandedTopScrimController().a();
        setBottomSheetInitialColor();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return isSlideable() ? mqg0.transparent : mqg0.black;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    public void configureBottomSheetBehavior(AnchorBottomSheetBehavior<View> behavior) {
    }

    public int getBottomSheetBackgroundColor(int state) {
        return (state == 3 || state == 7) ? getExpandedBottomSheetColor() : getTransparentColor();
    }

    public abstract View getCardContainer();

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(xtg0.discovery_base_container_corner_radius, getContext());
    }

    public wac0 getCurrentScreenMapConfig() {
        return this.currentScreenMapConfig;
    }

    public int getExpandedBottomSheetColor() {
        return qje.t(xng0.bgMain, getContext());
    }

    public int getExpandedTopScrimColor() {
        return qje.t(xng0.bgMain, getContext());
    }

    public int getExpandedTopScrimCornerRadius() {
        return getCornersRadius();
    }

    public final xr00 getMapSettings$base() {
        return (xr00) this.mapSettings.getValue();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        ez20 slideableMode = getSlideableMode();
        return (slideableMode != null ? slideableMode.a() : 0) + getCurrentInsets().g;
    }

    public final sls getOneShotAppearAnimationCompleteListener() {
        return this.oneShotAppearAnimationCompleteListener;
    }

    public h75 getPresenter() {
        return this.presenter;
    }

    public final ez20 getSlideableMode() {
        return (ez20) this.slideableMode.getValue();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return isSlideable();
    }

    public final boolean isSlideable() {
        return ((Boolean) this.isSlideable.getValue()).booleanValue();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        sls slsVar = this.oneShotAppearAnimationCompleteListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.oneShotAppearAnimationCompleteListener = null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((d2x0) this.systemBarsCoordinator).e(0, this);
        getExpandedTopScrimController().d(getCurrentInsets());
        updateExpandedTopScrimForState$default(this, 0, 1, null);
        setBottomSheetInitialColor();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        ez20 slideableMode = getSlideableMode();
        if (slideableMode != null) {
            setSlideableMode(slideableMode);
        }
    }

    public void onBottomSheetSlide(View bottomSheet, float slideOffset) {
        bottomSheet.setBackgroundColor(cma1.m(convertToOffsetFromAnchored(slideOffset), getExpandedBottomSheetColor()));
    }

    public abstract void onBottomSheetStateChanged(int newState);

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ((d2x0) this.systemBarsCoordinator).b(this);
        super.onDetachedFromWindow();
    }

    public void onInitialBehaviorStateSet(int state) {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        getExpandedTopScrimController().d(insets);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContainer(), event)) {
            return true;
        }
        if (isSlideable()) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    public final void refreshExpandedTopScrim() {
        updateExpandedTopScrimForState$default(this, 0, 1, null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public abstract String getModalScreenName();

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        int i;
        if (!isSlideable()) {
            i = 7;
        } else {
            if (getInitialRevealingState() != null) {
                ez20 slideableMode = getSlideableMode();
                if (slideableMode != null) {
                    setInitialSlideableBehaviorState(slideableMode, bottomSheetBehavior);
                    return;
                }
                return;
            }
            i = 6;
        }
        bottomSheetBehavior.O(i);
        onInitialBehaviorStateSet(i);
        updateExpandedTopScrimForState(i);
    }

    public final void setOneShotAppearAnimationCompleteListener(sls slsVar) {
        this.oneShotAppearAnimationCompleteListener = slsVar;
    }

    /* renamed from: shouldShowExpandedTopScrim */
    public boolean getShouldShowExpandedTopScrim() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateCurrentBackground() {
        if (getHasCustomBackgroundColor()) {
            return;
        }
        if (!this.hasTopCorners) {
            super.updateCurrentBackground();
            return;
        }
        cvw.g0(qje.t(getFullscreenBackgroundAttrRes(), getContext()), getCornersRadius(), getBottomSheet());
        getBottomSheet().getLayoutParams().height = -1;
    }
}
