package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetRecordsResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingRecordDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingRecordInteractor.kt */
/* loaded from: classes18.dex */
public final class zu7 {
    public final loi0 a;

    public zu7(loi0 loi0Var) {
        this.a = loi0Var;
    }

    public static /* synthetic */ Object d(zu7 zu7Var, UserId userId, int i, SuspendLambda suspendLambda, int i2) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return zu7Var.c(userId, 10, i, suspendLambda);
    }

    public final Object a(UserId userId, int i, String str, SuspendLambda suspendLambda) {
        Object p = evj.p(yfb.A(this.a.n(i, userId, str)), suspendLambda);
        return p == CoroutineSingletons.COROUTINE_SUSPENDED ? p : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, int i, String str, String str2, ContinuationImpl continuationImpl) {
        xu7 xu7Var;
        int i2;
        if (continuationImpl instanceof xu7) {
            xu7Var = (xu7) continuationImpl;
            int i3 = xu7Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xu7Var.label = i3 - Integer.MIN_VALUE;
                Object obj = xu7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = xu7Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.h(i, userId, str2));
                    xu7Var.L$0 = null;
                    xu7Var.L$1 = str;
                    xu7Var.L$2 = null;
                    xu7Var.I$0 = i;
                    xu7Var.label = 1;
                    obj = evj.p(A, xu7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = xu7Var.I$0;
                    str = (String) xu7Var.L$1;
                    kotlin.a.a(obj);
                }
                ServiceBookingRecordDto serviceBookingRecordDto = (ServiceBookingRecordDto) obj;
                if (str == null) {
                    str = "";
                }
                return wu7.a(serviceBookingRecordDto, i, str, serviceBookingRecordDto.p());
            }
        }
        xu7Var = new xu7(this, continuationImpl);
        Object obj2 = xu7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = xu7Var.label;
        if (i2 != 0) {
        }
        ServiceBookingRecordDto serviceBookingRecordDto2 = (ServiceBookingRecordDto) obj2;
        if (str == null) {
        }
        return wu7.a(serviceBookingRecordDto2, i, str, serviceBookingRecordDto2.p());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085 A[LOOP:0: B:11:0x007f->B:13:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(UserId userId, int i, int i2, ContinuationImpl continuationImpl) {
        yu7 yu7Var;
        int i3;
        zu7 zu7Var;
        if (continuationImpl instanceof yu7) {
            yu7Var = (yu7) continuationImpl;
            int i4 = yu7Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                yu7Var.label = i4 - Integer.MIN_VALUE;
                Object obj = yu7Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = yu7Var.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    iz2 A = yfb.A(this.a.p(userId, new Integer(i), new Integer(i2)));
                    yu7Var.L$0 = null;
                    yu7Var.L$1 = this;
                    yu7Var.I$0 = i;
                    yu7Var.I$1 = i2;
                    yu7Var.label = 1;
                    obj = evj.p(A, yu7Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zu7Var = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zu7Var = (zu7) yu7Var.L$1;
                    kotlin.a.a(obj);
                }
                ServiceBookingGetRecordsResponseDto serviceBookingGetRecordsResponseDto = (ServiceBookingGetRecordsResponseDto) obj;
                zu7Var.getClass();
                int count = serviceBookingGetRecordsResponseDto.getCount();
                List<ServiceBookingRecordDto> d = serviceBookingGetRecordsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (ServiceBookingRecordDto serviceBookingRecordDto : d) {
                    arrayList.add(wu7.a(serviceBookingRecordDto, serviceBookingRecordDto.getId(), serviceBookingRecordDto.l(), serviceBookingRecordDto.p()));
                }
                return new cv7(count, arrayList);
            }
        }
        yu7Var = new yu7(this, continuationImpl);
        Object obj2 = yu7Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = yu7Var.label;
        if (i3 != 0) {
        }
        ServiceBookingGetRecordsResponseDto serviceBookingGetRecordsResponseDto2 = (ServiceBookingGetRecordsResponseDto) obj2;
        zu7Var.getClass();
        int count2 = serviceBookingGetRecordsResponseDto2.getCount();
        List<ServiceBookingRecordDto> d2 = serviceBookingGetRecordsResponseDto2.d();
        ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
        while (r7.hasNext()) {
        }
        return new cv7(count2, arrayList2);
    }
}
