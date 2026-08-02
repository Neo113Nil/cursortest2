package defpackage;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.a;
import com.google.android.play.core.splitinstall.b;
import com.google.android.play.core.splitinstall.internal.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class b491 implements lvt0 {
    public final x891 a;
    public final tvb1 b;
    public final zmb1 c;
    public final d991 d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public b491(x891 x891Var, tvb1 tvb1Var, zmb1 zmb1Var, d991 d991Var) {
        this.a = x891Var;
        this.b = tvb1Var;
        this.c = zmb1Var;
        this.d = d991Var;
    }

    public static ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        if (r6.containsAll(r1) != false) goto L29;
     */
    @Override // defpackage.lvt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Task a(SplitInstallRequest splitInstallRequest) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        kn81 a;
        c3b1 c3b1Var = new c3b1();
        c3b1Var.a.add(new z7b1(1, System.currentTimeMillis()));
        splitInstallRequest.b.isEmpty();
        ArrayList arrayList = splitInstallRequest.b;
        if (!arrayList.isEmpty()) {
            zmb1 zmb1Var = this.c;
            zmb1Var.getClass();
            HashSet hashSet = null;
            try {
                packageInfo = zmb1Var.a.getPackageManager().getPackageInfo(zmb1Var.b, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                zmb1.c.b("App is not found in PackageManager", new Object[0]);
                packageInfo = null;
            }
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (a = zmb1Var.a(applicationInfo.metaData)) != null) {
                hashSet = new HashSet();
                HashSet f = zmb1.f(packageInfo);
                f.add("");
                HashSet e = zmb1.e(packageInfo);
                e.add("");
                for (Map.Entry entry : a.a(e).entrySet()) {
                    if (f.containsAll((Collection) entry.getValue())) {
                        hashSet.add((String) entry.getKey());
                    }
                }
            }
            if (hashSet != null) {
                HashSet hashSet2 = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet2.add(((Locale) it.next()).getLanguage());
                }
            }
        }
        if (this.c.c().containsAll(splitInstallRequest.a) && Collections.disjoint(splitInstallRequest.a, this.d.a())) {
            this.e.post(new j6b1(this, splitInstallRequest));
            return udq0.p(0);
        }
        d991 d991Var = this.d;
        ArrayList arrayList2 = splitInstallRequest.a;
        d991Var.getClass();
        synchronized (d991.class) {
            Set<String> a2 = d991Var.a();
            HashSet hashSet3 = new HashSet();
            boolean z = false;
            for (String str : a2) {
                if (arrayList2.contains(str)) {
                    z = true;
                } else {
                    hashSet3.add(str);
                }
            }
            if (z) {
                try {
                    d991Var.a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", hashSet3).apply();
                } catch (Exception unused2) {
                }
            }
        }
        x891 x891Var = this.a;
        ArrayList arrayList3 = splitInstallRequest.a;
        ArrayList h = h(splitInstallRequest.b);
        c cVar = x891Var.b;
        if (cVar == null) {
            return x891.d();
        }
        x891.c.d("startInstall(%s,%s)", arrayList3, h);
        atx0 atx0Var = new atx0();
        cVar.a().post(new awb1(cVar, atx0Var, atx0Var, new a(x891Var, atx0Var, arrayList3, h, c3b1Var, atx0Var)));
        return atx0Var.a;
    }

    @Override // defpackage.lvt0
    public final Task b(List list) {
        x891 x891Var = this.a;
        c cVar = x891Var.b;
        if (cVar == null) {
            return x891.d();
        }
        x891.c.d("deferredInstall(%s)", list);
        atx0 atx0Var = new atx0();
        cVar.a().post(new awb1(cVar, atx0Var, atx0Var, new b(x891Var, atx0Var, list, atx0Var)));
        return atx0Var.a;
    }

    @Override // defpackage.lvt0
    public final boolean c(mvt0 mvt0Var, Activity activity) {
        if (mvt0Var.h() != 8 || mvt0Var.f() == null) {
            return false;
        }
        activity.startIntentSenderForResult(mvt0Var.f().getIntentSender(), HProv.PP_LCD_QUERY, null, 0, 0, 0);
        return true;
    }

    @Override // defpackage.lvt0
    public final synchronized void d(nvt0 nvt0Var) {
        tvb1 tvb1Var = this.b;
        synchronized (tvb1Var) {
            tvb1Var.a.d("unregisterListener", new Object[0]);
            if (nvt0Var == null) {
                ny61.t("Unregistered Play Core listener should not be null.");
            }
            tvb1Var.d.remove(nvt0Var);
            tvb1Var.a();
        }
    }

    @Override // defpackage.lvt0
    public final Task e(int i) {
        x891 x891Var = this.a;
        c cVar = x891Var.b;
        if (cVar == null) {
            return x891.d();
        }
        x891.c.d("cancelInstall(%d)", Integer.valueOf(i));
        atx0 atx0Var = new atx0();
        cVar.a().post(new awb1(cVar, atx0Var, atx0Var, new com.google.android.play.core.splitinstall.c(x891Var, atx0Var, i, atx0Var)));
        return atx0Var.a;
    }

    @Override // defpackage.lvt0
    public final synchronized void f(nvt0 nvt0Var) {
        tvb1 tvb1Var = this.b;
        synchronized (tvb1Var) {
            tvb1Var.a.d("registerListener", new Object[0]);
            tvb1Var.d.add(nvt0Var);
            tvb1Var.a();
        }
    }

    @Override // defpackage.lvt0
    public final Set g() {
        return this.c.c();
    }
}
