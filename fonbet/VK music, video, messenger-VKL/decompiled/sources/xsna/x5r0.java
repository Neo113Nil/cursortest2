package xsna;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import kotlin.LazyThreadSafetyMode;

/* compiled from: UxUtils.kt */
/* loaded from: classes8.dex */
public final class x5r0 {
    public static final Object a;
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;
    public static final Object f;
    public static final Object g;
    public static final Object h;
    public static final Object i;
    public static final Object j;
    public static final Object k;
    public static final Object l;

    static {
        e1m0 e1m0Var = new e1m0(5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = msy.a(lazyThreadSafetyMode, e1m0Var);
        b = msy.a(lazyThreadSafetyMode, new gwd0(11));
        int i2 = 8;
        c = msy.a(lazyThreadSafetyMode, new vqf0(i2));
        d = msy.a(lazyThreadSafetyMode, new wqf0(i2));
        e = msy.a(lazyThreadSafetyMode, new xqf0(7));
        f = msy.a(lazyThreadSafetyMode, new k5f0(11));
        g = msy.a(lazyThreadSafetyMode, new t970(14));
        h = msy.a(lazyThreadSafetyMode, new tj2(27));
        i = msy.a(lazyThreadSafetyMode, new w0o0(4));
        j = msy.a(lazyThreadSafetyMode, new fd90(14));
        k = msy.a(lazyThreadSafetyMode, new tqf0(5));
        l = msy.a(lazyThreadSafetyMode, new f7q0(2));
    }

    public static float a(float f2, int i2) {
        return TypedValue.applyDimension(i2, f2, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static int b() {
        return ((Number) j.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static int c() {
        return ((Number) e.getValue()).intValue();
    }

    public static void d(int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.bottomMargin != i2) {
                marginLayoutParams.bottomMargin = i2;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static void e(int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginEnd() != i2) {
                marginLayoutParams.setMarginEnd(i2);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static void f(int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginStart() != i2) {
                marginLayoutParams.setMarginStart(i2);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static void g(int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != i2) {
                marginLayoutParams.topMargin = i2;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static void h(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginStart() == i2 && marginLayoutParams.topMargin == i3 && marginLayoutParams.getMarginEnd() == i4 && marginLayoutParams.bottomMargin == i5) {
                return;
            }
            marginLayoutParams.setMarginStart(i2);
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.setMarginEnd(i4);
            marginLayoutParams.bottomMargin = i5;
            view.setLayoutParams(layoutParams);
        }
    }
}
