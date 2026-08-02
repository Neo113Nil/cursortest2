package defpackage;

import android.content.res.TypedArray;
import android.util.Log;
import androidx.compose.runtime.internal.a;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.StringHandler;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.yx360.design.compose.internal.c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class nnm {
    public static /* synthetic */ boolean A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kgo kgoVar, Object obj, udz udzVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(kgoVar, obj, udzVar)) {
            if (atomicReferenceFieldUpdater.get(kgoVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean B(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kgo kgoVar, Runnable runnable) {
        while (!atomicReferenceFieldUpdater.compareAndSet(kgoVar, null, runnable)) {
            if (atomicReferenceFieldUpdater.get(kgoVar) != null) {
                return false;
            }
        }
        return true;
    }

    public static eyr C(bts btsVar, int i, bts btsVar2, boolean z) {
        btsVar.e0(i);
        eyr f = c.f(btsVar2);
        btsVar.t(z);
        return f;
    }

    public static eyr D(bts btsVar, int i, bts btsVar2, boolean z) {
        btsVar.e0(i);
        eyr d = c.d(btsVar2);
        btsVar.t(z);
        return d;
    }

    public static int a(int i, int i2, sls slsVar) {
        return (slsVar.hashCode() + i) * i2;
    }

    public static int b(zzs zzsVar, int i, int i2) {
        return (zzsVar.hashCode() + i) * i2;
    }

    public static int c(Themes themes, int i, int i2) {
        return (themes.hashCode() + i) * i2;
    }

    public static eyr d(bts btsVar, int i, bts btsVar2, boolean z) {
        btsVar.e0(i);
        eyr c = c.c(btsVar2);
        btsVar.t(z);
        return c;
    }

    public static uq90 e(float f, float f2) {
        uq90 uq90Var = new uq90();
        uq90Var.j(f, f2);
        return uq90Var;
    }

    public static vvf0 f(hwy0 hwy0Var, bts btsVar, qwd qwdVar) {
        return qwdVar.a(Boolean.valueOf(hwy0Var.d(btsVar)));
    }

    public static String g(Class cls, String str) {
        return cls.getSimpleName().concat(str).toString();
    }

    public static String h(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    public static String i(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
        return sb.toString();
    }

    public static String j(String str, String str2, Map map) {
        return str + map + str2;
    }

    public static String k(AnimatedListItemInputComponent animatedListItemInputComponent) {
        return evu0.k0(animatedListItemInputComponent.value().toString()).toString();
    }

    public static StringBuilder l(String str, String str2, String str3, Map map, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(map);
        sb.append(str3);
        return sb;
    }

    public static HashMap m(xcv0 xcv0Var, String str, String str2) {
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static LinkedHashMap n(lho lhoVar, String str, String str2) {
        lhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    public static List o(Archive archive, List list, boolean z) {
        return archive.add(list, z, new StringHandler());
    }

    public static void p(int i, a aVar, bts btsVar, boolean z) {
        aVar.invoke(btsVar, Integer.valueOf(i));
        btsVar.t(z);
    }

    public static void q(int i, String str, String str2) {
        Log.e(str2, str + i);
    }

    public static void r(EvgenAnalytics$EvgenPurchaseType evgenAnalytics$EvgenPurchaseType, LinkedHashMap linkedHashMap, String str, EvgenAnalytics$EvgenButtonType evgenAnalytics$EvgenButtonType, String str2) {
        linkedHashMap.put(str, evgenAnalytics$EvgenPurchaseType.getEventValue());
        linkedHashMap.put(str2, evgenAnalytics$EvgenButtonType.getEventValue());
    }

    public static void s(c530 c530Var, float f, bts btsVar, boolean z) {
        oeb1.c(btsVar, ljs0.q(c530Var, f));
        btsVar.t(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(TypedArray typedArray) {
        boolean isTerminated;
        if (typedArray instanceof AutoCloseable) {
            typedArray.close();
            return;
        }
        if (!(typedArray instanceof ExecutorService)) {
            typedArray.recycle();
            return;
        }
        ExecutorService executorService = (ExecutorService) typedArray;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void u(String str, Integer num, HashMap hashMap, String str2) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str, num);
        hashMap.put(str2, hashMap2);
    }

    public static void v(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void w(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    public static void x(LinkedHashMap linkedHashMap, String str, List list, boolean z, String str2) {
        linkedHashMap.put(str, list);
        linkedHashMap.put(str2, String.valueOf(z));
    }

    public static /* synthetic */ void y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kgo kgoVar, Object obj, udz udzVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(kgoVar, obj, udzVar) && atomicReferenceFieldUpdater.get(kgoVar) == obj) {
        }
    }

    public static /* synthetic */ boolean z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kgo kgoVar, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(kgoVar, obj, null)) {
            if (atomicReferenceFieldUpdater.get(kgoVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
