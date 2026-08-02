package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class ir31 {
    public static final WindowInsets a = n751.b.g();
    public static boolean b = false;

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(vih0.tag_on_apply_window_listener);
        Object tag2 = view.getTag(vih0.tag_window_insets_animation_callback);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        WindowInsets windowInsets2 = a;
        final WindowInsets[] windowInsetsArr = {windowInsets2};
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: gr31
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets3) {
                View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                windowInsetsArr[0] = onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, windowInsets3) : view2.onApplyWindowInsets(windowInsets3);
                return ir31.a;
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(vih0.tag_compat_insets_dispatch);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets3 = windowInsetsArr[0];
        if (windowInsets3 != null && !windowInsets3.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(viewGroup.getChildAt(i), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets4 = windowInsetsArr[0];
        return windowInsets4 != null ? windowInsets4 : windowInsets2;
    }
}
