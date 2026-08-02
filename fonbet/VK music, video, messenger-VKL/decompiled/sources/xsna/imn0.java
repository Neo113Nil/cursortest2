package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SwipeToRemoveTrackContainer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.SwipeToRemoveTrackContainerKt$SwipeToRemoveTrackContainer$1$1", f = "SwipeToRemoveTrackContainer.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class imn0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ f12<rgo> $draggableState;
    final /* synthetic */ boolean $isNeedToSnaping;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imn0(boolean z, f12<rgo> f12Var, spj<? super imn0> spjVar) {
        super(2, spjVar);
        this.$isNeedToSnaping = z;
        this.$draggableState = f12Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new imn0(this.$isNeedToSnaping, this.$draggableState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((imn0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$isNeedToSnaping) {
                f12<rgo> f12Var = this.$draggableState;
                rgo rgoVar = rgo.End;
                this.label = 1;
                Object a = f12Var.a(rgoVar, MutatePriority.Default, new c02(4, null), this);
                if (a != obj2) {
                    a = s3q0.a;
                }
                if (a == obj2) {
                    return obj2;
                }
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
