package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import com.vk.media.MediaUtils;
import com.vk.media.player.video.VideoSourceType;
import com.vk.media.player.video.view.SimpleVideoView;

/* compiled from: BackgroundVideoViewSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class qx5 extends grt0 {
    public final mat0 w;
    public final float x;
    public final float y;
    public boolean z;

    public qx5() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qx5(Context context, mat0 mat0Var, ft0 ft0Var, op0 op0Var, Bitmap bitmap, ux0 ux0Var, rmg rmgVar, int i) {
        super(context, Uri.fromFile(mat0Var.a), bitmap, r4, r5, r6, 272);
        ft0 ft0Var2 = (i & 4) != 0 ? null : ft0Var;
        op0 op0Var2 = (i & 8) != 0 ? null : op0Var;
        ux0 ux0Var2 = (i & 32) != 0 ? null : ux0Var;
        boolean z = (i & 64) == 0;
        rmg rmgVar2 = (i & 128) != 0 ? null : rmgVar;
        this.w = mat0Var;
        this.x = mat0Var.b();
        this.y = mat0Var.c();
        this.z = true;
        setStatic(true);
        setRemovable(false);
        setStickerScale(iah0.v() / getOriginalWidth());
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.setLoop(false);
            videoView.setOnEndListener(new ox5(videoView, this, ux0Var2));
            videoView.setOnFirstFrameRenderedListener(new px5(rmgVar2, this));
            videoView.K = mat0Var.c;
            videoView.L = mat0Var.d;
            videoView.r(new o4(videoView, 19));
            videoView.setPlayWhenReady(this.j);
        }
        setPreviewMode(-1);
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        return super.E0(new qx5(getContext(), this.w, null, null, getFirstFrameBitmap(), null, null, 172));
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new qx5(getContext(), this.w, null, null, getFirstFrameBitmap(), null, null, 236));
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.x;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.y;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 0;
    }

    @Override // xsna.grt0, xsna.oit0
    public wds0 getVideoData() {
        return this.w.d();
    }

    public final mat0 getVideoRawData() {
        return this.w;
    }

    @Override // xsna.oit0
    public final Matrix l(int i, int i2, MediaUtils.d dVar) {
        float max = Math.max(getOriginalWidth() / dVar.a, getOriginalHeight() / dVar.b);
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        return matrix;
    }

    @Override // xsna.grt0, xsna.oit0
    public final boolean n() {
        return this.z;
    }

    @Override // xsna.grt0
    public void setPermanentMute(boolean z) {
        this.z = z;
    }

    @Override // xsna.grt0
    public final void t(long j) {
        r();
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.r(new qnz(videoView, this.w.c + j, 1));
        }
    }

    @Override // xsna.grt0
    public final void z() {
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.setVideoSourceType(VideoSourceType.MP4);
        }
        wds0 d = this.w.d();
        SimpleVideoView videoView2 = getVideoView();
        if (videoView2 != null) {
            videoView2.s(d, true, 0L, true);
        }
    }
}
