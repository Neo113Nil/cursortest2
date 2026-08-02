package xsna;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.photoviewer.PhotoViewerLayout;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class yvt0 implements f5z, View.OnAttachStateChangeListener {
    public final androidx.lifecycle.m b = new androidx.lifecycle.m(this, true);

    public yvt0(PhotoViewerLayout photoViewerLayout) {
        photoViewerLayout.addOnAttachStateChangeListener(this);
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.e(Lifecycle.State.RESUMED);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.e(Lifecycle.State.DESTROYED);
    }
}
