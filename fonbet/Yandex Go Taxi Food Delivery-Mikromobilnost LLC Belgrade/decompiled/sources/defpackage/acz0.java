package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.widget.timeline.TimelineItemView;

/* loaded from: classes6.dex */
public final /* synthetic */ class acz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimelineItemView b;

    public /* synthetic */ acz0(TimelineItemView timelineItemView, int i) {
        this.a = i;
        this.b = timelineItemView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        TimelineItemView timelineItemView = this.b;
        switch (i) {
            case 0:
                TimelineItemView.startFrontScaleAnimation$lambda$0(timelineItemView, valueAnimator);
                break;
            case 1:
                TimelineItemView.startOutlineScaleAnimation$lambda$0(timelineItemView, valueAnimator);
                break;
            case 2:
                TimelineItemView.startIconScaleAnimation$lambda$0(timelineItemView, valueAnimator);
                break;
            default:
                TimelineItemView.startLottieScaleAnimation$lambda$0(timelineItemView, valueAnimator);
                break;
        }
    }
}
