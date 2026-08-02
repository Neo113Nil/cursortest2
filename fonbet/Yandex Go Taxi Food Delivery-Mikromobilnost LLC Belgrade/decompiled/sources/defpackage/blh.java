package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.common_models.net.CacheStatus;

/* loaded from: classes9.dex */
public final class blh {
    public final wku0 a;

    public blh(wku0 wku0Var) {
        this.a = wku0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [cxq0] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.util.concurrent.locks.Lock] */
    public final void a(cxq0 cxq0Var) {
        vku0 h;
        if (!((ArrayList) cxq0Var.w).isEmpty()) {
            this.a.g((ExperimentSource) cxq0Var.b, (ArrayList) cxq0Var.w);
        }
        if (((ArrayList) cxq0Var.x).isEmpty()) {
            return;
        }
        wku0 wku0Var = this.a;
        ExperimentSource experimentSource = (ExperimentSource) cxq0Var.b;
        ArrayList arrayList = (ArrayList) cxq0Var.x;
        wku0Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        ReentrantReadWriteLock.ReadLock readLock = wku0Var.h.readLock();
        readLock.lock();
        try {
            h = wku0Var.h(experimentSource);
        } catch (Throwable th) {
            th = th;
            cxq0Var = readLock;
        }
        try {
            synchronized (h.e()) {
                try {
                    try {
                        List I = a.I(arrayList);
                        wku0Var.b.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        ReentrantReadWriteLock.WriteLock writeLock = h.a().writeLock();
                        writeLock.lock();
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = I.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                uku0 uku0Var = (uku0) h.b().get(str);
                                if (uku0Var != null) {
                                    boolean z = uku0Var.e;
                                    if (z) {
                                        long j = currentTimeMillis;
                                        ArrayList arrayList4 = arrayList3;
                                        Iterator it2 = it;
                                        ReentrantReadWriteLock.ReadLock readLock2 = readLock;
                                        try {
                                            uku0 uku0Var2 = new uku0(uku0Var.a, uku0Var.b, uku0Var.c, j, z, uku0Var.f, uku0Var.g);
                                            currentTimeMillis = j;
                                            h.b().put(str, uku0Var2);
                                            arrayList2.add(uku0Var2);
                                            readLock = readLock2;
                                            arrayList3 = arrayList4;
                                            it = it2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            writeLock.unlock();
                                            throw th;
                                        }
                                    } else {
                                        arrayList3.add(str);
                                    }
                                }
                            }
                            ReentrantReadWriteLock.ReadLock readLock3 = readLock;
                            List e = wku0Var.e(h.b(), arrayList3, currentTimeMillis);
                            hhs0 hhs0Var = new hhs0(8, arrayList2, wku0.j(h.b(), e, currentTimeMillis));
                            writeLock.unlock();
                            if (hhs0Var.o().isEmpty()) {
                                if (!hhs0Var.n().isEmpty()) {
                                }
                                readLock3.unlock();
                            }
                            wku0Var.e.c(new tku0(hhs0Var, wku0Var, h, experimentSource, currentTimeMillis, 1));
                            readLock3.unlock();
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            cxq0Var.unlock();
            throw th;
        }
    }

    public final hd7 b(ExperimentSource experimentSource, boolean z) {
        c cVar;
        wku0 wku0Var = this.a;
        wku0Var.getClass();
        List a = wku0Var.a(experimentSource, z);
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (true) {
            cVar = null;
            if (!it.hasNext()) {
                break;
            }
            cku0 cku0Var = (cku0) it.next();
            nd7 nd7Var = cku0Var.b.length() != 0 ? new nd7(cku0Var.a, cku0Var.b) : null;
            if (nd7Var != null) {
                arrayList.add(nd7Var);
            }
        }
        if (!arrayList.isEmpty()) {
            kdx kdxVar = new kdx();
            kdx kdxVar2 = new kdx();
            xbx xbxVar = new xbx();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nd7 nd7Var2 = (nd7) it2.next();
                kdx kdxVar3 = new kdx();
                kdxVar3.b("name", qcx.c(nd7Var2.a));
                kdxVar3.b("version", qcx.c(nd7Var2.b));
                xbxVar.a(kdxVar3.a());
            }
            kdxVar2.b("items", xbxVar.b());
            kdxVar.b("typed_experiments", kdxVar2.a());
            cVar = kdxVar.a();
        }
        return new hd7(experimentSource, arrayList, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tig0 c(ExperimentSource experimentSource, List list, ArrayList arrayList) {
        LinkedHashMap linkedHashMap;
        eku0 k;
        un11 un11Var;
        b bVar;
        cxq0 cxq0Var;
        Object obj = null;
        if (list.isEmpty()) {
            return new tig0(zn11.c, obj);
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        Exception exc = null;
        LinkedHashMap linkedHashMap2 = null;
        while (it.hasNext()) {
            un11 un11Var2 = (un11) it.next();
            if (un11Var2 != null) {
                b bVar2 = un11Var2.e;
                String str = un11Var2.b;
                String str2 = un11Var2.c;
                CacheStatus cacheStatus = un11Var2.d;
                int i = cacheStatus == null ? -1 : alh.a[cacheStatus.ordinal()];
                if (i == -1) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    un11 un11Var3 = (str == null || bVar2 == null) ? null : new un11(un11Var2.a, un11Var2.b, un11Var2.c, null, bVar2);
                    if (un11Var3 != null) {
                        arrayList2.add(un11Var3);
                    }
                } else if (i == 1) {
                    String str3 = str.length() > 0 ? str : null;
                    if (str3 != null && str2 != null) {
                        String str4 = str2.length() > 0 ? str2 : null;
                        if (str4 != null && (bVar = un11Var2.e) != null) {
                            cxq0Var = new cxq0(str3, str4, bVar, new un11(un11Var2.a, un11Var2.b, un11Var2.c, null, bVar), 14);
                            if (cxq0Var == null) {
                                arrayList2.add((un11) cxq0Var.x);
                                arrayList3.add(new fku0((String) cxq0Var.b, (String) cxq0Var.c, (b) cxq0Var.w, null));
                            }
                        }
                    }
                    cxq0Var = null;
                    if (cxq0Var == null) {
                    }
                } else if (i == 2) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        if (str2 != null) {
                            if (str2.length() <= 0) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                k = this.a.k(experimentSource, str, str2, false);
                                if (k != null) {
                                    un11Var = new un11(k.d, k.a, k.b, null, k.e);
                                    if (un11Var == null) {
                                        arrayList2.add(un11Var);
                                        arrayList4.add(un11Var.b);
                                    }
                                }
                            }
                        }
                        if (linkedHashMap2 != null) {
                            linkedHashMap = linkedHashMap2;
                        } else {
                            int d = gw00.d(tcc.n(arrayList, 10));
                            if (d < 16) {
                                d = 16;
                            }
                            linkedHashMap = new LinkedHashMap(d);
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                nd7 nd7Var = (nd7) it2.next();
                                linkedHashMap.put(nd7Var.a, nd7Var.b);
                            }
                            linkedHashMap2 = linkedHashMap;
                        }
                        String str5 = (String) linkedHashMap2.get(str);
                        if (str5 != null) {
                            if (str5.length() <= 0) {
                                str5 = null;
                            }
                            str2 = str5;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            linkedHashMap2 = linkedHashMap;
                        } else {
                            linkedHashMap2 = linkedHashMap;
                            k = this.a.k(experimentSource, str, str2, false);
                            if (k != null) {
                            }
                        }
                    }
                    un11Var = null;
                    if (un11Var == null) {
                    }
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    CacheStatus cacheStatus2 = CacheStatus.NO_CACHE;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    un11 un11Var4 = (str == null || bVar2 == null) ? null : new un11(un11Var2.a, un11Var2.b, un11Var2.c, cacheStatus2, bVar2);
                    if (un11Var4 != null) {
                        arrayList2.add(un11Var4);
                    }
                }
            }
        }
        cxq0 cxq0Var2 = new cxq0(experimentSource, arrayList2, arrayList3, arrayList4, 13);
        try {
            a(cxq0Var2);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            exc = e2;
        }
        tn11 tn11Var = zn11.Companion;
        ArrayList arrayList5 = (ArrayList) cxq0Var2.c;
        tn11Var.getClass();
        return new tig0(tn11.a(arrayList5), exc);
    }
}
