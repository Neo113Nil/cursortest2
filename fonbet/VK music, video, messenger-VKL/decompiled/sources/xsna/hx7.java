package xsna;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingBookableServiceDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCategoryDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetServicesResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingSearchServiceDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingSearchServicesResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BookingServicesInteractor.kt */
/* loaded from: classes18.dex */
public final class hx7 implements dmv {
    public final loi0 a;
    public final r04 b;

    /* compiled from: BookingServicesInteractor.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: BookingServicesInteractor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.BookingServicesInteractor", f = "BookingServicesInteractor.kt", l = {MBSupportMuteAdType.REWARD_VIDEO}, m = "getAvailableServices")
    public static final class b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return hx7.this.c(null, null, null, this);
        }
    }

    /* compiled from: BookingServicesInteractor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.BookingServicesInteractor", f = "BookingServicesInteractor.kt", l = {70}, m = "searchServices")
    public static final class c extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return hx7.this.b(null, null, null, this);
        }
    }

    public hx7(loi0 loi0Var, r04 r04Var) {
        this.a = loi0Var;
        this.b = r04Var;
    }

    public static ArrayList d(List list) {
        List<ServiceBookingCategoryDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ServiceBookingCategoryDto serviceBookingCategoryDto : list2) {
            arrayList.add(new ow7(serviceBookingCategoryDto.getId(), serviceBookingCategoryDto.getTitle(), serviceBookingCategoryDto.d()));
        }
        return arrayList;
    }

    public static ArrayList e(List list, List list2) {
        BookingServiceModel bookingServiceModel;
        List list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            Object obj2 = null;
            if (i < 0) {
                e43.t();
                throw null;
            }
            ServiceBookingBookableServiceDto serviceBookingBookableServiceDto = (ServiceBookingBookableServiceDto) obj;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ServiceBookingSearchServiceDto) next).getId() == serviceBookingBookableServiceDto.getId()) {
                    obj2 = next;
                    break;
                }
            }
            ServiceBookingSearchServiceDto serviceBookingSearchServiceDto = (ServiceBookingSearchServiceDto) obj2;
            if (serviceBookingSearchServiceDto != null) {
                int id = serviceBookingBookableServiceDto.getId();
                String title = serviceBookingBookableServiceDto.getTitle();
                int e = serviceBookingBookableServiceDto.e();
                bookingServiceModel = new BookingServiceModel(id, title, Integer.valueOf(e), serviceBookingSearchServiceDto.e(), serviceBookingSearchServiceDto.d(), serviceBookingBookableServiceDto.g(), serviceBookingBookableServiceDto.f(), serviceBookingBookableServiceDto.i(), serviceBookingBookableServiceDto.d() == 1, serviceBookingSearchServiceDto.getDuration(), Integer.valueOf(serviceBookingBookableServiceDto.n()), i);
            } else {
                int id2 = serviceBookingBookableServiceDto.getId();
                String title2 = serviceBookingBookableServiceDto.getTitle();
                int e2 = serviceBookingBookableServiceDto.e();
                int k = serviceBookingBookableServiceDto.k();
                int j = serviceBookingBookableServiceDto.j();
                String i3 = serviceBookingBookableServiceDto.i();
                boolean z = serviceBookingBookableServiceDto.d() == 1;
                Integer l = serviceBookingBookableServiceDto.l();
                bookingServiceModel = new BookingServiceModel(id2, title2, Integer.valueOf(e2), k, j, serviceBookingBookableServiceDto.g(), serviceBookingBookableServiceDto.f(), i3, z, l != null ? l.intValue() : 0, Integer.valueOf(serviceBookingBookableServiceDto.n()), i);
            }
            arrayList.add(bookingServiceModel);
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // xsna.dmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vhn0 vhn0Var, UserId userId, BookingMaster bookingMaster, spj spjVar) {
        ix7 ix7Var;
        int i;
        hx7 hx7Var;
        if (spjVar instanceof ix7) {
            ix7Var = (ix7) spjVar;
            int i2 = ix7Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ix7Var.label = i2 - Integer.MIN_VALUE;
                Object obj = ix7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ix7Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (bookingMaster == null) {
                        jx7 jx7Var = new jx7(vhn0Var, this, userId, null);
                        ix7Var.L$0 = null;
                        ix7Var.L$1 = null;
                        ix7Var.L$2 = null;
                        ix7Var.label = 1;
                        Object d = zvj.d(jx7Var, ix7Var);
                        if (d != coroutineSingletons) {
                            return d;
                        }
                    } else {
                        iz2 A = yfb.A(loi0.e(this.a, userId, new Integer(bookingMaster.b), null, 12));
                        ix7Var.L$0 = null;
                        ix7Var.L$1 = null;
                        ix7Var.L$2 = null;
                        ix7Var.L$3 = this;
                        ix7Var.label = 2;
                        obj = evj.p(A, ix7Var);
                        if (obj != coroutineSingletons) {
                            hx7Var = this;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.a.a(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hx7Var = (hx7) ix7Var.L$3;
                kotlin.a.a(obj);
                ServiceBookingGetServicesResponseDto serviceBookingGetServicesResponseDto = (ServiceBookingGetServicesResponseDto) obj;
                hx7Var.getClass();
                vw7 vw7Var = new vw7(e(serviceBookingGetServicesResponseDto.e(), EmptyList.b), d(serviceBookingGetServicesResponseDto.d()));
                r04 r04Var = this.b;
                return r04Var == null ? r04Var.b(vw7Var) : vw7Var;
            }
        }
        ix7Var = new ix7(this, (ContinuationImpl) spjVar);
        Object obj2 = ix7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ix7Var.label;
        if (i != 0) {
        }
        ServiceBookingGetServicesResponseDto serviceBookingGetServicesResponseDto2 = (ServiceBookingGetServicesResponseDto) obj2;
        hx7Var.getClass();
        vw7 vw7Var2 = new vw7(e(serviceBookingGetServicesResponseDto2.e(), EmptyList.b), d(serviceBookingGetServicesResponseDto2.d()));
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
        c cVar;
        int i;
        List<BookingServiceModel> list2;
        Object obj;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
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
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = list;
                    cVar.label = 1;
                    obj2 = evj.p(A, cVar);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = list;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) cVar.L$2;
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
        cVar = new c((ContinuationImpl) spjVar);
        Object obj22 = cVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        if (i != 0) {
        }
        List<ServiceBookingSearchServiceDto> d2 = ((ServiceBookingSearchServicesResponseDto) obj22).d();
        List<BookingServiceModel> list42 = list2;
        ArrayList arrayList22 = new ArrayList(c5g.u(list42, 10));
        while (r1.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.dmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(UserId userId, BookingMaster bookingMaster, List list, spj spjVar) {
        b bVar;
        int i;
        hx7 hx7Var;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((BookingServiceModel) it.next()).b));
                    }
                    iz2 A = yfb.A(loi0.e(this.a, userId, bookingMaster != null ? new Integer(bookingMaster.b) : null, arrayList, 4));
                    bVar.L$0 = null;
                    bVar.L$1 = null;
                    bVar.L$2 = null;
                    bVar.L$3 = this;
                    bVar.label = 1;
                    obj = evj.p(A, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hx7Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hx7Var = (hx7) bVar.L$3;
                    kotlin.a.a(obj);
                }
                List<ServiceBookingBookableServiceDto> e = ((ServiceBookingGetServicesResponseDto) obj).e();
                EmptyList emptyList = EmptyList.b;
                hx7Var.getClass();
                return e(e, emptyList);
            }
        }
        bVar = new b((ContinuationImpl) spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        List<ServiceBookingBookableServiceDto> e2 = ((ServiceBookingGetServicesResponseDto) obj2).e();
        EmptyList emptyList2 = EmptyList.b;
        hx7Var.getClass();
        return e(e2, emptyList2);
    }
}
