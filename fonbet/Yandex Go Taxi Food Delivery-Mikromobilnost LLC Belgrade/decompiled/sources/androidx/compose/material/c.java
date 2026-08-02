package androidx.compose.material;

import defpackage.ejb1;
import defpackage.jj2;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class c implements vpr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ e b;
    public final /* synthetic */ jj2 c;

    public c(Object obj, e eVar, jj2 jj2Var) {
        this.a = obj;
        this.b = eVar;
        this.c = jj2Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Map map, Continuation continuation) {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        int i;
        e eVar;
        Object Q;
        try {
            if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
                swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
                int i2 = swipeableState$animateTo$2$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    swipeableState$animateTo$2$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = swipeableState$animateTo$2$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = swipeableState$animateTo$2$emit$1.label;
                    eVar = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Float a = ejb1.a(this.a, map);
                        if (a == null) {
                            throw new IllegalArgumentException("The target value must have an associated anchor.");
                        }
                        float floatValue = a.floatValue();
                        jj2 jj2Var = this.c;
                        swipeableState$animateTo$2$emit$1.L$0 = map;
                        swipeableState$animateTo$2$emit$1.label = 1;
                        if (eVar.a(floatValue, jj2Var, swipeableState$animateTo$2$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = (Map) swipeableState$animateTo$2$emit$1.L$0;
                        kotlin.b.b(obj);
                    }
                    float floatValue2 = eVar.f.getFloatValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (Math.abs(((Number) entry.getKey()).floatValue() - floatValue2) < 0.5f) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Q = kotlin.collections.a.Q(linkedHashMap.values());
                    if (Q == null) {
                        Q = eVar.b.getValue();
                    }
                    eVar.d(Q);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            float floatValue22 = eVar.f.getFloatValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (r7.hasNext()) {
            }
            Q = kotlin.collections.a.Q(linkedHashMap2.values());
            if (Q == null) {
            }
            eVar.d(Q);
            return zy11.a;
        } catch (Throwable th) {
            float floatValue3 = eVar.f.getFloatValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (Math.abs(((Number) entry2.getKey()).floatValue() - floatValue3) < 0.5f) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            Object Q2 = kotlin.collections.a.Q(linkedHashMap3.values());
            if (Q2 == null) {
                Q2 = eVar.b.getValue();
            }
            eVar.d(Q2);
            throw th;
        }
        swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
        Object obj2 = swipeableState$animateTo$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = swipeableState$animateTo$2$emit$1.label;
        eVar = this.b;
    }
}
