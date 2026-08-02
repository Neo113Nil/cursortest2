package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class vjq implements mlk0 {
    public static final long o = TimeUnit.SECONDS.toMillis(1);
    public static final /* synthetic */ int p = 0;
    public final Handler a;
    public final Context b;
    public final dp01 c;
    public final r401 d;
    public final j401 e;
    public final mo8 f;
    public final mo8 g;
    public final ThreadPoolExecutor h;
    public final com.google.android.play.core.splitinstall.zzo i;
    public final File j;
    public final AtomicReference k;
    public final Set l;
    public final Set m;
    public final AtomicBoolean n;

    public vjq(Context context, @Nullable File file, dp01 dp01Var, r401 r401Var) {
        ThreadPoolExecutor e = m9u0.e();
        j401 j401Var = new j401(context);
        this.a = new Handler(Looper.getMainLooper());
        this.k = new AtomicReference();
        this.l = Collections.synchronizedSet(new HashSet());
        this.m = Collections.synchronizedSet(new HashSet());
        this.n = new AtomicBoolean(false);
        this.b = context;
        this.j = file;
        this.c = dp01Var;
        this.d = r401Var;
        this.h = e;
        this.e = j401Var;
        this.g = new mo8(8);
        this.f = new mo8(8);
        this.i = com.google.android.play.core.splitinstall.zzo.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0194, code lost:
    
        if (r2.contains(r14) == false) goto L60;
     */
    @Override // xsna.mlk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Task<Integer> a(final nlk0 nlk0Var) {
        olk0 olk0Var;
        Integer a;
        int i;
        File[] fileArr;
        int i2;
        HashMap hashMap;
        int i3;
        String concat;
        try {
            synchronized (this) {
                final olk0 olk0Var2 = (olk0) this.k.get();
                olk0Var = (olk0) zzbx.h(new Callable() { // from class: xsna.xl01
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int h;
                        int i4 = vjq.p;
                        olk0 olk0Var3 = olk0.this;
                        if (olk0Var3 == null || (h = olk0Var3.h()) == 0 || h == 5 || h == 6 || h == 7) {
                            return olk0.b(olk0Var3 != null ? 1 + olk0Var3.g() : 1, 1, 0, 0L, 0L, nlk0Var.a, new ArrayList());
                        }
                        throw new SplitInstallException(-1);
                    }
                });
                AtomicReference atomicReference = this.k;
                while (true) {
                    if (atomicReference.compareAndSet(olk0Var2, olk0Var)) {
                        break;
                    }
                    if (atomicReference.get() != olk0Var2 && atomicReference.get() != olk0Var2) {
                        olk0Var = null;
                        break;
                    }
                }
            }
            if (olk0Var == null) {
                return f(-100);
            }
            int g = olk0Var.g();
            final ArrayList arrayList = new ArrayList();
            Iterator it = nlk0Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add(((Locale) it.next()).getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] listFiles = this.j.listFiles(hk01.a);
            if (listFiles == null) {
                return f(-5);
            }
            int i4 = 0;
            int i5 = 0;
            long j = 0;
            while (i5 < listFiles.length) {
                File file = listFiles[i5];
                String A = emi.A(file);
                String str = A.split("\\.config\\.", 2)[i4];
                hashSet.add(A);
                if (nlk0Var.a.contains(str)) {
                    String str2 = A.split("\\.config\\.", 2)[i4];
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
                            concat = BundleUtil.UNDERLINE_TAG.concat(String.valueOf(locale.getCountry()));
                        }
                        arrayList3.add(String.valueOf(language).concat(concat));
                        i6 = i3 + 1;
                    }
                    HashSet hashSet2 = new HashSet(arrayList3);
                    HashMap a2 = g().a(Arrays.asList(str2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = a2.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        if (str3.contains(BundleUtil.UNDERLINE_TAG)) {
                            hashMap = a2;
                            str3 = str3.split(BundleUtil.UNDERLINE_TAG, -1)[i2];
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
                    if (hashSet3.contains(A)) {
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
                ArrayList arrayList4 = nlk0Var.b;
                ArrayList arrayList5 = new ArrayList(this.l);
                arrayList5.addAll(Arrays.asList("", "base"));
                HashMap a3 = g().a(arrayList5);
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Locale locale2 = (Locale) it4.next();
                    if (a3.containsKey(locale2.getLanguage()) && ((Set) a3.get(locale2.getLanguage())).contains(A)) {
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
            hashSet.toString();
            String.valueOf(nlk0Var.a);
            if (nlk0Var.a.size() != 1 || (a = (Integer) ((yq01) this.d.zza()).b().get(nlk0Var.a.get(i8))) == null) {
                a = ((yq01) this.d.zza()).a();
            }
            if (a != null) {
                return f(a.intValue());
            }
            if (!hashSet.containsAll(new HashSet(nlk0Var.a))) {
                return f(-2);
            }
            Long valueOf = Long.valueOf(j);
            ArrayList arrayList6 = nlk0Var.a;
            Integer valueOf2 = Integer.valueOf(i7);
            i(1, 0, 0L, valueOf, arrayList6, valueOf2, arrayList);
            this.h.execute(new Runnable() { // from class: xsna.yk01
                @Override // java.lang.Runnable
                public final void run() {
                    final vjq vjqVar;
                    final ArrayList arrayList7 = new ArrayList();
                    final ArrayList arrayList8 = new ArrayList();
                    Iterator it5 = arrayList2.iterator();
                    while (true) {
                        boolean hasNext = it5.hasNext();
                        vjqVar = vjq.this;
                        if (!hasNext) {
                            break;
                        }
                        File file2 = (File) it5.next();
                        String A2 = emi.A(file2);
                        Uri fromFile = Uri.fromFile(file2);
                        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                        intent.setDataAndType(fromFile, vjqVar.b.getContentResolver().getType(fromFile));
                        intent.addFlags(1);
                        intent.putExtra("module_name", A2.split("\\.config\\.", 2)[0]);
                        intent.putExtra("split_id", A2);
                        arrayList7.add(intent);
                        arrayList8.add(emi.A(file2).split("\\.config\\.", 2)[0]);
                    }
                    olk0 olk0Var3 = (olk0) vjqVar.k.get();
                    if (olk0Var3 == null) {
                        return;
                    }
                    final long i9 = olk0Var3.i();
                    ThreadPoolExecutor threadPoolExecutor = vjqVar.h;
                    final ArrayList arrayList9 = arrayList;
                    threadPoolExecutor.execute(new Runnable() { // from class: xsna.pf01
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i10 = 0;
                            long j2 = 0;
                            while (true) {
                                final vjq vjqVar2 = vjqVar;
                                final long j3 = i9;
                                if (i10 >= 3) {
                                    ThreadPoolExecutor threadPoolExecutor2 = vjqVar2.h;
                                    final ArrayList arrayList10 = arrayList7;
                                    final ArrayList arrayList11 = arrayList8;
                                    final ArrayList arrayList12 = arrayList9;
                                    threadPoolExecutor2.execute(new Runnable() { // from class: xsna.a701
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            vjq vjqVar3 = vjqVar2;
                                            com.google.android.play.core.splitinstall.zzo zzoVar = vjqVar3.i;
                                            if (vjqVar3.n.get()) {
                                                vjqVar3.i(6, -6, null, null, null, null, null);
                                                return;
                                            }
                                            xd01 h = zzoVar.h();
                                            ArrayList arrayList13 = arrayList11;
                                            ArrayList arrayList14 = arrayList12;
                                            long j4 = j3;
                                            if (h != null) {
                                                xd01 h2 = zzoVar.h();
                                                ArrayList arrayList15 = arrayList10;
                                                h2.a(arrayList15, new xn01(vjqVar3, arrayList13, arrayList14, j4, false, arrayList15));
                                            } else {
                                                vjqVar3.l.addAll(arrayList13);
                                                vjqVar3.m.addAll(arrayList14);
                                                Long valueOf3 = Long.valueOf(j4);
                                                vjqVar3.i(5, 0, valueOf3, valueOf3, null, null, null);
                                            }
                                        }
                                    });
                                    return;
                                }
                                j2 = Math.min(j3, (j3 / 3) + j2);
                                vjqVar2.i(2, 0, Long.valueOf(j2), Long.valueOf(j3), null, null, null);
                                SystemClock.sleep(vjq.o);
                                olk0 olk0Var4 = (olk0) vjqVar2.k.get();
                                if (olk0Var4.h() == 9 || olk0Var4.h() == 7 || olk0Var4.h() == 6) {
                                    return;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    });
                }
            });
            return Tasks.forResult(valueOf2);
        } catch (zzbx e) {
            return f(((SplitInstallException) e.g()).g());
        }
    }

    @Override // xsna.mlk0
    public final Task<Void> b(final int i) {
        olk0 olk0Var;
        try {
            synchronized (this) {
                final olk0 olk0Var2 = (olk0) this.k.get();
                olk0Var = (olk0) zzbx.h(new Callable() { // from class: xsna.nm01
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int h;
                        int i2 = vjq.p;
                        olk0 olk0Var3 = olk0.this;
                        if (olk0Var3 != null) {
                            int g = olk0Var3.g();
                            int i3 = i;
                            if (i3 == g && ((h = olk0Var3.h()) == 1 || h == 2 || h == 8 || h == 9 || h == 7)) {
                                return olk0.b(i3, 7, olk0Var3.c(), olk0Var3.a(), olk0Var3.i(), olk0Var3.e(), olk0Var3.d());
                            }
                        }
                        throw new SplitInstallException(-3);
                    }
                });
                AtomicReference atomicReference = this.k;
                while (true) {
                    if (!atomicReference.compareAndSet(olk0Var2, olk0Var)) {
                        if (atomicReference.get() != olk0Var2 && atomicReference.get() != olk0Var2) {
                            olk0Var = null;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (olk0Var != null) {
                this.a.post(new ma01(this, olk0Var));
            }
            return Tasks.forResult(null);
        } catch (zzbx e) {
            return Tasks.forException(e.g());
        }
    }

    @Override // xsna.mlk0
    public final boolean c(olk0 olk0Var, Activity activity, int i) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // xsna.mlk0
    public final void d(plk0 plk0Var) {
        mo8 mo8Var = this.g;
        synchronized (mo8Var) {
            ((HashSet) mo8Var.b).add(plk0Var);
        }
    }

    @Override // xsna.mlk0
    public final Set<String> e() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.c.b());
        hashSet.addAll(this.l);
        return hashSet;
    }

    public final Task f(final int i) {
        h(new oo01() { // from class: xsna.en01
            @Override // xsna.oo01
            public final olk0 a(olk0 olk0Var) {
                int i2 = vjq.p;
                if (olk0Var == null) {
                    return null;
                }
                return olk0.b(olk0Var.g(), 6, i, olk0Var.a(), olk0Var.i(), olk0Var.e(), olk0Var.d());
            }
        });
        return Tasks.forException(new SplitInstallException(i));
    }

    public final ti01 g() {
        Context context = this.b;
        try {
            ti01 a = this.c.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData);
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("App is not found in PackageManager", e);
        }
    }

    @Nullable
    public final synchronized olk0 h(oo01 oo01Var) {
        olk0 olk0Var = (olk0) this.k.get();
        olk0 a = oo01Var.a(olk0Var);
        AtomicReference atomicReference = this.k;
        while (!atomicReference.compareAndSet(olk0Var, a)) {
            if (atomicReference.get() != olk0Var && atomicReference.get() != olk0Var) {
                return null;
            }
        }
        return a;
    }

    public final boolean i(final int i, final int i2, @Nullable final Long l, @Nullable final Long l2, @Nullable final ArrayList arrayList, @Nullable final Integer num, @Nullable final ArrayList arrayList2) {
        olk0 h = h(new oo01() { // from class: xsna.ic01
            @Override // xsna.oo01
            public final olk0 a(olk0 olk0Var) {
                int i3 = vjq.p;
                if (olk0Var == null) {
                    olk0Var = olk0.b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList());
                }
                Integer num2 = num;
                int g = num2 == null ? olk0Var.g() : num2.intValue();
                Long l3 = l;
                long a = l3 == null ? olk0Var.a() : l3.longValue();
                Long l4 = l2;
                long i4 = l4 == null ? olk0Var.i() : l4.longValue();
                List list = arrayList;
                if (list == null) {
                    list = olk0Var.e();
                }
                List list2 = list;
                List list3 = arrayList2;
                if (list3 == null) {
                    list3 = olk0Var.d();
                }
                return olk0.b(g, i, i2, a, i4, list2, list3);
            }
        });
        if (h == null) {
            return false;
        }
        this.a.post(new ma01(this, h));
        return true;
    }
}
