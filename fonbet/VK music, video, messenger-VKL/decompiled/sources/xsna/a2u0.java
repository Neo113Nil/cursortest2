package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewUtils.kt */
/* loaded from: classes2.dex */
public final class a2u0 {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ViewUtils.kt */
    public static final class a extends ThreadLocal<Rect> {
        @Override // java.lang.ThreadLocal
        public final Rect initialValue() {
            return new Rect();
        }
    }

    static {
        new a();
    }

    public static void a(int i, int i2, View view) {
        dgn.b(view, i2, i, i2, view.getMeasuredWidth() + i);
    }

    public static void b(int i, int i2, View view) {
        if (view.getVisibility() == 0) {
            a(i, i2, view);
        }
    }

    public static void c(View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, i2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i3, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, view.getLayoutParams().height));
    }

    public static void d(View view, int i, int i2, int i3) {
        if (view.getVisibility() != 8) {
            c(view, i, i2, i3);
        }
    }
}
