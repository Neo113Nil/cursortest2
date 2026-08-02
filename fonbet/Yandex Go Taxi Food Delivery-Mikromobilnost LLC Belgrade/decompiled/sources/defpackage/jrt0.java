package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1;
import androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1;
import androidx.core.splashscreen.a;
import androidx.fragment.app.FragmentActivity;
import defpackage.a82;
import defpackage.jrt0;

/* loaded from: classes.dex */
public final class jrt0 extends krt0 {
    public SplashScreen$Impl31$setKeepOnScreenCondition$1 i;
    public boolean j;
    public final SplashScreen$Impl31$hierarchyListener$1 k;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1] */
    public jrt0(final FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.j = true;
        this.k = new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                View rootView;
                if (a82.v(child)) {
                    jrt0 jrt0Var = jrt0.this;
                    SplashScreenView l = a82.l(child);
                    jrt0Var.getClass();
                    WindowInsets build = new WindowInsets.Builder().build();
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    rootView = l.getRootView();
                    jrt0Var.j = (build == rootView.computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true;
                    ((ViewGroup) fragmentActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
            }
        };
    }

    @Override // defpackage.krt0
    public final void a() {
        int i;
        FragmentActivity fragmentActivity = this.a;
        Resources.Theme theme = fragmentActivity.getTheme();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(dog0.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            fragmentActivity.setTheme(i);
        }
        ((ViewGroup) fragmentActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1] */
    @Override // defpackage.krt0
    public final void b(e89 e89Var) {
        this.f = e89Var;
        final View findViewById = this.a.findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.i != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.i);
        }
        ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (jrt0.this.f.e()) {
                    return false;
                }
                findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        };
        this.i = r1;
        viewTreeObserver.addOnPreDrawListener(r1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [irt0] */
    @Override // defpackage.krt0
    public final void c() {
        SplashScreen splashScreen;
        splashScreen = this.a.getSplashScreen();
        splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: irt0
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                jrt0 jrt0Var = jrt0.this;
                TypedValue typedValue = new TypedValue();
                FragmentActivity fragmentActivity = jrt0Var.a;
                Resources.Theme theme = fragmentActivity.getTheme();
                Window window = fragmentActivity.getWindow();
                if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                    window.setStatusBarColor(typedValue.data);
                }
                if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                    window.setNavigationBarColor(typedValue.data);
                }
                if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                    if (typedValue.data != 0) {
                        window.addFlags(Integer.MIN_VALUE);
                    } else {
                        window.clearFlags(Integer.MIN_VALUE);
                    }
                }
                if (theme.resolveAttribute(R.attr.enforceNavigationBarContrast, typedValue, true)) {
                    window.setNavigationBarContrastEnforced(typedValue.data != 0);
                }
                if (theme.resolveAttribute(R.attr.enforceStatusBarContrast, typedValue, true)) {
                    window.setStatusBarContrastEnforced(typedValue.data != 0);
                }
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                uwy0.b(theme, viewGroup, typedValue);
                viewGroup.setOnHierarchyChangeListener(null);
                window.setDecorFitsSystemWindows(jrt0Var.j);
                a wrt0Var = Build.VERSION.SDK_INT >= 31 ? new wrt0(fragmentActivity) : new a(fragmentActivity);
                wrt0Var.a();
                ((wrt0) wrt0Var).c = splashScreenView;
                wrt0Var.c();
            }
        });
    }
}
