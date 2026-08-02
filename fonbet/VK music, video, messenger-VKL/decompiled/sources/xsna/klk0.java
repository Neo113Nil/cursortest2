package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.vk.core.preference.Preference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class klk0 {
    public static final AtomicReference e = new AtomicReference(null);
    public final t801 a;
    public final e301 b;
    public final HashSet c = new HashSet();
    public final ftz0 d;

    public klk0(Context context) {
        try {
            t801 t801Var = new t801(context);
            this.a = t801Var;
            this.d = new ftz0(t801Var);
            this.b = new e301(context);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new zzbh(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r0 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(@NonNull AppCompatActivity appCompatActivity) {
        HashSet hashSet;
        StrictMode.ThreadPolicy threadPolicy;
        klk0 klk0Var = (klk0) e.get();
        if (klk0Var == null) {
            if (appCompatActivity.getApplicationContext() != null) {
                d(appCompatActivity.getApplicationContext(), false);
            }
            d(appCompatActivity, false);
            return;
        }
        ftz0 ftz0Var = klk0Var.d;
        synchronized (klk0Var.c) {
            hashSet = new HashSet(klk0Var.c);
        }
        synchronized (ftz0Var) {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                threadPolicy = null;
            }
            try {
                try {
                    HashSet hashSet2 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        File file = new File(ftz0Var.a.g(), "verified-splits");
                        t801.e(file);
                        hashSet2.add(t801.d(file, String.valueOf(str).concat(".apk")));
                    }
                    ftz0Var.a(appCompatActivity, hashSet2);
                } catch (Exception e2) {
                    Log.e("SplitCompat", "Error installing additional splits", e2);
                }
            } catch (Throwable th) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th;
            }
        }
    }

    public static boolean d(final Context context, boolean z) {
        AtomicReference atomicReference;
        boolean z2;
        klk0 klk0Var = new klk0(context);
        while (true) {
            atomicReference = e;
            if (!atomicReference.compareAndSet(null, klk0Var)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        klk0 klk0Var2 = (klk0) atomicReference.get();
        if (z2) {
            com.google.android.play.core.splitinstall.zzo zzoVar = com.google.android.play.core.splitinstall.zzo.zza;
            lxz0 lxz0Var = new lxz0(context, m9u0.e(), new byz0(context, klk0Var2.a), klk0Var2.a);
            zzoVar.getClass();
            com.google.android.play.core.splitinstall.zzo.i(lxz0Var);
            cn01 cn01Var = new cn01(klk0Var2);
            AtomicReference atomicReference2 = mo01.a;
            while (!atomicReference2.compareAndSet(null, cn01Var) && (atomicReference2.get() == null || atomicReference2.get() == null)) {
            }
            m9u0.e().execute(new Runnable() { // from class: xsna.lm01
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    AtomicReference atomicReference3 = klk0.e;
                    try {
                        bs01 c = bs01.c(context2);
                        synchronized (c) {
                            c.f = true;
                            c.b();
                        }
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        }
        try {
            klk0Var2.c(context, z);
            return true;
        } catch (Exception e2) {
            Log.e("SplitCompat", "Error installing additional splits", e2);
            return false;
        }
    }

    public final void b(HashSet hashSet) throws IOException {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            t801 t801Var = this.a;
            t801Var.getClass();
            File file = new File(t801Var.g(), "verified-splits");
            t801.e(file);
            t801.c(t801.d(file, String.valueOf(str).concat(".apk")));
        }
        e301 e301Var = this.b;
        e301Var.getClass();
        synchronized (e301.class) {
            Preference.h(e301Var.a, 0, "playcore_split_install_internal").edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final synchronized void c(Context context, boolean z) throws IOException {
        IOException iOException;
        boolean z2;
        try {
            if (z) {
                this.a.b();
            } else {
                m9u0.e().execute(new vn01(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet a = this.a.a();
                Set a2 = this.b.a();
                HashSet hashSet = new HashSet();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    String b = ((vp01) it.next()).b();
                    if (!arrayList.contains(b)) {
                        lq01 lq01Var = dp01.c;
                        if (a2.contains(b.startsWith("config.") ? "" : b.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet.add(b);
                    it.remove();
                }
                int i = 1;
                if (z) {
                    b(hashSet);
                } else if (!hashSet.isEmpty()) {
                    m9u0.e().execute(new uc01(i, this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    String b2 = ((vp01) it2.next()).b();
                    if (!dp01.c(b2)) {
                        hashSet2.add(b2);
                    }
                }
                for (String str : arrayList) {
                    if (!dp01.c(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet hashSet3 = new HashSet(a.size());
                Iterator it3 = a.iterator();
                while (it3.hasNext()) {
                    vp01 vp01Var = (vp01) it3.next();
                    String b3 = vp01Var.b();
                    lq01 lq01Var2 = dp01.c;
                    if (!b3.startsWith("config.")) {
                        String b4 = vp01Var.b();
                        if (hashSet2.contains(b4.startsWith("config.") ? "" : b4.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet3.add(vp01Var);
                }
                vl01 vl01Var = new vl01(this.a);
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile = null;
                if (z) {
                    cvk.A(classLoader, vl01Var.a());
                } else {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        vp01 vp01Var2 = (vp01) it4.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        vl01.b(vp01Var2, new wd01(vl01Var, vp01Var2, hashSet4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it4.remove();
                        } else {
                            cvk.A(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    vp01 vp01Var3 = (vp01) it5.next();
                    try {
                        ZipFile zipFile2 = new ZipFile(vp01Var3.a());
                        try {
                            ZipEntry entry = zipFile2.getEntry("classes.dex");
                            zipFile2.close();
                            if (entry != null) {
                                t801 t801Var = this.a;
                                String b5 = vp01Var3.b();
                                t801Var.getClass();
                                File file = new File(t801Var.g(), "dex");
                                t801.e(file);
                                File d = t801.d(file, b5);
                                t801.e(d);
                                z2 = z;
                                if (!tzz0.a(classLoader, d, vp01Var3.a(), z2, new sdi(), "path", new jcr())) {
                                    "split was not installed ".concat(vp01Var3.a().toString());
                                    z = z2;
                                }
                            } else {
                                z2 = z;
                            }
                            hashSet5.add(vp01Var3.a());
                            z = z2;
                        } catch (IOException e2) {
                            iOException = e2;
                            zipFile = zipFile2;
                            if (zipFile == null) {
                                throw iOException;
                            }
                            try {
                                zipFile.close();
                                throw iOException;
                            } catch (IOException e3) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(iOException, e3);
                                    throw iOException;
                                } catch (Exception unused) {
                                    throw iOException;
                                }
                            }
                        }
                    } catch (IOException e4) {
                        iOException = e4;
                    }
                }
                this.d.a(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    vp01 vp01Var4 = (vp01) it6.next();
                    if (hashSet5.contains(vp01Var4.a())) {
                        hashSet6.add(vp01Var4.b());
                    }
                }
                synchronized (this.c) {
                    this.c.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e5);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
