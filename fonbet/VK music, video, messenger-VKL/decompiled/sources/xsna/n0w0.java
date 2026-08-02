package xsna;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: VkVideoViewerDelegate.kt */
/* loaded from: classes4.dex */
public final class n0w0 {
    public final a a = new a();

    /* compiled from: VkVideoViewerDelegate.kt */
    public static final class a implements io2 {
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
}
