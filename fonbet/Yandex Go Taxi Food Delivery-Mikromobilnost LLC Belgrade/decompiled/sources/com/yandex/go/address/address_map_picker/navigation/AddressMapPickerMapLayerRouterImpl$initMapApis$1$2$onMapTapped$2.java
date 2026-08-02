package com.yandex.go.address.address_map_picker.navigation;

import defpackage.jz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pq1;
import defpackage.tse;
import defpackage.uqb0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerMapLayerRouterImpl$initMapApis$1$2$onMapTapped$2", f = "AddressMapPickerMapLayerRouterImpl.kt", l = {186}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapLayerRouterImpl$initMapApis$1$2$onMapTapped$2 extends SuspendLambda implements wls {
    final /* synthetic */ pq1 $alert;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapLayerRouterImpl$initMapApis$1$2$onMapTapped$2(f fVar, pq1 pq1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$alert = pq1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerMapLayerRouterImpl$initMapApis$1$2$onMapTapped$2(this.this$0, this.$alert, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerMapLayerRouterImpl$initMapApis$1$2$onMapTapped$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.address.address_map_picker.domain.c cVar = this.this$0.H;
            pq1 pq1Var = this.$alert;
            String str = pq1Var.b;
            if (str == null) {
                str = "";
            }
            String str2 = pq1Var.c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = pq1Var.d;
            jz0 jz0Var = new jz0(new uqb0(str, str2, str3 != null ? str3 : ""));
            this.label = 1;
            if (cVar.e(jz0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
