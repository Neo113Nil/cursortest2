package com.yandex.messaging.internal.team.gaps;

import com.yandex.messaging.core.net.entities.UserGap;
import com.yandex.messaging.internal.gaps.UserGapWorkflow;
import defpackage.an21;
import defpackage.ift;
import defpackage.mq5;
import defpackage.ny61;
import defpackage.oe7;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w3c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final c a;
    public final w3c b;

    public a(c cVar, w3c w3cVar) {
        this.a = cVar;
        this.b = w3cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CalcCurrentUserWorkflowUseCase$execute$1 calcCurrentUserWorkflowUseCase$execute$1;
        int i;
        Object obj;
        List list;
        int i2;
        Date date;
        Date date2;
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        if (continuationImpl instanceof CalcCurrentUserWorkflowUseCase$execute$1) {
            calcCurrentUserWorkflowUseCase$execute$1 = (CalcCurrentUserWorkflowUseCase$execute$1) continuationImpl;
            int i3 = calcCurrentUserWorkflowUseCase$execute$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                calcCurrentUserWorkflowUseCase$execute$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = calcCurrentUserWorkflowUseCase$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = calcCurrentUserWorkflowUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    calcCurrentUserWorkflowUseCase$execute$1.L$0 = this;
                    calcCurrentUserWorkflowUseCase$execute$1.label = 1;
                    c cVar = this.a;
                    if (ift.a[cVar.c.ordinal()] == 1) {
                        List list2 = (List) cVar.d.j(str);
                        if (list2 == null) {
                            obj = tje.k0(cVar.b.e, new GetUserGapsUseCase$execute$2(cVar, str, null), calcCurrentUserWorkflowUseCase$execute$1);
                        } else {
                            obj2 = list2;
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        obj = EmptyList.a;
                    }
                    obj2 = obj;
                    if (obj2 == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) calcCurrentUserWorkflowUseCase$execute$1.L$0;
                    kotlin.b.b(obj2);
                }
                list = (List) obj2;
                this.getClass();
                if (!list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    UserGap userGap = (UserGap) next;
                    String dateFrom = userGap.getDateFrom();
                    if (dateFrom != null) {
                        UserGap.INSTANCE.getClass();
                        simpleDateFormat2 = UserGap.USER_GAP_DATE_FORMAT;
                        date = simpleDateFormat2.parse(dateFrom);
                    } else {
                        date = null;
                    }
                    String dateTo = userGap.getDateTo();
                    if (dateTo != null) {
                        UserGap.INSTANCE.getClass();
                        simpleDateFormat = UserGap.USER_GAP_DATE_FORMAT;
                        date2 = simpleDateFormat.parse(dateTo);
                    } else {
                        date2 = null;
                    }
                    this.b.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if ((date == null || date.getTime() <= currentTimeMillis) && (date2 == null || date2.getTime() >= currentTimeMillis)) {
                        i2 = 1;
                    }
                    an21 an21Var = UserGapWorkflow.Companion;
                    String workflow = userGap.getWorkflow();
                    an21Var.getClass();
                    UserGapWorkflow a = an21.a(workflow);
                    if (i2 != 0 && (a == UserGapWorkflow.Duty || !userGap.getWorkInAbsence())) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    UserGap userGap2 = (UserGap) it2.next();
                    an21 an21Var2 = UserGapWorkflow.Companion;
                    String workflow2 = userGap2.getWorkflow();
                    an21Var2.getClass();
                    arrayList2.add(an21.a(workflow2));
                }
                return (UserGapWorkflow) kotlin.collections.a.R(kotlin.collections.a.x0(arrayList2, new oe7(i2, new mq5(4))));
            }
        }
        calcCurrentUserWorkflowUseCase$execute$1 = new CalcCurrentUserWorkflowUseCase$execute$1(this, continuationImpl);
        Object obj22 = calcCurrentUserWorkflowUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = calcCurrentUserWorkflowUseCase$execute$1.label;
        if (i != 0) {
        }
        list = (List) obj22;
        this.getClass();
        if (!list.isEmpty()) {
        }
    }
}
