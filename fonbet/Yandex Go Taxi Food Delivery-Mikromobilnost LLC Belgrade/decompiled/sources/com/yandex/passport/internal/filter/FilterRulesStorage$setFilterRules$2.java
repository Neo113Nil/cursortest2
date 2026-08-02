package com.yandex.passport.internal.filter;

import com.yandex.passport.data.models.ParameterRule;
import defpackage.ez40;
import defpackage.gw00;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", "settings", "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.filter.FilterRulesStorage$setFilterRules$2", f = "FilterRulesStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class FilterRulesStorage$setFilterRules$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, ParameterRule> $parameters;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterRulesStorage$setFilterRules$2(Map map, l lVar, Continuation continuation) {
        super(2, continuation);
        this.$parameters = map;
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FilterRulesStorage$setFilterRules$2 filterRulesStorage$setFilterRules$2 = new FilterRulesStorage$setFilterRules$2(this.$parameters, this.this$0, continuation);
        filterRulesStorage$setFilterRules$2.L$0 = obj;
        return filterRulesStorage$setFilterRules$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FilterRulesStorage$setFilterRules$2 filterRulesStorage$setFilterRules$2 = (FilterRulesStorage$setFilterRules$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        filterRulesStorage$setFilterRules$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ez40 ez40Var = (ez40) this.L$0;
        l.d.getClass();
        kme0 kme0Var = l.f;
        rbx rbxVar = sbx.d;
        j jVar = j.a;
        Map<String, ParameterRule> map = this.$parameters;
        l lVar = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ParameterRule parameterRule = (ParameterRule) entry.getValue();
            lVar.getClass();
            linkedHashMap.put(key, parameterRule.getSign() == ParameterRule.Sign.INCLUDE ? new o(parameterRule.getParameters(), (Set) null, 2) : new o((Set) null, parameterRule.getParameters(), 1));
        }
        ez40Var.g(kme0Var, rbxVar.c(linkedHashMap, jVar));
        return zy11.a;
    }
}
