package xsna;

import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
/* loaded from: classes8.dex */
public final class pwi implements zh90, p7f0 {
    public Object b;
    public Object c;

    public pwi(int i) {
        switch (i) {
            case 4:
                this.c = new ConcurrentHashMap();
                this.b = new AtomicInteger();
                break;
            default:
                this.c = ToolbarHandlerState.Uninitialized;
                break;
        }
    }

    @Override // xsna.zh90
    public Object a(dcy dcyVar, ArrayList arrayList) {
        Object failure;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class<?> a = ((pfc) dcyVar).a();
        Object obj = concurrentHashMap.get(a);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a, (obj = new wh90()))) != null) {
            obj = putIfAbsent;
        }
        wh90 wh90Var = (wh90) obj;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new xcy((vcy) it.next()));
        }
        ConcurrentHashMap<List<xcy>, Result<KSerializer<T>>> concurrentHashMap2 = wh90Var.a;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                failure = (KSerializer) ((wzs) this.b).invoke(dcyVar, arrayList);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Result result = new Result(failure);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, result);
            obj2 = putIfAbsent2 == null ? result : putIfAbsent2;
        }
        return ((Result) obj2).d();
    }

    public qk70 b(String str) {
        int incrementAndGet = ((AtomicInteger) this.b).incrementAndGet();
        ((ConcurrentHashMap) this.c).put(Integer.valueOf(incrementAndGet), str);
        return new qk70(incrementAndGet);
    }

    public void c() {
        gdo0 gdo0Var;
        if (((ToolbarHandlerState) this.c) == ToolbarHandlerState.Uninitialized) {
            xzw.c("ToolbarRequester is not initialized.");
        }
        ndo0 ndo0Var = (ndo0) this.b;
        if (ndo0Var == null || !ndo0Var.o) {
            return;
        }
        yok0 yok0Var = ndo0Var.v;
        if ((yok0Var == null || !yok0Var.isActive()) && (gdo0Var = (gdo0) ovi.a(ndo0Var, hdo0.b)) != null) {
            ndo0Var.v = myc0.h(ndo0Var.W1(), null, CoroutineStart.UNDISPATCHED, new mdo0(ndo0Var, gdo0Var, null), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        if (((px40) this.c) == null) {
            this.c = ((qx40) this.b.getValue()).a(null);
        }
        return (px40) this.c;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        this.c = ((qx40) this.b.getValue()).a((px40) obj2);
    }

    public pwi(wzs wzsVar) {
        this.b = wzsVar;
        this.c = new ConcurrentHashMap();
    }
}
