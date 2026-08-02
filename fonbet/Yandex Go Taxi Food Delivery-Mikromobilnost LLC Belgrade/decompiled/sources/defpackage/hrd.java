package defpackage;

import android.content.Context;
import com.yandex.go.payments.paymentlist.domain.i;
import ru.yandex.taxi.cashback.analytics.CashbackAnalyticsImpl$CashbackNotificationContext;
import ru.yandex.taxi.cashback.analytics.CompositeNotificationType;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.summary.topnotification.plus.CompositePaymentNotificationComponent;

/* loaded from: classes6.dex */
public final class hrd {
    public final tj60 a;
    public final s6d0 b;
    public final cba0 c;
    public final qpt0 d;
    public final Context e;
    public final z0a0 f;
    public final a29 g;

    public hrd(tj60 tj60Var, s6d0 s6d0Var, cba0 cba0Var, qpt0 qpt0Var, Context context, z0a0 z0a0Var, a29 a29Var) {
        this.a = tj60Var;
        this.b = s6d0Var;
        this.c = cba0Var;
        this.d = qpt0Var;
        this.e = context;
        this.f = z0a0Var;
        this.g = a29Var;
    }

    public final void a(ird irdVar) {
        boolean z = irdVar.d;
        tj60 tj60Var = this.a;
        if (!z) {
            tj60Var.c(CompositePaymentNotificationComponent.NOTIFICATION_ID);
            return;
        }
        String str = irdVar.a;
        String str2 = irdVar.b;
        final boolean z2 = irdVar.f;
        NotificationItemComponent a = tj60Var.a(CompositePaymentNotificationComponent.NOTIFICATION_ID);
        if (a != null) {
            if (a instanceof CompositePaymentNotificationComponent) {
                yf60 yf60Var = new yf60();
                yf60Var.a = str;
                yf60Var.b = str2;
                ((CompositePaymentNotificationComponent) a).updateNotification(new ag60(yf60Var));
                return;
            }
            tj60Var.c(CompositePaymentNotificationComponent.NOTIFICATION_ID);
        }
        final int i = 0;
        final int i2 = 1;
        CompositePaymentNotificationComponent compositePaymentNotificationComponent = new CompositePaymentNotificationComponent(this.e, this.f, new Runnable(this) { // from class: grd
            public final /* synthetic */ hrd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                boolean z3 = z2;
                hrd hrdVar = this.b;
                switch (i3) {
                    case 0:
                        hrdVar.g.b.k(CashbackAnalyticsImpl$CashbackNotificationContext.COMPOSITE_PAYMENT_SUGGEST.getContext(), (z3 ? CompositeNotificationType.FULL : CompositeNotificationType.PARTIAL).getType());
                        ((i) hrdVar.c).m(true);
                        ((rpt0) hrdVar.d).b(null, null);
                        break;
                    default:
                        hrdVar.g.b.i(CashbackAnalyticsImpl$CashbackNotificationContext.COMPOSITE_PAYMENT_SUGGEST.getContext(), (z3 ? CompositeNotificationType.FULL : CompositeNotificationType.PARTIAL).getType());
                        hrdVar.b.a.u("ru.yandex.taxi.utils.PreferenceUtils.FIELD_COMPOSITE_PAYMENT_NOTIFICATION_WAS_HIDDEN", true);
                        hrdVar.a.c(CompositePaymentNotificationComponent.NOTIFICATION_ID);
                        break;
                }
            }
        }, new Runnable(this) { // from class: grd
            public final /* synthetic */ hrd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                boolean z3 = z2;
                hrd hrdVar = this.b;
                switch (i3) {
                    case 0:
                        hrdVar.g.b.k(CashbackAnalyticsImpl$CashbackNotificationContext.COMPOSITE_PAYMENT_SUGGEST.getContext(), (z3 ? CompositeNotificationType.FULL : CompositeNotificationType.PARTIAL).getType());
                        ((i) hrdVar.c).m(true);
                        ((rpt0) hrdVar.d).b(null, null);
                        break;
                    default:
                        hrdVar.g.b.i(CashbackAnalyticsImpl$CashbackNotificationContext.COMPOSITE_PAYMENT_SUGGEST.getContext(), (z3 ? CompositeNotificationType.FULL : CompositeNotificationType.PARTIAL).getType());
                        hrdVar.b.a.u("ru.yandex.taxi.utils.PreferenceUtils.FIELD_COMPOSITE_PAYMENT_NOTIFICATION_WAS_HIDDEN", true);
                        hrdVar.a.c(CompositePaymentNotificationComponent.NOTIFICATION_ID);
                        break;
                }
            }
        });
        yf60 yf60Var2 = new yf60();
        yf60Var2.a = str;
        yf60Var2.b = str2;
        compositePaymentNotificationComponent.updateNotification(new ag60(yf60Var2));
        this.g.b.j(CashbackAnalyticsImpl$CashbackNotificationContext.COMPOSITE_PAYMENT_SUGGEST.getContext(), (z2 ? CompositeNotificationType.FULL : CompositeNotificationType.PARTIAL).getType());
        tj60Var.e(compositePaymentNotificationComponent);
    }
}
