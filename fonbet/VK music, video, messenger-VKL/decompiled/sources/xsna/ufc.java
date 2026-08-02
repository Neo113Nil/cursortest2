package xsna;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
/* loaded from: classes8.dex */
public final class ufc implements zh90 {
    public final Object b;
    public final Object c;

    public /* synthetic */ ufc(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.zh90
    public Object a(dcy dcyVar, ArrayList arrayList) {
        Object obj;
        Object failure;
        obj = ((vfc) this.c).get(((pfc) dcyVar).a());
        vh50 vh50Var = (vh50) obj;
        Object obj2 = vh50Var.a.get();
        if (obj2 == null) {
            synchronized (vh50Var) {
                obj2 = vh50Var.a.get();
                if (obj2 == null) {
                    obj2 = new wh90();
                    vh50Var.a = new SoftReference<>(obj2);
                }
            }
        }
        wh90 wh90Var = (wh90) obj2;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new xcy((vcy) it.next()));
        }
        ConcurrentHashMap<List<xcy>, Result<KSerializer<T>>> concurrentHashMap = wh90Var.a;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                failure = (KSerializer) ((wzs) this.b).invoke(dcyVar, arrayList);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Result result = new Result(failure);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, result);
            obj3 = putIfAbsent == null ? result : putIfAbsent;
        }
        return ((Result) obj3).d();
    }

    public boolean b(List list, List list2) {
        return kq01.j(list, list2, new bo3(((e2e) this.c).b, 13));
    }

    public ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            nov novVar = (nov) obj;
            ((e2e) this.c).a.b.getClass();
            if (!(novVar instanceof blj) && !(novVar instanceof u570) && !(novVar instanceof omv)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public ufc(xvs0 xvs0Var) {
        this.b = xvs0Var;
        this.c = new LinkedHashMap();
    }

    public ufc(wzs wzsVar) {
        this.b = wzsVar;
        this.c = new vfc();
    }
}
