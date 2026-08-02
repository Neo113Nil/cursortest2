package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class zwt0 {
    public static final Activity a(View view) {
        Context context;
        Activity h;
        do {
            ViewParent parent = view.getParent();
            boolean z = parent instanceof ViewGroup;
            ViewGroup viewGroup = z ? (ViewGroup) parent : null;
            if (viewGroup != null && (context = viewGroup.getContext()) != null && (h = e3m.h(context)) != null) {
                return h;
            }
            view = z ? (ViewGroup) parent : null;
        } while (view != null);
        return null;
    }

    public static final int b(Context context) {
        int identifier;
        int i = context.getResources().getConfiguration().orientation;
        if (fnj.d(context)) {
            identifier = context.getResources().getIdentifier(i != 1 ? "navigation_bar_height_landscape" : "navigation_bar_height", "dimen", "android");
        } else {
            identifier = context.getResources().getIdentifier(i != 1 ? "navigation_bar_width" : "navigation_bar_height", "dimen", "android");
        }
        if (identifier > 0) {
            return context.getResources().getDimensionPixelOffset(identifier);
        }
        return 0;
    }
}
