package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.vkontakte.android.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import xsna.iut0;
import xsna.x1u0;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class p23 implements u080 {
    public final /* synthetic */ o23 b;

    public p23(o23 o23Var) {
        this.b = o23Var;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        boolean z;
        boolean z2;
        int d = bqx0Var.d();
        o23 o23Var = this.b;
        Context context = o23Var.l;
        int d2 = bqx0Var.d();
        ActionBarContextView actionBarContextView = o23Var.w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o23Var.w.getLayoutParams();
            if (o23Var.w.isShown()) {
                if (o23Var.e0 == null) {
                    o23Var.e0 = new Rect();
                    o23Var.f0 = new Rect();
                }
                Rect rect = o23Var.e0;
                Rect rect2 = o23Var.f0;
                rect.set(bqx0Var.b(), bqx0Var.d(), bqx0Var.c(), bqx0Var.a());
                ViewGroup viewGroup = o23Var.C;
                if (Build.VERSION.SDK_INT >= 29) {
                    x1u0.a.a(viewGroup, rect, rect2);
                } else {
                    if (!x1u0.a) {
                        x1u0.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            x1u0.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                x1u0.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = x1u0.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = o23Var.C;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                bqx0 a = iut0.e.a(viewGroup2);
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
                if (i <= 0 || o23Var.E != null) {
                    View view2 = o23Var.E;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            o23Var.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    o23Var.E = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    o23Var.C.addView(o23Var.E, -1, layoutParams);
                }
                View view4 = o23Var.E;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = o23Var.E;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!o23Var.J && r9) {
                    d2 = 0;
                }
                z = r9;
                r9 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r9 = false;
            }
            if (r9) {
                o23Var.w.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = o23Var.E;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return iut0.l(view, d != d2 ? bqx0Var.f(bqx0Var.b(), d2, bqx0Var.c(), bqx0Var.a()) : bqx0Var);
    }
}
