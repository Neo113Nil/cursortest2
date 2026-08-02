package defpackage;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.RtmErrorEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public final class bdf0 implements x22 {
    public final IReporter a;

    public bdf0(Context context) {
        IReporter reporter = AppMetrica.getReporter(context.getApplicationContext(), "e48dd638-f5ba-4cb8-b272-53b6d275062f");
        reporter.putAppEnvironmentValue("AliceKitVersion", "250600.0");
        this.a = reporter;
    }

    @Override // defpackage.x22
    public final void b(String str) {
        this.a.setUserProfileID(str);
    }

    @Override // defpackage.x22
    public final void c(String str, String str2, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (obj != null) {
            linkedHashMap.put(str2, obj);
        }
        this.a.reportEvent(str, linkedHashMap);
    }

    @Override // defpackage.x22
    public final void d(String str, String str2, Integer num, Boolean bool, Boolean bool2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("source", str);
        }
        if (str2 != null) {
            linkedHashMap.put("trace", str2);
        }
        linkedHashMap.put("currentStatus", num);
        linkedHashMap.put("goOnline", bool);
        linkedHashMap.put("syncRequired", bool2);
        this.a.reportEvent("tech_socket_connection_started", linkedHashMap);
    }

    @Override // defpackage.x22
    public final void e(String str, Throwable th) {
        ydz.b("ProfileAnalytics", "RtmException: name = " + str + ", \nthrowable = " + th);
    }

    @Override // defpackage.x22
    public final void f(String str, String str2, Object obj, String str3, Object obj2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (obj != null) {
            linkedHashMap.put(str2, obj);
        }
        if (obj2 != null) {
            linkedHashMap.put(str3, obj2);
        }
        this.a.reportEvent(str, linkedHashMap);
    }

    @Override // defpackage.x22
    public final void g(String str, String str2, Object obj, String str3, Object obj2, String str4, Object obj3, String str5, Object obj4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (obj != null) {
            linkedHashMap.put(str2, obj);
        }
        if (obj2 != null) {
            linkedHashMap.put(str3, obj2);
        }
        if (obj3 != null) {
            linkedHashMap.put(str4, obj3);
        }
        if (obj4 != null) {
            linkedHashMap.put(str5, obj4);
        }
        this.a.reportEvent(str, linkedHashMap);
    }

    @Override // defpackage.x22
    public final void h(String str, String str2, Object obj, String str3, Object obj2, String str4, Object obj3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (obj != null) {
            linkedHashMap.put(str2, obj);
        }
        if (obj2 != null) {
            linkedHashMap.put(str3, obj2);
        }
        if (obj3 != null) {
            linkedHashMap.put(str4, obj3);
        }
        this.a.reportEvent(str, linkedHashMap);
    }

    @Override // defpackage.x22
    public final void i(String str, String str2) {
        this.a.putAppEnvironmentValue(str, str2);
    }

    @Override // defpackage.x22
    public final void j(String str, RtmErrorEvent.ErrorLevel errorLevel, Map map) {
        ydz.b("ProfileAnalytics", "RtmError: name = " + str + ", \nadditional = " + map + " \nlevel = " + errorLevel);
    }

    @Override // defpackage.x22
    public final void pauseSession() {
        this.a.pauseSession();
    }

    @Override // defpackage.x22
    public final void reportError(String str, Throwable th) {
        this.a.reportError(str, th);
    }

    @Override // defpackage.x22
    public final void reportEvent(String str) {
        this.a.reportEvent(str);
    }

    @Override // defpackage.x22
    public final void resumeSession() {
        this.a.resumeSession();
    }

    @Override // defpackage.x22
    public final void reportEvent(String str, Map map) {
        this.a.reportEvent(str, (Map<String, Object>) map);
    }
}
