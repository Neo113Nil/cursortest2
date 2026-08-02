package xsna;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FocusInteraction.kt */
@b6l(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {68}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class rvr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $isFocused;
    final /* synthetic */ wax $this_collectIsFocusedAsState;
    int label;

    /* compiled from: FocusInteraction.kt */
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
            boolean z = vaxVar instanceof pvr;
            ArrayList arrayList = this.b;
            if (z) {
                arrayList.add(vaxVar);
            } else if (vaxVar instanceof qvr) {
                arrayList.remove(((qvr) vaxVar).a);
            }
            this.c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvr(wax waxVar, wh50<Boolean> wh50Var, spj<? super rvr> spjVar) {
        super(2, spjVar);
        this.$this_collectIsFocusedAsState = waxVar;
        this.$isFocused = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rvr(this.$this_collectIsFocusedAsState, this.$isFocused, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rvr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ArrayList arrayList = new ArrayList();
            caj0 b = this.$this_collectIsFocusedAsState.b();
            a aVar = new a(arrayList, this.$isFocused);
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
