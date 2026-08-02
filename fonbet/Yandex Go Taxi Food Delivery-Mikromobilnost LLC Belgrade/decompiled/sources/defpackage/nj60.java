package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class nj60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationStackComponent b;

    public /* synthetic */ nj60(NotificationStackComponent notificationStackComponent, int i) {
        this.a = i;
        this.b = notificationStackComponent;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        NotificationStackComponent notificationStackComponent = this.b;
        switch (i) {
            case 0:
                NotificationStackComponent.showInternal$lambda$0(notificationStackComponent, valueAnimator);
                break;
            case 1:
                NotificationStackComponent.moveToExpandState$lambda$3(notificationStackComponent, valueAnimator);
                break;
            default:
                NotificationStackComponent.moveToExpandState$lambda$4(notificationStackComponent, valueAnimator);
                break;
        }
    }
}
