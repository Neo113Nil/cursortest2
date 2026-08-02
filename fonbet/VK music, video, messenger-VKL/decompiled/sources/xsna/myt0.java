package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: ViewMeasurer.java */
/* loaded from: classes17.dex */
public final class myt0 implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference<View> b;
    public final a c;

    /* compiled from: ViewMeasurer.java */
    public interface a {
        void b();
    }

    public myt0(View view, a aVar) {
        this.b = new WeakReference<>(view);
        this.c = aVar;
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public static void a(View view, a aVar) {
        int measuredWidth = view == null ? 0 : view.getMeasuredWidth();
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            new myt0(view, aVar);
        } else {
            aVar.b();
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.b.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    this.c.b();
                }
            }
        }
        return true;
    }
}
