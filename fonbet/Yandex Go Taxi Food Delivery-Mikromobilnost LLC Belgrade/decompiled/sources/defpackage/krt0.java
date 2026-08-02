package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.splashscreen.MaskedDrawable;
import androidx.fragment.app.FragmentActivity;
import defpackage.krt0;
import defpackage.m8t0;
import defpackage.qrt0;
import defpackage.xrt0;

/* loaded from: classes.dex */
public class krt0 {
    public final FragmentActivity a;
    public Integer b;
    public Integer c;
    public Drawable d;
    public boolean e;
    public lrt0 f = new yci0();
    public qrt0 g;
    public xrt0 h;

    public krt0(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    public void a() {
        int i;
        TypedValue typedValue = new TypedValue();
        FragmentActivity fragmentActivity = this.a;
        Resources.Theme theme = fragmentActivity.getTheme();
        if (theme.resolveAttribute(dog0.windowSplashScreenBackground, typedValue, true)) {
            this.b = Integer.valueOf(typedValue.resourceId);
            this.c = Integer.valueOf(typedValue.data);
        }
        if (theme.resolveAttribute(dog0.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.d = theme.getDrawable(typedValue.resourceId);
        }
        if (theme.resolveAttribute(dog0.splashScreenIconSize, typedValue, true)) {
            this.e = typedValue.resourceId == cug0.splashscreen_icon_size_with_background;
        }
        if (!theme.resolveAttribute(dog0.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        fragmentActivity.setTheme(i);
    }

    public void b(e89 e89Var) {
        this.f = e89Var;
        final View findViewById = this.a.findViewById(R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                qrt0 qrt0Var;
                if (krt0.this.f.e()) {
                    return false;
                }
                findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                krt0 krt0Var = krt0.this;
                xrt0 xrt0Var = krt0Var.h;
                if (xrt0Var == null || (qrt0Var = krt0Var.g) == null) {
                    return true;
                }
                krt0Var.g = null;
                xrt0Var.a.b().postOnAnimation(new m8t0(xrt0Var, qrt0Var));
                return true;
            }
        });
    }

    public void c() {
        float dimension;
        this.g = qrt0.a;
        FragmentActivity fragmentActivity = this.a;
        final xrt0 xrt0Var = new xrt0(fragmentActivity);
        Integer num = this.b;
        Integer num2 = this.c;
        ViewGroup b = xrt0Var.a.b();
        if (num != null && num.intValue() != 0) {
            b.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            b.setBackgroundColor(num2.intValue());
        } else {
            b.setBackground(fragmentActivity.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            ImageView imageView = (ImageView) b.findViewById(gjh0.splashscreen_icon_view);
            if (this.e) {
                Drawable drawable2 = imageView.getContext().getDrawable(p2h0.icon_background);
                dimension = imageView.getResources().getDimension(cug0.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawable2 != null) {
                    imageView.setBackground(new MaskedDrawable(drawable2, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(cug0.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new MaskedDrawable(drawable, dimension));
        }
        b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    boolean e = krt0.this.f.e();
                    krt0 krt0Var = krt0.this;
                    xrt0 xrt0Var2 = xrt0Var;
                    if (e) {
                        krt0Var.h = xrt0Var2;
                        return;
                    }
                    qrt0 qrt0Var = krt0Var.g;
                    if (qrt0Var == null) {
                        return;
                    }
                    krt0Var.g = null;
                    xrt0Var2.a.b().postOnAnimation(new m8t0(xrt0Var2, qrt0Var));
                }
            }
        });
    }
}
