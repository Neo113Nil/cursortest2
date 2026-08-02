package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: ImInlineVideoPlayerVC.kt */
/* loaded from: classes2.dex */
public final class r4w extends ViewOutlineProvider {
    public final /* synthetic */ com.vk.im.video.g a;

    public r4w(com.vk.im.video.g gVar) {
        this.a = gVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a.d0);
    }
}
