package androidx.compose.material3;

import defpackage.iip0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.snr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class o implements snr {
    public final /* synthetic */ androidx.compose.foundation.gestures.snapping.a a;
    public final /* synthetic */ w b;
    public final /* synthetic */ sls c;

    public o(androidx.compose.foundation.gestures.snapping.a aVar, w wVar, sls slsVar) {
        this.a = aVar;
        this.b = wVar;
        this.c = slsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.snr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(iip0 iip0Var, float f, Continuation continuation) {
        ModalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1 modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1;
        int i;
        sls slsVar;
        androidx.compose.foundation.gestures.e eVar = this.b.e;
        try {
            if (continuation instanceof ModalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1) {
                modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1 = (ModalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1) continuation;
                int i2 = modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1.label;
                    slsVar = this.c;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        androidx.compose.foundation.gestures.snapping.a aVar = this.a;
                        modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1.label = 1;
                        obj = aVar.a(iip0Var, f, modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return new Float(((Number) obj).floatValue());
                }
            }
            if (i != 0) {
            }
            return new Float(((Number) obj).floatValue());
        } finally {
            if (eVar.g.getValue() == SheetValue.Hidden) {
                slsVar.invoke();
            }
        }
        modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1 = new ModalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1.label;
        slsVar = this.c;
    }
}
