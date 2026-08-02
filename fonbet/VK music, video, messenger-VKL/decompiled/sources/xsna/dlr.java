package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FirstDrawDoneListener.java */
/* loaded from: classes13.dex */
public final class dlr implements ViewTreeObserver.OnDrawListener {
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicReference<View> c;
    public final u12 d;

    public dlr(View view, u12 u12Var) {
        this.c = new AtomicReference<>(view);
        this.d = u12Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.c.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.clr
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                dlr dlrVar = dlr.this;
                dlrVar.getClass();
                andSet.getViewTreeObserver().removeOnDrawListener(dlrVar);
            }
        });
        this.b.postAtFrontOfQueue(this.d);
    }
}
