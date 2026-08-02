package com.yandex.plus.core.analytics;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.shl0;
import defpackage.thl0;
import defpackage.tse;
import defpackage.uhl0;
import defpackage.wls;
import defpackage.zjd0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.analytics.BaseReporters$reportDiagnosticEvent$1", f = "BaseReporters.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class BaseReporters$reportDiagnosticEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, Object> $attributes;
    final /* synthetic */ String $eventName;
    final /* synthetic */ thl0 $localRtmErrorMapper;
    final /* synthetic */ uhl0 $localRtmErrorReporter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseReporters$reportDiagnosticEvent$1(thl0 thl0Var, String str, Map map, uhl0 uhl0Var, Continuation continuation) {
        super(2, continuation);
        this.$localRtmErrorMapper = thl0Var;
        this.$eventName = str;
        this.$attributes = map;
        this.$localRtmErrorReporter = uhl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseReporters$reportDiagnosticEvent$1(this.$localRtmErrorMapper, this.$eventName, this.$attributes, this.$localRtmErrorReporter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseReporters$reportDiagnosticEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            thl0 thl0Var = this.$localRtmErrorMapper;
            String str = this.$eventName;
            Map<String, Object> map = this.$attributes;
            this.label = 1;
            ((zjd0) thl0Var).getClass();
            Object obj2 = map != null ? map.get("sdk_version") : null;
            Object obj3 = map != null ? map.get(Constants.KEY_SERVICE) : null;
            Object obj4 = map != null ? map.get("page_url") : null;
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!zjd0.a.contains(key)) {
                        try {
                            jSONObject.put(key, value);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            jSONObject.put("version_supported", true);
            Object obj5 = obj3;
            shl0 shl0Var = new shl0(str, obj2 != null ? obj2.toString() : null, obj5 != null ? obj5.toString() : null, null, jSONObject.toString(), null, obj4 != null ? obj4.toString() : null, 472);
            if (shl0Var == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = shl0Var;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$localRtmErrorReporter.a((shl0) obj);
        return zy11.a;
    }
}
