package ru.mail.libverify.i;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import ru.mail.libverify.R;
import ru.mail.libverify.g.b;
import ru.mail.libverify.notifications.SmsCodeNotificationActivity;
import ru.mail.verify.core.utils.FileLog;
import xsna.bhj0;
import xsna.j1a0;
import xsna.tj0;
import xsna.zgj0;

/* loaded from: classes9.dex */
public final class k {
    private final Context a;
    private final ru.mail.libverify.g.b b;
    private final boolean c;
    private int d;
    private final String e;

    public k(Context context, ru.mail.libverify.g.b bVar, boolean z) {
        this.a = context;
        this.b = bVar;
        this.c = z;
        this.e = bVar.c();
    }

    public final String a() {
        return f() ? this.a.getString(R.string.libverify_low_notification_id) : this.a.getString(R.string.libverify_high_notification_id);
    }

    public final ru.mail.libverify.g.b b() {
        return this.b;
    }

    public final Long c() {
        Long b;
        if (this.b.b() == null || ((b = this.b.b()) != null && b.longValue() == 0)) {
            FileLog.d("SmsCodeNotification", "notification hold timeout " + this.b.b());
            return null;
        }
        long abs = Math.abs(System.currentTimeMillis() - this.b.g());
        if (abs > 1800000) {
            FileLog.d("SmsCodeNotification", "notification " + this.b.c() + ", outdated by server timeout (" + abs + ')');
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.b.d();
        if (currentTimeMillis < 0) {
            FileLog.d("SmsCodeNotification", "notification " + this.b.c() + ", outdated by local timeout (" + currentTimeMillis + ')');
            return null;
        }
        long min = Math.min(this.b.b().longValue(), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) - currentTimeMillis;
        StringBuilder sb = new StringBuilder("notification ");
        sb.append(this.b.c());
        sb.append(", local diff ");
        sb.append(currentTimeMillis);
        tj0.d(sb, ", server diff ", abs, ", ongoing timeout ");
        sb.append(min);
        FileLog.v("SmsCodeNotification", sb.toString());
        Long valueOf = Long.valueOf(min);
        if (min > 0) {
            return valueOf;
        }
        return null;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        boolean z = c() != null;
        FileLog.v("SmsCodeNotification", "is ongoing result: " + z);
        return z;
    }

    public final boolean f() {
        return this.c || this.d >= 1;
    }

    public final void g() {
        this.d++;
    }

    public final NotificationCompat.h a(ru.mail.libverify.w.f fVar) {
        k kVar;
        ru.mail.libverify.w.f fVar2;
        NotificationCompat.h hVar = new NotificationCompat.h(this.a, a());
        hVar.k = (e() || !f()) ? 2 : 0;
        hVar.n(2, e());
        hVar.l(0);
        hVar.t = true;
        hVar.u = NotificationCompat.CATEGORY_MESSAGE;
        if (f()) {
            hVar.A(null);
            hVar.r(-1, 0, 0);
        } else {
            hVar.A(RingtoneManager.getDefaultUri(2));
            hVar.r(-1, 1500, 1500);
        }
        b.a e = this.b.e();
        String i = e.i();
        if (i == null || i.length() == 0) {
            kVar = this;
            fVar2 = fVar;
        } else {
            NotificationCompat.h hVar2 = new NotificationCompat.h(this.a, this.a.getString(f() ? R.string.libverify_low_notification_id : R.string.libverify_high_notification_id));
            hVar2.k(e.e());
            hVar2.j(e.i());
            hVar2.D(e.i());
            hVar2.I.when = this.b.d();
            hVar2.g = PendingIntent.getActivity(this.a, 0, new Intent(), new ru.mail.libverify.z.a().c().a());
            int i2 = R.drawable.libverify_ic_sms_white;
            String string = this.a.getString(R.string.libverify_resource_icon_id);
            if (string != null && string.length() != 0) {
                int identifier = this.a.getResources().getIdentifier(string, null, this.a.getPackageName());
                if (identifier > 0) {
                    i2 = identifier;
                } else {
                    FileLog.e("SmsCodeNotification", "Resource id not found for icon name ".concat(string));
                }
            }
            hVar2.I.icon = i2;
            hVar2.I.deleteIntent = e.a(this.a, this.b.c());
            hVar2.g = e.b(this.a, this.b.c());
            kVar = this;
            fVar2 = fVar;
            kVar.a(hVar2, e.s(), e.e(), e.i(), fVar2);
            hVar.y = hVar2.c();
        }
        hVar.k(e.e());
        hVar.j(e.n());
        hVar.D(e.n());
        hVar.I.when = kVar.b.d();
        hVar.g = PendingIntent.getActivity(kVar.a, 0, new Intent(), new ru.mail.libverify.z.a().c().a());
        int i3 = R.drawable.libverify_ic_sms_white;
        String string2 = kVar.a.getString(R.string.libverify_resource_icon_id);
        if (string2 != null && string2.length() != 0) {
            int identifier2 = kVar.a.getResources().getIdentifier(string2, null, kVar.a.getPackageName());
            if (identifier2 > 0) {
                i3 = identifier2;
            } else {
                FileLog.e("SmsCodeNotification", "Resource id not found for icon name ".concat(string2));
            }
        }
        hVar.I.icon = i3;
        hVar.I.deleteIntent = e.a(kVar.a, kVar.b.c());
        hVar.g = e.b(kVar.a, kVar.b.c());
        kVar.a(hVar, e.s(), e.e(), e.n(), fVar2);
        return hVar;
    }

    private static void a(ru.mail.libverify.w.f fVar, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            if (fVar.a(str) == null) {
                FileLog.v("SmsCodeNotification", "Not found bitmap to show small image notification");
            }
        } catch (Exception e) {
            FileLog.e("SmsCodeNotification", "Failed to show image small image.", e);
        }
    }

