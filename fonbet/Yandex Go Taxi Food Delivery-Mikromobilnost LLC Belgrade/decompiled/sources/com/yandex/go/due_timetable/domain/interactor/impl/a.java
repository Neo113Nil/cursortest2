package com.yandex.go.due_timetable.domain.interactor.impl;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse;
import defpackage.aom0;
import defpackage.aus0;
import defpackage.b8z0;
import defpackage.d8z0;
import defpackage.e8z0;
import defpackage.g2n;
import defpackage.h73;
import defpackage.mp60;
import defpackage.ny61;
import defpackage.qnm0;
import defpackage.rnm0;
import defpackage.rsg;
import defpackage.snm0;
import defpackage.umm0;
import defpackage.w511;
import defpackage.wjm;
import defpackage.xy40;
import defpackage.yw01;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.due_timetable.data.repository.impl.a a;
    public final snm0 b;

    public a(com.yandex.go.due_timetable.data.repository.impl.a aVar, snm0 snm0Var) {
        this.a = aVar;
        this.b = snm0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qnm0 qnm0Var, ContinuationImpl continuationImpl) {
        ScheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1 scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1;
        int i;
        int i2;
        int i3;
        snm0 snm0Var;
        Object obj;
        Object obj2;
        Object d8z0Var;
        qnm0 qnm0Var2 = qnm0Var;
        if (continuationImpl instanceof ScheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1) {
            scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1 = (ScheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1) continuationImpl;
            int i4 = scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.label = i4 - Integer.MIN_VALUE;
                Object obj3 = scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.label;
                int i5 = 3;
                int i6 = 2;
                Object obj4 = null;
                if (i != 0) {
                    b.b(obj3);
                    List s = kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(kotlin.sequences.b.l(new h73(1, ((xy40) qnm0Var2.b).i()), new umm0(i6)), aom0.a), new umm0(i5)));
                    scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.L$0 = qnm0Var2;
                    scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.L$1 = null;
                    scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.label = 1;
                    obj3 = this.a.a(s, scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qnm0Var2 = (qnm0) scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.L$0;
                    b.b(obj3);
                }
                ScheduledOrderSeatsAvailableResponse scheduledOrderSeatsAvailableResponse = (ScheduledOrderSeatsAvailableResponse) obj3;
                snm0 snm0Var2 = this.b;
                snm0Var2.getClass();
                xy40 xy40Var = new xy40(qnm0Var2.b.b);
                mp60 mp60Var = qnm0Var2.b;
                Object[] objArr = mp60Var.a;
                i2 = mp60Var.b;
                i3 = 0;
                while (i3 < i2) {
                    rsg rsgVar = (rsg) objArr[i3];
                    xy40 xy40Var2 = new xy40(rsgVar.c.b);
                    xy40 xy40Var3 = rsgVar.c;
                    Object[] objArr2 = xy40Var3.a;
                    int i7 = xy40Var3.b;
                    int i8 = 0;
                    while (i8 < i7) {
                        Object obj5 = obj4;
                        e8z0 e8z0Var = (e8z0) objArr2[i8];
                        if (e8z0Var instanceof b8z0) {
                            Iterator it = scheduledOrderSeatsAvailableResponse.a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = obj5;
                                    break;
                                }
                                obj2 = it.next();
                                Calendar calendar = ((ScheduledOrderSeatsAvailableResponse.TimeSlotDto) obj2).b;
                                if (calendar != null && calendar.getTimeInMillis() == ((b8z0) e8z0Var).b.getTimeInMillis()) {
                                    break;
                                }
                            }
                            ScheduledOrderSeatsAvailableResponse.TimeSlotDto timeSlotDto = (ScheduledOrderSeatsAvailableResponse.TimeSlotDto) obj2;
                            g2n g2nVar = snm0Var2.a;
                            if ((timeSlotDto != null ? timeSlotDto.b : obj5) == null) {
                                d8z0Var = obj5;
                                snm0Var = snm0Var2;
                                obj = d8z0Var;
                            } else {
                                ScheduledOrderSeatsAvailableResponse.TimeSlotDto.TimeSlotTypeDto timeSlotTypeDto = timeSlotDto.a;
                                Calendar calendar2 = timeSlotDto.b;
                                int i9 = rnm0.a[timeSlotTypeDto.ordinal()];
                                snm0Var = snm0Var2;
                                if (i9 == 1) {
                                    obj = obj5;
                                    g2nVar.getClass();
                                    d8z0Var = new d8z0(calendar2, calendar2, g2n.a(timeSlotDto));
                                } else if (i9 == 2) {
                                    g2nVar.getClass();
                                    wjm wjmVar = obj5;
                                    d8z0Var = new b8z0(aus0.a, calendar2, wjmVar, g2n.a(timeSlotDto));
                                    obj = wjmVar;
                                } else {
                                    if (i9 != 3) {
                                        w511.b();
                                        return obj5;
                                    }
                                    Object obj6 = obj5;
                                    d8z0Var = obj6;
                                    obj = obj6;
                                }
                            }
                            if (d8z0Var != null) {
                                xy40Var2.g(d8z0Var);
                            }
                        } else {
                            snm0Var = snm0Var2;
                            obj = obj5;
                        }
                        i8++;
                        obj4 = obj;
                        snm0Var2 = snm0Var;
                    }
                    snm0 snm0Var3 = snm0Var2;
                    Object obj7 = obj4;
                    Object a = xy40Var2.e() ? rsg.a(rsgVar, xy40Var2) : obj7;
                    if (a != null) {
                        xy40Var.g(a);
                    }
                    i3++;
                    obj4 = obj7;
                    snm0Var2 = snm0Var3;
                }
                return new qnm0(qnm0Var2.a, xy40Var, qnm0Var2.c, qnm0Var2.d, qnm0Var2.e, qnm0Var2.f, qnm0Var2.g, qnm0Var2.h);
            }
        }
        scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1 = new ScheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1(this, continuationImpl);
        Object obj32 = scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scheduledOrderSeatsAvailableInteractorImpl$getScheduledOrderSeatsAvailable$1.label;
        int i52 = 3;
        int i62 = 2;
        Object obj42 = null;
        if (i != 0) {
        }
        ScheduledOrderSeatsAvailableResponse scheduledOrderSeatsAvailableResponse2 = (ScheduledOrderSeatsAvailableResponse) obj32;
        snm0 snm0Var22 = this.b;
        snm0Var22.getClass();
        xy40 xy40Var4 = new xy40(qnm0Var2.b.b);
        mp60 mp60Var2 = qnm0Var2.b;
        Object[] objArr3 = mp60Var2.a;
        i2 = mp60Var2.b;
        i3 = 0;
        while (i3 < i2) {
        }
        return new qnm0(qnm0Var2.a, xy40Var4, qnm0Var2.c, qnm0Var2.d, qnm0Var2.e, qnm0Var2.f, qnm0Var2.g, qnm0Var2.h);
    }
}
