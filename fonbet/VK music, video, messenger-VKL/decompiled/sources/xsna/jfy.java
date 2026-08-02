package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.view.Window;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jfy implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Window c;

    public /* synthetic */ jfy(Activity activity, Window window) {
        this.b = activity;
        this.c = window;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int w;
        boolean a = gz80.a(24);
        Activity activity = this.b;
        if (a && activity.isInMultiWindowMode()) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        this.c.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (iah0.s(activity)) {
            w = iah0.e(activity) + Math.max(activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels);
        } else {
            w = iah0.w(activity);
        }
        rect2.bottom = Math.max(w - rect.bottom, 0);
        int i = ify.a;
        ify.f(rect2);
    }
}
