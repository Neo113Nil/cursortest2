package com.yandex.plus.pay.ui.core.debug.internal.ui.log;

import com.yandex.plus.log.api.LogPriority;
import defpackage.glz;
import defpackage.hdd0;
import defpackage.llz;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ llz b;

    public a(vpr vprVar, llz llzVar) {
        this.a = vprVar;
        this.b = llzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LogsViewModel$special$$inlined$map$1$2$1 logsViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LogsViewModel$special$$inlined$map$1$2$1) {
            logsViewModel$special$$inlined$map$1$2$1 = (LogsViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = logsViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logsViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = logsViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logsViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    LogPriority logPriority = (LogPriority) obj;
                    List list = this.b.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((hdd0) obj3).b.compareTo(logPriority) >= 0) {
                            arrayList.add(obj3);
                        }
                    }
                    glz glzVar = new glz(logPriority, arrayList);
                    logsViewModel$special$$inlined$map$1$2$1.L$0 = null;
                    logsViewModel$special$$inlined$map$1$2$1.L$1 = null;
                    logsViewModel$special$$inlined$map$1$2$1.L$2 = null;
                    logsViewModel$special$$inlined$map$1$2$1.L$3 = null;
                    logsViewModel$special$$inlined$map$1$2$1.I$0 = 0;
                    logsViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(glzVar, logsViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        logsViewModel$special$$inlined$map$1$2$1 = new LogsViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = logsViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logsViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
