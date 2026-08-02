package xsna;

import android.os.SystemClock;
import com.vk.push.core.network.http.HttpClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.uje0;

/* compiled from: VkpnsPusherMessagesInteractor.kt */
/* loaded from: classes5.dex */
public final class q5w0 {
    public final n5w0 a;
    public final int b;

    public q5w0() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x007a -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LinkedHashMap linkedHashMap, h7g0 h7g0Var, ArrayList arrayList, ContinuationImpl continuationImpl) {
        o5w0 o5w0Var;
        q5w0 q5w0Var;
        int i;
        LinkedHashMap linkedHashMap2;
        List list;
        o5w0 o5w0Var2;
        q5w0 q5w0Var2;
        h7g0 h7g0Var2;
        Object b;
        if (continuationImpl instanceof o5w0) {
            o5w0Var = (o5w0) continuationImpl;
            int i2 = o5w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o5w0Var.label = i2 - Integer.MIN_VALUE;
                q5w0Var = this;
                Object obj = o5w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = o5w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    linkedHashMap2 = linkedHashMap;
                    list = arrayList;
                    o5w0Var2 = o5w0Var;
                    q5w0Var2 = q5w0Var;
                    h7g0Var2 = h7g0Var;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    n5w0 n5w0Var = q5w0Var2.a;
                    ArrayList b2 = h7g0Var2.b();
                    o5w0Var2.L$0 = q5w0Var2;
                    o5w0Var2.L$1 = linkedHashMap2;
                    o5w0Var2.L$2 = h7g0Var2;
                    o5w0Var2.L$3 = list;
                    o5w0Var2.J$0 = elapsedRealtime;
                    o5w0Var2.label = 1;
                    b = n5w0Var.b(b2, o5w0Var2);
                    if (b != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j = o5w0Var.J$0;
                    list = (List) o5w0Var.L$3;
                    h7g0 h7g0Var3 = (h7g0) o5w0Var.L$2;
                    ?? r9 = (Map) o5w0Var.L$1;
                    q5w0Var2 = (q5w0) o5w0Var.L$0;
                    kotlin.a.a(obj);
                    Object obj2 = ((Result) obj).d();
                    o5w0 o5w0Var3 = o5w0Var;
                    h7g0Var2 = h7g0Var3;
                    LinkedHashMap linkedHashMap3 = r9;
                    if (!(obj2 instanceof Result.Failure)) {
                        List list2 = (List) obj2;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(rje0.a((vje0) it.next(), SystemClock.elapsedRealtime() - j));
                        }
                        obj2 = arrayList2;
                    }
                    boolean z = obj2 instanceof Result.Failure;
                    if (!z && list.isEmpty()) {
                        return obj2;
                    }
                    if (!z) {
                        kotlin.a.a(obj2);
                        list.addAll((Collection) obj2);
                        kotlin.a.a(obj2);
                        q5w0Var2.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : (List) obj2) {
                            if (obj3 instanceof uje0.b) {
                                arrayList3.add(obj3);
                            }
                        }
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            uje0.b bVar = (uje0.b) it2.next();
                            String str = bVar.a;
                            int intValue = ((Number) pn00.h(str, linkedHashMap3)).intValue();
                            if (bVar.d) {
                                h7g0Var2.c.add(new rst(str, bVar.b, ((eje0) j5g.i0(bVar.c)).a, intValue));
                            }
                        }
                    }
                    if (!h7g0Var2.a()) {
                        o5w0Var2 = o5w0Var3;
                        linkedHashMap2 = linkedHashMap3;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        n5w0 n5w0Var2 = q5w0Var2.a;
                        ArrayList b22 = h7g0Var2.b();
                        o5w0Var2.L$0 = q5w0Var2;
                        o5w0Var2.L$1 = linkedHashMap2;
                        o5w0Var2.L$2 = h7g0Var2;
                        o5w0Var2.L$3 = list;
                        o5w0Var2.J$0 = elapsedRealtime2;
                        o5w0Var2.label = 1;
                        b = n5w0Var2.b(b22, o5w0Var2);
                        if (b != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        linkedHashMap3 = linkedHashMap2;
                        obj2 = b;
                        o5w0Var3 = o5w0Var2;
                        j = elapsedRealtime2;
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        boolean z2 = obj2 instanceof Result.Failure;
                        if (!z2) {
                        }
                        if (!z2) {
                        }
                        if (!h7g0Var2.a()) {
                            return j5g.O0(list);
                        }
                    }
                }
            }
        }
        q5w0Var = this;
        o5w0Var = new o5w0(q5w0Var, continuationImpl);
        Object obj4 = o5w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o5w0Var.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        p5w0 p5w0Var;
        int i;
        if (continuationImpl instanceof p5w0) {
            p5w0Var = (p5w0) continuationImpl;
            int i2 = p5w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p5w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = p5w0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = p5w0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                h7g0 h7g0Var = new h7g0(list, this.b);
                List<rst> list2 = list;
                int e = on00.e(c5g.u(list2, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (rst rstVar : list2) {
                    Pair pair = new Pair(rstVar.a, new Integer(rstVar.d));
                    linkedHashMap.put(pair.i(), pair.j());
                }
                p5w0Var.label = 1;
                Object a = a(linkedHashMap, h7g0Var, new ArrayList(), p5w0Var);
                return a == obj2 ? obj2 : a;
            }
        }
        p5w0Var = new p5w0(this, continuationImpl);
        Object obj3 = p5w0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p5w0Var.label;
        if (i == 0) {
        }
    }

    public q5w0(int i) {
        this.a = new n5w0((HttpClient) o460.e.getValue());
        this.b = 5;
    }
}
