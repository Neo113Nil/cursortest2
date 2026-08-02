package defpackage;

import android.content.Context;
import java.util.Date;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.summary.topnotification.mastercard.MasterCardNotificationComponent;

/* loaded from: classes6.dex */
public final class h610 {
    public final tj60 a;
    public final c b;
    public final Context c;
    public final pav d;
    public final i610 e;
    public final s0r0 f;

    public h610(tj60 tj60Var, c cVar, Context context, pav pavVar, i610 i610Var, s0r0 s0r0Var) {
        this.a = tj60Var;
        this.b = cVar;
        this.c = context;
        this.d = pavVar;
        this.e = i610Var;
        this.f = s0r0Var;
    }

    public final void a() {
        tj60 tj60Var = this.a;
        if (tj60Var.a(MasterCardNotificationComponent.NOTIFICATION_ID) != null) {
            this.f.a.a = true;
            Date date = new Date();
            s6d0 s6d0Var = this.e.a;
            s6d0Var.a.q(date.getTime(), "ru.yandex.taxi.utils.PreferenceUtils.FIELD_MASTERCARD_LAST_SHOWN_TIMESTAMP");
        }
        tj60Var.c(MasterCardNotificationComponent.NOTIFICATION_ID);
    }

    public final void b(k610 k610Var) {
        if (!k610Var.e) {
            a();
            return;
        }
        String str = k610Var.a;
        String str2 = k610Var.b;
        String str3 = k610Var.c;
        String str4 = k610Var.d;
        tj60 tj60Var = this.a;
        NotificationItemComponent a = tj60Var.a(MasterCardNotificationComponent.NOTIFICATION_ID);
        boolean z = true ^ (str4 == null || str4.length() == 0);
        if (a != null) {
            if (a instanceof MasterCardNotificationComponent) {
                yf60 yf60Var = new yf60();
                yf60Var.a = str;
                yf60Var.b = str2;
                ((MasterCardNotificationComponent) a).updateNotification(new ag60(yf60Var), str3, z);
                return;
            }
            a();
        }
        MasterCardNotificationComponent masterCardNotificationComponent = new MasterCardNotificationComponent(this.c, this.d, new p500(9, this, str4), new fbz(18, this));
        yf60 yf60Var2 = new yf60();
        yf60Var2.a = str;
        yf60Var2.b = str2;
        masterCardNotificationComponent.updateNotification(new ag60(yf60Var2), str3, z);
        tj60Var.e(masterCardNotificationComponent);
    }
}
