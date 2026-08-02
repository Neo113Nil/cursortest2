package xsna;

import android.app.Application;
import com.vk.core.preference.Preference;
import com.vk.core.preference.single_pref.SinglePreferenceMigrationType;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.libdelayedjobs.WorkPolicy;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import xsna.oyc0;

/* compiled from: SingleFileSharedPrefsTask.kt */
/* loaded from: classes11.dex */
public final class cuj0 extends ParallelTaskRunner.d {
    public final zvj0 c;

    public cuj0(VKApplication vKApplication, zvj0 zvj0Var) {
        super(vKApplication);
        this.c = zvj0Var;
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "SingleFileSharedPrefTask";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        zvj0 zvj0Var = this.c;
        zvj0Var.c();
        final boolean g = zvj0Var.g();
        final boolean f = zvj0Var.f();
        asu0.a.getClass();
        ((ExecutorService) asu0.T.getValue()).submit(new Runnable() { // from class: xsna.buj0
            @Override // java.lang.Runnable
            public final void run() {
                kvj0 kvj0Var;
                List A;
                boolean z = g;
                cuj0 cuj0Var = this;
                boolean z2 = f;
                long millis = com.vk.toggle.d.O() ? TimeUnit.MINUTES.toMillis(1L) : TimeUnit.SECONDS.toMillis(3L);
                boolean z3 = true;
                if (!z) {
                    im20 im20Var = new im20(millis, z2);
                    Preference preference = Preference.a;
                    Application application = cuj0Var.b;
                    preference.getClass();
                    if (Preference.m) {
                        kvj0Var = new kvj0(false, SinglePreferenceMigrationType.FROM_SINGLE, 0L, (Integer) null, false, 16);
                    } else {
                        jvj0 jvj0Var = new jvj0();
                        jvj0Var.a.addAll(z2 ? Collections.singletonList(new bd00(application, im20Var, 1)) : Collections.singletonList(new rcp(1, application, im20Var)));
                        if (jvj0Var.c) {
                            kvj0 kvj0Var2 = jvj0Var.b;
                            kvj0Var = new kvj0(kvj0Var2.a, SinglePreferenceMigrationType.FROM_SINGLE, kvj0Var2.c, kvj0Var2.d, kvj0Var2.e, kvj0Var2.f);
                        } else {
                            jvj0Var.c = true;
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = jvj0Var.a.iterator();
                            while (it.hasNext()) {
                                try {
                                    nyc0 nyc0Var = (nyc0) ((gzs) it.next()).invoke();
                                    nyc0Var.getClass();
                                    arrayList.add(nyc0Var.b());
                                } catch (Exception e) {
                                    L l = L.a;
                                    l.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l, L.LogType.d, new Object[]{cqi.b(e, new StringBuilder("Migration failed "))});
                                    }
                                    kvj0Var = new kvj0(false, SinglePreferenceMigrationType.FROM_SINGLE, 0L, (Integer) null, false, 56);
                                }
                            }
                            kvj0Var = (kvj0) j5g.i0(arrayList);
                        }
                        Preference.m = kvj0Var.d;
                    }
                    Preference.L(Preference.a, !kvj0Var.a, false, 2);
                    pt20.a(kvj0Var);
                    return;
                }
                zvj0 zvj0Var2 = cuj0Var.c;
                if (!zvj0Var2.a() || zvj0Var2.e()) {
                    Preference preference2 = Preference.a;
                    Application application2 = cuj0Var.b;
                    im20 im20Var2 = new im20(millis, z2);
                    preference2.getClass();
                    A = Preference.A(application2, im20Var2);
                } else {
                    fyx fyxVar = new fyx();
                    fyxVar.a.put("isEnabledPrefV2", z2);
                    ((xsl) uh.b.b()).a("PreferenceMigrationJob", oyc0.a.a(fyxVar), new usl(WorkPolicy.KEEP, TimeUnit.HOURS.toMillis(4L), 172));
                    A = dz5.L(new kvj0(false, SinglePreferenceMigrationType.TO_SINGLE, -1L, (Integer) null, false, 48));
                }
                Preference preference3 = Preference.a;
                kvj0 y = dz5.y(A);
                boolean z4 = y != null ? y.a : false;
                kvj0 x = dz5.x(A);
                boolean z5 = x != null ? x.a : false;
                if (!z4 && !z5) {
                    z3 = false;
                }
                kvj0 x2 = dz5.x(A);
                Preference.L(preference3, z3, x2 != null ? x2.a : false, 4);
                zvj0 zvj0Var3 = cuj0Var.c;
                List list = A;
                boolean z6 = list instanceof Collection;
                if (!z6 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (((kvj0) it2.next()).d) {
                            zvj0Var3.b();
                            break;
                        }
                    }
                }
                if (!z6 || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (((kvj0) it3.next()).a) {
                            zvj0Var3.d();
                            break;
                        }
                    }
                }
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    pt20.a((kvj0) it4.next());
                }
            }
        });
        return s3q0.a;
    }
}
