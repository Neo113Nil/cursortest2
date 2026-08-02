package xsna;

import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingRecordDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.cmv;

/* compiled from: BaseBookingEditInteractor.kt */
/* loaded from: classes18.dex */
public abstract class g76 implements cmv {
    public final loi0 a;
    public final cs b;
    public final b25 c;

    public g76(loi0 loi0Var, cs csVar, b25 b25Var) {
        this.a = loi0Var;
        this.b = csVar;
        this.c = b25Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(g76 g76Var, ContinuationImpl continuationImpl) {
        e76 e76Var;
        int i;
        String C;
        if (continuationImpl instanceof e76) {
            e76Var = (e76) continuationImpl;
            int i2 = e76Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e76Var.label = i2 - Integer.MIN_VALUE;
                Object obj = e76Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = e76Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(g76Var.b.a(null));
                    e76Var.L$0 = null;
                    e76Var.label = 1;
                    obj = evj.p(A, e76Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                AccountInfoDto accountInfoDto = (AccountInfoDto) obj;
                C = accountInfoDto.C();
                if (C == null) {
                    C = "";
                }
                return new BookingEditModel.c(C, accountInfoDto.D() == AccountInfoDto.PhoneStatusDto.VALIDATED);
            }
        }
        e76Var = new e76(g76Var, continuationImpl);
        Object obj2 = e76Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = e76Var.label;
        if (i != 0) {
        }
        AccountInfoDto accountInfoDto2 = (AccountInfoDto) obj2;
        C = accountInfoDto2.C();
        if (C == null) {
        }
        return new BookingEditModel.c(C, accountInfoDto2.D() == AccountInfoDto.PhoneStatusDto.VALIDATED);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(g76 g76Var, cmv.b bVar, String str, ContinuationImpl continuationImpl) {
        f76 f76Var;
        int i;
        if (continuationImpl instanceof f76) {
            f76Var = (f76) continuationImpl;
            int i2 = f76Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f76Var.label = i2 - Integer.MIN_VALUE;
                Object obj = f76Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f76Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    loi0 loi0Var = g76Var.a;
                    BookingScreenParams bookingScreenParams = bVar.a;
                    UserId userId = bookingScreenParams.b;
                    int i3 = bookingScreenParams.l;
                    BookingScreenParams.DateTime dateTime = bookingScreenParams.h;
                    String str2 = dateTime != null ? dateTime.b : null;
                    if (str2 == null) {
                        throw new IllegalStateException("dateTime cannot be null when moving");
                    }
                    iz2 A = yfb.A(loi0Var.b(i3, userId, bookingScreenParams.m, str2, str));
                    f76Var.L$0 = null;
                    f76Var.L$1 = null;
                    f76Var.L$2 = null;
                    f76Var.label = 1;
                    obj = evj.p(A, f76Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ServiceBookingRecordDto serviceBookingRecordDto = (ServiceBookingRecordDto) obj;
                return wu7.a(serviceBookingRecordDto, serviceBookingRecordDto.getId(), serviceBookingRecordDto.l(), serviceBookingRecordDto.p());
            }
        }
        f76Var = new f76(g76Var, continuationImpl);
        Object obj2 = f76Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f76Var.label;
        if (i != 0) {
        }
        ServiceBookingRecordDto serviceBookingRecordDto2 = (ServiceBookingRecordDto) obj2;
        return wu7.a(serviceBookingRecordDto2, serviceBookingRecordDto2.getId(), serviceBookingRecordDto2.l(), serviceBookingRecordDto2.p());
    }

    public static BookingEditModel.a g(BookingScreenParams.DateTime dateTime) {
        if (dateTime == null) {
            throw new IllegalArgumentException("params.dateTime");
        }
        return new BookingEditModel.a((int) OffsetDateTime.parse(dateTime.b, DateTimeFormatter.ISO_OFFSET_DATE_TIME).withOffsetSameLocal(ZonedDateTime.now().getOffset()).toEpochSecond(), dateTime.d, dateTime.g, dateTime.e, dateTime.f);
    }

    public final BookingEditModel.b d(BookingEditModel.c cVar, String str, String str2, String str3, boolean z) {
        String str4;
        cn o = this.c.o();
        boolean f = myc0.f(cVar.a);
        boolean z2 = f && cVar.b;
        String str5 = "";
        if (myc0.f(str3)) {
            str4 = "";
            str5 = str3;
        } else if (z2) {
            str5 = o.b;
            str4 = "";
        } else {
            str4 = "";
        }
        return new BookingEditModel.b(str5, o.b, (!myc0.f(str2) && (!z2 || (str2 = o.f) == null)) ? str4 : str2, cVar.a, str, z2, f, !z);
    }

    public final BookingEditModel f(BookingEditModel bookingEditModel, BookingServiceModel bookingServiceModel) {
        List<BookingServiceModel> list = bookingEditModel.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BookingServiceModel) obj).b != bookingServiceModel.b) {
                arrayList.add(obj);
            }
        }
        BookingEditModel.a aVar = bookingEditModel.c;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((BookingServiceModel) it.next()).k;
        }
        return BookingEditModel.a(bookingEditModel, new BookingEditModel.a(aVar.a, i, aVar.e, aVar.c, aVar.d), arrayList, null, 0, 499);
    }
}
