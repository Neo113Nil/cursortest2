package xsna;

import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetServicesResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingSearchServiceDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingSearchServicesResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingServicesInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.BookingServicesInteractor$getServiceResponse$2", f = "BookingServicesInteractor.kt", l = {41, 41, 42, 42}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class jx7 extends SuspendLambda implements wzs<yvj, spj<? super vw7>, Object> {
    final /* synthetic */ UserId $groupId;
    final /* synthetic */ s7i $supervisorJob;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ hx7 this$0;

    /* compiled from: BookingServicesInteractor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.BookingServicesInteractor$getServiceResponse$2$searchServiceDeffer$1", f = "BookingServicesInteractor.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super xy2<ServiceBookingSearchServicesResponseDto>>, Object> {
        final /* synthetic */ UserId $groupId;
        int label;
        final /* synthetic */ hx7 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hx7 hx7Var, UserId userId, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = hx7Var;
            this.$groupId = userId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$groupId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super xy2<ServiceBookingSearchServicesResponseDto>> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return loi0.k(this.this$0.a, this.$groupId, null, null, 14);
        }
    }

    /* compiled from: BookingServicesInteractor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.BookingServicesInteractor$getServiceResponse$2$serviceResponseDeffer$1", f = "BookingServicesInteractor.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super xy2<ServiceBookingGetServicesResponseDto>>, Object> {
        final /* synthetic */ UserId $groupId;
        int label;
        final /* synthetic */ hx7 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hx7 hx7Var, UserId userId, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = hx7Var;
            this.$groupId = userId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$groupId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super xy2<ServiceBookingGetServicesResponseDto>> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return loi0.e(this.this$0.a, this.$groupId, null, null, 14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx7(s7i s7iVar, hx7 hx7Var, UserId userId, spj<? super jx7> spjVar) {
        super(2, spjVar);
        this.$supervisorJob = s7iVar;
        this.this$0 = hx7Var;
        this.$groupId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jx7 jx7Var = new jx7(this.$supervisorJob, this.this$0, this.$groupId, spjVar);
        jx7Var.L$0 = obj;
        return jx7Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super vw7> spjVar) {
        return ((jx7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        if (r13 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zrl zrlVar;
        hx7 hx7Var;
        ServiceBookingGetServicesResponseDto serviceBookingGetServicesResponseDto;
        hx7 hx7Var2;
        hx7 hx7Var3;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            asl b2 = myc0.b(yvjVar, this.$supervisorJob, null, new b(this.this$0, this.$groupId, null), 2);
            asl b3 = myc0.b(yvjVar, this.$supervisorJob, null, new a(this.this$0, this.$groupId, null), 2);
            hx7 hx7Var4 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = b3;
            this.L$3 = hx7Var4;
            this.label = 1;
            obj = b2.J(this);
            if (obj != coroutineSingletons) {
                zrlVar = b3;
                hx7Var = hx7Var4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                hx7Var = (hx7) this.L$3;
                zrlVar = (zrl) this.L$2;
                kotlin.a.a(obj);
                ServiceBookingGetServicesResponseDto serviceBookingGetServicesResponseDto2 = (ServiceBookingGetServicesResponseDto) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = hx7Var;
                this.L$4 = serviceBookingGetServicesResponseDto2;
                this.label = 3;
                Object H = zrlVar.H(this);
                if (H != coroutineSingletons) {
                    hx7 hx7Var5 = hx7Var;
                    serviceBookingGetServicesResponseDto = serviceBookingGetServicesResponseDto2;
                    obj = H;
                    hx7Var2 = hx7Var5;
                    iz2 A = yfb.A((xy2) obj);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = hx7Var2;
                    this.L$4 = serviceBookingGetServicesResponseDto;
                    this.label = 4;
                    obj = evj.p(A, this);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                serviceBookingGetServicesResponseDto = (ServiceBookingGetServicesResponseDto) this.L$4;
                hx7Var3 = (hx7) this.L$3;
                kotlin.a.a(obj);
                List<ServiceBookingSearchServiceDto> d = ((ServiceBookingSearchServicesResponseDto) obj).d();
                hx7Var3.getClass();
                vw7 vw7Var = new vw7(hx7.e(serviceBookingGetServicesResponseDto.e(), d), hx7.d(serviceBookingGetServicesResponseDto.d()));
                r04 r04Var = this.this$0.b;
                return r04Var == null ? r04Var.b(vw7Var) : vw7Var;
            }
            serviceBookingGetServicesResponseDto = (ServiceBookingGetServicesResponseDto) this.L$4;
            hx7Var2 = (hx7) this.L$3;
            kotlin.a.a(obj);
            iz2 A2 = yfb.A((xy2) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = hx7Var2;
            this.L$4 = serviceBookingGetServicesResponseDto;
            this.label = 4;
            obj = evj.p(A2, this);
            if (obj != coroutineSingletons) {
                hx7Var3 = hx7Var2;
                List<ServiceBookingSearchServiceDto> d2 = ((ServiceBookingSearchServicesResponseDto) obj).d();
                hx7Var3.getClass();
                vw7 vw7Var2 = new vw7(hx7.e(serviceBookingGetServicesResponseDto.e(), d2), hx7.d(serviceBookingGetServicesResponseDto.d()));
                r04 r04Var2 = this.this$0.b;
                if (r04Var2 == null) {
                }
            }
            return coroutineSingletons;
        }
        hx7Var = (hx7) this.L$3;
        zrlVar = (zrl) this.L$2;
        kotlin.a.a(obj);
        iz2 A3 = yfb.A((xy2) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = zrlVar;
        this.L$3 = hx7Var;
        this.label = 2;
        obj = evj.p(A3, this);
    }
}
