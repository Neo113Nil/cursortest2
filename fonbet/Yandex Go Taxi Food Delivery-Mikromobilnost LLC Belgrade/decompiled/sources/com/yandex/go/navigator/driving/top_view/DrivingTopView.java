package com.yandex.go.navigator.driving.top_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.navigator.driving.e0;
import com.yandex.go.navigator.driving.notification_camera.NotificationCameraView;
import com.yandex.go.navigator.driving.p0;
import com.yandex.go.navigator.driving.speedometer.SpeedGroupView;
import com.yandex.go.navigator.maneuver.UpcomingManeuverView;
import defpackage.cma1;
import defpackage.fuh0;
import defpackage.gmm;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tje;
import defpackage.wwz0;
import defpackage.xkm;
import defpackage.ywz0;
import defpackage.z5h0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/yandex/go/navigator/driving/top_view/DrivingTopView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lywz0;", "topViewPresenter", "<init>", "(Landroid/content/Context;Lywz0;)V", "Lzy11;", "onAttached", "()V", "onDetach", "", "isVisible", "setCameraNotificationVisibility", "(Z)V", "setSpeedGroupVisibility", "isSpeedGroupVisible", "()Z", "Lywz0;", "Lxkm;", "binding", "Lxkm;", "Lcom/yandex/go/navigator/maneuver/UpcomingManeuverView;", "upcomingManeuverView$delegate", "Li3y;", "getUpcomingManeuverView", "()Lcom/yandex/go/navigator/maneuver/UpcomingManeuverView;", "upcomingManeuverView", "Lcom/yandex/go/navigator/driving/speedometer/SpeedGroupView;", "speedGroupView$delegate", "getSpeedGroupView", "()Lcom/yandex/go/navigator/driving/speedometer/SpeedGroupView;", "speedGroupView", "Lcom/yandex/go/navigator/driving/notification_camera/NotificationCameraView;", "notificationCameraView$delegate", "getNotificationCameraView", "()Lcom/yandex/go/navigator/driving/notification_camera/NotificationCameraView;", "notificationCameraView", "gmm", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DrivingTopView extends GoFrameLayout {
    public static final int $stable = 8;
    private final xkm binding;

    /* renamed from: notificationCameraView$delegate, reason: from kotlin metadata */
    private final i3y notificationCameraView;

    /* renamed from: speedGroupView$delegate, reason: from kotlin metadata */
    private final i3y speedGroupView;
    private final ywz0 topViewPresenter;

    /* renamed from: upcomingManeuverView$delegate, reason: from kotlin metadata */
    private final i3y upcomingManeuverView;

    public DrivingTopView(Context context, ywz0 ywz0Var) {
        super(context, null, 0, 0, 14, null);
        this.topViewPresenter = ywz0Var;
        View inflate = LayoutInflater.from(context).inflate(fuh0.driving_mode_top_view, (ViewGroup) this, false);
        addView(inflate);
        int i = z5h0.notification_camera_view;
        NotificationCameraView notificationCameraView = (NotificationCameraView) cma1.O(i, inflate);
        if (notificationCameraView != null) {
            i = z5h0.speed_group_view;
            SpeedGroupView speedGroupView = (SpeedGroupView) cma1.O(i, inflate);
            if (speedGroupView != null) {
                i = z5h0.upcoming_maneuver_view;
                UpcomingManeuverView upcomingManeuverView = (UpcomingManeuverView) cma1.O(i, inflate);
                if (upcomingManeuverView != null) {
                    xkm xkmVar = new xkm((GoConstraintLayout) inflate, notificationCameraView, speedGroupView, upcomingManeuverView);
                    this.binding = xkmVar;
                    DrivingTopView$upcomingManeuverView$2 drivingTopView$upcomingManeuverView$2 = new DrivingTopView$upcomingManeuverView$2(xkmVar, xkm.class, "upcomingManeuverView", "getUpcomingManeuverView()Lcom/yandex/go/navigator/maneuver/UpcomingManeuverView;", 0);
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                    this.upcomingManeuverView = kotlin.a.b(lazyThreadSafetyMode, drivingTopView$upcomingManeuverView$2);
                    this.speedGroupView = kotlin.a.b(lazyThreadSafetyMode, new DrivingTopView$speedGroupView$2(xkmVar, xkm.class, "speedGroupView", "getSpeedGroupView()Lcom/yandex/go/navigator/driving/speedometer/SpeedGroupView;", 0));
                    this.notificationCameraView = kotlin.a.b(lazyThreadSafetyMode, new DrivingTopView$notificationCameraView$2(xkmVar, xkm.class, "notificationCameraView", "getNotificationCameraView()Lcom/yandex/go/navigator/driving/notification_camera/NotificationCameraView;", 0));
                    setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationCameraView getNotificationCameraView() {
        return (NotificationCameraView) this.notificationCameraView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpeedGroupView getSpeedGroupView() {
        return (SpeedGroupView) this.speedGroupView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpcomingManeuverView getUpcomingManeuverView() {
        return (UpcomingManeuverView) this.upcomingManeuverView.getValue();
    }

    public final boolean isSpeedGroupVisible() {
        return getSpeedGroupView().getVisibility() == 0;
    }

    public final void onAttached() {
        ywz0 ywz0Var = this.topViewPresenter;
        ywz0Var.Bg(new gmm(this));
        if (!ywz0Var.E.a()) {
            tje.N(ywz0Var.Jg(), null, null, new TopViewPresenter$renderUpcomingManeuvers$$inlined$safeCollectIn$1(new d(e.t(e.m(ywz0Var.x.d, ywz0Var.y.P, ywz0Var.z.c, ywz0Var.A.b, new TopViewPresenter$upcomingManeuverUiState$1(ywz0Var, null)))), null, (wwz0) ywz0Var.Dg()), 3);
        }
        tje.N(ywz0Var.Jg(), null, null, new TopViewPresenter$renderSpeedGroupContent$$inlined$safeCollectIn$1(new b(new m0(ywz0Var.G, ywz0Var.C.a(), new TopViewPresenter$renderSpeedGroupContent$1(3, null))), null, (wwz0) ywz0Var.Dg()), 3);
        p0 p0Var = ywz0Var.D;
        tje.N(ywz0Var.Jg(), null, null, new TopViewPresenter$renderCameraNotification$$inlined$safeCollectIn$1(new m0(new e0(p0Var.c(), p0Var), ywz0Var.F, new TopViewPresenter$renderCameraNotification$1(3, null)), null, (wwz0) ywz0Var.Dg()), 3);
    }

    public final void onDetach() {
        this.topViewPresenter.Cg();
    }

    public final void setCameraNotificationVisibility(boolean isVisible) {
        qv10.B(isVisible, this.topViewPresenter.F, null);
    }

    public final void setSpeedGroupVisibility(boolean isVisible) {
        qv10.B(isVisible, this.topViewPresenter.G, null);
    }
}
