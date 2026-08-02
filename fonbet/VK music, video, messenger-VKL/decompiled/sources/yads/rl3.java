package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import xsna.epx;

/* loaded from: classes10.dex */
public abstract class rl3 {
    public static final void a(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            viewGroup.removeView(view);
        } else {
            new Handler(Looper.getMainLooper()).post(new xsna.h(13, viewGroup, view));
        }
    }

    public static final void a(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }
}