    private final void a(NotificationCompat.h hVar, boolean z, String str, String str2, ru.mail.libverify.w.f fVar) {
        String h = this.b.h();
        if (h != null && h.length() != 0 && z) {
            long currentTimeMillis = System.currentTimeMillis();
            a(fVar, this.b.h());
            j1a0 j1a0Var = new j1a0();
            j1a0Var.a = str;
            j1a0Var.b = null;
            j1a0Var.c = null;
            j1a0Var.d = null;
            j1a0Var.e = false;
            j1a0Var.f = false;
            NotificationCompat.l lVar = new NotificationCompat.l(j1a0Var);
            Context context = this.a;
            zgj0 zgj0Var = new zgj0();
            zgj0Var.a = context;
            zgj0Var.b = str;
            zgj0Var.h = null;
            zgj0Var.i = new j1a0[]{j1a0Var};
            zgj0Var.l = true;
            zgj0Var.e = str;
            Context context2 = this.a;
            String c = this.b.c();
            Intent intent = new Intent(context2, (Class<?>) SmsCodeNotificationActivity.class);
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setFlags(335544320);
            intent.putExtra("notification_id", c);
            zgj0Var.c = new Intent[]{intent};
            if (!TextUtils.isEmpty(zgj0Var.e)) {
                Intent[] intentArr = zgj0Var.c;
                if (intentArr != null && intentArr.length != 0) {
                    lVar.f(new NotificationCompat.l.d(str2, currentTimeMillis, j1a0Var));
                    hVar.c.add(j1a0Var);
                    hVar.x(zgj0Var);
                    hVar.B(lVar);
                    bhj0.g(this.a, zgj0Var);
                    return;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        NotificationCompat.f fVar2 = new NotificationCompat.f();
        fVar2.e = NotificationCompat.h.d(str2);
        hVar.B(fVar2);
        a(fVar, this.b.h());
    }
}
