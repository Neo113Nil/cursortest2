package com.ybsdk.core.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b;
import com.ybsdk.core.design.coordinator.AnchorBottomSheetBehavior;
import com.ybsdk.core.design.theme.ThemeType;
import com.ybsdk.core.design.widget.views.SlideableShadowView;
import defpackage.b62;
import defpackage.bh11;
import defpackage.d82;
import defpackage.dk1;
import defpackage.kah0;
import defpackage.kp50;
import defpackage.krb1;
import defpackage.los0;
import defpackage.lu31;
import defpackage.np31;
import defpackage.oo31;
import defpackage.qgn0;
import defpackage.rje;
import defpackage.s52;
import defpackage.smh0;
import defpackage.u52;
import defpackage.ung0;
import defpackage.vvg0;
import defpackage.wor0;
import defpackage.ykn0;
import defpackage.z52;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class SlideableModalView extends ModalView<SlidableCoordinatorLayout> {
    public static final int STATE_NOT_DEFINED = -1;
    private final int additionalHitAreaSize;
    private final s52 anchorAnimationListenerCallback;
    private final View backgroundClickReceiver;
    private final ViewGroup bottomSheet;
    private final ViewGroup bottomSheetBackground;
    protected final AnchorBottomSheetBehavior<View> bottomSheetBehavior;
    private final u52 bottomSheetBehaviorCallback;
    private final ViewGroup cardContentContainer;
    private final View.OnLayoutChangeListener cardContentLayoutListener;
    protected final View cardContentView;
    private CardMode cardMode;
    private float defaultCardScaleX;
    private final int floatButtonOffset;
    private final int initialState;
    private boolean isBottomSheetBackgroundVisible;
    private Integer maxAnchoredHeight;
    private Runnable onSlideOutListener;
    public final SlidableCoordinatorLayout root;
    private los0 slideListener;
    private lu31 viewScalier;

    public enum CardMode {
        SLIDEABLE_CARD,
        FIXED_CARD,
        FULLSCREEN
    }

    public SlideableModalView(View view, int i) {
        super(view.getContext());
        inflate(smh0.ybsdk_slideable_modal_view);
        this.root = (SlidableCoordinatorLayout) findViewById(kah0.ybsdk_slideable_modal_view_root);
        ViewGroup viewGroup = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_bottom_sheet);
        this.bottomSheet = viewGroup;
        this.bottomSheetBackground = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_bottom_sheet_background);
        this.bottomSheetBehavior = AnchorBottomSheetBehavior.x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_card_content_container);
        this.cardContentContainer = viewGroup2;
        this.backgroundClickReceiver = findViewById(kah0.ybsdk_slideable_background_click_receiver);
        this.additionalHitAreaSize = dimen(vvg0.ybsdk_mu_1);
        this.floatButtonOffset = dimen(vvg0.ybsdk_mu_1_5);
        this.cardMode = CardMode.SLIDEABLE_CARD;
        this.defaultCardScaleX = 1.0f;
        this.cardContentLayoutListener = new View.OnLayoutChangeListener() { // from class: com.ybsdk.core.design.widget.SlideableModalView.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (SlideableModalView.this.cardMode != CardMode.FULLSCREEN) {
                    SlideableModalView slideableModalView = SlideableModalView.this;
                    slideableModalView.updateAnchoredHeight(slideableModalView.settlingLayoutChanges());
                }
            }
        };
        this.onSlideOutListener = new d82(1);
        this.anchorAnimationListenerCallback = new wor0(this);
        this.bottomSheetBehaviorCallback = new qgn0(23, this);
        this.isBottomSheetBackgroundVisible = true;
        this.cardContentView = view;
        viewGroup2.addView(view);
        this.initialState = i;
        init();
    }

    private float getBackgroundScaleCompensation() {
        if (getSlideableBackgroundOffset() == 0) {
            return 1.0f;
        }
        float width = getWidth();
        return width / (width - (r0 * 2));
    }

    private void init() {
        setCardMode(CardMode.SLIDEABLE_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$getPreDrawListener$0(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        setInitialBehaviorState(this.bottomSheetBehavior);
        return onPreDrawListener.onPreDraw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCollapsedStateInternal() {
        WeakHashMap weakHashMap = b.a;
        np31.c(this);
    }

    private void setBottomSheetScaleX(float f) {
        float backgroundScaleCompensation = getBackgroundScaleCompensation();
        if (Float.compare(this.defaultCardScaleX, 1.0f) == 0 && Float.compare(backgroundScaleCompensation, 1.0f) == 0) {
            return;
        }
        float f2 = this.defaultCardScaleX;
        getBottomSheet().setScaleX((((1.0f - f2) * f) + f2) * backgroundScaleCompensation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBottomSheetBackground() {
        this.bottomSheetBackground.setVisibility(this.isBottomSheetBackgroundVisible ? 0 : 4);
        ViewGroup.LayoutParams layoutParams = this.bottomSheetBackground.getLayoutParams();
        int y = (int) this.bottomSheet.getY();
        if (y == 0) {
            layoutParams.height = this.bottomSheet.getHeight() / 2;
        } else {
            layoutParams.height = (this.root.getBottom() - y) / 2;
        }
        this.bottomSheetBackground.setLayoutParams(layoutParams);
        this.backgroundClickReceiver.getLayoutParams().height = this.root.getHeight() - this.cardContentContainer.getHeight();
    }

    private void updateCurrentBackground() {
        if (hasCustomBackground()) {
            return;
        }
        CardMode cardMode = this.cardMode;
        CardMode cardMode2 = CardMode.FULLSCREEN;
        ViewGroup viewGroup = this.bottomSheet;
        if (cardMode == cardMode2) {
            Context context = getContext();
            int fullscreenBackgroundAttrRes = getFullscreenBackgroundAttrRes();
            Resources.Theme theme = context.getTheme();
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(fullscreenBackgroundAttrRes, typedValue, true);
            krb1.e(typedValue.data, 0, viewGroup);
            this.bottomSheet.getLayoutParams().height = -1;
        } else {
            Context context2 = getContext();
            int slideableBackgroundAttrRes = getSlideableBackgroundAttrRes();
            Resources.Theme theme2 = context2.getTheme();
            TypedValue typedValue2 = new TypedValue();
            theme2.resolveAttribute(slideableBackgroundAttrRes, typedValue2, true);
            krb1.e(typedValue2.data, getCornerRadius(), viewGroup);
            this.bottomSheet.getLayoutParams().height = -2;
        }
        ViewGroup viewGroup2 = this.bottomSheetBackground;
        Context context3 = getContext();
        int fullscreenBackgroundAttrRes2 = getFullscreenBackgroundAttrRes();
        Resources.Theme theme3 = context3.getTheme();
        TypedValue typedValue3 = new TypedValue();
        theme3.resolveAttribute(fullscreenBackgroundAttrRes2, typedValue3, true);
        krb1.e(typedValue3.data, getCornerRadius(), viewGroup2);
    }

    public void addViewAboveCard(View view, int i) {
        ViewParent parent = view.getParent();
        SlidableCoordinatorLayout slidableCoordinatorLayout = this.root;
        if (parent == null) {
            slidableCoordinatorLayout.addView(view);
        } else if (parent != slidableCoordinatorLayout) {
            ((ViewGroup) parent).removeView(view);
            this.root.addView(view);
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setAnchorId(kah0.ybsdk_slideable_modal_view_bottom_sheet);
        layoutParams.anchorGravity = i;
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public /* bridge */ /* synthetic */ boolean allowTraverse() {
        return true;
    }

    public void anchor() {
        if (this.cardMode != CardMode.SLIDEABLE_CARD) {
            return;
        }
        this.bottomSheetBehavior.F(6);
    }

    public int anchoredHeight() {
        int height = this.root.getHeight();
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        return height - anchorBottomSheetBehavior.y[anchorBottomSheetBehavior.z];
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        updateCurrentBackground();
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public /* bridge */ /* synthetic */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // com.ybsdk.core.design.widget.ModalView, defpackage.lv31
    public View asView() {
        return this;
    }

    public int behaviourFinalState() {
        b62 b62Var;
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        z52 z52Var = anchorBottomSheetBehavior.Q;
        if (z52Var != null) {
            return z52Var.b;
        }
        int i = anchorBottomSheetBehavior.E;
        return (i != 2 || (b62Var = anchorBottomSheetBehavior.Z) == null) ? i : b62Var.b;
    }

    public int behaviourState() {
        return this.bottomSheetBehavior.E;
    }

    public boolean canDragToExpandFromAnchored() {
        return false;
    }

    public void collapse() {
        if (this.cardMode != CardMode.SLIDEABLE_CARD) {
            return;
        }
        this.bottomSheetBehavior.F(4);
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public int color(int i) {
        return asView().getContext().getColor(i);
    }

    public float convertToOffsetFromAnchored(float f) {
        if (!canDragToExpandFromAnchored()) {
            return f;
        }
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        int i = anchorBottomSheetBehavior.B - anchorBottomSheetBehavior.A;
        float f2 = i <= 0 ? 0.0f : (r0 - anchorBottomSheetBehavior.y[anchorBottomSheetBehavior.z]) / i;
        return Math.max((f - f2) / (1.0f - f2), 0.0f);
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public int dimen(int i) {
        return rje.d(i, asView().getContext());
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void dismissWithAction(Runnable runnable) {
        if (isCollapsed()) {
            dismissInternalWithoutAnimation();
        } else {
            super.dismissWithAction(runnable);
        }
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public float dpToPx(float f) {
        return kp50.q(f);
    }

    public void expand() {
        CardMode cardMode = this.cardMode;
        CardMode cardMode2 = CardMode.SLIDEABLE_CARD;
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        if (cardMode != cardMode2) {
            anchorBottomSheetBehavior.F(7);
        } else {
            anchorBottomSheetBehavior.F(3);
        }
    }

    public ViewGroup getBottomSheet() {
        return this.bottomSheet;
    }

    public ViewGroup getCardContentContainer() {
        return this.cardContentContainer;
    }

    public final View getCardContentView() {
        return this.cardContentView;
    }

    public abstract int getCardContentViewLayoutRes();

    public CardMode getCardMode() {
        return this.cardMode;
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public int getContentHeight() {
        return getCardContentView().getHeight();
    }

    public int getCornerRadius() {
        return dimen(vvg0.ybsdk_modal_view_corner_radius);
    }

    public int getFloatButtonBackgroundOffset() {
        return dimen(vvg0.ybsdk_component_float_button_icon_shadow_compensation);
    }

    public int getFullscreenBackgroundAttrRes() {
        return ung0.ybColor_background_primary;
    }

    public int getMaxAnchoredHeight() {
        Integer num = this.maxAnchoredHeight;
        return num != null ? num.intValue() : this.root.getHeight();
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
        return new dk1(this, super.getPreDrawListener(), 2);
    }

    public float getSlideOffset() {
        View view;
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        WeakReference weakReference = anchorBottomSheetBehavior.J;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return 0.0f;
        }
        return anchorBottomSheetBehavior.y(view.getTop());
    }

    public int getSlideableBackgroundAttrRes() {
        return ung0.ybColor_internal_transparent;
    }

    public int getSlideableBackgroundOffset() {
        return 0;
    }

    public float getSpringDampingRatio() {
        return (float) this.bottomSheetBehavior.b.u.b;
    }

    public float getSpringStiffness() {
        double d = this.bottomSheetBehavior.b.u.a;
        return (float) (d * d);
    }

    public int getTopOffset() {
        return 0;
    }

    public int getTopPadding() {
        return getResources().getDimensionPixelOffset(vvg0.ybsdk_mu_3);
    }

    public boolean getUseSpringSettling() {
        return this.bottomSheetBehavior.a0;
    }

    public boolean hasCustomBackground() {
        return false;
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public View inflate(int i) {
        ViewGroup viewGroup = (ViewGroup) asView();
        return oo31.f(viewGroup, i, viewGroup, true);
    }

    public View inflateCardContent() {
        ViewGroup viewGroup = this.cardContentContainer;
        return oo31.f(viewGroup, getCardContentViewLayoutRes(), viewGroup, true);
    }

    public void initBehavior(AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior) {
        anchorBottomSheetBehavior.C = false;
        anchorBottomSheetBehavior.D(0, false);
        int[] iArr = {0};
        iArr[0] = Math.max(anchorBottomSheetBehavior.A, 0);
        anchorBottomSheetBehavior.B(0, false, iArr);
        anchorBottomSheetBehavior.S = canDragToExpandFromAnchored();
        anchorBottomSheetBehavior.L = this.bottomSheetBehaviorCallback;
    }

    public boolean isAnchored() {
        return this.bottomSheetBehavior.E == 6;
    }

    public Boolean isClickWithinVerticalContent(Float f) {
        return Boolean.valueOf(this.bottomSheet.getY() > f.floatValue());
    }

    public boolean isCollapsed() {
        return this.bottomSheetBehavior.E == 4;
    }

    public boolean isExpanded() {
        int behaviourState = behaviourState();
        return (behaviourState == 6 && !canDragToExpandFromAnchored()) || behaviourState == 3 || behaviourState == 7;
    }

    @Override // com.ybsdk.core.design.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initBehavior(this.bottomSheetBehavior);
        this.bottomSheetBehavior.C(this.cardContentView);
        this.cardContentView.addOnLayoutChangeListener(this.cardContentLayoutListener);
        this.bottomSheetBehavior.V = this.anchorAnimationListenerCallback;
    }

    public void onBehaviorStateChanged(int i, boolean z) {
        if (i == 4 && isEnabled()) {
            onSlideOut();
        } else if ((i == 3 || i == 6) && this.cardMode != CardMode.SLIDEABLE_CARD) {
            setBehaviorState(7);
        }
        updateUserInteractionBlockingOutside();
    }

    @Override // com.ybsdk.core.design.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakHashMap weakHashMap = b.a;
        np31.c(this);
        this.cardContentView.removeOnLayoutChangeListener(this.cardContentLayoutListener);
    }

    public void onDialogSlide(float f) {
        float convertToOffsetFromAnchored = convertToOffsetFromAnchored(f);
        setBackgroundDimColor(convertToOffsetFromAnchored);
        setBottomSheetScaleX(convertToOffsetFromAnchored);
    }

    public void onKeyboardClosed() {
        if (isCollapsed()) {
            return;
        }
        requestFocus();
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void onModalViewAppear(int i) {
        super.onModalViewAppear(i);
        setBottomSheetScaleX(0.0f);
    }

    public void onSlideOut() {
        this.bottomSheetBackground.setVisibility(8);
        onDismissManually();
        dismissInternalWithoutAnimation();
        this.onSlideOutListener.run();
    }

    public int peekHeight() {
        return this.bottomSheetBehavior.c;
    }

    public void refreshNestedScrollView(View view) {
        this.bottomSheetBehavior.C(view);
    }

    public void setBackgroundDimColor(float f) {
        int color = getContext().getColor(backgroundColor());
        setBackgroundColor(Color.argb((int) (Math.max(0.0f, f) * Color.alpha(color)), Color.red(color), Color.green(color), Color.blue(color)));
    }

    public final void setBehaviorAnchorHeight(int i) {
        this.maxAnchoredHeight = Integer.valueOf(i);
        updateAnchoredHeight(true);
    }

    public final void setBehaviorPeekHeight(int i) {
        this.bottomSheetBehavior.D(i, true);
    }

    public final void setBehaviorState(int i) {
        this.bottomSheetBehavior.F(i);
    }

    public void setBottomSheetBackgroundVisible(boolean z) {
        this.isBottomSheetBackgroundVisible = z;
        updateBottomSheetBackground();
    }

    public void setCardMode(CardMode cardMode) {
        this.cardMode = cardMode;
        boolean z = cardMode == CardMode.FULLSCREEN;
        boolean z2 = cardMode == CardMode.SLIDEABLE_CARD;
        setPadding(0, z ? 0 : getTopPadding(), 0, 0);
        updateCurrentBackground();
        setInitialBehaviorState(this.bottomSheetBehavior);
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        if (z) {
            anchorBottomSheetBehavior.L = null;
        } else {
            anchorBottomSheetBehavior.L = this.bottomSheetBehaviorCallback;
        }
        setDismissOnTouchOutside(z2);
    }

    public void setDefaultHorizontalScaleX(float f) {
        if (Float.compare(f, this.defaultCardScaleX) == 0) {
            return;
        }
        this.defaultCardScaleX = f;
        if (behaviourState() == 4) {
            setBottomSheetScaleX(0.0f);
        }
    }

    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior) {
        int i = this.initialState;
        if (i != -1) {
            anchorBottomSheetBehavior.F(i);
        } else if (this.cardMode != CardMode.SLIDEABLE_CARD) {
            anchorBottomSheetBehavior.F(7);
        } else {
            anchorBottomSheetBehavior.F(6);
        }
        updateUserInteractionBlockingOutside();
    }

    public void setOnBackgroundClickListener(View.OnClickListener onClickListener) {
        View view = this.backgroundClickReceiver;
        if (onClickListener == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
        this.backgroundClickReceiver.setOnClickListener(onClickListener);
    }

    public void setOnSlideOutListener(Runnable runnable) {
        this.onSlideOutListener = runnable;
    }

    public void setShadowTint(ColorStateList colorStateList) {
        View childAt = this.root.getChildAt(0);
        if (childAt == null || !(childAt instanceof SlideableShadowView)) {
            return;
        }
        childAt.setBackgroundTintList(colorStateList);
    }

    public void setSlideListener(los0 los0Var) {
    }

    public void setSpringDampingRatio(float f) {
        this.bottomSheetBehavior.b.u.a(f);
    }

    public void setSpringStiffness(float f) {
        this.bottomSheetBehavior.b.u.b(f);
    }

    public void setUseOvershootSettling(boolean z, int i) {
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        anchorBottomSheetBehavior.b0 = z;
        anchorBottomSheetBehavior.c0 = i;
        anchorBottomSheetBehavior.a0 = false;
    }

    public void setUseSpringSettling(boolean z) {
        this.bottomSheetBehavior.a0 = z;
    }

    public boolean settlingLayoutChanges() {
        return true;
    }

    public void showShadow(Boolean bool) {
        SlideableShadowView slideableShadowView = new SlideableShadowView(getContext(), kah0.ybsdk_slideable_modal_view_bottom_sheet, new ykn0(14, this));
        boolean booleanValue = bool.booleanValue();
        SlidableCoordinatorLayout slidableCoordinatorLayout = this.root;
        if (!booleanValue) {
            slidableCoordinatorLayout.removeView(slideableShadowView);
        } else {
            slidableCoordinatorLayout.addView(slideableShadowView, 0);
            setImportantForAccessibility(2);
        }
    }

    public void startProgress() {
        if (this.viewScalier != null) {
            return;
        }
        SlidableCoordinatorLayout contentView = contentView();
        lu31 lu31Var = new lu31(contentView);
        this.viewScalier = lu31Var;
        lu31Var.a();
        lu31Var.c = true;
        contentView.post(new bh11(26, lu31Var));
    }

    public void stopProgress() {
        lu31 lu31Var = this.viewScalier;
        if (lu31Var != null) {
            lu31Var.a();
        }
        this.viewScalier = null;
    }

    public void updateAnchoredHeight(boolean z) {
        updateBottomSheetBackground();
        int height = this.root.getHeight() - Math.min(this.cardContentContainer.getHeight(), getMaxAnchoredHeight());
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        if (height != anchorBottomSheetBehavior.y[anchorBottomSheetBehavior.z]) {
            this.bottomSheetBehavior.B(0, z && (behaviourFinalState() == 6 || behaviourFinalState() == 3), height);
        }
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void updateUserInteractionBlockingOutside() {
        int behaviourFinalState = behaviourFinalState();
        boolean z = true;
        if (behaviourFinalState != 1) {
            if (behaviourFinalState != 3 && ((behaviourFinalState != 6 || canDragToExpandFromAnchored()) && behaviourFinalState != 7)) {
                z = false;
            }
            setBlockUserInteractionOutside(z);
        }
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public SlidableCoordinatorLayout contentView() {
        return this.root;
    }

    public SlideableModalView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SlideableModalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideableModalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(smh0.ybsdk_slideable_modal_view);
        this.root = (SlidableCoordinatorLayout) findViewById(kah0.ybsdk_slideable_modal_view_root);
        ViewGroup viewGroup = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_bottom_sheet);
        this.bottomSheet = viewGroup;
        this.bottomSheetBackground = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_bottom_sheet_background);
        this.bottomSheetBehavior = AnchorBottomSheetBehavior.x(viewGroup);
        this.cardContentContainer = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_card_content_container);
        this.backgroundClickReceiver = findViewById(kah0.ybsdk_slideable_background_click_receiver);
        this.additionalHitAreaSize = dimen(vvg0.ybsdk_mu_1);
        this.floatButtonOffset = dimen(vvg0.ybsdk_mu_1_5);
        this.cardMode = CardMode.SLIDEABLE_CARD;
        this.defaultCardScaleX = 1.0f;
        this.cardContentLayoutListener = new View.OnLayoutChangeListener() { // from class: com.ybsdk.core.design.widget.SlideableModalView.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (SlideableModalView.this.cardMode != CardMode.FULLSCREEN) {
                    SlideableModalView slideableModalView = SlideableModalView.this;
                    slideableModalView.updateAnchoredHeight(slideableModalView.settlingLayoutChanges());
                }
            }
        };
        this.onSlideOutListener = new d82(1);
        this.anchorAnimationListenerCallback = new wor0(this);
        this.bottomSheetBehaviorCallback = new qgn0(23, this);
        this.isBottomSheetBackgroundVisible = true;
        this.cardContentView = inflateCardContent();
        this.initialState = -1;
        init();
    }

    public SlideableModalView(Context context, int i) {
        super(context);
        inflate(smh0.ybsdk_slideable_modal_view);
        this.root = (SlidableCoordinatorLayout) findViewById(kah0.ybsdk_slideable_modal_view_root);
        ViewGroup viewGroup = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_bottom_sheet);
        this.bottomSheet = viewGroup;
        this.bottomSheetBackground = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_bottom_sheet_background);
        this.bottomSheetBehavior = AnchorBottomSheetBehavior.x(viewGroup);
        this.cardContentContainer = (ViewGroup) findViewById(kah0.ybsdk_slideable_modal_view_card_content_container);
        this.backgroundClickReceiver = findViewById(kah0.ybsdk_slideable_background_click_receiver);
        this.additionalHitAreaSize = dimen(vvg0.ybsdk_mu_1);
        this.floatButtonOffset = dimen(vvg0.ybsdk_mu_1_5);
        this.cardMode = CardMode.SLIDEABLE_CARD;
        this.defaultCardScaleX = 1.0f;
        this.cardContentLayoutListener = new View.OnLayoutChangeListener() { // from class: com.ybsdk.core.design.widget.SlideableModalView.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (SlideableModalView.this.cardMode != CardMode.FULLSCREEN) {
                    SlideableModalView slideableModalView = SlideableModalView.this;
                    slideableModalView.updateAnchoredHeight(slideableModalView.settlingLayoutChanges());
                }
            }
        };
        this.onSlideOutListener = new d82(1);
        this.anchorAnimationListenerCallback = new wor0(this);
        this.bottomSheetBehaviorCallback = new qgn0(23, this);
        this.isBottomSheetBackgroundVisible = true;
        this.initialState = i;
        this.cardContentView = inflateCardContent();
        init();
    }
}
