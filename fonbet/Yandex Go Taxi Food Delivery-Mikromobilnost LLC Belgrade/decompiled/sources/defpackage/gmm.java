package defpackage;

import com.yandex.go.navigator.driving.notification_camera.NotificationCameraView;
import com.yandex.go.navigator.driving.speedometer.SpeedGroupView;
import com.yandex.go.navigator.driving.top_view.DrivingTopView;
import com.yandex.go.navigator.maneuver.UpcomingManeuverView;

/* loaded from: classes12.dex */
public final class gmm implements wwz0 {
    public final /* synthetic */ DrivingTopView a;

    public gmm(DrivingTopView drivingTopView) {
        this.a = drivingTopView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        NotificationCameraView notificationCameraView;
        NotificationCameraView notificationCameraView2;
        UpcomingManeuverView upcomingManeuverView;
        UpcomingManeuverView upcomingManeuverView2;
        SpeedGroupView speedGroupView;
        SpeedGroupView speedGroupView2;
        zwz0 zwz0Var = (zwz0) obj;
        boolean z = zwz0Var instanceof kpt0;
        DrivingTopView drivingTopView = this.a;
        if (z) {
            lpt0 lpt0Var = ((kpt0) zwz0Var).a;
            speedGroupView = drivingTopView.getSpeedGroupView();
            speedGroupView.setVisibility(lpt0Var != null ? 0 : 8);
            if (lpt0Var != null) {
                speedGroupView2 = drivingTopView.getSpeedGroupView();
                speedGroupView2.render(lpt0Var);
                return;
            }
            return;
        }
        if (!(zwz0Var instanceof w521)) {
            if (!(zwz0Var instanceof ah60)) {
                w511.b();
                return;
            }
            ah60 ah60Var = (ah60) zwz0Var;
            notificationCameraView = drivingTopView.getNotificationCameraView();
            notificationCameraView.render(ah60Var);
            notificationCameraView2 = drivingTopView.getNotificationCameraView();
            notificationCameraView2.setVisibility(ah60Var.a.length() > 0 ? 0 : 8);
            return;
        }
        be00 be00Var = ((w521) zwz0Var).a;
        if (jl40.l(be00Var, rc60.a)) {
            upcomingManeuverView2 = drivingTopView.getUpcomingManeuverView();
            vh91.d(upcomingManeuverView2, 8);
        } else {
            if (!(be00Var instanceof y521)) {
                w511.b();
                return;
            }
            upcomingManeuverView = drivingTopView.getUpcomingManeuverView();
            vh91.d(upcomingManeuverView, 0);
            upcomingManeuverView.render((y521) be00Var);
        }
    }
}
