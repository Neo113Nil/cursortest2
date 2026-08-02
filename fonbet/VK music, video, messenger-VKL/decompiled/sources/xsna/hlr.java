package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: FirstFrameWaiter.java */
/* loaded from: classes12.dex */
public final class hlr implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ ilr c;

    /* compiled from: FirstFrameWaiter.java */
    public class a implements Runnable {
        public final /* synthetic */ hlr b;

        public a(hlr hlrVar) {
            this.b = hlrVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            auu a = auu.a();
            a.getClass();
            s2r0.a();
            a.d.set(true);
            hlr.this.c.c = true;
            View view = hlr.this.b;
            view.getViewTreeObserver().removeOnDrawListener(this.b);
            hlr.this.c.b.clear();
        }
    }

    public hlr(ilr ilrVar, View view) {
        this.c = ilrVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        s2r0.f().post(new a(this));
    }
}
