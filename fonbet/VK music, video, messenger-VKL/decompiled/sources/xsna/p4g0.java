package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vk.media.MediaUtils;
import com.vk.media.player.video.view.SimpleVideoView;
import java.io.File;
import java.util.Objects;
import xsna.f5h0;
import xsna.grt0;

/* compiled from: ReplyVideoStickerContent.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class p4g0 extends grt0 {
    public mat0 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public final grt0.a w;
    public final float x;
    public final int y;
    public final String z;

    public /* synthetic */ p4g0(Context context, grt0.a aVar, float f, String str, mat0 mat0Var, int i) {
        this(context, aVar, null, false, f, 60000, str, (i & 128) != 0 ? null : mat0Var);
    }

    private final void setPreviewBitmap(String str) {
        njt hierarchy;
        if (getFirstFrameBitmap() == null) {
            VKImageView previewImageView = getPreviewImageView();
            if (previewImageView != null) {
                previewImageView.load(str);
            }
            VKImageView previewImageView2 = getPreviewImageView();
            if (previewImageView2 != null) {
                previewImageView2.setActualScaleType(f5h0.i.a);
            }
            VKImageView previewImageView3 = getPreviewImageView();
            if (previewImageView3 == null || (hierarchy = previewImageView3.getHierarchy()) == null) {
                return;
            }
            hierarchy.u(RoundingParams.b(cn70.c(16)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMaxDuration$lambda$1$lambda$0(p4g0 p4g0Var) {
        SimpleVideoView simpleVideoView = p4g0Var.r;
        if (simpleVideoView != null ? simpleVideoView.I : false) {
            p4g0Var.x();
        }
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        p4g0 p4g0Var = new p4g0(getContext(), this.w, getFirstFrameBitmap(), true, this.x, this.y, this.z, this.A);
        p4g0Var.B = this.B;
        return p4g0Var;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        p4g0 p4g0Var = new p4g0(getContext(), this.w, getFirstFrameBitmap(), false, this.x, this.y, this.z, this.A);
        p4g0Var.B = this.B;
        return p4g0Var;
    }

    @Override // xsna.grt0, xsna.nxt0, xsna.nov
    public final void F0(Canvas canvas, boolean z) {
        VKImageView previewImageView = getPreviewImageView();
        if (previewImageView != null) {
            bwt0.p0(previewImageView, true);
        }
        SimpleVideoView videoView = getVideoView();
        if (videoView != null) {
            bwt0.p0(videoView, false);
        }
        super.F0(canvas, z);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap h;
        if (this.D || epx.f(view, getPreviewImageView())) {
            return super.drawChild(canvas, view, j);
        }
        Bitmap lastFrameBitmap = getLastFrameBitmap();
        if (lastFrameBitmap == null || (h = kd7.h(getContext(), lastFrameBitmap, getVideoRadius())) == null) {
            return false;
        }
        canvas.drawBitmap(h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        h.recycle();
        return true;
    }

    public final boolean equals(Object obj) {
        p4g0 p4g0Var = obj instanceof p4g0 ? (p4g0) obj : null;
        if (p4g0Var == null) {
            return false;
        }
        return epx.f(this.w, p4g0Var.w);
    }

    public final boolean getDraw() {
        return this.D;
    }

    @Override // xsna.grt0, xsna.oit0
    public long getDuration() {
        long duration = super.getDuration();
        if (duration != 0) {
            return duration;
        }
        grt0.a aVar = this.w;
        return aVar.c ? aVar.g : duration;
    }

    public final boolean getHasMusic() {
        return this.B;
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
        return 5;
    }

    @Override // xsna.grt0, xsna.oit0
    public Uri getUri() {
        wds0 videoData = getVideoData();
        Uri uri = videoData != null ? videoData.a : null;
        if (uri != null) {
            return uri;
        }
        grt0.a aVar = this.w;
        String str = aVar.a;
        if (aVar.c && str != null && str.length() != 0) {
            return Uri.fromFile(new File(str));
        }
        String str2 = aVar.b;
        if (str2 != null) {
            return Uri.parse(str2);
        }
        return null;
    }

    @Override // xsna.grt0, xsna.oit0
    public wds0 getVideoData() {
        mat0 mat0Var = this.A;
        if (mat0Var != null) {
            return mat0Var.d();
        }
        return null;
    }

    @Override // xsna.grt0, xsna.oit0
    public int getVideoRadius() {
        return iah0.a(16);
    }

    public final mat0 getVideoRawData() {
        return this.A;
    }

    public final int hashCode() {
        return Objects.hash(this.w);
    }

    @Override // xsna.oit0
    public final Matrix l(int i, int i2, MediaUtils.d dVar) {
        float b = getCommons().b() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getCommons().b() : i;
        float f = getCommons().f() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getCommons().f() : i2;
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        float c = this.A != null ? r5.c() : originalWidth;
        float b2 = this.A != null ? r6.b() : originalHeight;
        Matrix matrix = new Matrix();
        float min = Math.min(originalWidth / c, originalHeight / b2);
        matrix.postScale(min, min);
        matrix.postTranslate((originalWidth - (c * min)) / 2.0f, (originalHeight - (b2 * min)) / 2.0f);
        matrix.postConcat(getStickerMatrix());
        float f2 = i;
        float f3 = i2;
        float min2 = Math.min(f2 / b, f3 / f);
        matrix.postScale(min2, min2);
        matrix.postTranslate((f2 - (b * min2)) / 2.0f, (f3 - (f * min2)) / 2.0f);
        float f4 = dVar.a;
        float f5 = dVar.b;
        float min3 = Math.min(f4 / f2, f5 / f3);
        float a = yq.a(f2, min3, f4, 2.0f);
        float a2 = yq.a(f3, min3, f5, 2.0f);
        matrix.postScale(min3, min3);
        matrix.postTranslate(a, a2);
        Matrix matrix2 = new Matrix();
        if (matrix.invert(matrix2)) {
            matrix.set(matrix2);
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        double d = fArr[1];
        if (-0.001d <= d && d <= 0.001d) {
            fArr[1] = 0.0f;
        }
        double d2 = fArr[3];
        if (-0.001d <= d2 && d2 <= 0.001d) {
            fArr[3] = 0.0f;
        }
        matrix.setValues(fArr);
        return matrix;
    }

    @Override // xsna.grt0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = (i5 - measuredWidth) / 2;
            int i9 = (i6 - measuredHeight) / 2;
            childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
        }
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z = this.C;
        int i3 = 0;
        float f = this.x;
        if (z) {
            int i4 = (int) (size * f);
            if (i4 < size2) {
                size = (int) (size2 / f);
            } else {
                size2 = i4;
            }
            setMeasuredDimension(size2, size);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            int childCount = getChildCount();
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt instanceof VKImageView) {
                    ((VKImageView) childAt).H0(size2, size);
                } else {
                    childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                i3++;
            }
            return;
        }
        int size3 = View.MeasureSpec.getSize(i);
        int i5 = (int) (size3 / f);
        if (i5 > size) {
            size3 = (int) (size * f);
        } else {
            size = i5;
        }
        setMeasuredDimension(size3, size);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int childCount2 = getChildCount();
        while (i3 < childCount2) {
            View childAt2 = getChildAt(i3);
            if (childAt2 instanceof VKImageView) {
                ((VKImageView) childAt2).H0(size3, size);
            } else {
                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
            }
            i3++;
        }
    }

    public final void setDraw(boolean z) {
        this.D = z;
    }

    public final void setFullscreen(boolean z) {
        this.C = z;
    }

    public final void setHasMusic(boolean z) {
        this.B = z;
    }

    @Override // xsna.grt0
    public void setMute(boolean z) {
        mat0 mat0Var;
        super.setMute(z);
        if (this.v || (mat0Var = this.A) == null) {
            return;
        }
        mat0Var.e = z;
    }

    public final void setVideoRawData(mat0 mat0Var) {
        this.A = mat0Var;
    }

    @Override // xsna.grt0
    public final Bitmap v(Bitmap bitmap) {
        return null;
    }

    @Override // xsna.nxt0, xsna.nov
    public final void x0(RectF rectF, float f, float f2) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean z0() {
        return this.E;
    }

    public p4g0(Context context, grt0.a aVar, Bitmap bitmap, boolean z, float f, int i, String str, mat0 mat0Var) {
        super(context, aVar, bitmap, (SimpleVideoView.m) null, (SimpleVideoView.k) null, (SimpleVideoView.j) null, false, z, true);
        SimpleVideoView videoView;
        this.w = aVar;
        this.x = f;
        this.y = i;
        this.z = str;
        this.A = mat0Var;
        this.D = true;
        this.E = true;
        setRemovable(false);
        if (aVar.f) {
            setPermanentMute(true);
        }
        setOutlineProvider(new s0w0(cn70.c(16), 6));
        setClipToOutline(true);
        VKImageView previewImageView = getPreviewImageView();
        if (previewImageView != null) {
            previewImageView.setAspectRatio(f);
        }
        setPreviewBitmap(str);
        long j = i;
        if (aVar.g <= j || (videoView = getVideoView()) == null) {
            return;
        }
        videoView.L = j;
        videoView.r(new o4(videoView, 19));
        videoView.setOnEndListener(new t7(this, 29));
    }
}
