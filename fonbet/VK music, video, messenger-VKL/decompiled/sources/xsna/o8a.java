package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.api.a;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.preference.Preference;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o8a implements n8a, b9i {
    public final /* synthetic */ Object b;

    public /* synthetic */ o8a(Object obj) {
        this.b = obj;
    }

    @Override // xsna.n8a
    public CatalogBlockState a(CatalogBlockVariant catalogBlockVariant, UIBlock uIBlock) {
        return (CatalogBlockState) ((wzs) this.b).invoke(catalogBlockVariant, uIBlock);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(1:3)(1:130)|4|(1:6)|(1:8)(1:129)|9|(2:127|128)(2:13|(2:125|126)(4:17|(2:20|18)|21|22))|23|(2:26|24)|27|28|(19:29|30|(1:32)|33|34|(1:36)|(1:38)(1:121)|39|(4:42|(2:44|45)(1:47)|46|40)|48|49|(2:52|50)|53|54|(1:56)(1:120)|(1:58)(1:119)|59|(5:106|(1:108)|109|32a|114)(1:63)|64)|(4:68|(1:70)(2:102|(1:104))|71|(2:75|76)(11:78|79|80|81|82|83|84|(1:97)(1:92)|93|94|95))|105|71|(3:73|75|76)|78|79|80|81|82|83|84|(2:86|88)|97|93|94|95) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x049e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x04ac, code lost:
    
        android.util.Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", r0);
        r6.h = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0458, code lost:
    
        r6.g = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [xsna.mx1] */
    @Override // xsna.b9i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(lcg0 lcg0Var) {
        String str;
        String str2;
        wtk wtkVar;
        Object obj;
        g43 g43Var;
        k1j0 k1j0Var;
        Task<Void> task;
        Task onSuccessTask;
        sar sarVar;
        Context context;
        boolean z;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        d0j0 a;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i = CrashlyticsRegistrar.d;
        g6k.d.getClass();
        System.currentTimeMillis();
        vhr vhrVar = (vhr) lcg0Var.a(vhr.class);
        uir uirVar = (uir) lcg0Var.a(uir.class);
        yrl h = lcg0Var.h(f5k.class);
        yrl h2 = lcg0Var.h(ex1.class);
        yrl h3 = lcg0Var.h(akr.class);
        ExecutorService executorService = (ExecutorService) lcg0Var.c(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) lcg0Var.c(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) lcg0Var.c(crashlyticsRegistrar.c);
        vhrVar.a();
        Context context2 = vhrVar.a;
        String packageName = context2.getPackageName();
        g6k g6kVar = new g6k(executorService, executorService2);
        sar sarVar2 = new sar(context2);
        wtk wtkVar2 = new wtk(vhrVar);
        isv isvVar = new isv(context2, packageName, uirVar, wtkVar2);
        h5k h5kVar = new h5k(h);
        final ox1 ox1Var = new ox1(h2);
        n4k n4kVar = new n4k(wtkVar2, sarVar2);
        com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.a;
        SessionSubscriber.Name name = SessionSubscriber.Name.CRASHLYTICS;
        com.google.firebase.sessions.api.a aVar2 = com.google.firebase.sessions.api.a.a;
        a.C0146a a2 = com.google.firebase.sessions.api.a.a(name);
        if (a2.b != null) {
            Objects.toString(name);
        } else {
            a2.b = n4kVar;
            Objects.toString(name);
            a2.a.c(null);
        }
        wtk wtkVar3 = wtkVar2;
        final d5k d5kVar = new d5k(vhrVar, isvVar, h5kVar, wtkVar3, new lx1(ox1Var), new ux1() { // from class: xsna.mx1
            @Override // xsna.ux1
            public final void a(Bundle bundle) {
                ox1.this.a.a(bundle);
            }
        }, sarVar2, n4kVar, new zuf0(h3), g6kVar);
        g6k g6kVar2 = d5kVar.p;
        vhrVar.a();
        String str3 = vhrVar.c.b;
        int e = fng.e(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e == 0) {
            e = fng.e(context2, "com.crashlytics.android.build_id", "string");
        }
        String string = e != 0 ? context2.getResources().getString(e) : null;
        ArrayList arrayList = new ArrayList();
        int e2 = fng.e(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e3 = fng.e(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e4 = fng.e(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (e2 == 0 || e3 == 0 || e4 == 0) {
            str = null;
            str2 = str3;
            wtkVar = wtkVar3;
            String.format("Could not find resources: %d %d %d", Integer.valueOf(e2), Integer.valueOf(e3), Integer.valueOf(e4));
        } else {
            str = null;
            String[] stringArray = context2.getResources().getStringArray(e2);
            String[] stringArray2 = context2.getResources().getStringArray(e3);
            String[] stringArray3 = context2.getResources().getStringArray(e4);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i2 = 0;
                while (i2 < stringArray3.length) {
                    int i3 = i2;
                    arrayList.add(new jn8(stringArray[i2], stringArray2[i2], stringArray3[i3]));
                    i2 = i3 + 1;
                    str3 = str3;
                    wtkVar3 = wtkVar3;
                }
                str2 = str3;
                wtkVar = wtkVar3;
            } else {
                str2 = str3;
                wtkVar = wtkVar3;
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str4 = ((jn8) it.next()).a;
        }
        s5m s5mVar = new s5m(context2);
        try {
            String packageName2 = context2.getPackageName();
            String d = isvVar.d();
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName2, 0);
            String l = Long.toString(packageInfo.getLongVersionCode());
            String str5 = packageInfo.versionName;
            if (str5 == null) {
                str5 = "0.0";
            }
            String str6 = str5;
            g43Var = new g43(str2, string, arrayList, d, packageName2, l, str6, s5mVar);
            String str7 = str2;
            m63 m63Var = new m63();
            String d2 = isvVar.d();
            ozg0 ozg0Var = new ozg0();
            t2j0 t2j0Var = new t2j0(ozg0Var);
            ny8 ny8Var = new ny8();
            ny8Var.a = new File(sarVar2.c, "com.crashlytics.settings.json");
            Locale locale = Locale.US;
            o04 o04Var = new o04(zr.a("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str7, "/settings"), m63Var);
            String str8 = Build.MANUFACTURER;
            String str9 = isv.h;
            String b = pzl.b(str8.replaceAll(str9, ""), DomExceptionUtils.SEPARATOR, Build.MODEL.replaceAll(str9, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str9, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str9, "");
            int e5 = fng.e(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e5 == 0) {
                e5 = fng.e(context2, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {e5 != 0 ? context2.getResources().getString(e5) : str, str7, str6, l};
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (i4 < 4) {
                String str10 = strArr[i4];
                String str11 = str7;
                if (str10 != null) {
                    arrayList2.add(str10.replace("-", "").toLowerCase(Locale.US));
                }
                i4++;
                str7 = str11;
            }
            String str12 = str7;
            Collections.sort(arrayList2);
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
            }
            String sb2 = sb.toString();
            k1j0Var = new k1j0(context2, new k3j0(str12, b, replaceAll, replaceAll2, isvVar, sb2.length() > 0 ? fng.i(sb2) : str, str6, l, (d2 != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).h()), ozg0Var, t2j0Var, ny8Var, o04Var, wtkVar);
            a1j0 a1j0Var = a1j0.USE_CACHE;
            AtomicReference<TaskCompletionSource<d0j0>> atomicReference = k1j0Var.i;
            AtomicReference<d0j0> atomicReference2 = k1j0Var.h;
            if (!Preference.h(k1j0Var.a, 0, "com.google.firebase.crashlytics").getString("existing_instance_identifier", "").equals(k1j0Var.b.f) || (a = k1j0Var.a(a1j0Var)) == null) {
                d0j0 a3 = k1j0Var.a(a1j0.IGNORE_CACHE_EXPIRATION);
                if (a3 != null) {
                    atomicReference2.set(a3);
                    atomicReference.get().trySetResult(a3);
                }
                wtk wtkVar4 = k1j0Var.g;
                Task<Void> task2 = wtkVar4.g.getTask();
                synchronized (wtkVar4.c) {
                    task = wtkVar4.d.getTask();
                }
                onSuccessTask = x5k.a(task2, task).onSuccessTask(g6kVar.a, new j1j0(k1j0Var, g6kVar));
            } else {
                atomicReference2.set(a);
                atomicReference.get().trySetResult(a);
                onSuccessTask = Tasks.forResult(str);
            }
            onSuccessTask.addOnFailureListener(executorService3, new nir());
            sarVar = d5kVar.j;
            context = d5kVar.a;
        } catch (PackageManager.NameNotFoundException e6) {
            obj = str;
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e6);
        }
        if (context != null && (resources = context.getResources()) != null) {
            int e7 = fng.e(context, "com.crashlytics.RequireBuildId", "bool");
            if (e7 > 0) {
                z = resources.getBoolean(e7);
            } else {
                int e8 = fng.e(context, "com.crashlytics.RequireBuildId", "string");
                if (e8 > 0) {
                    z = Boolean.parseBoolean(context.getString(e8));
                }
            }
            String str13 = g43Var.b;
            if (z && TextUtils.isEmpty(str13)) {
                Log.e("FirebaseCrashlytics", ".");
                Log.e("FirebaseCrashlytics", ".     |  | ");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                Log.e("FirebaseCrashlytics", ".    \\    /");
                Log.e("FirebaseCrashlytics", ".     \\  /");
                Log.e("FirebaseCrashlytics", ".      \\/");
                Log.e("FirebaseCrashlytics", ".");
                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                Log.e("FirebaseCrashlytics", ".");
                Log.e("FirebaseCrashlytics", ".      /\\");
                Log.e("FirebaseCrashlytics", ".     /  \\");
                Log.e("FirebaseCrashlytics", ".    /    \\");
                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".");
                throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            }
            final String str14 = new cv8().a;
            d5kVar.f = new e5k("crash_marker", sarVar);
            d5kVar.e = new e5k("initialization_marker", sarVar);
            alq0 alq0Var = new alq0(str14, sarVar, g6kVar2);
            g000 g000Var = new g000(sarVar);
            yl20 yl20Var = new yl20(new wuj());
            ((yt80) d5kVar.o.a).a(new xy9());
            d5kVar.h = new u4k(d5kVar.a, d5kVar.i, d5kVar.b, d5kVar.j, d5kVar.f, g43Var, alq0Var, g000Var, tui0.d(d5kVar.a, d5kVar.i, d5kVar.j, g43Var, g000Var, alq0Var, yl20Var, k1j0Var, d5kVar.c, d5kVar.m, d5kVar.p), d5kVar.n, d5kVar.l, d5kVar.m, d5kVar.p);
            e5k e5kVar = d5kVar.e;
            sar sarVar3 = e5kVar.b;
            String str15 = e5kVar.a;
            sarVar3.getClass();
            exists = new File(sarVar3.c, str15).exists();
            d5kVar.g = Boolean.TRUE.equals((Boolean) g6kVar2.a.b.submit(new Callable() { // from class: xsna.z4k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    u4k u4kVar = d5k.this.h;
                    u4kVar.getClass();
                    g6k.a();
                    e5k e5kVar2 = u4kVar.c;
                    sar sarVar4 = e5kVar2.b;
                    String str16 = e5kVar2.a;
                    sarVar4.getClass();
                    boolean z2 = true;
                    if (new File(sarVar4.c, str16).exists()) {
                        sar sarVar5 = e5kVar2.b;
                        sarVar5.getClass();
                        new File(sarVar5.c, str16).delete();
                    } else {
                        String e9 = u4kVar.e();
                        if (e9 == null || !u4kVar.j.d(e9)) {
                            z2 = false;
                        }
                    }
                    return Boolean.valueOf(z2);
                }
            }).get(3L, TimeUnit.SECONDS));
            final u4k u4kVar = d5kVar.h;
            AtomicBoolean atomicBoolean = d4k.a;
            u4kVar.e.a.a(new Runnable() { // from class: xsna.o4k
                @Override // java.lang.Runnable
                public final void run() {
                    String str16 = str14;
                    u4k.this.c(Boolean.FALSE, str16);
                }
            });
            y5k y5kVar = new y5k(new q4k(u4kVar), k1j0Var, u4kVar.j);
            u4kVar.n = y5kVar;
            d4k.a(y5kVar);
            if (exists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                g6kVar2.a.a(new w4k(0, d5kVar, k1j0Var));
            } else {
                d5kVar.b(k1j0Var);
            }
            obj = new FirebaseCrashlytics(d5kVar);
            System.currentTimeMillis();
            return obj;
        }
        z = true;
        String str132 = g43Var.b;
        if (z) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        final String str142 = new cv8().a;
        d5kVar.f = new e5k("crash_marker", sarVar);
        d5kVar.e = new e5k("initialization_marker", sarVar);
        alq0 alq0Var2 = new alq0(str142, sarVar, g6kVar2);
        g000 g000Var2 = new g000(sarVar);
        yl20 yl20Var2 = new yl20(new wuj());
        ((yt80) d5kVar.o.a).a(new xy9());
        d5kVar.h = new u4k(d5kVar.a, d5kVar.i, d5kVar.b, d5kVar.j, d5kVar.f, g43Var, alq0Var2, g000Var2, tui0.d(d5kVar.a, d5kVar.i, d5kVar.j, g43Var, g000Var2, alq0Var2, yl20Var2, k1j0Var, d5kVar.c, d5kVar.m, d5kVar.p), d5kVar.n, d5kVar.l, d5kVar.m, d5kVar.p);
        e5k e5kVar2 = d5kVar.e;
        sar sarVar32 = e5kVar2.b;
        String str152 = e5kVar2.a;
        sarVar32.getClass();
        exists = new File(sarVar32.c, str152).exists();
        d5kVar.g = Boolean.TRUE.equals((Boolean) g6kVar2.a.b.submit(new Callable() { // from class: xsna.z4k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u4k u4kVar2 = d5k.this.h;
                u4kVar2.getClass();
                g6k.a();
                e5k e5kVar22 = u4kVar2.c;
                sar sarVar4 = e5kVar22.b;
                String str16 = e5kVar22.a;
                sarVar4.getClass();
                boolean z2 = true;
                if (new File(sarVar4.c, str16).exists()) {
                    sar sarVar5 = e5kVar22.b;
                    sarVar5.getClass();
                    new File(sarVar5.c, str16).delete();
                } else {
                    String e9 = u4kVar2.e();
                    if (e9 == null || !u4kVar2.j.d(e9)) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            }
        }).get(3L, TimeUnit.SECONDS));
        final u4k u4kVar2 = d5kVar.h;
        AtomicBoolean atomicBoolean2 = d4k.a;
        u4kVar2.e.a.a(new Runnable() { // from class: xsna.o4k
            @Override // java.lang.Runnable
            public final void run() {
                String str16 = str142;
                u4k.this.c(Boolean.FALSE, str16);
            }
        });
        y5k y5kVar2 = new y5k(new q4k(u4kVar2), k1j0Var, u4kVar2.j);
        u4kVar2.n = y5kVar2;
        d4k.a(y5kVar2);
        if (exists) {
        }
        g6kVar2.a.a(new w4k(0, d5kVar, k1j0Var));
        obj = new FirebaseCrashlytics(d5kVar);
        System.currentTimeMillis();
        return obj;
    }
}
