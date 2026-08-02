package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public abstract class bur {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final zii0 a(View view, View view2) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(b);
        float f2 = (i - i3) + r1.left;
        return new zii0(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i) {
        if (xtr.b(i, 5)) {
            return 33;
        }
        if (xtr.b(i, 6)) {
            return 130;
        }
        if (xtr.b(i, 3)) {
            return 17;
        }
        if (xtr.b(i, 4)) {
            return 66;
        }
        if (xtr.b(i, 1)) {
            return 2;
        }
        return xtr.b(i, 2) ? 1 : null;
    }

    public static final xtr d(int i) {
        if (i == 1) {
            return xtr.a(2);
        }
        if (i == 2) {
            return xtr.a(1);
        }
        if (i == 17) {
            return xtr.a(3);
        }
        if (i == 33) {
            return xtr.a(5);
        }
        if (i == 66) {
            return xtr.a(4);
        }
        if (i != 130) {
            return null;
        }
        return xtr.a(6);
    }
}
