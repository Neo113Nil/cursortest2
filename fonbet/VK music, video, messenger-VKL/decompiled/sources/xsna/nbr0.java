package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreEventType;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.log.L;
import com.vk.log.a;
import com.vk.metrics.performance.exception.EmptyScreenException;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.utils.FinalizerDaemonException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import xsna.ky6;

/* compiled from: VKCrashHandler.kt */
/* loaded from: classes11.dex */
public final class nbr0 extends j200 {
    public static final List<String> a = e43.l("android.os.", "android.internal.os.", "java.");
    public static final jgp b = jgp.b;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    @Override // xsna.j200, java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        String str;
        String name;
        xqn0 xqn0Var;
        FragmentImpl u;
        super.uncaughtException(thread, th);
        bpn0 bpn0Var = rhr.a;
        rhr.b(400L);
        UiTracker uiTracker = UiTracker.a;
        final String d = UiTracker.d();
        final String name2 = thread.getName();
        b.getClass();
        Pair pair = new Pair("not_tracked", 0L);
        final String str2 = (String) pair.d();
        final long longValue = ((Number) pair.g()).longValue();
        dx90 dx90Var = ow90.e;
        wui wuiVar = wui.a;
        final String a2 = wui.a();
        final String b2 = wui.b();
        final String simpleName = th.getClass().getSimpleName();
        if (dx90Var.p()) {
            if (d.length() == 0) {
                com.vk.metrics.eventtracking.b.a.a(new EmptyScreenException());
            }
            Preference.a.getClass();
            Context context = Preference.b;
            if (context == null) {
                context = null;
            }
            dx90.z(context, "performance_crash_info", new izs() { // from class: xsna.cx90
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ObjectOutputStream objectOutputStream = (ObjectOutputStream) obj;
                    objectOutputStream.writeInt(2);
                    objectOutputStream.writeUTF(a2);
                    objectOutputStream.writeUTF(b2);
                    objectOutputStream.writeUTF(d);
                    objectOutputStream.writeUTF(simpleName);
                    objectOutputStream.writeUTF(name2);
                    objectOutputStream.writeUTF(str2);
                    objectOutputStream.writeLong(longValue);
                    return s3q0.a;
                }
            });
            dx90.s();
        } else {
            Preference.I("performance", "__app_performance_was_crashed__", true);
            Preference.H("performance", "__app_performance_crash_id__", a2);
            Preference.H("performance", "__app_performance_crash_stacktrace_hash__", b2);
            Preference.H("performance", "__app_performance_crash_screen__", d);
            Preference.H("performance", "__app_performance_crash_class__", simpleName);
            Preference.H("performance", "__app_performance_crash_thread__", name2);
            Preference.H("performance", "__app_performance_crash_codeowner__", str2);
            Preference.F(longValue, "performance", "__app_performance_crash_codeowner_extraction_time__");
            dx90.s();
        }
        zrd0.a.b(PerformanceScoreEventType.CRASH);
        L l = L.a;
        String a3 = a.C1259a.a();
        l.getClass();
        new com.vk.log.a(L.b(a3, true)).a(thread, th);
        if (th instanceof OutOfMemoryError) {
            asu0.a.getClass();
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putBoolean("oom_thread_create", true);
            aVar.commit();
            c63 c63Var = c63.a;
            Activity b3 = c63.b();
            ww50 v = b3 != null ? s200.v(b3) : null;
            if (v != null && (u = v.u()) != null) {
                name = u.getClass().getName();
            } else if (b3 != null) {
                name = b3.getClass().getName();
            } else {
                str = null;
                if (b3 == null) {
                    dsg0.a.getClass();
                    xqn0Var = dsg0.h(b3);
                } else {
                    xqn0Var = null;
                }
                dsg0.a.getClass();
                tgd0 f = dsg0.f();
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                UiTrackingScreen b4 = UiTracker.j.b();
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b4 == null ? b4.a : null;
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.OUT_OF_MEMORY.h(), null, c.name(), dsg0.d(), mobileOfficialAppsCoreNavStat$EventScreen == null ? mobileOfficialAppsCoreNavStat$EventScreen.name() : null, dsg0.e(), str, xqn0Var == null ? Integer.valueOf(xqn0Var.a()) : null, thread.getName(), xqn0Var == null ? Integer.valueOf(xqn0Var.c()) : null, dsg0.b(), xqn0Var == null ? Integer.valueOf(xqn0Var.b() ? 1 : 0) : null, dsg0.c(), f == null ? Integer.valueOf(f.h()) : null, dsg0.a(), f == null ? Integer.valueOf(f.c()) : null, null, f == null ? Integer.valueOf(f.f()) : null, null, f == null ? f.j() : null, null, f == null ? f.i() : null, null, f == null ? f.e() : null, null, f == null ? f.d() : null, null, f == null ? f.g() : null, null, Integer.valueOf(dsg0.g()), null, f == null ? f.a() : null, null, f == null ? f.b() : null, 1431633922, 1, null);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
            }
            str = name;
            if (b3 == null) {
            }
            dsg0.a.getClass();
            tgd0 f2 = dsg0.f();
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            UiTrackingScreen b42 = UiTracker.j.b();
            if (b42 == null) {
            }
            if (xqn0Var == null) {
            }
            if (xqn0Var == null) {
            }
            if (xqn0Var == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            if (f2 == null) {
            }
            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem2 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OUT_OF_MEMORY.h(), null, c2.name(), dsg0.d(), mobileOfficialAppsCoreNavStat$EventScreen == null ? mobileOfficialAppsCoreNavStat$EventScreen.name() : null, dsg0.e(), str, xqn0Var == null ? Integer.valueOf(xqn0Var.a()) : null, thread.getName(), xqn0Var == null ? Integer.valueOf(xqn0Var.c()) : null, dsg0.b(), xqn0Var == null ? Integer.valueOf(xqn0Var.b() ? 1 : 0) : null, dsg0.c(), f2 == null ? Integer.valueOf(f2.h()) : null, dsg0.a(), f2 == null ? Integer.valueOf(f2.c()) : null, null, f2 == null ? Integer.valueOf(f2.f()) : null, null, f2 == null ? f2.j() : null, null, f2 == null ? f2.i() : null, null, f2 == null ? f2.e() : null, null, f2 == null ? f2.d() : null, null, f2 == null ? f2.g() : null, null, Integer.valueOf(dsg0.g()), null, f2 == null ? f2.a() : null, null, f2 == null ? f2.b() : null, 1431633922, 1, null);
            l5m l5mVar2 = new l5m(null, null, 3);
            l5mVar2.g = schemeStat$TypeDevNullItem2;
            l5mVar2.q();
        }
        if ((name2.equals("FinalizerWatchdogDaemon") || name2.equals("FinalizerDaemon")) && (th instanceof TimeoutException)) {
            com.vk.metrics.eventtracking.b.a.a(new FinalizerDaemonException(th));
        }
    }
}
