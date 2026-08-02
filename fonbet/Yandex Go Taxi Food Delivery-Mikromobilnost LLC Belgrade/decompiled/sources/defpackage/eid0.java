package defpackage;

import android.content.Context;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.summary.topnotification.plus.PlusNotificationComponent;

/* loaded from: classes6.dex */
public final class eid0 {
    public final tj60 a;
    public final s0r0 b;
    public final d49 c;
    public final Context d;
    public final pav e;
    public final z0a0 f;

    public eid0(tj60 tj60Var, s0r0 s0r0Var, d49 d49Var, Context context, pav pavVar, z0a0 z0a0Var) {
        this.a = tj60Var;
        this.b = s0r0Var;
        this.c = d49Var;
        this.d = context;
        this.e = pavVar;
        this.f = z0a0Var;
    }

    public final void a() {
        tj60 tj60Var = this.a;
        if (tj60Var.a(PlusNotificationComponent.NOTIFICATION_ID) != null) {
            this.b.a.b = true;
        }
        tj60Var.c(PlusNotificationComponent.NOTIFICATION_ID);
    }

    public final void b(r6d0 r6d0Var) {
        if (!r6d0Var.d) {
            a();
            return;
        }
        String str = r6d0Var.a;
        String str2 = r6d0Var.b;
        String str3 = r6d0Var.c;
        tj60 tj60Var = this.a;
        NotificationItemComponent a = tj60Var.a(PlusNotificationComponent.NOTIFICATION_ID);
        if (a != null) {
            if (a instanceof PlusNotificationComponent) {
                yf60 yf60Var = new yf60();
                yf60Var.a = str;
                yf60Var.b = str2;
                ((PlusNotificationComponent) a).updateNotification(new ag60(yf60Var), str3);
                return;
            }
            a();
        }
        final int i = 0;
        Runnable runnable = new Runnable(this) { // from class: did0
            public final /* synthetic */ eid0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                eid0 eid0Var = this.b;
                switch (i2) {
                    case 0:
                        eid0Var.b.a.b = true;
                        eid0Var.a();
                        d49 d49Var = eid0Var.c;
                        d49Var.getClass();
                        d49.d(d49Var, CashbackCardContext.SUMMARY);
                        break;
                    default:
                        eid0Var.b.a.b = true;
                        eid0Var.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        PlusNotificationComponent plusNotificationComponent = new PlusNotificationComponent(this.d, this.e, this.f, runnable, new Runnable(this) { // from class: did0
            public final /* synthetic */ eid0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                eid0 eid0Var = this.b;
                switch (i22) {
                    case 0:
                        eid0Var.b.a.b = true;
                        eid0Var.a();
                        d49 d49Var = eid0Var.c;
                        d49Var.getClass();
                        d49.d(d49Var, CashbackCardContext.SUMMARY);
                        break;
                    default:
                        eid0Var.b.a.b = true;
                        eid0Var.a();
                        break;
                }
            }
        });
        yf60 yf60Var2 = new yf60();
        yf60Var2.a = str;
        yf60Var2.b = str2;
        plusNotificationComponent.updateNotification(new ag60(yf60Var2), str3);
        tj60Var.e(plusNotificationComponent);
    }
}
