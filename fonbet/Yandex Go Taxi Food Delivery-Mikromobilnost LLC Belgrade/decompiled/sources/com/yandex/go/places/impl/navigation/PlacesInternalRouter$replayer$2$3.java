package com.yandex.go.places.impl.navigation;

import defpackage.bms;
import defpackage.e350;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.yl80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl80;", "payload", "", "keepSearchInStack", "Lkotlin/Function0;", "Lzy11;", "doOnGoBack", "<anonymous>", "(Lyl80;ZLsls;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.PlacesInternalRouter$replayer$2$3", f = "PlacesInternalRouter.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesInternalRouter$replayer$2$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesInternalRouter$replayer$2$3(d dVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PlacesInternalRouter$replayer$2$3 placesInternalRouter$replayer$2$3 = new PlacesInternalRouter$replayer$2$3(this.this$0, (Continuation) obj4);
        placesInternalRouter$replayer$2$3.L$0 = (yl80) obj;
        placesInternalRouter$replayer$2$3.Z$0 = booleanValue;
        placesInternalRouter$replayer$2$3.L$1 = (sls) obj3;
        return placesInternalRouter$replayer$2$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yl80 yl80Var = (yl80) this.L$0;
        boolean z = this.Z$0;
        sls slsVar = (sls) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            e350 e350Var = new e350(8, slsVar);
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = z;
            this.label = 1;
            if (dVar.f0(yl80Var, z, e350Var, this) == coroutineSingletons) {
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
