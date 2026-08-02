package com.yandex.go.due_timetable.domain.interactor;

import com.yandex.go.due.data.api.dto.AllowedTimeInfo;
import com.yandex.go.due.data.api.dto.RideInfo;
import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest;
import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityResponse;
import com.yandex.go.due.data.api.dto.TimetableInfo;
import com.yandex.go.due_timetable.domain.analytics.error.DueTimetableErrorException;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.aus0;
import defpackage.b2n;
import defpackage.b580;
import defpackage.b8z0;
import defpackage.c8z0;
import defpackage.cjw0;
import defpackage.d0l0;
import defpackage.d6w;
import defpackage.d8z0;
import defpackage.dqe0;
import defpackage.dzm;
import defpackage.e1n;
import defpackage.e2n;
import defpackage.ezm;
import defpackage.f1n;
import defpackage.f7z0;
import defpackage.g1n;
import defpackage.g7z0;
import defpackage.i7z0;
import defpackage.j7z0;
import defpackage.jbn;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.mvg;
import defpackage.nf7;
import defpackage.np60;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qnm0;
import defpackage.rsg;
import defpackage.sa90;
import defpackage.scc;
import defpackage.tse;
import defpackage.urm;
import defpackage.vug;
import defpackage.w511;
import defpackage.wjm;
import defpackage.wls;
import defpackage.xy40;
import defpackage.y6i0;
import defpackage.z1n;
import defpackage.zy11;
import defpackage.zzk0;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqnm0;", "<anonymous>", "(Ltse;)Lqnm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.due_timetable.domain.interactor.ScheduledOrderAvailabilityInteractor$loadAvailability$2", f = "ScheduledOrderAvailabilityInteractor.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ScheduledOrderAvailabilityInteractor$loadAvailability$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isSlotsClarificationRequired;
    final /* synthetic */ g1n $navigationSource;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledOrderAvailabilityInteractor$loadAvailability$2(g1n g1nVar, boolean z, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$navigationSource = g1nVar;
        this.$isSlotsClarificationRequired = z;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScheduledOrderAvailabilityInteractor$loadAvailability$2(this.$navigationSource, this.$isSlotsClarificationRequired, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduledOrderAvailabilityInteractor$loadAvailability$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [e2n, wjm] */
    /* JADX WARN: Type inference failed for: r0v36 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScheduledOrderAvailabilityRequest.OpenOrigin openOrigin;
        Object b;
        b580 b580Var;
        String str;
        Object obj2;
        String str2;
        wjm wjmVar;
        Object obj3;
        Object obj4;
        boolean z;
        List list;
        nf7 nf7Var;
        wjm wjmVar2;
        boolean z2;
        Object d8z0Var;
        Object obj5;
        String str3;
        a aVar;
        j7z0 j7z0Var;
        String str4;
        Calendar calendar;
        Calendar calendar2;
        ?? r0;
        Boolean bool;
        Object obj6;
        aus0 aus0Var = aus0.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g1n g1nVar = this.$navigationSource;
            if (g1nVar instanceof f1n) {
                openOrigin = ScheduledOrderAvailabilityRequest.OpenOrigin.SUMMARY;
            } else {
                if (!(g1nVar instanceof e1n)) {
                    w511.b();
                    return null;
                }
                openOrigin = ScheduledOrderAvailabilityRequest.OpenOrigin.INTERCITY_DASHBOARD;
            }
            ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type type = this.$isSlotsClarificationRequired ? ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type.TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION : ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type.TIMETABLE;
            b580 b2 = ((jbn) this.this$0.f).b();
            ScheduledOrderAvailabilityRequest a = this.this$0.b.a(type, openOrigin, b2);
            com.yandex.go.due.data.repository.a aVar2 = this.this$0.b;
            this.L$0 = openOrigin;
            this.L$1 = null;
            this.L$2 = b2;
            this.L$3 = null;
            this.label = 1;
            b = aVar2.b(a, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            b580Var = b2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b580 b580Var2 = (b580) this.L$2;
            openOrigin = (ScheduledOrderAvailabilityRequest.OpenOrigin) this.L$0;
            kotlin.b.b(obj);
            b = obj;
            b580Var = b580Var2;
        }
        ScheduledOrderAvailabilityResponse scheduledOrderAvailabilityResponse = (ScheduledOrderAvailabilityResponse) b;
        a aVar3 = this.this$0;
        pex0 m = ((k) aVar3.c).m();
        if (m == null || (str = m.b) == null) {
            str = "";
        }
        Iterator it = scheduledOrderAvailabilityResponse.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((AllowedTimeInfo) obj2).d, str)) {
                break;
            }
        }
        AllowedTimeInfo allowedTimeInfo = (AllowedTimeInfo) obj2;
        if (allowedTimeInfo == null) {
            allowedTimeInfo = AllowedTimeInfo.i;
        }
        AllowedTimeInfo allowedTimeInfo2 = allowedTimeInfo;
        boolean l = jl40.l(allowedTimeInfo2, AllowedTimeInfo.i);
        String str5 = PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX;
        String str6 = "open_origin";
        if (l) {
            d0l0 d0l0Var = aVar3.g.a.G;
            aVar3.h.getClass();
            int i2 = ezm.a[openOrigin.ordinal()];
            if (i2 == 1) {
                obj6 = "intercity_main";
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                obj6 = "summary";
            }
            Pair pair = new Pair("open_origin", obj6);
            Pair pair2 = new Pair(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
            Pair pair3 = new Pair("route", kotlin.collections.a.X(d0l0Var.a(), null, null, null, new urm(7), 31));
            zzk0 zzk0Var = d0l0.Companion;
            Map i3 = kotlin.collections.b.i(pair, pair2, pair3, new Pair("raw_route", kotlin.collections.a.X(d0l0Var.d(false, false), null, null, null, new urm(6), 31)));
            com.yandex.go.analytics.b bVar = (com.yandex.go.analytics.b) aVar3.i.a;
            bVar.getClass();
            vug vugVar = new vug(bVar, "RequirementError.Timetable.NoAllowedTimeForTariff");
            for (Map.Entry entry : i3.entrySet()) {
                vugVar.d((String) entry.getKey(), (String) entry.getValue());
            }
            vugVar.m();
            jst.e.r("RequirementError.Timetable.NoAllowedTimeForTariff", new DueTimetableErrorException("RequirementError.Timetable.NoAllowedTimeForTariff"));
        }
        xy40 xy40Var = new xy40(scheduledOrderAvailabilityResponse.c.a.size());
        xy40Var.h(scheduledOrderAvailabilityResponse.c.a);
        TimetableInfo timetableInfo = scheduledOrderAvailabilityResponse.d;
        boolean z3 = timetableInfo == null || (bool = timetableInfo.f) == null || !bool.booleanValue();
        TimetableInfo timetableInfo2 = scheduledOrderAvailabilityResponse.d;
        List list2 = timetableInfo2 != null ? timetableInfo2.i : null;
        wjm wjmVar3 = aVar3.d;
        nf7 nf7Var2 = (nf7) wjmVar3.c;
        ScheduledOrderAvailabilityRequest.OpenOrigin openOrigin2 = openOrigin;
        j7z0 w = ((cjw0) wjmVar3.b).w(allowedTimeInfo2, true);
        List list3 = list2;
        xy40 xy40Var2 = new xy40((Object) null);
        cjw0 cjw0Var = w.e;
        if (cjw0Var == null || b580Var == null) {
            str2 = str;
            wjmVar = wjmVar3;
            obj3 = "raw_route";
            obj4 = "route";
            z = z3;
            list = list3;
            nf7Var = nf7Var2;
            wjmVar2 = null;
        } else {
            str2 = str;
            wjmVar = wjmVar3;
            obj3 = "raw_route";
            z = z3;
            list = list3;
            obj4 = "route";
            nf7Var = nf7Var2;
            wjmVar2 = new wjm(b580Var, (String) cjw0Var.a, (xy40) cjw0Var.b, (RideInfo) cjw0Var.c, 6);
        }
        Iterator it2 = w.a.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                scc.m();
                throw null;
            }
            f7z0 f7z0Var = (f7z0) next;
            Calendar calendar3 = f7z0Var.a;
            ArrayList arrayList = f7z0Var.c;
            boolean c = nf7Var.c(calendar3);
            Iterator it3 = it2;
            int i6 = i4;
            xy40 xy40Var3 = new xy40((Object) null);
            xy40 xy40Var4 = new xy40((Object) null);
            int size = arrayList.size();
            String str7 = str5;
            int i7 = 0;
            while (i7 < size) {
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = ((g7z0) arrayList.get(i7)).c;
                int i8 = i7;
                int size2 = arrayList3.size();
                int i9 = size;
                int i10 = 0;
                while (i10 < size2) {
                    xy40Var4.g(((i7z0) arrayList3.get(i10)).a);
                    i10++;
                    arrayList3 = arrayList3;
                }
                i7 = i8 + 1;
                arrayList = arrayList2;
                size = i9;
            }
            d6w n = y6i0.n(0, xy40Var4.b);
            int i11 = n.a;
            int i12 = n.b;
            if (i11 <= i12) {
                calendar = null;
                boolean z4 = false;
                while (true) {
                    xy40 xy40Var5 = xy40Var4;
                    Calendar calendar4 = (Calendar) xy40Var4.b(i11);
                    if (w.b(calendar4)) {
                        j7z0Var = w;
                        if (calendar != null) {
                            str4 = str6;
                            xy40Var3.g(new d8z0(calendar, calendar4, null));
                            calendar = null;
                        } else {
                            str4 = str6;
                        }
                        if (wjmVar2 == null || z4 || i6 != 0) {
                            aVar = aVar3;
                            calendar2 = calendar;
                            r0 = 0;
                        } else {
                            calendar2 = calendar;
                            aVar = aVar3;
                            r0 = 0;
                            xy40Var3.g(new b8z0(aus0Var, calendar4, wjmVar2, new e2n(null, new b2n((xy40) wjmVar2.w), null, new z1n(calendar4, (RideInfo) wjmVar2.x))));
                            z4 = true;
                        }
                        xy40Var3.g(new b8z0(aus0Var, calendar4, r0, r0));
                        calendar = calendar2;
                    } else {
                        aVar = aVar3;
                        j7z0Var = w;
                        str4 = str6;
                        if (calendar == null) {
                            calendar = calendar4;
                        }
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                    w = j7z0Var;
                    xy40Var4 = xy40Var5;
                    str6 = str4;
                    aVar3 = aVar;
                }
            } else {
                aVar = aVar3;
                j7z0Var = w;
                str4 = str6;
                calendar = null;
            }
            if (calendar != null) {
                sa90 c2 = wjm.c(calendar);
                xy40Var3.g(new d8z0((Calendar) c2.a, (Calendar) c2.b, null));
            }
            Calendar calendar5 = f7z0Var.a;
            xy40Var2.g(new rsg(calendar5, c, xy40Var3, wjm.p(list, calendar5)));
            it2 = it3;
            i4 = i5;
            w = j7z0Var;
            str5 = str7;
            str6 = str4;
            aVar3 = aVar;
        }
        a aVar4 = aVar3;
        String str8 = str5;
        String str9 = str6;
        List list4 = list;
        Object[] objArr = xy40Var2.a;
        int i13 = xy40Var2.b;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                z2 = false;
                break;
            }
            if (nf7Var.c(((rsg) objArr[i14]).a)) {
                z2 = true;
                break;
            }
            i14++;
        }
        xy40 xy40Var6 = new xy40(xy40Var2.b + 1);
        if (z2) {
            Object[] objArr2 = xy40Var2.a;
            int i15 = xy40Var2.b;
            for (int i16 = 0; i16 < i15; i16++) {
                rsg rsgVar = (rsg) objArr2[i16];
                Calendar calendar6 = rsgVar.a;
                xy40 xy40Var7 = rsgVar.c;
                if (nf7Var.c(calendar6)) {
                    xy40 xy40Var8 = new xy40(xy40Var7.b + 1);
                    if (z) {
                        xy40Var8.g(new c8z0(aus0Var));
                    }
                    xy40Var8.k(xy40Var7);
                    rsgVar = rsg.a(rsgVar, xy40Var8);
                }
                xy40Var6.g(rsgVar);
            }
        } else {
            wjm wjmVar4 = wjmVar;
            TimeZone d = ((dqe0) wjmVar4.w).d();
            if (d == null) {
                d = TimeZone.getDefault();
            }
            Calendar a2 = ((jtq0) wjmVar4.x).a(d);
            if (z) {
                d8z0Var = new c8z0(aus0Var);
            } else {
                sa90 c3 = wjm.c(a2);
                d8z0Var = new d8z0((Calendar) c3.a, (Calendar) c3.b, null);
            }
            Object[] objArr3 = np60.a;
            xy40 xy40Var9 = new xy40(1);
            xy40Var9.g(d8z0Var);
            xy40Var6.g(new rsg(a2, true, xy40Var9, wjm.p(list4, a2)));
            xy40Var6.k(xy40Var2);
        }
        TimetableInfo timetableInfo3 = scheduledOrderAvailabilityResponse.d;
        String str10 = scheduledOrderAvailabilityResponse.a;
        int i17 = allowedTimeInfo2.b;
        int i18 = allowedTimeInfo2.a;
        qnm0 qnm0Var = new qnm0(str10, xy40Var6, i17, i18 <= 0 ? 5 : i18, timetableInfo3, aVar4.e.b(), allowedTimeInfo2.f, xy40Var);
        if (allowedTimeInfo2 != AllowedTimeInfo.i && !qnm0Var.a()) {
            d0l0 d0l0Var2 = aVar4.g.a.G;
            aVar4.h.getClass();
            int i19 = ezm.a[openOrigin2.ordinal()];
            if (i19 == 1) {
                obj5 = "intercity_main";
            } else {
                if (i19 != 2) {
                    w511.b();
                    return null;
                }
                obj5 = "summary";
            }
            Pair pair4 = new Pair(str9, obj5);
            Pair pair5 = new Pair(str8, str2);
            Pair pair6 = new Pair(obj4, kotlin.collections.a.X(d0l0Var2.a(), null, null, null, new urm(7), 31));
            zzk0 zzk0Var2 = d0l0.Companion;
            Pair pair7 = new Pair(obj3, kotlin.collections.a.X(d0l0Var2.d(false, false), null, null, null, new urm(6), 31));
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3, Locale.US);
            int i20 = allowedTimeInfo2.a;
            int i21 = i20 > 0 ? i20 : 5;
            boolean z5 = allowedTimeInfo2.g != null;
            int i22 = allowedTimeInfo2.b;
            Calendar calendar7 = allowedTimeInfo2.f;
            if (calendar7 != null) {
                dateTimeInstance.setTimeZone(calendar7.getTimeZone());
                str3 = dateTimeInstance.format(calendar7.getTime());
            } else {
                str3 = null;
            }
            Map i23 = kotlin.collections.b.i(pair4, pair5, pair6, pair7, new Pair("allowed_time", kotlin.collections.b.i(new Pair("ranges", kotlin.collections.a.X(allowedTimeInfo2.c, null, null, null, new dzm(0, dateTimeInstance), 31)), new Pair("interval_minutes", String.valueOf(i21)), new Pair("precision_minutes", String.valueOf(i22)), new Pair("default_time", str3), new Pair("with_asap", String.valueOf(z5))).toString()));
            com.yandex.go.analytics.b bVar2 = (com.yandex.go.analytics.b) aVar4.i.a;
            bVar2.getClass();
            vug vugVar2 = new vug(bVar2, "RequirementError.Timetable.NoAvailableSlots");
            for (Map.Entry entry2 : i23.entrySet()) {
                vugVar2.d((String) entry2.getKey(), (String) entry2.getValue());
            }
            vugVar2.m();
            jst.e.r("RequirementError.Timetable.NoAvailableSlots", new DueTimetableErrorException("RequirementError.Timetable.NoAvailableSlots"));
        }
        return qnm0Var;
    }
}
