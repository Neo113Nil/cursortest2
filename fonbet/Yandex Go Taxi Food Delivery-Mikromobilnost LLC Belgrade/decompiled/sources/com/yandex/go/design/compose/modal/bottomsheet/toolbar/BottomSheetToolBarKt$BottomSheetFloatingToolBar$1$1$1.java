package com.yandex.go.design.compose.modal.bottomsheet.toolbar;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.toolbar.BottomSheetToolBarKt$BottomSheetFloatingToolBar$1$1$1", f = "BottomSheetToolBar.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BottomSheetToolBarKt$BottomSheetFloatingToolBar$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $hideAnimatable;
    final /* synthetic */ boolean $newHiddenState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetToolBarKt$BottomSheetFloatingToolBar$1$1$1(androidx.compose.animation.core.a aVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$hideAnimatable = aVar;
        this.$newHiddenState = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomSheetToolBarKt$BottomSheetFloatingToolBar$1$1$1(this.$hideAnimatable, continuation, this.$newHiddenState);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetToolBarKt$BottomSheetFloatingToolBar$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            androidx.compose.animation.core.a aVar = this.$hideAnimatable;
            Float f = new Float(this.$newHiddenState ? 1.0f : 0.0f);
            this.label = 1;
            if (androidx.compose.animation.core.a.d(aVar, f, null, null, null, this, 14) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
