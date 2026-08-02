package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.widget.RemoteViews;
import androidx.core.app.j0;
import androidx.core.app.l0;
import androidx.core.app.q;
import androidx.core.app.s0;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$PreferredScreenType;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.notifications.g;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.notifications.tips.TipsNotificationAnalytics$NotificationState;
import ru.yandex.taxi.notifications.tips.b;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;

/* loaded from: classes9.dex */
public final class q280 {
    public final Context a;
    public final zuj0 b;
    public final xk60 c;
    public final t041 d;
    public final a980 e;
    public final iom0 f;
    public final vq70 g;
    public final b h;
    public final egz0 i;
    public final fvp0 j;
    public final y72 k;
    public final zkm l;
    public final i280 m;
    public final i3y n = a.a(new csz(26, this));

    public q280(Context context, zuj0 zuj0Var, xk60 xk60Var, t041 t041Var, a980 a980Var, iom0 iom0Var, vq70 vq70Var, b bVar, egz0 egz0Var, fvp0 fvp0Var, y72 y72Var, zkm zkmVar, i280 i280Var) {
        this.a = context;
        this.b = zuj0Var;
        this.c = xk60Var;
        this.d = t041Var;
        this.e = a980Var;
        this.f = iom0Var;
        this.g = vq70Var;
        this.h = bVar;
        this.i = egz0Var;
        this.j = fvp0Var;
        this.k = y72Var;
        this.l = zkmVar;
        this.m = i280Var;
    }

    public final void a(int i) {
        this.c.i.a(i, null);
    }

