package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class eaz0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ faz0 d;

    public eaz0(faz0 faz0Var, ViewGroup viewGroup, WeakReference weakReference) {
        this.d = faz0Var;
        this.b = viewGroup;
        this.c = weakReference;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        faz0 faz0Var = this.d;
        faz0Var.b(false);
        this.b.removeOnAttachStateChangeListener(this);
        WeakReference weakReference = this.c;
        faz0.a(weakReference);
        faz0Var.k.remove(weakReference);
        faz0Var.c = SystemClock.elapsedRealtime();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
