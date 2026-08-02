package com.yandex.smartcamera.arscene.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vs9;
import defpackage.wls;
import defpackage.xur;
import defpackage.z69;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.smartcamera.arscene.ui.HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$6$1", f = "HorizontalCenteringSwitcher.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$6$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ z69 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$6$1(androidx.compose.foundation.lazy.b bVar, z69 z69Var, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$state = z69Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$6$1(this.$listState, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$6$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tpr t = kotlinx.coroutines.flow.e.t(androidx.compose.runtime.f.o(new vs9(this.$listState, 4)));
        xur xurVar = new xur(3, this.$listState, this.$state);
        this.label = 1;
        Object collect = t.collect(new d(xurVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
