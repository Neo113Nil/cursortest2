package defpackage;

import android.content.Context;
import java.util.HashMap;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.fragment.CopiedNotification;
import ru.yandex.taxi.ui.routing.DriverFullNameCopyRouter$CopySource;

/* loaded from: classes12.dex */
public final class mim implements jim {
    public final k3c a;
    public final tj60 b;
    public final woe c;
    public final Context d;
    public final x770 e;
    public final bjm f;
    public String g;
    public final lim h = new lim(this);

    public mim(k3c k3cVar, tj60 tj60Var, woe woeVar, Context context, x770 x770Var, bjm bjmVar) {
        this.a = k3cVar;
        this.b = tj60Var;
        this.c = woeVar;
        this.d = context;
        this.e = x770Var;
        this.f = bjmVar;
    }

    public final void a(String str, DriverFullNameCopyRouter$CopySource driverFullNameCopyRouter$CopySource) {
        int i = kim.a[driverFullNameCopyRouter$CopySource.ordinal()];
        if (i == 1) {
            x770 x770Var = this.e;
            x770Var.getClass();
            x770Var.a.a("OrderInfo.DriverNameCopy.Tapped", new HashMap(), 1, new HashMap());
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            bjm bjmVar = this.f;
            bjmVar.getClass();
            bjmVar.a.a("DriverProfile.DriverNameCopy.Tapped", new HashMap(), 1, new HashMap());
        }
        HapticController$Effect hapticController$Effect = HapticController$Effect.CLICK_MEDIUM;
        Context context = this.d;
        qke.w(context, hapticController$Effect, true, true);
        this.a.a(false, str, "DriverFullNameInfo");
        String str2 = this.g;
        if (str2 == null || str2.length() == 0) {
            int i2 = kyh0.notification_full_name_copied;
            CopiedNotification copiedNotification = new CopiedNotification(context, i2, i2, "driver_full_name_copied");
            tj60 tj60Var = this.b;
            NotificationStackComponent notificationStackComponent = tj60Var.a;
            if (notificationStackComponent != null) {
                notificationStackComponent.addListener(this.h);
            }
            tj60Var.e(copiedNotification);
            woe woeVar = this.c;
            woeVar.getClass();
            woeVar.a.a("Copy.DriverName.Notification.Shown", new HashMap(), 1, new HashMap());
            copiedNotification.startExpiresTimer();
            copiedNotification.setExpiresListener(new wz1(6, this));
        }
    }
}
