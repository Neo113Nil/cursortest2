package xsna;

import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BigPlayerScaffold.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffoldKt$BottomSheet$2$1$2$1", f = "BigPlayerScaffold.kt", l = {444}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c17 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ g07 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c17(g07 g07Var, spj<? super c17> spjVar) {
        super(2, spjVar);
        this.$state = g07Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c17(this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c17) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            g07 g07Var = this.$state;
            this.label = 1;
            Object f = lz1.f(g07Var.c, BigPlayerBottomSheetValue.Collapsed, this);
            if (f != obj2) {
                f = s3q0.a;
            }
            if (f == obj2) {
                return obj2;
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
