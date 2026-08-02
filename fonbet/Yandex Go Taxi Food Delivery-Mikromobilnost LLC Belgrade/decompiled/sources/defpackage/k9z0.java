package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.widget.timeline.TimelineBar;

/* loaded from: classes6.dex */
public final /* synthetic */ class k9z0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimelineBar b;

    public /* synthetic */ k9z0(TimelineBar timelineBar, int i) {
        this.a = i;
        this.b = timelineBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        TimelineBar timelineBar = this.b;
        switch (i) {
            case 0:
                TimelineBar.startCircleAnimation$lambda$0(timelineBar, valueAnimator);
                break;
            default:
                TimelineBar.startLineAnimation$lambda$0(timelineBar, valueAnimator);
                break;
        }
    }
}
