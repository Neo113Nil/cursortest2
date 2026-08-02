package com.yandex.go.address.address_map_picker.navigation;

import defpackage.c11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerModalViewRouter$InnerNavigator$onPorchNumberClicked$1$onEntranceNumberDone$1", f = "AddressMapPickerModalViewRouter.kt", l = {HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerModalViewRouter$InnerNavigator$onPorchNumberClicked$1$onEntranceNumberDone$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $entrance;
    int label;
    final /* synthetic */ c11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerModalViewRouter$InnerNavigator$onPorchNumberClicked$1$onEntranceNumberDone$1(c11 c11Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c11Var;
        this.$entrance = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerModalViewRouter$InnerNavigator$onPorchNumberClicked$1$onEntranceNumberDone$1(this.this$0, this.$entrance, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerModalViewRouter$InnerNavigator$onPorchNumberClicked$1$onEntranceNumberDone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.address.address_map_picker.domain.h hVar = this.this$0.K;
            String str = this.$entrance;
            this.label = 1;
            if (hVar.a(str, this) == coroutineSingletons) {
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
