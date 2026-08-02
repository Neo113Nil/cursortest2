package xsna;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: AnimationDialogCallbackFactory.kt */
/* loaded from: classes2.dex */
public final class ko2 implements io2 {
    public final /* synthetic */ i70 b;
    public final /* synthetic */ VideoResizer.VideoFitType c;

    public ko2(i70 i70Var, VideoResizer.VideoFitType videoFitType) {
        this.b = i70Var;
        this.c = videoFitType;
    }

    @Override // xsna.io2
    public final boolean G() {
        return false;
    }

    @Override // xsna.io2
    public final boolean M() {
        return false;
    }

    @Override // xsna.io2
    public final boolean f0() {
        return true;
    }

    @Override // xsna.io2
    public final Rect g0() {
        return (Rect) this.b.c;
    }

    @Override // xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        return this.c;
    }

    @Override // xsna.io2
    public final float i0() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.io2
    public final Rect t0() {
        return (Rect) this.b.c;
    }

    @Override // xsna.io2
    public final void C() {
    }

    @Override // xsna.io2
    public final void D0() {
    }

    @Override // xsna.io2
    public final void J() {
    }

    @Override // xsna.io2
    public final void e0() {
    }
}
