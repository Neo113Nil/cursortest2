package defpackage;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class i720 {
    public final Context a;
    public final q6v b;
    public final String c;

    public i720(Context context, q6v q6vVar, String str) {
        this.a = context;
        this.b = q6vVar;
        this.c = str;
    }

    public final String a() {
        Locale locale = this.a.getResources().getConfiguration().getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return locale.toLanguageTag();
    }

    public final String b() {
        String uuid = AppMetricaYandex.getUuid(((gm51) this.b).a);
        if (uuid == null) {
            return null;
        }
        byte[] bytes = uuid.getBytes(uza.a);
        return String.valueOf(drb1.e(bytes.length, bytes));
    }

    public final String c() {
        return oyr.p("Android ", this.a.getApplicationInfo().packageName, "/250.2 AliceKit/250.2");
    }
}
