package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: ClipHeartSlotLottieDecoratorImpl.kt */
/* loaded from: classes17.dex */
public final class wzc implements Drawable.Callback {
    public final /* synthetic */ uzc b;

    public wzc(uzc uzcVar) {
        this.b = uzcVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.b.a.invoke();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
