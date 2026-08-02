package xsna;

import android.view.View;
import com.vk.clips.design.view.timer.TimerView;

/* compiled from: UpcomingDelegate.kt */
/* loaded from: classes3.dex */
public interface b7q0 extends i7q0 {
    @Override // xsna.i7q0
    default void B(boolean z) {
        View notificationButton = getNotificationButton();
        if (notificationButton != null) {
            notificationButton.setVisibility(z ? 4 : 0);
            notificationButton.setEnabled(!z);
        }
        View notificationLoader = getNotificationLoader();
        if (notificationLoader != null) {
            notificationLoader.setVisibility(z ? 0 : 8);
        }
    }

    View getNotificationButton();

    View getNotificationLoader();

    View getSubscribeButton();

    View getSubscribeLoader();

    TimerView getTimerView();

    @Override // xsna.i7q0
    default void y(boolean z) {
        View subscribeButton = getSubscribeButton();
        if (subscribeButton != null) {
            subscribeButton.setVisibility(z ? 4 : 0);
            subscribeButton.setEnabled(!z);
        }
        View subscribeLoader = getSubscribeLoader();
        if (subscribeLoader != null) {
            subscribeLoader.setVisibility(z ? 0 : 8);
        }
    }
}
