package com.yandex.go.design.compose.modal.bottomsheet;

import androidx.compose.runtime.f;
import defpackage.gp5;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.yg6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.BottomSheetStateExtensionsKt$rememberBottomSheetState$2$1", f = "BottomSheetStateExtensions.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BottomSheetStateExtensionsKt$rememberBottomSheetState$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onCollapsed;
    final /* synthetic */ wg6 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetStateExtensionsKt$rememberBottomSheetState$2$1(wg6 wg6Var, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$state = wg6Var;
        this.$onCollapsed = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomSheetStateExtensionsKt$rememberBottomSheetState$2$1(this.$state, this.$onCollapsed, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetStateExtensionsKt$rememberBottomSheetState$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(new mth(f.o(new gp5(this.$state, 4)), 6));
            yg6 yg6Var = new yg6(0, this.$onCollapsed);
            this.label = 1;
            if (t.collect(yg6Var, this) == coroutineSingletons) {
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
