package androidx.core.splashscreen;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.sls;
import defpackage.vsh0;

/* loaded from: classes.dex */
public class a {
    public final FragmentActivity a;
    public final i3y b = kotlin.a.a(new sls() { // from class: androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl$_splashScreenView$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            View inflate = View.inflate(a.this.a, vsh0.splash_screen_view, null);
            if (inflate != null) {
                return (ViewGroup) inflate;
            }
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup");
            return null;
        }
    });

    public a(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    public void a() {
        View rootView = ((ViewGroup) this.a.findViewById(R.id.content)).getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView((ViewGroup) this.b.getValue());
        }
    }

    public ViewGroup b() {
        return (ViewGroup) this.b.getValue();
    }

    public void c() {
        ViewParent parent = b().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(b());
        }
    }
}
