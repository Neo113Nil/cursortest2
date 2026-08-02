package com.yandex.messaging.ui.main.telemessenger;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zcy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzcy0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.main.telemessenger.TeleMessengerNavBarViewModel$createProfileTabFlow$2", f = "TeleMessengerNavBarViewModel.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TeleMessengerNavBarViewModel$createProfileTabFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ zcy0 $defaultTab;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeleMessengerNavBarViewModel$createProfileTabFlow$2(zcy0 zcy0Var, Continuation continuation) {
        super(2, continuation);
        this.$defaultTab = zcy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TeleMessengerNavBarViewModel$createProfileTabFlow$2 teleMessengerNavBarViewModel$createProfileTabFlow$2 = new TeleMessengerNavBarViewModel$createProfileTabFlow$2(this.$defaultTab, continuation);
        teleMessengerNavBarViewModel$createProfileTabFlow$2.L$0 = obj;
        return teleMessengerNavBarViewModel$createProfileTabFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TeleMessengerNavBarViewModel$createProfileTabFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            zcy0 zcy0Var = this.$defaultTab;
            this.label = 1;
            if (vprVar.emit(zcy0Var, this) == coroutineSingletons) {
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
