package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import com.vk.imageloader.view.VKImageView;
import com.vk.media.MediaUtils;
import com.vk.media.player.video.view.SimpleVideoView;
import java.io.File;
import java.util.Objects;
import kotlin.text.Regex;
import xsna.grt0;
import xsna.m4g0;

/* compiled from: ReplyVideoViewSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class u4g0 extends grt0 implements l4g0, htp0 {
    public mat0 w;
    public boolean x;
    public boolean y;

    private static final void setupMaxDuration$lambda$5$lambda$4(u4g0 u4g0Var) {
        SimpleVideoView simpleVideoView = u4g0Var.r;
        if (simpleVideoView != null ? simpleVideoView.I : false) {
            u4g0Var.x();
        }
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        getContext();
        throw null;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        getContext();
        throw null;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public final void F0(Canvas canvas, boolean z) {
        if (!z) {
            super.F0(canvas, z);
            return;
        }
        VKImageView previewImageView = getPreviewImageView();
        if (previewImageView != null) {
            bwt0.p0(previewImageView, !getDrawTopLayer());
        }
        if (!getDrawTopLayer()) {
            throw null;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u4g0 ? (u4g0) obj : null) != null;
    }

    @Override // xsna.l4g0
    public final void f(Bitmap bitmap) {
        if (kd7.g(getContext(), bitmap) != null) {
            throw null;
        }
    }

    public boolean getDrawTopLayer() {
        return this.y;
    }

    public final boolean getHasMusic() {
        return this.x;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 1.5f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMinScaleLimit() {
        return 0.25f;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        m4g0.a aVar = m4g0.a;
        throw null;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        m4g0.a aVar = m4g0.a;
        Context context = getContext();
        aVar.getClass();
        return m4g0.a.a(context) + (m4g0.a.c * 2);
    }

    public final m4g0 getOverlayDelegate() {
        return null;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 5;
    }

    @Override // xsna.grt0, xsna.oit0
    public wds0 getVideoData() {
        mat0 mat0Var = this.w;
        if (mat0Var != null) {
            return mat0Var.d();
        }
        return null;
    }

    @Override // xsna.grt0, xsna.oit0
    public int getVideoRadius() {
        m4g0.a.getClass();
        return an10.b(m4g0.a.b);
    }

    public final int hashCode() {
        return Objects.hash(null);
    }

    @Override // xsna.oit0
    public final Matrix l(int i, int i2, MediaUtils.d dVar) {
        m4g0.a aVar = m4g0.a;
        Context context = getContext();
        aVar.getClass();
        m4g0.a.a(context);
        throw null;
    }

    @Override // xsna.grt0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i5 = 0;
            while (true) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    m4g0.a.getClass();
                    childAt.layout((r2 + i) - 1, (r2 + i2) - 1, (i3 - m4g0.a.c) + 1, (i4 - m4g0.a.d) + 1);
                }
                if (i5 == childCount) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        throw null;
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        throw null;
    }

    @Override // xsna.grt0
    public final void p() {
        String str;
        grt0.a videoSettings = getVideoSettings();
        if (videoSettings == null || (str = videoSettings.a) == null) {
            str = "";
        }
        File file = new File(str);
        Regex regex = com.vk.core.files.a.a;
        if (vhk0.g(file)) {
            SimpleVideoView videoView = getVideoView();
            mat0 mat0Var = new mat0(file, false, 0L, videoView != null ? videoView.getEndOnTimeMs() : 0L, q(), null, 480);
            mat0Var.e();
            this.w = mat0Var;
        }
    }

    public final void setDeterminateProgress(boolean z) {
        throw null;
    }

    @Override // xsna.htp0
    public void setDrawTopLayer(boolean z) {
        this.y = z;
    }

    public final void setHasMusic(boolean z) {
        this.x = z;
    }

    @Override // xsna.l4g0
    public void setLoadingVisible(boolean z) {
        throw null;
    }

    @Override // xsna.grt0
    public void setMute(boolean z) {
        mat0 mat0Var;
        super.setMute(z);
        if (this.v || (mat0Var = this.w) == null) {
            return;
        }
        mat0Var.e = z;
    }

    public final void setPreviewBitmap(Bitmap bitmap) {
        if (getFirstFrameBitmap() == null) {
            Bitmap v = v(bitmap);
            VKImageView previewImageView = getPreviewImageView();
            if (previewImageView != null) {
                previewImageView.setImageBitmap(v);
            }
        }
    }

    public final void setProgress(int i) {
        throw null;
    }

    @Override // xsna.nxt0, xsna.nov
    public void setTimestampMsValue(int i) {
        throw null;
    }

    @Override // xsna.grt0
    public final Bitmap v(Bitmap bitmap) {
        float originalWidth = getOriginalWidth();
        m4g0.a.getClass();
        return kd7.h(getContext(), kd7.b(bitmap, an10.b(originalWidth - (r1 * 2)), an10.b((getOriginalHeight() - m4g0.a.c) - m4g0.a.d), false, false), m4g0.a.b);
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean z0() {
        throw null;
    }
}
