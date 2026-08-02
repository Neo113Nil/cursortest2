package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivitySearchServicesResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingBookableServiceDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCategoryDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingSearchServiceDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingSearchServicesResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingGroupServiceInteractor.kt */
/* loaded from: classes18.dex */
public final class kq7 implements dmv {
    public final loi0 a;
    public final r04 b;

    /* compiled from: BookingGroupServiceInteractor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.BookingGroupServiceInteractor", f = "BookingGroupServiceInteractor.kt", l = {46}, m = "searchServices")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kq7.this.b(null, null, null, this);
        }
    }

    public kq7(loi0 loi0Var, r04 r04Var) {
        this.a = loi0Var;
        this.b = r04Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121 A[LOOP:1: B:32:0x011b->B:34:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // xsna.dmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vhn0 vhn0Var, UserId userId, BookingMaster bookingMaster, spj spjVar) {
        jq7 jq7Var;
        int i;
        kq7 kq7Var;
        if (spjVar instanceof jq7) {
            jq7Var = (jq7) spjVar;
            int i2 = jq7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jq7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = jq7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jq7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.d(userId, bookingMaster != null ? Collections.singletonList(new Integer(bookingMaster.b)) : null));
                    jq7Var.L$0 = null;
                    jq7Var.L$1 = null;
                    jq7Var.L$2 = null;
                    jq7Var.L$3 = null;
                    jq7Var.L$4 = this;
                    jq7Var.label = 1;
                    obj = evj.p(A, jq7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kq7Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kq7Var = (kq7) jq7Var.L$4;
                    kotlin.a.a(obj);
                }
                ServiceBookingActivitySearchServicesResponseDto serviceBookingActivitySearchServicesResponseDto = (ServiceBookingActivitySearchServicesResponseDto) obj;
                kq7Var.getClass();
                List<ServiceBookingBookableServiceDto> e = serviceBookingActivitySearchServicesResponseDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                int i3 = 0;
                for (Object obj2 : e) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    ServiceBookingBookableServiceDto serviceBookingBookableServiceDto = (ServiceBookingBookableServiceDto) obj2;
                    int id = serviceBookingBookableServiceDto.getId();
                    String title = serviceBookingBookableServiceDto.getTitle();
                    int e2 = serviceBookingBookableServiceDto.e();
                    int k = serviceBookingBookableServiceDto.k();
                    int j = serviceBookingBookableServiceDto.j();
                    String i5 = serviceBookingBookableServiceDto.i();
                    boolean z = serviceBookingBookableServiceDto.d() == 1;
                    Integer l = serviceBookingBookableServiceDto.l();
                    arrayList.add(new BookingServiceModel(id, title, Integer.valueOf(e2), k, j, serviceBookingBookableServiceDto.g(), serviceBookingBookableServiceDto.f(), i5, z, l != null ? l.intValue() : 0, Integer.valueOf(serviceBookingBookableServiceDto.n()), i3));
                    i3 = i4;
                }
                List<ServiceBookingCategoryDto> d = serviceBookingActivitySearchServicesResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (ServiceBookingCategoryDto serviceBookingCategoryDto : d) {
                    arrayList2.add(new ow7(serviceBookingCategoryDto.getId(), serviceBookingCategoryDto.getTitle(), serviceBookingCategoryDto.d()));
                }
                vw7 vw7Var = new vw7(arrayList, arrayList2);
                r04 r04Var = this.b;
                return r04Var == null ? r04Var.b(vw7Var) : vw7Var;
            }
        }
        jq7Var = new jq7(this, (ContinuationImpl) spjVar);
        Object obj3 = jq7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jq7Var.label;
        if (i != 0) {
        }
        ServiceBookingActivitySearchServicesResponseDto serviceBookingActivitySearchServicesResponseDto2 = (ServiceBookingActivitySearchServicesResponseDto) obj3;
        kq7Var.getClass();
        List<ServiceBookingBookableServiceDto> e3 = serviceBookingActivitySearchServicesResponseDto2.e();
        ArrayList arrayList3 = new ArrayList(c5g.u(e3, 10));
        int i32 = 0;
        while (r3.hasNext()) {
        }
        List<ServiceBookingCategoryDto> d2 = serviceBookingActivitySearchServicesResponseDto2.d();
        ArrayList arrayList22 = new ArrayList(c5g.u(d2, 10));
        while (r2.hasNext()) {
        }
        vw7 vw7Var2 = new vw7(arrayList3, arrayList22);
        r04 r04Var2 = this.b;
        if (r04Var2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // xsna.dmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, BookingMaster bookingMaster, List<BookingServiceModel> list, spj<? super List<BookingServiceModel>> spjVar) {
        a aVar;
        int i;
        List<BookingServiceModel> list2;
        Object obj;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    Integer num = bookingMaster != null ? new Integer(bookingMaster.b) : null;
                    List<BookingServiceModel> list3 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((BookingServiceModel) it.next()).b));
                    }
                    iz2 A = yfb.A(loi0.k(this.a, userId, num, arrayList, 4));
                    aVar.L$0 = null;
                    aVar.L$1 = null;
                    aVar.L$2 = list;
                    aVar.label = 1;
                    obj2 = evj.p(A, aVar);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = list;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) aVar.L$2;
                    kotlin.a.a(obj2);
                }
                List<ServiceBookingSearchServiceDto> d = ((ServiceBookingSearchServicesResponseDto) obj2).d();
                List<BookingServiceModel> list4 = list2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                for (BookingServiceModel bookingServiceModel : list4) {
                    Iterator<T> it2 = d.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((ServiceBookingSearchServiceDto) obj).getId() == bookingServiceModel.b) {
                            break;
                        }
                    }
                    ServiceBookingSearchServiceDto serviceBookingSearchServiceDto = (ServiceBookingSearchServiceDto) obj;
                    if (serviceBookingSearchServiceDto != null) {
                        bookingServiceModel = BookingServiceModel.a(bookingServiceModel, serviceBookingSearchServiceDto.e(), serviceBookingSearchServiceDto.d(), serviceBookingSearchServiceDto.getDuration(), 0, 3559);
                    }
                    arrayList2.add(bookingServiceModel);
                }
                return arrayList2;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj22 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        List<ServiceBookingSearchServiceDto> d2 = ((ServiceBookingSearchServicesResponseDto) obj22).d();
        List<BookingServiceModel> list42 = list2;
        ArrayList arrayList22 = new ArrayList(c5g.u(list42, 10));
        while (r1.hasNext()) {
        }
        return arrayList22;
    }

    @Override // xsna.dmv
    public final Object c(UserId userId, BookingMaster bookingMaster, List list, spj spjVar) {
        return EmptyList.b;
    }
}
