package com.yandex.go.multimodal_route.store;

import com.yandex.go.multimodal_route.experiement.c;
import com.yandex.go.multimodal_route.network.MultimodalRoutesApi;
import com.yandex.go.multimodal_route.network.models.OrdersRequestDto;
import com.yandex.go.multimodal_route.network.models.OrdersResponseDto;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.store.MultimodalHasOrdersRepositoryImpl$checkIfIdsInMultimodalStore$2", f = "MultimodalHasOrdersRepositoryImpl.kt", l = {46, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MultimodalHasOrdersRepositoryImpl$checkIfIdsInMultimodalStore$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $orderIds;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalHasOrdersRepositoryImpl$checkIfIdsInMultimodalStore$2(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$orderIds = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalHasOrdersRepositoryImpl$checkIfIdsInMultimodalStore$2(this.$orderIds, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalHasOrdersRepositoryImpl$checkIfIdsInMultimodalStore$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r8 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r8 == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                b.b(obj);
                if (!this.$orderIds.isEmpty() && this.this$0.a.d().isEmpty()) {
                    c cVar = this.this$0.b;
                    this.label = 1;
                    obj = cVar.a.f(this);
                }
                return zy11Var;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                List a = ((OrdersResponseDto) ((fmt) obj).a).getA();
                if (!a.isEmpty()) {
                    this.this$0.a.g(a);
                    return zy11Var;
                }
                return zy11Var;
            }
            b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                List<String> list = this.$orderIds;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (String str : list) {
                    arrayList.add(evu0.f0('_', str, str));
                }
                cmt<OrdersResponseDto> b = ((MultimodalRoutesApi) this.this$0.e.getValue()).b(new OrdersRequestDto(arrayList));
                this.L$0 = null;
                this.label = 2;
                obj = b.a(this);
            }
            return zy11Var;
        } catch (Exception e) {
            jst.e.d("MultimodalHasOrdersRepositoryImpl", "error " + e + " while mobility-multimodal/v1/offers call");
            return zy11Var;
        }
    }
}
