package com.google.android.material.navigation;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.motion.d;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeableDelegateV22;
import com.google.android.material.shape.ShapeableDelegateV33;
import com.google.android.material.shape.b;
import defpackage.acm;
import defpackage.b710;
import defpackage.bcm;
import defpackage.cn91;
import defpackage.d710;
import defpackage.dfz0;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.hay;
import defpackage.i850;
import defpackage.iog0;
import defpackage.ja50;
import defpackage.je4;
import defpackage.jke;
import defpackage.jvh0;
import defpackage.jx81;
import defpackage.ka50;
import defpackage.la50;
import defpackage.mj2;
import defpackage.n751;
import defpackage.n850;
import defpackage.ny61;
import defpackage.org0;
import defpackage.q5z;
import defpackage.qke;
import defpackage.vir0;
import defpackage.yi;
import defpackage.yvy0;
import defpackage.z2i0;

/* loaded from: classes11.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements b710 {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final acm backDrawerListener;
    private final d710 backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    private final int drawerLayoutCornerSizeBackAnimationMax;
    private boolean endInsetScrimEnabled;
    private final ka50 focusDrawerListener;
    private b itemShapeAppearanceModel;
    la50 listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final vir0 shapeableDelegate;
    private final d sideContainerBackHelper;
    private boolean startInsetScrimEnabled;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = g2i0.Widget_Design_NavigationView;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r5), attributeSet, i);
        dfz0 dfz0Var;
        int i2;
        NavigationMenuView navigationMenuView;
        int i3;
        int i4 = DEF_STYLE_RES;
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.startInsetScrimEnabled = true;
        this.endInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = Build.VERSION.SDK_INT >= 33 ? new ShapeableDelegateV33(this) : new ShapeableDelegateV22(this);
        this.sideContainerBackHelper = new d(this);
        this.backOrchestrator = new d710(this, this);
        this.backDrawerListener = new ja50(this);
        this.focusDrawerListener = new ka50(this);
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        dfz0 e = yvy0.e(context2, attributeSet, z2i0.NavigationView, i, i4, new int[0]);
        int i5 = z2i0.NavigationView_android_background;
        TypedArray typedArray = e.b;
        if (typedArray.hasValue(i5)) {
            setBackground(e.b(z2i0.NavigationView_android_background));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(z2i0.NavigationView_drawerLayoutCornerSize, 0);
        this.drawerLayoutCornerSize = dimensionPixelSize;
        this.drawerLayoutCornerSizeBackAnimationEnabled = dimensionPixelSize == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(org0.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList y = q5z.y(background);
        if (background == null || y != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(b.j(context2, attributeSet, i, i4).a());
            if (y != null) {
                materialShapeDrawable.setFillColor(y);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(z2i0.NavigationView_elevation)) {
            setElevation(typedArray.getDimensionPixelSize(z2i0.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(z2i0.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = typedArray.getDimensionPixelSize(z2i0.NavigationView_android_maxWidth, 0);
        ColorStateList a = typedArray.hasValue(z2i0.NavigationView_subheaderColor) ? e.a(z2i0.NavigationView_subheaderColor) : null;
        int resourceId = typedArray.hasValue(z2i0.NavigationView_subheaderTextAppearance) ? typedArray.getResourceId(z2i0.NavigationView_subheaderTextAppearance, 0) : 0;
        if (resourceId == 0 && a == null) {
            a = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        ColorStateList a2 = typedArray.hasValue(z2i0.NavigationView_itemIconTint) ? e.a(z2i0.NavigationView_itemIconTint) : createDefaultColorStateList(R.attr.textColorSecondary);
        int resourceId2 = typedArray.hasValue(z2i0.NavigationView_itemTextAppearance) ? typedArray.getResourceId(z2i0.NavigationView_itemTextAppearance, 0) : 0;
        boolean z = typedArray.getBoolean(z2i0.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if (typedArray.hasValue(z2i0.NavigationView_itemIconSize)) {
            setItemIconSize(typedArray.getDimensionPixelSize(z2i0.NavigationView_itemIconSize, 0));
        }
        ColorStateList a3 = typedArray.hasValue(z2i0.NavigationView_itemTextColor) ? e.a(z2i0.NavigationView_itemTextColor) : null;
        if (resourceId2 == 0 && a3 == null) {
            a3 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable b = e.b(z2i0.NavigationView_itemBackground);
        if (b == null && hasShapeAppearance(e)) {
            b = createDefaultItemBackground(e);
            ColorStateList n = jx81.n(context2, e, z2i0.NavigationView_itemRippleColor);
            if (n != null) {
                dfz0Var = e;
                RippleDrawable rippleDrawable = new RippleDrawable(n, null, createDefaultItemDrawable(e, null));
                FocusRingDrawable layer = FocusRingDrawable.layer(context2, rippleDrawable);
                if (layer != null) {
                    layer.setFocusRingShapeAppearance(this.itemShapeAppearanceModel);
                }
                navigationMenuPresenter.G = rippleDrawable;
                navigationMenuPresenter.c();
                if (typedArray.hasValue(z2i0.NavigationView_itemHorizontalPadding)) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    setItemHorizontalPadding(typedArray.getDimensionPixelSize(z2i0.NavigationView_itemHorizontalPadding, 0));
                }
                if (typedArray.hasValue(z2i0.NavigationView_itemVerticalPadding)) {
                    setItemVerticalPadding(typedArray.getDimensionPixelSize(z2i0.NavigationView_itemVerticalPadding, i2));
                }
                setDividerInsetStart(typedArray.getDimensionPixelSize(z2i0.NavigationView_dividerInsetStart, i2));
                setDividerInsetEnd(typedArray.getDimensionPixelSize(z2i0.NavigationView_dividerInsetEnd, i2));
                setSubheaderInsetStart(typedArray.getDimensionPixelSize(z2i0.NavigationView_subheaderInsetStart, i2));
                setSubheaderInsetEnd(typedArray.getDimensionPixelSize(z2i0.NavigationView_subheaderInsetEnd, i2));
                setTopInsetScrimEnabled(typedArray.getBoolean(z2i0.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
                setBottomInsetScrimEnabled(typedArray.getBoolean(z2i0.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
                setStartInsetScrimEnabled(typedArray.getBoolean(z2i0.NavigationView_startInsetScrimEnabled, this.startInsetScrimEnabled));
                setEndInsetScrimEnabled(typedArray.getBoolean(z2i0.NavigationView_endInsetScrimEnabled, this.endInsetScrimEnabled));
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(z2i0.NavigationView_itemIconPadding, 0);
                setItemMaxLines(typedArray.getInt(z2i0.NavigationView_itemMaxLines, 1));
                navigationMenu.setCallback(new hay(4, this));
                navigationMenuPresenter.w = 1;
                navigationMenuPresenter.initForMenu(context2, navigationMenu);
                if (resourceId != 0) {
                    navigationMenuPresenter.z = resourceId;
                    navigationMenuPresenter.b();
                }
                navigationMenuPresenter.A = a;
                navigationMenuPresenter.b();
                navigationMenuPresenter.E = a2;
                navigationMenuPresenter.c();
                int overScrollMode = getOverScrollMode();
                navigationMenuPresenter.U = overScrollMode;
                navigationMenuView = navigationMenuPresenter.a;
                if (navigationMenuView != null) {
                    navigationMenuView.setOverScrollMode(overScrollMode);
                }
                if (resourceId2 != 0) {
                    navigationMenuPresenter.B = resourceId2;
                    navigationMenuPresenter.c();
                }
                navigationMenuPresenter.C = z;
                navigationMenuPresenter.c();
                navigationMenuPresenter.D = a3;
                navigationMenuPresenter.c();
                navigationMenuPresenter.F = b;
                navigationMenuPresenter.c();
                navigationMenuPresenter.J = dimensionPixelSize2;
                navigationMenuPresenter.c();
                navigationMenu.addMenuPresenter(navigationMenuPresenter);
                if (navigationMenuPresenter.a == null) {
                    NavigationMenuView navigationMenuView2 = (NavigationMenuView) navigationMenuPresenter.y.inflate(jvh0.design_navigation_menu, (ViewGroup) this, false);
                    navigationMenuPresenter.a = navigationMenuView2;
                    navigationMenuView2.setAccessibilityDelegateCompat(new n850(navigationMenuPresenter, navigationMenuPresenter.a));
                    if (navigationMenuPresenter.x == null) {
                        i850 i850Var = new i850(navigationMenuPresenter);
                        navigationMenuPresenter.x = i850Var;
                        i850Var.setHasStableIds(true);
                    }
                    int i6 = navigationMenuPresenter.U;
                    if (i6 != -1) {
                        navigationMenuPresenter.a.setOverScrollMode(i6);
                    }
                    LinearLayout linearLayout = (LinearLayout) navigationMenuPresenter.y.inflate(jvh0.design_navigation_item_header, (ViewGroup) navigationMenuPresenter.a, false);
                    navigationMenuPresenter.b = linearLayout;
                    linearLayout.setImportantForAccessibility(2);
                    navigationMenuPresenter.a.setAdapter(navigationMenuPresenter.x);
                }
                addView(navigationMenuPresenter.a);
                if (typedArray.hasValue(z2i0.NavigationView_menu)) {
                    i3 = 0;
                } else {
                    i3 = 0;
                    inflateMenu(typedArray.getResourceId(z2i0.NavigationView_menu, 0));
                }
                if (typedArray.hasValue(z2i0.NavigationView_headerLayout)) {
                    inflateHeaderView(typedArray.getResourceId(z2i0.NavigationView_headerLayout, i3));
                }
                dfz0Var.g();
                setupInsetScrimsListener();
            }
        }
        dfz0Var = e;
        if (typedArray.hasValue(z2i0.NavigationView_itemHorizontalPadding)) {
        }
        if (typedArray.hasValue(z2i0.NavigationView_itemVerticalPadding)) {
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(z2i0.NavigationView_dividerInsetStart, i2));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(z2i0.NavigationView_dividerInsetEnd, i2));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(z2i0.NavigationView_subheaderInsetStart, i2));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(z2i0.NavigationView_subheaderInsetEnd, i2));
        setTopInsetScrimEnabled(typedArray.getBoolean(z2i0.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(typedArray.getBoolean(z2i0.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        setStartInsetScrimEnabled(typedArray.getBoolean(z2i0.NavigationView_startInsetScrimEnabled, this.startInsetScrimEnabled));
        setEndInsetScrimEnabled(typedArray.getBoolean(z2i0.NavigationView_endInsetScrimEnabled, this.endInsetScrimEnabled));
        int dimensionPixelSize22 = typedArray.getDimensionPixelSize(z2i0.NavigationView_itemIconPadding, 0);
        setItemMaxLines(typedArray.getInt(z2i0.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new hay(4, this));
        navigationMenuPresenter.w = 1;
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (resourceId != 0) {
        }
        navigationMenuPresenter.A = a;
        navigationMenuPresenter.b();
        navigationMenuPresenter.E = a2;
        navigationMenuPresenter.c();
        int overScrollMode2 = getOverScrollMode();
        navigationMenuPresenter.U = overScrollMode2;
        navigationMenuView = navigationMenuPresenter.a;
        if (navigationMenuView != null) {
        }
        if (resourceId2 != 0) {
        }
        navigationMenuPresenter.C = z;
        navigationMenuPresenter.c();
        navigationMenuPresenter.D = a3;
        navigationMenuPresenter.c();
        navigationMenuPresenter.F = b;
        navigationMenuPresenter.c();
        navigationMenuPresenter.J = dimensionPixelSize22;
        navigationMenuPresenter.c();
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        if (navigationMenuPresenter.a == null) {
        }
        addView(navigationMenuPresenter.a);
        if (typedArray.hasValue(z2i0.NavigationView_menu)) {
        }
        if (typedArray.hasValue(z2i0.NavigationView_headerLayout)) {
        }
        dfz0Var.g();
        setupInsetScrimsListener();
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList m = qke.m(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(iog0.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = m.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{m.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private Drawable createDefaultItemBackground(dfz0 dfz0Var) {
        return createDefaultItemDrawable(dfz0Var, jx81.n(getContext(), dfz0Var, z2i0.NavigationView_itemShapeFillColor));
    }

    private Drawable createDefaultItemDrawable(dfz0 dfz0Var, ColorStateList colorStateList) {
        int resourceId = dfz0Var.b.getResourceId(z2i0.NavigationView_itemShapeAppearance, 0);
        int i = z2i0.NavigationView_itemShapeAppearanceOverlay;
        TypedArray typedArray = dfz0Var.b;
        this.itemShapeAppearanceModel = b.g(getContext(), resourceId, typedArray.getResourceId(i, 0)).a();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.itemShapeAppearanceModel);
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, typedArray.getDimensionPixelSize(z2i0.NavigationView_itemShapeInsetStart, 0), typedArray.getDimensionPixelSize(z2i0.NavigationView_itemShapeInsetTop, 0), typedArray.getDimensionPixelSize(z2i0.NavigationView_itemShapeInsetEnd, 0), typedArray.getDimensionPixelSize(z2i0.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(dfz0 dfz0Var) {
        if (dfz0Var.b.hasValue(z2i0.NavigationView_itemShapeAppearance)) {
            return true;
        }
        return dfz0Var.b.hasValue(z2i0.NavigationView_itemShapeAppearanceOverlay);
    }

    private /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z = Gravity.getAbsoluteGravity(((DrawerLayout.LayoutParams) getLayoutParams()).gravity, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                b.a m = materialShapeDrawable.getShapeAppearanceModel().m();
                m.c(this.drawerLayoutCornerSize);
                if (z) {
                    m.j(0.0f);
                    m.f(0.0f);
                } else {
                    m.l(0.0f);
                    m.h(0.0f);
                }
                b a = m.a();
                materialShapeDrawable.setShapeAppearanceModel(a);
                vir0 vir0Var = this.shapeableDelegate;
                vir0Var.c = a;
                vir0Var.c();
                vir0Var.a(this);
                vir0 vir0Var2 = this.shapeableDelegate;
                vir0Var2.d = new RectF(0.0f, 0.0f, i, i2);
                vir0Var2.c();
                vir0Var2.a(this);
                vir0 vir0Var3 = this.shapeableDelegate;
                vir0Var3.b = true;
                vir0Var3.a(this);
            }
        }
    }

    private Pair<DrawerLayout, DrawerLayout.LayoutParams> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        ny61.r("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        return null;
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onGlobalLayout() {
                boolean z;
                Activity a;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z2 = true;
                boolean z3 = NavigationView.this.tmpLocation[1] == 0;
                NavigationMenuPresenter navigationMenuPresenter = NavigationView.this.presenter;
                if (navigationMenuPresenter.Q != z3) {
                    navigationMenuPresenter.Q = z3;
                    int i = (navigationMenuPresenter.b.getChildCount() <= 0 && navigationMenuPresenter.Q) ? navigationMenuPresenter.S : 0;
                    NavigationMenuView navigationMenuView = navigationMenuPresenter.a;
                    navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
                }
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z3 && navigationView2.isTopInsetScrimEnabled());
                boolean z4 = NavigationView.this.getLayoutDirection() == 1;
                if (NavigationView.this.tmpLocation[0] != 0) {
                    if (NavigationView.this.getWidth() + NavigationView.this.tmpLocation[0] != 0) {
                        z = false;
                        NavigationView navigationView3 = NavigationView.this;
                        navigationView3.setDrawLeftInsetForeground(!z && (!z4 ? !navigationView3.isStartInsetScrimEnabled() : !navigationView3.isEndInsetScrimEnabled()));
                        a = jke.a(NavigationView.this.getContext());
                        if (a == null) {
                            Rect e = cn91.e(a);
                            boolean z5 = e.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                            boolean z6 = Color.alpha(Build.VERSION.SDK_INT < 35 ? a.getWindow().getNavigationBarColor() : 0) != 0;
                            NavigationView navigationView4 = NavigationView.this;
                            navigationView4.setDrawBottomInsetForeground(z5 && z6 && navigationView4.isBottomInsetScrimEnabled());
                            boolean z7 = e.width() == NavigationView.this.tmpLocation[0] || e.width() - NavigationView.this.getWidth() == NavigationView.this.tmpLocation[0];
                            NavigationView navigationView5 = NavigationView.this;
                            if (!z7 || (!z4 ? !navigationView5.isEndInsetScrimEnabled() : !navigationView5.isStartInsetScrimEnabled())) {
                                z2 = false;
                            }
                            navigationView5.setDrawRightInsetForeground(z2);
                            return;
                        }
                        return;
                    }
                }
                z = true;
                NavigationView navigationView32 = NavigationView.this;
                navigationView32.setDrawLeftInsetForeground(!z && (!z4 ? !navigationView32.isStartInsetScrimEnabled() : !navigationView32.isEndInsetScrimEnabled()));
                a = jke.a(NavigationView.this.getContext());
                if (a == null) {
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(View view) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.b.addView(view);
        NavigationMenuView navigationMenuView = navigationMenuPresenter.a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // defpackage.b710
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.a();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        vir0 vir0Var = this.shapeableDelegate;
        Path path = vir0Var.e;
        if (!vir0Var.b() || path.isEmpty()) {
            lambda$dispatchDraw$0(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        lambda$dispatchDraw$0(canvas);
        canvas.restore();
    }

    public d getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public MenuItem getCheckedItem() {
        return this.presenter.x.b;
    }

    public int getDividerInsetEnd() {
        return this.presenter.M;
    }

    public int getDividerInsetStart() {
        return this.presenter.L;
    }

    public int getHeaderCount() {
        return this.presenter.b.getChildCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.b.getChildAt(i);
    }

    public Drawable getItemBackground() {
        return this.presenter.F;
    }

    public int getItemHorizontalPadding() {
        return this.presenter.H;
    }

    public int getItemIconPadding() {
        return this.presenter.J;
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.E;
    }

    public int getItemMaxLines() {
        return this.presenter.R;
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.D;
    }

    public int getItemVerticalPadding() {
        return this.presenter.I;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.O;
    }

    public int getSubheaderInsetStart() {
        return this.presenter.N;
    }

    @Override // defpackage.b710
    public void handleBackInvoked() {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> requireDrawerLayoutParent = requireDrawerLayoutParent();
        final DrawerLayout drawerLayout = (DrawerLayout) requireDrawerLayoutParent.first;
        d dVar = this.sideContainerBackHelper;
        je4 je4Var = dVar.f;
        dVar.f = null;
        if (je4Var == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.closeDrawer(this);
            return;
        }
        int i = ((DrawerLayout.LayoutParams) requireDrawerLayoutParent.second).gravity;
        int i2 = bcm.a;
        this.sideContainerBackHelper.b(je4Var, i, new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DrawerLayout.this.closeDrawer(this, false);
                DrawerLayout.this.setScrimColor(-1728053248);
            }
        }, new yi(24, drawerLayout));
    }

    public View inflateHeaderView(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        View inflate = navigationMenuPresenter.y.inflate(i, (ViewGroup) navigationMenuPresenter.b, false);
        navigationMenuPresenter.b.addView(inflate);
        NavigationMenuView navigationMenuView = navigationMenuPresenter.a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
        return inflate;
    }

    public void inflateMenu(int i) {
        i850 i850Var = this.presenter.x;
        if (i850Var != null) {
            i850Var.c = true;
        }
        getMenuInflater().inflate(i, this.menu);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        i850 i850Var2 = navigationMenuPresenter.x;
        if (i850Var2 != null) {
            i850Var2.c = false;
        }
        navigationMenuPresenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isEndInsetScrimEnabled() {
        return this.endInsetScrimEnabled;
    }

    public boolean isStartInsetScrimEnabled() {
        return this.startInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eja1.C(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            ka50 ka50Var = this.focusDrawerListener;
            ka50Var.a = null;
            drawerLayout.removeDrawerListener(ka50Var);
            drawerLayout.addDrawerListener(this.focusDrawerListener);
            if (this.backOrchestrator.a != null) {
                drawerLayout.removeDrawerListener(this.backDrawerListener);
                drawerLayout.addDrawerListener(this.backDrawerListener);
                if (drawerLayout.isDrawerOpen(this)) {
                    this.backOrchestrator.a(true);
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.removeDrawerListener(this.backDrawerListener);
            drawerLayout.removeDrawerListener(this.focusDrawerListener);
        }
        this.backOrchestrator.b();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(n751 n751Var) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.getClass();
        int d = n751Var.d();
        if (navigationMenuPresenter.S != d) {
            navigationMenuPresenter.S = d;
            int i = (navigationMenuPresenter.b.getChildCount() <= 0 && navigationMenuPresenter.Q) ? navigationMenuPresenter.S : 0;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.a;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = navigationMenuPresenter.a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, n751Var.a());
        androidx.core.view.b.d(navigationMenuPresenter.b, n751Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    public void removeHeaderView(View view) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.b.removeView(view);
        if (navigationMenuPresenter.b.getChildCount() > 0) {
            return;
        }
        NavigationMenuView navigationMenuView = navigationMenuPresenter.a;
        navigationMenuView.setPadding(0, navigationMenuPresenter.S, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem == null) {
            ny61.g("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        } else {
            this.presenter.x.g((MenuItemImpl) findItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.M = i;
        navigationMenuPresenter.a();
    }

    public void setDividerInsetStart(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.L = i;
        navigationMenuPresenter.a();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        eja1.A(this, f);
    }

    public void setEndInsetScrimEnabled(boolean z) {
        this.endInsetScrimEnabled = z;
    }

    public void setForceCompatClippingEnabled(boolean z) {
        vir0 vir0Var = this.shapeableDelegate;
        if (z != vir0Var.a) {
            vir0Var.a = z;
            vir0Var.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.F = drawable;
        navigationMenuPresenter.c();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.H = i;
        navigationMenuPresenter.c();
    }

    public void setItemHorizontalPaddingResource(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.H = getResources().getDimensionPixelSize(i);
        navigationMenuPresenter.c();
    }

    public void setItemIconPadding(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.J = i;
        navigationMenuPresenter.c();
    }

    public void setItemIconPaddingResource(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.J = getResources().getDimensionPixelSize(i);
        navigationMenuPresenter.c();
    }

    public void setItemIconSize(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter.K != i) {
            navigationMenuPresenter.K = i;
            navigationMenuPresenter.P = true;
            navigationMenuPresenter.c();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.E = colorStateList;
        navigationMenuPresenter.c();
    }

    public void setItemMaxLines(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.R = i;
        navigationMenuPresenter.c();
    }

    public void setItemTextAppearance(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.B = i;
        navigationMenuPresenter.c();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.C = z;
        navigationMenuPresenter.c();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.D = colorStateList;
        navigationMenuPresenter.c();
    }

    public void setItemVerticalPadding(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.I = i;
        navigationMenuPresenter.c();
    }

    public void setItemVerticalPaddingResource(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.I = getResources().getDimensionPixelSize(i);
        navigationMenuPresenter.c();
    }

    public void setNavigationItemSelectedListener(la50 la50Var) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.U = i;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setStartInsetScrimEnabled(boolean z) {
        this.startInsetScrimEnabled = z;
    }

    public void setSubheaderInsetEnd(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.O = i;
        navigationMenuPresenter.b();
    }

    public void setSubheaderInsetStart(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        navigationMenuPresenter.N = i;
        navigationMenuPresenter.b();
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    @Override // defpackage.b710
    public void startBackProgress(je4 je4Var) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.f = je4Var;
    }

    @Override // defpackage.b710
    public void updateBackProgress(je4 je4Var) {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> requireDrawerLayoutParent = requireDrawerLayoutParent();
        d dVar = this.sideContainerBackHelper;
        int i = ((DrawerLayout.LayoutParams) requireDrawerLayoutParent.second).gravity;
        je4 je4Var2 = dVar.f;
        dVar.f = je4Var;
        if (je4Var2 != null) {
            dVar.c(i, je4Var.c, je4Var.d == 0);
        }
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = mj2.c(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.a.getInterpolation(je4Var.c));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            this.presenter.x.g((MenuItemImpl) findItem);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.navigationViewStyle);
    }

    public NavigationView(Context context) {
        this(context, null);
    }
}
