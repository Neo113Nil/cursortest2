package xsna;

import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: DesignViewExt.kt */
/* loaded from: classes.dex */
public final class f4m {
    public static final void A(View view, Size size) {
        z(size.getWidth(), size.getHeight(), view);
    }

    public static final void B(int i, int i2, View view) {
        if (i == view.getPaddingTop() && i2 == view.getPaddingBottom()) {
            return;
        }
        view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), i2);
    }

    public static final void C(int i, View view) {
        z(i, view.getLayoutParams().height, view);
    }

    public static final void D(View view, boolean z) {
        view.setVisibility(z ? 0 : 4);
    }

    public static final void E(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static void a(View view, gzs gzsVar) {
        view.addOnLayoutChangeListener(new e4m(view, gzsVar));
    }

    public static final Rect b(View view) {
        return w11.d(view);
    }

    public static final Rect c(View view) {
        Rect rect = new Rect();
        d(rect, view);
        return rect;
    }

    public static final void d(Rect rect, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getMeasuredWidth() + i, view.getMeasuredHeight() + iArr[1]);
    }

    public static final Rect e(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getMeasuredWidth() + i, view.getMeasuredHeight() + iArr[1]);
    }

    public static final boolean f(View view) {
        return view != null && view.getVisibility() == 8;
    }

    public static final boolean g(View view) {
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        return !z;
    }

    public static final boolean h(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static final void i(View view, CharSequence... charSequenceArr) {
        view.setContentDescription(rl3.Z(charSequenceArr, ". ", null, null, null, 62));
    }

    public static final void j(View view) {
        view.setVisibility(8);
    }

    public static final void k(int i, View view) {
        z(view.getLayoutParams().width, i, view);
    }

    public static final void l(int i, int i2, View view) {
        if (i == view.getPaddingStart() && i2 == view.getPaddingEnd()) {
            return;
        }
        view.setPaddingRelative(i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static final void m(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof CoordinatorLayout.f) {
            ((CoordinatorLayout.f) layoutParams).c = i;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void n(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void o(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final void p(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void q(int i, View view) {
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            return;
        } else {
            i2 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
        }
        if (i2 != i) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
            } else if (!(marginLayoutParams instanceof FrameLayout.LayoutParams)) {
                return;
            } else {
                ((FrameLayout.LayoutParams) layoutParams).bottomMargin = i;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void r(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginEnd() != i) {
                marginLayoutParams.setMarginEnd(i);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void s(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginStart() != i) {
                marginLayoutParams.setMarginStart(i);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void t(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void u(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginStart() == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.getMarginEnd() == i3 && marginLayoutParams.bottomMargin == i4) {
                return;
            }
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.setMarginEnd(i3);
            marginLayoutParams.bottomMargin = i4;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void v(int i, View view) {
        if (i == view.getPaddingBottom()) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final void w(int i, View view) {
        if (i == view.getPaddingEnd()) {
            return;
        }
        view.setPaddingRelative(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void x(int i, View view) {
        if (i == view.getPaddingStart()) {
            return;
        }
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void y(int i, View view) {
        if (i == view.getPaddingTop()) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void z(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == layoutParams.width && i2 == layoutParams.height) {
            return;
        }
        o(i, i2, view);
    }
}
