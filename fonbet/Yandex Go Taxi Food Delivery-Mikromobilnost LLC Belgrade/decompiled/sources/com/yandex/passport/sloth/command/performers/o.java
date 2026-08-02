package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.s0;
import com.yandex.passport.sloth.z0;
import defpackage.iqn;
import defpackage.jl40;
import defpackage.ny61;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class o implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;
    public final z0 b;

    public o(com.yandex.passport.sloth.v vVar, z0 z0Var) {
        this.a = vVar;
        this.b = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s0 s0Var, ContinuationImpl continuationImpl) {
        SendMetricsCommandPerformer$performCommand$1 sendMetricsCommandPerformer$performCommand$1;
        int i;
        String str;
        if (continuationImpl instanceof SendMetricsCommandPerformer$performCommand$1) {
            sendMetricsCommandPerformer$performCommand$1 = (SendMetricsCommandPerformer$performCommand$1) continuationImpl;
            int i2 = sendMetricsCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sendMetricsCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sendMetricsCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sendMetricsCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = s0Var.a;
                    Map map = s0Var.b;
                    Map o = kotlin.collections.b.o(map, new Pair("conditions_met", "true"));
                    com.yandex.passport.internal.sloth.m mVar = (com.yandex.passport.internal.sloth.m) this.b.a;
                    if (mVar.a()) {
                        mVar.a.a(str2, o);
                    }
                    if (jl40.l(s0Var.a, "pwl-metrics") && (str = (String) map.get(Constants.KEY_PAGE)) != null) {
                        com.yandex.passport.sloth.r rVar = new com.yandex.passport.sloth.r(str);
                        sendMetricsCommandPerformer$performCommand$1.label = 1;
                        if (this.a.b(rVar, sendMetricsCommandPerformer$performCommand$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new iqn(com.yandex.passport.sloth.command.u.b);
            }
        }
        sendMetricsCommandPerformer$performCommand$1 = new SendMetricsCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = sendMetricsCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sendMetricsCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.b);
    }
}
