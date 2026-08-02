package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.vk.core.preference.single_pref.SinglePreferenceMigrationType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: BaseSinglePreferenceMigration.kt */
/* loaded from: classes.dex */
public abstract class rn6 implements nyc0 {
    public final Lock a;
    public final Lock b;
    public final Lock c;
    public final Context d;
    public final long e;
    public final List<String> f;
    public final bpn0 g;

    public rn6(Lock lock, Lock lock2, Lock lock3, Context context, long j) {
        this.a = lock;
        this.b = lock2;
        this.c = lock3;
        this.d = context;
        this.e = j;
        SinglePreferenceMigrationType singlePreferenceMigrationType = SinglePreferenceMigrationType.TO_SINGLE;
        this.f = e43.l("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>", "<map>", "</map>", "<map />");
        this.g = new bpn0(new qn6(0));
    }

    public static void d(LinkedHashMap linkedHashMap, String str, String str2) {
        Collection collection = (List) linkedHashMap.get(str);
        if (collection == null) {
            collection = EmptyList.b;
        }
        linkedHashMap.put(str, new ArrayList(j5g.u0(Collections.singletonList(str2), collection)));
    }

    public static void e(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            boolean delete = file.delete();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"SingleFilePrefMigration delete " + name + " [" + delete + ']'});
            }
        }
    }

    public static String f(String str) {
        int K = drm0.K(0, 6, str, "name=\"", false) + 6;
        try {
            return (String) j5g.Y(drm0.c0(str.substring(K, drm0.K(K, 4, str, "\"", false)), new String[]{"__"}, 0, 6));
        } catch (Exception e) {
            System.out.println((Object) cqi.b(e, new StringBuilder("ex = ")));
            return null;
        }
    }

    public static String l(String str) {
        int max = Math.max(drm0.P(str, '-', 0, 6), drm0.P(str, '_', 0, 6));
        Integer m = max != -1 ? arm0.m(10, str.substring(max + 1)) : null;
        StringBuilder sb = new StringBuilder("single_file_pref");
        if (m != null) {
            sb.append("-" + m.intValue());
        }
        sb.append(".xml");
        return sb.toString();
    }

    public static void o(String str, LinkedHashMap linkedHashMap) {
        String f = f(str);
        if (f != null) {
            d(linkedHashMap, f, "\t".concat(brm0.y(str, f.concat("__"), "")));
        }
    }

    public static void q(LinkedHashMap linkedHashMap, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Set y0 = rl3.y0(new String[]{"<string", "<boolean", "<int", "<long", "<float"});
        Iterator it = arrayList.iterator();
        String str = null;
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                String obj = drm0.p0((String) it.next()).toString();
                if (brm0.B(obj, "<set", false) && brm0.v(obj, "/>", false)) {
                    o(obj, linkedHashMap);
                } else if (brm0.B(obj, "<set", false)) {
                    o(obj, linkedHashMap);
                    str = f(obj);
                    sb.setLength(0);
                    z = true;
                } else if (z) {
                    Set set = y0;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (brm0.B(obj, (String) it2.next(), false)) {
                                sb.append("\t");
                                break;
                            }
                        }
                    }
                    jh.f(sb, "\t", obj, "\n");
                    if (brm0.v(obj, "</set>", false)) {
                        if (str != null) {
                            d(linkedHashMap, str, brm0.y(sb.toString(), str.concat("__"), ""));
                        }
                    }
                } else {
                    Set set2 = y0;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it3 = set2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            } else if (brm0.B(obj, (String) it3.next(), false)) {
                                o(obj, linkedHashMap);
                                break;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @Override // xsna.nyc0
    public final boolean a() {
        return true;
    }

    @Override // xsna.nyc0
    public final kvj0 b() {
        Lock lock;
        kvj0 kvj0Var;
        File file;
        File[] listFiles;
        Context context = this.d;
        Lock lock2 = this.a;
        lock2.lock();
        try {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                    listFiles = file.listFiles(new pn6());
                    try {
                    } catch (Exception e) {
                        e = e;
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "rollback migration failure. Error: " + e.getMessage()});
                        }
                        kvj0Var = new kvj0(false, g(), SystemClock.elapsedRealtime() - elapsedRealtime, (Integer) null, false, 24);
                        lock.unlock();
                        return kvj0Var;
                    }
                } catch (Exception e2) {
                    e = e2;
                    lock = lock2;
                }
                if (listFiles == null || listFiles.length == 0) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "rollback migration ended because files not exists"});
                    }
                    kvj0 kvj0Var2 = new kvj0(true, h(), SystemClock.elapsedRealtime() - elapsedRealtime, (Integer) null, false, 24);
                    lock2.unlock();
                    return kvj0Var2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Lock lock3 = this.c;
                lock3.lock();
                try {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        Lock lock4 = lock2;
                        long j = elapsedRealtime;
                        long j2 = this.e;
                        if (elapsedRealtime2 > j2) {
                            L l3 = L.a;
                            l3.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l3, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "rollback migration failure because Timeout! " + j2 + ", diff = " + elapsedRealtime2});
                            }
                            kvj0 kvj0Var3 = new kvj0(false, g(), elapsedRealtime2, (Integer) null, false, 16);
                            lock3.unlock();
                            lock4.unlock();
                            return kvj0Var3;
                        }
                        try {
                            q(linkedHashMap, nbr.q(file2));
                            i++;
                            lock2 = lock4;
                            elapsedRealtime = j;
                        } catch (Throwable th) {
                            th = th;
                            lock3.unlock();
                            throw th;
                        }
                    }
                    lock = lock2;
                    long j3 = elapsedRealtime;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        nbr.w(new File(file, str + ".xml"), "<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n<map>\n" + j5g.g0(list, "\n", null, null, 0, null, 62) + "\n</map>", emb.b);
                    }
                    int size = linkedHashMap.keySet().size();
                    nbr.l(new File(context.getApplicationInfo().dataDir + "/single_pref/"));
                    e(Arrays.asList(listFiles));
                    L l4 = L.a;
                    l4.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l4, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "rollback migration success. files = " + size});
                    }
                    kvj0Var = new kvj0(true, g(), SystemClock.elapsedRealtime() - j3, Integer.valueOf(size), false, 8);
                    lock3.unlock();
                    lock.unlock();
                    return kvj0Var;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                lock2.unlock();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            lock2.unlock();
            throw th;
        }
    }

    @Override // xsna.nyc0
    public final kvj0 c() {
        bpn0 bpn0Var;
        Lock lock;
        long j;
        kvj0 kvj0Var;
        Lock lock2;
        boolean z;
        bpn0 bpn0Var2 = this.g;
        Context context = this.d;
        Lock lock3 = this.a;
        lock3.lock();
        try {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                    File file2 = new File(context.getApplicationInfo().dataDir + "/single_pref/", n());
                    if (file2.exists()) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "migration ended because file exists"});
                        }
                        kvj0 kvj0Var2 = new kvj0(true, k(), SystemClock.elapsedRealtime() - elapsedRealtime, (Integer) null, false, 24);
                        lock3.unlock();
                        return kvj0Var2;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedList linkedList = new LinkedList();
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    String str = context.getPackageName() + "_preferences";
                    Iterator<File> it = nbr.u(file).iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        bpn0Var = bpn0Var2;
                        lock = lock3;
                        j = elapsedRealtime;
                        long j2 = this.e;
                        if (hasNext) {
                            try {
                                File next = it.next();
                                File file3 = file;
                                File file4 = file2;
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                                if (elapsedRealtime2 > j2) {
                                    L l2 = L.a;
                                    l2.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l2, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "migration failure. Timeout! " + j2 + ", diff = " + elapsedRealtime2 + ' '});
                                    }
                                    kvj0 kvj0Var3 = new kvj0(false, j(), elapsedRealtime2, (Integer) null, false, 16);
                                    lock.unlock();
                                    return kvj0Var3;
                                }
                                if (next.isFile()) {
                                    z = false;
                                    if (brm0.v(next.getName(), ".xml", false) && (!drm0.D(drm0.n0(next.getName(), "."), str, false) || m())) {
                                        String l3 = l(drm0.n0(next.getName(), ".xml"));
                                        Object obj = linkedHashMap.get(l3);
                                        if (obj == null) {
                                            obj = new StringBuilder();
                                            linkedHashMap.put(l3, obj);
                                        }
                                        StringBuilder sb = (StringBuilder) obj;
                                        String p = p(next, nbr.r(next, emb.b));
                                        ref$IntRef.element++;
                                        linkedList.push(next);
                                        sb.append(p);
                                        sb.append("\n");
                                    }
                                } else {
                                    z = false;
                                }
                                file = file3;
                                bpn0Var2 = bpn0Var;
                                lock3 = lock;
                                elapsedRealtime = j;
                                file2 = file4;
                            } catch (Exception e) {
                                e = e;
                                e((List) bpn0Var.getValue());
                                L l4 = L.a;
                                l4.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l4, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "migration failure. " + e.getMessage() + " \n deleted files " + ((List) bpn0Var.getValue())});
                                }
                                kvj0Var = new kvj0(false, j(), SystemClock.elapsedRealtime() - j, Integer.valueOf(((List) bpn0Var.getValue()).size()), false, 8);
                                lock.unlock();
                                return kvj0Var;
                            }
                        } else {
                            File file5 = file;
                            File file6 = file2;
                            if (ref$IntRef.element == 0) {
                                L l5 = L.a;
                                l5.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l5, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "migration failure. Modified files=" + ref$IntRef.element + " \n files= " + linkedList});
                                }
                                kvj0 kvj0Var4 = new kvj0(false, j(), SystemClock.elapsedRealtime() - j, Integer.valueOf(ref$IntRef.element), false, 8);
                                lock.unlock();
                                return kvj0Var4;
                            }
                            Lock lock4 = this.b;
                            lock4.lock();
                            try {
                                atomicBoolean.set(true);
                                Iterator it2 = linkedHashMap.entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    String str2 = (String) entry.getKey();
                                    List Q = drm0.Q((StringBuilder) entry.getValue());
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : Q) {
                                        Iterator it3 = it2;
                                        lock2 = lock4;
                                        try {
                                            if (!this.f.contains((String) obj2)) {
                                                arrayList.add(obj2);
                                            }
                                            it2 = it3;
                                            lock4 = lock2;
                                        } catch (Throwable th) {
                                            th = th;
                                            lock2.unlock();
                                            throw th;
                                        }
                                    }
                                    Iterator it4 = it2;
                                    Lock lock5 = lock4;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it5 = arrayList.iterator();
                                    while (it5.hasNext()) {
                                        Object next2 = it5.next();
                                        if (((String) next2).length() > 0) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                    String str3 = "<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n<map>\n" + j5g.g0(arrayList2, "\n", null, null, 0, null, 62) + "\n</map>\n";
                                    File file7 = file5;
                                    File file8 = new File(file7, str2);
                                    nbr.w(file8, str3, emb.b);
                                    ((List) bpn0Var.getValue()).add(file8);
                                    file5 = file7;
                                    it2 = it4;
                                    lock4 = lock5;
                                }
                                Lock lock6 = lock4;
                                long elapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                                if (elapsedRealtime3 > j2) {
                                    L l6 = L.a;
                                    l6.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l6, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "migration failure. Timeout! " + j2 + ", diff = " + elapsedRealtime3 + ' '});
                                    }
                                    kvj0 kvj0Var5 = new kvj0(false, j(), elapsedRealtime3, (Integer) null, false, 16);
                                    lock6.unlock();
                                    lock.unlock();
                                    return kvj0Var5;
                                }
                                e(linkedList);
                                file6.createNewFile();
                                long elapsedRealtime4 = SystemClock.elapsedRealtime() - j;
                                L l7 = L.a;
                                l7.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l7, L.LogType.d, new Object[]{"SingleFilePrefMigration:", "migration success for " + elapsedRealtime4 + " Modified files=" + ref$IntRef.element});
                                }
                                kvj0Var = new kvj0(true, i(), elapsedRealtime4, Integer.valueOf(ref$IntRef.element), false, 8);
                                lock6.unlock();
                            } catch (Throwable th2) {
                                th = th2;
                                lock2 = lock4;
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    bpn0Var = bpn0Var2;
                    lock = lock3;
                    j = elapsedRealtime;
                }
            } catch (Throwable th3) {
                th = th3;
                lock3.unlock();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            lock3.unlock();
            throw th;
        }
    }

    public abstract SinglePreferenceMigrationType g();

    public abstract SinglePreferenceMigrationType h();

    public abstract SinglePreferenceMigrationType i();

    public abstract SinglePreferenceMigrationType j();

    public abstract SinglePreferenceMigrationType k();

    public abstract boolean m();

    public abstract String n();

    public abstract String p(File file, String str);
}
