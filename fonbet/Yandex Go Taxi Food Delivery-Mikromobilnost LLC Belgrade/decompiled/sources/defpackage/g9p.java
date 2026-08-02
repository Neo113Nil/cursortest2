package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.zzo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class g9p implements lvt0 {
    public final Handler a;
    public final Context b;
    public final zmb1 c;
    public final rb91 d;
    public final abe e;
    public final jqb1 f;
    public final jqb1 g;
    public final ThreadPoolExecutor h;
    public final zzo i;
    public final File j;
    public final AtomicReference k;
    public final Set l;
    public final Set m;
    public final AtomicBoolean n;

    public g9p(Context context, File file, zmb1 zmb1Var, rb91 rb91Var) {
        ThreadPoolExecutor l0 = ffx.l0();
        abe abeVar = new abe(context, false, false);
        this.a = new Handler(Looper.getMainLooper());
        this.k = new AtomicReference();
        this.l = Collections.synchronizedSet(new HashSet());
        this.m = Collections.synchronizedSet(new HashSet());
        this.n = new AtomicBoolean(false);
        this.b = context;
        this.j = file;
        this.c = zmb1Var;
        this.d = rb91Var;
        this.h = l0;
        this.e = abeVar;
        this.g = new jqb1();
        this.f = new jqb1();
        this.i = zzo.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0195, code lost:
    
        if (r2.contains(r14) == false) goto L60;
     */
    @Override // defpackage.lvt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Task a(SplitInstallRequest splitInstallRequest) {
        mvt0 mvt0Var;
        Integer a;
        int i;
        File[] fileArr;
        int i2;
        HashMap hashMap;
        int i3;
        String concat;
        try {
            synchronized (this) {
                mvt0 mvt0Var2 = (mvt0) this.k.get();
                mvt0Var = (mvt0) zzbx.c(new hhe0(5, mvt0Var2, splitInstallRequest));
                AtomicReference atomicReference = this.k;
                while (true) {
                    if (atomicReference.compareAndSet(mvt0Var2, mvt0Var)) {
                        break;
                    }
                    if (atomicReference.get() != mvt0Var2 && atomicReference.get() != mvt0Var2) {
                        mvt0Var = null;
                        break;
                    }
                }
            }
            if (mvt0Var == null) {
                return h(-100);
            }
            int g = mvt0Var.g();
            ArrayList arrayList = new ArrayList();
            Iterator it = splitInstallRequest.b.iterator();
            while (it.hasNext()) {
                arrayList.add(((Locale) it.next()).getLanguage());
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            File[] listFiles = this.j.listFiles(fsa1.a);
            if (listFiles == null) {
                return h(-5);
            }
            int i4 = 0;
            int i5 = 0;
            long j = 0;
            while (i5 < listFiles.length) {
                File file = listFiles[i5];
                String d = ssa1.d(file);
                String str = d.split("\\.config\\.", 2)[i4];
                hashSet.add(d);
                if (splitInstallRequest.a.contains(str)) {
                    String str2 = d.split("\\.config\\.", 2)[i4];
                    LocaleList locales = this.e.a.getResources().getConfiguration().getLocales();
                    i2 = i4;
                    i = g;
                    ArrayList arrayList3 = new ArrayList(locales.size());
                    fileArr = listFiles;
                    int i6 = i2;
                    while (i6 < locales.size()) {
                        Locale locale = locales.get(i6);
                        String language = locale.getLanguage();
                        if (locale.getCountry().isEmpty()) {
                            concat = "";
                            i3 = i6;
                        } else {
                            i3 = i6;
                            concat = "_".concat(String.valueOf(locale.getCountry()));
                        }
                        arrayList3.add(String.valueOf(language).concat(concat));
                        i6 = i3 + 1;
                    }
                    HashSet hashSet2 = new HashSet(arrayList3);
                    HashMap a2 = i().a(Arrays.asList(str2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = a2.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        if (str3.contains("_")) {
                            hashMap = a2;
                            str3 = str3.split("_", -1)[i2];
                        } else {
                            hashMap = a2;
                        }
                        hashSet4.add(str3);
                        a2 = hashMap;
                    }
                    HashMap hashMap2 = a2;
                    hashSet4.addAll(this.m);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (hashSet3.contains(d)) {
                    }
                    j += file.length();
                    arrayList2.add(file);
                    break;
                    i5++;
                    i4 = i2;
                    g = i;
                    listFiles = fileArr;
                } else {
                    i = g;
                    fileArr = listFiles;
                    i2 = i4;
                }
                ArrayList arrayList4 = splitInstallRequest.b;
                ArrayList arrayList5 = new ArrayList(this.l);
                arrayList5.addAll(Arrays.asList("", "base"));
                HashMap a3 = i().a(arrayList5);
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Locale locale2 = (Locale) it4.next();
                    if (a3.containsKey(locale2.getLanguage()) && ((Set) a3.get(locale2.getLanguage())).contains(d)) {
                        j += file.length();
                        arrayList2.add(file);
                        break;
                    }
                }
                i5++;
                i4 = i2;
                g = i;
                listFiles = fileArr;
            }
            int i7 = g;
            int i8 = i4;
            Log.i("FakeSplitInstallManager", "availableSplits " + hashSet.toString() + " want " + String.valueOf(splitInstallRequest.a));
            if (splitInstallRequest.a.size() != 1 || (a = (Integer) ((ztb1) this.d.zza()).b().get(splitInstallRequest.a.get(i8))) == null) {
                a = ((ztb1) this.d.zza()).a();
            }
            if (a != null) {
                return h(a.intValue());
            }
            if (!hashSet.containsAll(new HashSet(splitInstallRequest.a))) {
                return h(-2);
            }
            Long valueOf = Long.valueOf(j);
            ArrayList arrayList6 = splitInstallRequest.a;
            Integer valueOf2 = Integer.valueOf(i7);
            k(1, 0, 0L, valueOf, arrayList6, valueOf2, arrayList);
            this.h.execute(new ju61(12, this, arrayList2, arrayList));
            return udq0.p(valueOf2);
        } catch (zzbx e) {
            return h(((SplitInstallException) e.b()).b());
        }
    }

    @Override // defpackage.lvt0
    public final Task b(List list) {
        return udq0.o(new SplitInstallException(-5));
    }

    @Override // defpackage.lvt0
    public final boolean c(mvt0 mvt0Var, Activity activity) {
        return false;
    }

    @Override // defpackage.lvt0
    public final void d(nvt0 nvt0Var) {
        jqb1 jqb1Var = this.g;
        synchronized (jqb1Var) {
            jqb1Var.a.remove(nvt0Var);
        }
    }

    @Override // defpackage.lvt0
    public final Task e(final int i) {
        mvt0 mvt0Var;
        try {
            synchronized (this) {
                final mvt0 mvt0Var2 = (mvt0) this.k.get();
                mvt0Var = (mvt0) zzbx.c(new Callable() { // from class: a8b1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int h;
                        mvt0 mvt0Var3 = mvt0.this;
                        if (mvt0Var3 != null) {
                            int g = mvt0Var3.g();
                            int i2 = i;
                            if (i2 == g && ((h = mvt0Var3.h()) == 1 || h == 2 || h == 8 || h == 9 || h == 7)) {
                                return mvt0.b(i2, 7, mvt0Var3.c(), mvt0Var3.a(), mvt0Var3.i(), mvt0Var3.e(), mvt0Var3.d());
                            }
                        }
                        throw new SplitInstallException(-3);
                    }
                });
                AtomicReference atomicReference = this.k;
                while (true) {
                    if (!atomicReference.compareAndSet(mvt0Var2, mvt0Var)) {
                        if (atomicReference.get() != mvt0Var2 && atomicReference.get() != mvt0Var2) {
                            mvt0Var = null;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (mvt0Var != null) {
                this.a.post(new uqs(23, this, mvt0Var));
            }
            return udq0.p(null);
        } catch (zzbx e) {
            return udq0.o(e.b());
        }
    }

    @Override // defpackage.lvt0
    public final void f(nvt0 nvt0Var) {
        jqb1 jqb1Var = this.g;
        synchronized (jqb1Var) {
            jqb1Var.a.add(nvt0Var);
        }
    }

    @Override // defpackage.lvt0
    public final Set g() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.c.c());
        hashSet.addAll(this.l);
        return hashSet;
    }

    public final zzw h(int i) {
        j(new dn60(i, 19, (byte) 0));
        return udq0.o(new SplitInstallException(i));
    }

    public final kn81 i() {
        Context context = this.b;
        try {
            kn81 a = this.c.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData);
            if (a != null) {
                return a;
            }
            ny61.r("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ny61.h("App is not found in PackageManager", e);
            return null;
        }
    }

    public final synchronized mvt0 j(pjb1 pjb1Var) {
        mvt0 mvt0Var = (mvt0) this.k.get();
        mvt0 s = pjb1Var.s(mvt0Var);
        AtomicReference atomicReference = this.k;
        while (!atomicReference.compareAndSet(mvt0Var, s)) {
            if (atomicReference.get() != mvt0Var && atomicReference.get() != mvt0Var) {
                return null;
            }
        }
        return s;
    }

    public final boolean k(int i, int i2, Long l, Long l2, ArrayList arrayList, Integer num, ArrayList arrayList2) {
        mvt0 j = j(new qqg(num, i, i2, l, l2, arrayList, arrayList2));
        if (j == null) {
            return false;
        }
        this.a.post(new uqs(23, this, j));
        return true;
    }
}
