package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingBookWorkDatesCollectionDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetTimesResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingTimesDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.bmv;
import xsna.vm7;
import xsna.ym7;

/* compiled from: BookingCalendarInteractor.kt */
/* loaded from: classes18.dex */
public final class sm7 extends vm7<ServiceBookingTimesDto> {
    public final a b;

    /* compiled from: BookingCalendarInteractor.kt */
    public static final class a {
        public final loi0 a;

        public a(loi0 loi0Var) {
            this.a = loi0Var;
        }
    }

    public sm7(a aVar) {
        super(vm7.a.C3896a.a);
        this.b = aVar;
    }

    public static ym7.d f(ServiceBookingTimesDto serviceBookingTimesDto) {
        return new ym7.d(serviceBookingTimesDto.f(), serviceBookingTimesDto.d(), serviceBookingTimesDto.e(), null, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0 A[LOOP:0: B:11:0x00da->B:13:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0107 A[LOOP:1: B:16:0x0101->B:18:0x0107, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012e A[LOOP:2: B:21:0x0128->B:23:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155 A[LOOP:3: B:26:0x014f->B:28:0x0155, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.bmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bmv.a aVar, ym7.b bVar, boolean z, ContinuationImpl continuationImpl) {
        tm7 tm7Var;
        int i;
        Iterator<T> it;
        Iterator<T> it2;
        Iterator<T> it3;
        Iterator<T> it4;
        if (continuationImpl instanceof tm7) {
            tm7Var = (tm7) continuationImpl;
            int i2 = tm7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tm7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = tm7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tm7Var.label;
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
                    Iterator<T> it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(new Integer(((BookingServiceModel) it5.next()).b));
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    String str = aVar2.f;
                    if (num == null || z) {
                        num = null;
                    }
                    tm7Var.L$0 = null;
                    tm7Var.L$1 = null;
                    tm7Var.L$2 = null;
                    tm7Var.L$3 = null;
                    tm7Var.L$4 = null;
                    tm7Var.L$5 = null;
                    tm7Var.Z$0 = z;
                    tm7Var.label = 1;
                    obj = evj.p(yfb.A(this.b.a.f(userId, num, str, arrayList)), tm7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ServiceBookingGetTimesResponseDto serviceBookingGetTimesResponseDto = (ServiceBookingGetTimesResponseDto) obj;
                List<ServiceBookingTimesDto> g = serviceBookingGetTimesResponseDto.g();
                ArrayList arrayList2 = new ArrayList(c5g.u(g, 10));
                it = g.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f((ServiceBookingTimesDto) it.next()));
                }
                List<ServiceBookingTimesDto> f = serviceBookingGetTimesResponseDto.f();
                ArrayList arrayList3 = new ArrayList(c5g.u(f, 10));
                it2 = f.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(f((ServiceBookingTimesDto) it2.next()));
                }
                List<ServiceBookingTimesDto> d = serviceBookingGetTimesResponseDto.d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d, 10));
                it3 = d.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(f((ServiceBookingTimesDto) it3.next()));
                }
                List<ServiceBookingTimesDto> e = serviceBookingGetTimesResponseDto.e();
                ArrayList arrayList5 = new ArrayList(c5g.u(e, 10));
                it4 = e.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(f((ServiceBookingTimesDto) it4.next()));
                }
                return new ym7.e(arrayList2, arrayList3, arrayList4, arrayList5);
            }
        }
        tm7Var = new tm7(this, continuationImpl);
        Object obj2 = tm7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tm7Var.label;
        if (i != 0) {
        }
        ServiceBookingGetTimesResponseDto serviceBookingGetTimesResponseDto2 = (ServiceBookingGetTimesResponseDto) obj2;
        List<ServiceBookingTimesDto> g2 = serviceBookingGetTimesResponseDto2.g();
        ArrayList arrayList22 = new ArrayList(c5g.u(g2, 10));
        it = g2.iterator();
        while (it.hasNext()) {
        }
        List<ServiceBookingTimesDto> f2 = serviceBookingGetTimesResponseDto2.f();
        ArrayList arrayList32 = new ArrayList(c5g.u(f2, 10));
        it2 = f2.iterator();
        while (it2.hasNext()) {
        }
        List<ServiceBookingTimesDto> d2 = serviceBookingGetTimesResponseDto2.d();
        ArrayList arrayList42 = new ArrayList(c5g.u(d2, 10));
        it3 = d2.iterator();
        while (it3.hasNext()) {
        }
        List<ServiceBookingTimesDto> e2 = serviceBookingGetTimesResponseDto2.e();
        ArrayList arrayList52 = new ArrayList(c5g.u(e2, 10));
        it4 = e2.iterator();
        while (it4.hasNext()) {
        }
        return new ym7.e(arrayList22, arrayList32, arrayList42, arrayList52);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r11 == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2 A[LOOP:0: B:11:0x00ac->B:13:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf A[LOOP:1: B:16:0x00cd->B:17:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.vm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(bmv.a aVar, boolean z, ContinuationImpl continuationImpl) {
        um7 um7Var;
        int i;
        Iterator<T> it;
        int i2;
        if (continuationImpl instanceof um7) {
            um7Var = (um7) continuationImpl;
            int i3 = um7Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                um7Var.label = i3 - Integer.MIN_VALUE;
                Object obj = um7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = um7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    BookingScreenParams bookingScreenParams = aVar.a;
                    UserId userId = bookingScreenParams.b;
                    BookingMaster bookingMaster = bookingScreenParams.f;
                    Integer num = bookingMaster != null ? new Integer(bookingMaster.b) : null;
                    List<BookingServiceModel> list = aVar.a.e;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new Integer(((BookingServiceModel) it2.next()).b));
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    um7Var.L$0 = null;
                    um7Var.Z$0 = z;
                    um7Var.label = 1;
                    obj = evj.p(yfb.A(this.b.a.c(userId, num, arrayList)), um7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                List<String> d = ((ServiceBookingBookWorkDatesCollectionDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                it = d.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vm7.e((String) it.next()));
                }
                Calendar a2 = this.a.a();
                ArrayList arrayList3 = new ArrayList(3);
                for (i2 = 0; i2 < 3; i2++) {
                    ym7.c d2 = vm7.d(a2, arrayList2);
                    a2.set(5, 1);
                    a2.set(2, a2.get(2) + 1);
                    arrayList3.add(d2);
                }
                return arrayList3;
            }
        }
        um7Var = new um7(this, continuationImpl);
        Object obj2 = um7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = um7Var.label;
        if (i != 0) {
        }
        List<String> d3 = ((ServiceBookingBookWorkDatesCollectionDto) obj2).d();
        ArrayList arrayList22 = new ArrayList(c5g.u(d3, 10));
        it = d3.iterator();
        while (it.hasNext()) {
        }
        Calendar a22 = this.a.a();
        ArrayList arrayList32 = new ArrayList(3);
        while (i2 < 3) {
        }
        return arrayList32;
    }
}
