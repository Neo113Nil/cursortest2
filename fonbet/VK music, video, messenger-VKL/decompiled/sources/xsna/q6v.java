package xsna;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ScheduledExecutorService;
import xsna.n6v;

/* compiled from: HijackingAppsTask.kt */
/* loaded from: classes11.dex */
public final class q6v extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "checkHijackingApps";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        final n6v n6vVar = new n6v(this.b);
        asu0.a.getClass();
        ScheduledExecutorService o = asu0.o();
        final x0v x0vVar = new x0v(this, 1);
        long j = n6v.c;
        Runnable runnable = new Runnable() { // from class: xsna.m6v
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                n6v.a aVar;
                String g0;
                n6v n6vVar2 = n6vVar;
                Context context = n6vVar2.a;
                Context context2 = n6vVar2.b.a;
                List<PackageInfo> installedPackages = context2.getPackageManager().getInstalledPackages(134217729);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = installedPackages.iterator();
                while (true) {
                    aVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ActivityInfo[] activityInfoArr = ((PackageInfo) next).activities;
                    if (activityInfoArr != 0) {
                        int length = activityInfoArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            ActivityInfo activityInfo = activityInfoArr[i];
                            if (epx.f(activityInfo.taskAffinity, context2.getPackageName())) {
                                aVar = activityInfo;
                                break;
                            }
                            i++;
                        }
                    }
                    if (aVar != null) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (!u790.a((PackageInfo) next2, o6v.b)) {
                        arrayList2.add(next2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    String string = context.getString(arrayList2.size() == 1 ? R.string.hijacking_apps_found_one : R.string.hijacking_apps_found_many);
                    if (arrayList2.size() == 1) {
                        ApplicationInfo applicationInfo = ((PackageInfo) j5g.Y(arrayList2)).applicationInfo;
                        if (applicationInfo == null || (g0 = context.getPackageManager().getApplicationLabel(applicationInfo).toString()) == null) {
                            g0 = "";
                        }
                    } else {
                        g0 = j5g.g0(arrayList2, ", ", null, null, 0, new wcg(n6vVar2, 24), 30);
                    }
                    String quantityString = context.getResources().getQuantityString(R.plurals.hijacking_apps_text, arrayList2.size(), g0);
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((PackageInfo) it3.next()).packageName);
                    }
                    aVar = new n6v.a(string, quantityString, arrayList3);
                }
                x0v.this.invoke(aVar);
            }
        };
        if (j == 0) {
            Timer timer = l3q.a;
            o.submit(runnable);
        } else {
            l3q.a.schedule(new k3q(o, runnable), j);
        }
        return s3q0.a;
    }
}
