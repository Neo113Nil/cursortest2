package com.yandex.go.scooters.live.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.widget.RemoteViews;
import androidx.core.app.t;
import androidx.core.app.v;
import com.yandex.go.scooters.domain.model.ScootersNotificationType;
import com.yandex.go.scooters.live.ScootersLiveBroadcastReceiver;
import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import defpackage.e3n;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.m2o0;
import defpackage.ny61;
import defpackage.o2o0;
import defpackage.o430;
import defpackage.pfh0;
import defpackage.r0h0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xwn0;
import defpackage.y72;
import defpackage.zwn0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.TaxiApplication;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes13.dex */
public final class a {
    public final TaxiApplication a;
    public final tt2 b;
    public final q c;
    public final y72 d;
    public final o2o0 e;

    public a(TaxiApplication taxiApplication, tt2 tt2Var, q qVar, y72 y72Var, o2o0 o2o0Var) {
        this.a = taxiApplication;
        this.b = tt2Var;
        this.c = qVar;
        this.d = y72Var;
        this.e = o2o0Var;
    }

    public static final v a(a aVar) {
        v a = m2o0.a(aVar.e, ScootersNotificationType.SYSTEM, null, 6);
        a.l(new t.d());
        a.h(2, true);
        a.h(16, false);
        a.n = false;
        a.h(8, true);
        a.x = Constants.KEY_SERVICE;
        a.A = 1;
        o430 o430Var = e3n.b;
        a.H = e3n.e(kp50.U(30, DurationUnit.MINUTES));
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersLiveNotification$emptyNotify$1 scootersLiveNotification$emptyNotify$1;
        int i;
        if (continuationImpl instanceof ScootersLiveNotification$emptyNotify$1) {
            scootersLiveNotification$emptyNotify$1 = (ScootersLiveNotification$emptyNotify$1) continuationImpl;
            int i2 = scootersLiveNotification$emptyNotify$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveNotification$emptyNotify$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLiveNotification$emptyNotify$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveNotification$emptyNotify$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    ScootersLiveNotification$emptyNotify$notificationBuilder$1 scootersLiveNotification$emptyNotify$notificationBuilder$1 = new ScootersLiveNotification$emptyNotify$notificationBuilder$1(this, null);
                    scootersLiveNotification$emptyNotify$1.label = 1;
                    obj = tje.k0(sjhVar, scootersLiveNotification$emptyNotify$notificationBuilder$1, scootersLiveNotification$emptyNotify$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Notification f = this.e.f(8844975, (v) obj);
                f.flags |= 32;
                return f;
            }
        }
        scootersLiveNotification$emptyNotify$1 = new ScootersLiveNotification$emptyNotify$1(this, continuationImpl);
        Object obj2 = scootersLiveNotification$emptyNotify$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveNotification$emptyNotify$1.label;
        if (i != 0) {
        }
        Notification f2 = this.e.f(8844975, (v) obj2);
        f2.flags |= 32;
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zwn0 zwn0Var, ContinuationImpl continuationImpl) {
        ScootersLiveNotification$notify$1 scootersLiveNotification$notify$1;
        int i;
        if (continuationImpl instanceof ScootersLiveNotification$notify$1) {
            scootersLiveNotification$notify$1 = (ScootersLiveNotification$notify$1) continuationImpl;
            int i2 = scootersLiveNotification$notify$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveNotification$notify$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLiveNotification$notify$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveNotification$notify$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    ScootersLiveNotification$notify$notificationBuilder$1 scootersLiveNotification$notify$notificationBuilder$1 = new ScootersLiveNotification$notify$notificationBuilder$1(this, zwn0Var, null);
                    scootersLiveNotification$notify$1.L$0 = null;
                    scootersLiveNotification$notify$1.label = 1;
                    obj = tje.k0(sjhVar, scootersLiveNotification$notify$notificationBuilder$1, scootersLiveNotification$notify$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Notification f = this.e.f(8844975, (v) obj);
                f.flags |= 32;
                return f;
            }
        }
        scootersLiveNotification$notify$1 = new ScootersLiveNotification$notify$1(this, continuationImpl);
        Object obj2 = scootersLiveNotification$notify$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveNotification$notify$1.label;
        if (i != 0) {
        }
        Notification f2 = this.e.f(8844975, (v) obj2);
        f2.flags |= 32;
        return f2;
    }

