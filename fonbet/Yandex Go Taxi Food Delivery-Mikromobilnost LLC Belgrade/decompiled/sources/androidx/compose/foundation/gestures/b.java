package androidx.compose.foundation.gestures;

import defpackage.l8x;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes10.dex */
public final class b implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ wls c;

    public b(Ref$ObjectRef ref$ObjectRef, tse tseVar, wls wlsVar) {
        this.a = ref$ObjectRef;
        this.b = tseVar;
        this.c = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, pzt0] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
        int i;
        if (continuation instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
            anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) continuation;
            int i2 = anchoredDraggableKt$restartable$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredDraggableKt$restartable$2$1$emit$1.label;
                Ref$ObjectRef ref$ObjectRef = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l8x l8xVar = (l8x) ref$ObjectRef.element;
                    if (l8xVar != null) {
                        l8xVar.a(new AnchoredDragFinishedSignal());
                        anchoredDraggableKt$restartable$2$1$emit$1.L$0 = obj;
                        anchoredDraggableKt$restartable$2$1$emit$1.L$1 = l8xVar;
                        anchoredDraggableKt$restartable$2$1$emit$1.label = 1;
                        if (l8xVar.u0(anchoredDraggableKt$restartable$2$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = anchoredDraggableKt$restartable$2$1$emit$1.L$0;
                    kotlin.b.b(obj2);
                }
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                wls wlsVar = this.c;
                tse tseVar = this.b;
                ref$ObjectRef.element = tje.N(tseVar, null, coroutineStart, new AnchoredDraggableKt$restartable$2$1$2(wlsVar, obj, tseVar, null), 1);
                return zy11.a;
            }
        }
        anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
        Object obj22 = anchoredDraggableKt$restartable$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableKt$restartable$2$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef2 = this.a;
        if (i != 0) {
        }
        CoroutineStart coroutineStart2 = CoroutineStart.UNDISPATCHED;
        wls wlsVar2 = this.c;
        tse tseVar2 = this.b;
        ref$ObjectRef2.element = tje.N(tseVar2, null, coroutineStart2, new AnchoredDraggableKt$restartable$2$1$2(wlsVar2, obj, tseVar2, null), 1);
        return zy11.a;
    }
}
