package xsna;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: ClipsViewerCallback.kt */
/* loaded from: classes2.dex */
public final class bof implements io2 {
    public final hg b;
    public final a44 c;
    public final com.vk.movika.sdk.base.logic.processor.actions.f d;
    public final de4 e;

    public bof(hg hgVar, com.vk.movika.sdk.base.logic.processor.actions.f fVar) {
        a44 a44Var = new a44(9);
        de4 de4Var = new de4(12);
        this.b = hgVar;
        this.c = a44Var;
        this.d = fVar;
        this.e = de4Var;
    }

    @Override // xsna.io2
    public final void C() {
        this.e.getClass();
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.io2
    public final void D0() {
        this.c.getClass();
        s3q0 s3q0Var = s3q0.a;
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
