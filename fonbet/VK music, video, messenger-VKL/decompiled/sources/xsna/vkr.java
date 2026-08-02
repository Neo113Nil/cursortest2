package xsna;

import android.app.Application;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.trackers.CriticalException;
import com.vkontakte.android.VKActivity;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FirebaseTracker.kt */
/* loaded from: classes.dex */
public final class vkr implements ohp0 {
    public final g4k a;
    public Application b;
    public VKActivity c;

    public vkr(g4k g4kVar) {
        this.a = g4kVar;
    }

    public static FirebaseCrashlytics m() {
        try {
            if (rhr.c()) {
                return FirebaseCrashlytics.getInstance();
            }
            return null;
        } catch (RuntimeException e) {
            L.i(e);
            return null;
        }
    }

    public static String o(Event event) {
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
        FirebaseCrashlytics m;
        int i;
        boolean z = false;
        if (!(th instanceof d7j)) {
            g4k g4kVar = this.a;
            if (!((Boolean) g4kVar.b.getValue()).booleanValue() && (!(th instanceof CriticalException) || g4k.d.incrementAndGet() > 64)) {
                Random random = g4kVar.c;
                try {
                    i = Integer.parseInt(bl20.a.getString("config_fabric_non_fatal_log_frequency", String.valueOf(1)));
                } catch (Exception unused) {
                    i = 1;
                }
                if (random.nextInt(Math.max(1, i)) == 0 && !(th instanceof VKApiException)) {
                    if (g4kVar.a.invoke().booleanValue()) {
                        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                            if (brm0.B(stackTraceElement.getClassName(), "okhttp3", false)) {
                                break;
                            }
                        }
                    }
                }
            }
            z = true;
        }
        if (!z || (m = m()) == null) {
            return;
        }
        m.recordException(th);
    }

    @Override // xsna.ohp0
    public final void c(Application application, final Bundle bundle, final gzs<s3q0> gzsVar) {
        this.b = application;
        boolean c = rhr.c();
        if (c) {
            f(bundle);
            gzsVar.invoke();
        } else {
            if (c) {
                throw new NoWhenBranchMatchedException();
            }
            rhr.a(new izs() { // from class: xsna.ukr
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        vkr.this.f(bundle);
                        gzsVar.invoke();
                    }
                    return s3q0.a;
                }
            });
        }
    }

    @Override // xsna.ohp0
    public final void f(Bundle bundle) {
        if (bundle.containsKey(CommonConstant.RETKEY.USERID)) {
            long j = bundle.getLong(CommonConstant.RETKEY.USERID);
            String valueOf = j != 0 ? String.valueOf(j) : "no_auth:".concat(m8f0.a());
            FirebaseCrashlytics m = m();
            if (m != null) {
                m.setUserId(valueOf);
            }
        }
        if (bundle.containsKey("USER_NAME")) {
            String string = bundle.getString("USER_NAME");
            if (string == null) {
                string = "Undefined";
            }
            FirebaseCrashlytics m2 = m();
            if (m2 != null) {
                m2.setCustomKey("USER_NAME", string);
            }
        }
        if (bundle.containsKey("STORE_NAME")) {
            String string2 = bundle.getString("STORE_NAME");
            if (string2 == null) {
                string2 = "Undefined";
            }
            FirebaseCrashlytics m3 = m();
            if (m3 != null) {
                m3.setCustomKey("STORE_NAME", string2);
            }
        }
        if (bundle.containsKey("APP_VERSION")) {
            String string3 = bundle.getString("APP_VERSION");
            if (string3 == null) {
                string3 = "Undefined";
            }
            FirebaseCrashlytics m4 = m();
            if (m4 != null) {
                m4.setCustomKey("APP_VERSION".toLowerCase(Locale.ROOT), string3);
            }
        }
        if (bundle.containsKey("CRASH_ID")) {
            String string4 = bundle.getString("CRASH_ID");
            if (string4 == null) {
                string4 = "Undefined";
            }
            FirebaseCrashlytics m5 = m();
            if (m5 != null) {
                m5.setCustomKey("CRASH_ID", string4);
            }
        }
        if (bundle.containsKey("CRASH_STACKTRACE_HASH")) {
            String string5 = bundle.getString("CRASH_STACKTRACE_HASH");
            if (string5 == null) {
                string5 = "Undefined";
            }
            FirebaseCrashlytics m6 = m();
            if (m6 != null) {
                m6.setCustomKey("CRASH_STACKTRACE_HASH", string5);
            }
        }
        if (bundle.containsKey("DATA_COLLECTION_ENABLED")) {
            boolean z = bundle.getBoolean("DATA_COLLECTION_ENABLED");
            FirebaseAnalytics firebaseAnalytics = null;
            if (n()) {
                Application application = this.b;
                firebaseAnalytics = FirebaseAnalytics.getInstance(application != null ? application : null);
            }
            if (firebaseAnalytics != null) {
                firebaseAnalytics.a.zzL(Boolean.valueOf(z));
            }
        }
        if (bundle.containsKey("CPU_CLASS")) {
            String string6 = bundle.getString("CPU_CLASS");
            if (string6 == null) {
                string6 = "Undefined";
            }
            FirebaseCrashlytics m7 = m();
            if (m7 != null) {
                m7.setCustomKey("CPU_CLASS", string6);
            }
        }
        if (bundle.containsKey("DISK_CLASS")) {
            String string7 = bundle.getString("DISK_CLASS");
            if (string7 == null) {
                string7 = "Undefined";
            }
            FirebaseCrashlytics m8 = m();
            if (m8 != null) {
                m8.setCustomKey("DISK_CLASS", string7);
            }
        }
        if (bundle.containsKey("MEMORY_CLASS")) {
            String string8 = bundle.getString("MEMORY_CLASS");
            if (string8 == null) {
                string8 = "Undefined";
            }
            FirebaseCrashlytics m9 = m();
            if (m9 != null) {
                m9.setCustomKey("MEMORY_CLASS", string8);
            }
        }
        if (bundle.containsKey("OVERALL_CLASS")) {
            String string9 = bundle.getString("OVERALL_CLASS");
            String str = string9 != null ? string9 : "Undefined";
            FirebaseCrashlytics m10 = m();
            if (m10 != null) {
                m10.setCustomKey("OVERALL_CLASS", str);
            }
        }
    }

    @Override // xsna.ohp0
    public final String getId() {
        return "FirebaseTracker";
    }

    @Override // xsna.ohp0
    public final void i(VKActivity vKActivity) {
        this.c = vKActivity;
    }

    @Override // xsna.ohp0
    public final void j(VKActivity vKActivity) {
        this.c = null;
    }

    @Override // xsna.ohp0
    public final void k(Event event) {
        FirebaseCrashlytics m;
        Event.a aVar = event.a;
        V v = aVar.d.get("vk_tracking_logging_params_enabled");
        Boolean bool = Boolean.TRUE;
        if (epx.f(v, bool) && aVar.c.length() > 0) {
            FirebaseCrashlytics m2 = m();
            if (m2 != null) {
                el3 el3Var = Event.b;
                m2.setCustomKey(Event.b.a(aVar.c), o(event));
                return;
            }
            return;
        }
        if (epx.f(event.a.d.get("vk_tracking_enhanced_enabled"), bool) && (m = m()) != null) {
            m.log(o(event));
        }
        FirebaseAnalytics firebaseAnalytics = null;
        if (n()) {
            Application application = this.b;
            firebaseAnalytics = FirebaseAnalytics.getInstance(application != null ? application : null);
        }
        if (firebaseAnalytics != null) {
            el3 el3Var2 = Event.b;
            String a = Event.b.a(aVar.c);
            Bundle bundle = new Bundle();
            Set<Map.Entry> entrySet = aVar.d.entrySet();
            if (zk3.this.d > 25) {
                entrySet = j5g.S0(j5g.H0(entrySet, 25));
            }
            for (Map.Entry entry : entrySet) {
                String str = (String) entry.getKey();
                String obj = entry.getValue().toString();
                if (obj.length() > 100) {
                    obj = obj.substring(0, 100);
                }
                bundle.putString(str, obj);
            }
            s3q0 s3q0Var = s3q0.a;
            firebaseAnalytics.a.zzy(a, bundle);
        }
    }

    @Override // xsna.ohp0
    public final void l(String str) {
        FirebaseAnalytics firebaseAnalytics;
        VKActivity vKActivity = this.c;
        if (vKActivity == null) {
            return;
        }
        if (n()) {
            Application application = this.b;
            if (application == null) {
                application = null;
            }
            firebaseAnalytics = FirebaseAnalytics.getInstance(application);
        } else {
            firebaseAnalytics = null;
        }
        if (firebaseAnalytics != null) {
            firebaseAnalytics.setCurrentScreen(vKActivity, str, null);
        }
    }

    public final boolean n() {
        return this.b != null;
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
}
