package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.zzo;
import com.yandex.div.state.db.StateEntry;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class kst0 {
    public static final AtomicReference e = new AtomicReference(null);
    public final ndi0 a;
    public final d991 b;
    public final HashSet c = new HashSet();
    public final o370 d;

    public kst0(Context context) {
        try {
            ndi0 ndi0Var = new ndi0(context);
            this.a = ndi0Var;
            this.d = new o370(ndi0Var);
            this.b = new d991(context);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new zzbh(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[Catch: all -> 0x007b, Exception -> 0x007d, LOOP:0: B:22:0x004b->B:24:0x0051, LOOP_END, TryCatch #0 {Exception -> 0x007d, blocks: (B:21:0x0042, B:22:0x004b, B:24:0x0051, B:26:0x007f), top: B:20:0x0042, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity) {
        HashSet hashSet;
        StrictMode.ThreadPolicy threadPolicy;
        Iterator it;
        kst0 kst0Var = (kst0) e.get();
        if (kst0Var == null) {
            if (activity.getApplicationContext() != null) {
                d(activity.getApplicationContext(), false);
            }
            d(activity, false);
            return;
        }
        o370 o370Var = kst0Var.d;
        synchronized (kst0Var.c) {
            hashSet = new HashSet(kst0Var.c);
        }
        synchronized (o370Var) {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
            } catch (Exception e2) {
                e = e2;
                threadPolicy = null;
            }
            try {
                StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
            } catch (Exception e3) {
                e = e3;
                Log.i("SplitCompat", "Unable to set up strict mode.", e);
                try {
                    HashSet hashSet2 = new HashSet();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                    }
                    o370Var.r(activity, hashSet2);
                } catch (Exception e4) {
                    Log.e("SplitCompat", "Error installing additional splits", e4);
                }
            }
            try {
                HashSet hashSet22 = new HashSet();
                it = hashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    File file = new File(((ndi0) o370Var.a).l(), "verified-splits");
                    ndi0.j(file);
                    hashSet22.add(ndi0.i(file, String.valueOf(str).concat(".apk")));
                }
                o370Var.r(activity, hashSet22);
            } catch (Throwable th) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th;
            }
        }
    }

    public static boolean d(Context context, boolean z) {
        AtomicReference atomicReference;
        boolean z2;
        kst0 kst0Var = new kst0(context);
        while (true) {
            atomicReference = e;
            if (!atomicReference.compareAndSet(null, kst0Var)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        kst0 kst0Var2 = (kst0) atomicReference.get();
        if (z2) {
            zzo zzoVar = zzo.zza;
            ThreadPoolExecutor l0 = ffx.l0();
            ndi0 ndi0Var = kst0Var2.a;
            new o591();
            ofa0 ofa0Var = new ofa0(context, ndi0Var);
            ndi0 ndi0Var2 = kst0Var2.a;
            new fnb1();
            f691 f691Var = new f691(context, l0, ofa0Var, ndi0Var2);
            zzoVar.getClass();
            zzo.b(f691Var);
            vbb1 vbb1Var = new vbb1(kst0Var2);
            AtomicReference atomicReference2 = ojb1.a;
            while (!atomicReference2.compareAndSet(null, vbb1Var) && (atomicReference2.get() == null || atomicReference2.get() == null)) {
            }
            ffx.l0().execute(new mbs(15, context));
        }
        try {
            kst0Var2.c(context, z);
            return true;
        } catch (Exception e2) {
            Log.e("SplitCompat", "Error installing additional splits", e2);
            return false;
        }
    }

    public final void b(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ndi0 ndi0Var = this.a;
            ndi0Var.getClass();
            File file = new File(ndi0Var.l(), "verified-splits");
            ndi0.j(file);
            ndi0.h(ndi0.i(file, String.valueOf(str).concat(".apk")));
        }
        d991 d991Var = this.b;
        d991Var.getClass();
        synchronized (d991.class) {
            d991Var.a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final synchronized void c(Context context, boolean z) {
        IOException iOException;
        ClassLoader classLoader;
        try {
            if (z) {
                this.a.g();
            } else {
                ffx.l0().execute(new mbs(16, this));
            }
            String packageName = context.getPackageName();
            try {
                boolean z2 = false;
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet f = this.a.f();
                Set a = this.b.a();
                HashSet hashSet = new HashSet();
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    String b = ((a891) it.next()).b();
                    if (arrayList.contains(b) || a.contains(zmb1.b(b))) {
                        hashSet.add(b);
                        it.remove();
                    }
                }
                if (z) {
                    b(hashSet);
                } else if (!hashSet.isEmpty()) {
                    ffx.l0().execute(new vjb1(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = f.iterator();
                while (it2.hasNext()) {
                    String b2 = ((a891) it2.next()).b();
                    if (!zmb1.d(b2)) {
                        hashSet2.add(b2);
                    }
                }
                for (String str : arrayList) {
                    if (!zmb1.d(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet hashSet3 = new HashSet(f.size());
                Iterator it3 = f.iterator();
                while (it3.hasNext()) {
                    a891 a891Var = (a891) it3.next();
                    String b3 = a891Var.b();
                    il0 il0Var = zmb1.c;
                    if (b3.startsWith("config.") || hashSet2.contains(zmb1.b(a891Var.b()))) {
                        hashSet3.add(a891Var);
                    }
                }
                a3b1 a3b1Var = new a3b1(this.a);
                ClassLoader classLoader2 = context.getClassLoader();
                ZipFile zipFile = null;
                if (z) {
                    fqa1.h(classLoader2, a3b1Var.a());
                } else {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        a891 a891Var2 = (a891) it4.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        a3b1.b(a891Var2, new cr71((Object) a3b1Var, (Object) a891Var2, (Cloneable) hashSet4, (Object) atomicBoolean, 19));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it4.remove();
                        } else {
                            fqa1.h(classLoader2, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    a891 a891Var3 = (a891) it5.next();
                    try {
                        ZipFile zipFile2 = new ZipFile(a891Var3.a());
                        try {
                            ZipEntry entry = zipFile2.getEntry("classes.dex");
                            zipFile2.close();
                            if (entry != null) {
                                ndi0 ndi0Var = this.a;
                                String b4 = a891Var3.b();
                                ndi0Var.getClass();
                                File file = new File(ndi0Var.l(), "dex");
                                ndi0.j(file);
                                File i = ndi0.i(file, b4);
                                ndi0.j(i);
                                classLoader = classLoader2;
                                if (!dpa1.e(classLoader, i, a891Var3.a(), z, new vuz(z2), StateEntry.COLUMN_PATH, new r100(z2))) {
                                    a891Var3.a().toString();
                                    classLoader2 = classLoader;
                                }
                            } else {
                                classLoader = classLoader2;
                            }
                            hashSet5.add(a891Var3.a());
                            classLoader2 = classLoader;
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
                this.d.r(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    a891 a891Var4 = (a891) it6.next();
                    if (hashSet5.contains(a891Var4.a())) {
                        hashSet6.add(a891Var4.b());
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
