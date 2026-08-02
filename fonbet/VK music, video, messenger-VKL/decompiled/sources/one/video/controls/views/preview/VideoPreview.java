package one.video.controls.views.preview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import xsna.akw;
import xsna.m50;
import xsna.ozl;
import xsna.zwo0;

/* compiled from: VideoPreview.kt */
@ozl
/* loaded from: classes8.dex */
public final class VideoPreview extends ConstraintLayout {
    public final VideoSeekPreviewImage t;
    public final View u;
    public final View v;
    public final m50 w;
    public final a x;

    /* compiled from: VideoPreview.kt */
    public final class a implements VideoSeekPreviewImage.a {
        public a() {
        }

        @Override // one.video.controls.views.preview.VideoSeekPreviewImage.a
        public final void a() {
            VideoPreview videoPreview = VideoPreview.this;
            videoPreview.removeCallbacks(videoPreview.w);
            videoPreview.u.setVisibility(8);
            videoPreview.v.setVisibility(8);
        }

        @Override // one.video.controls.views.preview.VideoSeekPreviewImage.a
        public final void b() {
            VideoPreview videoPreview = VideoPreview.this;
            videoPreview.removeCallbacks(videoPreview.w);
            videoPreview.v.setVisibility(8);
            videoPreview.u.setVisibility(0);
        }

        @Override // one.video.controls.views.preview.VideoSeekPreviewImage.a
        public final void c() {
            VideoPreview videoPreview = VideoPreview.this;
            m50 m50Var = videoPreview.w;
            videoPreview.removeCallbacks(m50Var);
            videoPreview.u.setVisibility(8);
            videoPreview.postDelayed(m50Var, 300L);
        }
    }

    public VideoPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final akw getImageLoader() {
        return this.t.getImageLoader();
    }

    public final zwo0 getTimelineThumbs() {
        return this.t.getTimelineThumbs();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t.setImageCallback(null);
        removeCallbacks(this.w);
    }

    public final void setImageLoader(akw akwVar) {
        this.t.setImageLoader(akwVar);
    }

    public final void setPlaceholder(Drawable drawable) {
        this.u.setBackground(drawable);
        this.t.setImageCallback(this.x);
    }

    public final void setTimelineThumbs(zwo0 zwo0Var) {
        this.t.setTimelineThumbs(zwo0Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != 0) {
            super.setVisibility(i);
        } else {
            if (this.t.getTimelineThumbs() == null && this.u.getBackground() == null) {
                return;
            }
            super.setVisibility(i);
        }
    }

    public VideoPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.one_video_seek_preview, this);
        this.t = (VideoSeekPreviewImage) findViewById(R.id.preview_image);
        this.u = findViewById(R.id.placeholder);
        this.v = findViewById(R.id.progress);
        if (isInEditMode()) {
            setBackgroundResource(R.color.one_video_gray_old);
        }
        this.w = new m50(this, 9);
        this.x = new a();
    }
}
