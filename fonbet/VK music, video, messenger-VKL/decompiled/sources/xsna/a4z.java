package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleAwareLinearLayout.kt */
/* loaded from: classes6.dex */
public class a4z extends LinearLayout implements f5z {
    public final androidx.lifecycle.m b;

    public a4z(Context context) {
        super(context, null, 0);
        this.b = new androidx.lifecycle.m(this, true);
    }

    @Override // xsna.f5z
    public Lifecycle getLifecycle() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.c(Lifecycle.Event.ON_START);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.c(Lifecycle.Event.ON_STOP);
    }
}
