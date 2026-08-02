package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import defpackage.akh;
import defpackage.atw;
import defpackage.b710;
import defpackage.bk;
import defpackage.cvw;
import defpackage.cxg0;
import defpackage.cz2;
import defpackage.d710;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.exp0;
import defpackage.fxp0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.gxp0;
import defpackage.hsz0;
import defpackage.hxp0;
import defpackage.im91;
import defpackage.iw31;
import defpackage.iy4;
import defpackage.je4;
import defpackage.jke;
import defpackage.jvh0;
import defpackage.leh0;
import defpackage.mj2;
import defpackage.n751;
import defpackage.org0;
import defpackage.r751;
import defpackage.t8;
import defpackage.u1w;
import defpackage.unr0;
import defpackage.v5a1;
import defpackage.vez0;
import defpackage.vng;
import defpackage.yqn;
import defpackage.yso;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class SearchView extends FrameLayout implements androidx.coordinatorlayout.widget.a, b710 {
    private static final int DEF_STYLE_RES = g2i0.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;
    private final d710 backOrchestrator;
    private final int backgroundColor;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    private final boolean containedAnimationEnabled;
    final TouchObserverFrameLayout contentContainer;
    private TransitionState currentTransitionState;
    final View divider;
    private final boolean dividerVisible;
    final TextView dummyTextView;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final yqn elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final g searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final LinearLayout textContainer;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final Set<c> transitionListeners;
    private boolean useWindowInsetsController;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        private static final /* synthetic */ TransitionState[] $VALUES;
        public static final TransitionState HIDDEN;
        public static final TransitionState HIDING;
        public static final TransitionState SHOWING;
        public static final TransitionState SHOWN;

        static {
            TransitionState transitionState = new TransitionState("HIDING", 0);
            HIDING = transitionState;
            TransitionState transitionState2 = new TransitionState("HIDDEN", 1);
            HIDDEN = transitionState2;
            TransitionState transitionState3 = new TransitionState("SHOWING", 2);
            SHOWING = transitionState3;
            TransitionState transitionState4 = new TransitionState("SHOWN", 3);
            SHOWN = transitionState4;
            $VALUES = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.backOrchestrator = new d710(this, this);
        this.transitionListeners = new LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = TransitionState.HIDDEN;
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public void onTouchModeChanged(boolean z) {
                EditText editText;
                if (z || !SearchView.this.hasWindowFocus() || !SearchView.this.isShowing() || (editText = SearchView.this.editText) == null || editText.isFocused()) {
                    return;
                }
                EditText editText2 = SearchView.this.editText;
                Objects.requireNonNull(editText2);
                editText2.post(new atw(editText2, 4));
            }
        };
        Context context2 = getContext();
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.SearchView, i, i2, new int[0]);
        this.backgroundColor = d.getColor(z2i0.SearchView_backgroundTint, 0);
        int resourceId = d.getResourceId(z2i0.SearchView_headerLayout, -1);
        int resourceId2 = d.getResourceId(z2i0.SearchView_android_textAppearance, -1);
        String string = d.getString(z2i0.SearchView_android_text);
        String string2 = d.getString(z2i0.SearchView_android_hint);
        String string3 = d.getString(z2i0.SearchView_searchPrefixText);
        boolean z = d.getBoolean(z2i0.SearchView_useDrawerArrowDrawable, false);
        this.animatedNavigationIcon = d.getBoolean(z2i0.SearchView_animateNavigationIcon, true);
        this.animatedMenuItems = d.getBoolean(z2i0.SearchView_animateMenuItems, true);
        boolean z2 = d.getBoolean(z2i0.SearchView_hideNavigationIcon, false);
        this.autoShowKeyboard = d.getBoolean(z2i0.SearchView_autoShowKeyboard, true);
        this.backHandlingEnabled = d.getBoolean(z2i0.SearchView_backHandlingEnabled, true);
        this.dividerVisible = d.getBoolean(z2i0.SearchView_dividerVisible, true);
        boolean z3 = d.getBoolean(z2i0.SearchView_containedAnimationEnabled, false);
        this.containedAnimationEnabled = z3;
        d.recycle();
        LayoutInflater.from(context2).inflate(jvh0.mtrl_search_view, this);
        this.layoutInflated = true;
        this.scrim = findViewById(leh0.open_search_view_scrim);
        this.rootView = (ClippableRoundedCornerLayout) findViewById(leh0.open_search_view_root);
        this.backgroundView = findViewById(leh0.open_search_view_background);
        this.statusBarSpacer = findViewById(leh0.open_search_view_status_bar_spacer);
        this.headerContainer = (FrameLayout) findViewById(leh0.open_search_view_header_container);
        this.toolbarContainer = (FrameLayout) findViewById(leh0.open_search_view_toolbar_container);
        this.toolbar = (MaterialToolbar) findViewById(leh0.open_search_view_toolbar);
        this.dummyToolbar = (Toolbar) findViewById(leh0.open_search_view_dummy_toolbar);
        this.dummyTextView = (TextView) findViewById(leh0.open_search_view_dummy_text_view);
        this.searchPrefix = (TextView) findViewById(leh0.open_search_view_search_prefix);
        this.textContainer = (LinearLayout) findViewById(leh0.open_search_view_text_container);
        this.editText = (EditText) findViewById(leh0.open_search_view_edit_text);
        this.clearButton = (ImageButton) findViewById(leh0.open_search_view_clear_button);
        this.divider = findViewById(leh0.open_search_view_divider);
        this.contentContainer = (TouchObserverFrameLayout) findViewById(leh0.open_search_view_content_container);
        this.searchViewAnimationHelper = new g(context2, this, z3);
        this.elevationOverlayProvider = new yqn(context2);
        setUpRootView();
        setUpBackgroundViewElevationOverlay();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        setUpEditText(resourceId2, string, string2);
        setUpBackButton(z, z2);
        setUpClearButton();
        setUpDivider();
        setUpContentOnTouchListener();
        setUpInsetListeners();
        setToolbarTouchscreenBlocksFocus(false);
        if (z3) {
            setUpDummyToolbarForContainedAnimation();
            setUpDummyTextForContainedAnimation(resourceId2, string, string2);
        }
    }

    private Window getActivityWindow() {
        Activity a = jke.a(getContext());
        if (a == null) {
            return null;
        }
        return a.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(org0.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private boolean isHiddenOrHiding() {
        return this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING);
    }

    private boolean isNavigationIconDrawerArrowDrawable(Toolbar toolbar) {
        return cvw.k0(toolbar.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearFocusAndHideKeyboard$11() {
        this.editText.clearFocus();
        com.google.android.material.internal.e.h(this.editText, this.useWindowInsetsController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$requestFocusAndShowKeyboard$10() {
        r751 i;
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        EditText editText = this.editText;
        if (!this.useWindowInsetsController || (i = androidx.core.view.b.i(editText)) == null) {
            ((InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText, 1);
        } else {
            i.a.W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFocusAndShowKeyboardIfNeeded$9() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpBackButton$2(View view) {
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpClearButton$3(View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpContentOnTouchListener$4(View view, MotionEvent motionEvent) {
        if (!isAdjustNothingSoftInputMode()) {
            return false;
        }
        this.editText.clearFocus();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n751 lambda$setUpDividerInsetListener$7(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, n751 n751Var) {
        u1w g = n751Var.a.g(647);
        marginLayoutParams.leftMargin = i + g.a;
        marginLayoutParams.rightMargin = i2 + g.c;
        return n751Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpEditText$1(View view, boolean z) {
        if (z) {
            return;
        }
        com.google.android.material.internal.e.h(view, this.useWindowInsetsController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n751 lambda$setUpStatusBarSpacerInsetListener$6(View view, n751 n751Var) {
        int i = n751Var.a.g(647).b;
        setUpStatusBarSpacer(i);
        if (!this.statusBarSpacerEnabledOverride) {
            setStatusBarSpacerEnabledInternal(i > 0);
        }
        return n751Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n751 lambda$setUpToolbarInsetListener$5(View view, n751 n751Var, iw31 iw31Var) {
        boolean i = com.google.android.material.internal.e.i(this.toolbar);
        int i2 = i ? iw31Var.c : iw31Var.a;
        int i3 = i ? iw31Var.a : iw31Var.c;
        u1w g = n751Var.a.g(647);
        this.toolbar.setPadding(i2 + g.a, iw31Var.b, i3 + g.c, iw31Var.d);
        return n751Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupWithSearchBar$8(View view) {
        show();
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.statusBarSpacer.setVisibility(z ? 0 : 8);
    }

    private void setTransitionState(TransitionState transitionState, boolean z) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        if (z) {
            updateModalForAccessibility(transitionState);
        }
        this.currentTransitionState = transitionState;
        Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        updateListeningForBackCallbacks(transitionState);
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || transitionState != TransitionState.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    private void setUpBackButton(boolean z, boolean z2) {
        MaterialToolbar materialToolbar = this.toolbar;
        if (z2) {
            materialToolbar.setNavigationIcon((Drawable) null);
            return;
        }
        materialToolbar.setNavigationOnClickListener(new fxp0(this, 0));
        if (z) {
            DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
            drawerArrowDrawable.setColor(vez0.T(getContext(), z610.e(eng0.colorOnSurface, this)));
            this.toolbar.setNavigationIcon(drawerArrowDrawable);
        }
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        yqn yqnVar = this.elevationOverlayProvider;
        if (yqnVar == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(yqnVar.a(f, this.backgroundColor));
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new fxp0(this, 1));
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
    }

    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new t8(18, this));
    }

    private void setUpDivider() {
        this.divider.setVisibility(this.dividerVisible ? 0 : 8);
    }

    private void setUpDividerInsetListener() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        int i = marginLayoutParams.leftMargin;
        int i2 = marginLayoutParams.rightMargin;
        View view = this.divider;
        iy4 iy4Var = new iy4(marginLayoutParams, i, i2);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(view, iy4Var);
    }

    private void setUpDummyTextForContainedAnimation(int i, String str, String str2) {
        if (i != -1) {
            this.dummyTextView.setTextAppearance(i);
        }
        this.dummyTextView.setText(str);
        this.dummyTextView.setHint(str2);
    }

    private void setUpDummyToolbarForContainedAnimation() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.dummyToolbar.getLayoutParams();
        layoutParams.gravity = 8388611;
        this.dummyToolbar.setLayoutParams(layoutParams);
        this.dummyToolbar.setVisibility(4);
    }

    private void setUpEditText(int i, String str, String str2) {
        if (i != -1) {
            this.editText.setTextAppearance(i);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
        this.editText.setOnFocusChangeListener(new bk(27, this));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    private void setUpRootView() {
        this.rootView.setOnTouchListener(new cz2(10));
    }

    private void setUpStatusBarSpacer(int i) {
        if (this.statusBarSpacer.getLayoutParams().height != i) {
            this.statusBarSpacer.getLayoutParams().height = i;
            this.statusBarSpacer.requestLayout();
        }
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        View view = this.statusBarSpacer;
        hxp0 hxp0Var = new hxp0(this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(view, hxp0Var);
    }

    private void setUpToolbarInsetListener() {
        com.google.android.material.internal.e.c(this.toolbar, new hxp0(this));
    }

    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z);
                } else {
                    Map<View, Integer> map = this.childImportantForAccessibilityMap;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.childImportantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void updateListeningForBackCallbacks(TransitionState transitionState) {
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.backOrchestrator.a(false);
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.backOrchestrator.b();
        }
    }

    private void updateModalForAccessibility(TransitionState transitionState) {
        if (transitionState == TransitionState.SHOWN) {
            setModalForAccessibility(true);
        } else if (transitionState == TransitionState.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable mutate = vng.t(defaultNavigationIconResource, getContext()).mutate();
        if (this.toolbar.getNavigationIconTint() != null) {
            mutate.setTint(this.toolbar.getNavigationIconTint().intValue());
        }
        im91.i(mutate, getLayoutDirection());
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), mutate));
        updateNavigationIconProgressIfNeeded();
    }

    private void updateNavigationIconProgressIfNeeded() {
        ImageButton d = v5a1.d(this.toolbar);
        if (d == null) {
            return;
        }
        int i = this.rootView.getVisibility() == 0 ? 1 : 0;
        Drawable k0 = cvw.k0(d.getDrawable());
        if (k0 instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) k0).setProgress(i);
        }
        if (k0 instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) k0).setProgress(i);
        }
    }

    public void addHeaderView(View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(c cVar) {
        this.transitionListeners.add(cVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // defpackage.b710
    public void cancelBackProgress() {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        g gVar = this.searchViewAnimationHelper;
        com.google.android.material.motion.c cVar = gVar.q;
        SearchBar searchBar = gVar.s;
        je4 je4Var = cVar.f;
        cVar.f = null;
        if (je4Var != null) {
            AnimatorSet a = cVar.a(searchBar);
            View view = cVar.b;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator ofObject = ValueAnimator.ofObject(new akh(1), clippableRoundedCornerLayout.getCornerRadii(), cVar.b());
                ofObject.addUpdateListener(new yso(10, clippableRoundedCornerLayout));
                a.playTogether(ofObject);
            }
            a.setDuration(cVar.e);
            a.start();
            cVar.i = 0.0f;
            cVar.j = null;
            cVar.k = null;
        }
        AnimatorSet animatorSet = gVar.r;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        gVar.r = null;
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new exp0(this, 1));
    }

    public void clearText() {
        this.editText.setText("");
        this.dummyTextView.setText("");
    }

    public com.google.android.material.motion.c getBackHelper() {
        return this.searchViewAnimationHelper.q;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    public int getDefaultNavigationIconResource() {
        return cxg0.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getHint() {
        return this.editText.getHint();
    }

    public View getSearchContainer() {
        return this.rootView;
    }

    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    public int getSoftInputMode() {
        return this.softInputMode;
    }

    public Editable getText() {
        return this.editText.getText();
    }

    public Toolbar getToolbar() {
        return this.toolbar;
    }

    @Override // defpackage.b710
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        g gVar = this.searchViewAnimationHelper;
        com.google.android.material.motion.c cVar = gVar.q;
        je4 je4Var = cVar.f;
        cVar.f = null;
        if (Build.VERSION.SDK_INT < 34 || this.searchBar == null || je4Var == null) {
            hide();
            return;
        }
        long totalDuration = gVar.l().getTotalDuration();
        com.google.android.material.motion.c cVar2 = gVar.q;
        AnimatorSet a = cVar2.a(gVar.s);
        a.setDuration(totalDuration);
        a.start();
        cVar2.i = 0.0f;
        cVar2.j = null;
        cVar2.k = null;
        if (gVar.r != null) {
            gVar.u.g();
            gVar.r.resume();
        }
        gVar.r = null;
    }

    public void hide() {
        if (this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING)) {
            return;
        }
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.searchViewAnimationHelper.l();
            return;
        }
        if (!this.containedAnimationEnabled) {
            this.searchBar.setPlaceholderText(this.editText.getText().toString());
        }
        SearchBar searchBar2 = this.searchBar;
        g gVar = this.searchViewAnimationHelper;
        Objects.requireNonNull(gVar);
        searchBar2.post(new gxp0(gVar, 0));
    }

    public void inflateMenu(int i) {
        this.toolbar.inflateMenu(i);
    }

    public boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        return this.searchBar != null;
    }

    public boolean isShowing() {
        return this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING);
    }

    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eja1.C(this);
        TransitionState currentTransitionState = getCurrentTransitionState();
        updateModalForAccessibility(currentTransitionState);
        updateListeningForBackCallbacks(currentTransitionState);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.backOrchestrator.b();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        setVisible(savedState.visibility == 0);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.text = text == null ? null : text.toString();
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeTransitionListener(c cVar) {
        this.transitionListeners.remove(cVar);
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new exp0(this, 2), 100L);
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        } else {
            if (isInTouchMode()) {
                return;
            }
            this.editText.postDelayed(new exp0(this, 0), 100L);
        }
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.animatedNavigationIcon = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.autoShowKeyboard = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(CharSequence charSequence) {
        this.editText.setHint(charSequence);
        this.dummyTextView.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.animatedMenuItems = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z);
        if (z) {
            return;
        }
        this.childImportantForAccessibilityMap = null;
    }

    public void setOnMenuItemClickListener(hsz0 hsz0Var) {
        this.toolbar.setOnMenuItemClickListener(hsz0Var);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        this.searchPrefix.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
        this.dummyTextView.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.toolbar.setTouchscreenBlocksFocus(z);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.useWindowInsetsController = z;
    }

    public void setVisible(boolean z) {
        boolean z2 = this.rootView.getVisibility() == 0;
        this.rootView.setVisibility(z ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        setTransitionState(z ? TransitionState.SHOWN : TransitionState.HIDDEN, z2 != z);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.s = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new fxp0(this, 2));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new exp0(this, 3));
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
        updateListeningForBackCallbacks(getCurrentTransitionState());
    }

    public void show() {
        if (this.currentTransitionState.equals(TransitionState.SHOWN)) {
            return;
        }
        TransitionState transitionState = this.currentTransitionState;
        TransitionState transitionState2 = TransitionState.SHOWING;
        if (transitionState.equals(transitionState2)) {
            return;
        }
        final g gVar = this.searchViewAnimationHelper;
        SearchView searchView = gVar.a;
        gVar.i();
        SearchBar searchBar = gVar.s;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = gVar.d;
        int i = 4;
        if (searchBar == null) {
            if (searchView.isAdjustNothingSoftInputMode()) {
                searchView.postDelayed(new exp0(searchView, i), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new Runnable() { // from class: com.google.android.material.search.d
                @Override // java.lang.Runnable
                public final void run() {
                    final g gVar2 = g.this;
                    gVar2.d.setTranslationY(r0.getHeight());
                    final AnimatorSet j = gVar2.j(true);
                    j.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper$3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (!g.this.a.isAdjustNothingSoftInputMode()) {
                                g.this.a.requestFocusAndShowKeyboardIfNeeded();
                            }
                            g.this.a.setTransitionState(SearchView.TransitionState.SHOWN);
                            g gVar3 = g.this;
                            if (gVar3.p == j) {
                                gVar3.p = null;
                            }
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            g.this.d.setVisibility(0);
                            g.this.a.setTransitionState(SearchView.TransitionState.SHOWING);
                        }
                    });
                    j.start();
                    gVar2.p = j;
                }
            });
            return;
        }
        EditText editText = gVar.k;
        if (searchView.isAdjustNothingSoftInputMode()) {
            searchView.requestFocusAndShowKeyboardIfNeeded();
        }
        searchView.setTransitionState(transitionState2);
        gVar.u.j();
        editText.setText(gVar.s.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new gxp0(gVar, 1));
    }

    @Override // defpackage.b710
    public void startBackProgress(je4 je4Var) {
        SearchBar searchBar;
        if (isHiddenOrHiding() || (searchBar = this.searchBar) == null) {
            return;
        }
        if (!this.containedAnimationEnabled) {
            searchBar.setPlaceholderText(this.editText.getText().toString());
        }
        g gVar = this.searchViewAnimationHelper;
        com.google.android.material.motion.c cVar = gVar.q;
        SearchBar searchBar2 = gVar.s;
        cVar.f = je4Var;
        float f = je4Var.b;
        View view = cVar.b;
        cVar.j = com.google.android.material.internal.e.b(0, view);
        if (searchBar2 != null) {
            cVar.k = com.google.android.material.internal.e.a(view, searchBar2);
        }
        cVar.i = f;
    }

    @Override // defpackage.b710
    public void updateBackProgress(je4 je4Var) {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        g gVar = this.searchViewAnimationHelper;
        SearchView searchView = gVar.a;
        float f = je4Var.c;
        if (f <= 0.0f) {
            return;
        }
        com.google.android.material.motion.c cVar = gVar.q;
        SearchBar searchBar = gVar.s;
        float cornerSize = searchBar.getCornerSize();
        je4 je4Var2 = cVar.f;
        cVar.f = je4Var;
        if (je4Var2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z = je4Var.d == 0;
            float f2 = je4Var.b;
            float f3 = cVar.g;
            float interpolation = cVar.a.getInterpolation(f);
            View view = cVar.b;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > 0.0f && height > 0.0f) {
                float a = mj2.a(1.0f, 0.9f, interpolation);
                float a2 = mj2.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f3), interpolation) * (z ? 1 : -1);
                float min = Math.min(Math.max(0.0f, ((height - (a * height)) / 2.0f) - f3), cVar.h);
                float f4 = f2 - cVar.i;
                float a3 = mj2.a(0.0f, min, Math.abs(f4) / height) * Math.signum(f4);
                if (!Float.isNaN(a) && !Float.isNaN(a2) && !Float.isNaN(a3)) {
                    view.setScaleX(a);
                    view.setScaleY(a);
                    view.setTranslationX(a2);
                    view.setTranslationY(a3);
                    if (view instanceof ClippableRoundedCornerLayout) {
                        float[] b = cVar.b();
                        ((ClippableRoundedCornerLayout) view).updateCornerRadii(new float[]{mj2.a(b[0], cornerSize, interpolation), mj2.a(b[1], cornerSize, interpolation), mj2.a(b[2], cornerSize, interpolation), mj2.a(b[3], cornerSize, interpolation), mj2.a(b[4], cornerSize, interpolation), mj2.a(b[5], cornerSize, interpolation), mj2.a(b[6], cornerSize, interpolation), mj2.a(b[7], cornerSize, interpolation)});
                    }
                }
            }
        }
        AnimatorSet animatorSet = gVar.r;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
            return;
        }
        if (searchView.isAdjustNothingSoftInputMode()) {
            gVar.k.clearFocus();
        }
        if (searchView.isAnimatedNavigationIcon()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            gVar.h(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(ReversableAnimatedValueInterpolator.of(false, mj2.b));
            gVar.r = animatorSet2;
            animatorSet2.start();
            gVar.r.pause();
        }
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    public static class Behavior extends CoordinatorLayout.a {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.isSetupWithSearchBar() || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public void setHint(int i) {
        this.editText.setHint(i);
        this.dummyTextView.setHint(i);
    }

    public void setText(int i) {
        this.editText.setText(i);
        this.dummyTextView.setText(i);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String text;
        int visibility;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    public void setTransitionState(TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.materialSearchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
