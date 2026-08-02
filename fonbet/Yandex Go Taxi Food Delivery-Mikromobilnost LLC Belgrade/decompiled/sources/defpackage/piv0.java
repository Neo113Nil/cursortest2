package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.s0;
import androidx.core.app.t;
import androidx.core.app.v;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class piv0 {
    public final Context b;
    public final w220 c;
    public final vjv0 d;
    public final abe e;
    public final x22 f;
    public final s0 g;
    public final wi60 h;
    public final z120 i;
    public pnt0 k;
    public final Handler a = new Handler();
    public final m8t0 j = new m8t0(26, this);

    public piv0(Context context, wff0 wff0Var, w220 w220Var, vjv0 vjv0Var, abe abeVar, x22 x22Var, z120 z120Var, wi60 wi60Var) {
        this.b = context;
        this.c = w220Var;
        this.d = vjv0Var;
        this.e = abeVar;
        this.f = x22Var;
        this.g = new s0(context);
        this.h = wi60Var;
        this.k = w220Var.b();
        this.i = z120Var;
        wff0Var.a(new fn3(16, this));
    }

    public static HashMap a(String str, m5g0 m5g0Var) {
        HashMap p = x4e.p("channel_id", str);
        p.put("from_xiva_push", Boolean.valueOf(m5g0Var != null));
        if (m5g0Var != null) {
            p.put("transit_id", m5g0Var.a);
        }
        return p;
    }

    public static HashMap b(Bundle bundle) {
        String str = null;
        HashMap a = a(bundle.getString("channel_id"), (bundle.getBoolean("has_xiva_data") ? bundle : null) != null ? new m5g0(bundle.getString("transit_id"), bundle.getLong("receive_ts"), bundle.getLong("receive_ts_uptime")) : null);
        int[] intArray = bundle.getIntArray("notification_ids");
        if (intArray != null) {
            ArrayList arrayList = new ArrayList(intArray.length);
            for (int i : intArray) {
                arrayList.add(Integer.valueOf(i));
            }
            if (!arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(Extension.FIX_SPACE);
                }
                sb.setLength(sb.length() - 2);
                str = sb.toString();
            }
            a.put("notification_ids", str);
        }
        return a;
    }

    public final void c(pnt0 pnt0Var, String str, m5g0 m5g0Var) {
        Handler handler = this.a;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(this.j, 200L);
        if (this.h.c()) {
            String a = new uj60(this.c.c, 28, str, false).a();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < pnt0Var.e(); i++) {
                if (a.equals(pnt0Var.f(i))) {
                    arrayList.add(Integer.valueOf(pnt0Var.c(i)));
                }
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            s0 s0Var = this.g;
            x22 x22Var = this.f;
            if (size == 0) {
                x22Var.reportEvent("cancel_empty_summary_notification", a(str, m5g0Var));
                s0Var.a(-1, a);
                return;
            }
            if (size == 1) {
                x22Var.reportEvent("cancel_update_single_summary_notification", a(str, m5g0Var));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("channel_id", str);
            bundle.putIntArray("notification_ids", iArr);
            if (m5g0Var != null) {
                bundle.putAll(m5g0Var.a());
            }
            v vVar = new v(this.b, str);
            int a2 = this.i.a(wwg0.msg_notification_icon);
            Notification notification = vVar.K;
            notification.icon = a2;
            vVar.l(new t.e());
            vVar.r = str;
            vVar.s = true;
            vVar.h(16, false);
            vVar.h(8, true);
            abe abeVar = this.e;
            abeVar.getClass();
            Intent intent = new Intent("com.yandex.messenger.ChatSummary.DISMISS");
            Context context = abeVar.a;
            notification.deleteIntent = PendingIntent.getService(context, str.hashCode(), intent.setPackage(context.getPackageName()).putExtras(bundle), 201326592);
            vjv0 vjv0Var = this.d;
            vjv0Var.getClass();
            Intent intent2 = new Intent("com.yandex.messenger.ChatSummary.OPEN");
            Context context2 = vjv0Var.a;
            vVar.h = PendingIntent.getActivity(context2, 0, intent2.setPackage(context2.getPackageName()).setFlags(SelfTester_JCP.IMITA).putExtra("ChatList.OPEN_SOURCE", Constants.PUSH).putExtras(bundle), 201326592);
            Notification b = vVar.b();
            HashMap a3 = a(str, m5g0Var);
            a3.put("notification_ids", iArr);
            x22Var.reportEvent("summary_notification_show", a3);
            s0Var.d(a, -1, b);
        }
    }
}
