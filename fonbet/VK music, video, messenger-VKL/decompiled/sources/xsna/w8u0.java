package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkAppBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.VkAppBottomPlayerKt$VkAppBottomPlayer$1$1", f = "VkAppBottomPlayer.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class w8u0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isInformerVisible;
    final /* synthetic */ wh50<Boolean> $showDivider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8u0(spj spjVar, wh50 wh50Var, boolean z) {
        super(2, spjVar);
        this.$isInformerVisible = z;
        this.$showDivider$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new w8u0(spjVar, this.$showDivider$delegate, this.$isInformerVisible);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((w8u0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$isInformerVisible) {
                this.$showDivider$delegate.setValue(Boolean.TRUE);
                return s3q0.a;
            }
            this.label = 1;
            if (qsl.b(700L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$showDivider$delegate.setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
