package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ey91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.yly0;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {HProv.ALG_SID_SHA3_224, 81}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ yly0 $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(yly0 yly0Var, Continuation continuation) {
        super(2, continuation);
        this.$observer = yly0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, continuation);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:6:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        androidx.compose.ui.input.pointer.f fVar2;
        zvd0 zvd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            this.L$0 = fVar;
            this.label = 1;
            obj = z.b(fVar, null, this, 2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zvd0Var = (zvd0) this.L$1;
                fVar2 = (androidx.compose.ui.input.pointer.f) this.L$0;
                kotlin.b.b(obj);
                List list = ((tvd0) obj).a;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zvd0 zvd0Var2 = (zvd0) list.get(i2);
                    if (ey91.e(zvd0Var2.a, zvd0Var.a) && zvd0Var2.d) {
                        this.L$0 = fVar2;
                        this.L$1 = zvd0Var;
                        this.label = 2;
                        obj = fVar2.a(PointerEventPass.Main, this);
                    }
                }
                this.$observer.d();
                return zy11.a;
            }
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
        }
        zvd0 zvd0Var3 = (zvd0) obj;
        yly0 yly0Var = this.$observer;
        long j = zvd0Var3.c;
        yly0Var.a();
        fVar2 = fVar;
        zvd0Var = zvd0Var3;
        this.L$0 = fVar2;
        this.L$1 = zvd0Var;
        this.label = 2;
        obj = fVar2.a(PointerEventPass.Main, this);
    }
}