    public final void d(RemoteViews remoteViews, int i, int i2, ScootersLiveAction scootersLiveAction, zwn0 zwn0Var, int i3, int i4, boolean z) {
        int i5;
        PendingIntent broadcast;
        if (i2 != -1 && !jx81.e()) {
            i = i2;
        }
        remoteViews.setViewVisibility(i, 0);
        if (i4 != -1 && !jx81.e()) {
            i3 = i4;
        }
        TaxiApplication taxiApplication = this.a;
        RemoteViews remoteViews2 = new RemoteViews(taxiApplication.getPackageName(), i3);
        ScootersLiveAction scootersLiveAction2 = zwn0Var.f;
        boolean z2 = scootersLiveAction2 == null;
        int i6 = xwn0.a[scootersLiveAction.getBackgroundColor().ordinal()];
        if (i6 == 1) {
            i5 = (z && z2) ? r0h0.bg_scooters_live_notification_rounded_ripple_accent : (!z || z2) ? (z || !z2) ? r0h0.bg_scooters_live_notification_circle_accent : r0h0.bg_scooters_live_notification_circle_ripple_accent : r0h0.bg_scooters_live_notification_rounded_accent;
        } else if (i6 == 2) {
            i5 = (z && z2) ? r0h0.bg_scooters_live_notification_rounded_ripple_pale : (!z || z2) ? (z || !z2) ? r0h0.bg_scooters_live_notification_circle_pale : r0h0.bg_scooters_live_notification_circle_ripple_pale : r0h0.bg_scooters_live_notification_rounded_pale;
        } else {
            if (i6 != 3) {
                w511.b();
                return;
            }
            i5 = (z && z2) ? r0h0.bg_scooters_live_notification_rounded_ripple_minor : (!z || z2) ? (z || !z2) ? r0h0.bg_scooters_live_notification_circle_minor : r0h0.bg_scooters_live_notification_circle_ripple_minor : r0h0.bg_scooters_live_notification_rounded_minor;
        }
        remoteViews2.setInt(pfh0.action_button_container, "setBackgroundResource", i5);
        if (scootersLiveAction2 == null || scootersLiveAction2 != scootersLiveAction) {
            remoteViews2.setViewVisibility(pfh0.action_button_image_view, 0);
            remoteViews2.setViewVisibility(pfh0.action_button_progress_bar, 8);
            remoteViews2.setViewVisibility(pfh0.action_button_progress_bar_minor, 8);
            remoteViews2.setImageViewResource(pfh0.action_button_image_view, scootersLiveAction.getIconRes());
        } else {
            remoteViews2.setViewVisibility(pfh0.action_button_image_view, 8);
            if (scootersLiveAction.getBackgroundColor() == ScootersLiveAction.BackgroundColor.MINOR) {
                remoteViews2.setViewVisibility(pfh0.action_button_progress_bar, 8);
                remoteViews2.setViewVisibility(pfh0.action_button_progress_bar_minor, 0);
            } else {
                remoteViews2.setViewVisibility(pfh0.action_button_progress_bar, 0);
                remoteViews2.setViewVisibility(pfh0.action_button_progress_bar_minor, 8);
            }
        }
        if (jx81.e()) {
            remoteViews2.setFloat(pfh0.action_button_container, "setAlpha", scootersLiveAction2 != null ? 0.5f : 1.0f);
        }
        Class cls = ScootersLiveBroadcastReceiver.class;
        if (zwn0Var.f == null) {
            int[] iArr = xwn0.b;
            switch (iArr[scootersLiveAction.ordinal()]) {
                case 5:
                case 6:
                case 7:
                    cls = this.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY);
                case 1:
                case 2:
                case 3:
                case 4:
                    Intent putExtra = new Intent(taxiApplication, (Class<?>) cls).setAction("android.intent.action.VIEW").putExtra("com.yandex.go.scooters.live.META_ACTION", true).putExtra("session_id", zwn0Var.a).putExtra("action_id", scootersLiveAction.getId());
                    int ordinal = scootersLiveAction.ordinal() + 7364;
                    switch (iArr[scootersLiveAction.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            broadcast = PendingIntent.getBroadcast(taxiApplication, ordinal, putExtra, 201326592);
                            break;
                        case 5:
                        case 6:
                        case 7:
                            broadcast = PendingIntent.getActivity(taxiApplication, ordinal, putExtra, 201326592);
                            break;
                        default:
                            w511.b();
                            break;
                    }
                default:
                    w511.b();
                    break;
            }
            return;
        }
        broadcast = PendingIntent.getBroadcast(taxiApplication, 4953813, new Intent(taxiApplication, (Class<?>) cls), 603979776);
        remoteViews2.setOnClickPendingIntent(pfh0.action_button_container, broadcast);
        if (jx81.e()) {
            remoteViews.addStableView(i, remoteViews2, i);
        } else {
            remoteViews.addView(i, remoteViews2);
        }
    }
}
