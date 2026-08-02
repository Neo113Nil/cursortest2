package com.yandex.passport.internal.filter;

import com.yandex.passport.data.models.ParameterRule;
import defpackage.gw00;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.vpr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;

    public k(vpr vprVar, l lVar) {
        this.a = vprVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FilterRulesStorage$getFilterRules$$inlined$map$1$2$1 filterRulesStorage$getFilterRules$$inlined$map$1$2$1;
        int i;
        Map f;
        if (continuation instanceof FilterRulesStorage$getFilterRules$$inlined$map$1$2$1) {
            filterRulesStorage$getFilterRules$$inlined$map$1$2$1 = (FilterRulesStorage$getFilterRules$$inlined$map$1$2$1) continuation;
            int i2 = filterRulesStorage$getFilterRules$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                filterRulesStorage$getFilterRules$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = filterRulesStorage$getFilterRules$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = filterRulesStorage$getFilterRules$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) ((mme0) obj).c(l.f);
                    if (str != null) {
                        this.b.getClass();
                        Map map = (Map) sbx.d.b(j.a, str);
                        f = new LinkedHashMap(gw00.d(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            o oVar = (o) entry.getValue();
                            f.put(key, oVar.a != null ? new ParameterRule(ParameterRule.Sign.INCLUDE, oVar.a) : new ParameterRule(ParameterRule.Sign.EXCLUDE, oVar.b));
                        }
                    } else {
                        f = kotlin.collections.b.f();
                    }
                    filterRulesStorage$getFilterRules$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, filterRulesStorage$getFilterRules$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        filterRulesStorage$getFilterRules$$inlined$map$1$2$1 = new FilterRulesStorage$getFilterRules$$inlined$map$1$2$1(this, continuation);
        Object obj22 = filterRulesStorage$getFilterRules$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = filterRulesStorage$getFilterRules$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
