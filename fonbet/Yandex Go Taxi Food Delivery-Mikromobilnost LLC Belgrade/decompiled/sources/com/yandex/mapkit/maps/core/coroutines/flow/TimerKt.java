package com.yandex.mapkit.maps.core.coroutines.flow;

import defpackage.e3n;
import defpackage.jse;
import defpackage.o430;
import defpackage.rol0;
import defpackage.sls;
import defpackage.tpr;
import defpackage.uyj;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Le3n;", "period", "initialDelay", "Ljse;", "dispatcher", "Ltpr;", "Lzy11;", "timerFlow-NqJ4yvY", "(JJLjse;)Ltpr;", "timerFlow", "Lkotlin/Function0;", "", "condition", "conditionTimerFlow-t_idYME", "(JLsls;JLjse;)Ltpr;", "conditionTimerFlow", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TimerKt {
    /* renamed from: conditionTimerFlow-t_idYME, reason: not valid java name */
    public static final tpr m211conditionTimerFlowt_idYME(long j, sls slsVar, long j2, jse jseVar) {
        return e.F(new rol0(new TimerKt$conditionTimerFlow$1(j2, slsVar, j, null)), jseVar);
    }

    /* renamed from: conditionTimerFlow-t_idYME$default, reason: not valid java name */
    public static tpr m212conditionTimerFlowt_idYME$default(long j, sls slsVar, long j2, jse jseVar, int i, Object obj) {
        if ((i & 4) != 0) {
            o430 o430Var = e3n.b;
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            jseVar = uyj.a;
        }
        return m211conditionTimerFlowt_idYME(j, slsVar, j3, jseVar);
    }

    /* renamed from: timerFlow-NqJ4yvY, reason: not valid java name */
    public static final tpr m213timerFlowNqJ4yvY(long j, long j2, jse jseVar) {
        return e.F(new rol0(new TimerKt$timerFlow$1(j2, j, null)), jseVar);
    }

    /* renamed from: timerFlow-NqJ4yvY$default, reason: not valid java name */
    public static tpr m214timerFlowNqJ4yvY$default(long j, long j2, jse jseVar, int i, Object obj) {
        if ((i & 2) != 0) {
            o430 o430Var = e3n.b;
            j2 = 0;
        }
        if ((i & 4) != 0) {
            jseVar = uyj.a;
        }
        return m213timerFlowNqJ4yvY(j, j2, jseVar);
    }
}
