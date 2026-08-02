package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class oj60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationItemComponent b;

    public /* synthetic */ oj60(NotificationItemComponent notificationItemComponent, int i) {
        this.a = i;
        this.b = notificationItemComponent;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        NotificationItemComponent notificationItemComponent = this.b;
        switch (i) {
            case 0:
                NotificationStackComponent.moveToStackedState$lambda$0(notificationItemComponent, valueAnimator);
                break;
            case 1:
                NotificationStackComponent.moveToStackedState$lambda$1(notificationItemComponent, valueAnimator);
                break;
            case 2:
                NotificationStackComponent.moveToStackedState$lambda$2(notificationItemComponent, valueAnimator);
                break;
            case 3:
                NotificationStackComponent.moveToExpandState$lambda$0(notificationItemComponent, valueAnimator);
                break;
            case 4:
                NotificationStackComponent.moveToExpandState$lambda$1(notificationItemComponent, valueAnimator);
                break;
            case 5:
                NotificationStackComponent.moveToExpandState$lambda$2(notificationItemComponent, valueAnimator);
                break;
            case 6:
                NotificationStackComponent.addItemToStackedList$lambda$0(notificationItemComponent, valueAnimator);
                break;
            case 7:
                NotificationStackComponent.addItemToStackedList$lambda$1(notificationItemComponent, valueAnimator);
                break;
            default:
                NotificationStackComponent.addItemToStackedList$lambda$2(notificationItemComponent, valueAnimator);
                break;
        }
    }
}
