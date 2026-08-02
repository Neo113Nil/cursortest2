package com.yandex.go.due_timetable.data.repository;

import com.yandex.go.due_timetable.data.api.ScheduledOrderCalculationsApi;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsRequest;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse;
import com.yandex.go.due_timetable.domain.model.CalculationsStatus;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b580;
import defpackage.cmt;
import defpackage.dbl0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.now;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qbl0;
import defpackage.r1e0;
import defpackage.te7;
import defpackage.ue7;
import defpackage.unm0;
import defpackage.ve7;
import defpackage.w511;
import defpackage.we7;
import defpackage.wf7;
import defpackage.wiq0;
import defpackage.wnm0;
import defpackage.wwm;
import defpackage.xe7;
import defpackage.xnm0;
import defpackage.xy40;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final wiq0 a;
    public final qbl0 b;
    public final ScheduledOrderCalculationsApi c;
    public final xnm0 d;
    public final wwm e;

    public a(wiq0 wiq0Var, qbl0 qbl0Var, ScheduledOrderCalculationsApi scheduledOrderCalculationsApi, xnm0 xnm0Var, wwm wwmVar) {
        this.a = wiq0Var;
        this.b = qbl0Var;
        this.c = scheduledOrderCalculationsApi;
        this.d = xnm0Var;
        this.e = wwmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Calendar calendar, xy40 xy40Var, boolean z, b580 b580Var, boolean z2, ContinuationImpl continuationImpl) {
        ScheduledOrderCalculationsRepository$getCalculations$1 scheduledOrderCalculationsRepository$getCalculations$1;
        int i;
        String str;
        Boolean bool;
        Boolean bool2;
        Calendar calendar2;
        int i2;
        CalculationsStatus calculationsStatus;
        xe7 xe7Var;
        xe7 ve7Var;
        Object obj;
        if (continuationImpl instanceof ScheduledOrderCalculationsRepository$getCalculations$1) {
            scheduledOrderCalculationsRepository$getCalculations$1 = (ScheduledOrderCalculationsRepository$getCalculations$1) continuationImpl;
            int i3 = scheduledOrderCalculationsRepository$getCalculations$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scheduledOrderCalculationsRepository$getCalculations$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = scheduledOrderCalculationsRepository$getCalculations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scheduledOrderCalculationsRepository$getCalculations$1.label;
                xe7 xe7Var2 = null;
                if (i != 0) {
                    b.b(obj2);
                    dbl0 b = this.b.b();
                    if (b == null) {
                        ny61.r("The latest route stats response is missing");
                        return null;
                    }
                    pex0 m = ((k) this.a).m();
                    if (m == null || (str = m.b) == null) {
                        ny61.r("The information about selected class is missing");
                        return null;
                    }
                    if (z2) {
                        bool2 = Boolean.TRUE;
                    } else {
                        now nowVar = b.a.o;
                        if (nowVar != null) {
                            bool2 = nowVar.a;
                        } else {
                            bool = null;
                            cmt<ScheduledOrderCalculationsResponse> a = this.c.a(new ScheduledOrderCalculationsRequest(xy40Var.i(), Boolean.valueOf(z), this.e.a(b580Var), str, bool));
                            scheduledOrderCalculationsRepository$getCalculations$1.L$0 = calendar;
                            scheduledOrderCalculationsRepository$getCalculations$1.L$1 = null;
                            scheduledOrderCalculationsRepository$getCalculations$1.L$2 = null;
                            scheduledOrderCalculationsRepository$getCalculations$1.L$3 = null;
                            scheduledOrderCalculationsRepository$getCalculations$1.L$4 = null;
                            scheduledOrderCalculationsRepository$getCalculations$1.L$5 = null;
                            scheduledOrderCalculationsRepository$getCalculations$1.Z$0 = z;
                            scheduledOrderCalculationsRepository$getCalculations$1.Z$1 = z2;
                            scheduledOrderCalculationsRepository$getCalculations$1.label = 1;
                            obj2 = ru.yandex.taxi.network.api.a.c(a, null, scheduledOrderCalculationsRepository$getCalculations$1);
                            if (obj2 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            calendar2 = calendar;
                        }
                    }
                    bool = bool2;
                    cmt<ScheduledOrderCalculationsResponse> a2 = this.c.a(new ScheduledOrderCalculationsRequest(xy40Var.i(), Boolean.valueOf(z), this.e.a(b580Var), str, bool));
                    scheduledOrderCalculationsRepository$getCalculations$1.L$0 = calendar;
                    scheduledOrderCalculationsRepository$getCalculations$1.L$1 = null;
                    scheduledOrderCalculationsRepository$getCalculations$1.L$2 = null;
                    scheduledOrderCalculationsRepository$getCalculations$1.L$3 = null;
                    scheduledOrderCalculationsRepository$getCalculations$1.L$4 = null;
                    scheduledOrderCalculationsRepository$getCalculations$1.L$5 = null;
                    scheduledOrderCalculationsRepository$getCalculations$1.Z$0 = z;
                    scheduledOrderCalculationsRepository$getCalculations$1.Z$1 = z2;
                    scheduledOrderCalculationsRepository$getCalculations$1.label = 1;
                    obj2 = ru.yandex.taxi.network.api.a.c(a2, null, scheduledOrderCalculationsRepository$getCalculations$1);
                    if (obj2 != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    calendar2 = (Calendar) scheduledOrderCalculationsRepository$getCalculations$1.L$0;
                    b.b(obj2);
                }
                r1e0 r1e0Var = (r1e0) obj2;
                ScheduledOrderCalculationsResponse scheduledOrderCalculationsResponse = (ScheduledOrderCalculationsResponse) r1e0Var.a;
                xnm0 xnm0Var = this.d;
                xnm0Var.getClass();
                ScheduledOrderCalculationsResponse.CalculationsStatusDto calculationsStatusDto = scheduledOrderCalculationsResponse.a;
                List<ScheduledOrderCalculationsResponse.CalculationDto> list = scheduledOrderCalculationsResponse.b;
                i2 = wnm0.a[calculationsStatusDto.ordinal()];
                if (i2 != 1) {
                    calculationsStatus = CalculationsStatus.FINISHED;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    calculationsStatus = CalculationsStatus.PENDING;
                }
                xy40 xy40Var2 = new xy40(list.size());
                ArrayList arrayList = new ArrayList();
                for (ScheduledOrderCalculationsResponse.CalculationDto calculationDto : list) {
                    TimeZone d = xnm0Var.a.d();
                    if (d == null) {
                        d = TimeZone.getDefault();
                    }
                    ScheduledOrderCalculationsResponse.SlotType slotType = calculationDto.c;
                    Calendar calendar3 = calculationDto.d;
                    xe7 xe7Var3 = we7.a;
                    if (slotType == null) {
                        xe7Var = xe7Var2;
                        boolean l = jl40.l(calculationDto.b, Boolean.TRUE);
                        Calendar b2 = wf7.b(calendar3, d);
                        if (!l) {
                            if (b2 != null) {
                                ve7Var = new ve7(b2);
                            } else {
                                jst.e.s(new IllegalArgumentException("The calculation is neither for on demand nor for preorder slot"));
                                ve7Var = xe7Var;
                            }
                        }
                        ve7Var = xe7Var3;
                    } else {
                        xe7Var = xe7Var2;
                        int i4 = wnm0.b[slotType.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                xe7Var3 = ue7.a;
                            } else {
                                if (i4 != 3) {
                                    w511.b();
                                    return xe7Var;
                                }
                                Calendar b3 = wf7.b(calendar3, d);
                                if (b3 != null) {
                                    ve7Var = new ve7(b3);
                                } else {
                                    jst.e.s(new IllegalArgumentException("The calculation is neither for on demand nor for preorder slot"));
                                    ve7Var = xe7Var;
                                }
                            }
                        }
                        ve7Var = xe7Var3;
                    }
                    if (ve7Var != null) {
                        String str2 = calculationDto.a;
                        Double d2 = calculationDto.e;
                        String str3 = calculationDto.f;
                        Boolean bool3 = calculationDto.g;
                        boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
                        Boolean bool4 = calculationDto.h;
                        obj = new te7(str2, ve7Var, d2, str3, booleanValue, bool4 != null ? bool4.booleanValue() : false, calculationDto.i, wf7.b(calculationDto.j, d));
                    } else {
                        obj = xe7Var;
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                    xe7Var2 = xe7Var;
                }
                xy40Var2.h(arrayList);
                return new r1e0(new unm0(calendar2, calculationsStatus, xy40Var2), r1e0Var.b);
            }
        }
        scheduledOrderCalculationsRepository$getCalculations$1 = new ScheduledOrderCalculationsRepository$getCalculations$1(this, continuationImpl);
        Object obj22 = scheduledOrderCalculationsRepository$getCalculations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scheduledOrderCalculationsRepository$getCalculations$1.label;
        xe7 xe7Var22 = null;
        if (i != 0) {
        }
        r1e0 r1e0Var2 = (r1e0) obj22;
        ScheduledOrderCalculationsResponse scheduledOrderCalculationsResponse2 = (ScheduledOrderCalculationsResponse) r1e0Var2.a;
        xnm0 xnm0Var2 = this.d;
        xnm0Var2.getClass();
        ScheduledOrderCalculationsResponse.CalculationsStatusDto calculationsStatusDto2 = scheduledOrderCalculationsResponse2.a;
        List<ScheduledOrderCalculationsResponse.CalculationDto> list2 = scheduledOrderCalculationsResponse2.b;
        i2 = wnm0.a[calculationsStatusDto2.ordinal()];
        if (i2 != 1) {
        }
        xy40 xy40Var22 = new xy40(list2.size());
        ArrayList arrayList2 = new ArrayList();
        while (r4.hasNext()) {
        }
        xy40Var22.h(arrayList2);
        return new r1e0(new unm0(calendar2, calculationsStatus, xy40Var22), r1e0Var2.b);
    }
}
