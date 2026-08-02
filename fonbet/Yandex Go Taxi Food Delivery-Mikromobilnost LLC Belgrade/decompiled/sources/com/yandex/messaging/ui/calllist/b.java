package com.yandex.messaging.ui.calllist;

import defpackage.au11;
import defpackage.bu11;
import defpackage.cu11;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.qh7;
import defpackage.vh7;
import defpackage.vi7;
import defpackage.vpr;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CallListViewModel$special$$inlined$map$2$2$1 callListViewModel$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof CallListViewModel$special$$inlined$map$2$2$1) {
            callListViewModel$special$$inlined$map$2$2$1 = (CallListViewModel$special$$inlined$map$2$2$1) continuation;
            int i2 = callListViewModel$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callListViewModel$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = callListViewModel$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callListViewModel$special$$inlined$map$2$2$1.label;
                List list = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list2 = (List) obj;
                    if (list2 != null) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        long timeInMillis = calendar.getTimeInMillis();
                        Calendar calendar2 = (Calendar) calendar.clone();
                        calendar2.add(6, -1);
                        long timeInMillis2 = calendar2.getTimeInMillis();
                        List x0 = kotlin.collections.a.x0(list2, new vi7());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : x0) {
                            long startedAt = ((vh7) obj3).c.getStartedAt();
                            Object bu11Var = startedAt >= timeInMillis ? new bu11(oyh0.dialog_time_today) : startedAt >= timeInMillis2 ? new bu11(oyh0.dialog_time_yesterday) : new au11(new SimpleDateFormat("d MMMM", Locale.getDefault()).format(new Date(startedAt)));
                            Object obj4 = linkedHashMap.get(bu11Var);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap.put(bu11Var, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            arrayList.add(new qh7((cu11) entry.getKey(), (List) entry.getValue()));
                        }
                        list = kotlin.collections.a.J0(arrayList);
                    }
                    callListViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(list, callListViewModel$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        callListViewModel$special$$inlined$map$2$2$1 = new CallListViewModel$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = callListViewModel$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callListViewModel$special$$inlined$map$2$2$1.label;
        List list3 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
