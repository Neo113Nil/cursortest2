package xsna;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: ImClipsAnimationDialogCallback.kt */
/* loaded from: classes2.dex */
public final class dzv implements io2 {
    public final atm b;
    public final tbh c;
    public final dgm d;
    public final cfl e;

    public dzv(atm atmVar, tbh tbhVar, dgm dgmVar, cfl cflVar) {
        this.b = atmVar;
        this.c = tbhVar;
        this.d = dgmVar;
        this.e = cflVar;
    }

    @Override // xsna.io2
    public final void C() {
        this.e.invoke();
    }

    @Override // xsna.io2
    public final void D0() {
        this.c.invoke();
    }

    @Override // xsna.io2
    public final boolean G() {
        return false;
    }

    @Override // xsna.io2
    public final void J() {
        this.d.invoke();
    }

    @Override // xsna.io2
    public final boolean M() {
        return false;
    }

    @Override // xsna.io2
    public final void e0() {
        this.b.invoke();
    }

    @Override // xsna.io2
    public final boolean f0() {
        return false;
    }

    @Override // xsna.io2
    public final Rect g0() {
        return new Rect();
    }

    @Override // xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        return VideoResizer.VideoFitType.FIT;
    }

    @Override // xsna.io2
    public final float i0() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.io2
    public final Rect t0() {
        return new Rect();
    }
}
