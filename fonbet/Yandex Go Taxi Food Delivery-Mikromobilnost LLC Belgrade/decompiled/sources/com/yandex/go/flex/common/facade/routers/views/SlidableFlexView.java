package com.yandex.go.flex.common.facade.routers.views;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.flex.common.api.ui.theme.DivKitThemedFrameLayout;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.cos0;
import defpackage.czo0;
import defpackage.dos0;
import defpackage.e230;
import defpackage.e2x0;
import defpackage.eos0;
import defpackage.fos0;
import defpackage.g18;
import defpackage.gas0;
import defpackage.gjp0;
import defpackage.hbp0;
import defpackage.i2y;
import defpackage.i3y;
import defpackage.kth0;
import defpackage.mih0;
import defpackage.mmp0;
import defpackage.mqg0;
import defpackage.msb1;
import defpackage.n751;
import defpackage.nch0;
import defpackage.ny61;
import defpackage.ons0;
import defpackage.op31;
import defpackage.phr;
import defpackage.pns0;
import defpackage.qgn0;
import defpackage.qhr;
import defpackage.qns0;
import defpackage.qoi0;
import defpackage.quq0;
import defpackage.sls;
import defpackage.szl;
import defpackage.t1w;
import defpackage.tpr;
import defpackage.u1w;
import defpackage.w130;
import defpackage.w511;
import defpackage.xhr;
import defpackage.y6i0;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001j\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001eH\u0014¢\u0006\u0004\b*\u0010 J\u000f\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001eH\u0014¢\u0006\u0004\b.\u0010 J\u0017\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001aH\u0014¢\u0006\u0004\b3\u0010\u001cJ\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u001eH\u0014¢\u0006\u0004\b5\u0010%J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010\u0019J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J!\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u001a2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b>\u0010?J!\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u001a2\u0006\u00108\u001a\u000209H\u0002¢\u0006\u0004\b>\u0010@J\u000f\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bA\u0010\u0019J\u000f\u0010B\u001a\u00020\u001aH\u0002¢\u0006\u0004\bB\u0010\u001cJ\u001d\u0010E\u001a\u00020\u000e2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e0CH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u001eH\u0002¢\u0006\u0004\bH\u0010%J\u0011\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bJ\u0010KJ\u001b\u0010O\u001a\u00020N*\u00020I2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000eH\u0002¢\u0006\u0004\bQ\u0010\u0019J\u0017\u0010S\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020\u001eH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010X\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020\u001aH\u0002¢\u0006\u0004\bX\u0010YR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ZR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010[R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\\R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010]R\u0016\u0010^\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010 ¨\u0006q"}, d2 = {"Lcom/yandex/go/flex/common/facade/routers/views/SlidableFlexView;", "Lcom/yandex/go/flex/common/facade/routers/views/GenericFlexModalView;", "Li2y;", "Lnwy0;", "Lrkr;", "Landroid/content/Context;", "context", "Lqhr;", "flexConfig", "Lxhr;", "flexController", "Le2x0;", "systemBarsHoldersRepository", "Lkotlin/Function0;", "Lzy11;", "onDetachCallback", "<init>", "(Landroid/content/Context;Lqhr;Lxhr;Le2x0;Lsls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li2y;", "onAttachedToWindow", "()V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "anchoredHeight", "", "isArrowsPermanentlyHidden", "()Z", "onDetachedFromWindow", "onBackPressed", "isBackPressedEnabled", "changeBackPressedState", "(Z)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "hasCustomBackground", "Le230;", "insetsType", "()Le230;", "canDragToExpandFromAnchored", "", "newOffset", "convertToOffsetFromAnchored", "(F)F", "getMaxAnchoredHeight", "settle", "updateAnchoredHeight", "onContentUpdated", "Lt1w;", "insets", "Ldos0;", "collectInsets", "(Lt1w;)Ldos0;", "recyclerHeight", "Lcos0;", "geometryInput", "(Ljava/lang/Integer;Lt1w;)Lcos0;", "(Ljava/lang/Integer;Ldos0;)Lcos0;", "updateCardBottomPaddingForCurrentState", "navigationBarHeightFromResources", "Ltpr;", "isLightFlow", "setupStatusBar", "(Ltpr;)V", "isLight", "changeTheme", "Landroidx/recyclerview/widget/RecyclerView;", "flexRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Lg18;", "listenSizeCancellable", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View$OnLayoutChangeListener;)Lg18;", "addCloseButton", "isButtonPositionStart", "getGravity", "(Z)I", "Lphr;", "fab", "gravity", "attachFab", "(Lphr;I)V", "Lqhr;", "Lxhr;", "Le2x0;", "Lsls;", "backPressedEnabled", "Z", "Lhbp0;", "scopeDelegate", "Lhbp0;", "anchorModalRatio", "F", "recyclerSizeCancellable", "Lg18;", "Leos0;", "sheetGeometryCalculator", "Leos0;", "qns0", "documentTracker$delegate", "Li3y;", "getDocumentTracker", "()Lqns0;", "documentTracker", "isExpandedState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SlidableFlexView extends GenericFlexModalView<i2y> {
    private float anchorModalRatio;
    private boolean backPressedEnabled;

    /* renamed from: documentTracker$delegate, reason: from kotlin metadata */
    private final i3y documentTracker;
    private final qhr flexConfig;
    private final xhr flexController;
    private final sls onDetachCallback;
    private g18 recyclerSizeCancellable;
    private final hbp0 scopeDelegate;
    private final eos0 sheetGeometryCalculator;
    private final e2x0 systemBarsHoldersRepository;

    /* JADX WARN: Multi-variable type inference failed */
    public SlidableFlexView(Context context, qhr qhrVar, xhr xhrVar, e2x0 e2x0Var, sls slsVar) {
        super(context, qhrVar, xhrVar);
        this.flexConfig = qhrVar;
        this.flexController = xhrVar;
        this.systemBarsHoldersRepository = e2x0Var;
        this.onDetachCallback = slsVar;
        this.backPressedEnabled = true;
        this.scopeDelegate = new hbp0(new czo0(14), "SlidableFlexView", null);
        qhrVar.getClass();
        this.anchorModalRatio = 1.0f;
        this.sheetGeometryCalculator = new fos0();
        this.documentTracker = a.b(LazyThreadSafetyMode.NONE, new gas0(5, this));
        manualInit();
        if (!qhrVar.l) {
            setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        }
        if (qhrVar.k) {
            setClickable(false);
            setFocusableInTouchMode(false);
        }
        if (qhrVar.h) {
            ((i2y) getBinding()).c.setVisibility(0);
        }
        Integer num = qhrVar.i;
        if (num != null) {
            int intValue = num.intValue();
            ViewGroup bottomSheet = getBottomSheet();
            bottomSheet.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(intValue));
            bottomSheet.setClipToOutline(true);
        }
    }

    private final void addCloseButton() {
        this.flexConfig.getClass();
        msb1 msb1Var = msb1.H;
    }

    private final void attachFab(phr fab, int gravity) {
        fab.getClass();
        new mmp0(this, fab);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachFab$lambda$0(SlidableFlexView slidableFlexView, phr phrVar) {
        phrVar.getClass();
        slidableFlexView.handleAction(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeTheme(boolean isLight) {
        if (isLight) {
            setBackgroundColor(-1);
        } else {
            if (isLight) {
                w511.b();
                return;
            }
            setBackgroundColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        }
        this.systemBarsHoldersRepository.a(0, qoi0.a(SlidableFlexView.class), isLight);
    }

    private final dos0 collectInsets(t1w insets) {
        u1w h;
        u1w h2;
        WeakHashMap weakHashMap = b.a;
        n751 a = op31.a(this);
        int i = 0;
        int i2 = (a == null || (h2 = a.a.h(519)) == null) ? 0 : h2.d;
        if (a != null && (h = a.a.h(2)) != null) {
            i = h.d;
        }
        return new dos0(insets.d, i2, i, navigationBarHeightFromResources(), insets.g, insets.b, insets.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qns0 documentTracker_delegate$lambda$0(SlidableFlexView slidableFlexView) {
        return new qns0(slidableFlexView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView flexRecyclerView() {
        return (RecyclerView) getCardContentView().findViewById(nch0.flexsdk_recycler_view_id);
    }

    private final cos0 geometryInput(Integer recyclerHeight, dos0 insets) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return new cos0(insets, getContent().getHeight(), getCardContentView().getHeight(), recyclerHeight, this.flexConfig.m, getCanDragToExpandedState(), displayMetrics.heightPixels, displayMetrics.density, this.anchorModalRatio, getBottomSheet().getHeight());
    }

    private final qns0 getDocumentTracker() {
        return (qns0) this.documentTracker.getValue();
    }

    private final int getGravity(boolean isButtonPositionStart) {
        return isButtonPositionStart ? 8388611 : 8388613;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(SlidableFlexView slidableFlexView, t1w t1wVar) {
        RecyclerView flexRecyclerView = slidableFlexView.flexRecyclerView();
        cos0 geometryInput = slidableFlexView.geometryInput(flexRecyclerView != null ? Integer.valueOf(flexRecyclerView.getHeight()) : null, t1wVar);
        int a = ((fos0) slidableFlexView.sheetGeometryCalculator).a(geometryInput, false);
        slidableFlexView.setPadding(slidableFlexView.getPaddingLeft(), t1wVar.b, slidableFlexView.getPaddingRight(), slidableFlexView.getPaddingBottom());
        View cardContentView = slidableFlexView.getCardContentView();
        cardContentView.setPadding(cardContentView.getPaddingLeft(), cardContentView.getPaddingTop(), cardContentView.getPaddingRight(), a);
        if (geometryInput.b > 0) {
            slidableFlexView.getBottomSheetBehavior().K(((fos0) slidableFlexView.sheetGeometryCalculator).c(geometryInput), true);
        }
        return zy11.a;
    }

    private final boolean isExpandedState() {
        int i = getBottomSheetBehavior().E;
        return i == 3 || i == 7;
    }

    private final g18 listenSizeCancellable(RecyclerView recyclerView, View.OnLayoutChangeListener onLayoutChangeListener) {
        recyclerView.addOnLayoutChangeListener(onLayoutChangeListener);
        return new pns0(recyclerView, onLayoutChangeListener, 0);
    }

    private final int navigationBarHeightFromResources() {
        int identifier = getResources().getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier <= 0) {
            return 0;
        }
        return getResources().getDimensionPixelSize(identifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContentUpdated() {
        updateCardBottomPaddingForCurrentState();
        this.flexConfig.getClass();
        RecyclerView flexRecyclerView = flexRecyclerView();
        if (flexRecyclerView == null) {
            return;
        }
        flexRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        getBottomSheetBehavior().L(flexRecyclerView);
        if (this.recyclerSizeCancellable != null) {
            return;
        }
        this.recyclerSizeCancellable = listenSizeCancellable(flexRecyclerView, new ons0(0, this));
        int height = flexRecyclerView.getHeight();
        if (height > 0) {
            getBottomSheetBehavior().K(((fos0) this.sheetGeometryCalculator).c(geometryInput(Integer.valueOf(height), getCurrentInsets())), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContentUpdated$lambda$1(SlidableFlexView slidableFlexView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i8 - i6 != i9) {
            slidableFlexView.getBottomSheetBehavior().K(((fos0) slidableFlexView.sheetGeometryCalculator).c(slidableFlexView.geometryInput(Integer.valueOf(i9), slidableFlexView.getCurrentInsets())), true);
        }
    }

    private final void setupStatusBar(tpr isLightFlow) {
        hbp0.e(this.scopeDelegate, null, null, new SlidableFlexView$setupStatusBar$1(isLightFlow, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCardBottomPaddingForCurrentState() {
        RecyclerView flexRecyclerView = flexRecyclerView();
        cos0 geometryInput = geometryInput(flexRecyclerView != null ? Integer.valueOf(flexRecyclerView.getHeight()) : null, getCurrentInsets());
        eos0 eos0Var = this.sheetGeometryCalculator;
        int a = ((fos0) eos0Var).a(geometryInput, ((fos0) eos0Var).f(geometryInput));
        if (getCardContentView().getPaddingBottom() != a) {
            View cardContentView = getCardContentView();
            cardContentView.setPadding(cardContentView.getPaddingLeft(), cardContentView.getPaddingTop(), cardContentView.getPaddingRight(), a);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int anchoredHeight() {
        int height = getContent().getHeight();
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        return height - bottomSheetBehavior.w[getBottomSheetBehavior().x];
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        Integer num = this.flexConfig.e;
        return num != null ? num.intValue() : mqg0.component_black_opacity_45;
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public i2y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(kth0.layout_slidable_flex_content, parent, false);
        parent.addView(inflate);
        int i = mih0.flex_container;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
        if (goFrameLayout != null) {
            i = mih0.fullscreen_view;
            GoView goView = (GoView) cma1.O(i, inflate);
            if (goView != null) {
                return new i2y((DivKitThemedFrameLayout) inflate, goFrameLayout, goView);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return this.flexConfig.d;
    }

    @Override // com.yandex.go.flex.common.facade.routers.views.GenericFlexModalView
    public void changeBackPressedState(boolean isBackPressedEnabled) {
        this.backPressedEnabled = isBackPressedEnabled;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public float convertToOffsetFromAnchored(float newOffset) {
        if (getCanDragToExpandedState()) {
            float x = getBottomSheetBehavior().x();
            if (x > 0.0f) {
                return y6i0.c(newOffset / x, -1.0f, 1.0f);
            }
        }
        return newOffset;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        RecyclerView flexRecyclerView = flexRecyclerView();
        cos0 geometryInput = geometryInput(flexRecyclerView != null ? Integer.valueOf(flexRecyclerView.getHeight()) : null, getCurrentInsets());
        fos0 fos0Var = (fos0) this.sheetGeometryCalculator;
        fos0Var.getClass();
        Integer num = geometryInput.e;
        if (num == null) {
            return (int) (geometryInput.b * geometryInput.i);
        }
        int d = fos0.d(geometryInput.a) + num.intValue();
        if (geometryInput.f) {
            return d;
        }
        int i = fos0.e(geometryInput).b;
        if (fos0Var.f(geometryInput)) {
            i = Math.max(i, geometryInput.c);
        }
        return Math.max(i, d);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new quq0(13, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return this.flexConfig.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
        tpr tprVar = this.flexConfig.c;
        if (tprVar != null) {
            setupStatusBar(tprVar);
        }
        if (!this.flexConfig.j) {
            setOnTouchOutsideListener(null);
            setDismissOnTouchOutside(false);
        }
        ((com.yandex.go.flex.common.facade.b) this.flexController).a(getDocumentTracker());
        szl szlVar = this.flexConfig.a.h;
        if (szlVar != null) {
            ((com.yandex.go.flex.common.facade.b) this.flexController).a(szlVar);
        }
        ((com.yandex.go.flex.common.facade.b) this.flexController).b(((i2y) getBinding()).b, this);
        this.flexConfig.getClass();
        this.flexConfig.getClass();
        addCloseButton();
        setSlideListener(new qgn0(22, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        RecyclerView flexRecyclerView = flexRecyclerView();
        if (flexRecyclerView == null) {
            super.onBackPressed();
            return;
        }
        boolean canScrollVertically = flexRecyclerView.canScrollVertically(-1);
        boolean z = true;
        boolean canScrollVertically2 = flexRecyclerView.canScrollVertically(1);
        if (!canScrollVertically && !canScrollVertically2) {
            z = false;
        }
        if (isExpandedState() && canScrollVertically) {
            xhr xhrVar = this.flexController;
            ((com.yandex.go.flex.common.facade.b) xhrVar).a.k(new gjp0(Boolean.TRUE));
        } else if (isExpandedState() && z) {
            getBottomSheetBehavior().O(6);
        } else {
            super.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scopeDelegate.b();
        ((com.yandex.go.flex.common.facade.b) this.flexController).d();
        ((com.yandex.go.flex.common.facade.b) this.flexController).c();
        szl szlVar = this.flexConfig.a.h;
        if (szlVar != null) {
            ((com.yandex.go.flex.common.facade.b) this.flexController).e(szlVar);
        }
        ((com.yandex.go.flex.common.facade.b) this.flexController).e(getDocumentTracker());
        this.onDetachCallback.invoke();
        g18 g18Var = this.recyclerSizeCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.recyclerSizeCancellable = null;
        if (this.flexConfig.c != null) {
            this.systemBarsHoldersRepository.b(qoi0.a(SlidableFlexView.class));
        }
        setSlideListener(null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateAnchoredHeight(boolean settle) {
        super.updateAnchoredHeight(settle);
        if (this.flexConfig.m != null) {
            RecyclerView flexRecyclerView = flexRecyclerView();
            cos0 geometryInput = geometryInput(flexRecyclerView != null ? Integer.valueOf(flexRecyclerView.getHeight()) : null, getCurrentInsets());
            int height = getContent().getHeight() - getMaxAnchoredHeight();
            fos0 fos0Var = (fos0) this.sheetGeometryCalculator;
            fos0Var.getClass();
            if (geometryInput.e != null && fos0Var.f(geometryInput)) {
                int b = (geometryInput.b - fos0Var.b(geometryInput)) - geometryInput.c;
                int i = (int) geometryInput.h;
                if (i < 1) {
                    i = 1;
                }
                int i2 = b - i;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (height > i2) {
                    height = i2;
                }
            }
            AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
            if (height != bottomSheetBehavior.w(bottomSheetBehavior.x)) {
                getBottomSheetBehavior().I(0, settle && behaviourFinalState() == 6, height);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cos0 geometryInput(Integer recyclerHeight, t1w insets) {
        return geometryInput(recyclerHeight, collectInsets(insets));
    }
}
