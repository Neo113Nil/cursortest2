package xsna;

import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.VKActivity;
import java.util.LinkedHashMap;
import java.util.Locale;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.crash.report.TracerCrashReport;

/* compiled from: AppTracerTracker.kt */
/* loaded from: classes.dex */
public final class oa3 implements ohp0 {
    public static final oa3 a = new oa3();

    public static String m(Event event) {
        StringBuilder sb = new StringBuilder("Event(name=");
        el3 el3Var = Event.b;
        sb.append(Event.b.a(event.a.c));
        sb.append(",params=");
        Event.a aVar = event.a;
        sb.append(aVar.d);
        sb.append(",type=");
        sb.append(aVar.e);
        sb.append(')');
        return sb.toString();
    }

    @Override // xsna.ohp0
    public final void a(Throwable th) {
        TracerCrashReport.report$default(th, null, 2, null);
    }

    @Override // xsna.ohp0
    public final void c(Application application, Bundle bundle, gzs<s3q0> gzsVar) {
        f(bundle);
        gzsVar.invoke();
    }

    @Override // xsna.ohp0
    public final void f(Bundle bundle) {
        if (bundle.containsKey(CommonConstant.RETKEY.USERID)) {
            long j = bundle.getLong(CommonConstant.RETKEY.USERID);
            Tracer.setUserId(j != 0 ? String.valueOf(j) : "no_auth:".concat(m8f0.a()));
        }
        if (bundle.containsKey("TOGGLE_NAME") && bundle.containsKey("AB_EXP_GROUP")) {
            Tracer.setKey(bundle.getString("TOGGLE_NAME", ""), bundle.getString("AB_EXP_GROUP", ""));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle.containsKey("USER_NAME")) {
            String string = bundle.getString("USER_NAME");
            if (string == null) {
                string = "Undefined";
            }
            linkedHashMap.put("USER_NAME", string);
        }
        if (bundle.containsKey("STORE_NAME")) {
            String string2 = bundle.getString("STORE_NAME");
            if (string2 == null) {
                string2 = "Undefined";
            }
            linkedHashMap.put("STORE_NAME", string2);
        }
        if (bundle.containsKey("APP_VERSION")) {
            String lowerCase = "APP_VERSION".toLowerCase(Locale.ROOT);
            String string3 = bundle.getString("APP_VERSION");
            if (string3 == null) {
                string3 = "Undefined";
            }
            linkedHashMap.put(lowerCase, string3);
        }
        if (bundle.containsKey("CRASH_ID")) {
            String string4 = bundle.getString("CRASH_ID");
            if (string4 == null) {
                string4 = "Undefined";
            }
            linkedHashMap.put("CRASH_ID", string4);
        }
        if (bundle.containsKey("CRASH_STACKTRACE_HASH")) {
            String string5 = bundle.getString("CRASH_STACKTRACE_HASH");
            if (string5 == null) {
                string5 = "Undefined";
            }
            linkedHashMap.put("CRASH_STACKTRACE_HASH", string5);
        }
        if (bundle.containsKey("CPU_CLASS")) {
            String string6 = bundle.getString("CPU_CLASS");
            if (string6 == null) {
                string6 = "Undefined";
            }
            linkedHashMap.put("CPU_CLASS", string6);
        }
        if (bundle.containsKey("DISK_CLASS")) {
            String string7 = bundle.getString("DISK_CLASS");
            if (string7 == null) {
                string7 = "Undefined";
            }
            linkedHashMap.put("DISK_CLASS", string7);
        }
        if (bundle.containsKey("MEMORY_CLASS")) {
            String string8 = bundle.getString("MEMORY_CLASS");
            if (string8 == null) {
                string8 = "Undefined";
            }
            linkedHashMap.put("MEMORY_CLASS", string8);
        }
        if (bundle.containsKey("OVERALL_CLASS")) {
            String string9 = bundle.getString("OVERALL_CLASS");
            linkedHashMap.put("OVERALL_CLASS", string9 != null ? string9 : "Undefined");
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Tracer.setCustomProperties(linkedHashMap);
    }

    @Override // xsna.ohp0
    public final String getId() {
        return "AppTracerTracker";
    }

    @Override // xsna.ohp0
    public final void k(Event event) {
        Event.a aVar = event.a;
        V v = aVar.d.get("vk_tracking_logging_params_enabled");
        Boolean bool = Boolean.TRUE;
        if (epx.f(v, bool) && aVar.c.length() > 0) {
            el3 el3Var = Event.b;
            Tracer.setKey(Event.b.a(aVar.c), m(event));
        } else if (epx.f(event.a.d.get("vk_tracking_enhanced_enabled"), bool)) {
            TracerCrashReport.log(m(event));
        }
    }

    @Override // xsna.ohp0
    public final void l(String str) {
        TracerCrashReport.log(str);
    }

    @Override // xsna.ohp0
    public final void g() {
    }

    @Override // xsna.ohp0
    public final void b(ohp0 ohp0Var) {
    }

    @Override // xsna.ohp0
    public final void d(long j) {
    }

    @Override // xsna.ohp0
    public final void e(long j) {
    }

    @Override // xsna.ohp0
    public final void h(izs<? super Event, s3q0> izsVar) {
    }

    @Override // xsna.ohp0
    public final void i(VKActivity vKActivity) {
    }

    @Override // xsna.ohp0
    public final void j(VKActivity vKActivity) {
    }
}
