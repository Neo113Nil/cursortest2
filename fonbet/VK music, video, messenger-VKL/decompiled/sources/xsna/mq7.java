package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivityDailyCollectionDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivityDailyPeriodsDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivitySearchActivitiesResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivitySearchDatesResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingSearchActivityDto;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.bmv;
import xsna.vm7;
import xsna.ym7;

/* compiled from: BookingGroupsCalendarInteractor.kt */
/* loaded from: classes18.dex */
public final class mq7 extends vm7<ServiceBookingSearchActivityDto> {
    public final a b;

    /* compiled from: BookingGroupsCalendarInteractor.kt */
    public static final class a {
        public final loi0 a;

        public a(loi0 loi0Var) {
            this.a = loi0Var;
        }
    }

    public mq7(a aVar) {
        super(vm7.a.C3896a.a);
        this.b = aVar;
    }

    public static ym7.d f(ServiceBookingSearchActivityDto serviceBookingSearchActivityDto) {
        return new ym7.d(serviceBookingSearchActivityDto.e().f(), serviceBookingSearchActivityDto.e().d(), serviceBookingSearchActivityDto.e().e(), Integer.valueOf(serviceBookingSearchActivityDto.d().d()), Integer.valueOf(serviceBookingSearchActivityDto.d().e()), serviceBookingSearchActivityDto.d().getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // xsna.bmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bmv.a aVar, ym7.b bVar, boolean z, ContinuationImpl continuationImpl) {
        nq7 nq7Var;
        int i;
        ServiceBookingActivityDailyPeriodsDto d;
        ?? r2;
        ?? r3;
        ?? r4;
        ?? r5;
        List<ServiceBookingSearchActivityDto> e;
        List<ServiceBookingSearchActivityDto> d2;
        List<ServiceBookingSearchActivityDto> f;
        List<ServiceBookingSearchActivityDto> g;
        if (continuationImpl instanceof nq7) {
            nq7Var = (nq7) continuationImpl;
            int i2 = nq7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nq7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = nq7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nq7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!bVar.b) {
                        return ym7.e.e;
                    }
                    ym7.a aVar2 = bVar.a;
                    BookingScreenParams bookingScreenParams = aVar.a;
                    UserId userId = bookingScreenParams.b;
                    BookingMaster bookingMaster = bookingScreenParams.f;
                    Integer num = bookingMaster != null ? new Integer(bookingMaster.b) : null;
                    List<BookingServiceModel> list = aVar.a.e;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((BookingServiceModel) it.next()).b));
                    }
                    String str = aVar2.f;
                    if (num == null || z) {
                        num = null;
                    }
                    nq7Var.L$0 = null;
                    nq7Var.L$1 = null;
                    nq7Var.L$2 = null;
                    nq7Var.L$3 = null;
                    nq7Var.L$4 = null;
                    nq7Var.L$5 = null;
                    nq7Var.Z$0 = z;
                    nq7Var.label = 1;
                    obj = evj.p(yfb.A(this.b.a.g(userId, str, str, num != null ? Collections.singletonList(num) : null, arrayList)), nq7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ServiceBookingActivityDailyCollectionDto serviceBookingActivityDailyCollectionDto = (ServiceBookingActivityDailyCollectionDto) j5g.a0(((ServiceBookingActivitySearchActivitiesResponseDto) obj).d());
                d = serviceBookingActivityDailyCollectionDto != null ? serviceBookingActivityDailyCollectionDto.d() : null;
                if (d != null || (g = d.g()) == null) {
                    r2 = EmptyList.b;
                } else {
                    List<ServiceBookingSearchActivityDto> list2 = g;
                    r2 = new ArrayList(c5g.u(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        r2.add(f((ServiceBookingSearchActivityDto) it2.next()));
                    }
                }
                if (d != null || (f = d.f()) == null) {
                    r3 = EmptyList.b;
                } else {
                    List<ServiceBookingSearchActivityDto> list3 = f;
                    r3 = new ArrayList(c5g.u(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        r3.add(f((ServiceBookingSearchActivityDto) it3.next()));
                    }
                }
                if (d != null || (d2 = d.d()) == null) {
                    r4 = EmptyList.b;
                } else {
                    List<ServiceBookingSearchActivityDto> list4 = d2;
                    r4 = new ArrayList(c5g.u(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        r4.add(f((ServiceBookingSearchActivityDto) it4.next()));
                    }
                }
                if (d != null || (e = d.e()) == null) {
                    r5 = EmptyList.b;
                } else {
                    List<ServiceBookingSearchActivityDto> list5 = e;
                    r5 = new ArrayList(c5g.u(list5, 10));
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        r5.add(f((ServiceBookingSearchActivityDto) it5.next()));
                    }
                }
                return new ym7.e(r2, r3, r4, r5);
            }
        }
        nq7Var = new nq7(this, continuationImpl);
        Object obj2 = nq7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nq7Var.label;
        if (i != 0) {
        }
        ServiceBookingActivityDailyCollectionDto serviceBookingActivityDailyCollectionDto2 = (ServiceBookingActivityDailyCollectionDto) j5g.a0(((ServiceBookingActivitySearchActivitiesResponseDto) obj2).d());
        if (serviceBookingActivityDailyCollectionDto2 != null) {
        }
        if (d != null) {
        }
        r2 = EmptyList.b;
        if (d != null) {
        }
        r3 = EmptyList.b;
        if (d != null) {
        }
        r4 = EmptyList.b;
        if (d != null) {
        }
        r5 = EmptyList.b;
        return new ym7.e(r2, r3, r4, r5);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0132 A[LOOP:0: B:11:0x012c->B:13:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014d A[LOOP:1: B:16:0x014b->B:17:0x014d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[LOOP:2: B:31:0x00d3->B:33:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // xsna.vm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(bmv.a aVar, boolean z, ContinuationImpl continuationImpl) {
        oq7 oq7Var;
        int i;
        List list;
        Iterator<T> it;
        Iterator<T> it2;
        int i2;
        if (continuationImpl instanceof oq7) {
            oq7Var = (oq7) continuationImpl;
            int i3 = oq7Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oq7Var.label = i3 - Integer.MIN_VALUE;
                Object obj = oq7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = oq7Var.label;
                vm7.a aVar2 = this.a;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Calendar a2 = aVar2.a();
                    String str = a2.get(1) + '-' + drm0.R(String.valueOf(a2.get(2) + 1), 2, ImageSizeKey.SIZE_KEY_UNDEFINED) + '-' + drm0.R(String.valueOf(a2.get(5)), 2, ImageSizeKey.SIZE_KEY_UNDEFINED);
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
                    String format = LocalDate.parse(str, dateTimeFormatter).plusDays(180L).format(dateTimeFormatter);
                    BookingScreenParams bookingScreenParams = aVar.a;
                    UserId userId = bookingScreenParams.b;
                    BookingMaster bookingMaster = bookingScreenParams.f;
                    if (bookingMaster != null) {
                        Integer num = new Integer(bookingMaster.b);
                        if (z) {
                            num = null;
                        }
                        if (num != null) {
                            list = Collections.singletonList(new Integer(num.intValue()));
                            List<BookingServiceModel> list2 = aVar.a.e;
                            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new Integer(((BookingServiceModel) it.next()).b));
                            }
                            ArrayList arrayList2 = arrayList.isEmpty() ? arrayList : null;
                            oq7Var.L$0 = null;
                            oq7Var.L$1 = null;
                            oq7Var.L$2 = null;
                            oq7Var.Z$0 = z;
                            oq7Var.label = 1;
                            obj = evj.p(yfb.A(this.b.a.q(list, userId, str, format, arrayList2)), oq7Var);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    list = null;
                    List<BookingServiceModel> list22 = aVar.a.e;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list22, 10));
                    it = list22.iterator();
                    while (it.hasNext()) {
                    }
                    if (arrayList3.isEmpty()) {
                    }
                    oq7Var.L$0 = null;
                    oq7Var.L$1 = null;
                    oq7Var.L$2 = null;
                    oq7Var.Z$0 = z;
                    oq7Var.label = 1;
                    obj = evj.p(yfb.A(this.b.a.q(list, userId, str, format, arrayList2)), oq7Var);
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                List<String> d = ((ServiceBookingActivitySearchDatesResponseDto) obj).d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d, 10));
                it2 = d.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(vm7.e((String) it2.next()));
                }
                Calendar a3 = aVar2.a();
                ArrayList arrayList5 = new ArrayList(3);
                for (i2 = 0; i2 < 3; i2++) {
                    ym7.c d2 = vm7.d(a3, arrayList4);
                    a3.set(5, 1);
                    a3.set(2, a3.get(2) + 1);
                    arrayList5.add(d2);
                }
                return arrayList5;
            }
        }
        oq7Var = new oq7(this, continuationImpl);
        Object obj2 = oq7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oq7Var.label;
        vm7.a aVar22 = this.a;
        if (i != 0) {
        }
        List<String> d3 = ((ServiceBookingActivitySearchDatesResponseDto) obj2).d();
        ArrayList arrayList42 = new ArrayList(c5g.u(d3, 10));
        it2 = d3.iterator();
        while (it2.hasNext()) {
        }
        Calendar a32 = aVar22.a();
        ArrayList arrayList52 = new ArrayList(3);
        while (i2 < 3) {
        }
        return arrayList52;
    }
}
