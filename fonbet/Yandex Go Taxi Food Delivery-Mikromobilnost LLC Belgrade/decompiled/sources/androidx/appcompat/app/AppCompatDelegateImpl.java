package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.internal.util.p;
import defpackage.cjw0;
import defpackage.cr2;
import defpackage.dfz0;
import defpackage.drg0;
import defpackage.ena1;
import defpackage.f1a1;
import defpackage.fah0;
import defpackage.fw31;
import defpackage.gix;
import defpackage.h2i0;
import defpackage.hya1;
import defpackage.iog0;
import defpackage.jr2;
import defpackage.kuj0;
import defpackage.kvh0;
import defpackage.l0y;
import defpackage.lr2;
import defpackage.m5z;
import defpackage.mr2;
import defpackage.n4i0;
import defpackage.n751;
import defpackage.np31;
import defpackage.ny61;
import defpackage.nzt0;
import defpackage.op31;
import defpackage.or2;
import defpackage.pey;
import defpackage.rnz;
import defpackage.rr;
import defpackage.sj10;
import defpackage.tfb1;
import defpackage.uw;
import defpackage.vng;
import defpackage.vw;
import defpackage.vyg;
import defpackage.wly0;
import defpackage.wpy0;
import defpackage.x4e;
import defpackage.ycs0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class AppCompatDelegateImpl extends b implements sj10, LayoutInflater.Factory2 {
    static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static boolean sInstalledExceptionHandler;
    ActionBar mActionBar;
    private g mActionMenuPresenterCallback;
    vw mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    final cr2 mAppCompatCallback;
    private AppCompatViewInflater mAppCompatViewInflater;
    private AppCompatWindowCallback mAppCompatWindowCallback;
    private l mAutoBatteryNightModeManager;
    private l mAutoTimeNightModeManager;
    private OnBackInvokedCallback mBackCallback;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    final Context mContext;
    private boolean mCreated;
    private vyg mDecorContentParent;
    boolean mDestroyed;
    private OnBackInvokedDispatcher mDispatcher;
    private Configuration mEffectiveConfiguration;
    private boolean mEnableDefaultActionBarUp;
    androidx.core.view.d mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    boolean mHasActionBar;
    final Object mHost;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    boolean mIsFloating;
    private l0y mLayoutIncludeDetector;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private m mPanelMenuPresenterCallback;
    private mr2[] mPanels;
    private mr2 mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private int mThemeResId;
    private CharSequence mTitle;
    private TextView mTitleView;
    Window mWindow;
    boolean mWindowNoTitle;
    private static final ycs0 sLocalNightModes = new ycs0();
    private static final boolean IS_PRE_LOLLIPOP = false;
    private static final int[] sWindowBackgroundStyleable = {R.attr.windowBackground};
    private static final boolean sCanReturnDifferentContext = !"robolectric".equals(Build.FINGERPRINT);

    /* loaded from: classes10.dex */
    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        private boolean isOutOfBounds(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.closePanel(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(vng.t(i, getContext()));
        }
    }

    private AppCompatDelegateImpl(Context context, Window window, cr2 cr2Var, Object obj) {
        AppCompatActivity tryUnwrapContext;
        this.mFadeAnim = null;
        this.mHandleNativeActionModes = true;
        this.mLocalNightMode = -100;
        this.mInvalidatePanelMenuRunnable = new c(this);
        this.mContext = context;
        this.mAppCompatCallback = cr2Var;
        this.mHost = obj;
        if ((obj instanceof Dialog) && (tryUnwrapContext = tryUnwrapContext()) != null) {
            this.mLocalNightMode = tryUnwrapContext.getDelegate().getLocalNightMode();
        }
        if (this.mLocalNightMode == -100) {
            ycs0 ycs0Var = sLocalNightModes;
            Integer num = (Integer) ycs0Var.get(obj.getClass().getName());
            if (num != null) {
                this.mLocalNightMode = num.intValue();
                ycs0Var.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            attachToWindow(window);
        }
        or2.d();
    }

    private boolean applyApplicationSpecificConfig(boolean z, boolean z2) {
        if (this.mDestroyed) {
            return false;
        }
        int calculateNightMode = calculateNightMode();
        int mapNightMode = mapNightMode(this.mContext, calculateNightMode);
        m5z calculateApplicationLocales = Build.VERSION.SDK_INT < 33 ? calculateApplicationLocales(this.mContext) : null;
        if (!z2 && calculateApplicationLocales != null) {
            calculateApplicationLocales = getConfigurationLocales(this.mContext.getResources().getConfiguration());
        }
        boolean updateAppConfiguration = updateAppConfiguration(mapNightMode, calculateApplicationLocales, z);
        if (calculateNightMode == 0) {
            getAutoTimeNightModeManager(this.mContext).e();
        } else {
            l lVar = this.mAutoTimeNightModeManager;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (calculateNightMode == 3) {
            getAutoBatteryNightModeManager(this.mContext).e();
            return updateAppConfiguration;
        }
        l lVar2 = this.mAutoBatteryNightModeManager;
        if (lVar2 != null) {
            lVar2.a();
        }
        return updateAppConfiguration;
    }

    private void applyFixedSizeWindow() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.mSubDecor.findViewById(R.id.content);
        View decorView = this.mWindow.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(n4i0.AppCompatTheme);
        obtainStyledAttributes.getValue(n4i0.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(n4i0.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(n4i0.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(n4i0.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(n4i0.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(n4i0.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(n4i0.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(n4i0.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(n4i0.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(n4i0.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void attachToWindow(Window window) {
        if (this.mWindow != null) {
            ny61.r("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            ny61.r("AppCompat has already installed itself into the Window");
            return;
        }
        AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
        this.mAppCompatWindowCallback = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        dfz0 f = dfz0.f(this.mContext, null, sWindowBackgroundStyleable);
        Drawable c = f.c(0);
        if (c != null) {
            window.setBackgroundDrawable(c);
        }
        f.g();
        this.mWindow = window;
        if (Build.VERSION.SDK_INT < 33 || this.mDispatcher != null) {
            return;
        }
        setOnBackInvokedDispatcher(null);
    }

    private int calculateNightMode() {
        int i = this.mLocalNightMode;
        return i != -100 ? i : b.getDefaultNightMode();
    }

    private void cleanupAutoManagers() {
        l lVar = this.mAutoTimeNightModeManager;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.mAutoBatteryNightModeManager;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    private Configuration createOverrideAppConfiguration(Context context, int i, m5z m5zVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (m5zVar != null) {
            setConfigurationLocales(configuration2, m5zVar);
        }
        return configuration2;
    }

    private ViewGroup createSubDecor() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(n4i0.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(n4i0.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            ny61.r("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return null;
        }
        if (obtainStyledAttributes.getBoolean(n4i0.AppCompatTheme_windowNoTitle, false)) {
            requestWindowFeature(1);
        } else if (obtainStyledAttributes.getBoolean(n4i0.AppCompatTheme_windowActionBar, false)) {
            requestWindowFeature(108);
        }
        if (obtainStyledAttributes.getBoolean(n4i0.AppCompatTheme_windowActionBarOverlay, false)) {
            requestWindowFeature(109);
        }
        if (obtainStyledAttributes.getBoolean(n4i0.AppCompatTheme_windowActionModeOverlay, false)) {
            requestWindowFeature(10);
        }
        this.mIsFloating = obtainStyledAttributes.getBoolean(n4i0.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        ensureWindow();
        this.mWindow.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (this.mWindowNoTitle) {
            viewGroup = this.mOverlayActionMode ? (ViewGroup) from.inflate(kvh0.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(kvh0.abc_screen_simple, (ViewGroup) null);
        } else if (this.mIsFloating) {
            viewGroup = (ViewGroup) from.inflate(kvh0.abc_dialog_title_material, (ViewGroup) null);
            this.mOverlayActionBar = false;
            this.mHasActionBar = false;
        } else if (this.mHasActionBar) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(iog0.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(this.mContext, typedValue.resourceId) : this.mContext).inflate(kvh0.abc_screen_toolbar, (ViewGroup) null);
            vyg vygVar = (vyg) viewGroup.findViewById(fah0.decor_content_parent);
            this.mDecorContentParent = vygVar;
            vygVar.setWindowCallback(getWindowCallback());
            if (this.mOverlayActionBar) {
                this.mDecorContentParent.initFeature(109);
            }
            if (this.mFeatureProgress) {
                this.mDecorContentParent.initFeature(2);
            }
            if (this.mFeatureIndeterminateProgress) {
                this.mDecorContentParent.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.mHasActionBar);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.mOverlayActionBar);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.mIsFloating);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.mOverlayActionMode);
            sb.append(", windowNoTitle: ");
            ny61.g(x4e.i(sb, this.mWindowNoTitle, " }"));
            return null;
        }
        d dVar = new d(this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(viewGroup, dVar);
        if (this.mDecorContentParent == null) {
            this.mTitleView = (TextView) viewGroup.findViewById(fah0.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(fah0.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.mWindow.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new d(this));
        return viewGroup;
    }

    private void ensureSubDecor() {
        if (this.mSubDecorInstalled) {
            return;
        }
        this.mSubDecor = createSubDecor();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            vyg vygVar = this.mDecorContentParent;
            if (vygVar != null) {
                vygVar.setWindowTitle(title);
            } else if (peekSupportActionBar() != null) {
                peekSupportActionBar().u(title);
            } else {
                TextView textView = this.mTitleView;
                if (textView != null) {
                    textView.setText(title);
                }
            }
        }
        applyFixedSizeWindow();
        onSubDecorInstalled(this.mSubDecor);
        this.mSubDecorInstalled = true;
        mr2 panelState = getPanelState(0, false);
        if (this.mDestroyed) {
            return;
        }
        if (panelState == null || panelState.h == null) {
            invalidatePanelMenu(108);
        }
    }

    private void ensureWindow() {
        if (this.mWindow == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                attachToWindow(((Activity) obj).getWindow());
            }
        }
        if (this.mWindow != null) {
            return;
        }
        ny61.r("We have not been given a Window");
    }

    private static Configuration generateConfigDelta(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            lr2.a(configuration, configuration2, configuration3);
            int i5 = configuration.touchscreen;
            int i6 = configuration2.touchscreen;
            if (i5 != i6) {
                configuration3.touchscreen = i6;
            }
            int i7 = configuration.keyboard;
            int i8 = configuration2.keyboard;
            if (i7 != i8) {
                configuration3.keyboard = i8;
            }
            int i9 = configuration.keyboardHidden;
            int i10 = configuration2.keyboardHidden;
            if (i9 != i10) {
                configuration3.keyboardHidden = i10;
            }
            int i11 = configuration.navigation;
            int i12 = configuration2.navigation;
            if (i11 != i12) {
                configuration3.navigation = i12;
            }
            int i13 = configuration.navigationHidden;
            int i14 = configuration2.navigationHidden;
            if (i13 != i14) {
                configuration3.navigationHidden = i14;
            }
            int i15 = configuration.orientation;
            int i16 = configuration2.orientation;
            if (i15 != i16) {
                configuration3.orientation = i16;
            }
            int i17 = configuration.screenLayout & 15;
            int i18 = configuration2.screenLayout & 15;
            if (i17 != i18) {
                configuration3.screenLayout |= i18;
            }
            int i19 = configuration.screenLayout & 192;
            int i20 = configuration2.screenLayout & 192;
            if (i19 != i20) {
                configuration3.screenLayout |= i20;
            }
            int i21 = configuration.screenLayout & 48;
            int i22 = configuration2.screenLayout & 48;
            if (i21 != i22) {
                configuration3.screenLayout |= i22;
            }
            int i23 = configuration.screenLayout & 768;
            int i24 = configuration2.screenLayout & 768;
            if (i23 != i24) {
                configuration3.screenLayout |= i24;
            }
            hya1.c(configuration, configuration2, configuration3);
            int i25 = configuration.uiMode & 15;
            int i26 = configuration2.uiMode & 15;
            if (i25 != i26) {
                configuration3.uiMode |= i26;
            }
            int i27 = configuration.uiMode & 48;
            int i28 = configuration2.uiMode & 48;
            if (i27 != i28) {
                configuration3.uiMode |= i28;
            }
            int i29 = configuration.screenWidthDp;
            int i30 = configuration2.screenWidthDp;
            if (i29 != i30) {
                configuration3.screenWidthDp = i30;
            }
            int i31 = configuration.screenHeightDp;
            int i32 = configuration2.screenHeightDp;
            if (i31 != i32) {
                configuration3.screenHeightDp = i32;
            }
            int i33 = configuration.smallestScreenWidthDp;
            int i34 = configuration2.smallestScreenWidthDp;
            if (i33 != i34) {
                configuration3.smallestScreenWidthDp = i34;
            }
            int i35 = configuration.densityDpi;
            int i36 = configuration2.densityDpi;
            if (i35 != i36) {
                configuration3.densityDpi = i36;
            }
        }
        return configuration3;
    }

    private int getActivityHandlesConfigChangesFlags(Context context) {
        if (!this.mActivityHandlesConfigFlagsChecked && (this.mHost instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.mHost.getClass()), 269221888);
                if (activityInfo != null) {
                    this.mActivityHandlesConfigFlags = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.mActivityHandlesConfigFlags = 0;
            }
        }
        this.mActivityHandlesConfigFlagsChecked = true;
        return this.mActivityHandlesConfigFlags;
    }

    private l getAutoBatteryNightModeManager(Context context) {
        if (this.mAutoBatteryNightModeManager == null) {
            this.mAutoBatteryNightModeManager = new k(this, context);
        }
        return this.mAutoBatteryNightModeManager;
    }

    private l getAutoTimeNightModeManager(Context context) {
        if (this.mAutoTimeNightModeManager == null) {
            this.mAutoTimeNightModeManager = new k(this, cjw0.l(context));
        }
        return this.mAutoTimeNightModeManager;
    }

    private void initWindowDecorActionBar() {
        ensureSubDecor();
        if (this.mHasActionBar && this.mActionBar == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                this.mActionBar = new o((Activity) this.mHost, this.mOverlayActionBar);
            } else if (obj instanceof Dialog) {
                this.mActionBar = new o((Dialog) this.mHost);
            }
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                actionBar.o(this.mEnableDefaultActionBarUp);
            }
        }
    }

    private boolean initializePanelContent(mr2 mr2Var) {
        View view = mr2Var.g;
        if (view != null) {
            mr2Var.f = view;
            return true;
        }
        if (mr2Var.h == null) {
            return false;
        }
        if (this.mPanelMenuPresenterCallback == null) {
            this.mPanelMenuPresenterCallback = new m(this);
        }
        m mVar = this.mPanelMenuPresenterCallback;
        if (mr2Var.i == null) {
            ListMenuPresenter listMenuPresenter = new ListMenuPresenter(mr2Var.j, kvh0.abc_list_menu_item_layout);
            mr2Var.i = listMenuPresenter;
            listMenuPresenter.setCallback(mVar);
            mr2Var.h.addMenuPresenter(mr2Var.i);
        }
        View view2 = (View) mr2Var.i.getMenuView(mr2Var.e);
        mr2Var.f = view2;
        return view2 != null;
    }

    private boolean initializePanelDecor(mr2 mr2Var) {
        Context actionBarThemedContext = getActionBarThemedContext();
        mr2Var.getClass();
        TypedValue typedValue = new TypedValue();
        Resources.Theme newTheme = actionBarThemedContext.getResources().newTheme();
        newTheme.setTo(actionBarThemedContext.getTheme());
        newTheme.resolveAttribute(iog0.actionBarPopupTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            newTheme.applyStyle(i, true);
        }
        newTheme.resolveAttribute(iog0.panelMenuListTheme, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 != 0) {
            newTheme.applyStyle(i2, true);
        } else {
            newTheme.applyStyle(h2i0.Theme_AppCompat_CompactMenu, true);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(actionBarThemedContext, 0);
        contextThemeWrapper.getTheme().setTo(newTheme);
        mr2Var.j = contextThemeWrapper;
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(n4i0.AppCompatTheme);
        mr2Var.b = obtainStyledAttributes.getResourceId(n4i0.AppCompatTheme_panelBackground, 0);
        mr2Var.d = obtainStyledAttributes.getResourceId(n4i0.AppCompatTheme_android_windowAnimationStyle, 0);
        obtainStyledAttributes.recycle();
        mr2Var.e = new ListMenuDecorView(mr2Var.j);
        mr2Var.c = 81;
        return true;
    }

    private boolean initializePanelMenu(mr2 mr2Var) {
        Resources.Theme theme;
        Context context = this.mContext;
        int i = mr2Var.a;
        if ((i == 0 || i == 108) && this.mDecorContentParent != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(iog0.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(iog0.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(iog0.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme);
                context = contextThemeWrapper;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.setCallback(this);
        MenuBuilder menuBuilder2 = mr2Var.h;
        if (menuBuilder != menuBuilder2) {
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(mr2Var.i);
            }
            mr2Var.h = menuBuilder;
            ListMenuPresenter listMenuPresenter = mr2Var.i;
            if (listMenuPresenter != null) {
                menuBuilder.addMenuPresenter(listMenuPresenter);
            }
        }
        return true;
    }

    private void invalidatePanelMenu(int i) {
        this.mInvalidatePanelMenuFeatures = (1 << i) | this.mInvalidatePanelMenuFeatures;
        if (this.mInvalidatePanelMenuPosted) {
            return;
        }
        View decorView = this.mWindow.getDecorView();
        Runnable runnable = this.mInvalidatePanelMenuRunnable;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        decorView.postOnAnimation(runnable);
        this.mInvalidatePanelMenuPosted = true;
    }

    private boolean onKeyDownPanel(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        mr2 panelState = getPanelState(i, true);
        if (panelState.m) {
            return false;
        }
        return preparePanel(panelState, keyEvent);
    }

    private boolean onKeyUpPanel(int i, KeyEvent keyEvent) {
        boolean z;
        AudioManager audioManager;
        vyg vygVar;
        if (this.mActionMode != null) {
            return false;
        }
        boolean z2 = true;
        mr2 panelState = getPanelState(i, true);
        if (i != 0 || (vygVar = this.mDecorContentParent) == null || !vygVar.canShowOverflowMenu() || ViewConfiguration.get(this.mContext).hasPermanentMenuKey()) {
            boolean z3 = panelState.m;
            if (z3 || panelState.l) {
                closePanel(panelState, true);
                z2 = z3;
            } else {
                if (panelState.k) {
                    if (panelState.o) {
                        panelState.k = false;
                        z = preparePanel(panelState, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        openPanel(panelState, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.mDecorContentParent.isOverflowMenuShowing()) {
            z2 = this.mDecorContentParent.hideOverflowMenu();
        } else {
            if (!this.mDestroyed && preparePanel(panelState, keyEvent)) {
                z2 = this.mDecorContentParent.showOverflowMenu();
            }
            z2 = false;
        }
        if (z2 && (audioManager = (AudioManager) this.mContext.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) != null) {
            audioManager.playSoundEffect(0);
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void openPanel(mr2 mr2Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = mr2Var.m;
        int i2 = mr2Var.a;
        if (z || this.mDestroyed) {
            return;
        }
        if (i2 == 0 && (this.mContext.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !windowCallback.onMenuOpened(i2, mr2Var.h)) {
            closePanel(mr2Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (windowManager == null || !preparePanel(mr2Var, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = mr2Var.e;
        if (viewGroup == null || mr2Var.n) {
            if (viewGroup == null) {
                if (!initializePanelDecor(mr2Var) || mr2Var.e == null) {
                    return;
                }
            } else if (mr2Var.n && viewGroup.getChildCount() > 0) {
                mr2Var.e.removeAllViews();
            }
            if (!initializePanelContent(mr2Var) || mr2Var.f == null || (mr2Var.g == null && mr2Var.i.getAdapter().getCount() <= 0)) {
                mr2Var.n = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = mr2Var.f.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            mr2Var.e.setBackgroundResource(mr2Var.b);
            ViewParent parent = mr2Var.f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mr2Var.f);
            }
            mr2Var.e.addView(mr2Var.f, layoutParams2);
            if (!mr2Var.f.hasFocus()) {
                mr2Var.f.requestFocus();
            }
        } else {
            View view = mr2Var.g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
                mr2Var.l = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams3.gravity = mr2Var.c;
                layoutParams3.windowAnimations = mr2Var.d;
                windowManager.addView(mr2Var.e, layoutParams3);
                mr2Var.m = true;
                if (i2 != 0) {
                    updateBackInvokedCallbackState();
                    return;
                }
                return;
            }
        }
        i = -2;
        mr2Var.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = mr2Var.c;
        layoutParams32.windowAnimations = mr2Var.d;
        windowManager.addView(mr2Var.e, layoutParams32);
        mr2Var.m = true;
        if (i2 != 0) {
        }
    }

    private boolean performPanelShortcut(mr2 mr2Var, int i, KeyEvent keyEvent, int i2) {
        MenuBuilder menuBuilder;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mr2Var.k || preparePanel(mr2Var, keyEvent)) && (menuBuilder = mr2Var.h) != null) {
            z = menuBuilder.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.mDecorContentParent == null) {
            closePanel(mr2Var, true);
        }
        return z;
    }

    private boolean preparePanel(mr2 mr2Var, KeyEvent keyEvent) {
        vyg vygVar;
        vyg vygVar2;
        vyg vygVar3;
        vyg vygVar4;
        if (!this.mDestroyed) {
            boolean z = mr2Var.k;
            int i = mr2Var.a;
            if (z) {
                return true;
            }
            mr2 mr2Var2 = this.mPreparedPanel;
            if (mr2Var2 != null && mr2Var2 != mr2Var) {
                closePanel(mr2Var2, false);
            }
            Window.Callback windowCallback = getWindowCallback();
            if (windowCallback != null) {
                mr2Var.g = windowCallback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (vygVar4 = this.mDecorContentParent) != null) {
                vygVar4.setMenuPrepared();
            }
            if (mr2Var.g == null && (!z2 || !(peekSupportActionBar() instanceof n))) {
                MenuBuilder menuBuilder = mr2Var.h;
                if (menuBuilder == null || mr2Var.o) {
                    if (menuBuilder != null || (initializePanelMenu(mr2Var) && mr2Var.h != null)) {
                        if (z2 && (vygVar2 = this.mDecorContentParent) != null) {
                            if (this.mActionMenuPresenterCallback == null) {
                                this.mActionMenuPresenterCallback = new g(this);
                            }
                            vygVar2.setMenu(mr2Var.h, this.mActionMenuPresenterCallback);
                        }
                        mr2Var.h.stopDispatchingItemsChanged();
                        if (windowCallback.onCreatePanelMenu(i, mr2Var.h)) {
                            mr2Var.o = false;
                        } else {
                            MenuBuilder menuBuilder2 = mr2Var.h;
                            if (menuBuilder2 != null) {
                                if (menuBuilder2 != null) {
                                    menuBuilder2.removeMenuPresenter(mr2Var.i);
                                }
                                mr2Var.h = null;
                            }
                            if (z2 && (vygVar = this.mDecorContentParent) != null) {
                                vygVar.setMenu(null, this.mActionMenuPresenterCallback);
                            }
                        }
                    }
                }
                mr2Var.h.stopDispatchingItemsChanged();
                Bundle bundle = mr2Var.p;
                if (bundle != null) {
                    mr2Var.h.restoreActionViewStates(bundle);
                    mr2Var.p = null;
                }
                if (!windowCallback.onPreparePanel(0, mr2Var.g, mr2Var.h)) {
                    if (z2 && (vygVar3 = this.mDecorContentParent) != null) {
                        vygVar3.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    mr2Var.h.startDispatchingItemsChanged();
                    return false;
                }
                mr2Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                mr2Var.h.startDispatchingItemsChanged();
            }
            mr2Var.k = true;
            mr2Var.l = false;
            this.mPreparedPanel = mr2Var;
            return true;
        }
        return false;
    }

    private void reopenMenu(boolean z) {
        vyg vygVar = this.mDecorContentParent;
        if (vygVar == null || !vygVar.canShowOverflowMenu() || (ViewConfiguration.get(this.mContext).hasPermanentMenuKey() && !this.mDecorContentParent.isOverflowMenuShowPending())) {
            mr2 panelState = getPanelState(0, true);
            panelState.n = true;
            closePanel(panelState, false);
            openPanel(panelState, null);
            return;
        }
        Window.Callback windowCallback = getWindowCallback();
        if (this.mDecorContentParent.isOverflowMenuShowing() && z) {
            this.mDecorContentParent.hideOverflowMenu();
            if (this.mDestroyed) {
                return;
            }
            windowCallback.onPanelClosed(108, getPanelState(0, true).h);
            return;
        }
        if (windowCallback == null || this.mDestroyed) {
            return;
        }
        if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
            this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuRunnable.run();
        }
        mr2 panelState2 = getPanelState(0, true);
        MenuBuilder menuBuilder = panelState2.h;
        if (menuBuilder == null || panelState2.o || !windowCallback.onPreparePanel(0, panelState2.g, menuBuilder)) {
            return;
        }
        windowCallback.onMenuOpened(108, panelState2.h);
        this.mDecorContentParent.showOverflowMenu();
    }

    private int sanitizeWindowFeatureId(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i != 9) {
            return i;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean shouldInheritContext(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.mWindow.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private AppCompatActivity tryUnwrapContext() {
        for (Context context = this.mContext; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateActivityConfiguration(Configuration configuration) {
        Activity activity = (Activity) this.mHost;
        if (activity instanceof pey) {
            if (((pey) activity).getLifecycle().b().a(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.mCreated || this.mDestroyed) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean updateAppConfiguration(int i, m5z m5zVar, boolean z) {
        boolean z2;
        Configuration createOverrideAppConfiguration = createOverrideAppConfiguration(this.mContext, i, m5zVar, null, false);
        int activityHandlesConfigChangesFlags = getActivityHandlesConfigChangesFlags(this.mContext);
        Configuration configuration = this.mEffectiveConfiguration;
        if (configuration == null) {
            configuration = this.mContext.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = createOverrideAppConfiguration.uiMode & 48;
        m5z configurationLocales = getConfigurationLocales(configuration);
        m5z configurationLocales2 = m5zVar == null ? null : getConfigurationLocales(createOverrideAppConfiguration);
        int i4 = i2 != i3 ? 512 : 0;
        if (configurationLocales2 != null && !configurationLocales.equals(configurationLocales2)) {
            i4 |= 8196;
        }
        boolean z3 = true;
        if (((~activityHandlesConfigChangesFlags) & i4) != 0 && z && this.mBaseContextAttached && (sCanReturnDifferentContext || this.mCreated)) {
            Object obj = this.mHost;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i4 & 8192) != 0) {
                    ((Activity) this.mHost).getWindow().getDecorView().setLayoutDirection(createOverrideAppConfiguration.getLayoutDirection());
                }
                ((Activity) this.mHost).recreate();
                z2 = true;
                if (!z2 || i4 == 0) {
                    z3 = z2;
                } else {
                    updateResourcesConfiguration(i3, configurationLocales2, (i4 & activityHandlesConfigChangesFlags) == i4, null);
                }
                if (z3) {
                    Object obj2 = this.mHost;
                    if (obj2 instanceof AppCompatActivity) {
                        if ((i4 & 512) != 0) {
                            ((AppCompatActivity) obj2).onNightModeChanged(i);
                        }
                        if ((i4 & 4) != 0) {
                            ((AppCompatActivity) this.mHost).onLocalesChanged(m5zVar);
                        }
                    }
                }
                if (configurationLocales2 != null) {
                    setDefaultLocalesForLocaleList(getConfigurationLocales(this.mContext.getResources().getConfiguration()));
                }
                return z3;
            }
        }
        z2 = false;
        if (z2) {
        }
        z3 = z2;
        if (z3) {
        }
        if (configurationLocales2 != null) {
        }
        return z3;
    }

    private void updateResourcesConfiguration(int i, m5z m5zVar, boolean z, Configuration configuration) {
        Resources resources = this.mContext.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (m5zVar != null) {
            setConfigurationLocales(configuration2, m5zVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = this.mThemeResId;
        if (i2 != 0) {
            this.mContext.setTheme(i2);
            this.mContext.getTheme().applyStyle(this.mThemeResId, true);
        }
        if (z && (this.mHost instanceof Activity)) {
            updateActivityConfiguration(configuration2);
        }
    }

    private void updateStatusGuardColor(View view) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int windowSystemUiVisibility = view.getWindowSystemUiVisibility() & 8192;
        Context context = this.mContext;
        view.setBackgroundColor(windowSystemUiVisibility != 0 ? context.getColor(drg0.abc_decor_view_status_guard_light) : context.getColor(drg0.abc_decor_view_status_guard));
    }

    @Override // androidx.appcompat.app.b
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(R.id.content)).addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.b
    public boolean applyAppLocales() {
        if (b.isAutoStorageOptedIn(this.mContext) && b.getRequestedAppLocales() != null && !b.getRequestedAppLocales().equals(b.getStoredAppLocales())) {
            asyncExecuteSyncRequestedAndStoredLocales(this.mContext);
        }
        return applyApplicationSpecificConfig(true);
    }

    @Override // androidx.appcompat.app.b
    public boolean applyDayNight() {
        return applyApplicationSpecificConfig(true);
    }

    @Override // androidx.appcompat.app.b
    public Context attachBaseContext2(Context context) {
        AppCompatDelegateImpl appCompatDelegateImpl;
        Context context2;
        this.mBaseContextAttached = true;
        int mapNightMode = mapNightMode(context, calculateNightMode());
        if (b.isAutoStorageOptedIn(context)) {
            b.syncRequestedAndStoredLocales(context);
        }
        m5z calculateApplicationLocales = calculateApplicationLocales(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            appCompatDelegateImpl = this;
            context2 = context;
            try {
                ((android.view.ContextThemeWrapper) context2).applyOverrideConfiguration(appCompatDelegateImpl.createOverrideAppConfiguration(context2, mapNightMode, calculateApplicationLocales, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            appCompatDelegateImpl = this;
            context2 = context;
        }
        if (context2 instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(appCompatDelegateImpl.createOverrideAppConfiguration(context2, mapNightMode, calculateApplicationLocales, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!sCanReturnDifferentContext) {
            appCompatDelegateImpl.attachBaseContext(context2);
            return context2;
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration createOverrideAppConfiguration = appCompatDelegateImpl.createOverrideAppConfiguration(context2, mapNightMode, calculateApplicationLocales, !configuration2.equals(configuration3) ? generateConfigDelta(configuration2, configuration3) : null, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, h2i0.Theme_AppCompat_Empty);
        contextThemeWrapper.applyOverrideConfiguration(createOverrideAppConfiguration);
        try {
            if (context2.getTheme() != null) {
                ena1.f(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        appCompatDelegateImpl.attachBaseContext(contextThemeWrapper);
        return contextThemeWrapper;
    }

    public m5z calculateApplicationLocales(Context context) {
        m5z requestedAppLocales;
        if (Build.VERSION.SDK_INT >= 33 || (requestedAppLocales = b.getRequestedAppLocales()) == null) {
            return null;
        }
        m5z configurationLocales = getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
        m5z h = tfb1.h(requestedAppLocales, configurationLocales);
        return h.c() ? configurationLocales : h;
    }

    public void callOnPanelClosed(int i, mr2 mr2Var, Menu menu) {
        if (menu == null) {
            if (mr2Var == null && i >= 0) {
                mr2[] mr2VarArr = this.mPanels;
                if (i < mr2VarArr.length) {
                    mr2Var = mr2VarArr[i];
                }
            }
            if (mr2Var != null) {
                menu = mr2Var.h;
            }
        }
        if ((mr2Var == null || mr2Var.m) && !this.mDestroyed) {
            this.mAppCompatWindowCallback.bypassOnPanelClosed(this.mWindow.getCallback(), i, menu);
        }
    }

    public void checkCloseActionMenu(MenuBuilder menuBuilder) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !this.mDestroyed) {
            windowCallback.onPanelClosed(108, menuBuilder);
        }
        this.mClosingActionMenu = false;
    }

    public void closePanel(mr2 mr2Var, boolean z) {
        ViewGroup viewGroup;
        vyg vygVar;
        if (z && mr2Var.a == 0 && (vygVar = this.mDecorContentParent) != null && vygVar.isOverflowMenuShowing()) {
            checkCloseActionMenu(mr2Var.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (windowManager != null && mr2Var.m && (viewGroup = mr2Var.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                callOnPanelClosed(mr2Var.a, mr2Var, null);
            }
        }
        mr2Var.k = false;
        mr2Var.l = false;
        mr2Var.m = false;
        mr2Var.f = null;
        mr2Var.n = true;
        if (this.mPreparedPanel == mr2Var) {
            this.mPreparedPanel = null;
        }
        if (mr2Var.a == 0) {
            updateBackInvokedCallbackState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View createView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.mAppCompatViewInflater == null) {
            TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(n4i0.AppCompatTheme);
            String string = obtainStyledAttributes.getString(n4i0.AppCompatTheme_viewInflaterClass);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.mAppCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.mAppCompatViewInflater = (AppCompatViewInflater) this.mContext.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                }
            }
        }
        boolean z2 = IS_PRE_LOLLIPOP;
        boolean z3 = false;
        if (z2) {
            if (this.mLayoutIncludeDetector == null) {
                this.mLayoutIncludeDetector = new l0y();
            }
            if (this.mLayoutIncludeDetector.a(attributeSet)) {
                z = true;
                return this.mAppCompatViewInflater.f(view, str, context, attributeSet, z, z2, true, VectorEnabledTintResources.shouldBeUsed());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = shouldInheritContext((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
        }
        z = z3;
        return this.mAppCompatViewInflater.f(view, str, context, attributeSet, z, z2, true, VectorEnabledTintResources.shouldBeUsed());
    }

    public void dismissPopups() {
        MenuBuilder menuBuilder;
        vyg vygVar = this.mDecorContentParent;
        if (vygVar != null) {
            vygVar.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.mActionModePopup = null;
        }
        endOnGoingFadeAnimation();
        mr2 panelState = getPanelState(0, false);
        if (panelState == null || (menuBuilder = panelState.h) == null) {
            return;
        }
        menuBuilder.close();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object obj = this.mHost;
        if (((obj instanceof gix) || (obj instanceof AppCompatDialog)) && this.mWindow.getDecorView() != null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
        }
        if (keyEvent.getKeyCode() == 82 && this.mAppCompatWindowCallback.bypassDispatchKeyEvent(this.mWindow.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
    }

    public void doInvalidatePanelMenu(int i) {
        mr2 panelState;
        mr2 panelState2 = getPanelState(i, true);
        if (panelState2.h != null) {
            Bundle bundle = new Bundle();
            panelState2.h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState2.p = bundle;
            }
            panelState2.h.stopDispatchingItemsChanged();
            panelState2.h.clear();
        }
        panelState2.o = true;
        panelState2.n = true;
        if ((i != 108 && i != 0) || this.mDecorContentParent == null || (panelState = getPanelState(0, false)) == null) {
            return;
        }
        panelState.k = false;
        preparePanel(panelState, null);
    }

    public void endOnGoingFadeAnimation() {
        androidx.core.view.d dVar = this.mFadeAnim;
        if (dVar != null) {
            dVar.b();
        }
    }

    public mr2 findMenuPanel(Menu menu) {
        mr2[] mr2VarArr = this.mPanels;
        int length = mr2VarArr != null ? mr2VarArr.length : 0;
        for (int i = 0; i < length; i++) {
            mr2 mr2Var = mr2VarArr[i];
            if (mr2Var != null && mr2Var.h == menu) {
                return mr2Var;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.b
    public <T extends View> T findViewById(int i) {
        ensureSubDecor();
        return (T) this.mWindow.findViewById(i);
    }

    public final Context getActionBarThemedContext() {
        ActionBar supportActionBar = getSupportActionBar();
        Context e = supportActionBar != null ? supportActionBar.e() : null;
        return e == null ? this.mContext : e;
    }

    public m5z getConfigurationLocales(Configuration configuration) {
        return lr2.b(configuration);
    }

    @Override // androidx.appcompat.app.b
    public Context getContextForDelegate() {
        return this.mContext;
    }

    @Override // androidx.appcompat.app.b
    public final rr getDrawerToggleDelegate() {
        return new wly0();
    }

    @Override // androidx.appcompat.app.b
    public int getLocalNightMode() {
        return this.mLocalNightMode;
    }

    @Override // androidx.appcompat.app.b
    public MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            this.mMenuInflater = new SupportMenuInflater(actionBar != null ? actionBar.e() : this.mContext);
        }
        return this.mMenuInflater;
    }

    public mr2 getPanelState(int i, boolean z) {
        mr2[] mr2VarArr = this.mPanels;
        if (mr2VarArr == null || mr2VarArr.length <= i) {
            mr2[] mr2VarArr2 = new mr2[i + 1];
            if (mr2VarArr != null) {
                System.arraycopy(mr2VarArr, 0, mr2VarArr2, 0, mr2VarArr.length);
            }
            this.mPanels = mr2VarArr2;
            mr2VarArr = mr2VarArr2;
        }
        mr2 mr2Var = mr2VarArr[i];
        if (mr2Var != null) {
            return mr2Var;
        }
        mr2 mr2Var2 = new mr2();
        mr2Var2.a = i;
        mr2Var2.n = false;
        mr2VarArr[i] = mr2Var2;
        return mr2Var2;
    }

    public ViewGroup getSubDecor() {
        return this.mSubDecor;
    }

    @Override // androidx.appcompat.app.b
    public ActionBar getSupportActionBar() {
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    public final CharSequence getTitle() {
        Object obj = this.mHost;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.mTitle;
    }

    public final Window.Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }

    public boolean hasWindowFeature(int i) {
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        return (sanitizeWindowFeatureId != 1 ? sanitizeWindowFeatureId != 2 ? sanitizeWindowFeatureId != 5 ? sanitizeWindowFeatureId != 10 ? sanitizeWindowFeatureId != 108 ? sanitizeWindowFeatureId != 109 ? false : this.mOverlayActionBar : this.mHasActionBar : this.mOverlayActionMode : this.mFeatureIndeterminateProgress : this.mFeatureProgress : this.mWindowNoTitle) || this.mWindow.hasFeature(i);
    }

    @Override // androidx.appcompat.app.b
    public void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.b
    public void invalidateOptionsMenu() {
        if (peekSupportActionBar() == null || getSupportActionBar().g()) {
            return;
        }
        invalidatePanelMenu(0);
    }

    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    public int mapNightMode(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return getAutoTimeNightModeManager(context).c();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return getAutoBatteryNightModeManager(context).c();
                }
                ny61.r("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                return 0;
            }
        }
        return i;
    }

    public boolean onBackPressed() {
        boolean z = this.mLongPressBackDown;
        this.mLongPressBackDown = false;
        mr2 panelState = getPanelState(0, false);
        if (panelState == null || !panelState.m) {
            vw vwVar = this.mActionMode;
            if (vwVar != null) {
                vwVar.a();
                return true;
            }
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null || !supportActionBar.b()) {
                return false;
            }
        } else if (!z) {
            closePanel(panelState, true);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.b
    public void onConfigurationChanged(Configuration configuration) {
        ActionBar supportActionBar;
        if (this.mHasActionBar && this.mSubDecorInstalled && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.i();
        }
        or2 a = or2.a();
        Context context = this.mContext;
        synchronized (a) {
            kuj0 kuj0Var = a.a;
            synchronized (kuj0Var) {
                rnz rnzVar = (rnz) kuj0Var.b.get(context);
                if (rnzVar != null) {
                    rnzVar.clear();
                }
            }
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        applyApplicationSpecificConfig(false, false);
    }

    @Override // androidx.appcompat.app.b
    public void onCreate(Bundle bundle) {
        String str;
        this.mBaseContextAttached = true;
        applyApplicationSpecificConfig(false);
        ensureWindow();
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = p.j(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar peekSupportActionBar = peekSupportActionBar();
                if (peekSupportActionBar == null) {
                    this.mEnableDefaultActionBarUp = true;
                } else {
                    peekSupportActionBar.o(true);
                }
            }
            b.addActiveDelegate(this);
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        this.mCreated = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy() {
        ActionBar actionBar;
        if (this.mHost instanceof Activity) {
            b.removeActivityDelegate(this);
        }
        if (this.mInvalidatePanelMenuPosted) {
            this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
        }
        this.mDestroyed = true;
        if (this.mLocalNightMode != -100) {
            Object obj = this.mHost;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                sLocalNightModes.put(this.mHost.getClass().getName(), Integer.valueOf(this.mLocalNightMode));
                actionBar = this.mActionBar;
                if (actionBar != null) {
                    actionBar.j();
                }
                cleanupAutoManagers();
            }
        }
        sLocalNightModes.remove(this.mHost.getClass().getName());
        actionBar = this.mActionBar;
        if (actionBar != null) {
        }
        cleanupAutoManagers();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.mLongPressBackDown = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            onKeyDownPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.k(i, keyEvent)) {
            mr2 mr2Var = this.mPreparedPanel;
            if (mr2Var == null || !performPanelShortcut(mr2Var, keyEvent.getKeyCode(), keyEvent, 1)) {
                if (this.mPreparedPanel == null) {
                    mr2 panelState = getPanelState(0, true);
                    preparePanel(panelState, keyEvent);
                    boolean performPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
                    panelState.k = false;
                    if (performPanelShortcut) {
                    }
                }
                return false;
            }
            mr2 mr2Var2 = this.mPreparedPanel;
            if (mr2Var2 != null) {
                mr2Var2.l = true;
                return true;
            }
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                onKeyUpPanel(0, keyEvent);
                return true;
            }
        } else if (onBackPressed()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sj10
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        mr2 findMenuPanel;
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback == null || this.mDestroyed || (findMenuPanel = findMenuPanel(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return windowCallback.onMenuItemSelected(findMenuPanel.a, menuItem);
    }

    @Override // defpackage.sj10
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        reopenMenu(true);
    }

    public void onMenuOpened(int i) {
        ActionBar supportActionBar;
        if (i != 108 || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.c(true);
    }

    public void onPanelClosed(int i) {
        if (i == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            mr2 panelState = getPanelState(i, true);
            if (panelState.m) {
                closePanel(panelState, false);
            }
        }
    }

    @Override // androidx.appcompat.app.b
    public void onPostCreate(Bundle bundle) {
        ensureSubDecor();
    }

    @Override // androidx.appcompat.app.b
    public void onPostResume() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
    }

    @Override // androidx.appcompat.app.b
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.b
    public void onStart() {
        applyApplicationSpecificConfig(true, false);
    }

    @Override // androidx.appcompat.app.b
    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(false);
        }
    }

    public void onSubDecorInstalled(ViewGroup viewGroup) {
    }

    public final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }

    @Override // androidx.appcompat.app.b
    public boolean requestWindowFeature(int i) {
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        if (this.mWindowNoTitle && sanitizeWindowFeatureId == 108) {
            return false;
        }
        if (this.mHasActionBar && sanitizeWindowFeatureId == 1) {
            this.mHasActionBar = false;
        }
        if (sanitizeWindowFeatureId == 1) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mWindowNoTitle = true;
            return true;
        }
        if (sanitizeWindowFeatureId == 2) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureProgress = true;
            return true;
        }
        if (sanitizeWindowFeatureId == 5) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureIndeterminateProgress = true;
            return true;
        }
        if (sanitizeWindowFeatureId == 10) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionMode = true;
            return true;
        }
        if (sanitizeWindowFeatureId == 108) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mHasActionBar = true;
            return true;
        }
        if (sanitizeWindowFeatureId != 109) {
            return this.mWindow.requestFeature(sanitizeWindowFeatureId);
        }
        throwFeatureRequestIfSubDecorInstalled();
        this.mOverlayActionBar = true;
        return true;
    }

    public void setConfigurationLocales(Configuration configuration, m5z m5zVar) {
        lr2.d(configuration, m5zVar);
    }

    @Override // androidx.appcompat.app.b
    public void setContentView(int i) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i, viewGroup);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    public void setDefaultLocalesForLocaleList(m5z m5zVar) {
        lr2.c(m5zVar);
    }

    public void setHandleNativeActionModesEnabled(boolean z) {
        this.mHandleNativeActionModes = z;
    }

    @Override // androidx.appcompat.app.b
    public void setLocalNightMode(int i) {
        if (this.mLocalNightMode != i) {
            this.mLocalNightMode = i;
            if (this.mBaseContextAttached) {
                applyDayNight();
            }
        }
    }

    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.mDispatcher;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.mBackCallback) != null) {
            j.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.mBackCallback = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.mHost;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.mDispatcher = j.a((Activity) this.mHost);
                updateBackInvokedCallbackState();
            }
        }
        this.mDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState();
    }

    @Override // androidx.appcompat.app.b
    public void setSupportActionBar(Toolbar toolbar) {
        if (this.mHost instanceof Activity) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar instanceof o) {
                ny61.r("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            this.mMenuInflater = null;
            if (supportActionBar != null) {
                supportActionBar.j();
            }
            this.mActionBar = null;
            if (toolbar != null) {
                n nVar = new n(toolbar, getTitle(), this.mAppCompatWindowCallback);
                this.mActionBar = nVar;
                this.mAppCompatWindowCallback.setActionBarCallback(nVar.c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.mAppCompatWindowCallback.setActionBarCallback(null);
            }
            invalidateOptionsMenu();
        }
    }

    @Override // androidx.appcompat.app.b
    public void setTheme(int i) {
        this.mThemeResId = i;
    }

    @Override // androidx.appcompat.app.b
    public final void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        vyg vygVar = this.mDecorContentParent;
        if (vygVar != null) {
            vygVar.setWindowTitle(charSequence);
            return;
        }
        if (peekSupportActionBar() != null) {
            peekSupportActionBar().u(charSequence);
            return;
        }
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean shouldAnimateActionModeView() {
        ViewGroup viewGroup;
        return this.mSubDecorInstalled && (viewGroup = this.mSubDecor) != null && viewGroup.isLaidOut();
    }

    public boolean shouldRegisterBackInvokedCallback() {
        mr2 panelState;
        return this.mDispatcher != null && (((panelState = getPanelState(0, false)) != null && panelState.m) || this.mActionMode != null);
    }

    @Override // androidx.appcompat.app.b
    public vw startSupportActionMode(uw uwVar) {
        cr2 cr2Var;
        if (uwVar == null) {
            ny61.g("ActionMode callback can not be null.");
            return null;
        }
        vw vwVar = this.mActionMode;
        if (vwVar != null) {
            vwVar.a();
        }
        h hVar = new h(this, uwVar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            vw w = supportActionBar.w(hVar);
            this.mActionMode = w;
            if (w != null && (cr2Var = this.mAppCompatCallback) != null) {
                cr2Var.onSupportActionModeStarted(w);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = startSupportActionModeFromWindow(hVar);
        }
        updateBackInvokedCallbackState();
        return this.mActionMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vw startSupportActionModeFromWindow(uw uwVar) {
        vw vwVar;
        vw vwVar2;
        cr2 cr2Var;
        endOnGoingFadeAnimation();
        vw vwVar3 = this.mActionMode;
        if (vwVar3 != null) {
            vwVar3.a();
        }
        if (!(uwVar instanceof h)) {
            uwVar = new h(this, uwVar);
        }
        cr2 cr2Var2 = this.mAppCompatCallback;
        if (cr2Var2 != null && !this.mDestroyed) {
            try {
                vwVar = cr2Var2.onWindowStartingSupportActionMode(uwVar);
            } catch (AbstractMethodError unused) {
            }
            if (vwVar == null) {
                this.mActionMode = vwVar;
            } else {
                int i = 1;
                if (this.mActionModeView == null) {
                    if (this.mIsFloating) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.mContext.getTheme();
                        theme.resolveAttribute(iog0.actionBarTheme, typedValue, true);
                        int i2 = typedValue.resourceId;
                        Context context = this.mContext;
                        if (i2 != 0) {
                            Resources.Theme newTheme = context.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new ContextThemeWrapper(this.mContext, 0);
                            context.getTheme().setTo(newTheme);
                        }
                        this.mActionModeView = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, iog0.actionModePopupWindowStyle);
                        this.mActionModePopup = popupWindow;
                        f1a1.g(popupWindow, 2);
                        this.mActionModePopup.setContentView(this.mActionModeView);
                        this.mActionModePopup.setWidth(-1);
                        context.getTheme().resolveAttribute(iog0.actionBarSize, typedValue, true);
                        this.mActionModeView.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.mActionModePopup.setHeight(-2);
                        this.mShowActionModePopup = new f(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.mSubDecor.findViewById(fah0.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
                            this.mActionModeView = (ActionBarContextView) viewStubCompat.inflate();
                        }
                    }
                }
                if (this.mActionModeView != null) {
                    endOnGoingFadeAnimation();
                    this.mActionModeView.killMode();
                    h hVar = (h) uwVar;
                    nzt0 nzt0Var = new nzt0(this.mActionModeView.getContext(), this.mActionModeView, hVar);
                    if (hVar.c(nzt0Var, nzt0Var.c())) {
                        nzt0Var.g();
                        this.mActionModeView.initForMode(nzt0Var);
                        this.mActionMode = nzt0Var;
                        boolean shouldAnimateActionModeView = shouldAnimateActionModeView();
                        ActionBarContextView actionBarContextView = this.mActionModeView;
                        if (shouldAnimateActionModeView) {
                            actionBarContextView.setAlpha(0.0f);
                            androidx.core.view.d c = androidx.core.view.b.c(this.mActionModeView);
                            c.a(1.0f);
                            this.mFadeAnim = c;
                            c.d(new e(i, this));
                        } else {
                            actionBarContextView.setAlpha(1.0f);
                            this.mActionModeView.setVisibility(0);
                            if (this.mActionModeView.getParent() instanceof View) {
                                View view = (View) this.mActionModeView.getParent();
                                WeakHashMap weakHashMap = androidx.core.view.b.a;
                                np31.c(view);
                            }
                        }
                        if (this.mActionModePopup != null) {
                            this.mWindow.getDecorView().post(this.mShowActionModePopup);
                        }
                    } else {
                        this.mActionMode = null;
                    }
                }
            }
            vwVar2 = this.mActionMode;
            if (vwVar2 != null && (cr2Var = this.mAppCompatCallback) != null) {
                cr2Var.onSupportActionModeStarted(vwVar2);
            }
            updateBackInvokedCallbackState();
            return this.mActionMode;
        }
        vwVar = null;
        if (vwVar == null) {
        }
        vwVar2 = this.mActionMode;
        if (vwVar2 != null) {
            cr2Var.onSupportActionModeStarted(vwVar2);
        }
        updateBackInvokedCallbackState();
        return this.mActionMode;
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean shouldRegisterBackInvokedCallback = shouldRegisterBackInvokedCallback();
            if (shouldRegisterBackInvokedCallback && this.mBackCallback == null) {
                this.mBackCallback = j.b(this.mDispatcher, this);
            } else {
                if (shouldRegisterBackInvokedCallback || (onBackInvokedCallback = this.mBackCallback) == null) {
                    return;
                }
                j.c(this.mDispatcher, onBackInvokedCallback);
                this.mBackCallback = null;
            }
        }
    }

    public final int updateStatusGuard(n751 n751Var, Rect rect) {
        boolean z;
        boolean z2;
        int d = n751Var != null ? n751Var.d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.mActionModeView;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mActionModeView.getLayoutParams();
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                Rect rect2 = this.mTempRect1;
                Rect rect3 = this.mTempRect2;
                if (n751Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(n751Var.b(), n751Var.d(), n751Var.c(), n751Var.a());
                }
                fw31.a(this.mSubDecor, rect2, rect3);
                int i = rect2.top;
                int i2 = rect2.left;
                int i3 = rect2.right;
                ViewGroup viewGroup = this.mSubDecor;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                n751 a = op31.a(viewGroup);
                int b = a == null ? 0 : a.b();
                int c = a == null ? 0 : a.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || this.mStatusGuard != null) {
                    View view = this.mStatusGuard;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            this.mStatusGuard.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.mContext);
                    this.mStatusGuard = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    this.mSubDecor.addView(this.mStatusGuard, -1, layoutParams);
                }
                View view3 = this.mStatusGuard;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    updateStatusGuardColor(this.mStatusGuard);
                }
                if (!this.mOverlayActionMode && r5) {
                    d = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.mStatusGuard;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return d;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    public final l getAutoTimeNightModeManager() {
        return getAutoTimeNightModeManager(this.mContext);
    }

    public class AppCompatWindowCallback extends WindowCallbackWrapper {
        private jr2 mActionBarCallback;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        public boolean bypassDispatchKeyEvent(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.mDispatchKeyEventBypassEnabled = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.mDispatchKeyEventBypassEnabled = false;
            }
        }

        public void bypassOnContentChanged(Window.Callback callback) {
            try {
                this.mOnContentChangedBypassEnabled = true;
                callback.onContentChanged();
            } finally {
                this.mOnContentChangedBypassEnabled = false;
            }
        }

        public void bypassOnPanelClosed(Window.Callback callback, int i, Menu menu) {
            try {
                this.mOnPanelClosedBypassEnabled = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.mOnPanelClosedBypassEnabled = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.mDispatchKeyEventBypassEnabled ? getWrapped().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.onKeyShortcut(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.mOnContentChangedBypassEnabled) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View i2;
            jr2 jr2Var = this.mActionBarCallback;
            return (jr2Var == null || (i2 = ((wpy0) jr2Var).i(i)) == null) ? super.onCreatePanelView(i) : i2;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.onMenuOpened(i);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.mOnPanelClosedBypassEnabled) {
                getWrapped().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                AppCompatDelegateImpl.this.onPanelClosed(i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            jr2 jr2Var = this.mActionBarCallback;
            if (jr2Var != null) {
                ((wpy0) jr2Var).k(i);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            MenuBuilder menuBuilder;
            mr2 panelState = AppCompatDelegateImpl.this.getPanelState(0, true);
            if (panelState == null || (menuBuilder = panelState.h) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() && i == 0) ? startAsSupportActionMode(callback) : super.onWindowStartingActionMode(callback, i);
        }

        public void setActionBarCallback(jr2 jr2Var) {
            this.mActionBarCallback = jr2Var;
        }

        public final ActionMode startAsSupportActionMode(ActionMode.Callback callback) {
            androidx.appcompat.view.a aVar = new androidx.appcompat.view.a(AppCompatDelegateImpl.this.mContext, callback);
            vw startSupportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(aVar);
            if (startSupportActionMode != null) {
                return aVar.e(startSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // androidx.appcompat.app.b
    public void setContentView(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.b
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    public void closePanel(int i) {
        closePanel(getPanelState(i, true), true);
    }

    private boolean applyApplicationSpecificConfig(boolean z) {
        return applyApplicationSpecificConfig(z, true);
    }

    public AppCompatDelegateImpl(Dialog dialog, cr2 cr2Var) {
        this(dialog.getContext(), dialog.getWindow(), cr2Var, dialog);
    }

    public AppCompatDelegateImpl(Context context, Window window, cr2 cr2Var) {
        this(context, window, cr2Var, context);
    }

    public AppCompatDelegateImpl(Context context, Activity activity, cr2 cr2Var) {
        this(context, null, cr2Var, activity);
    }

    public AppCompatDelegateImpl(Activity activity, cr2 cr2Var) {
        this(activity, null, cr2Var, activity);
    }
}
