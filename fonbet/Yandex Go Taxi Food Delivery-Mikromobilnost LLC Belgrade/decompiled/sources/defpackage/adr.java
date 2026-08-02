package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.ybsdk.core.analytics.performance.FirstDrawListener$drawListener$1;
import defpackage.adr;

/* loaded from: classes15.dex */
public final class adr {
    public final View a;
    public final sls b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public boolean d;
    public final FirstDrawListener$drawListener$1 e;

    public adr(View view, sls slsVar) {
        this.a = view;
        this.b = slsVar;
        FirstDrawListener$drawListener$1 firstDrawListener$drawListener$1 = new FirstDrawListener$drawListener$1(this);
        this.e = firstDrawListener$drawListener$1;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ybsdk.core.analytics.performance.FirstDrawListener$attachListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View p0) {
                if (adr.this.a.getViewTreeObserver().isAlive()) {
                    adr.this.a.getViewTreeObserver().addOnDrawListener(adr.this.e);
                }
                adr.this.a.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View p0) {
            }
        };
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnDrawListener(firstDrawListener$drawListener$1);
        } else {
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }
}
