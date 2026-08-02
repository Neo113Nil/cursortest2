package com.yandex.go.design.compose.modal.bottomsheet;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.wg6;
import defpackage.wu60;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lwu60;", "it", "Lzy11;", "<anonymous>", "(Ltse;Lwu60;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.ModalBottomSheetKt$ModalBottomSheet$6$6$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ModalBottomSheetKt$ModalBottomSheet$6$6$1 extends SuspendLambda implements zls {
    final /* synthetic */ wg6 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$6$6$1(wg6 wg6Var, Continuation continuation) {
        super(3, continuation);
        this.$state = wg6Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((wu60) obj2).a;
        ModalBottomSheetKt$ModalBottomSheet$6$6$1 modalBottomSheetKt$ModalBottomSheet$6$6$1 = new ModalBottomSheetKt$ModalBottomSheet$6$6$1(this.$state, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        modalBottomSheetKt$ModalBottomSheet$6$6$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        wg6 wg6Var = this.$state;
        wg6Var.i.setValue(Boolean.TRUE);
        pzt0 pzt0Var = wg6Var.r;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        wg6Var.r = null;
        return zy11.a;
    }
}
