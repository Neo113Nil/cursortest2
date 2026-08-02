package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import xsna.bqx0;
import xsna.efy;
import xsna.iut0;

/* compiled from: VkAuthFragmentLifeCycle.kt */
/* loaded from: classes.dex */
public class ecu0 {
    public final Fragment a;

    public ecu0(Fragment fragment) {
        this.a = fragment;
    }

    public static void a(WindowInsets windowInsets) {
        Rect rect = new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        LinkedHashSet linkedHashSet = efy.c;
        int i = rect.bottom;
        if (i == efy.b) {
            return;
        }
        efy.b = i;
        if (i > efy.a) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((efy.a) it.next()).x0(i);
            }
        } else {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((efy.a) it2.next()).Y0();
            }
        }
    }

    public final void b() {
        Fragment fragment = this.a;
        f(fragment.getView());
        View view = fragment.getView();
        if (view != null) {
            view.requestApplyInsets();
        }
    }

    public final void c(final View view, boolean z) {
        if (!z) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(view, this) { // from class: xsna.ccu0
                public final /* synthetic */ View a;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    ecu0.a(windowInsets);
                    this.a.onApplyWindowInsets(windowInsets);
                    return windowInsets;
                }
            });
            view.setFitsSystemWindows(true);
            view.setSystemUiVisibility(CoverVideoUploadTask.y);
        } else {
            u080 u080Var = new u080(view, this) { // from class: xsna.dcu0
                public final /* synthetic */ View b;

                @Override // xsna.u080
                public final bqx0 b(View view2, bqx0 bqx0Var) {
                    bqx0.q qVar = bqx0Var.a;
                    h4x i = qVar.i(519);
                    int i2 = qVar.u(8) ? qVar.i(8).d : i.d;
                    int i3 = i.a;
                    int i4 = i.b;
                    int i5 = i.c;
                    View view3 = this.b;
                    view3.setPadding(i3, i4, i5, i2);
                    WindowInsets g = bqx0Var.g();
                    if (g != null) {
                        ecu0.a(g);
                    }
                    view3.onApplyWindowInsets(g);
                    return bqx0Var;
                }
            };
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(view, u080Var);
            view.setSystemUiVisibility(CoverVideoUploadTask.y);
        }
    }

    public final void d(boolean z) {
        bpn0 bpn0Var = t65.a;
        View view = this.a.getView();
        if (view == null) {
            return;
        }
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public void e(boolean z) {
        Window window;
        Window window2;
        bpn0 bpn0Var = t65.a;
        Fragment fragment = this.a;
        View view = fragment.getView();
        if (view != null) {
            Context context = view.getContext();
            Context context2 = context instanceof Activity ? (Activity) context : null;
            if (context2 == null) {
                Context context3 = view.getContext();
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                context2 = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            }
            Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
            if (activity != null && (window2 = activity.getWindow()) != null) {
                View decorView = window2.getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
            }
        }
        FragmentActivity activity2 = fragment.getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        View view2 = fragment.getView();
        Drawable background = view2 != null ? view2.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            int color = colorDrawable.getColor();
            window.setNavigationBarColor(color);
            window.setBackgroundDrawable(new ColorDrawable(color));
        }
    }

    public final void f(View view) {
        bpn0 bpn0Var = t65.a;
        Drawable background = view != null ? view.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        Integer valueOf = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
        boolean z = true;
        if (valueOf != null && n8g.f(valueOf.intValue()) < 0.5d) {
            z = false;
        }
        g(z);
        e(z);
    }

    public void g(boolean z) {
        Window window;
        d(z);
        FragmentActivity activity = this.a.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(0);
    }
}
