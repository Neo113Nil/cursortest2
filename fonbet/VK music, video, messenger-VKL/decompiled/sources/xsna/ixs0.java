package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vk.media.MediaUtils;
import com.vk.media.player.video.VideoSourceType;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.nov;

/* compiled from: VideoMsgSticker.kt */
/* loaded from: classes6.dex */
public final class ixs0 extends grt0 {
    public final mat0 w;
    public final int x;
    public boolean y;
    public izs<? super Matrix, s3q0> z;

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            ixs0 ixs0Var = ixs0.this;
            ixs0Var.setStickerScale(1.0f);
            nov.a.j(ixs0Var);
            ixs0Var.z.invoke(ixs0Var.getStickerMatrix());
        }
    }

    public ixs0(Context context, mat0 mat0Var, boolean z) {
        super(context, Uri.fromFile(mat0Var.a), null, null, null, z, 380);
        this.w = mat0Var;
        this.x = iah0.a(16);
        this.z = new gz30(27);
        setId(R.id.video_msg_sticker);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!isLaidOut()) {
            addOnLayoutChangeListener(new a());
            return;
        }
        setStickerScale(1.0f);
        nov.a.j(this);
        this.z.invoke(getStickerMatrix());
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        return super.E0(new ixs0(getContext(), this.w, true));
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new ixs0(getContext(), this.w, false));
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public final void F0(Canvas canvas, boolean z) {
        SimpleVideoView videoView;
        if (z && (videoView = getVideoView()) != null) {
            bwt0.p0(videoView, false);
        }
        super.F0(canvas, z);
    }

    @Override // xsna.nxt0, xsna.nov
    public final void a(float f, float f2, float f3) {
        nov.a.f(this, f, f2, f3);
        this.z.invoke(getStickerMatrix());
    }

    @Override // xsna.nxt0, xsna.nov
    public final void e(float f, float f2) {
        nov.a.i(this, f, f2);
        this.z.invoke(getStickerMatrix());
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanRotate() {
        return true;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanScale() {
        return true;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanTranslateX() {
        return true;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanTranslateY() {
        return true;
    }

    public final izs<Matrix, s3q0> getOnMatrixChanged() {
        return this.z;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return getMeasuredHeight();
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return getMeasuredWidth();
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 1;
    }

    @Override // xsna.grt0, xsna.oit0
    public wds0 getVideoData() {
        return this.w.d();
    }

    @Override // xsna.oit0
    public final Matrix l(int i, int i2, MediaUtils.d dVar) {
        mat0 mat0Var = this.w;
        float c = mat0Var.c();
        float b = mat0Var.b();
        float b2 = getCommons().b();
        Float valueOf = Float.valueOf(b2);
        if (b2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : i;
        float f = getCommons().f();
        Float valueOf2 = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.valueOf(f) : null;
        float floatValue2 = valueOf2 != null ? valueOf2.floatValue() : i2;
        Matrix matrix = new Matrix();
        float f2 = floatValue - (this.x * 2);
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        float min = Math.min(f2, floatValue2);
        float min2 = Math.min(min / c, min / b);
        float a2 = wq.a(min, c * min2, 2.0f, (floatValue - min) / 2.0f);
        float a3 = wq.a(min, b * min2, 2.0f, (floatValue2 - min) / 2.0f);
        matrix.setScale(min2, min2);
        matrix.postTranslate(a2, a3);
        matrix.postConcat(getStickerMatrix());
        float f3 = dVar.a;
        float f4 = dVar.b;
        float min3 = Math.min(f3 / floatValue, f4 / floatValue2);
        matrix.postScale(min3, min3);
        matrix.postTranslate((f3 - (floatValue * min3)) / 2.0f, (f4 - (floatValue2 * min3)) / 2.0f);
        Matrix matrix2 = new Matrix();
        if (matrix.invert(matrix2)) {
            matrix.set(matrix2);
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f5 = fArr[1];
        if (-0.001f <= f5 && f5 <= 0.001f) {
            fArr[1] = 0.0f;
        }
        float f6 = fArr[3];
        if (-0.001f <= f6 && f6 <= 0.001f) {
            fArr[3] = 0.0f;
        }
        matrix.setValues(fArr);
        return matrix;
    }

    @Override // xsna.grt0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        VKImageView previewImageView = getPreviewImageView();
        int measuredWidth = previewImageView != null ? previewImageView.getMeasuredWidth() : 0;
        VKImageView previewImageView2 = getPreviewImageView();
        int measuredHeight = previewImageView2 != null ? previewImageView2.getMeasuredHeight() : 0;
        int i7 = (i5 - measuredWidth) / 2;
        int i8 = (i6 - measuredHeight) / 2;
        int i9 = measuredWidth + i7;
        int i10 = measuredHeight + i8;
        VKImageView previewImageView3 = getPreviewImageView();
        if (previewImageView3 != null) {
            previewImageView3.layout(i7, i8, i9, i10);
        }
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.layout(i7, i8, i9, i10);
        }
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = size - (this.x * 2);
        if (i3 < 0) {
            i3 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i3, size2), 1073741824);
        VKImageView previewImageView = getPreviewImageView();
        if (previewImageView != null) {
            previewImageView.measure(makeMeasureSpec, makeMeasureSpec);
        }
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.measure(makeMeasureSpec, makeMeasureSpec);
        }
        setMeasuredDimension(size, size2);
    }

    public final void setOnMatrixChanged(izs<? super Matrix, s3q0> izsVar) {
        this.z = izsVar;
    }

    @Override // xsna.nxt0, xsna.nov
    public void setRemovable(boolean z) {
        this.y = z;
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean v0() {
        return this.y;
    }

    @Override // xsna.nxt0, xsna.nov
    public final void w0(float f, float f2) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float b = getCommons().b();
        float f3 = getCommons().f();
        super.w0(f, f2);
        if (b == f && f3 == f2) {
            return;
        }
        this.z.invoke(getStickerMatrix());
    }

    @Override // xsna.nxt0, xsna.nov
    public final void y0(float f, float f2, float f3, boolean z) {
        super.y0(f, f2, f3, z);
        this.z.invoke(getStickerMatrix());
    }

    @Override // xsna.grt0
    public final void z() {
        wds0 d = this.w.d();
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            videoView.setVideoSourceType(VideoSourceType.MP4);
        }
        SimpleVideoView videoView2 = getVideoView();
        if (videoView2 != null) {
            videoView2.s(d, true, 0L, true);
        }
    }
}
