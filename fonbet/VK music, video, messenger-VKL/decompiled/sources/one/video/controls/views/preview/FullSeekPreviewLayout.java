package one.video.controls.views.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import xsna.akw;
import xsna.epx;
import xsna.ozl;
import xsna.zwo0;

/* compiled from: FullSeekPreviewLayout.kt */
@ozl
/* loaded from: classes8.dex */
public final class FullSeekPreviewLayout extends FrameLayout {
    public final VideoSeekPreviewImage b;
    public float c;
    public float d;

    public FullSeekPreviewLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final akw getImageLoader() {
        return this.b.getImageLoader();
    }

    public final zwo0 getTimelineImages() {
        return this.b.getTimelineThumbs();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        VideoSeekPreviewImage videoSeekPreviewImage = this.b;
        int measuredWidth2 = (measuredWidth - videoSeekPreviewImage.getMeasuredWidth()) / 2;
        int measuredHeight = (getMeasuredHeight() - videoSeekPreviewImage.getMeasuredHeight()) / 2;
        videoSeekPreviewImage.layout(i + measuredWidth2, i2 + measuredHeight, i3 - measuredWidth2, i4 - measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((int) (Math.min(1.0f, this.d) * size), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (Math.min(1.0f, this.c) * View.MeasureSpec.getSize(i2)), 1073741824));
    }

    public final void setImageLoader(akw akwVar) {
        this.b.setImageLoader(akwVar);
    }

    public final void setTimelineImages(zwo0 zwo0Var) {
        VideoSeekPreviewImage videoSeekPreviewImage = this.b;
        if (epx.f(videoSeekPreviewImage.getTimelineThumbs(), zwo0Var)) {
            return;
        }
        videoSeekPreviewImage.setTimelineThumbs(zwo0Var);
    }

    public FullSeekPreviewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public FullSeekPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ FullSeekPreviewLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public FullSeekPreviewLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        VideoSeekPreviewImage videoSeekPreviewImage = new VideoSeekPreviewImage(context, null, 6, 0);
        this.b = videoSeekPreviewImage;
        videoSeekPreviewImage.setClipToOutline(false);
        videoSeekPreviewImage.setOutlineProvider(null);
        videoSeekPreviewImage.setHasBorder(false);
        videoSeekPreviewImage.setBackgroundColor(0);
        addView(videoSeekPreviewImage, -1, -1);
        this.c = 1.0f;
        this.d = 1.0f;
    }
}
