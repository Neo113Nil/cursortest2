package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.player.video.VideoScale;
import com.vk.media.player.video.view.SimpleVideoView;
import java.util.Objects;

/* compiled from: CameraVideoViewSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class lo9 extends grt0 implements SimpleVideoView.k, dh9 {
    public final mat0 w;
    public final SimpleVideoView.i x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lo9(Context context, mat0 mat0Var, u440 u440Var, ft0 ft0Var, op0 op0Var, Bitmap bitmap, ux0 ux0Var, boolean z, int i) {
        super(context, Uri.fromFile(mat0Var.a), bitmap, r4, r5, r6, r7, (i & 256) == 0, (i & 512) != 0 ? true : z);
        u440 u440Var2 = (i & 4) != 0 ? null : u440Var;
        ft0 ft0Var2 = (i & 8) != 0 ? null : ft0Var;
        op0 op0Var2 = (i & 16) != 0 ? null : op0Var;
        ux0 ux0Var2 = (i & 64) != 0 ? null : ux0Var;
        boolean z2 = (i & 128) != 0;
        this.w = mat0Var;
        this.x = ux0Var2;
        setRemovable(false);
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.setLoop(false);
            videoView.setNeedRequestAudioFocus(mat0Var.f);
            videoView.setOnEndListener(new ko9(videoView, this));
            videoView.K = mat0Var.c;
            videoView.L = mat0Var.d;
            videoView.r(new o4(videoView, 19));
            videoView.setPlayWhenReady(z2);
        }
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        lo9 lo9Var = new lo9(getContext(), this.w, null, null, null, getFirstFrameBitmap(), null, false, 732);
        lo9Var.setPermanentMute(this.v);
        return lo9Var;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return new lo9(getContext(), this.w, null, null, null, getFirstFrameBitmap(), null, false, 988);
    }

    @Override // xsna.nxt0, xsna.nov
    public final void G0(Canvas canvas) {
        if (getPrevMode() == -1) {
            draw(canvas);
            return;
        }
        int prevMode = getPrevMode();
        Bitmap lastFrameBitmap = prevMode != 0 ? prevMode != 1 ? null : getLastFrameBitmap() : getFirstFrameBitmap();
        if (lastFrameBitmap != null) {
            canvas.drawBitmap(lastFrameBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        } else {
            L.l("You try use preview mode without pre cache bitmaps!");
        }
    }

    public final boolean equals(Object obj) {
        lo9 lo9Var = obj instanceof lo9 ? (lo9) obj : null;
        return epx.f(this.w, lo9Var != null ? lo9Var.w : null);
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanStickToSafeZoneGuideLines() {
        return false;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 4.0f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMinScaleLimit() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getMovePointersCount() {
        return 2;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.w.b();
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.w.c();
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 1;
    }

    public final mat0 getVideo() {
        return this.w;
    }

    @Override // xsna.grt0, xsna.oit0
    public wds0 getVideoData() {
        return this.w.d();
    }

    public final SimpleVideoView.i getVideoEndListener() {
        return this.x;
    }

    public final int hashCode() {
        return Objects.hashCode(this.w);
    }

    @Override // xsna.oit0
    public final Matrix l(int i, int i2, MediaUtils.d dVar) {
        Matrix matrix;
        Matrix matrix2 = new Matrix();
        mat0 mat0Var = this.w;
        int c = mat0Var.c();
        int b = this.w.b();
        if (mat0Var.j != null) {
            VideoScale videoScale = mat0Var.k;
            int c2 = mat0Var.c();
            int b2 = mat0Var.b();
            videoScale.b = c2;
            videoScale.c = b2;
            videoScale.d = c;
            videoScale.e = b;
            matrix = videoScale.a();
        } else {
            matrix = new Matrix();
        }
        matrix2.set(matrix);
        matrix2.postConcat(getStickerMatrix());
        float b3 = getCommons().b() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getCommons().b() : i;
        float f = getCommons().f() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getCommons().f() : i2;
        float f2 = i;
        float f3 = i2;
        float min = Math.min(f2 / b3, f3 / f);
        matrix2.postScale(min, min);
        matrix2.postTranslate((f2 - (b3 * min)) / 2.0f, (f3 - (f * min)) / 2.0f);
        float f4 = dVar.a;
        float f5 = dVar.b;
        float min2 = Math.min(f4 / f2, f5 / f3);
        float a = yq.a(f2, min2, f4, 2.0f);
        float a2 = yq.a(f3, min2, f5, 2.0f);
        matrix2.postScale(min2, min2);
        matrix2.postTranslate(a, a2);
        Matrix matrix3 = new Matrix();
        return matrix2.invert(matrix3) ? matrix3 : new Matrix();
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.k
    public final void p0(Integer num) {
        SimpleVideoView videoView;
        if (this.w.b && (videoView = getVideoView()) != null) {
            videoView.setScaleX(-1.0f);
        }
        getIntFirstFrameListenter().p0(num);
    }

    @Override // xsna.grt0
    public final void s() {
        r();
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.r(new qnz(videoView, this.w.c, 1));
        }
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
    public final void y() {
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.r(new qnz(videoView, this.w.c, 1));
        }
    }
}
