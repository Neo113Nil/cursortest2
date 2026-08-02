package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: OnMediaLikeUiComponent.kt */
/* loaded from: classes4.dex */
public final class h880 implements Drawable.Callback {
    public final /* synthetic */ com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a b;

    public h880(com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a aVar) {
        this.b = aVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b2r b2rVar = this.b.h;
        if (b2rVar != null) {
            b2rVar.n();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
