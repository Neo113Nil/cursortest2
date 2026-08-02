package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.design.view.timeline.VideoTimelineView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsTemplateEditorCropperItemView.kt */
/* loaded from: classes16.dex */
public final class w6f extends FrameLayout implements s6f {
    public final se9 b;
    public final Object c;

    public w6f(Context context) {
        super(context, null, 0);
        this.b = new se9(this);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new cb(this, 20));
        LayoutInflater.from(context).inflate(R.layout.clips_template_editor_cropper_item_view, (ViewGroup) this, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VideoTimelineView getVideoTimeLineView() {
        return (VideoTimelineView) this.c.getValue();
    }

    public final void a() {
        VideoTimelineView videoTimeLineView = getVideoTimeLineView();
        videoTimeLineView.j = -1;
        Paint paint = videoTimeLineView.s;
        if (paint != null) {
            paint.setColor(0);
        }
        videoTimeLineView.invalidate();
    }

    public final float b() {
        return getVideoTimeLineView().getLeftProgress();
    }

    public final void c(float f, float f2, float f3) {
        VideoTimelineView videoTimeLineView = getVideoTimeLineView();
        videoTimeLineView.setProgressLeft(f);
        videoTimeLineView.setProgress(f2);
        videoTimeLineView.setProgressRight(f3);
    }

    public final void d(String str, boolean z, float f, boolean z2) {
        VideoTimelineView videoTimeLineView = getVideoTimeLineView();
        videoTimeLineView.setRxScheduler(asu0.a.c());
        videoTimeLineView.setHorizontalOffset(0);
        videoTimeLineView.setLeftClipHorizontalOffset(0);
        videoTimeLineView.setRightClipHorizontalOffset(Math.max(0, videoTimeLineView.getHorizontalOffset() * 2));
        videoTimeLineView.setVideoPath(str);
        if (z) {
            videoTimeLineView.setMoveProgressByTap(true);
            videoTimeLineView.setProgressWindowMode(true);
            videoTimeLineView.e0 = true;
            videoTimeLineView.setWithProgressLine(true);
            videoTimeLineView.invalidate();
            videoTimeLineView.h0 = true;
            videoTimeLineView.g0 = Float.valueOf(f);
            videoTimeLineView.n();
            videoTimeLineView.invalidate();
        } else {
            videoTimeLineView.setMoveProgressByTap(false);
            videoTimeLineView.setProgressWindowMode(true);
            videoTimeLineView.e0 = false;
            videoTimeLineView.g0 = Float.valueOf(1.0f);
            videoTimeLineView.n();
            videoTimeLineView.invalidate();
        }
        videoTimeLineView.setDrawProgress(false);
        videoTimeLineView.setUseKeepFrameRatio(true);
        videoTimeLineView.setUseMiddleKeyframe(true);
        if (z2) {
            videoTimeLineView.g();
            videoTimeLineView.setForceRedraw(true);
        }
    }

    public final long getCropperIndex() {
        u6f u6fVar = (u6f) this.b.c;
        if (u6fVar == null) {
            u6fVar = null;
        }
        return u6fVar.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((io.reactivex.rxjava3.disposables.b) this.b.b).dispose();
    }

    @Override // xsna.s6f
    public void setFragmentDuration(int i) {
        getVideoTimeLineView().l(i);
    }

    public final void setFrameInBoundColor(int i) {
        VideoTimelineView videoTimeLineView = getVideoTimeLineView();
        videoTimeLineView.setFramesInBoundColor(i);
        Paint inboundFramesForegroundPaint = videoTimeLineView.getInboundFramesForegroundPaint();
        if (inboundFramesForegroundPaint != null) {
            inboundFramesForegroundPaint.setColor(videoTimeLineView.getFramesInBoundColor());
        }
        videoTimeLineView.invalidate();
    }

    public final void setProvider(r6f r6fVar) {
        this.b.d = r6fVar;
    }

    @Override // xsna.s6f
    public void setTimeLineListener(fkt0 fkt0Var) {
        getVideoTimeLineView().i0 = fkt0Var;
    }

    public final void setVideoTimelinePaintBorderAlpha(int i) {
        VideoTimelineView videoTimeLineView = getVideoTimeLineView();
        Paint paintBorder = videoTimeLineView.getPaintBorder();
        if (paintBorder != null) {
            paintBorder.setAlpha(i);
        }
        videoTimeLineView.invalidate();
    }
}