    public final q b(String str) {
        Class a = this.k.a(AndroidComponentRepository$Component.WAITING_NOTIFICATION_SERVICE);
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) a);
        intent.setAction("ru.yandex.taxi.activity.MainActivity.IM_COMING");
        intent.setData(((xq70) this.g).c("send_user_ready", str));
        Bundle bundle = new Bundle(1);
        bundle.putString("ru.yandex.taxi.broadcast.NotificationAction.ORDER_ID", str);
        intent.putExtras(bundle);
        return new q(h0h0.ic_notification_im_coming, ((avj0) this.b).h(kyh0.taxiotw_iam_coming), PendingIntent.getService(context, 0, intent, DivSeparatorView.DEFAULT_DIVIDER_COLOR));
    }

    public final PendingIntent c(Intent intent, boolean z, Integer num) {
        return PendingIntent.getActivity(this.a, num != null ? num.intValue() : 0, intent, (z ? SelfTester_JCP.IMITA : SelfTester_JCP.DECRYPT_CNT) | SelfTester_JCP.DECRYPT_CBC);
    }

    public final v d(n280 n280Var, boolean z, NotificationShareData.a aVar) {
        xk60 xk60Var;
        m280 m280Var;
        String str;
        Bitmap bitmap;
        int i;
        int i2;
        v vVar;
        Bitmap a;
        Bitmap bitmap2;
        PendingIntent f = f(n280Var.j(), n280Var.g(), aVar, n280Var.h());
        Pair m = m(n280Var.b(), n280Var.k(), n280Var.j());
        String str2 = (String) m.getFirst();
        String str3 = (String) m.getSecond();
        m280 d = n280Var.d();
        zkm zkmVar = this.l;
        if (d == null) {
            zkmVar.getClass();
            vVar = zkmVar.c.i(str2, str3, null, n280Var.g() ? "order" : "order_low", f, n280Var.c());
            i = 2;
        } else {
            m280 d2 = n280Var.d();
            g gVar = zkmVar.d;
            String str4 = n280Var.g() ? "order" : "order_low";
            xk60 xk60Var2 = zkmVar.c;
            l280 e = d2.e();
            String b = e != null ? e.b() : null;
            l280 e2 = d2.e();
            String c = e2 != null ? e2.c() : null;
            fxo g = d2.g();
            Bitmap a2 = g != null ? gVar.a(g, d2.d()) : null;
            Float i3 = d2.i();
            fxo f2 = d2.f();
            String d3 = d2.d();
            zuj0 zuj0Var = gVar.f;
            if (i3 == null) {
                xk60Var = xk60Var2;
                m280Var = d2;
                str = b;
                bitmap = null;
            } else if (f2 == null || (a = gVar.a(f2, d3)) == null) {
                xk60Var = xk60Var2;
                m280Var = d2;
                str = b;
                bitmap = null;
            } else {
                ohf0 ohf0Var = gVar.e;
                avj0 avj0Var = (avj0) zuj0Var;
                DisplayMetrics d4 = avj0Var.d();
                ContextThemeWrapper contextThemeWrapper = avj0Var.a;
                float f3 = d4.widthPixels;
                float w = tje.w(16, contextThemeWrapper);
                float w2 = tje.w(4, contextThemeWrapper);
                int a3 = avj0Var.a(rqg0.notification_progress_color_tr);
                xk60Var = xk60Var2;
                int a4 = avj0Var.a(rqg0.notification_progress_color);
                Drawable t = vng.t(h0h0.ic_end_circle, contextThemeWrapper);
                m280Var = d2;
                if (t != null) {
                    str = b;
                    bitmap2 = ffx.d0(t, 0, 0, 7);
                } else {
                    str = b;
                    bitmap2 = null;
                }
                float floatValue = i3.floatValue();
                float w3 = tje.w(4, contextThemeWrapper);
                ohf0Var.getClass();
                Bitmap createBitmap = Bitmap.createBitmap(m810.b(f3), m810.b(w), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setColor(a3);
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                Paint paint2 = new Paint();
                paint2.setColor(a4);
                paint2.setStyle(style);
                float width = (f3 - w3) - (bitmap2 != null ? bitmap2.getWidth() : 0);
                float f4 = w / 2.0f;
                float f5 = f4 - (w2 / 2.0f);
                float f6 = width * floatValue;
                float f7 = f5 + w2;
                canvas.drawRoundRect(0.0f, f5, f6, f7, 16.0f, 16.0f, paint);
                canvas.drawRoundRect(f6, f5, width, f7, 16.0f, 16.0f, paint2);
                canvas.drawBitmap(a, Math.max(0.0f, f6 - (a.getWidth() / 2)), f4 - (a.getHeight() / 2), (Paint) null);
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, f3 - bitmap2.getWidth(), f4 - (bitmap2.getHeight() / 2), (Paint) null);
                }
                bitmap = createBitmap;
            }
            List<q> c2 = m280Var.c();
            CharSequence b2 = m280Var.b();
            xk60Var.getClass();
            Bitmap bitmap3 = a2;
            i = 2;
            xk60 xk60Var3 = xk60Var;
            u50 u50Var = new u50((Object) str3, (Object) str2, (Object) str, (Object) xk60Var3, (Object) c, 16);
            Application application = xk60Var3.a;
            RemoteViews remoteViews = new RemoteViews(application.getPackageName(), xqh0.extended_notification);
            u50Var.invoke(remoteViews);
            if (bitmap3 != null) {
                remoteViews.setImageViewBitmap(ueh0.notification_ic_car, bitmap3);
                remoteViews.setViewVisibility(ueh0.notification_ic_car, 0);
                i2 = 8;
            } else {
                i2 = 8;
                remoteViews.setViewVisibility(ueh0.notification_ic_car, 8);
            }
            if (bitmap != null) {
                remoteViews.setImageViewBitmap(ueh0.progress_bar, bitmap);
                remoteViews.setViewVisibility(ueh0.progress_bar, 0);
            } else {
                remoteViews.setViewVisibility(ueh0.progress_bar, i2);
            }
            if (c2.isEmpty()) {
                remoteViews.setViewVisibility(ueh0.buttons_layout, i2);
            } else {
                remoteViews.setViewVisibility(ueh0.buttons_layout, 0);
                for (q qVar : c2) {
                    boolean l = jl40.l(qVar.g, b2);
                    RemoteViews remoteViews2 = new RemoteViews(application.getPackageName(), xqh0.action_button);
                    remoteViews2.setInt(ueh0.button, "setBackgroundResource", l ? g0h0.button_shape_accent : g0h0.button_shape);
                    remoteViews2.setTextViewText(ueh0.button, qVar.g);
                    remoteViews2.setOnClickPendingIntent(ueh0.button, qVar.h);
                    int i4 = ueh0.button;
                    zuj0 zuj0Var2 = xk60Var3.c;
                    remoteViews2.setTextColor(i4, l ? qje.t(xng0.textOnControl, ((avj0) zuj0Var2).a) : ((avj0) zuj0Var2).a(rqg0.notification_plates_text));
                    remoteViews.addView(ueh0.buttons_layout, remoteViews2);
                }
            }
            RemoteViews remoteViews3 = new RemoteViews(application.getPackageName(), xqh0.extended_notification_small);
            u50Var.invoke(remoteViews3);
            v d5 = xk60Var3.d(str4, f);
            d5.e = v.d(str3);
            d5.C = remoteViews3;
            d5.D = remoteViews;
            d5.l(new t.d());
            vVar = d5;
        }
        vVar.h(8, true);
        vVar.h(i, z);
        vVar.h(16, false);
        vVar.n = false;
        vVar.K.when = 0L;
        vVar.x = Constants.KEY_SERVICE;
        vVar.m = i;
        vVar.A = 1;
        vVar.H = 1800000L;
        if (n280Var.g()) {
            vVar.g(-1);
            return vVar;
        }
        vVar.g(0);
        return vVar;
    }

    public final PendingIntent e(String str, jgz0 jgz0Var, NotificationShareData.a aVar, Integer num) {
        Object obj;
        Pair pair;
        Pair pair2;
        boolean l = jl40.l(jgz0Var, ggz0.a);
        uq70 uq70Var = uq70.a;
        sq70 sq70Var = sq70.a;
        if (l) {
            obj = sq70Var;
        } else if (jgz0Var instanceof hgz0) {
            obj = new tq70(((hgz0) jgz0Var).a());
        } else {
            if (!jl40.l(jgz0Var, igz0.a)) {
                w511.b();
                return null;
            }
            obj = uq70Var;
        }
        Intent intent = new Intent(this.a, (Class<?>) this.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
        xq70 xq70Var = (xq70) this.g;
        xq70Var.getClass();
        if (obj instanceof tq70) {
            pair2 = new Pair(((tq70) obj).a(), "flat");
        } else {
            if (obj.equals(sq70Var)) {
                pair = new Pair(null, "custom");
            } else {
                if (!obj.equals(uq70Var)) {
                    w511.b();
                    return null;
                }
                pair = new Pair(null, null);
            }
            pair2 = pair;
        }
        k0y0 k0y0Var = new k0y0(str, TaxiOrderDeeplink$PreferredScreenType.DEFAULT, false, (String) pair2.getFirst(), (String) pair2.getSecond());
        ((pux0) xq70Var.a).getClass();
        Intent action = intent.setData(xq70.a(k0y0Var, pux0.c)).setAction("android.intent.action.VIEW");
        action.putExtra("notification_share_data_extra", aVar.a());
        return c(action.addFlags(SelfTester_JCP.IMITA), true, num);
    }

    public final PendingIntent f(String str, boolean z, NotificationShareData.a aVar, int i) {
        return c(new Intent(this.a, (Class<?>) this.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).setData(((xq70) this.g).b(str)).setAction("android.intent.action.VIEW").putExtra("notification_share_data_extra", aVar.a()).addFlags(SelfTester_JCP.IMITA), z, Integer.valueOf(i));
    }

    public final Notification g(n280 n280Var) {
        Pair m = m(n280Var.b(), n280Var.k(), n280Var.j());
        String str = (String) m.getFirst();
        String str2 = (String) m.getSecond();
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.e(n280Var.h());
        v i = this.c.i(str, str2, null, "order", f(n280Var.j(), true, builder, n280Var.h()), n280Var.c());
        boolean g = n280Var.g();
        xk60 xk60Var = this.c;
        xk60Var.getClass();
        if (g) {
            i.m = 1;
        }
        i.h(8, true);
        return xk60Var.m(builder, i, n280Var.e(), "order");
    }

    public final Notification h(n280 n280Var, List list, boolean z, TaxiOrder taxiOrder) {
        if (!n280Var.g()) {
            return i(n280Var, list, z, taxiOrder);
        }
        PowerManager.WakeLock newWakeLock = this.d.a.newWakeLock(268435462, "OrderStateChangedNotification");
        newWakeLock.acquire(3000L);
        s041 s041Var = new s041(newWakeLock);
        try {
            Notification i = i(n280Var, list, z, taxiOrder);
            s041Var.close();
            return i;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Notification i(n280 n280Var, List list, boolean z, TaxiOrder taxiOrder) {
        v vVar;
        boolean z2;
        IconCompat iconCompat;
        Float i;
        t.f fVar;
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.e(n280Var.h());
        if (smw0.a() >= 3600001) {
            this.m.getClass();
            boolean a = i280.a(taxiOrder);
            s0 s0Var = (s0) this.n.getValue();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 36) {
                z2 = l0.a(s0Var.b);
            } else {
                s0Var.getClass();
                z2 = false;
            }
            boolean isEmpty = list.isEmpty();
            if (a && z && z2 && isEmpty) {
                PendingIntent f = f(n280Var.j(), n280Var.g(), builder, n280Var.h());
                Pair m = m(n280Var.b(), n280Var.k(), n280Var.j());
                String str = (String) m.getFirst();
                String str2 = (String) m.getSecond();
                m280 d = n280Var.d();
                zkm zkmVar = this.l;
                zkmVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if ((d != null ? d.e() : null) != null) {
                    sb.append(" · ");
                    sb.append(d.e().a());
                }
                String sb2 = sb.toString();
                Integer valueOf = ykm.a[n280Var.i().ordinal()] == 1 ? Integer.valueOf(h0h0.ic_order_waiting_notification) : null;
                if (valueOf != null) {
                    Context context = zkmVar.a;
                    iconCompat = IconCompat.a(context, Icon.createWithResource(context, valueOf.intValue()));
                } else {
                    iconCompat = null;
                }
                vVar = zkmVar.c.d(n280Var.g() ? "order" : "order_progress_updates", f);
                vVar.e = v.d(str2);
                vVar.f = v.d(sb2);
                if (iconCompat != null) {
                    vVar.M = iconCompat.i(vVar.a);
                }
                zuj0 zuj0Var = zkmVar.b;
                if (d == null || (i = d.i()) == null) {
                    fVar = null;
                } else {
                    float floatValue = i.floatValue();
                    fxo f2 = d.f();
                    Bitmap a2 = f2 != null ? zkmVar.d.a(f2, d.d()) : null;
                    IconCompat b = a2 != null ? IconCompat.b(a2) : null;
                    int e = new t.f().e();
                    int d2 = y6i0.d((int) (floatValue * e), 0, e);
                    avj0 avj0Var = (avj0) zuj0Var;
                    int a3 = avj0Var.a(rqg0.notification_driving_live_updates_progress_color);
                    int a4 = avj0Var.a(rqg0.notification_driving_live_updates_progress_left_color);
                    j0 j0Var = new j0(d2);
                    j0Var.a(a3);
                    j0 j0Var2 = new j0(e - d2);
                    j0Var2.a(a4);
                    fVar = new t.f();
                    fVar.i();
                    fVar.f(d2);
                    fVar.h(b);
                    fVar.g(scc.g(j0Var, j0Var2));
                }
                vVar.l(fVar);
                vVar.c().putBoolean("android.requestPromotedOngoing", true);
                String h = d != null ? d.h() : null;
                vVar.g = h;
                if (i2 < 36) {
                    vVar.c().putString("android.shortCriticalText", h);
                }
                vVar.h(8, true);
                vVar.h(2, true);
                vVar.h(16, false);
                vVar.n = false;
                vVar.K.when = 0L;
                vVar.x = Constants.KEY_SERVICE;
                vVar.m = 2;
                vVar.A = 1;
                vVar.H = 1800000L;
                if (n280Var.g()) {
                    vVar.g(-1);
                } else {
                    vVar.g(0);
                }
                if (vVar == null) {
                    if (n280Var.i() == OrderNotification$OrderNotificationType.ORDER_WAITING_LIVE_UPDATES) {
                        vVar = null;
                    } else if (n280Var.d() != null) {
                        vVar = d(n280.a(n280Var, null, null, m280.a(n280Var.d(), list, null, 239), 767), z, builder);
                    } else {
                        vVar = d(n280Var, z, builder);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            q qVar = (q) it.next();
                            if (qVar != null) {
                                vVar.b.add(qVar);
                            }
                        }
                    }
                }
                if (vVar == null) {
                    return this.c.m(builder, vVar, n280Var.e(), "order");
                }
                return null;
            }
        }
        vVar = null;
        if (vVar == null) {
        }
        if (vVar == null) {
        }
    }

    public final void j(n280 n280Var, String str) {
        v i;
        int h = n280Var.h();
        NotificationShareData.a aVar = new NotificationShareData.a();
        aVar.g(str);
        aVar.i("order");
        aVar.e(h);
        aVar.f(kotlin.collections.b.h(new Pair(FinishFlowStatus.ORDER_ID_FIELD_NAME, n280Var.j())));
        String j = n280Var.j();
        PendingIntent c = c(new Intent(this.a, (Class<?>) this.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).setData(((xq70) this.g).b(j)).setAction("android.intent.action.VIEW").putExtra("notification_share_data_extra", aVar.a()).addFlags(SelfTester_JCP.IMITA), false, null);
        NotificationShareData a = aVar.a();
        xk60 xk60Var = this.c;
        Class a2 = xk60Var.f.a(AndroidComponentRepository$Component.NOTIFICATIONS_DISMISS_RECEIVER);
        Application application = xk60Var.a;
        Intent intent = new Intent(application, (Class<?>) a2);
        intent.putExtra("notification_share_data_extra", a);
        PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, intent, 201326592);
        String b = n280Var.b();
        xk60 xk60Var2 = this.c;
        if (b == null) {
            i = xk60Var2.h(n280Var.k(), null, "order", c, n280Var.c());
            i.K.deleteIntent = broadcast;
        } else {
            i = xk60Var2.i(n280Var.b(), n280Var.k(), null, "order", c, n280Var.c());
            i.K.deleteIntent = broadcast;
        }
        if (n280Var.g()) {
            i.m = 1;
        }
        xk60Var.m(aVar, i, n280Var.e(), "order");
    }

    public final q k(n280 n280Var, TipsNotificationAnalytics$NotificationState tipsNotificationAnalytics$NotificationState, String str) {
        int i = p280.a[tipsNotificationAnalytics$NotificationState.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                i2 = 2;
            }
        }
        this.i.getClass();
        return new q(0, str, e(n280Var.j(), igz0.a, egz0.a(n280Var, tipsNotificationAnalytics$NotificationState, "single_button"), Integer.valueOf(i2)));
    }

    public final ArrayList l(n280 n280Var, List list, TipsNotificationAnalytics$NotificationState tipsNotificationAnalytics$NotificationState) {
        NotificationShareData.a a;
        int i = p280.a[tipsNotificationAnalytics$NotificationState.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                i2 = 2;
            }
        }
        List<kgz0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (kgz0 kgz0Var : list2) {
            boolean equals = kgz0Var.a().equals(ggz0.a);
            egz0 egz0Var = this.i;
            if (equals) {
                egz0Var.getClass();
                a = egz0.a(n280Var, tipsNotificationAnalytics$NotificationState, "tips_buttons_custom");
            } else {
                egz0Var.getClass();
                a = egz0.a(n280Var, tipsNotificationAnalytics$NotificationState, "tips_buttons");
            }
            arrayList.add(new q(0, kgz0Var.b(), e(n280Var.j(), kgz0Var.a(), a, Integer.valueOf(i2))));
        }
        return arrayList;
    }

    public final Pair m(String str, String str2, String str3) {
        a980 a980Var = this.e;
        if (str != null && !evu0.J(str)) {
            return new Pair(str, a980Var.b(str2, str3));
        }
        if (str2 == null) {
            str2 = "";
        }
        this.c.getClass();
        String str4 = null;
        String b = a980Var.b(null, str3);
        if (b != null && !evu0.J(b)) {
            str4 = b;
        }
        return new Pair(str2, str4);
    }
}
