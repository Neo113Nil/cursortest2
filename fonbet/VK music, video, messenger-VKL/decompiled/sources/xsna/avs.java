package xsna;

import android.graphics.Bitmap;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import java.lang.ref.SoftReference;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FullInteractiveStateDelegate.kt */
/* loaded from: classes3.dex */
public final class avs extends af6 {
    public final Object d;
    public final Object e;

    public avs(evs evsVar) {
        super(evsVar);
        z4f z4fVar = new z4f(evsVar, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, z4fVar);
        this.e = msy.a(lazyThreadSafetyMode, new yqf(evsVar, 19));
    }

    @Override // xsna.io2
    public final void C() {
        k().setHasTransientState(false);
    }

    @Override // xsna.io2
    public final void J() {
        k().setAlpha(1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.io2
    public final void e0() {
        if (((View) this.d.getValue()).isAttachedToWindow()) {
            k().animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setStartDelay(BaseAnimationDialog.b0).setDuration(BaseAnimationDialog.c0).start();
        }
        k().setHasTransientState(true);
    }

    @Override // xsna.af6, xsna.c56
    public final View f() {
        return k();
    }

    @Override // xsna.af6, xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        return VideoTextureView.a.a(k().getTransformController().e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VideoTextureView k() {
        return (VideoTextureView) this.e.getValue();
    }

    @Override // xsna.io2
    public final void D0() {
    }
}
