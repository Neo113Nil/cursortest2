package xsna;

import android.view.ViewTreeObserver;
import com.vk.core.view.MaskableFrameLayout;
import com.vk.log.L;

/* compiled from: MaskableFrameLayout.java */
/* loaded from: classes17.dex */
public final class vg10 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ MaskableFrameLayout c;

    public vg10(MaskableFrameLayout maskableFrameLayout, ViewTreeObserver viewTreeObserver) {
        this.c = maskableFrameLayout;
        this.b = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.b;
        boolean isAlive = viewTreeObserver.isAlive();
        MaskableFrameLayout maskableFrameLayout = this.c;
        if (!isAlive) {
            viewTreeObserver = maskableFrameLayout.getViewTreeObserver();
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        } else {
            L.e("GlobalLayoutListener not removed as ViewTreeObserver is not valid");
        }
        maskableFrameLayout.b(maskableFrameLayout.a(maskableFrameLayout.c));
    }
}
