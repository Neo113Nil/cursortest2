package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import java.util.HashSet;
import xsna.ek8;

/* compiled from: FullscreenKeyboardHelper.java */
/* loaded from: classes17.dex */
public final class ays implements ViewTreeObserver.OnGlobalLayoutListener {
    public ek8.b b;
    public boolean c = true;
    public final Activity d;
    public final Window e;
    public Object f;
    public final View g;

    /* compiled from: FullscreenKeyboardHelper.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean isPaused();
    }

    public ays(Activity activity, Window window, View view) {
        this.d = activity;
        this.e = window;
        this.g = view;
    }

    public final void a(a aVar) {
        this.f = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ays$a] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        ?? r0 = this.f;
        if ((r0 == 0 || !r0.isPaused()) && (view = this.g) != null) {
            boolean a2 = gz80.a(24);
            Activity activity = this.d;
            if (a2 ? activity.isInMultiWindowMode() : false) {
                return;
            }
            Rect rect = new Rect();
            Window window = this.e;
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = window.getDecorView().getContext().getResources().getDisplayMetrics().heightPixels;
            int i2 = rect.top;
            if (i2 == 0) {
                HashSet hashSet = iah0.a;
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
                i2 = (displayCutout == null || !gz80.a(28)) ? 0 : displayCutout.getSafeInsetTop();
            }
            int max = Math.max(i - rect.bottom, 0);
            boolean z = this.c || (!iah0.n(activity) && !oen.a());
            if (max != 0 && z) {
                max += i2;
            }
            if (view.getPaddingBottom() != max) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), max);
                ek8.b bVar = this.b;
                if (bVar != null) {
                    bVar.invoke(Integer.valueOf(max));
                }
            }
            Rect rect2 = new Rect();
            rect2.bottom = max;
            int i3 = ify.a;
            ify.f(rect2);
        }
    }
}
