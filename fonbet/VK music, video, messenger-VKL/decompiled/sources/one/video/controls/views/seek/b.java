package one.video.controls.views.seek;

import android.annotation.SuppressLint;
import android.widget.SeekBar;
import android.widget.TextView;
import one.video.controls.views.preview.VideoPreview;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import one.video.controls.views.seek.VideoSeekViewOld;
import xsna.dp2;
import xsna.hpt0;
import xsna.nx3;

/* compiled from: VideoSeekViewOld.kt */
/* loaded from: classes8.dex */
public final class b implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ VideoSeekViewOld b;

    public b(VideoSeekViewOld videoSeekViewOld) {
        this.b = videoSeekViewOld;
    }

    public final float a() {
        VideoSeekViewOld videoSeekViewOld = this.b;
        TextView textView = videoSeekViewOld.z;
        if (videoSeekViewOld.getTimelineThumbs() != null) {
            return videoSeekViewOld.getPreview().getTranslationX() + ((videoSeekViewOld.getPreview().getWidth() - textView.getWidth()) / 2);
        }
        int i = VideoSeekViewOld.J;
        return VideoSeekViewOld.a.a(textView, videoSeekViewOld.y);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        VideoSeekViewOld videoSeekViewOld = this.b;
        TextView textView = videoSeekViewOld.z;
        if (z) {
            long j = i;
            if (videoSeekViewOld.getPreviousPositionSeconds() != j) {
                videoSeekViewOld.D = j;
                videoSeekViewOld.P4(j, videoSeekViewOld.getCurrentVideoDurationSeconds());
                VideoPreview preview = videoSeekViewOld.getPreview();
                long currentVideoDurationSeconds = videoSeekViewOld.getCurrentVideoDurationSeconds();
                VideoSeekPreviewImage videoSeekPreviewImage = preview.t;
                videoSeekPreviewImage.g = j;
                videoSeekPreviewImage.h = currentVideoDurationSeconds;
                videoSeekPreviewImage.U();
                VideoPreview preview2 = videoSeekViewOld.getPreview();
                int i2 = VideoSeekViewOld.J;
                preview2.setTranslationX(VideoSeekViewOld.a.a(videoSeekViewOld.getPreview(), seekBar));
                textView.setText(hpt0.k(j));
                textView.setTranslationX(a());
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        VideoSeekViewOld videoSeekViewOld = this.b;
        videoSeekViewOld.w = true;
        videoSeekViewOld.getPreview().setTimelineThumbs(videoSeekViewOld.getTimelineThumbs());
        VideoPreview preview = videoSeekViewOld.getPreview();
        long progress = seekBar.getProgress();
        long currentVideoDurationSeconds = videoSeekViewOld.getCurrentVideoDurationSeconds();
        VideoSeekPreviewImage videoSeekPreviewImage = preview.t;
        videoSeekPreviewImage.g = progress;
        videoSeekPreviewImage.h = currentVideoDurationSeconds;
        videoSeekPreviewImage.U();
        dp2.b(videoSeekViewOld.getPreview(), null, 31);
        VideoPreview preview2 = videoSeekViewOld.getPreview();
        int i = VideoSeekViewOld.J;
        preview2.setTranslationX(VideoSeekViewOld.a.a(videoSeekViewOld.getPreview(), seekBar));
        TextView textView = videoSeekViewOld.z;
        textView.setText(hpt0.k(videoSeekViewOld.getCurrentVideoDurationSeconds()));
        dp2.b(textView, null, 31);
        textView.setTranslationX(a());
        dp2.c(videoSeekViewOld.x, null, false, 31);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onStopTrackingTouch(SeekBar seekBar) {
        seekBar.setOnTouchListener(null);
        long progress = seekBar.getProgress();
        VideoSeekViewOld videoSeekViewOld = this.b;
        videoSeekViewOld.P4(progress, Math.max(videoSeekViewOld.getCurrentVideoDurationSeconds(), 0L));
        dp2.c(videoSeekViewOld.getPreview(), new nx3(videoSeekViewOld, 19), true, 11);
        dp2.c(videoSeekViewOld.z, null, true, 15);
        videoSeekViewOld.w = false;
        dp2.b(videoSeekViewOld.x, null, 31);
    }
}
