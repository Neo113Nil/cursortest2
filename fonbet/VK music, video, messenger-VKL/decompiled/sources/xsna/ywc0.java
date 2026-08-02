package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PreDrawListener.java */
/* loaded from: classes13.dex */
public final class ywc0 implements ViewTreeObserver.OnPreDrawListener {
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicReference<View> c;
    public final to2 d;

    public ywc0(View view, to2 to2Var) {
        this.c = new AtomicReference<>(view);
        this.d = to2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.c.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.post(this.d);
        return true;
    }
}
