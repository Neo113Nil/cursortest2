package com.yandex.go.address.address_map_picker.navigation;

import defpackage.a11;
import defpackage.c11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v21;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerModalViewRouter$content$1$1$1", f = "AddressMapPickerModalViewRouter.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerModalViewRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ v21 $action;
    final /* synthetic */ a11 $navigator;
    int label;
    final /* synthetic */ c11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerModalViewRouter$content$1$1$1(c11 c11Var, v21 v21Var, a11 a11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c11Var;
        this.$action = v21Var;
        this.$navigator = a11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerModalViewRouter$content$1$1$1(this.this$0, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerModalViewRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.address.address_map_picker.ui.actions.a aVar = this.this$0.I;
            v21 v21Var = this.$action;
            a11 a11Var = this.$navigator;
            this.label = 1;
            if (aVar.a(v21Var, a11Var, this) == coroutineSingletons) {
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
