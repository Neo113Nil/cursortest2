package xsna;

import com.vk.api.generated.services.dto.ServicesCategoryDto;
import com.vk.api.generated.services.dto.ServicesServiceDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PickerBookingServicesInteractor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.services.domain.PickerBookingServicesInteractor$getServiceResponse$2", f = "PickerBookingServicesInteractor.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class rha0 extends SuspendLambda implements wzs<yvj, spj<? super vw7>, Object> {
    final /* synthetic */ UserId $groupId;
    Object L$0;
    int label;
    final /* synthetic */ sha0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rha0(sha0 sha0Var, UserId userId, spj<? super rha0> spjVar) {
        super(2, spjVar);
        this.this$0 = sha0Var;
        this.$groupId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rha0(this.this$0, this.$groupId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super vw7> spjVar) {
        return ((rha0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p;
        sha0 sha0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            sha0 sha0Var2 = this.this$0;
            iz2 A = yfb.A(sha0Var2.a.a(this.$groupId));
            this.L$0 = sha0Var2;
            this.label = 1;
            p = evj.p(A, this);
            if (p == coroutineSingletons) {
                return coroutineSingletons;
            }
            sha0Var = sha0Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sha0Var = (sha0) this.L$0;
            kotlin.a.a(obj);
            p = obj;
        }
        sha0Var.getClass();
        List<ServicesCategoryDto> list = (List) p;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        int i2 = 0;
        for (ServicesCategoryDto servicesCategoryDto : list) {
            ow7 ow7Var = new ow7(servicesCategoryDto.getId(), servicesCategoryDto.e(), 0);
            List<ServicesServiceDto> d = servicesCategoryDto.d();
            ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
            int i3 = i2;
            for (ServicesServiceDto servicesServiceDto : d) {
                int i4 = i3 + 1;
                Integer e = servicesServiceDto.e();
                arrayList2.add(new BookingServiceModel(e != null ? e.intValue() : servicesServiceDto.getId(), servicesServiceDto.g(), Integer.valueOf(servicesCategoryDto.getId()), servicesServiceDto.j(), servicesServiceDto.i(), 0, null, servicesServiceDto.f(), servicesServiceDto.d() == 1, servicesServiceDto.getDuration(), Integer.valueOf(servicesServiceDto.k()), i3));
                i3 = i4;
            }
            arrayList.add(new Pair(ow7Var, arrayList2));
            i2 = i3;
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add((ow7) ((Pair) it.next()).i());
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            g5g.y((Iterable) ((Pair) it2.next()).j(), arrayList4);
        }
        return new vw7(arrayList4, arrayList3);
    }
}
