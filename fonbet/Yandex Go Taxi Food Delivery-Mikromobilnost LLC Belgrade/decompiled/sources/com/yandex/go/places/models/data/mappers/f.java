package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.models.data.entities.network.TriggerActionDto;
import com.yandex.go.places.models.data.entities.network.TriggerDto;
import defpackage.fr;
import defpackage.il6;
import defpackage.me11;
import defpackage.ny61;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final a a;

    public f(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007e -> B:10:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, il6 il6Var, ContinuationImpl continuationImpl) {
        TriggerActionsMapper$mapModel$1 triggerActionsMapper$mapModel$1;
        int i;
        Iterator it;
        il6 il6Var2;
        EnumMap enumMap;
        if (continuationImpl instanceof TriggerActionsMapper$mapModel$1) {
            triggerActionsMapper$mapModel$1 = (TriggerActionsMapper$mapModel$1) continuationImpl;
            int i2 = triggerActionsMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerActionsMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = triggerActionsMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = triggerActionsMapper$mapModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    EnumMap enumMap2 = new EnumMap(TriggerDto.class);
                    it = list.iterator();
                    il6Var2 = il6Var;
                    enumMap = enumMap2;
                    while (it.hasNext()) {
                    }
                    return new me11((fr) enumMap.get(TriggerDto.SHOW), (fr) enumMap.get(TriggerDto.TAP));
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                TriggerActionDto triggerActionDto = (TriggerActionDto) triggerActionsMapper$mapModel$1.L$4;
                it = (Iterator) triggerActionsMapper$mapModel$1.L$3;
                enumMap = (EnumMap) triggerActionsMapper$mapModel$1.L$2;
                il6 il6Var3 = (il6) triggerActionsMapper$mapModel$1.L$1;
                kotlin.b.b(obj);
                fr frVar = (fr) obj;
                if (frVar != null) {
                    enumMap.put((EnumMap) triggerActionDto.a, (TriggerDto) frVar);
                }
                il6Var2 = il6Var3;
                while (it.hasNext()) {
                    TriggerActionDto triggerActionDto2 = (TriggerActionDto) it.next();
                    if (triggerActionDto2.a != TriggerDto.UNKNOWN) {
                        List list2 = triggerActionDto2.b;
                        triggerActionsMapper$mapModel$1.L$0 = null;
                        triggerActionsMapper$mapModel$1.L$1 = il6Var2;
                        triggerActionsMapper$mapModel$1.L$2 = enumMap;
                        triggerActionsMapper$mapModel$1.L$3 = it;
                        triggerActionsMapper$mapModel$1.L$4 = triggerActionDto2;
                        triggerActionsMapper$mapModel$1.label = 1;
                        Object b = this.a.b(list2, il6Var2, triggerActionsMapper$mapModel$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        il6Var3 = il6Var2;
                        triggerActionDto = triggerActionDto2;
                        obj = b;
                        fr frVar2 = (fr) obj;
                        if (frVar2 != null) {
                        }
                        il6Var2 = il6Var3;
                        while (it.hasNext()) {
                        }
                    }
                }
                return new me11((fr) enumMap.get(TriggerDto.SHOW), (fr) enumMap.get(TriggerDto.TAP));
            }
        }
        triggerActionsMapper$mapModel$1 = new TriggerActionsMapper$mapModel$1(this, continuationImpl);
        Object obj2 = triggerActionsMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = triggerActionsMapper$mapModel$1.label;
        if (i != 0) {
        }
    }
}
