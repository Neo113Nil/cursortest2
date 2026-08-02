package defpackage;

import androidx.compose.material.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class hyw0 implements vpr {
    public final /* synthetic */ e a;
    public final /* synthetic */ float b;

    public hyw0(e eVar, float f) {
        this.a = eVar;
        this.b = f;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        Object obj3;
        float f;
        Map map = (Map) obj;
        e eVar = this.a;
        float floatValue = ejb1.a(eVar.b.getValue(), map).floatValue();
        float floatValue2 = ((Number) eVar.d.getValue()).floatValue();
        Set keySet = map.keySet();
        wls wlsVar = (wls) eVar.l.getValue();
        float floatValue3 = eVar.m.getFloatValue();
        Set set = keySet;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : set) {
            if (((Number) obj4).floatValue() <= floatValue2 + 0.001d) {
                arrayList.add(obj4);
            }
        }
        if (arrayList.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList.get(0);
            float floatValue4 = ((Number) obj2).floatValue();
            int f2 = scc.f(arrayList);
            if (1 <= f2) {
                int i = 1;
                while (true) {
                    Object obj5 = arrayList.get(i);
                    float floatValue5 = ((Number) obj5).floatValue();
                    if (Float.compare(floatValue4, floatValue5) < 0) {
                        floatValue4 = floatValue5;
                        obj2 = obj5;
                    }
                    if (i == f2) {
                        break;
                    }
                    i++;
                }
            }
        }
        Float f3 = (Float) obj2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : set) {
            if (((Number) obj6).floatValue() >= floatValue2 - 0.001d) {
                arrayList2.add(obj6);
            }
        }
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            Object obj7 = arrayList2.get(0);
            float floatValue6 = ((Number) obj7).floatValue();
            int f4 = scc.f(arrayList2);
            if (1 <= f4) {
                int i2 = 1;
                while (true) {
                    Object obj8 = arrayList2.get(i2);
                    float floatValue7 = ((Number) obj8).floatValue();
                    if (Float.compare(floatValue6, floatValue7) > 0) {
                        obj7 = obj8;
                        floatValue6 = floatValue7;
                    }
                    if (i2 == f4) {
                        break;
                    }
                    i2++;
                }
            }
            obj3 = obj7;
        }
        Float f5 = (Float) obj3;
        List h = f3 == null ? scc.h(f5) : f5 == null ? Collections.singletonList(f3) : jl40.k(f3, f5) ? Collections.singletonList(f3) : scc.g(f3, f5);
        int size = h.size();
        if (size == 0) {
            f = floatValue;
        } else if (size != 1) {
            f = ((Number) h.get(0)).floatValue();
            float floatValue8 = ((Number) h.get(1)).floatValue();
            float f6 = this.b;
            if (floatValue > floatValue2 ? f6 > (-floatValue3) && floatValue2 > ((Number) wlsVar.invoke(Float.valueOf(floatValue8), Float.valueOf(f))).floatValue() : f6 >= floatValue3 || floatValue2 >= ((Number) wlsVar.invoke(Float.valueOf(f), Float.valueOf(floatValue8))).floatValue()) {
                f = floatValue8;
            }
        } else {
            f = ((Number) h.get(0)).floatValue();
        }
        Object obj9 = map.get(new Float(f));
        if (obj9 != null) {
            ck11 ck11Var = ru.yandex.taxi.logistics.sdk.ui.component.control.e.a;
            if (Boolean.TRUE.booleanValue()) {
                Object b = e.b(eVar, obj9, continuation);
                if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return b;
                }
                return zy11.a;
            }
        }
        Object a = eVar.a(floatValue, eVar.a, continuation);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return zy11.a;
    }
}
