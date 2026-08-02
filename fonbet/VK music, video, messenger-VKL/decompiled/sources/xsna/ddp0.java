package xsna;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: TouchDelegateView.kt */
/* loaded from: classes4.dex */
public final class ddp0 extends View {
    public a b;

    /* compiled from: TouchDelegateView.kt */
    public interface a {
        boolean b(MotionEvent motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.b;
        return aVar != null ? aVar.b(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    public final a getDelegate() {
        return this.b;
    }

    public final void setDelegate(a aVar) {
        this.b = aVar;
    }
}
