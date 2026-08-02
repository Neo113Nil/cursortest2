package xsna;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;

/* compiled from: PressInteraction.kt */
@b6l(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class p2d0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $isPressed;
    final /* synthetic */ wax $this_collectIsPressedAsState;
    int label;

    /* compiled from: PressInteraction.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ wh50<Boolean> c;

        public a(ArrayList arrayList, wh50 wh50Var) {
            this.b = arrayList;
            this.c = wh50Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            vax vaxVar = (vax) obj;
            boolean z = vaxVar instanceof o2d0.b;
            ArrayList arrayList = this.b;
            if (z) {
                arrayList.add(vaxVar);
            } else if (vaxVar instanceof o2d0.c) {
                arrayList.remove(((o2d0.c) vaxVar).a);
            } else if (vaxVar instanceof o2d0.a) {
                arrayList.remove(((o2d0.a) vaxVar).a);
            }
            this.c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2d0(wax waxVar, wh50<Boolean> wh50Var, spj<? super p2d0> spjVar) {
        super(2, spjVar);
        this.$this_collectIsPressedAsState = waxVar;
        this.$isPressed = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p2d0(this.$this_collectIsPressedAsState, this.$isPressed, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((p2d0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ArrayList arrayList = new ArrayList();
            caj0 b = this.$this_collectIsPressedAsState.b();
            a aVar = new a(arrayList, this.$isPressed);
            this.label = 1;
            b.getClass();
            if (caj0.k(b, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
