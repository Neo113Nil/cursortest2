package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.dto.common.TimelineThumbs;
import com.vk.stories.design.view.viewer.LineProgress;
import com.vk.story.viewer.impl.presentation.stories.view.TimelineThumbsView;
import com.vkontakte.android.R;

/* compiled from: VideoThumbProgress.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class xjt0 extends FrameLayout {
    public final TextView b;
    public final TextView c;
    public final LineProgress d;
    public final TimelineThumbsView e;
    public long f;
    public long g;
    public long h;
    public float i;
    public TimelineThumbs j;

    public xjt0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.video_thumb_progress, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.video_thumb_progress_position);
        this.c = (TextView) findViewById(R.id.video_thumb_progress_duration);
        this.d = (LineProgress) findViewById(R.id.video_thumb_progress);
        this.e = (TimelineThumbsView) findViewById(R.id.video_thumb_thumbs_view);
        setBackgroundColor(getContext().getColor(R.color.vk_black_alpha60));
    }

    public final void a(long j, long j2, long j3) {
        this.f = j;
        this.g = j2;
        this.h = j3;
        float f = j3;
        float f2 = j2 / f;
        this.i = f2;
        long j4 = 1000;
        gpt0 gpt0Var = gpt0.a;
        this.b.setText(z8s.a((int) (j / j4)));
        this.c.setText(z8s.a((int) (j3 / j4)));
        float f3 = j / f;
        LineProgress lineProgress = this.d;
        lineProgress.j = f2;
        lineProgress.k = f3;
        lineProgress.invalidate();
        this.e.setPercent(f3);
    }

    public final long getDuration() {
        return this.h;
    }

    public final float getPercent() {
        return this.i;
    }

    public final long getPosition() {
        return this.g;
    }

    public final LineProgress getProgressView() {
        return this.d;
    }

    public final long getSelectedPosition() {
        return this.f;
    }

    public final TimelineThumbs getTimelineThumbs() {
        return this.j;
    }

    public final void setDuration(long j) {
        this.h = j;
    }

    public final void setPercent(float f) {
        this.i = f;
    }

    public final void setPosition(long j) {
        this.g = j;
    }

    public final void setSelectedPosition(long j) {
        this.f = j;
    }

    public final void setTimelineThumbs(TimelineThumbs timelineThumbs) {
        this.j = timelineThumbs;
        TimelineThumbsView timelineThumbsView = this.e;
        timelineThumbsView.setTimelineThumbs(timelineThumbs);
        if (timelineThumbs != null) {
            timelineThumbsView.setVisibility(0);
        }
    }
}
