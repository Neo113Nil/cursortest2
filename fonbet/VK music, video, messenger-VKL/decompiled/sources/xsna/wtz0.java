package xsna;

import android.app.Activity;
import android.content.IntentSender;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class wtz0 implements mlk0 {
    public final x201 a;
    public final bs01 b;
    public final dp01 c;
    public final e301 d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public wtz0(x201 x201Var, bs01 bs01Var, dp01 dp01Var, e301 e301Var) {
        this.a = x201Var;
        this.b = bs01Var;
        this.c = dp01Var;
        this.d = e301Var;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (r6.containsAll(r2) != false) goto L29;
     */
    @Override // xsna.mlk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Task<Integer> a(nlk0 nlk0Var) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        ti01 a;
        h3g0 h3g0Var = new h3g0(9);
        h3g0Var.q(1);
        nlk0Var.a().isEmpty();
        ArrayList a2 = nlk0Var.a();
        if (!a2.isEmpty()) {
            dp01 dp01Var = this.c;
            dp01Var.getClass();
            HashSet hashSet = null;
            try {
                packageInfo = dp01Var.a.getPackageManager().getPackageInfo(dp01Var.b, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                dp01.c.b("App is not found in PackageManager", new Object[0]);
                packageInfo = null;
            }
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (a = dp01Var.a(applicationInfo.metaData)) != null) {
                hashSet = new HashSet();
                HashSet e = dp01.e(packageInfo);
                e.add("");
                HashSet d = dp01.d(packageInfo);
                d.add("");
                for (Map.Entry entry : a.a(d).entrySet()) {
                    if (e.containsAll((Collection) entry.getValue())) {
                        hashSet.add((String) entry.getKey());
                    }
                }
            }
            if (hashSet != null) {
                HashSet hashSet2 = new HashSet();
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    hashSet2.add(((Locale) it.next()).getLanguage());
                }
            }
        }
        if (this.c.b().containsAll(nlk0Var.b()) && Collections.disjoint(nlk0Var.b(), this.d.a())) {
            this.e.post(new ue01(2, this, nlk0Var));
            return Tasks.forResult(0);
        }
        e301 e301Var = this.d;
        ArrayList b = nlk0Var.b();
        e301Var.getClass();
        synchronized (e301.class) {
            Set<String> a3 = e301Var.a();
            HashSet hashSet3 = new HashSet();
            boolean z = false;
            for (String str : a3) {
                if (b.contains(str)) {
                    z = true;
                } else {
                    hashSet3.add(str);
                }
            }
            if (z) {
                try {
                    Preference.h(e301Var.a, 0, "playcore_split_install_internal").edit().putStringSet("modules_to_uninstall_if_emulated", hashSet3).apply();
                } catch (Exception unused2) {
                }
            }
        }
        x201 x201Var = this.a;
        ArrayList b2 = nlk0Var.b();
        ArrayList f = f(nlk0Var.a());
        uvz0 uvz0Var = x201Var.b;
        if (uvz0Var == null) {
            x201.c.b("onError(%d)", -14);
            return Tasks.forException(new SplitInstallException(-14));
        }
        x201.c.d("startInstall(%s,%s)", b2, f);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        wxz0 wxz0Var = new wxz0(x201Var, taskCompletionSource, b2, f, h3g0Var, taskCompletionSource);
        uvz0Var.a().post(new ss01(uvz0Var, wxz0Var.a(), taskCompletionSource, wxz0Var));
        return taskCompletionSource.getTask();
    }

    @Override // xsna.mlk0
    public final Task<Void> b(int i) {
        x201 x201Var = this.a;
        uvz0 uvz0Var = x201Var.b;
        if (uvz0Var == null) {
            x201.c.b("onError(%d)", -14);
            return Tasks.forException(new SplitInstallException(-14));
        }
        x201.c.d("cancelInstall(%d)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        lzz0 lzz0Var = new lzz0(x201Var, taskCompletionSource, i, taskCompletionSource);
        uvz0Var.a().post(new ss01(uvz0Var, lzz0Var.a(), taskCompletionSource, lzz0Var));
        return taskCompletionSource.getTask();
    }

    @Override // xsna.mlk0
    public final boolean c(olk0 olk0Var, Activity activity, int i) throws IntentSender.SendIntentException {
        us01 us01Var = new us01(activity);
        if (olk0Var.h() != 8 || olk0Var.f() == null) {
            return false;
        }
        us01Var.a(olk0Var.f().getIntentSender(), i);
        return true;
    }

    @Override // xsna.mlk0
    public final synchronized void d(plk0 plk0Var) {
        this.b.a(plk0Var);
    }

    @Override // xsna.mlk0
    public final Set<String> e() {
        return this.c.b();
    }
}
