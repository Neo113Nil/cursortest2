package xsna;

import com.vk.superapp.api.dto.vkworkout.WorkoutData;
import com.vk.superapp.api.dto.vkworkout.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: VkWorkoutStore.kt */
/* loaded from: classes11.dex */
public final class s2w0 {
    public static final /* synthetic */ qcy<Object>[] b;
    public final tw8 a = new tw8("VkWorkoutStore", "KEY_VK_WORKOUT_MONTHLY_WORKOUTS");

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(s2w0.class, "monthlyWorkoutsPref", "getMonthlyWorkoutsPref()Ljava/lang/String;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[LOOP:0: B:14:0x0069->B:16:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(List list, ContinuationImpl continuationImpl) {
        p2w0 p2w0Var;
        int i;
        int e;
        if (continuationImpl instanceof p2w0) {
            p2w0Var = (p2w0) continuationImpl;
            int i2 = p2w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p2w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = p2w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = p2w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    p2w0Var.L$0 = list;
                    p2w0Var.label = 1;
                    obj = myc0.k(dgn0.f().getIo(), new o2w0(this, null), p2w0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) p2w0Var.L$0;
                    kotlin.a.a(obj);
                }
                Iterable iterable = (Iterable) obj;
                e = on00.e(c5g.u(iterable, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj2 : iterable) {
                    linkedHashMap.put(((com.vk.superapp.api.dto.vkworkout.a) obj2).b(), obj2);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    WorkoutData workoutData = (WorkoutData) obj3;
                    com.vk.superapp.api.dto.vkworkout.a aVar = (com.vk.superapp.api.dto.vkworkout.a) linkedHashMap.get(workoutData.c());
                    if (aVar != null && aVar.a() >= workoutData.a().a() - 2 && epx.f(aVar.d(), workoutData.d())) {
                        long c = aVar.c();
                        Long b2 = workoutData.b();
                        if (b2 != null && c == b2.longValue()) {
                        }
                    }
                    arrayList.add(obj3);
                }
                return arrayList;
            }
        }
        p2w0Var = new p2w0(this, continuationImpl);
        Object obj4 = p2w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p2w0Var.label;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj4;
        e = on00.e(c5g.u(iterable2, 10));
        if (e < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
        while (r9.hasNext()) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r8.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
    
        if (r9 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0054, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[LOOP:0: B:21:0x0072->B:23:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[LOOP:1: B:26:0x009b->B:28:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[LOOP:2: B:31:0x00b3->B:33:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        r2w0 r2w0Var;
        int i;
        int e;
        Iterator it;
        Iterator it2;
        Object k;
        if (continuationImpl instanceof r2w0) {
            r2w0Var = (r2w0) continuationImpl;
            int i2 = r2w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r2w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = r2w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r2w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    r2w0Var.L$0 = list;
                    r2w0Var.label = 1;
                    obj = myc0.k(dgn0.f().getIo(), new o2w0(this, null), r2w0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    list = (List) r2w0Var.L$0;
                    kotlin.a.a(obj);
                }
                Iterable iterable = (Iterable) obj;
                e = on00.e(c5g.u(iterable, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj2 : iterable) {
                    linkedHashMap.put(((com.vk.superapp.api.dto.vkworkout.a) obj2).b(), obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(a.C1864a.a((WorkoutData) it.next()));
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.vk.superapp.api.dto.vkworkout.a aVar = (com.vk.superapp.api.dto.vkworkout.a) it2.next();
                    linkedHashMap2.put(aVar.b(), aVar);
                }
                List O0 = j5g.O0(linkedHashMap2.values());
                r2w0Var.L$0 = null;
                r2w0Var.label = 2;
                k = myc0.k(dgn0.f().getIo(), new q2w0(this, O0, null), r2w0Var);
                if (k != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    k = s3q0.a;
                }
            }
        }
        r2w0Var = new r2w0(this, continuationImpl);
        Object obj3 = r2w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r2w0Var.label;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj3;
        e = on00.e(c5g.u(iterable2, 10));
        if (e < 16) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e);
        while (r10.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(linkedHashMap3);
        List list22 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
        }
        List O02 = j5g.O0(linkedHashMap22.values());
        r2w0Var.L$0 = null;
        r2w0Var.label = 2;
        k = myc0.k(dgn0.f().getIo(), new q2w0(this, O02, null), r2w0Var);
        if (k != CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
    }
}
