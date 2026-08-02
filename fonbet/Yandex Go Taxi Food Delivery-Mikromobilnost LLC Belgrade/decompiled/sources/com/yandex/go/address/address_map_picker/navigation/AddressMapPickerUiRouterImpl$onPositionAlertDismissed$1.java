package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oce0;
import defpackage.tse;
import defpackage.vy0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerUiRouterImpl$onPositionAlertDismissed$1", f = "AddressMapPickerUiRouterImpl.kt", l = {207, 211}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerUiRouterImpl$onPositionAlertDismissed$1 extends SuspendLambda implements wls {
    final /* synthetic */ oce0 $param;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerUiRouterImpl$onPositionAlertDismissed$1(oce0 oce0Var, j jVar, Continuation continuation) {
        super(2, continuation);
        this.$param = oce0Var;
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerUiRouterImpl$onPositionAlertDismissed$1(this.$param, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerUiRouterImpl$onPositionAlertDismissed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r5.e(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r5.e(defpackage.uy0.a, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean a = this.$param.a();
            j jVar = this.this$0;
            if (a) {
                AddressMapPickerAddressStateRepository.a(jVar.F, this.$param.f.B());
                com.yandex.go.address.address_map_picker.domain.c cVar = this.this$0.E;
                vy0 vy0Var = new vy0(this.$param.f);
                this.label = 1;
            } else {
                com.yandex.go.address.address_map_picker.domain.c cVar2 = jVar.E;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
