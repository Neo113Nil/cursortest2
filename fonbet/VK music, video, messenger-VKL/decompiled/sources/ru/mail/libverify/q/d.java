package ru.mail.libverify.q;

import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import ru.mail.libverify.n0.e;
import ru.mail.libverify.u.w;

/* loaded from: classes9.dex */
public final class d implements b {
    private final w a;

    public d(w wVar) {
        this.a = wVar;
    }

    @Override // ru.mail.libverify.q.b
    public final void a(HashMap hashMap) {
        Resources resources = this.a.getContext().getResources();
        String t = this.a.t();
        if (t == null || t.length() == 0) {
            t = null;
        }
        if (t != null) {
            hashMap.put("advertising_id", t);
        }
        String r = this.a.r();
        if (r != null) {
            hashMap.put("device_id", r);
        }
        hashMap.put("advertising_tracking_enabled", Boolean.valueOf(t != null));
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        hashMap.put("connection_type", (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? "none" : activeNetworkInfo.getType() == 1 ? "wifi" : "mobile");
        hashMap.put("device_width", Integer.valueOf(this.a.e()));
        hashMap.put("device_height", Integer.valueOf(this.a.i()));
        hashMap.put("lang", e.a(this.a.d()));
        this.a.N();
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, new SimpleDateFormat("ZZZZ", Locale.getDefault()).format(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime()));
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.m());
        sb.append(' ');
        this.a.g();
        sb.append(Build.MODEL);
        hashMap.put(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, sb.toString());
        hashMap.put("sim_mcc", Integer.valueOf(resources.getConfiguration().mcc));
        hashMap.put("sim_mnc", Integer.valueOf(resources.getConfiguration().mnc));
        this.a.getClass();
        hashMap.put("libverify_build", "297");
        this.a.getClass();
        hashMap.put("libverify_version", "2.18.2");
        hashMap.put("application", this.a.G());
    }
}
