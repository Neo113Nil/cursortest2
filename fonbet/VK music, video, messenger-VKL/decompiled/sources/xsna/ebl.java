package xsna;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import xsna.nke0;

/* compiled from: DefaultAuthDataProvider.kt */
/* loaded from: classes.dex */
public final class ebl {
    public final nke0.a a() {
        SharedPreferences f = Preference.f("push_subscriber");
        long j = f.getLong("userId", 0L);
        return new nke0.a(f.getInt(CallAnalyticsApiRequest.KEY_APP_VERSION, 0), f.getString("token", ""), f.getString("companion_apps", ""), j);
    }

    @SuppressLint({"ApplySharedPref"})
    public final void b(nke0.a aVar) {
        Preference.f("push_subscriber").edit().putLong("userId", aVar.a).putString("token", aVar.b).putInt(CallAnalyticsApiRequest.KEY_APP_VERSION, aVar.c).putString("companion_apps", aVar.d).commit();
    }
}
