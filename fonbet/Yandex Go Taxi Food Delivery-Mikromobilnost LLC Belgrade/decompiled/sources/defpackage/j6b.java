package defpackage;

import android.app.NotificationManager;
import com.yandex.messaging.internal.authorized.chat.notifications.a;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class j6b implements a9b {
    public final /* synthetic */ int a;

    public /* synthetic */ j6b(int i) {
        this.a = i;
    }

    @Override // defpackage.a9b
    public final e1k w(s020 s020Var) {
        String str;
        int i = this.a;
        a1k a1kVar = e1k.M1;
        switch (i) {
            case 0:
                a aVar = (a) ((m8g) s020Var).J.get();
                w220 w220Var = aVar.e;
                n6b n6bVar = aVar.j;
                o1b0 o1b0Var = aVar.c;
                n6bVar.getClass();
                if (o1b0Var.e) {
                    return a1kVar;
                }
                z83.i();
                aVar.z = new wj3(1, aVar);
                aVar.f.reportEvent("notification_lock_acquired", gw00.e(new Pair("chatId", o1b0Var.b)));
                bj60 g = aVar.g(null, false);
                h6b h6bVar = aVar.s;
                o1b0 o1b0Var2 = h6bVar.a;
                if (o1b0Var2.d) {
                    str = h6bVar.a();
                } else if (ChatId.Companion.f(o1b0Var2.b)) {
                    str = h6bVar.a();
                } else {
                    ch60 ch60Var = h6bVar.c;
                    String b = ch60Var.b(o1b0Var2.a);
                    NotificationManager notificationManager = ch60Var.g;
                    str = (notificationManager != null ? notificationManager.getNotificationChannel(b) : null) != null ? b : null;
                }
                if (str == null) {
                    wj3 wj3Var = aVar.z;
                    if (wj3Var != null) {
                        return wj3Var;
                    }
                    ny61.r("chat lock should be initialized");
                } else {
                    try {
                        int d = aVar.d();
                        if (((String) w220Var.b().b(d)) != null) {
                            bj60.c(g, "notification_prevented");
                        }
                        kotlinx.coroutines.a.h(aVar.B);
                        w220Var.a(d, str);
                        piv0 piv0Var = aVar.g;
                        pnt0 pnt0Var = piv0Var.k;
                        if (pnt0Var != null) {
                            int c = cvw.c(pnt0Var.b, pnt0Var.w, d);
                            if (c >= 0) {
                                Object[] objArr = pnt0Var.c;
                                Object obj = objArr[c];
                                Object obj2 = kp50.b;
                                if (obj != obj2) {
                                    objArr[c] = obj2;
                                    pnt0Var.a = true;
                                }
                            }
                            piv0Var.c(piv0Var.k, str, null);
                        }
                    } catch (Throwable th) {
                        g.b("prevent_notification_error", th);
                    }
                    wj3 wj3Var2 = aVar.z;
                    if (wj3Var2 != null) {
                        return wj3Var2;
                    }
                    ny61.r("chat lock should be initialized");
                }
                return null;
            default:
                u7b u7bVar = (u7b) ((m8g) s020Var).k0.get();
                if (!ChatNamespaces.b(u7bVar.a.a.b)) {
                    lqo lqoVar = u7bVar.d;
                    if (!lqoVar.a(tz10.j) || !lqoVar.a(tz10.l)) {
                        return a1kVar;
                    }
                }
                return new z4b(u7bVar);
        }
    }
}
