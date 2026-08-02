package xsna;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: InitDelegate.kt */
/* loaded from: classes16.dex */
public final class txw implements io2 {
    public final /* synthetic */ ars0 b;

    public txw(ars0 ars0Var) {
        this.b = ars0Var;
    }

    @Override // xsna.io2
    public final void C() {
        bmp0.a(null);
        fjz fjzVar = ((VideoLargeListState) ((b2a) this.b.b.b).getCurrentState()).v;
        if (fjzVar != null) {
            fjzVar.resume();
        }
    }

    @Override // xsna.io2
    public final void D0() {
        bmp0.a(null);
    }

    @Override // xsna.io2
    public final boolean G() {
        return !((VideoLargeListState) ((b2a) this.b.b.b).getCurrentState()).n.g();
    }

    @Override // xsna.io2
    public final void J() {
        yg5 yg5Var = bmp0.a;
        bmp0.a(((VideoLargeListState) ((b2a) this.b.b.b).getCurrentState()).r);
    }

    @Override // xsna.io2
    public final boolean M() {
        com.vk.libvideo.autoplay.a aVar;
        ars0 ars0Var = this.b;
        mcc0 mcc0Var = ars0Var.b;
        mcc0 mcc0Var2 = ars0Var.b;
        return ((VideoLargeListState) ((b2a) mcc0Var.b).getCurrentState()).t.f && ((VideoLargeListState) ((b2a) mcc0Var2.b).getCurrentState()).t.a.T3() && (aVar = ((VideoLargeListState) ((b2a) mcc0Var2.b).getCurrentState()).s) != null && aVar.g;
    }

    @Override // xsna.io2
    public final void e0() {
        yg5 yg5Var = bmp0.a;
        bmp0.a(((VideoLargeListState) ((b2a) this.b.b.b).getCurrentState()).r);
    }

    @Override // xsna.io2
    public final boolean f0() {
        return true;
    }

    @Override // xsna.io2
    public final Rect g0() {
        return zjq.n(((VideoLargeListState) ((b2a) this.b.b.b).getCurrentState()).n);
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
        return zjq.n(((VideoLargeListState) ((b2a) this.b.b.b).getCurrentState()).n);
    }
}
