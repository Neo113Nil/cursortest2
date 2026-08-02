package com.yandex.go.scooters.live.notification;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.core.app.v;
import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.r0h0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ywn0;
import defpackage.zwn0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.TaxiApplication;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Landroidx/core/app/v;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Landroidx/core/app/v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.live.notification.ScootersLiveNotification$notify$notificationBuilder$1", f = "ScootersLiveNotification.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersLiveNotification$notify$notificationBuilder$1 extends SuspendLambda implements wls {
    final /* synthetic */ zwn0 $scootersLiveNotificationUiState;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLiveNotification$notify$notificationBuilder$1(a aVar, zwn0 zwn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$scootersLiveNotificationUiState = zwn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersLiveNotification$notify$notificationBuilder$1(this.this$0, this.$scootersLiveNotificationUiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersLiveNotification$notify$notificationBuilder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        v a = a.a(this.this$0);
        a aVar = this.this$0;
        zwn0 zwn0Var = this.$scootersLiveNotificationUiState;
        aVar.getClass();
        RemoteViews remoteViews = new RemoteViews(aVar.a.getPackageName(), qrh0.scooters_live_notification_collapsed);
        remoteViews.setTextViewText(pfh0.title, zwn0Var.b);
        List list = zwn0Var.c;
        aVar.d(remoteViews, pfh0.action_button_1, pfh0.action_button_1_compat, (ScootersLiveAction) list.get(0), zwn0Var, qrh0.scooters_live_notification_collapsed_action_button, qrh0.scooters_live_notification_collapsed_action_button_compat, false);
        aVar.d(remoteViews, pfh0.action_button_2, pfh0.action_button_2_compat, (ScootersLiveAction) list.get(1), zwn0Var, qrh0.scooters_live_notification_collapsed_action_button, qrh0.scooters_live_notification_collapsed_action_button_compat, false);
        a.C = remoteViews;
        a aVar2 = this.this$0;
        zwn0 zwn0Var2 = this.$scootersLiveNotificationUiState;
        aVar2.getClass();
        RemoteViews remoteViews2 = new RemoteViews(aVar2.a.getPackageName(), qrh0.scooters_live_notification_expanded);
        remoteViews2.setTextViewText(pfh0.title, zwn0Var2.b);
        ywn0 ywn0Var = zwn0Var2.e;
        boolean z = zwn0Var2.g;
        int i = pfh0.vehicle_number_text_view;
        String str = ywn0Var.a;
        Bitmap bitmap = ywn0Var.b;
        remoteViews2.setTextViewText(i, str);
        remoteViews2.setTextViewText(pfh0.vehicle_number_text_view_no_image, ywn0Var.a);
        int i2 = z ? r0h0.bg_scooters_live_notification_vehicle_number_no_stroke : r0h0.bg_scooters_live_notification_vehicle_number;
        if (bitmap != null) {
            remoteViews2.setViewVisibility(pfh0.vehicle_number_text_view, 0);
            remoteViews2.setViewVisibility(pfh0.vehicle_number_text_view_no_image, 8);
            remoteViews2.setViewVisibility(pfh0.vehicle_image_view, 0);
            remoteViews2.setImageViewBitmap(pfh0.vehicle_image_view, bitmap);
            remoteViews2.setInt(pfh0.vehicle_number_text_view, "setBackgroundResource", i2);
        } else {
            remoteViews2.setViewVisibility(pfh0.vehicle_number_text_view, 8);
            remoteViews2.setViewVisibility(pfh0.vehicle_number_text_view_no_image, 0);
            remoteViews2.setViewVisibility(pfh0.vehicle_image_view, 8);
            remoteViews2.setInt(pfh0.vehicle_number_text_view_no_image, "setBackgroundResource", i2);
        }
        List list2 = zwn0Var2.d;
        aVar2.d(remoteViews2, pfh0.action_button_1, -1, (ScootersLiveAction) list2.get(0), zwn0Var2, qrh0.scooters_live_notification_expanded_action_button, -1, true);
        aVar2.d(remoteViews2, pfh0.action_button_2, -1, (ScootersLiveAction) list2.get(1), zwn0Var2, qrh0.scooters_live_notification_expanded_action_button, -1, true);
        aVar2.d(remoteViews2, pfh0.action_button_3, -1, (ScootersLiveAction) list2.get(2), zwn0Var2, qrh0.scooters_live_notification_expanded_action_button, -1, true);
        a.D = remoteViews2;
        a aVar3 = this.this$0;
        zwn0 zwn0Var3 = this.$scootersLiveNotificationUiState;
        TaxiApplication taxiApplication = aVar3.a;
        a.h = PendingIntent.getActivity(taxiApplication, 232391, new Intent(taxiApplication, (Class<?>) aVar3.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).setAction("android.intent.action.VIEW").setData(aVar3.c.a(zwn0Var3.a)), 201326592);
        return a;
    }
}
