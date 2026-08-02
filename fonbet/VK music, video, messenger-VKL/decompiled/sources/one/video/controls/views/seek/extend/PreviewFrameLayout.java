package one.video.controls.views.seek.extend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import one.video.controls.views.preview.VideoPreview;
import xsna.akw;
import xsna.ozl;

/* compiled from: PreviewFrameLayout.kt */
@ozl
/* loaded from: classes8.dex */
public final class PreviewFrameLayout extends FrameLayout {
    public final VideoPreview b;

    public PreviewFrameLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final akw getImageLoader() {
        return this.b.getImageLoader();
    }

    public final void setImageLoader(akw akwVar) {
        this.b.setImageLoader(akwVar);
    }

    public PreviewFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PreviewFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PreviewFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PreviewFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        VideoPreview videoPreview = new VideoPreview(context, null, 6, 0);
        this.b = videoPreview;
        int dimension = (int) getResources().getDimension(R.dimen.one_video_extend_seek_height);
        videoPreview.setBackgroundColor(-16777216);
        videoPreview.setOutlineProvider(null);
        videoPreview.setClipToOutline(false);
        setLayoutParams(new FrameLayout.LayoutParams(dimension, dimension));
        addView(videoPreview, new FrameLayout.LayoutParams(-1, -1));
    }
}
